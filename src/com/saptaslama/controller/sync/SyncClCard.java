/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sync;

import com.saptaslama.controller.CompanyConstants;
import com.saptaslama.controller.DbConnection;
import com.saptaslama.controller.receiver.ClCardReceiver;
import com.saptaslama.model.ClCard;
import com.saptaslama.model.ClcollatrlRisk;
import com.saptaslama.model.ClrNums;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class SyncClCard {

    private ClCardReceiver clCard;

    private DbConnection dbLocal;

    private Connection connection;

    private String[] columnClCard, columnClrNums, columnClCollatRisk;

    private final String tableNameClCard = CompanyConstants.COMPANY + "CLCARD";
    private final String tableNameClrNums = CompanyConstants.COMPANY
            + CompanyConstants.SUBCOMPANY + "CLRNUMS";
    private final String tableNameClCollatRisk = CompanyConstants.COMPANY
            + CompanyConstants.SUBCOMPANY + "CLCOLLATRLRISK";

    private final String tableNameClCardSeq = tableNameClCard + "SEQ";
    private final String tableNameClrNumsSeq = tableNameClrNums + "SEQ";
    private final String tableNameClCollatRiskSeq = tableNameClCollatRisk + "SEQ";

    private final String fileNameClCard = "ClCard.json";
    private final String fileNameClrNums = "ClrNums.json";
    private final String fileNameClCollatRisk = "ClcollatRlRist.json";

    public SyncClCard(ClCardReceiver clCard) {
        this.clCard = clCard;

        dbLocal = new DbConnection();
    }

    public void init() {

        ResultSet resultSetClCard;
        ResultSet resultSetClrNums;
        ResultSet resultSetClCollatRisk;
        connection = dbLocal.getConnection();

        resultSetClCard = dbLocal.querySelectStatement(connection, tableNameClCard, "LOGICALREF != 1");
        resultSetClrNums = dbLocal.querySelectAll(connection, tableNameClrNums);
        resultSetClCollatRisk = dbLocal.querySelectAll(connection, tableNameClCollatRisk);

        System.out.println("\n*********" + tableNameClCard + " table column names***************");
        columnClCard = clCard.getColumnNames(resultSetClCard);

        System.out.println("\n*********" + tableNameClrNums + " table column names***************");
        columnClrNums = clCard.getColumnNames(resultSetClrNums);

        System.out.println("\n*********" + tableNameClCollatRisk + " table column names***************");
        columnClCollatRisk = clCard.getColumnNames(resultSetClCollatRisk);

        // here is the metod to sync
        syncClCard(clCard.getClCardArrayList(clCard.getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameClCard)), clCard.getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameClCard));

        syncClrNums(clCard.getClrNumsArrayList(clCard.getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameClrNums)), clCard.getClCardArrayList(clCard
                .getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameClCard)),
                clCard.getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameClrNums));

        syncClCollatRisk(clCard.getClcollatrlRiskArrayList(clCard.getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameClCollatRisk)), clCard.getClCardArrayList(clCard
                .getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameClCard)),
                clCard.getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameClCollatRisk));

        dbLocal.closeConnection(connection);
        dbLocal.closeResultSet(resultSetClCard);
        dbLocal.closeResultSet(resultSetClrNums);
        dbLocal.closeResultSet(resultSetClCollatRisk);
        dbLocal = null;
        clCard = null;
        columnClCard = null;
        columnClrNums = null;
        columnClCollatRisk = null;
    }

    // metod to sync and insert CLCARD table values
    public void syncClCard(ArrayList<ClCard> clCardFromCloud, JSONObject jsonClCard) {
        for (int i = 0; i < clCardFromCloud.size(); i++) {
            int clCardLogRef;
            if (Integer.valueOf(clCardFromCloud.get(i).getTaxNr()) > 111111111
                    && Integer.valueOf(clCardFromCloud.get(i).getTaxNr()) < 499999999) {
                System.err.println("UPDATE LOCAL CLCARD TABLE");
                clCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameClCard,
                        String.valueOf(499999999 - Integer.valueOf(clCardFromCloud
                                .get(i).getTaxNr())), "LOGICALREF", "LOGICALREF");
            } else {
                clCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameClCard,
                        String.valueOf(clCardFromCloud.get(i).getTaxNr()), "LOGICALREF", "TAXNR");
            }

            if (clCardLogRef != 0) {
                System.err.println("UPDATE CLCARD TABLE");
                System.err.println("DELETE logicalRef: " + clCardLogRef + "AND INSERT AGAIN!");

                dbLocal.deleteLogRef(connection, tableNameClCard, "LOGICALREF", clCardLogRef);
                boolean flag = false;
                try {
                    dbLocal.insertCards(connection, jsonClCard, tableNameClCard,
                            columnClCard, clCardLogRef, 0, 0, i);
                    flag = true;
                } catch (Exception e) {
                    System.err.println("clCard insert error: " + e.getMessage());
                }
                System.err.println("FLAG: " + flag);
                if (flag) {
                    // here we update items table to change LOWLEVELCODE! value
                    int lowLevelCode = dbLocal.getPrimaryKeyInt(connection, tableNameClCard,
                            String.valueOf(clCardLogRef - 1), "LOWLEVELCODES1", "LOGICALREF");
                    lowLevelCode = lowLevelCode + 1;
                    dbLocal.deleteLogRef(connection, tableNameClCard, "LOGICALREF", clCardLogRef);
                    dbLocal.insertCards(connection, jsonClCard, tableNameClCard,
                            columnClCard, clCardLogRef, 0, lowLevelCode, i);
                }
            } else {
                System.err.println("INSERT CLCARD TABLE");
                int newClCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameClCardSeq,
                        "1", "LASTLREF", "ID");

                newClCardLogRef = newClCardLogRef + 1;
                dbLocal.insertCards(connection, jsonClCard, tableNameClCard,
                        columnClCard, newClCardLogRef, 0, 0, i);
                //  update CLCARDSEQ tables LASTLREF value with new value
                if (dbLocal.getPrimaryKeyInt(connection, tableNameClCard,
                        String.valueOf(newClCardLogRef), "LOGICALREF", "LOGICALREF") == newClCardLogRef) {

                    if (dbLocal.getPrimaryKeyInt(connection, tableNameClCard,
                            String.valueOf(newClCardLogRef), "LOGICALREF", "LOGICALREF") == newClCardLogRef) {

                        dbLocal.updateKey(connection, newClCardLogRef, tableNameClCardSeq);
                        // here we update items table to change LOWLEVELCODE! value
                        int lowLevelCode = dbLocal.getPrimaryKeyInt(connection, tableNameClCard,
                                String.valueOf(clCardLogRef - 1), "LOWLEVELCODES1", "LOGICALREF");
                        lowLevelCode = lowLevelCode + 1;
                        dbLocal.deleteLogRef(connection, tableNameClCard, "LOGICALREF", newClCardLogRef);
                        dbLocal.insertCards(connection, jsonClCard, tableNameClCard,
                                columnClCard, newClCardLogRef, 0, lowLevelCode, i);
                    }
                }
            }

        }
    }

    //metod to sync and insert CLRNUMS table values
    public void syncClrNums(ArrayList<ClrNums> clrNumsFromCloud,
            ArrayList<ClCard> clCardFromCloud, JSONObject jsonClrNums) {
        for (int a = 0; a < clCardFromCloud.size(); a++) {
            int clCardLogRef;
            if (Integer.valueOf(clCardFromCloud.get(a).getTaxNr()) > 111111111
                    && Integer.valueOf(clCardFromCloud.get(a).getTaxNr()) < 499999999) {
                System.err.println("UPDATE LOCAL CLCARD TABLE");
                clCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameClCard,
                        String.valueOf(499999999 - Integer.valueOf(clCardFromCloud
                                .get(a).getTaxNr())), "LOGICALREF", "LOGICALREF");
            } else {
                clCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameClCard,
                        String.valueOf(clCardFromCloud.get(a).getTaxNr()), "LOGICALREF", "TAXNR");
            }
            ArrayList<ClrNums> clrNumsLogRefs = dbLocal.getClrNumsLogRef(connection, tableNameClrNums,
                    "LOGICALREF", "CLCARDREF", clCardLogRef);
            System.err.println("DELETE clCardLogRef: " + clCardLogRef
                    + "AND INSERT AGAIN!");

            dbLocal.deleteLogRef(connection, tableNameClrNums, "CLCARDREF", clCardLogRef);
            int counter = 0;
            for (int i = 0; i < clrNumsFromCloud.size(); i++) {
                if (clCardFromCloud.get(a).getLogicalRef() == clrNumsFromCloud.get(i).getClCardRef()) {
                    if (clCardLogRef != 0) {
                        if (!clrNumsLogRefs.isEmpty() && counter < clrNumsLogRefs.size()) {
                            System.err.println("UPDATE CLRNUMS TABLE");
                            int clrNumsLogRef = clrNumsLogRefs.get(counter).getLogicalRef();

                            dbLocal.insertNums(connection, jsonClrNums, tableNameClrNums,
                                    columnClrNums, clrNumsLogRef, clCardLogRef, i);
                            counter++;
                        } else {
                            System.err.println("INSERT CLRNUMS TABLE");
                            int newClrNumsLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameClrNumsSeq,
                                    "1", "LASTLREF", "ID");

                            newClrNumsLogRef = newClrNumsLogRef + 1;
                            dbLocal.insertNums(connection, jsonClrNums, tableNameClrNums,
                                    columnClrNums, newClrNumsLogRef, clCardLogRef, i);
                            //  update CLRNUMSSEQ tables LASTLREF value with new value
                            if (dbLocal.getPrimaryKeyInt(connection, tableNameClrNums,
                                    String.valueOf(newClrNumsLogRef), "LOGICALREF", "LOGICALREF") == newClrNumsLogRef) {

                                dbLocal.updateKey(connection, newClrNumsLogRef, tableNameClrNumsSeq);
                            }
                        }
                    } else {
                        System.err.println("CLRNUMS ICIN UYGUN SLSMANLOGREF BULUNAMADY!");
                    }
                }
            }
        }
    }

    //method to sync and insert CLCOLLATRLRISK table values
    public void syncClCollatRisk(ArrayList<ClcollatrlRisk> clCollatRiskFromCloud,
            ArrayList<ClCard> clCardFromCloud, JSONObject jsonClCollatRisk) {
        for (int a = 0; a < clCardFromCloud.size(); a++) {
            int clCardLogRef;
            if (Integer.valueOf(clCardFromCloud.get(a).getTaxNr()) > 111111111
                    && Integer.valueOf(clCardFromCloud.get(a).getTaxNr()) < 499999999) {
                System.err.println("UPDATE LOCAL CLCARD TABLE");
                clCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameClCard,
                        String.valueOf(499999999 - Integer.valueOf(clCardFromCloud
                                .get(a).getTaxNr())), "LOGICALREF", "LOGICALREF");
            } else {
                clCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameClCard,
                        String.valueOf(clCardFromCloud.get(a).getTaxNr()), "LOGICALREF", "TAXNR");
            }
            ArrayList<ClcollatrlRisk> clRiskLogRefs = dbLocal.getClCollatRiskLogRef(connection,
                    tableNameClCollatRisk, "LOGICALREF", "CLCARDREF", clCardLogRef);
            System.err.println("DELETE clCardRef: " + clCardLogRef
                    + "AND INSERT AGAIN!");

            dbLocal.deleteLogRef(connection, tableNameClCollatRisk, "CLCARDREF", clCardLogRef);
            int counter = 0;
            for (int i = 0; i < clCollatRiskFromCloud.size(); i++) {
                if (clCardFromCloud.get(a).getLogicalRef() == clCollatRiskFromCloud.get(i).getClCardRef()) {
                    if (clCardLogRef != 0) {
                        if (!clRiskLogRefs.isEmpty() && counter < clRiskLogRefs.size()) {
                            System.err.println("UPDATE CLCOLLATRLRISK TABLE");
                            int clRiskLogRef = clRiskLogRefs.get(counter).getLogicalRef();

                            dbLocal.insertNums(connection, jsonClCollatRisk, tableNameClCollatRisk,
                                    columnClCollatRisk, clRiskLogRef, clCardLogRef, i);
                            counter++;
                        } else {
                            System.err.println("INSERT CLCOLLATRLRISK TABLE");
                            int newClRiskLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameClCollatRiskSeq,
                                    "1", "LASTLREF", "ID");

                            newClRiskLogRef = newClRiskLogRef + 1;
                            dbLocal.insertNums(connection, jsonClCollatRisk, tableNameClCollatRisk,
                                    columnClCollatRisk, newClRiskLogRef, clCardLogRef, i);
                            //  update CLCOLLATRLRISKSEQ tables LASTLREF value with new value
                            if (dbLocal.getPrimaryKeyInt(connection, tableNameClCollatRisk,
                                    String.valueOf(newClRiskLogRef), "LOGICALREF", "LOGICALREF") == newClRiskLogRef) {

                                dbLocal.updateKey(connection, newClRiskLogRef, tableNameClCollatRiskSeq);
                            }
                        }
                    } else {
                        System.err.println("CLCOLLATRLRISK ICIN UYGUN SLSMANLOGREF BULUNAMADY!");
                    }
                }
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sync;

import com.saptaslama.controller.CompanyConstants;
import com.saptaslama.controller.DbConnection;
import com.saptaslama.controller.receiver.SrvCardReceiver;
import com.saptaslama.model.SrvCard;
import com.saptaslama.model.SrvNums;
import com.saptaslama.model.SrvTot;
import com.saptaslama.model.SrvUnitA;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class SyncSrvCard {

    private SrvCardReceiver srvCard;

    private DbConnection dbLocal;

    private Connection connection;

    private String[] columnSrvCard, columnSrvNums, columnSrvUnitA, columnSrvTot;

    private final String tableNameSrvCard = CompanyConstants.COMPANY + "SRVCARD";
    private final String tableNameSrvNums = CompanyConstants.COMPANY
            + CompanyConstants.SUBCOMPANY + "SRVNUMS";
    private final String tableNameSrvUnitA = CompanyConstants.COMPANY + "SRVUNITA";
    private final String tableNameSrvTot = CompanyConstants.COMPANY
            + CompanyConstants.SUBCOMPANY + "SRVTOT";

    private final String tableNameSrvCardSeq = tableNameSrvCard + "SEQ";
    private final String tableNameSrvNumsSeq = tableNameSrvNums + "SEQ";
    private final String tableNameSrvUnitASeq = tableNameSrvUnitA + "SEQ";
    private final String tableNameSrvTotSeq = tableNameSrvTot + "SEQ";

    private final String fileNameSrvCard = "SrvCard.json";
    private final String fileNameSrvNums = "SrvNums.json";
    private final String fileNameSrvUnitA = "SrvUnitA.json";
    private final String fileNameSrvTot = "SrvTot.json";

    public SyncSrvCard(SrvCardReceiver srvCard) {
        this.srvCard = srvCard;

        dbLocal = new DbConnection();
    }

    public void init() {
        ResultSet resultSetSrvCard;
        ResultSet resultSetSrvNums;
        ResultSet resultSetSrvUnitA;
        ResultSet resultSetSrvTot;
        
        connection = dbLocal.getConnection();
        
        resultSetSrvCard = dbLocal.querySelectAll(connection, tableNameSrvCard);
        resultSetSrvNums = dbLocal.querySelectAll(connection, tableNameSrvNums);
        resultSetSrvUnitA = dbLocal.querySelectAll(connection, tableNameSrvUnitA);
        resultSetSrvTot = dbLocal.querySelectAll(connection, tableNameSrvTot);

        System.out.println("\n*********" + tableNameSrvCard + " table column names***************");
        columnSrvCard = srvCard.getColumnNames(resultSetSrvCard);

        System.out.println("\n*********" + tableNameSrvNums + " table column names***************");
        columnSrvNums = srvCard.getColumnNames(resultSetSrvNums);

        System.out.println("\n*********" + tableNameSrvUnitA + " table column names***************");
        columnSrvUnitA = srvCard.getColumnNames(resultSetSrvUnitA);

        System.out.println("\n*********" + tableNameSrvTot + " table column names***************");
        columnSrvTot = srvCard.getColumnNames(resultSetSrvTot);

        //sync metod call here
        syncSrvCard(srvCard.getSrvCardArrayList(srvCard.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameSrvCard)), srvCard.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameSrvCard));
        
        syncSrvNums(srvCard.getSrvNumsArrayList(srvCard.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameSrvNums)), srvCard.getSrvCardArrayList(srvCard
                        .getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameSrvCard)), 
                srvCard.getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameSrvNums));
        
        syncSrvUnitA(srvCard.getSrvUnitAArrayList(srvCard.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameSrvUnitA)), srvCard.getSrvCardArrayList(srvCard
                        .getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameSrvCard)), 
                srvCard.getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameSrvUnitA));
        
        syncSrvTot(srvCard.getSrvTotArrayList(srvCard.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameSrvTot)), srvCard.getSrvCardArrayList(srvCard
                        .getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameSrvCard)), 
                srvCard.getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameSrvTot));

        dbLocal.closeConnection(connection);
        dbLocal.closeResultSet(resultSetSrvCard);
        dbLocal.closeResultSet(resultSetSrvNums);
        dbLocal.closeResultSet(resultSetSrvUnitA);
        dbLocal.closeResultSet(resultSetSrvTot);
        dbLocal = null;
        srvCard = null;
        columnSrvCard = null;
        columnSrvNums = null;
        columnSrvUnitA = null;
        columnSrvTot = null;
    }

    //method to sync and insert SRVCARD
    public void syncSrvCard(ArrayList<SrvCard> srvCardFromCloud, JSONObject jObject) {
        for (int i = 0; i < srvCardFromCloud.size(); i++) {
            int srvCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameSrvCard,
                    String.valueOf(srvCardFromCloud.get(i).getSpecode()), "LOGICALREF", "SPECODE");

            int unitSetRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "UNITSETF",
                    String.valueOf(srvCardFromCloud.get(i).getUnitSetRef()), "LOGICALREF", "SPECODE");

            if (srvCardLogRef != 0) {
                System.err.println("UPDATE SRVCARD TABLE");
                System.err.println("DELETE logicalRef: " + srvCardLogRef + "AND INSERT AGAIN!");

                dbLocal.deleteLogRef(connection, tableNameSrvCard, "LOGICALREF", srvCardLogRef);
                dbLocal.insertCards(connection, jObject, tableNameSrvCard,
                        columnSrvCard, srvCardLogRef, unitSetRef, 0, i);
            } else {
                System.err.println("INSERT SRVCARD TABLE");
                int newSrvCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameSrvCardSeq,
                        "1", "LASTLREF", "ID");

                newSrvCardLogRef = newSrvCardLogRef + 1;
                dbLocal.insertCards(connection, jObject, tableNameSrvCard,
                        columnSrvCard, newSrvCardLogRef, unitSetRef, 0, i);
                //  update SRVCARDSEQ tables LASTLREF value with new value
                if (dbLocal.getPrimaryKeyInt(connection, tableNameSrvCard,
                        String.valueOf(newSrvCardLogRef), "LOGICALREF", "LOGICALREF") == newSrvCardLogRef) {

                    dbLocal.updateKey(connection, newSrvCardLogRef, tableNameSrvCardSeq);
                }
            }
        }
    }

    //metod to sync and insert SRVNUMS table values
    public void syncSrvNums(ArrayList<SrvNums> srvNumsFromCloud,
            ArrayList<SrvCard> srvCardFromCloud, JSONObject jObject) {
        for (int a = 0; a < srvCardFromCloud.size(); a++) {
            int srvCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameSrvCard,
                    String.valueOf(srvCardFromCloud.get(a).getSpecode()), "LOGICALREF", "SPECODE");
            ArrayList<SrvNums> srvNumsLogRefs = dbLocal.getSrvNumsLogRef(connection, tableNameSrvNums,
                    "LOGICALREF", "CARDREF", srvCardLogRef);
            System.err.println("DELETE cardRef: " + srvCardLogRef
                    + "AND INSERT AGAIN!");

            dbLocal.deleteLogRef(connection, tableNameSrvNums, "CARDREF", srvCardLogRef);
            int counter = 0;
            for (int i = 0; i < srvNumsFromCloud.size(); i++) {
                if (srvCardFromCloud.get(a).getLogicalRef() == srvNumsFromCloud.get(i).getCardRef()) {

                    if (srvCardLogRef != 0) {

                        if (!srvNumsLogRefs.isEmpty() && counter < srvNumsLogRefs.size()) {
                            System.err.println("UPDATE SRVNUMS TABLE");
                            int srvNumsLogRef = srvNumsLogRefs.get(counter).getLogicalRef();

                            dbLocal.insertSrvNums(connection, jObject, tableNameSrvNums,
                                    columnSrvNums, srvNumsLogRef, srvCardLogRef, i);
                            counter++;
                        } else {
                            System.err.println("INSERT SRVNUMS TABLE");
                            int newSrvNumsLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameSrvNumsSeq,
                                    "1", "LASTLREF", "ID");

                            newSrvNumsLogRef = newSrvNumsLogRef + 1;
                            dbLocal.insertSrvNums(connection, jObject, tableNameSrvNums,
                                    columnSrvNums, newSrvNumsLogRef, srvCardLogRef, i);
                            //  update SRVNUMSSEQ tables LASTLREF value with new value
                            if (dbLocal.getPrimaryKeyInt(connection, tableNameSrvNums,
                                    String.valueOf(newSrvNumsLogRef), "LOGICALREF", "LOGICALREF") == newSrvNumsLogRef) {

                                dbLocal.updateKey(connection, newSrvNumsLogRef, tableNameSrvNumsSeq);
                            }
                        }
                    } else {
                        System.err.println("SRVNUMS ICIN UYGUN SRVCARDLOGREF BULUNAMADY!!!");
                    }
                }
            }
        }
    }

    //metod to sync and insert SRVUNITA table values
    public void syncSrvUnitA(ArrayList<SrvUnitA> srvUnitAFromCloud,
            ArrayList<SrvCard> srvCardFromCloud, JSONObject jObject) {
        for (int a = 0; a < srvCardFromCloud.size(); a++) {
            int unitSetRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "UNITSETF",
                    String.valueOf(srvCardFromCloud.get(a).getUnitSetRef()), "LOGICALREF", "SPECODE");
            if (unitSetRef != 0) {
                int srvCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameSrvCard,
                        String.valueOf(srvCardFromCloud.get(a).getSpecode()), "LOGICALREF", "SPECODE");
                ArrayList<SrvUnitA> srvUnitALogRefs = dbLocal.getSrvUnitALogRef(connection,
                        tableNameSrvUnitA, "LOGICALREF", "SRVREF", srvCardLogRef);
                System.err.println("DELETE srvRef: " + srvCardLogRef
                        + "AND INSERT AGAIN!");

                dbLocal.deleteLogRef(connection, tableNameSrvUnitA, "SRVREF", srvCardLogRef);
                int counter = 0;
                for (int i = 0; i < srvUnitAFromCloud.size(); i++) {
                    if (srvCardFromCloud.get(a).getLogicalRef() == srvUnitAFromCloud.get(i).getSrvRef()) {

                        if (srvCardLogRef != 0) {
                            int unitLineRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY
                                    + "UNITSETL",
                                    String.valueOf(srvUnitAFromCloud.get(i).getUnitLineRef()),
                                    "LOGICALREF", "WIDTH");

                            if (!srvUnitALogRefs.isEmpty() && counter < srvUnitALogRefs.size()) {
                                System.err.println("UPDATE SRVUNITA TABLE");
                                int srvUnitALogRef = srvUnitALogRefs.get(counter).getLogicalRef();

                                dbLocal.insertSrvUnitA(connection, jObject, tableNameSrvUnitA,
                                        columnSrvUnitA, srvUnitALogRef, srvCardLogRef, unitLineRef, i);
                                counter++;
                            } else {
                                System.err.println("INSERT SRVUNITA TABLE");
                                int newSrvUnitALogRef = dbLocal.getPrimaryKeyInt(connection, tableNameSrvUnitASeq,
                                        "1", "LASTLREF", "ID");

                                newSrvUnitALogRef = newSrvUnitALogRef + 1;
                                dbLocal.insertSrvUnitA(connection, jObject, tableNameSrvUnitA,
                                        columnSrvUnitA, newSrvUnitALogRef, srvCardLogRef, unitLineRef, i);
                                //  update SRVUNITASEQ tables LASTLREF value with new value
                                if (dbLocal.getPrimaryKeyInt(connection, tableNameSrvUnitA,
                                        String.valueOf(newSrvUnitALogRef), "LOGICALREF", "LOGICALREF") == newSrvUnitALogRef) {

                                    dbLocal.updateKey(connection, newSrvUnitALogRef, tableNameSrvUnitASeq);
                                }
                            }
                        } else {
                            System.err.println("SRVUNITA ICIN UYGUN SRVCARDLOGREF BULUNAMADY!!!");
                        }
                    }
                }
            } else {
                System.err.println("THIS SERVICE DOSEN'T HAS UNIT!");
            }
        }
    }

    //metod to sync and insert SRVTOT table values
    public void syncSrvTot(ArrayList<SrvTot> srvTotFromCloud,
            ArrayList<SrvCard> srvCardFromCloud, JSONObject jObject) {
        for (int a = 0; a < srvCardFromCloud.size(); a++) {
            int srvCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameSrvCard,
                    String.valueOf(srvCardFromCloud.get(a).getSpecode()), "LOGICALREF", "SPECODE");
            ArrayList<SrvTot> srvTotLogRefs = dbLocal.getSrvTotLogRef(connection, tableNameSrvTot,
                    "LOGICALREF", "CARDREF", srvCardLogRef);
            System.err.println("DELETE cardRef: " + srvCardLogRef
                    + "AND INSERT AGAIN!");

            dbLocal.deleteLogRef(connection, tableNameSrvTot, "CARDREF", srvCardLogRef);
            int counter = 0;
            for (int i = 0; i < srvTotFromCloud.size(); i++) {
                if (srvCardFromCloud.get(a).getLogicalRef() == srvTotFromCloud.get(i).getCardRef()) {
                    if (srvCardLogRef != 0) {
                        if (!srvTotLogRefs.isEmpty() && counter < srvTotLogRefs.size()) {
                            System.err.println("UPDATE SRVTOT TABLE");
                            int srvTotLogRef = srvTotLogRefs.get(counter).getLogicalRef();

                            dbLocal.insertNums(connection, jObject, tableNameSrvTot,
                                    columnSrvTot, srvTotLogRef, srvCardLogRef, i);
                            counter++;
                        } else {
                            System.err.println("INSERT SRVTOT TABLE");
                            int newSrvTotLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameSrvTotSeq,
                                    "1", "LASTLREF", "ID");

                            newSrvTotLogRef = newSrvTotLogRef + 1;

                            dbLocal.insertNums(connection, jObject, tableNameSrvTot,
                                    columnSrvTot, newSrvTotLogRef, srvCardLogRef, i);
                            //  update SRVTOTSEQ tables LASTLREF value with new value
                            if (dbLocal.getPrimaryKeyInt(connection, tableNameSrvTot,
                                    String.valueOf(newSrvTotLogRef), "LOGICALREF", "LOGICALREF") == newSrvTotLogRef) {

                                dbLocal.updateKey(connection, newSrvTotLogRef, tableNameSrvTotSeq);
                            }
                        }
                    } else {
                        System.err.println("SRVTOT ICIN UYGUN SRVCARDLOGREF BULUNAMADY!!!");
                    }
                }
            }
        }
    }
}

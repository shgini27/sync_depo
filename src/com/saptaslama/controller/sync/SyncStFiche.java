/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sync;

import com.saptaslama.controller.CompanyConstants;
import com.saptaslama.controller.DbConnection;
import com.saptaslama.controller.receiver.ClCardReceiver;
import com.saptaslama.controller.receiver.StFicheReceiver;
import com.saptaslama.model.ClCard;
import com.saptaslama.model.StFiche;
import com.saptaslama.model.StLine;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class SyncStFiche {

    private StFicheReceiver stFiche;

    private DbConnection dbLocal;

    private Connection connection;

    private String[] columnFiche, columnFLine;

    private final String tableNameStFiche = CompanyConstants.COMPANY
            + CompanyConstants.SUBCOMPANY + "STFICHE";
    private final String tableNameStLine = CompanyConstants.COMPANY
            + CompanyConstants.SUBCOMPANY + "STLINE";

    private final String tableNameFicheSeq = tableNameStFiche + "SEQ";
    private final String tableNameFLineSeq = tableNameStLine + "SEQ";

    private final String fileNameFiche = "StFiche.json";
    private final String fileNameFLine = "StLine.json";

    public SyncStFiche(StFicheReceiver stFiche) {
        this.stFiche = stFiche;

        dbLocal = new DbConnection();
    }

    public void init() {
        ResultSet resultSetFiche;
        ResultSet resultSetFLine;

        connection = dbLocal.getConnection();

        resultSetFiche = dbLocal.querySelectAll(connection, tableNameStFiche);
        resultSetFLine = dbLocal.querySelectAll(connection, tableNameStLine);

        System.out.println("\n*********" + tableNameStFiche + " table column names***************");
        columnFiche = stFiche.getColumnNames(resultSetFiche);

        System.out.println("\n*********" + tableNameStLine + " table column names***************");
        columnFLine = stFiche.getColumnNames(resultSetFLine);

        //sync metod call here
        syncStFiche(stFiche.getStFicheArrayList(stFiche.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameFiche)), stFiche.getJsonObjectFromFile(CompanyConstants
                        .FILE_PATH_RECEIVE + fileNameFiche));

        syncStLine(stFiche.getStLineArrayList(stFiche.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameFLine)), stFiche.getJsonObjectFromFile(CompanyConstants
                        .FILE_PATH_RECEIVE + fileNameFLine));

        dbLocal.closeConnection(connection);
        dbLocal.closeResultSet(resultSetFiche);
        dbLocal.closeResultSet(resultSetFLine);
        dbLocal = null;
        stFiche = null;
        columnFiche = null;
        columnFLine = null;
    }

    //method to sync and insert STFITCHE
    public void syncStFiche(ArrayList<StFiche> ficheFromCloud, JSONObject jObject) {
        for (int i = 0; i < ficheFromCloud.size(); i++) {
            int ficheLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameStFiche,
                    String.valueOf(ficheFromCloud.get(i).getDocTrackingGnr()), "LOGICALREF", "DOCTRACKINGNR");

            int invoiceRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY
                    + CompanyConstants.SUBCOMPANY + "INVOICE", String.valueOf(ficheFromCloud.get(i).getInvoiceRef()),
                    "LOGICALREF", "TRACKNR");
            int clientRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "CLCARD",
                    String.valueOf(ficheFromCloud.get(i).getClientRef()),
                    "LOGICALREF", "TAXNR");
            if (clientRef == 0 && ficheFromCloud.get(i).getClientRef() != 0) {
                ClCardReceiver clCard = new ClCardReceiver();
                ArrayList<ClCard> clCardList = clCard.getClCardArrayList(clCard
                        .getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + "ClCard.json"));
                for (int a = 0; a < clCardList.size(); a++) {
                    if (clCardList.get(a).getLogicalRef() == ficheFromCloud.get(i).getClientRef()) {
                        clientRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "CLCARD",
                                String.valueOf(clCardList.get(a).getTaxNr()),
                                "LOGICALREF", "TAXNR");
                        break;
                    }
                }
            }
            int recieverRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "CLCARD",
                    String.valueOf(ficheFromCloud.get(i).getRecvRef()),
                    "LOGICALREF", "TAXNR");
            if (recieverRef == 0 && ficheFromCloud.get(i).getRecvRef() != 0) {
                ClCardReceiver clCard = new ClCardReceiver();
                ArrayList<ClCard> clCardList = clCard.getClCardArrayList(clCard
                        .getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + "ClCard.json"));
                for (int a = 0; a < clCardList.size(); a++) {
                    if (clCardList.get(a).getLogicalRef() == ficheFromCloud.get(i).getRecvRef()) {
                        recieverRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "CLCARD",
                                String.valueOf(clCardList.get(a).getTaxNr()),
                                "LOGICALREF", "TAXNR");
                        break;
                    }
                }
            }
            int salesManRef = dbLocal.getPrimaryKeyInt(connection, "LG_SLSMAN",
                    String.valueOf(ficheFromCloud.get(i).getSalesManRef()),
                    "LOGICALREF", "SPECODE");

            if (ficheLogRef != 0) {
                System.err.println("UPDATE STFICHE TABLE");

                dbLocal.updateStFiche(connection, jObject, tableNameStFiche,
                        columnFiche, ficheLogRef, invoiceRef, clientRef, recieverRef, salesManRef, i);
            } else {
                System.err.println("INSERT STFICHE TABLE");
                int newFicheLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameFicheSeq,
                        "1", "LASTLREF", "ID");

                newFicheLogRef = newFicheLogRef + 1;
                dbLocal.insertFiche(connection, jObject, tableNameStFiche,
                        columnFiche, newFicheLogRef, invoiceRef, clientRef, recieverRef, salesManRef, i);
                //  update STFICHESEQ tables LASTLREF value with new value
                if (dbLocal.getPrimaryKeyInt(connection, tableNameStFiche,
                        String.valueOf(newFicheLogRef), "LOGICALREF", "LOGICALREF") == newFicheLogRef) {

                    dbLocal.updateKey(connection, newFicheLogRef, tableNameFicheSeq);
                }
            }
        }
    }

    //method to sync and insert STFICHELINE
    public void syncStLine(ArrayList<StLine> stLineFromCloud, JSONObject jObject) {
        for (int i = 0; i < stLineFromCloud.size(); i++) {
            int stLineLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameStLine,
                    String.valueOf(stLineFromCloud.get(i).getOutputIdCode()), "LOGICALREF", "OUTPUTIDCODE");
            int ficheLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameStFiche,
                    String.valueOf(stLineFromCloud.get(i).getStFicheRef()),
                    "LOGICALREF", "DOCTRACKINGNR");
            int itemsLogRef;
            if (stLineFromCloud.get(i).getLineType() == 4) {
                itemsLogRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "SRVCARD",
                        String.valueOf(stLineFromCloud.get(i).getStockRef()),
                        "LOGICALREF", "SPECODE");
            } else {
                itemsLogRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "ITEMS",
                        String.valueOf(stLineFromCloud.get(i).getStockRef()),
                        "LOGICALREF", "ISONR");
            }

            int uomRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "UNITSETL",
                    String.valueOf(stLineFromCloud.get(i).getUomRef()),
                    "LOGICALREF", "WIDTH");
            int usRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "UNITSETF",
                    String.valueOf(stLineFromCloud.get(i).getUsRef()),
                    "LOGICALREF", "SPECODE");

            int invoiceRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY
                    + CompanyConstants.SUBCOMPANY + "INVOICE",
                    String.valueOf(stLineFromCloud.get(i).getInvoiceRef()),
                    "LOGICALREF", "TRACKNR");
            int clientRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "CLCARD",
                    String.valueOf(stLineFromCloud.get(i).getClientRef()),
                    "LOGICALREF", "TAXNR");
            if (clientRef == 0 && stLineFromCloud.get(i).getClientRef() != 0) {
                ClCardReceiver clCard = new ClCardReceiver();
                ArrayList<ClCard> clCardList = clCard.getClCardArrayList(clCard
                        .getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + "ClCard.json"));
                for (int a = 0; a < clCardList.size(); a++) {
                    if (clCardList.get(a).getLogicalRef() == stLineFromCloud.get(i).getClientRef()) {
                        clientRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "CLCARD",
                                String.valueOf(clCardList.get(a).getTaxNr()),
                                "LOGICALREF", "TAXNR");
                        break;
                    }
                }
            }
            int salesManRef = dbLocal.getPrimaryKeyInt(connection, "LG_SLSMAN",
                    String.valueOf(stLineFromCloud.get(i).getSalesManRef()),
                    "LOGICALREF", "SPECODE");

            if (stLineLogRef != 0) {
                System.err.println("UPDATE STLINE TABLE");

                dbLocal.updateStLine(connection, jObject, tableNameStLine,
                        columnFLine, stLineLogRef, ficheLogRef, itemsLogRef, uomRef, usRef,
                        invoiceRef, clientRef, salesManRef, i);
            } else {
                System.err.println("INSERT STLINE TABLE");
                int newStLineLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameFLineSeq,
                        "1", "LASTLREF", "ID");

                newStLineLogRef = newStLineLogRef + 1;
                dbLocal.insertStLine(connection, jObject, tableNameStLine,
                        columnFLine, newStLineLogRef, ficheLogRef, itemsLogRef, uomRef, usRef,
                        invoiceRef, clientRef, salesManRef, i);
                //  update STLINESEQ tables LASTLREF value with new value
                if (dbLocal.getPrimaryKeyInt(connection, tableNameStLine,
                        String.valueOf(newStLineLogRef), "LOGICALREF", "LOGICALREF") == newStLineLogRef) {

                    dbLocal.updateKey(connection, newStLineLogRef, tableNameFLineSeq);
                }
            }
        }
    }
}

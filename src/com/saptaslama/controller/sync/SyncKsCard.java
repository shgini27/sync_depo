/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sync;

import com.saptaslama.controller.CompanyConstants;
import com.saptaslama.controller.DbConnection;
import com.saptaslama.controller.receiver.KsCardReceiver;
import com.saptaslama.model.CrdacRef;
import com.saptaslama.model.EmCenter;
import com.saptaslama.model.KsCard;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class SyncKsCard {

    private KsCardReceiver ksCard;

    private DbConnection dbLocal;

    private Connection connection;

    private String[] columnKsCard, columnEmCenter, columnCrdacRef;

    private final String tableNameKsCard = CompanyConstants.COMPANY + "KSCARD";
    private final String tableNameEmCenter = CompanyConstants.COMPANY + "EMCENTER";
    private final String tableNameCrdacRef = CompanyConstants.COMPANY + "CRDACREF";

    private final String tableNameKsCardSeq = tableNameKsCard + "SEQ";
    private final String tableNameEmCenterSeq = tableNameEmCenter + "SEQ";
    private final String tableNameCrdacRefSeq = tableNameCrdacRef + "SEQ";

    private final String fileNameKsCard = "KsCard.json";
    private final String fileNameEmCenter = "EmCenter.json";
    private final String fileNameCrdacRef = "CrdacRef.json";

    public SyncKsCard(KsCardReceiver ksCard) {
        this.ksCard = ksCard;

        dbLocal = new DbConnection();
    }

    public void init() {
        ResultSet resultSetKsCard;
        ResultSet resultSetEmCenter;
        ResultSet resultSetCrdacRef;
        
        connection = dbLocal.getConnection();
        
        resultSetKsCard = dbLocal.querySelectAll(connection, tableNameKsCard);
        resultSetEmCenter = dbLocal.querySelectAll(connection, tableNameEmCenter);
        resultSetCrdacRef = dbLocal.querySelectAll(connection, tableNameCrdacRef);

        System.out.println("\n*********" + tableNameKsCard + " table column names***************");
        columnKsCard = ksCard.getColumnNames(resultSetKsCard);

        System.out.println("\n*********" + tableNameEmCenter + " table column names***************");
        columnEmCenter = ksCard.getColumnNames(resultSetEmCenter);

        System.out.println("\n*********" + tableNameCrdacRef + " table column names***************");
        columnCrdacRef = ksCard.getColumnNames(resultSetCrdacRef);

        // here is the metod to sync
        syncKsCard(ksCard.getKsCardArrayList(ksCard.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameKsCard)), ksCard.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameKsCard));
        
        syncEmCenter(ksCard.getEmCenterArrayList(ksCard.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameEmCenter)), ksCard.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameEmCenter));
        
        syncCrdacRef(ksCard.getCrdacRefArrayList(ksCard.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameCrdacRef)), ksCard.getKsCardArrayList(ksCard
                .getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameKsCard)), 
                ksCard.getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameCrdacRef));

        dbLocal.closeConnection(connection);
        dbLocal.closeResultSet(resultSetKsCard);
        dbLocal.closeResultSet(resultSetEmCenter);
        dbLocal.closeResultSet(resultSetCrdacRef);
        dbLocal = null;
        ksCard = null;
        columnKsCard = null;
        columnEmCenter = null;
        columnCrdacRef = null;
    }

    private void syncKsCard(ArrayList<KsCard> ksCardListCloud, JSONObject jObject) {
        for (int i = 0; i < ksCardListCloud.size(); i++) {
            int ksCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameKsCard,
                    String.valueOf(ksCardListCloud.get(i).getSpecode()), "LOGICALREF", "SPECODE");

            if (ksCardLogRef != 0) {
                System.err.println("UPDATE KSCARD TABLE");
                System.err.println("DELETE logicalRef: " + ksCardLogRef + "AND INSERT AGAIN!");

                dbLocal.deleteLogRef(connection, tableNameKsCard, "LOGICALREF", ksCardLogRef);
                dbLocal.insertCards(connection, jObject, tableNameKsCard,
                        columnKsCard, ksCardLogRef, 0, 0, i);
            } else {
                System.err.println("INSERT KSCARD TABLE");
                int newKsCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameKsCardSeq,
                        "1", "LASTLREF", "ID");

                newKsCardLogRef = newKsCardLogRef + 1;
                dbLocal.insertCards(connection, jObject, tableNameKsCard,
                        columnKsCard, newKsCardLogRef, 0, 0, i);
                //  update KSCARDSEQ tables LASTLREF value with new value
                if (dbLocal.getPrimaryKeyInt(connection, tableNameKsCard,
                        String.valueOf(newKsCardLogRef), "LOGICALREF", "LOGICALREF") == newKsCardLogRef) {

                    dbLocal.updateKey(connection, newKsCardLogRef, tableNameKsCardSeq);
                }
            }
        }
    }

    private void syncEmCenter(ArrayList<EmCenter> emCenterListCloud, JSONObject jObject) {
        for (int i = 0; i < emCenterListCloud.size(); i++) {
            int emCenterLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameEmCenter,
                    String.valueOf(emCenterListCloud.get(i).getSpecode()), "LOGICALREF", "SPECODE");

            if (emCenterLogRef != 0) {
                System.err.println("UPDATE EMCENTER TABLE");
                System.err.println("DELETE logicalRef: " + emCenterLogRef + "AND INSERT AGAIN!");

                dbLocal.deleteLogRef(connection, tableNameEmCenter, "LOGICALREF", emCenterLogRef);
                dbLocal.insertCards(connection, jObject, tableNameEmCenter,
                        columnEmCenter, emCenterLogRef, 0, 0, i);
            } else {
                System.err.println("INSERT BNCARD TABLE");
                int newEmCenterLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameEmCenterSeq,
                        "1", "LASTLREF", "ID");

                newEmCenterLogRef = newEmCenterLogRef + 1;
                dbLocal.insertCards(connection, jObject, tableNameEmCenter,
                        columnEmCenter, newEmCenterLogRef, 0, 0, i);
                //  update EMCENTERSEQ tables LASTLREF value with new value
                if (dbLocal.getPrimaryKeyInt(connection, tableNameEmCenter,
                        String.valueOf(newEmCenterLogRef), "LOGICALREF", "LOGICALREF") == newEmCenterLogRef) {

                    dbLocal.updateKey(connection, newEmCenterLogRef, tableNameEmCenterSeq);
                }
            }
        }
    }

    private void syncCrdacRef(ArrayList<CrdacRef> crdacRefListCloud,
            ArrayList<KsCard> ksCardListCloud, JSONObject jObject) {
        for (int a = 0; a < ksCardListCloud.size(); a++) {
            int ksCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameKsCard,
                    String.valueOf(ksCardListCloud.get(a).getSpecode()), "LOGICALREF", "SPECODE");
            ArrayList<CrdacRef> crdacLogRefs = dbLocal.getCrdacLogRef(connection, tableNameCrdacRef,
                    "LOGICALREF", "CARDREF", ksCardLogRef);
            System.err.println("DELETE cardRef: " + ksCardLogRef
                    + "AND INSERT AGAIN!");

            dbLocal.deleteLogRef(connection, tableNameCrdacRef, "CARDREF", ksCardLogRef);
            int counter = 0;
            for (int i = 0; i < crdacRefListCloud.size(); i++) {
                if (ksCardListCloud.get(a).getLogicalRef() == crdacRefListCloud.get(i).getCardRef()) {

                    if (ksCardLogRef != 0) {

                        if (!crdacLogRefs.isEmpty() && counter < crdacLogRefs.size()) {
                            System.err.println("UPDATE CRDACREF TABLE");

                            int crdacLogRef = crdacLogRefs.get(counter).getLogicalRef();

                            dbLocal.insertNums(connection, jObject, tableNameCrdacRef,
                                    columnCrdacRef, crdacLogRef, ksCardLogRef, i);
                            counter++;
                        } else {
                            System.err.println("INSERT CRDACREF TABLE");
                            int newCrdacLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameCrdacRefSeq,
                                    "1", "LASTLREF", "ID");

                            newCrdacLogRef = newCrdacLogRef + 1;
                            dbLocal.insertNums(connection, jObject, tableNameCrdacRef,
                                    columnCrdacRef, newCrdacLogRef, ksCardLogRef, i);
                            //  update CRDACREFSEQ tables LASTLREF value with new value
                            if (dbLocal.getPrimaryKeyInt(connection, tableNameCrdacRef,
                                    String.valueOf(newCrdacLogRef), "LOGICALREF", "LOGICALREF") == newCrdacLogRef) {

                                dbLocal.updateKey(connection, newCrdacLogRef, tableNameCrdacRefSeq);
                            }
                        }
                    } else {
                        System.err.println("CRDACREF ICIN UYGUN KSCARDLOGREF BULUNAMADY!");
                    }
                }
            }
        }
    }
}

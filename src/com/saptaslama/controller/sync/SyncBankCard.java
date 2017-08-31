/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sync;

import com.saptaslama.controller.CompanyConstants;
import com.saptaslama.controller.DbConnection;
import com.saptaslama.controller.receiver.BnCardReceiver;
import com.saptaslama.model.BankAcc;
import com.saptaslama.model.BnCard;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class SyncBankCard {
    private BnCardReceiver bnCard;
    
    private DbConnection dbLocal;

    private Connection connection;
    
    private String[] columnBnCard, columnBankAcc;
    
    private final String tableNameBnCard = CompanyConstants.COMPANY + "BNCARD";
    private final String tableNameBankAcc = CompanyConstants.COMPANY + "BANKACC";
    
    private final String tableNameBnCardSeq = tableNameBnCard + "SEQ";
    private final String tableNameBankAccSeq = tableNameBankAcc + "SEQ";
    
    private final String fileNameBnCard = "BnCard.json";
    private final String fileNameBankAcc = "BankAcc.json";

    public SyncBankCard(BnCardReceiver bnCard) {
        this.bnCard = bnCard;
        
        dbLocal = new DbConnection();
    }
    
    public void init() {
        ResultSet resultSetBnCard;
        ResultSet resultSetBankAcc;
        
        connection = dbLocal.getConnection();
        
        resultSetBnCard = dbLocal.querySelectAll(connection, tableNameBnCard);
        resultSetBankAcc = dbLocal.querySelectAll(connection, tableNameBankAcc);

        System.out.println("\n*********" + tableNameBnCard + " table column names***************");
        columnBnCard = bnCard.getColumnNames(resultSetBnCard);

        System.out.println("\n*********" + tableNameBankAcc + " table column names***************");
        columnBankAcc = bnCard.getColumnNames(resultSetBankAcc);

        // here is the metod to sync
        syncBnCard(bnCard.getBnCardArrayList(bnCard.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameBnCard)), bnCard.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameBnCard));
        syncBankAcc(bnCard.getBankAccArrayList(bnCard.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameBankAcc)), bnCard.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameBankAcc));

        dbLocal.closeConnection(connection);
        dbLocal.closeResultSet(resultSetBnCard);
        dbLocal.closeResultSet(resultSetBankAcc);
        dbLocal = null;
        bnCard = null;
        columnBnCard = null;
        columnBankAcc = null;
    }
    
    // metod to sync and insert BNCARD table values
    public void syncBnCard(ArrayList<BnCard> bnCardFromCloud, JSONObject jObject) {
        for (int i = 0; i < bnCardFromCloud.size(); i++) {
            int bnCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameBnCard,
                    String.valueOf(bnCardFromCloud.get(i).getSpecode()), "LOGICALREF", "SPECODE");

            if (bnCardLogRef != 0) {
                System.err.println("UPDATE BNCARD TABLE");
                System.err.println("DELETE logicalRef: " + bnCardLogRef + "AND INSERT AGAIN!");
                
                dbLocal.deleteLogRef(connection, tableNameBnCard, "LOGICALREF", bnCardLogRef);
                dbLocal.insertCards(connection, jObject, tableNameBnCard,
                        columnBnCard, bnCardLogRef, 0, 0, i);
            } else {
                System.err.println("INSERT BNCARD TABLE");
                int newBnCardLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameBnCardSeq,
                        "1", "LASTLREF", "ID");

                newBnCardLogRef = newBnCardLogRef + 1;
                dbLocal.insertCards(connection, jObject, tableNameBnCard,
                        columnBnCard, newBnCardLogRef, 0, 0, i);
                //  update BNCARDSEQ tables LASTLREF value with new value
                if(dbLocal.getPrimaryKeyInt(connection, tableNameBnCard,
                    String.valueOf(newBnCardLogRef), "LOGICALREF", "LOGICALREF") == newBnCardLogRef){
                    
                    dbLocal.updateKey(connection, newBnCardLogRef, tableNameBnCardSeq);
                }
            }
        }
    }
    
    // metod to sync and insert BANKACC table values
    public void syncBankAcc(ArrayList<BankAcc> bankAccFromCloud, JSONObject jObject) {
        for (int i = 0; i < bankAccFromCloud.size(); i++) {
            int bankAccLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameBankAcc,
                    String.valueOf(bankAccFromCloud.get(i).getSpecode()), "LOGICALREF", "SPECODE");
            int bnRef = dbLocal.getPrimaryKeyInt(connection, tableNameBnCard, 
                    String.valueOf(bankAccFromCloud.get(i).getBankRef()), 
                    "LOGICALREF", "SPECODE");

            if (bankAccLogRef != 0) {
                System.err.println("UPDATE BANKACC TABLE");
                System.err.println("DELETE logicalRef: " + bankAccLogRef + "AND INSERT AGAIN!");
                
                dbLocal.deleteLogRef(connection, tableNameBankAcc, "LOGICALREF", bankAccLogRef);
                dbLocal.insertCards(connection, jObject, tableNameBankAcc,
                        columnBankAcc, bankAccLogRef, bnRef, 0, i);
            } else {
                System.err.println("INSERT BANKACC TABLE");
                int newBankAccLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameBankAccSeq,
                        "1", "LASTLREF", "ID");

                newBankAccLogRef = newBankAccLogRef + 1;
                dbLocal.insertCards(connection, jObject, tableNameBankAcc,
                        columnBankAcc, newBankAccLogRef, bnRef, 0, i);
                //  update BANKACCSEQ tables LASTLREF value with new value
                if(dbLocal.getPrimaryKeyInt(connection, tableNameBnCard,
                    String.valueOf(newBankAccLogRef), "LOGICALREF", "LOGICALREF") == newBankAccLogRef){
                    
                    dbLocal.updateKey(connection, newBankAccLogRef, tableNameBankAccSeq);
                }
            }
        }
    }
}

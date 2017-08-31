/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sync;

import com.saptaslama.controller.CompanyConstants;
import com.saptaslama.controller.DbConnection;
import com.saptaslama.controller.receiver.SlsManReceiver;
import com.saptaslama.model.SlsMan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class SyncSlsMan {
    private SlsManReceiver slsMan;
    
    private DbConnection dbLocal;
    private Connection connection;
    private String[] columnSlsMan;
    private final String company = "LG_";
    private final String tableNameSlsMan = company + "SLSMAN";
    private final String tableNameSlsManSeq = tableNameSlsMan + "SEQ";
    private final String fileNameSlsMan = "SlsMan.json";

    public SyncSlsMan(SlsManReceiver slsMan) {
        this.slsMan = slsMan;
        dbLocal = new DbConnection();
    }

    public void init() {
        ResultSet resultSetSlsMan;
        
        connection = dbLocal.getConnection();
        
        resultSetSlsMan = dbLocal.querySelectAll(connection, tableNameSlsMan);

        System.out.println("\n*********" + tableNameSlsMan + " table column names***************");
        columnSlsMan = slsMan.getColumnNames(resultSetSlsMan);

        syncSlsMan(slsMan.getSlsManArrayList(slsMan.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameSlsMan)), slsMan.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameSlsMan));

        dbLocal.closeConnection(connection);
        dbLocal.closeResultSet(resultSetSlsMan);
        dbLocal = null;
        slsMan = null;
        columnSlsMan = null;
    }

    // metod to sync and insert SLSMAN table values
    public void syncSlsMan(ArrayList<SlsMan> slsManFromCloud, JSONObject jObject) {
        for (int i = 0; i < slsManFromCloud.size(); i++) {
            int slsManLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameSlsMan,
                    String.valueOf(slsManFromCloud.get(i).getSpecode()), "LOGICALREF", "SPECODE");

            if (slsManLogRef != 0) {
                System.err.println("UPDATE SLSMAN TABLE");
                System.err.println("DELETE logicalRef: " + slsManLogRef + "AND INSERT AGAIN!");
                
                dbLocal.deleteLogRef(connection, tableNameSlsMan, "LOGICALREF", slsManLogRef);
                dbLocal.insertCards(connection, jObject, tableNameSlsMan,
                        columnSlsMan, slsManLogRef, 0, 0, i);
            } else {
                System.err.println("INSERT SLSMAN TABLE");
                int newslsManLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameSlsManSeq,
                        "1", "LASTLREF", "ID");

                newslsManLogRef = newslsManLogRef + 1;
                dbLocal.insertCards(connection, jObject, tableNameSlsMan,
                        columnSlsMan, newslsManLogRef, 0, 0, i);
                //  update SLSMANSEQ tables LASTLREF value with new value
                dbLocal.updateKey(connection, newslsManLogRef, tableNameSlsManSeq);
            }
        }
    }
}

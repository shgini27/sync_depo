/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sync;

import com.saptaslama.controller.CompanyConstants;
import com.saptaslama.controller.DbConnection;
import com.saptaslama.controller.receiver.UnitReceiver;
import com.saptaslama.model.UnitSetF;
import com.saptaslama.model.UnitSetL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class SyncUnit {

    private UnitReceiver unitSet;

    private DbConnection dbLocal;

    private Connection connection;

    private String[] columnUnitF, columnUnitL;

    private final String tableNameUnitF = CompanyConstants.COMPANY + "UNITSETF";
    private final String tableNameUnitL = CompanyConstants.COMPANY + "UNITSETL";

    private final String tableNameUnitFSeq = tableNameUnitF + "SEQ";
    private final String tableNameUnitLSeq = tableNameUnitL + "SEQ";

    private final String fileNameUnitF = "UnitSetF.json";
    private final String fileNameUnitL = "UnitSetL.json";

    public SyncUnit(UnitReceiver unitSet) {
        this.unitSet = unitSet;

        dbLocal = new DbConnection();
    }

    public void init() {
        ResultSet resultSetUnitF;
        ResultSet resultSetUnitL;
        
        connection = dbLocal.getConnection();
        
        resultSetUnitF = dbLocal.querySelectAll(connection, tableNameUnitF);
        resultSetUnitL = dbLocal.querySelectAll(connection, tableNameUnitL);

        System.out.println("\n*********" + tableNameUnitF + " table column names***************");
        columnUnitF = unitSet.getColumnNames(resultSetUnitF);

        System.out.println("\n*********" + tableNameUnitL + " table column names***************");
        columnUnitL = unitSet.getColumnNames(resultSetUnitL);

        //sync methods are here
        syncUnitF(unitSet.getUnitSetFArrayList(unitSet.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameUnitF)), unitSet.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameUnitF));
        
        syncUnitL(unitSet.getUnitSetLArrayList(unitSet.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameUnitL)), unitSet.getUnitSetFArrayList(unitSet
                .getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameUnitF)), 
                unitSet.getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameUnitL));

        dbLocal.closeConnection(connection);
        dbLocal.closeResultSet(resultSetUnitF);
        dbLocal.closeResultSet(resultSetUnitL);

        //clear from memory (init objects to null)
        dbLocal = null;
        columnUnitF = null;
        unitSet = null;
    }

    //method to sync and insert UNITSETF table values
    public void syncUnitF(ArrayList<UnitSetF> unitFFromCloud, JSONObject jObject) {
        for (int i = 0; i < unitFFromCloud.size(); i++) {
            int unitFLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameUnitF,
                    String.valueOf(unitFFromCloud.get(i).getSpecode()), "LOGICALREF", "SPECODE");

            if (unitFLogRef != 0) {
                System.err.println("UPDATE UNITSETF TABLE");
                System.err.println("DELETE logicalRef: " + unitFLogRef + "AND INSERT AGAIN!");

                dbLocal.deleteLogRef(connection, tableNameUnitF, "LOGICALREF", unitFLogRef);
                dbLocal.insertCards(connection, jObject, tableNameUnitF,
                        columnUnitF, unitFLogRef, 0, 0, i);
            } else {
                System.err.println("INSERT UNITSETF TABLE");
                int newUnitFLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameUnitFSeq,
                        "1", "LASTLREF", "ID");

                newUnitFLogRef = newUnitFLogRef + 1;
                dbLocal.insertCards(connection, jObject, tableNameUnitF,
                        columnUnitF, newUnitFLogRef, 0, 0, i);
                //  update UNITSETFSEQ tables LASTLREF value with new value
                if (dbLocal.getPrimaryKeyInt(connection, tableNameUnitF,
                        String.valueOf(newUnitFLogRef), "LOGICALREF", "LOGICALREF") == newUnitFLogRef) {

                    dbLocal.updateKey(connection, newUnitFLogRef, tableNameUnitFSeq);
                }
            }
        }
    }

    //method to sync and insert UNITSETL table values
    public void syncUnitL(ArrayList<UnitSetL> unitLFromCloud, ArrayList<UnitSetF> 
            unitFFromCloud, JSONObject jObject) {
        for (int a = 0; a < unitFFromCloud.size(); a++) {
            int unitFLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameUnitF,
                    String.valueOf(unitFFromCloud.get(a).getSpecode()), "LOGICALREF", "SPECODE");
            ArrayList<UnitSetL> unitLLogRefs = dbLocal.getUnitLLogRefs(connection, tableNameUnitL,
                    "LOGICALREF", "UNITSETREF", unitFLogRef);
            System.err.println("DELETE UnitSetRef: " + unitFLogRef
                    + " AND INSERT AGAIN!");
            dbLocal.deleteLogRef(connection, tableNameUnitL, "UNITSETREF", unitFLogRef);
            int counter = 0;
            for (int i = 0; i < unitLFromCloud.size(); i++) {
                if (unitFFromCloud.get(a).getLogicalref() == unitLFromCloud.get(i).getUnitsetref()) {

                    if (unitFLogRef != 0) {
                        if (!unitLLogRefs.isEmpty() && counter < unitLLogRefs.size()) {
                            System.err.println("UPDATE UNITSETL TABLE");

                            int unitLLogRef = unitLLogRefs.get(counter).getLogicalref();

                            dbLocal.insertNums(connection, jObject, tableNameUnitL,
                                    columnUnitL, unitLLogRef, unitFLogRef, i);
                            counter++;
                        } else {
                            System.err.println("INSERT UNITSETL TABLE");
                            int newUnitLLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameUnitLSeq,
                                    "1", "LASTLREF", "ID");

                            newUnitLLogRef = newUnitLLogRef + 1;
                            dbLocal.insertNums(connection, jObject, tableNameUnitL,
                                    columnUnitL, newUnitLLogRef, unitFLogRef, i);
                            //  update UNITSETLSEQ tables LASTLREF value with new value
                            if (dbLocal.getPrimaryKeyInt(connection, tableNameUnitL,
                                    String.valueOf(newUnitLLogRef), "LOGICALREF", "LOGICALREF") == newUnitLLogRef) {

                                dbLocal.updateKey(connection, newUnitLLogRef, tableNameUnitLSeq);
                            }
                        }
                    } else {
                        System.err.println("UNITSETL ICIN UYGUN UNITSETFLOGREF BULUNAMADY!!!");
                    }
                }
            }
        }
    }
}

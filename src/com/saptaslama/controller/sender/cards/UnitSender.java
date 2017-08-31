/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sender.cards;

import com.saptaslama.controller.CompanyConstants;
import com.saptaslama.controller.DbConnection;
import com.saptaslama.controller.sender.Sender;
import com.saptaslama.model.JsonObject;
import com.saptaslama.model.UnitSetF;
import com.saptaslama.model.UnitSetL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;

/**
 *
 * @author Shagy
 */
public class UnitSender extends Sender{
    
    public void init() {
        Connection connection;
        ResultSet resultSetUnitSetF;
        ResultSet resultSetUnitSetL;
        
        String tableNameF = CompanyConstants.COMPANY + "UNITSETF";
        String tableNameL = CompanyConstants.COMPANY + "UNITSETL";
        
        String fileNameF = "UnitSetF.json";
        String fileNameL = "UnitSetL.json";
        
        String conditionF = "SPECODE NOT LIKE ''";
        String conditionL = "WIDTH != '0'";
        
        /*
        SELECT LOGICALREF FROM LG_007_UNITSETF 
		WHERE SPECODE NOT LIKE '' AND CAPIBLOCK_CREADEDDATE 
                        BETWEEN '2017-02-01 00:00:00.000' AND '2017-03-01 00:00:00.000' 
			OR CAPIBLOCK_MODIFIEDDATE BETWEEN '2017-02-01 00:00:00.000' AND '2017-03-01 00:00:00.000'
        
        SELECT * FROM LG_007_UNITSETL 
            WHERE WIDTH != '0' AND UNITSETREF IN(SELECT LOGICALREF FROM LG_007_UNITSETF 
		WHERE SPECODE NOT LIKE '' AND CAPIBLOCK_CREADEDDATE 
                    BETWEEN '2017-02-01 00:00:00.000' AND '2017-03-01 00:00:00.000' 
                    OR CAPIBLOCK_MODIFIEDDATE BETWEEN '2017-02-01 00:00:00.000' AND '2017-03-01 00:00:00.000')
        */

        DbConnection db = new DbConnection();

        connection = db.getConnection();
        
        resultSetUnitSetF = db.querySelectCondition(connection, "LOGICALREF, SPECODE", tableNameF, conditionF);
        resultSetUnitSetL = db.querySelectCondition(connection, "LOGICALREF, WIDTH", tableNameL, conditionL);

        sendJsonFile(getUnitSetFJson(resultSetUnitSetF), CompanyConstants.FILE_PATH_SEND + fileNameF);
        sendJsonFile(getUnitSetLJson(resultSetUnitSetL), CompanyConstants.FILE_PATH_SEND + fileNameL);

        db.closeConnection(connection);
        db.closeResultSet(resultSetUnitSetF);
        db.closeResultSet(resultSetUnitSetL);
    }
    
//***********************************UNITSETF***********************************
    private JsonObject getUnitSetFJson(ResultSet resultSet) {
        ArrayList<UnitSetF> list = new ArrayList<>();
        JsonObject jsonObject = new JsonObject();
        JSONArray logicalRef = new JSONArray();
        JSONArray speCode = new JSONArray();
        UnitSetF unit;

        try {
            while (resultSet.next()) {
                unit = new UnitSetF(resultSet.getInt("LOGICALREF"), resultSet.getString("SPECODE"));
                list.add(unit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UnitSender.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
        
        for (int a = 0; a < list.size(); a++) {
            logicalRef.add(list.get(a).getLogicalref());
            speCode.add(list.get(a).getSpecode());
        }
        jsonObject.setObject("LOGICALREF", logicalRef);
        jsonObject.setObject("SPECODE", speCode);

        return jsonObject;
    }
    
//***********************************UNITSETL***********************************
    
    private JsonObject getUnitSetLJson(ResultSet resultSet) {
        ArrayList<UnitSetL> list = new ArrayList<>();
        JsonObject jsonObject = new JsonObject();
        JSONArray logicalRef = new JSONArray();
        JSONArray width = new JSONArray();
        UnitSetL unit;

        try {
            while (resultSet.next()) {
                unit = new UnitSetL(resultSet.getInt("LOGICALREF"), resultSet.getInt("WIDTH"));
                list.add(unit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UnitSender.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
        
        for (int a = 0; a < list.size(); a++) {
            logicalRef.add(list.get(a).getLogicalref());
            width.add(list.get(a).getWidth());
        }
        
        jsonObject.setObject("LOGICALREF", logicalRef);
        jsonObject.setObject("WIDTH", width);
        
        return jsonObject;
    }
}

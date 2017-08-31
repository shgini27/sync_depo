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
import com.saptaslama.model.SrvCard;
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
public class SrvCardSender extends Sender{
    
    public void init() {
        Connection con;
        ResultSet resultSetSrvCard;
        
        String tabelNameSrvCard = CompanyConstants.COMPANY + "SRVCARD";
        
        String fileNameSrvCard = "SrvCard.json";
        
        String queryCondition = "SPECODE NOT LIKE ''";
        //select * from SRVCARD where SPECODE not like ''
        /*
        SELECT * FROM LG_007_SRVCARD 
            WHERE SPECODE NOT LIKE '' AND CAPIBLOCK_CREADEDDATE BETWEEN '2017-02-01 00:00:00.000' 
                AND '2017-03-01 00:00:00.000' 
		OR CAPIBLOCK_MODIFIEDDATE BETWEEN '2017-02-01 00:00:00.000' AND '2017-03-01 00:00:00.000'
        */
        
        DbConnection db = new DbConnection();

        con = db.getConnection();
        resultSetSrvCard = db.querySelectCondition(con, "LOGICALREF, SPECODE", tabelNameSrvCard, queryCondition);
        
        sendJsonFile(getSrvCardJson(resultSetSrvCard), CompanyConstants.FILE_PATH_SEND +  fileNameSrvCard);
        db.closeConnection(con);
        db.closeResultSet(resultSetSrvCard);
    }
    
//**********************************SRVCARD*************************************
    
    private JsonObject getSrvCardJson(ResultSet resultSet) {
        JsonObject jsonObject = new JsonObject();
        JSONArray logicalRef = new JSONArray();
        JSONArray specode = new JSONArray();
        ArrayList<SrvCard> list = new ArrayList<>();
        SrvCard unit;

        try {
            while (resultSet.next()) {
                unit = new SrvCard(resultSet.getInt("LOGICALREF"), resultSet.getString("SPECODE"));
                list.add(unit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SrvCardSender.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
        
        for (int a = 0; a < list.size(); a++) {
            logicalRef.add(list.get(a).getLogicalRef());
            specode.add(list.get(a).getSpecode());
        }
        jsonObject.setObject("LOGICALREF", logicalRef);
        jsonObject.setObject("SPECODE", specode);
        
        return jsonObject;
    }
}

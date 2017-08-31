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
import com.saptaslama.model.KsCard;
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
public class KsCardSender extends Sender{
    
    public void init() {
        Connection con;
        ResultSet resultSetKsCard;
        
        String tabelNameKsCard = CompanyConstants.COMPANY + "KSCARD";
        
        String fileNameKsCard = "KsCard.json";
        
        String queryCondition = "SPECODE NOT LIKE ''";
        //SELECT SPECODE FROM LG_008_KSCARD where SPECODE not like ''
        /*
        SELECT * FROM LG_008_KSCARD 
	WHERE SPECODE NOT LIKE '' AND CAPIBLOCK_CREADEDDATE BETWEEN '2017-02-01 00:00:00.000' 
                AND '2017-03-01 00:00:00.000' 
		OR CAPIBLOCK_MODIFIEDDATE BETWEEN '2017-02-01 00:00:00.000' AND '2017-03-01 00:00:00.000'
        */
        
        DbConnection db = new DbConnection();

        con = db.getConnection();
        
        resultSetKsCard = db.querySelectCondition(con, "LOGICALREF, SPECODE", tabelNameKsCard, 
                queryCondition);
        
        sendJsonFile(getKsCardJson(resultSetKsCard), CompanyConstants
                .FILE_PATH_SEND + fileNameKsCard);
        
        db.closeConnection(con);
        db.closeResultSet(resultSetKsCard);
    }
    
//*******************************KSCARD*****************************************    
    private JsonObject getKsCardJson(ResultSet resultSet) {
        JsonObject jsonObject = new JsonObject();
        JSONArray logicalRef = new JSONArray();
        JSONArray specode = new JSONArray();
        ArrayList<KsCard> list = new ArrayList<>();
        KsCard unit;

        try {
            while (resultSet.next()) {
                unit = new KsCard(resultSet.getInt("LOGICALREF"), resultSet.getString("SPECODE"));
                list.add(unit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KsCardSender.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }

        for (int a = 0; a < list.size(); a++) {
            //here we setting the specode with local logicalRef (example: if depo 
            //then we adding "D" infront of LogREf)
            logicalRef.add(list.get(a).getLogicalRef());
            specode.add(list.get(a).getSpecode());
        }
        jsonObject.setObject("LOGICALREF", logicalRef);
        jsonObject.setObject("SPECODE", specode);
        
        return jsonObject;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sender.cards;

import com.saptaslama.controller.CompanyConstants;
import com.saptaslama.controller.DbConnection;
import com.saptaslama.controller.sender.Sender;
import com.saptaslama.model.Items;
import com.saptaslama.model.JsonObject;
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
public class ItemSender extends Sender{
    
    public void init() {
        Connection con;
        ResultSet resultSetItems;
        
        String tabelNameItems = CompanyConstants.COMPANY + "ITEMS";
        
        String fileNameItems = "Items.json";
        
        String condition = "LOGICALREF != '1' AND ISONR NOT LIKE ''";
        
        DbConnection db = new DbConnection();

        con = db.getConnection();
        
        resultSetItems = db.querySelectCondition(con, "LOGICALREF, ISONR", tabelNameItems, condition);
        /*SELECT ISONR FROM ITEMS where LOGICALREF != '1' and ISONR not like ''*/
        /*
        SELECT * FROM LG_007_ITEMS 
	WHERE LOGICALREF != '1' AND ISONR NOT LIKE '' 
		AND CAPIBLOCK_CREADEDDATE BETWEEN '2017-02-01 00:00:00.000' AND '2017-03-01 00:00:00.000' 
		OR CAPIBLOCK_MODIFIEDDATE BETWEEN '2017-02-01 00:00:00.000' AND '2017-03-01 00:00:00.000'
        */
        
        sendJsonFile(getItemsJson(resultSetItems), CompanyConstants.FILE_PATH_SEND
                + fileNameItems);

        db.closeConnection(con);
        db.closeResultSet(resultSetItems);
    }
    
//********************************ITEMS*****************************************    
    private JsonObject getItemsJson(ResultSet resultSet) {
        ArrayList<Items> list = new ArrayList<>();
        JsonObject jsonObject = new JsonObject();
        JSONArray logicalRef = new JSONArray();
        JSONArray isoNr = new JSONArray();
        Items unit;

        try {
            while (resultSet.next()) {
                unit = new Items(resultSet.getInt("LOGICALREF"), resultSet.getString("ISONR"));
                list.add(unit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemSender.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }

        for (int a = 0; a < list.size(); a++) {
            //here we setting the specode with local logicalRef (example: if depo 
            //then we adding "D" infront of LogREf)
            logicalRef.add(list.get(a).getLogicalref());
            isoNr.add(list.get(a).getIsonr());
        }
        jsonObject.setObject("LOGICALREF", logicalRef);
        jsonObject.setObject("ISONR", isoNr);
        return jsonObject;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sender.cards;

import com.saptaslama.controller.CompanyConstants;
import com.saptaslama.controller.DbConnection;
import com.saptaslama.controller.sender.Sender;
import com.saptaslama.model.BankAcc;
import com.saptaslama.model.BnCard;
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
public class BnCardSender extends Sender{
    
    public void init() {
        Connection con;
        
        ResultSet resultSetBnCard;
        ResultSet resultSetBankAcc;
        
        String tabelNameBnCard = CompanyConstants.COMPANY + "BNCARD";
        String tabelNameBankAcc = CompanyConstants.COMPANY + "BANKACC";
        
        String fileNameBnCard = "BnCard.json";
        String fileNameBankAcc = "BankAcc.json";
        
        String queryCondition = "SPECODE NOT LIKE ''";
        //select * from BNCARD where SPECODE not like ''
        /*
        SELECT * FROM LG_007_BNCARD WHERE CAPIBLOCK_CREADEDDATE BETWEEN 
        '2017-03-01 00:00:00.000' AND '2017-03-20 00:00:00.000'
        OR CAPIBLOCK_MODIFIEDDATE BETWEEN '2017-03-01 00:00:00.000' AND 
        '2017-03-20 00:00:00.000'
        
        SELECT * FROM LG_007_BANKACC WHERE CAPIBLOCK_CREADEDDATE BETWEEN 
        '2017-03-01 00:00:00.000' AND '2017-03-20 00:00:00.000'
        OR CAPIBLOCK_MODIFIEDDATE BETWEEN '2017-03-01 00:00:00.000' AND 
        '2017-03-20 00:00:00.000'
        */
        
        DbConnection db = new DbConnection();

        con = db.getConnection();
        resultSetBnCard = db.querySelectCondition(con, "LOGICALREF, SPECODE", tabelNameBnCard, queryCondition);
        resultSetBankAcc = db.querySelectCondition(con, "LOGICALREF, SPECODE", tabelNameBankAcc, queryCondition);
        
        sendJsonFile(getBnCardJson(resultSetBnCard), CompanyConstants
                .FILE_PATH_SEND + fileNameBnCard);
        sendJsonFile(getBankAccJson(resultSetBankAcc), CompanyConstants
                .FILE_PATH_SEND + fileNameBankAcc);
        
        db.closeConnection(con);
        db.closeResultSet(resultSetBnCard);
        db.closeResultSet(resultSetBankAcc);
    }
    
//**********************************BNCARD**************************************
    private JsonObject getBnCardJson(ResultSet resultSet) {
        
        ArrayList<BnCard> list = new ArrayList<>();
        JsonObject jsonObject = new JsonObject();
        JSONArray specode = new JSONArray();
        JSONArray logicalRef = new JSONArray();
        BnCard unit;

        try {
            while (resultSet.next()) {
                unit = new BnCard(resultSet.getInt("LOGICALREF"), resultSet.getString("SPECODE"));
                list.add(unit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BnCardSender.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }

        for (int a = 0; a < list.size(); a++) {
            //here we setting the specode with local logicalRef (example: if depo 
            //then we adding "D" infront of LogREf)
            logicalRef.add(list.get(a).getLogicalRef());
            specode.add(list.get(a).getSpecode());
        }
        jsonObject.setObject("SPECODE", specode);
        jsonObject.setObject("LOGICALREF", logicalRef);
        
        return jsonObject;
    }
    
//**********************************BANKACC*************************************    
    private JsonObject getBankAccJson(ResultSet resultSet) {
        
        ArrayList<BankAcc> list = new ArrayList<>();
        JsonObject jsonObject = new JsonObject();
        JSONArray logicalRef = new JSONArray();
        JSONArray specode = new JSONArray();
        BankAcc unit;

        try {
            while (resultSet.next()) {
                unit = new BankAcc(resultSet.getInt("LOGICALREF"), resultSet.getString("SPECODE"));
                list.add(unit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BnCardSender.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
        
        for (int a = 0; a < list.size(); a++) {
            //here we setting the specode with local logicalRef (example: if depo 
            //then we adding "D" infront of LogREf)
            logicalRef.add(list.get(a).getLogicalRef());
            specode.add(list.get(a).getSpecode());
        }
        jsonObject.setObject("SPECODE", specode);
        jsonObject.setObject("LOGICALREF", logicalRef);
        
        return jsonObject;
    }
}

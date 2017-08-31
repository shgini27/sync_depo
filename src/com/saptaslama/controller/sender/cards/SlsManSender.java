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
import com.saptaslama.model.SlsMan;
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
public class SlsManSender extends Sender{
    
    public void init() {
        Connection con;
        ResultSet resultSet;
        String firma = "LG_";
        String tabelName = firma + "SLSMAN";
        String fileName = "SlsMan.json";
        String queryCondition = "SPECODE LIKE ''";
        /*
        SELECT * FROM LG_SLSMAN 
            WHERE SPECODE NOT LIKE '' AND CAPIBLOCK_CREADEDDATE BETWEEN '2017-02-01 00:00:00.000' 
                AND '2017-03-01 00:00:00.000' 
		OR CAPIBLOCK_MODIFIEDDATE BETWEEN '2017-02-01 00:00:00.000' AND '2017-03-01 00:00:00.000'
        */
        DbConnection db = new DbConnection();

        con = db.getConnection();
        resultSet = db.querySelectStatement(con, tabelName, queryCondition);
        
        sendJsonFile(getSlsManJson(getSlsManArrayList(resultSet)), CompanyConstants.FILE_PATH_SEND + fileName);

        db.closeConnection(con);
        db.closeResultSet(resultSet);
    }
    
    public ArrayList<SlsMan> getSlsManArrayList(ResultSet resultSet) {

        ArrayList<SlsMan> tableValue = new ArrayList<>();
        SlsMan unit;

        try {
            while (resultSet.next()) {
                unit = new SlsMan(
                        resultSet.getInt("LOGICALREF"), resultSet.getString("CODE"),
                        resultSet.getString("DEFINITION_"), resultSet.getShort("CARDTYPE"),
                        resultSet.getString("SPECODE"), resultSet.getString("CYPHCODE"),
                        resultSet.getString("POSITION_"), resultSet.getShort("CAPIBLOCK_CREATEDBY"),
                        resultSet.getString("CAPIBLOCK_CREADEDDATE"), resultSet.getShort("CAPIBLOCK_CREATEDHOUR"),
                        resultSet.getShort("CAPIBLOCK_CREATEDMIN"), resultSet.getShort("CAPIBLOCK_CREATEDSEC"),
                        resultSet.getShort("CAPIBLOCK_MODIFIEDBY"), resultSet.getString("CAPIBLOCK_MODIFIEDDATE"),
                        resultSet.getShort("CAPIBLOCK_MODIFIEDHOUR"), resultSet.getShort("CAPIBLOCK_MODIFIEDMIN"),
                        resultSet.getShort("CAPIBLOCK_MODIFIEDSEC"), resultSet.getShort("ACTIVE"),
                        resultSet.getInt("SITEID"), resultSet.getInt("ORGLOGICREF"),
                        resultSet.getShort("USERID"), resultSet.getShort("DEPTID"),
                        resultSet.getShort("DIVISID"), resultSet.getShort("FIRMNR"),
                        resultSet.getShort("RECSTATUS"), resultSet.getShort("TYP"));
                tableValue.add(unit);
            }
            return tableValue;
        } catch (SQLException ex) {
            Logger.getLogger(SlsManSender.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
            return null;
        }
    }
    
    public JsonObject getSlsManJson(ArrayList<SlsMan> list) {
        CompanyConstants c = new CompanyConstants();
        
        JsonObject jsonObject = new JsonObject();
        JSONArray logicalRef = new JSONArray();
        JSONArray code = new JSONArray();
        JSONArray definition = new JSONArray();
        JSONArray cardType = new JSONArray();
        JSONArray specode = new JSONArray();
        JSONArray cyphCode = new JSONArray();
        JSONArray position = new JSONArray();
        JSONArray capiblockCreatedby = new JSONArray();
        JSONArray capiblockCreadeddate = new JSONArray();
        JSONArray capiblockCreatedhour = new JSONArray();
        JSONArray capiblockCreatedmin = new JSONArray();
        JSONArray capiblockCreatedsec = new JSONArray();
        JSONArray capiblockModifiedby = new JSONArray();
        JSONArray capiblockModifieddate = new JSONArray();
        JSONArray capiblockModifiedhour = new JSONArray();
        JSONArray capiblockModifiedmin = new JSONArray();
        JSONArray capiblockModifiedsec = new JSONArray();
        JSONArray active = new JSONArray();
        JSONArray siteId = new JSONArray();
        JSONArray orgLogicalRef = new JSONArray();
        JSONArray userId = new JSONArray();
        JSONArray deptId = new JSONArray();
        JSONArray divisId = new JSONArray();
        JSONArray firmNr = new JSONArray();
        JSONArray recStatus = new JSONArray();
        JSONArray typ = new JSONArray();

        for (int a = 0; a < list.size(); a++) {

            //here we setting the specode with local logicalRef (example: if depo 
            //then we adding "D" infront of LogREf)
            specode.add(String.valueOf(c.DEPO_CODE - list.get(a).getLogicalRef()));
            code.add("DEPO" + list.get(a).getCode());
            
            logicalRef.add(list.get(a).getLogicalRef());
            definition.add(list.get(a).getDefinition());
            cardType.add(list.get(a).getCardType()); 
            
            cyphCode.add(list.get(a).getCyphCode());
            position.add(list.get(a).getPosition());
            capiblockCreatedby.add(list.get(a).getCapiblockCreatedby());
            capiblockCreadeddate.add(list.get(a).getCapiblockCreadeddate());
            capiblockCreatedhour.add(list.get(a).getCapiblockCreatedhour());
            capiblockCreatedmin.add(list.get(a).getCapiblockCreatedmin());
            capiblockCreatedsec.add(list.get(a).getCapiblockCreatedsec());
            capiblockModifiedby.add(list.get(a).getCapiblockModifiedby());
            capiblockModifieddate.add(list.get(a).getCapiblockModifieddate());
            capiblockModifiedhour.add(list.get(a).getCapiblockModifiedhour());
            capiblockModifiedmin.add(list.get(a).getCapiblockModifiedmin());
            capiblockModifiedsec.add(list.get(a).getCapiblockModifiedsec());
            active.add(list.get(a).getActive());
            siteId.add(list.get(a).getSiteId());
            orgLogicalRef.add(list.get(a).getOrgLogicalRef());
            userId.add(list.get(a).getUserId());
            deptId.add(list.get(a).getDeptId());
            divisId.add(list.get(a).getDivisId());
            firmNr.add(list.get(a).getFirmNr());
            recStatus.add(list.get(a).getRecStatus());
            typ.add(list.get(a).getTyp());

        }
        jsonObject.setObject("LOGICALREF", logicalRef);
        jsonObject.setObject("CODE", code);
        jsonObject.setObject("DEFINITION_", definition);
        jsonObject.setObject("CARDTYPE", cardType);
        jsonObject.setObject("SPECODE", specode);
        jsonObject.setObject("CYPHCODE", cyphCode);
        jsonObject.setObject("POSITION_", position);
        jsonObject.setObject("CAPIBLOCK_CREATEDBY", capiblockCreatedby);
        jsonObject.setObject("CAPIBLOCK_CREADEDDATE", capiblockCreadeddate);
        jsonObject.setObject("CAPIBLOCK_CREATEDHOUR", capiblockCreatedhour);
        jsonObject.setObject("CAPIBLOCK_CREATEDMIN", capiblockCreatedmin);
        jsonObject.setObject("CAPIBLOCK_CREATEDSEC", capiblockCreatedsec);
        jsonObject.setObject("CAPIBLOCK_MODIFIEDBY", capiblockModifiedby);
        jsonObject.setObject("CAPIBLOCK_MODIFIEDDATE", capiblockModifieddate);
        jsonObject.setObject("CAPIBLOCK_MODIFIEDHOUR", capiblockModifiedhour);
        jsonObject.setObject("CAPIBLOCK_MODIFIEDMIN", capiblockModifiedmin);
        jsonObject.setObject("CAPIBLOCK_MODIFIEDSEC", capiblockModifiedsec);
        jsonObject.setObject("ACTIVE", active);
        jsonObject.setObject("SITEID", siteId);
        jsonObject.setObject("ORGLOGICREF", orgLogicalRef);
        jsonObject.setObject("USERID", userId);
        jsonObject.setObject("DEPTID", deptId);
        jsonObject.setObject("DIVISID", divisId);
        jsonObject.setObject("FIRMNR", firmNr);
        jsonObject.setObject("RECSTATUS", recStatus);
        jsonObject.setObject("TYP", typ);

        return jsonObject;
    }
}

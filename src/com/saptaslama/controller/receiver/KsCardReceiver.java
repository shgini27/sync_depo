/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.receiver;

import com.saptaslama.controller.sender.Sender;
import com.saptaslama.model.CrdacRef;
import com.saptaslama.model.EmCenter;
import com.saptaslama.model.KsCard;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class KsCardReceiver extends Sender{
    public ArrayList<KsCard> getKsCardArrayList(JSONObject jObject) {

        ArrayList<KsCard> tableValue = new ArrayList<>();
        KsCard items;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray code = (JSONArray) jObject.get("CODE");
        JSONArray name = (JSONArray) jObject.get("NAME");
        JSONArray specode = (JSONArray) jObject.get("SPECODE");
        JSONArray cyphCode = (JSONArray) jObject.get("CYPHCODE");
        JSONArray explain = (JSONArray) jObject.get("EXPLAIN");
        JSONArray addr1 = (JSONArray) jObject.get("ADDR1");
        JSONArray addr2 = (JSONArray) jObject.get("ADDR2");
        JSONArray capiblockCreatedby = (JSONArray) jObject.get("CAPIBLOCK_CREATEDBY");
        JSONArray capiblockCreadeddate = (JSONArray) jObject.get("CAPIBLOCK_CREADEDDATE");
        JSONArray capiblockCreatedhour = (JSONArray) jObject.get("CAPIBLOCK_CREATEDHOUR");
        JSONArray capiblockCreatedmin = (JSONArray) jObject.get("CAPIBLOCK_CREATEDMIN");
        JSONArray capiblockCreatedsec = (JSONArray) jObject.get("CAPIBLOCK_CREATEDSEC");
        JSONArray capiblockModifiedby = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDBY");
        JSONArray capiblockModifieddate = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDDATE");
        JSONArray capiblockModifiedhour = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDHOUR");
        JSONArray capiblockModifiedmin = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDMIN");
        JSONArray capiblockModifiedsec = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDSEC");
        JSONArray active = (JSONArray) jObject.get("ACTIVE");
        JSONArray siteId = (JSONArray) jObject.get("SITEID");
        JSONArray recStatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray orgLogicRef = (JSONArray) jObject.get("ORGLOGICREF");
        JSONArray wfStatus = (JSONArray) jObject.get("WFSTATUS");
        JSONArray cCurrancy = (JSONArray) jObject.get("CCURRENCY");
        JSONArray curRateType = (JSONArray) jObject.get("CURRATETYPE");
        JSONArray fixedCurrType = (JSONArray) jObject.get("FIXEDCURRTYPE");

        for (int i = 0; i < logicalRef.size(); i++) {
            items = new KsCard(
                        Integer.parseInt(logicalRef.get(i).toString()), code.get(i).toString(),
                        name.get(i).toString(), specode.get(i).toString(), 
                        cyphCode.get(i).toString(), explain.get(i).toString(),
                        addr1.get(i).toString(), addr2.get(i).toString(),
                        Short.parseShort(capiblockCreatedby.get(i).toString()), capiblockCreadeddate.get(i).toString(), 
                        Short.parseShort(capiblockCreatedhour.get(i).toString()), Short.parseShort(capiblockCreatedmin.get(i).toString()), 
                        Short.parseShort(capiblockCreatedsec.get(i).toString()), Short.parseShort(capiblockModifiedby.get(i).toString()), 
                        capiblockModifieddate.get(i).toString(), Short.parseShort(capiblockModifiedhour.get(i).toString()), 
                        Short.parseShort(capiblockModifiedmin.get(i).toString()), Short.parseShort(capiblockModifiedsec.get(i).toString()), 
                        Short.parseShort(active.get(i).toString()), Short.parseShort(siteId.get(i).toString()), 
                        Short.parseShort(recStatus.get(i).toString()), Integer.parseInt(orgLogicRef.get(i).toString()), 
                        Integer.parseInt(wfStatus.get(i).toString()), Short.parseShort(cCurrancy.get(i).toString()), 
                        Short.parseShort(curRateType.get(i).toString()), Short.parseShort(fixedCurrType.get(i).toString()));

            tableValue.add(items);
        }
        return tableValue;
    }
    
    public ArrayList<EmCenter> getEmCenterArrayList(JSONObject jObject) {

        ArrayList<EmCenter> tableValue = new ArrayList<>();
        EmCenter items;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray code = (JSONArray) jObject.get("CODE");
        JSONArray definition = (JSONArray) jObject.get("DEFINITION_");
        JSONArray specode = (JSONArray) jObject.get("SPECODE");
        JSONArray cyphCode = (JSONArray) jObject.get("CYPHCODE");
        JSONArray units = (JSONArray) jObject.get("UNITS");
        JSONArray addInfoRef = (JSONArray) jObject.get("ADDINFOREF");
        JSONArray extenRef = (JSONArray) jObject.get("EXTENREF");
        JSONArray capiblockCreatedby = (JSONArray) jObject.get("CAPIBLOCK_CREATEDBY");
        JSONArray capiblockCreadeddate = (JSONArray) jObject.get("CAPIBLOCK_CREADEDDATE");
        JSONArray capiblockCreatedhour = (JSONArray) jObject.get("CAPIBLOCK_CREATEDHOUR");
        JSONArray capiblockCreatedmin = (JSONArray) jObject.get("CAPIBLOCK_CREATEDMIN");
        JSONArray capiblockCreatedsec = (JSONArray) jObject.get("CAPIBLOCK_CREATEDSEC");
        JSONArray capiblockModifiedby = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDBY");
        JSONArray capiblockModifieddate = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDDATE");
        JSONArray capiblockModifiedhour = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDHOUR");
        JSONArray capiblockModifiedmin = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDMIN");
        JSONArray capiblockModifiedsec = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDSEC");
        JSONArray active = (JSONArray) jObject.get("ACTIVE");
        JSONArray siteId = (JSONArray) jObject.get("SITEID");
        JSONArray recStatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray orgLogicRef = (JSONArray) jObject.get("ORGLOGICALREF");
        JSONArray wfStatus = (JSONArray) jObject.get("WFSTATUS");

        for (int i = 0; i < logicalRef.size(); i++) {
            items = new EmCenter(
                        Integer.parseInt(logicalRef.get(i).toString()), code.get(i).toString(),
                        definition.get(i).toString(), specode.get(i).toString(), 
                        cyphCode.get(i).toString(), units.get(i).toString(),
                        Integer.parseInt(addInfoRef.get(i).toString()), Integer.parseInt(extenRef.get(i).toString()),
                        Short.parseShort(capiblockCreatedby.get(i).toString()), capiblockCreadeddate.get(i).toString(), 
                        Short.parseShort(capiblockCreatedhour.get(i).toString()), Short.parseShort(capiblockCreatedmin.get(i).toString()), 
                        Short.parseShort(capiblockCreatedsec.get(i).toString()), Short.parseShort(capiblockModifiedby.get(i).toString()), 
                        capiblockModifieddate.get(i).toString(), Short.parseShort(capiblockModifiedhour.get(i).toString()), 
                        Short.parseShort(capiblockModifiedmin.get(i).toString()), Short.parseShort(capiblockModifiedsec.get(i).toString()), 
                        Short.parseShort(active.get(i).toString()), Short.parseShort(siteId.get(i).toString()), 
                        Short.parseShort(recStatus.get(i).toString()), Integer.parseInt(orgLogicRef.get(i).toString()), 
                        Integer.parseInt(wfStatus.get(i).toString()));

            tableValue.add(items);
        }
        return tableValue;
    }
    
    public ArrayList<CrdacRef> getCrdacRefArrayList(JSONObject jObject) {

        ArrayList<CrdacRef> tableValue = new ArrayList<>();
        CrdacRef line;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray trCode = (JSONArray) jObject.get("TRCODE");
        JSONArray cardRef = (JSONArray) jObject.get("CARDREF");
        JSONArray typ = (JSONArray) jObject.get("TYP");
        JSONArray accountRef = (JSONArray) jObject.get("ACCOUNTREF");
        JSONArray centerRef = (JSONArray) jObject.get("CENTERREF");
        JSONArray siteId = (JSONArray) jObject.get("SITEID");
        JSONArray recStatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray orgLogicRef = (JSONArray) jObject.get("ORGLOGICREF");
        JSONArray projectRef = (JSONArray) jObject.get("PROJECTREF");

        for (int i = 0; i < logicalRef.size(); i++) {
            line = new CrdacRef(
                    Integer.parseInt(logicalRef.get(i).toString()), Short.parseShort(trCode.get(i).toString()),
                    Integer.parseInt(cardRef.get(i).toString()), Short.parseShort(typ.get(i).toString()),
                    Integer.parseInt(accountRef.get(i).toString()), Integer.parseInt(centerRef.get(i).toString()),
                    Short.parseShort(siteId.get(i).toString()), Short.parseShort(recStatus.get(i).toString()),
                    Integer.parseInt(orgLogicRef.get(i).toString()), Integer.parseInt(projectRef.get(i).toString()));

            tableValue.add(line);
        }
        return tableValue;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.receiver;

import com.saptaslama.controller.sender.Sender;
import com.saptaslama.model.SlsMan;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class SlsManReceiver extends Sender{
    public ArrayList<SlsMan> getSlsManArrayList(JSONObject jObject) {

        ArrayList<SlsMan> tableValue = new ArrayList<>();
        SlsMan items;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray code = (JSONArray) jObject.get("CODE");
        JSONArray definition = (JSONArray) jObject.get("DEFINITION_");
        JSONArray cardType = (JSONArray) jObject.get("CARDTYPE");
        JSONArray specode = (JSONArray) jObject.get("SPECODE");
        JSONArray cyphCode = (JSONArray) jObject.get("CYPHCODE");
        JSONArray position = (JSONArray) jObject.get("POSITION_");
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
        JSONArray orgLogicalRef = (JSONArray) jObject.get("ORGLOGICREF");
        JSONArray userId = (JSONArray) jObject.get("USERID");
        JSONArray deptId = (JSONArray) jObject.get("DEPTID");
        JSONArray divisId = (JSONArray) jObject.get("DIVISID");
        JSONArray firmNr = (JSONArray) jObject.get("FIRMNR");
        JSONArray recStatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray typ = (JSONArray) jObject.get("TYP");

        for (int i = 0; i < logicalRef.size(); i++) {
            items = new SlsMan(
                    Integer.parseInt(logicalRef.get(i).toString()), code.get(i).toString(),
                    definition.get(i).toString(), Short.parseShort(cardType.get(i).toString()),
                    specode.get(i).toString(), cyphCode.get(i).toString(),
                    position.get(i).toString(), Short.parseShort(capiblockCreatedby.get(i).toString()),
                    capiblockCreadeddate.get(i).toString(), Short.parseShort(capiblockCreatedhour.get(i).toString()),
                    Short.parseShort(capiblockCreatedmin.get(i).toString()), Short.parseShort(capiblockCreatedsec.get(i).toString()),
                    Short.parseShort(capiblockModifiedby.get(i).toString()), capiblockModifieddate.get(i).toString(),
                    Short.parseShort(capiblockModifiedhour.get(i).toString()), Short.parseShort(capiblockModifiedmin.get(i).toString()),
                    Short.parseShort(capiblockModifiedsec.get(i).toString()), Short.parseShort(active.get(i).toString()),
                    Integer.parseInt(siteId.get(i).toString()), Integer.parseInt(orgLogicalRef.get(i).toString()),
                    Short.parseShort(userId.get(i).toString()), Short.parseShort(deptId.get(i).toString()),
                    Short.parseShort(divisId.get(i).toString()), Short.parseShort(firmNr.get(i).toString()),
                    Short.parseShort(recStatus.get(i).toString()), Short.parseShort(typ.get(i).toString()));

            tableValue.add(items);
        }
        return tableValue;
    }
}

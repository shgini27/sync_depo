/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.receiver;

import com.saptaslama.controller.sender.Sender;
import com.saptaslama.model.SrvCard;
import com.saptaslama.model.SrvNums;
import com.saptaslama.model.SrvTot;
import com.saptaslama.model.SrvUnitA;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class SrvCardReceiver extends Sender{
    public ArrayList<SrvCard> getSrvCardArrayList(JSONObject jObject) {

        ArrayList<SrvCard> tableValue = new ArrayList<>();
        SrvCard items;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray active = (JSONArray) jObject.get("ACTIVE");
        JSONArray cardType = (JSONArray) jObject.get("CARDTYPE");
        JSONArray code = (JSONArray) jObject.get("CODE");
        JSONArray definition = (JSONArray) jObject.get("DEFINITION_");
        JSONArray specode = (JSONArray) jObject.get("SPECODE");
        JSONArray cyphCode = (JSONArray) jObject.get("CYPHCODE");
        JSONArray vat = (JSONArray) jObject.get("VAT");
        JSONArray extenRef = (JSONArray) jObject.get("EXTENREF");
        JSONArray paymentRef = (JSONArray) jObject.get("PAYMENTREF");
        JSONArray unitSetRef = (JSONArray) jObject.get("UNITSETREF");
        JSONArray capiblockCreatedBy = (JSONArray) jObject.get("CAPIBLOCK_CREATEDBY");
        JSONArray capiblockCreatedDate = (JSONArray) jObject.get("CAPIBLOCK_CREADEDDATE");
        JSONArray capiblockCreatedHour = (JSONArray) jObject.get("CAPIBLOCK_CREATEDHOUR");
        JSONArray capiblockCreatedMin = (JSONArray) jObject.get("CAPIBLOCK_CREATEDMIN");
        JSONArray capiblockCreatedSec = (JSONArray) jObject.get("CAPIBLOCK_CREATEDSEC");
        JSONArray capiblockModifiedBy = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDBY");
        JSONArray capiblockModifiedDate = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDDATE");
        JSONArray capiblockModifiedHour = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDHOUR");
        JSONArray capiblockModifiedMin = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDMIN");
        JSONArray capiblockModifiedSec = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDSEC");
        JSONArray siteId = (JSONArray) jObject.get("SITEID");
        JSONArray recStatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray orgLogicRef = (JSONArray) jObject.get("ORGLOGICREF");
        JSONArray wfStatus = (JSONArray) jObject.get("WFSTATUS");
        JSONArray returnVat = (JSONArray) jObject.get("RETURNVAT");
        JSONArray importExpns = (JSONArray) jObject.get("IMPORTEXPNS");
        JSONArray affectCost = (JSONArray) jObject.get("AFFECTCOST");
        JSONArray addTaxRef = (JSONArray) jObject.get("ADDTAXREF");
        JSONArray distType = (JSONArray) jObject.get("DISTTYPE");        

        for (int i = 0; i < logicalRef.size(); i++) {
            items = new SrvCard(
                        Integer.parseInt(logicalRef.get(i).toString()), Short.parseShort(active.get(i).toString()),
                        Short.parseShort(cardType.get(i).toString()), code.get(i).toString(), 
                        definition.get(i).toString(), specode.get(i).toString(),
                        cyphCode.get(i).toString(), Float.parseFloat(vat.get(i).toString()),
                        Integer.parseInt(extenRef.get(i).toString()), Integer.parseInt(paymentRef.get(i).toString()), 
                        Integer.parseInt(unitSetRef.get(i).toString()), Short.parseShort(capiblockCreatedBy.get(i).toString()), 
                        capiblockCreatedDate.get(i).toString(), Short.parseShort(capiblockCreatedHour.get(i).toString()), 
                        Short.parseShort(capiblockCreatedMin.get(i).toString()), Short.parseShort(capiblockCreatedSec.get(i).toString()), 
                        Short.parseShort(capiblockModifiedBy.get(i).toString()), capiblockModifiedDate.get(i).toString(), 
                        Short.parseShort(capiblockModifiedHour.get(i).toString()), Short.parseShort(capiblockModifiedMin.get(i).toString()), 
                        Short.parseShort(capiblockModifiedSec.get(i).toString()), Short.parseShort(siteId.get(i).toString()), 
                        Short.parseShort(recStatus.get(i).toString()), Integer.parseInt(orgLogicRef.get(i).toString()), 
                        Integer.parseInt(wfStatus.get(i).toString()), Float.parseFloat(returnVat.get(i).toString()), 
                        Short.parseShort(importExpns.get(i).toString()), Short.parseShort(affectCost.get(i).toString()), 
                        Integer.parseInt(addTaxRef.get(i).toString()), Short.parseShort(distType.get(i).toString()));

            tableValue.add(items);
        }
        return tableValue;
    }
    
    public ArrayList<SrvNums> getSrvNumsArrayList(JSONObject jObject) {

        ArrayList<SrvNums> tableValue = new ArrayList<>();
        SrvNums items;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray cardRef = (JSONArray) jObject.get("CARDREF");
        JSONArray invenno = (JSONArray) jObject.get("INVENNO");
        JSONArray duration = (JSONArray) jObject.get("DURATION");
        JSONArray ordered = (JSONArray) jObject.get("ORDERED");
        JSONArray shipped = (JSONArray) jObject.get("SHIPPED");
        JSONArray lastTrDate = (JSONArray) jObject.get("LASTTRDATE");        

        for (int i = 0; i < logicalRef.size(); i++) {
            items = new SrvNums(
                        Integer.parseInt(logicalRef.get(i).toString()), Integer.parseInt(cardRef.get(i).toString()),
                        Short.parseShort(invenno.get(i).toString()), Short.parseShort(duration.get(i).toString()), 
                        Float.parseFloat(ordered.get(i).toString()), Float.parseFloat(shipped.get(i).toString()),
                        lastTrDate.get(i).toString());

            tableValue.add(items);
        }
        return tableValue;
    }
    
    public ArrayList<SrvUnitA> getSrvUnitAArrayList(JSONObject jObject) {

        ArrayList<SrvUnitA> tableValue = new ArrayList<>();
        SrvUnitA items;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray srvRef = (JSONArray) jObject.get("SRVREF");
        JSONArray lineNr = (JSONArray) jObject.get("LINENR");
        JSONArray unitLineRef = (JSONArray) jObject.get("UNITLINEREF");
        JSONArray priority = (JSONArray) jObject.get("PRIORITY");       

        for (int i = 0; i < logicalRef.size(); i++) {
            items = new SrvUnitA(
                        Integer.parseInt(logicalRef.get(i).toString()), Integer.parseInt(srvRef.get(i).toString()),
                        Short.parseShort(lineNr.get(i).toString()), Integer.parseInt(unitLineRef.get(i).toString()), 
                        Short.parseShort(priority.get(i).toString()));

            tableValue.add(items);
        }
        return tableValue;
    }
    
    public ArrayList<SrvTot> getSrvTotArrayList(JSONObject jObject) {

        ArrayList<SrvTot> tableValue = new ArrayList<>();
        SrvTot items;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray cardRef = (JSONArray) jObject.get("CARDREF");
        JSONArray invenno = (JSONArray) jObject.get("INVENNO");
        JSONArray month = (JSONArray) jObject.get("MONTH_");
        JSONArray totalsAmount = (JSONArray) jObject.get("TOTALS_AMOUNT");
        JSONArray totalsCashAmnt = (JSONArray) jObject.get("TOTALS_CASHAMNT");
        JSONArray totalsCurrAmnt = (JSONArray) jObject.get("TOTALS_CURRAMNT");
        JSONArray year = (JSONArray) jObject.get("YEAR_");

        for (int i = 0; i < logicalRef.size(); i++) {
            items = new SrvTot(
                    Integer.parseInt(logicalRef.get(i).toString()), Integer.parseInt(cardRef.get(i).toString()),
                    Short.parseShort(invenno.get(i).toString()), Short.parseShort(month.get(i).toString()),
                    Float.parseFloat(totalsAmount.get(i).toString()),
                    Float.parseFloat(totalsCashAmnt.get(i).toString()), Float.parseFloat(totalsCurrAmnt.get(i).toString()),
                    Short.parseShort(year.get(i).toString()));

            tableValue.add(items);
        }
        return tableValue;
    }
}

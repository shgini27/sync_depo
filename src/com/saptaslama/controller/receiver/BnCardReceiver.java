/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.receiver;

import com.saptaslama.controller.sender.Sender;
import com.saptaslama.model.BankAcc;
import com.saptaslama.model.BnCard;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class BnCardReceiver extends Sender{
    public ArrayList<BnCard> getBnCardArrayList(JSONObject jObject) {

        ArrayList<BnCard> tableValue = new ArrayList<>();
        BnCard items;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray active = (JSONArray) jObject.get("ACTIVE");
        JSONArray code = (JSONArray) jObject.get("CODE");
        JSONArray definition = (JSONArray) jObject.get("DEFINITION_");
        JSONArray branch = (JSONArray) jObject.get("BRANCH");
        JSONArray specode = (JSONArray) jObject.get("SPECODE");
        JSONArray cyphCode = (JSONArray) jObject.get("CYPHCODE");
        JSONArray branchNo = (JSONArray) jObject.get("BRANCHNO");
        JSONArray addr1 = (JSONArray) jObject.get("ADDR1");
        JSONArray addr2 = (JSONArray) jObject.get("ADDR2");
        JSONArray city = (JSONArray) jObject.get("CITY");
        JSONArray country = (JSONArray) jObject.get("COUNTRY");
        JSONArray postCode = (JSONArray) jObject.get("POSTCODE");
        JSONArray telNrs1 = (JSONArray) jObject.get("TELNRS1");
        JSONArray telNrs2 = (JSONArray) jObject.get("TELNRS2");
        JSONArray faxNr = (JSONArray) jObject.get("FAXNR");
        JSONArray incharge = (JSONArray) jObject.get("INCHARGE");
        JSONArray emailAddr = (JSONArray) jObject.get("EMAILADDR");
        JSONArray webAddr = (JSONArray) jObject.get("WEBADDR");
        JSONArray textInc = (JSONArray) jObject.get("TEXTINC");
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
        JSONArray siteId = (JSONArray) jObject.get("SITEID");
        JSONArray recStatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray orgLogicRef = (JSONArray) jObject.get("ORGLOGICREF");
        JSONArray wfStatus = (JSONArray) jObject.get("WFSTATUS");
        JSONArray cntryCode = (JSONArray) jObject.get("CNTRYCODE");
        JSONArray town = (JSONArray) jObject.get("TOWN");
        JSONArray district = (JSONArray) jObject.get("DISTRICT");

        for (int i = 0; i < logicalRef.size(); i++) {
            items = new BnCard(
                        Integer.parseInt(logicalRef.get(i).toString()), Short.parseShort(active.get(i).toString()),
                        code.get(i).toString(), definition.get(i).toString(), 
                        branch.get(i).toString(), specode.get(i).toString(),
                        cyphCode.get(i).toString(), branchNo.get(i).toString(),
                        addr1.get(i).toString(), addr2.get(i).toString(), 
                        city.get(i).toString(), country.get(i).toString(), 
                        postCode.get(i).toString(), telNrs1.get(i).toString(), 
                        telNrs2.get(i).toString(), faxNr.get(i).toString(), 
                        incharge.get(i).toString(), emailAddr.get(i).toString(), 
                        webAddr.get(i).toString(), Short.parseShort(textInc.get(i).toString()), 
                        Short.parseShort(capiblockCreatedby.get(i).toString()), capiblockCreadeddate.get(i).toString(), 
                        Short.parseShort(capiblockCreatedhour.get(i).toString()), Short.parseShort(capiblockCreatedmin.get(i).toString()), 
                        Short.parseShort(capiblockCreatedsec.get(i).toString()), Short.parseShort(capiblockModifiedby.get(i).toString()), 
                        capiblockModifieddate.get(i).toString(), Short.parseShort(capiblockModifiedhour.get(i).toString()), 
                        Short.parseShort(capiblockModifiedmin.get(i).toString()), Short.parseShort(capiblockModifiedsec.get(i).toString()), 
                        Short.parseShort(siteId.get(i).toString()), Short.parseShort(recStatus.get(i).toString()), 
                        Integer.parseInt(orgLogicRef.get(i).toString()), Integer.parseInt(wfStatus.get(i).toString()), 
                        cntryCode.get(i).toString(), town.get(i).toString(), district.get(i).toString());

            tableValue.add(items);
        }
        return tableValue;
    }
    
    public ArrayList<BankAcc> getBankAccArrayList(JSONObject jObject) {

        ArrayList<BankAcc> tableValue = new ArrayList<>();
        BankAcc items;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray cardType = (JSONArray) jObject.get("CARDTYPE");
        JSONArray code = (JSONArray) jObject.get("CODE");
        JSONArray definition = (JSONArray) jObject.get("DEFINITION_");
        JSONArray specode = (JSONArray) jObject.get("SPECODE");
        JSONArray cyphCode = (JSONArray) jObject.get("CYPHCODE");
        JSONArray bankRef = (JSONArray) jObject.get("BANKREF");
        JSONArray checkMargin = (JSONArray) jObject.get("CHECKMARGIN");
        JSONArray noteMargin = (JSONArray) jObject.get("NOTEMARGIN");
        JSONArray checkLimit = (JSONArray) jObject.get("CHECKLIMIT");
        JSONArray noteLimit = (JSONArray) jObject.get("NOTELIMIT");
        JSONArray custInterest = (JSONArray) jObject.get("CUSTINTEREST");
        JSONArray skInterest = (JSONArray) jObject.get("SKINTEREST");
        JSONArray ckInterest = (JSONArray) jObject.get("CKINTEREST");
        JSONArray stopajper = (JSONArray) jObject.get("STOPAJPER");
        JSONArray fonper = (JSONArray) jObject.get("FONPER");
        JSONArray currency = (JSONArray) jObject.get("CURRENCY");
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
        JSONArray accountNo = (JSONArray) jObject.get("ACCOUNTNO");
        JSONArray textInc = (JSONArray) jObject.get("TEXTINC");
        JSONArray siteId = (JSONArray) jObject.get("SITEID");
        JSONArray recStatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray orgLogicRef = (JSONArray) jObject.get("ORGLOGICREF");
        JSONArray wfStatus = (JSONArray) jObject.get("WFSTATUS");
        JSONArray kkUsage = (JSONArray) jObject.get("KKUSAGE");
        JSONArray collatRlLimit = (JSONArray) jObject.get("COLLATRLLIMIT");
        JSONArray curRateType = (JSONArray) jObject.get("CURRATETYPE");
        JSONArray wthcltrlInterest = (JSONArray) jObject.get("WTHCLTRLINTEREST");
        JSONArray wthcltrlLimit = (JSONArray) jObject.get("WTHCLTRLLIMIT");

        for (int i = 0; i < logicalRef.size(); i++) {
            items = new BankAcc(
                        Integer.parseInt(logicalRef.get(i).toString()), Short.parseShort(cardType.get(i).toString()),
                        code.get(i).toString(), definition.get(i).toString(), 
                        specode.get(i).toString(), cyphCode.get(i).toString(),
                        Integer.parseInt(bankRef.get(i).toString()), Float.parseFloat(checkMargin.get(i).toString()),
                        Float.parseFloat(noteMargin.get(i).toString()), Float.parseFloat(checkLimit.get(i).toString()), 
                        Float.parseFloat(noteLimit.get(i).toString()), Float.parseFloat(custInterest.get(i).toString()), 
                        Float.parseFloat(skInterest.get(i).toString()), Float.parseFloat(ckInterest.get(i).toString()), 
                        Float.parseFloat(stopajper.get(i).toString()), Float.parseFloat(fonper.get(i).toString()), 
                        Short.parseShort(currency.get(i).toString()), Integer.parseInt(extenRef.get(i).toString()), 
                        Short.parseShort(capiblockCreatedby.get(i).toString()), capiblockCreadeddate.get(i).toString(), 
                        Short.parseShort(capiblockCreatedhour.get(i).toString()), Short.parseShort(capiblockCreatedmin.get(i).toString()), 
                        Short.parseShort(capiblockCreatedsec.get(i).toString()), Short.parseShort(capiblockModifiedby.get(i).toString()), 
                        capiblockModifieddate.get(i).toString(), Short.parseShort(capiblockModifiedhour.get(i).toString()), 
                        Short.parseShort(capiblockModifiedmin.get(i).toString()), Short.parseShort(capiblockModifiedsec.get(i).toString()), 
                        Short.parseShort(active.get(i).toString()), accountNo.get(i).toString(), 
                        Short.parseShort(textInc.get(i).toString()), Short.parseShort(siteId.get(i).toString()), 
                        Short.parseShort(recStatus.get(i).toString()), Integer.parseInt(orgLogicRef.get(i).toString()), 
                        Integer.parseInt(wfStatus.get(i).toString()), Short.parseShort(kkUsage.get(i).toString()), 
                        Float.parseFloat(collatRlLimit.get(i).toString()), Short.parseShort(curRateType.get(i).toString()), 
                        Float.parseFloat(wthcltrlInterest.get(i).toString()), Float.parseFloat(wthcltrlLimit.get(i).toString()));

            tableValue.add(items);
        }
        return tableValue;
    }
}

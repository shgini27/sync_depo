/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.receiver;

import com.saptaslama.controller.sender.Sender;
import com.saptaslama.model.ClCard;
import com.saptaslama.model.ClcollatrlRisk;
import com.saptaslama.model.ClrNums;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class ClCardReceiver extends Sender{
    
    //metod to convert JsonObject to ArrayList<model>
    public ArrayList<ClCard> getClCardArrayList(JSONObject jObject) {

        ArrayList<ClCard> tableValue = new ArrayList<>();
        ClCard card;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray active = (JSONArray) jObject.get("ACTIVE");
        JSONArray cardType = (JSONArray) jObject.get("CARDTYPE");
        JSONArray code = (JSONArray) jObject.get("CODE");
        JSONArray definition = (JSONArray) jObject.get("DEFINITION_");
        JSONArray specode = (JSONArray) jObject.get("SPECODE");
        JSONArray cyphcode = (JSONArray) jObject.get("CYPHCODE");
        JSONArray addr1 = (JSONArray) jObject.get("ADDR1");
        JSONArray addr2 = (JSONArray) jObject.get("ADDR2");
        JSONArray city = (JSONArray) jObject.get("CITY");
        JSONArray country = (JSONArray) jObject.get("COUNTRY");
        JSONArray postcode = (JSONArray) jObject.get("POSTCODE");
        JSONArray telnrs1 = (JSONArray) jObject.get("TELNRS1");
        JSONArray telnrs2 = (JSONArray) jObject.get("TELNRS2");
        JSONArray faxNr = (JSONArray) jObject.get("FAXNR");
        JSONArray taxNr = (JSONArray) jObject.get("TAXNR");
        JSONArray taxOffice = (JSONArray) jObject.get("TAXOFFICE");
        JSONArray incharge = (JSONArray) jObject.get("INCHARGE");
        JSONArray discrate = (JSONArray) jObject.get("DISCRATE");
        JSONArray extenRef = (JSONArray) jObject.get("EXTENREF");
        JSONArray paymentRef = (JSONArray) jObject.get("PAYMENTREF");
        JSONArray emailAddr = (JSONArray) jObject.get("EMAILADDR");
        JSONArray webAddr = (JSONArray) jObject.get("WEBADDR");
        JSONArray warnMethod = (JSONArray) jObject.get("WARNMETHOD");
        JSONArray warnEmailAddr = (JSONArray) jObject.get("WARNEMAILADDR");
        JSONArray warnFaxNr = (JSONArray) jObject.get("WARNFAXNR");
        JSONArray clanguage = (JSONArray) jObject.get("CLANGUAGE");
        JSONArray vatNr = (JSONArray) jObject.get("VATNR");
        JSONArray blocked = (JSONArray) jObject.get("BLOCKED");
        JSONArray bankBranchs1 = (JSONArray) jObject.get("BANKBRANCHS1");
        JSONArray bankBranchs2 = (JSONArray) jObject.get("BANKBRANCHS2");
        JSONArray bankBranchs3 = (JSONArray) jObject.get("BANKBRANCHS3");
        JSONArray bankBranchs4 = (JSONArray) jObject.get("BANKBRANCHS4");
        JSONArray bankBranchs5 = (JSONArray) jObject.get("BANKBRANCHS5");
        JSONArray bankBranchs6 = (JSONArray) jObject.get("BANKBRANCHS6");
        JSONArray bankBranchs7 = (JSONArray) jObject.get("BANKBRANCHS7");
        JSONArray bankAccounts1 = (JSONArray) jObject.get("BANKACCOUNTS1");
        JSONArray bankAccounts2 = (JSONArray) jObject.get("BANKACCOUNTS2");
        JSONArray bankAccounts3 = (JSONArray) jObject.get("BANKACCOUNTS3");
        JSONArray bankAccounts4 = (JSONArray) jObject.get("BANKACCOUNTS4");
        JSONArray bankAccounts5 = (JSONArray) jObject.get("BANKACCOUNTS5");
        JSONArray bankAccounts6 = (JSONArray) jObject.get("BANKACCOUNTS6");
        JSONArray bankAccounts7 = (JSONArray) jObject.get("BANKACCOUNTS7");
        JSONArray deliveryMethod = (JSONArray) jObject.get("DELIVERYMETHOD");
        JSONArray deliveryFirm = (JSONArray) jObject.get("DELIVERYFIRM");
        JSONArray cCurrency = (JSONArray) jObject.get("CCURRENCY");
        JSONArray textInc = (JSONArray) jObject.get("TEXTINC");
        JSONArray siteId = (JSONArray) jObject.get("SITEID");
        JSONArray recStatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray orgLogRef = (JSONArray) jObject.get("ORGLOGICREF");
        JSONArray edino = (JSONArray) jObject.get("EDINO");
        JSONArray tradingGrp = (JSONArray) jObject.get("TRADINGGRP");
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
        JSONArray paymentProc = (JSONArray) jObject.get("PAYMENTPROC");
        JSONArray cratediffProc = (JSONArray) jObject.get("CRATEDIFFPROC");
        JSONArray wfStatus = (JSONArray) jObject.get("WFSTATUS");
        JSONArray ppGroupCode = (JSONArray) jObject.get("PPGROUPCODE");
        JSONArray ppGroupRef = (JSONArray) jObject.get("PPGROUPREF");
        JSONArray taxOfficeCode = (JSONArray) jObject.get("TAXOFFCODE");
        JSONArray townCode = (JSONArray) jObject.get("TOWNCODE");
        JSONArray town = (JSONArray) jObject.get("TOWN");
        JSONArray district = (JSONArray) jObject.get("DISTRICT");
        JSONArray cityCode = (JSONArray) jObject.get("CITYCODE");
        JSONArray countryCode = (JSONArray) jObject.get("COUNTRYCODE");
        JSONArray districtCode = (JSONArray) jObject.get("DISTRICTCODE");
        JSONArray ordSendMethod = (JSONArray) jObject.get("ORDSENDMETHOD");
        JSONArray ordSendEmailAddr = (JSONArray) jObject.get("ORDSENDEMAILADDR");
        JSONArray ordSendFaxNr = (JSONArray) jObject.get("ORDSENDFAXNR");
        JSONArray dspSendMethod = (JSONArray) jObject.get("DSPSENDMETHOD");
        JSONArray dspSendEmailAddr = (JSONArray) jObject.get("DSPSENDEMAILADDR");
        JSONArray dspSendFaxNr = (JSONArray) jObject.get("DSPSENDFAXNR");
        JSONArray invSendMethod = (JSONArray) jObject.get("INVSENDMETHOD");
        JSONArray invSendEmailAddr = (JSONArray) jObject.get("INVSENDEMAILADDR");
        JSONArray invSendFaxNr = (JSONArray) jObject.get("INVSENDFAXNR");
        JSONArray subscriberStat = (JSONArray) jObject.get("SUBSCRIBERSTAT");
        JSONArray subscriberExt = (JSONArray) jObject.get("SUBSCRIBEREXT");
        JSONArray autoPaidBank = (JSONArray) jObject.get("AUTOPAIDBANK");
        JSONArray paymentType = (JSONArray) jObject.get("PAYMENTTYPE");
        JSONArray lastSendRemLev = (JSONArray) jObject.get("LASTSENDREMLEV");
        JSONArray extAccessFlags = (JSONArray) jObject.get("EXTACCESSFLAGS");
        JSONArray ordSendFormat = (JSONArray) jObject.get("ORDSENDFORMAT");
        JSONArray dspSendFormat = (JSONArray) jObject.get("DSPSENDFORMAT");
        JSONArray invSendFormat = (JSONArray) jObject.get("INVSENDFORMAT");
        JSONArray remSendFormat = (JSONArray) jObject.get("REMSENDFORMAT");
        JSONArray storeCreditCardNo = (JSONArray) jObject.get("STORECREDITCARDNO");
        JSONArray clordFreq = (JSONArray) jObject.get("CLORDFREQ");
        JSONArray ordDay = (JSONArray) jObject.get("ORDDAY");
        JSONArray logoId = (JSONArray) jObject.get("LOGOID");
        JSONArray lidConfirmed = (JSONArray) jObject.get("LIDCONFIRMED");
        JSONArray expRegNo = (JSONArray) jObject.get("EXPREGNO");
        JSONArray expDocNo = (JSONArray) jObject.get("EXPDOCNO");
        JSONArray expBusTypeRef = (JSONArray) jObject.get("EXPBUSTYPREF");
        JSONArray invPrintcnt = (JSONArray) jObject.get("INVPRINTCNT");
        JSONArray pieceOrdInflict = (JSONArray) jObject.get("PIECEORDINFLICT");
        JSONArray collectionVoicing = (JSONArray) jObject.get("COLLECTINVOICING");
        JSONArray ebusDataSendType = (JSONArray) jObject.get("EBUSDATASENDTYPE");
        JSONArray inistatusFlags = (JSONArray) jObject.get("INISTATUSFLAGS");
        JSONArray slsOrderStatus = (JSONArray) jObject.get("SLSORDERSTATUS");
        JSONArray slsOrderPrice = (JSONArray) jObject.get("SLSORDERPRICE");
        JSONArray ltrSendMethod = (JSONArray) jObject.get("LTRSENDMETHOD");
        JSONArray ltrSendEmailAddr = (JSONArray) jObject.get("LTRSENDEMAILADDR");
        JSONArray ltrSendFaxNr = (JSONArray) jObject.get("LTRSENDFAXNR");
        JSONArray ltrSendFormat = (JSONArray) jObject.get("LTRSENDFORMAT");
        JSONArray imageInc = (JSONArray) jObject.get("IMAGEINC");
        JSONArray cellPhone = (JSONArray) jObject.get("CELLPHONE");
        JSONArray sameItemCodeUse = (JSONArray) jObject.get("SAMEITEMCODEUSE");
        JSONArray stateCode = (JSONArray) jObject.get("STATECODE");
        JSONArray stateName = (JSONArray) jObject.get("STATENAME");
        JSONArray wflowcrdref = (JSONArray) jObject.get("WFLOWCRDREF");
        JSONArray parentClRef = (JSONArray) jObject.get("PARENTCLREF");
        JSONArray lowlevelcodes1 = (JSONArray) jObject.get("LOWLEVELCODES1");
        JSONArray lowlevelcodes2 = (JSONArray) jObject.get("LOWLEVELCODES2");
        JSONArray lowlevelcodes3 = (JSONArray) jObject.get("LOWLEVELCODES3");
        JSONArray lowlevelcodes4 = (JSONArray) jObject.get("LOWLEVELCODES4");
        JSONArray lowlevelcodes5 = (JSONArray) jObject.get("LOWLEVELCODES5");
        JSONArray lowlevelcodes6 = (JSONArray) jObject.get("LOWLEVELCODES6");
        JSONArray lowlevelcodes7 = (JSONArray) jObject.get("LOWLEVELCODES7");
        JSONArray lowlevelcodes8 = (JSONArray) jObject.get("LOWLEVELCODES8");
        JSONArray lowlevelcodes9 = (JSONArray) jObject.get("LOWLEVELCODES9");
        JSONArray lowlevelcodes10 = (JSONArray) jObject.get("LOWLEVELCODES10");
        JSONArray telCodes1 = (JSONArray) jObject.get("TELCODES1");
        JSONArray telCodes2 = (JSONArray) jObject.get("TELCODES2");
        JSONArray taxCode = (JSONArray) jObject.get("FAXCODE");
        JSONArray salesBrws = (JSONArray) jObject.get("SALESBRWS");
        JSONArray purchBrws = (JSONArray) jObject.get("PURCHBRWS");
        JSONArray impBrws = (JSONArray) jObject.get("IMPBRWS");
        JSONArray expBrws = (JSONArray) jObject.get("EXPBRWS");
        JSONArray finBrws = (JSONArray) jObject.get("FINBRWS");
        JSONArray orgLogoId = (JSONArray) jObject.get("ORGLOGOID");
        JSONArray addToRefList = (JSONArray) jObject.get("ADDTOREFLIST");
        JSONArray textRefTr = (JSONArray) jObject.get("TEXTREFTR");
        JSONArray textRefEn = (JSONArray) jObject.get("TEXTREFEN");
        JSONArray arpQuoteInc = (JSONArray) jObject.get("ARPQUOTEINC");
        JSONArray clcrm = (JSONArray) jObject.get("CLCRM");
        JSONArray grpFirmNr = (JSONArray) jObject.get("GRPFIRMNR");
        JSONArray consCodeRef = (JSONArray) jObject.get("CONSCODEREF");
        JSONArray specode2 = (JSONArray) jObject.get("SPECODE2");
        JSONArray specode3 = (JSONArray) jObject.get("SPECODE3");
        JSONArray specode4 = (JSONArray) jObject.get("SPECODE4");
        JSONArray specode5 = (JSONArray) jObject.get("SPECODE5");
        JSONArray offSendMethod = (JSONArray) jObject.get("OFFSENDMETHOD");
        JSONArray offSendEmailAddr = (JSONArray) jObject.get("OFFSENDEMAILADDR");
        JSONArray offSendFaxNr = (JSONArray) jObject.get("OFFSENDFAXNR");
        JSONArray offSendFormat = (JSONArray) jObject.get("OFFSENDFORMAT");
        JSONArray eBankNo = (JSONArray) jObject.get("EBANKNO");
        JSONArray loanGrpCtrl = (JSONArray) jObject.get("LOANGRPCTRL");
        JSONArray bankNames1 = (JSONArray) jObject.get("BANKNAMES1");
        JSONArray bankNames2 = (JSONArray) jObject.get("BANKNAMES2");
        JSONArray bankNames3 = (JSONArray) jObject.get("BANKNAMES3");
        JSONArray bankNames4 = (JSONArray) jObject.get("BANKNAMES4");
        JSONArray bankNames5 = (JSONArray) jObject.get("BANKNAMES5");
        JSONArray bankNames6 = (JSONArray) jObject.get("BANKNAMES6");
        JSONArray bankNames7 = (JSONArray) jObject.get("BANKNAMES7");
        JSONArray ldxFirmNr = (JSONArray) jObject.get("LDXFIRMNR");

        for (int i = 0; i < logicalRef.size(); i++) {
            card = new ClCard(
                    Integer.parseInt(logicalRef.get(i).toString()), Short.parseShort(active.get(i).toString()),
                    Short.parseShort(cardType.get(i).toString()), code.get(i).toString(),
                    definition.get(i).toString(), specode.get(i).toString(),
                    cyphcode.get(i).toString(), addr1.get(i).toString(),
                    addr2.get(i).toString(), city.get(i).toString(),
                    country.get(i).toString(), postcode.get(i).toString(),
                    telnrs1.get(i).toString(), telnrs2.get(i).toString(),
                    faxNr.get(i).toString(), taxNr.get(i).toString(),
                    taxOffice.get(i).toString(), incharge.get(i).toString(),
                    Float.parseFloat(discrate.get(i).toString()), Integer.parseInt(extenRef.get(i).toString()),
                    Integer.parseInt(paymentRef.get(i).toString()), emailAddr.get(i).toString(),
                    webAddr.get(i).toString(), Short.parseShort(warnMethod.get(i).toString()),
                    warnEmailAddr.get(i).toString(), warnFaxNr.get(i).toString(),
                    Short.parseShort(clanguage.get(i).toString()), vatNr.get(i).toString(),
                    Short.parseShort(blocked.get(i).toString()), bankBranchs1.get(i).toString(),
                    bankBranchs2.get(i).toString(), bankBranchs3.get(i).toString(),
                    bankBranchs4.get(i).toString(), bankBranchs5.get(i).toString(),
                    bankBranchs6.get(i).toString(), bankBranchs7.get(i).toString(),
                    bankAccounts1.get(i).toString(), bankAccounts2.get(i).toString(),
                    bankAccounts3.get(i).toString(), bankAccounts4.get(i).toString(),
                    bankAccounts5.get(i).toString(), bankAccounts6.get(i).toString(),
                    bankAccounts7.get(i).toString(), deliveryMethod.get(i).toString(),
                    deliveryFirm.get(i).toString(), Short.parseShort(cCurrency.get(i).toString()),
                    Short.parseShort(textInc.get(i).toString()), Short.parseShort(siteId.get(i).toString()),
                    Short.parseShort(recStatus.get(i).toString()), Integer.parseInt(orgLogRef.get(i).toString()),
                    edino.get(i).toString(), tradingGrp.get(i).toString(),
                    Short.parseShort(capiblockCreatedby.get(i).toString()), capiblockCreadeddate.get(i).toString(),
                    Short.parseShort(capiblockCreatedhour.get(i).toString()), Short.parseShort(capiblockCreatedmin.get(i).toString()),
                    Short.parseShort(capiblockCreatedsec.get(i).toString()), Short.parseShort(capiblockModifiedby.get(i).toString()),
                    capiblockModifieddate.get(i).toString(), Short.parseShort(capiblockModifiedhour.get(i).toString()),
                    Short.parseShort(capiblockModifiedmin.get(i).toString()), Short.parseShort(capiblockModifiedsec.get(i).toString()),
                    Short.parseShort(paymentProc.get(i).toString()), Short.parseShort(cratediffProc.get(i).toString()),
                    Integer.parseInt(wfStatus.get(i).toString()), ppGroupCode.get(i).toString(),
                    Integer.parseInt(ppGroupRef.get(i).toString()), taxOfficeCode.get(i).toString(),
                    townCode.get(i).toString(), town.get(i).toString(),
                    district.get(i).toString(), cityCode.get(i).toString(),
                    countryCode.get(i).toString(), districtCode.get(i).toString(),
                    Short.parseShort(ordSendMethod.get(i).toString()), ordSendEmailAddr.get(i).toString(),
                    ordSendFaxNr.get(i).toString(), Short.parseShort(dspSendMethod.get(i).toString()),
                    dspSendEmailAddr.get(i).toString(), dspSendFaxNr.get(i).toString(),
                    Short.parseShort(invSendMethod.get(i).toString()), invSendEmailAddr.get(i).toString(),
                    invSendFaxNr.get(i).toString(), Short.parseShort(subscriberStat.get(i).toString()),
                    subscriberExt.get(i).toString(), autoPaidBank.get(i).toString(),
                    Short.parseShort(paymentType.get(i).toString()), Integer.parseInt(lastSendRemLev.get(i).toString()),
                    Integer.parseInt(extAccessFlags.get(i).toString()), Short.parseShort(ordSendFormat.get(i).toString()),
                    Short.parseShort(dspSendFormat.get(i).toString()), Short.parseShort(invSendFormat.get(i).toString()),
                    Short.parseShort(remSendFormat.get(i).toString()), storeCreditCardNo.get(i).toString(),
                    Short.parseShort(clordFreq.get(i).toString()), Short.parseShort(ordDay.get(i).toString()),
                    logoId.get(i).toString(), Short.parseShort(lidConfirmed.get(i).toString()),
                    expRegNo.get(i).toString(), expDocNo.get(i).toString(),
                    Integer.parseInt(expBusTypeRef.get(i).toString()), Short.parseShort(invPrintcnt.get(i).toString()),
                    Short.parseShort(pieceOrdInflict.get(i).toString()), Short.parseShort(collectionVoicing.get(i).toString()),
                    Short.parseShort(ebusDataSendType.get(i).toString()), Integer.parseInt(inistatusFlags.get(i).toString()),
                    Short.parseShort(slsOrderStatus.get(i).toString()), Short.parseShort(slsOrderPrice.get(i).toString()),
                    Short.parseShort(ltrSendMethod.get(i).toString()), ltrSendEmailAddr.get(i).toString(),
                    ltrSendFaxNr.get(i).toString(), Short.parseShort(ltrSendFormat.get(i).toString()),
                    Short.parseShort(imageInc.get(i).toString()), cellPhone.get(i).toString(),
                    Short.parseShort(sameItemCodeUse.get(i).toString()), stateCode.get(i).toString(),
                    stateName.get(i).toString(), Integer.parseInt(wflowcrdref.get(i).toString()),
                    Integer.parseInt(parentClRef.get(i).toString()), Integer.parseInt(lowlevelcodes1.get(i).toString()),
                    Integer.parseInt(lowlevelcodes2.get(i).toString()), Integer.parseInt(lowlevelcodes3.get(i).toString()),
                    Integer.parseInt(lowlevelcodes4.get(i).toString()), Integer.parseInt(lowlevelcodes5.get(i).toString()),
                    Integer.parseInt(lowlevelcodes6.get(i).toString()), Integer.parseInt(lowlevelcodes7.get(i).toString()),
                    Integer.parseInt(lowlevelcodes8.get(i).toString()), Integer.parseInt(lowlevelcodes9.get(i).toString()),
                    Integer.parseInt(lowlevelcodes10.get(i).toString()), telCodes1.get(i).toString(),
                    telCodes2.get(i).toString(), taxCode.get(i).toString(),
                    Short.parseShort(salesBrws.get(i).toString()), Short.parseShort(purchBrws.get(i).toString()),
                    Short.parseShort(impBrws.get(i).toString()), Short.parseShort(expBrws.get(i).toString()),
                    Short.parseShort(finBrws.get(i).toString()), orgLogoId.get(i).toString(), 
                    Short.parseShort(addToRefList.get(i).toString()), Short.parseShort(textRefTr.get(i).toString()), 
                    Short.parseShort(textRefEn.get(i).toString()), Short.parseShort(arpQuoteInc.get(i).toString()), 
                    Short.parseShort(clcrm.get(i).toString()), Short.parseShort(grpFirmNr.get(i).toString()), 
                    Integer.parseInt(consCodeRef.get(i).toString()), specode2.get(i).toString(), 
                    specode3.get(i).toString(), specode4.get(i).toString(), 
                    specode5.get(i).toString(), Short.parseShort(offSendMethod.get(i).toString()), 
                    offSendEmailAddr.get(i).toString(), offSendFaxNr.get(i).toString(), 
                    Short.parseShort(offSendFormat.get(i).toString()), Short.parseShort(eBankNo.get(i).toString()), 
                    Short.parseShort(loanGrpCtrl.get(i).toString()), bankNames1.get(i).toString(),
                    bankNames2.get(i).toString(), bankNames3.get(i).toString(),
                    bankNames4.get(i).toString(), bankNames5.get(i).toString(),
                    bankNames6.get(i).toString(), bankNames7.get(i).toString(), Short.parseShort(ldxFirmNr.get(i).toString()));

            tableValue.add(card);
        }
        return tableValue;
    }
    
    //*****************************CLRNUMS**************************************
    
    //metod to convert JsonObject to ArrayList<model>
    public ArrayList<ClrNums> getClrNumsArrayList(JSONObject jObject) {

        ArrayList<ClrNums> tableValue = new ArrayList<>();
        ClrNums items;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray clCardRef = (JSONArray) jObject.get("CLCARDREF");
        JSONArray riskType = (JSONArray) jObject.get("RISKTYPE");
        JSONArray riskOver = (JSONArray) jObject.get("RISKOVER");
        JSONArray ps = (JSONArray) jObject.get("PS");
        JSONArray kc = (JSONArray) jObject.get("KC");
        JSONArray riskTotal = (JSONArray) jObject.get("RISKTOTAL");
        JSONArray despRiskTotal = (JSONArray) jObject.get("DESPRISKTOTAL");
        JSONArray riskLimit = (JSONArray) jObject.get("RISKLIMIT");
        JSONArray riskBalanced = (JSONArray) jObject.get("RISKBALANCED");
        JSONArray cekRsikFactor = (JSONArray) jObject.get("CEKRISKFACTOR");
        JSONArray senetRsikFactor = (JSONArray) jObject.get("SENETRISKFACTOR");
        JSONArray cek0Debit = (JSONArray) jObject.get("CEK0_DEBIT");
        JSONArray cek0Credit = (JSONArray) jObject.get("CEK0_CREDIT");
        JSONArray cek1Debit = (JSONArray) jObject.get("CEK1_DEBIT");
        JSONArray cek1Credit = (JSONArray) jObject.get("CEK1_CREDIT");
        JSONArray senet0Debit = (JSONArray) jObject.get("SENET0_DEBIT");
        JSONArray senet0Credit = (JSONArray) jObject.get("SENET0_CREDIT");
        JSONArray senet1Debit = (JSONArray) jObject.get("SENET1_DEBIT");
        JSONArray senet1Credit = (JSONArray) jObject.get("SENET1_CREDIT");
        JSONArray cekCurr0Debit = (JSONArray) jObject.get("CEKCURR0_DEBIT");
        JSONArray cekCurr0Credit = (JSONArray) jObject.get("CEKCURR0_CREDIT");
        JSONArray cekCurr1Debit = (JSONArray) jObject.get("CEKCURR1_DEBIT");
        JSONArray cekCurr1Credit = (JSONArray) jObject.get("CEKCURR1_CREDIT");
        JSONArray senetCurr0Debit = (JSONArray) jObject.get("SENETCURR0_DEBIT");
        JSONArray senetCurr0Credit = (JSONArray) jObject.get("SENETCURR0_CREDIT");
        JSONArray senetCurr1Debit = (JSONArray) jObject.get("SENETCURR1_DEBIT");
        JSONArray senetCurr1Credit = (JSONArray) jObject.get("SENETCURR1_CREDIT");
        JSONArray ordRiskOver = (JSONArray) jObject.get("ORDRISKOVER");
        JSONArray despRiskOver = (JSONArray) jObject.get("DESPRISKOVER");
        JSONArray userEpRisk = (JSONArray) jObject.get("USEREPRISK");
        JSONArray repRiskTotal = (JSONArray) jObject.get("REPRISKTOTAL");
        JSONArray repDepRiskTotal = (JSONArray) jObject.get("REPDESPRISKTOTAL");
        JSONArray repRiskLimit = (JSONArray) jObject.get("REPRISKLIMIT");
        JSONArray repRiskBalanced = (JSONArray) jObject.get("REPRISKBALANCED");
        JSONArray repps = (JSONArray) jObject.get("REPPS");
        JSONArray repkc = (JSONArray) jObject.get("REPKC");
        JSONArray ordRiskTotal = (JSONArray) jObject.get("ORDRISKTOTAL");
        JSONArray ordRiskTotalSugg = (JSONArray) jObject.get("ORDRISKTOTALSUGG");
        JSONArray repOrdRiskTotal = (JSONArray) jObject.get("REPORDRISKTOTAL");
        JSONArray repOrdRiskTotalSugg = (JSONArray) jObject.get("REPORDRISKTOTALSUGG");
        JSONArray riskType1 = (JSONArray) jObject.get("RISKTYPES1");
        JSONArray riskType2 = (JSONArray) jObject.get("RISKTYPES2");
        JSONArray riskType3 = (JSONArray) jObject.get("RISKTYPES3");
        JSONArray riskType4 = (JSONArray) jObject.get("RISKTYPES4");
        JSONArray riskType5 = (JSONArray) jObject.get("RISKTYPES5");
        JSONArray riskType6 = (JSONArray) jObject.get("RISKTYPES6");
        JSONArray riskType7 = (JSONArray) jObject.get("RISKTYPES7");
        JSONArray riskType8 = (JSONArray) jObject.get("RISKTYPES8");
        JSONArray riskType9 = (JSONArray) jObject.get("RISKTYPES9");
        JSONArray riskType10 = (JSONArray) jObject.get("RISKTYPES10");
        JSONArray riskType11 = (JSONArray) jObject.get("RISKTYPES11");
        JSONArray riskType12 = (JSONArray) jObject.get("RISKTYPES12");
        JSONArray riskType13 = (JSONArray) jObject.get("RISKTYPES13");
        JSONArray riskType14 = (JSONArray) jObject.get("RISKTYPES14");
        JSONArray riskType15 = (JSONArray) jObject.get("RISKTYPES15");
        JSONArray cstcekRiskFactor = (JSONArray) jObject.get("CSTCEKRISKFACTOR");
        JSONArray cstSenetRiskFactor = (JSONArray) jObject.get("CSTSENETRISKFACTOR");
        JSONArray riskGrpControl = (JSONArray) jObject.get("RISKGRPCONTROL");
        JSONArray accRiskOver = (JSONArray) jObject.get("ACCRISKOVER");
        JSONArray cstcsRiskOver = (JSONArray) jObject.get("CSTCSRISKOVER");
        JSONArray mycsRiskOver = (JSONArray) jObject.get("MYCSRISKOVER");
        JSONArray riskCtrlType = (JSONArray) jObject.get("RISKCTRLTYPE");
        JSONArray accRiskTotal = (JSONArray) jObject.get("ACCRISKTOTAL");
        JSONArray repAccRiskTotal = (JSONArray) jObject.get("REPACCRISKTOTAL");
        JSONArray cstcsRiskTotal = (JSONArray) jObject.get("CSTCSRISKTOTAL");
        JSONArray repCstcsRiskTotal = (JSONArray) jObject.get("REPCSTCSRISKTOTAL");
        JSONArray mycsRiskTotal = (JSONArray) jObject.get("MYCSRISKTOTAL");
        JSONArray repMycsRiskTotal = (JSONArray) jObject.get("REPMYCSRISKTOTAL");
        JSONArray accRiskLimit = (JSONArray) jObject.get("ACCRISKLIMIT");
        JSONArray repAccRiskLimit = (JSONArray) jObject.get("REPACCRISKLIMIT");
        JSONArray cstcsRiskLimit = (JSONArray) jObject.get("CSTCSRISKLIMIT");
        JSONArray repCstcsRiskLimit = (JSONArray) jObject.get("REPCSTCSRISKLIMIT");
        JSONArray mycsRiskLimit = (JSONArray) jObject.get("MYCSRISKLIMIT");
        JSONArray repMycsRiskLimit = (JSONArray) jObject.get("REPMYCSRISKLIMIT");
        JSONArray despRiskLimit = (JSONArray) jObject.get("DESPRISKLIMIT");
        JSONArray repDespRiskLimit = (JSONArray) jObject.get("REPDESPRISKLIMIT");
        JSONArray ordRiskLimit = (JSONArray) jObject.get("ORDRISKLIMIT");
        JSONArray repOrdRiskLimit = (JSONArray) jObject.get("REPORDRISKLIMIT");
        JSONArray ordRiskLimitSugg = (JSONArray) jObject.get("ORDRISKLIMITSUGG");
        JSONArray repOrdRiskLimitSugg = (JSONArray) jObject.get("REPORDRISKLIMITSUGG");
        JSONArray accRskBlnced = (JSONArray) jObject.get("ACCRSKBLNCED");
        JSONArray repaAcRskBlnced = (JSONArray) jObject.get("REPACCRSKBLNCED");
        JSONArray cstcsRskBlnced = (JSONArray) jObject.get("CSTCSRSKBLNCED");
        JSONArray repcstcsRskBlnced = (JSONArray) jObject.get("REPCSTCSRSKBLNCED");
        JSONArray mycsRskBlnced = (JSONArray) jObject.get("MYCSRSKBLNCED");
        JSONArray repmycsRskBlnced = (JSONArray) jObject.get("REPMYCSRSKBLNCED");
        JSONArray despRskBlnced = (JSONArray) jObject.get("DESPRSKBLNCED");
        JSONArray repdespRskBlnced = (JSONArray) jObject.get("REPDESPRSKBLNCED");
        JSONArray ordRskBlnced = (JSONArray) jObject.get("ORDRSKBLNCED");
        JSONArray repordRskBlnced = (JSONArray) jObject.get("REPORDRSKBLNCED");
        JSONArray ordRskBlncedSugg = (JSONArray) jObject.get("ORDRSKBLNCEDSUG");
        JSONArray repordRskBlncedSugg = (JSONArray) jObject.get("REPORDRSKBLNCEDSUG");

        for (int i = 0; i < logicalRef.size(); i++) {
            items = new ClrNums(
                        Integer.parseInt(logicalRef.get(i).toString()), Integer.parseInt(clCardRef.get(i).toString()),
                        Short.parseShort(riskType.get(i).toString()), Short.parseShort(riskOver.get(i).toString()), 
                        Float.parseFloat(ps.get(i).toString()), Float.parseFloat(kc.get(i).toString()),
                        Float.parseFloat(riskTotal.get(i).toString()), Float.parseFloat(despRiskTotal.get(i).toString()),
                        Float.parseFloat(riskLimit.get(i).toString()), Float.parseFloat(riskBalanced.get(i).toString()), 
                        Float.parseFloat(cekRsikFactor.get(i).toString()), Float.parseFloat(senetRsikFactor.get(i).toString()), 
                        Float.parseFloat(cek0Debit.get(i).toString()), Float.parseFloat(cek0Credit.get(i).toString()), 
                        Float.parseFloat(cek1Debit.get(i).toString()), Float.parseFloat(cek1Credit.get(i).toString()), 
                        Float.parseFloat(senet0Debit.get(i).toString()), Float.parseFloat(senet0Credit.get(i).toString()), 
                        Float.parseFloat(senet1Debit.get(i).toString()), Float.parseFloat(senet1Credit.get(i).toString()), 
                        Float.parseFloat(cekCurr0Debit.get(i).toString()), Float.parseFloat(cekCurr0Credit.get(i).toString()), 
                        Float.parseFloat(cekCurr1Debit.get(i).toString()), Float.parseFloat(cekCurr1Credit.get(i).toString()), 
                        Float.parseFloat(senetCurr0Debit.get(i).toString()), Float.parseFloat(senetCurr0Credit.get(i).toString()), 
                        Float.parseFloat(senetCurr1Debit.get(i).toString()), Float.parseFloat(senetCurr1Credit.get(i).toString()), 
                        Short.parseShort(ordRiskOver.get(i).toString()), Short.parseShort(despRiskOver.get(i).toString()), 
                        Short.parseShort(userEpRisk.get(i).toString()), Float.parseFloat(repRiskTotal.get(i).toString()), 
                        Float.parseFloat(repDepRiskTotal.get(i).toString()), Float.parseFloat(repRiskLimit.get(i).toString()), 
                        Float.parseFloat(repRiskBalanced.get(i).toString()), Float.parseFloat(repps.get(i).toString()), 
                        Float.parseFloat(repkc.get(i).toString()), Float.parseFloat(ordRiskTotal.get(i).toString()), 
                        Float.parseFloat(ordRiskTotalSugg.get(i).toString()), Float.parseFloat(repOrdRiskTotal.get(i).toString()), 
                        Float.parseFloat(repOrdRiskTotalSugg.get(i).toString()), Short.parseShort(riskType1.get(i).toString()), 
                        Short.parseShort(riskType2.get(i).toString()), Short.parseShort(riskType3.get(i).toString()), 
                        Short.parseShort(riskType4.get(i).toString()), Short.parseShort(riskType5.get(i).toString()), 
                        Short.parseShort(riskType6.get(i).toString()), Short.parseShort(riskType7.get(i).toString()), 
                        Short.parseShort(riskType8.get(i).toString()), Short.parseShort(riskType9.get(i).toString()), 
                        Short.parseShort(riskType10.get(i).toString()), Short.parseShort(riskType11.get(i).toString()), 
                        Short.parseShort(riskType12.get(i).toString()), Short.parseShort(riskType13.get(i).toString()), 
                        Short.parseShort(riskType14.get(i).toString()), Short.parseShort(riskType15.get(i).toString()), 
                        Float.parseFloat(cstcekRiskFactor.get(i).toString()), Float.parseFloat(cstSenetRiskFactor.get(i).toString()), 
                        Short.parseShort(riskGrpControl.get(i).toString()), Short.parseShort(accRiskOver.get(i).toString()), 
                        Short.parseShort(cstcsRiskOver.get(i).toString()), Short.parseShort(mycsRiskOver.get(i).toString()), 
                        Short.parseShort(riskCtrlType.get(i).toString()), Float.parseFloat(accRiskTotal.get(i).toString()), 
                        Float.parseFloat(repAccRiskTotal.get(i).toString()), Float.parseFloat(cstcsRiskTotal.get(i).toString()), 
                        Float.parseFloat(repCstcsRiskTotal.get(i).toString()), Float.parseFloat(mycsRiskTotal.get(i).toString()), 
                        Float.parseFloat(repMycsRiskTotal.get(i).toString()), Float.parseFloat(accRiskLimit.get(i).toString()), 
                        Float.parseFloat(repAccRiskLimit.get(i).toString()), Float.parseFloat(cstcsRiskLimit.get(i).toString()), 
                        Float.parseFloat(repCstcsRiskLimit.get(i).toString()), Float.parseFloat(mycsRiskLimit.get(i).toString()), 
                        Float.parseFloat(repMycsRiskLimit.get(i).toString()), Float.parseFloat(despRiskLimit.get(i).toString()), 
                        Float.parseFloat(repDespRiskLimit.get(i).toString()), Float.parseFloat(ordRiskLimit.get(i).toString()), 
                        Float.parseFloat(repOrdRiskLimit.get(i).toString()), Float.parseFloat(ordRiskLimitSugg.get(i).toString()), 
                        Float.parseFloat(repOrdRiskLimitSugg.get(i).toString()), Float.parseFloat(accRskBlnced.get(i).toString()), 
                        Float.parseFloat(repaAcRskBlnced.get(i).toString()), Float.parseFloat(cstcsRskBlnced.get(i).toString()), 
                        Float.parseFloat(repcstcsRskBlnced.get(i).toString()), Float.parseFloat(mycsRskBlnced.get(i).toString()), 
                        Float.parseFloat(repmycsRskBlnced.get(i).toString()), Float.parseFloat(despRskBlnced.get(i).toString()), 
                        Float.parseFloat(repdespRskBlnced.get(i).toString()), Float.parseFloat(ordRskBlnced.get(i).toString()), 
                        Float.parseFloat(repordRskBlnced.get(i).toString()), Float.parseFloat(ordRskBlncedSugg.get(i).toString()), 
                        Float.parseFloat(repordRskBlncedSugg.get(i).toString()));

            tableValue.add(items);
        }
        return tableValue;
    }
    
    //***************************CLCOLLATRLRISK*********************************
    
    //metod to convert JsonObject to ArrayList<model>
    public ArrayList<ClcollatrlRisk> getClcollatrlRiskArrayList(JSONObject jObject) {

        ArrayList<ClcollatrlRisk> tableValue = new ArrayList<>();
        ClcollatrlRisk items;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray clCardRef = (JSONArray) jObject.get("CLCARDREF");
        JSONArray riskType = (JSONArray) jObject.get("RISKTYPE");
        JSONArray riskOver = (JSONArray) jObject.get("RISKOVER");
        JSONArray ordRiskOver = (JSONArray) jObject.get("ORDRISKOVER");
        JSONArray despRiskOver = (JSONArray) jObject.get("DESPRISKOVER");
        JSONArray userEpRisk = (JSONArray) jObject.get("USEREPRISK");
        JSONArray pcollatrlTotal = (JSONArray) jObject.get("PCOLLATRLTOTAL");
        JSONArray repPcollatrlTotal = (JSONArray) jObject.get("REPPCOLLATRLTOTAL");
        JSONArray scollatrlTotal = (JSONArray) jObject.get("SCOLLATRLTOTAL");
        JSONArray repscollatrlTotal = (JSONArray) jObject.get("REPSCOLLATRLTOTAL");
        JSONArray riskTotal = (JSONArray) jObject.get("RISKTOTAL");
        JSONArray repRiskTotal = (JSONArray) jObject.get("REPRISKTOTAL");
        JSONArray despRiskTotal = (JSONArray) jObject.get("DESPRISKTOTAL");
        JSONArray repDespRiskTotal = (JSONArray) jObject.get("REPDESPRISKTOTAL");
        JSONArray riskLimit = (JSONArray) jObject.get("RISKLIMIT");
        JSONArray repRiskLimit = (JSONArray) jObject.get("REPRISKLIMIT");
        JSONArray riskBalanced = (JSONArray) jObject.get("RISKBALANCED");
        JSONArray repRiskBalanced = (JSONArray) jObject.get("REPRISKBALANCED");
        JSONArray ordRiskTotal = (JSONArray) jObject.get("ORDRISKTOTAL");
        JSONArray repOrdRiskTotal = (JSONArray) jObject.get("REPORDRISKTOTAL");
        JSONArray ordRiskTotalSugg = (JSONArray) jObject.get("ORDRISKTOTALSUGG");
        JSONArray repOrdRiskTotalSugg = (JSONArray) jObject.get("REPORDRISKTOTALSUGG");
        

        for (int i = 0; i < logicalRef.size(); i++) {
            items = new ClcollatrlRisk(
                        Integer.parseInt(logicalRef.get(i).toString()), Integer.parseInt(clCardRef.get(i).toString()),
                        Short.parseShort(riskType.get(i).toString()), Short.parseShort(riskOver.get(i).toString()), 
                        Short.parseShort(ordRiskOver.get(i).toString()), Short.parseShort(despRiskOver.get(i).toString()),
                        Short.parseShort(userEpRisk.get(i).toString()), Float.parseFloat(pcollatrlTotal.get(i).toString()),
                        Float.parseFloat(repPcollatrlTotal.get(i).toString()), Float.parseFloat(scollatrlTotal.get(i).toString()), 
                        Float.parseFloat(repscollatrlTotal.get(i).toString()), Float.parseFloat(riskTotal.get(i).toString()), 
                        Float.parseFloat(repRiskTotal.get(i).toString()), Float.parseFloat(despRiskTotal.get(i).toString()), 
                        Float.parseFloat(repDespRiskTotal.get(i).toString()), Float.parseFloat(riskLimit.get(i).toString()), 
                        Float.parseFloat(repRiskLimit.get(i).toString()), Float.parseFloat(riskBalanced.get(i).toString()), 
                        Float.parseFloat(repRiskBalanced.get(i).toString()), Float.parseFloat(ordRiskTotal.get(i).toString()), 
                        Float.parseFloat(repOrdRiskTotal.get(i).toString()), Float.parseFloat(ordRiskTotalSugg.get(i).toString()), 
                        Float.parseFloat(repOrdRiskTotalSugg.get(i).toString()));

            tableValue.add(items);
        }
        return tableValue;
    }
}

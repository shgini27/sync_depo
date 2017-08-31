/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sender.cards;

import com.saptaslama.controller.CompanyConstants;
import com.saptaslama.controller.DbConnection;
import com.saptaslama.controller.sender.Sender;
import com.saptaslama.model.ClCard;
import com.saptaslama.model.ClcollatrlRisk;
import com.saptaslama.model.ClrNums;
import com.saptaslama.model.JsonObject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;

/**
 *
 * @author Shagy
 */
public class ClCardSender extends Sender {

    //**************************INITIALIZER**********************************
    public void init() {
        DbConnection db;
        Connection con;
        ResultSet resultSetClCard, resultSetClrNums, resultSetClCollatRlRisk;

        String tabelNameClCard = CompanyConstants.COMPANY + "CLCARD";
        String tabelNameClrNums = CompanyConstants.COMPANY + CompanyConstants.SUBCOMPANY + "CLRNUMS";
        String tabelNameClcollatrlRisk = CompanyConstants.COMPANY + CompanyConstants.SUBCOMPANY + "CLCOLLATRLRISK";

        String fileNameClCard = "ClCard.json";
        String fileNameClrNums = "ClrNums.json";
        String fileNameClcollatrlRisk = "ClcollatRlRist.json";
        
        /*
        SELECT * FROM LG_007_CLCARD 
            WHERE LOGICALREF !=1 AND CAPIBLOCK_CREADEDDATE BETWEEN 
                '2017-02-01 00:00:00.000' AND '2017-03-01 00:00:00.000' 
		OR CAPIBLOCK_MODIFIEDDATE BETWEEN '2017-02-01 00:00:00.000' AND 
                '2017-03-01 00:00:00.000'

        SELECT * FROM LG_007_01_CLRNUMS 
            WHERE CLCARDREF IN (SELECT LOGICALREF FROM LG_007_CLCARD 
                                    WHERE LOGICALREF !=1 AND CAPIBLOCK_CREADEDDATE 
                                        BETWEEN '2017-02-01 00:00:00.000' 
                                        AND '2017-03-01 00:00:00.000' OR CAPIBLOCK_MODIFIEDDATE 
                                        BETWEEN '2017-02-01 00:00:00.000' 
                                        AND '2017-03-01 00:00:00.000')
        
        SELECT * FROM LG_007_01_CLCOLLATRLRISK 
            WHERE CLCARDREF IN(SELECT LOGICALREF FROM LG_007_CLCARD 
                                    WHERE LOGICALREF !=1 AND CAPIBLOCK_CREADEDDATE 
                                        BETWEEN '2017-02-01 00:00:00.000' 
                                        AND '2017-03-01 00:00:00.000' OR CAPIBLOCK_MODIFIEDDATE 
                                        BETWEEN '2017-02-01 00:00:00.000' 
                                        AND '2017-03-01 00:00:00.000')
        */

        db = new DbConnection();
        con = db.getConnection();
        resultSetClCard = db.querySelectStatement(con, tabelNameClCard, "LOGICALREF != 1");
        resultSetClrNums = db.querySelectAll(con, tabelNameClrNums);
        resultSetClCollatRlRisk = db.querySelectAll(con, tabelNameClcollatrlRisk);

        sendJsonFile(getClCardJson(getClCardArrayList(resultSetClCard)), 
                CompanyConstants.FILE_PATH_SEND + fileNameClCard);
        
        sendJsonFile(getClrNumsJson(getClrNumsArrayList(resultSetClrNums)), 
                CompanyConstants.FILE_PATH_SEND + fileNameClrNums);
        
        sendJsonFile(getClcollatrlRiskJson(getClcollatrlRiskArrayList(resultSetClCollatRlRisk)), 
                CompanyConstants.FILE_PATH_SEND + fileNameClcollatrlRisk);

        db.closeConnection(con);
        db.closeResultSet(resultSetClCard);
        db.closeResultSet(resultSetClrNums);
        db.closeResultSet(resultSetClCollatRlRisk);
    }

    // method to get ArrayList of CLCARD from db
    public ArrayList<ClCard> getClCardArrayList(ResultSet resultSet) {

        ArrayList<ClCard> tableValue = new ArrayList<>();
        ClCard card;

        try {
            while (resultSet.next()) {
                card = new ClCard(
                        resultSet.getInt("LOGICALREF"), resultSet.getShort("ACTIVE"),
                        resultSet.getShort("CARDTYPE"), resultSet.getString("CODE"),
                        resultSet.getString("DEFINITION_"), resultSet.getString("SPECODE"),
                        resultSet.getString("CYPHCODE"), resultSet.getString("ADDR1"),
                        resultSet.getString("ADDR2"), resultSet.getString("CITY"),
                        resultSet.getString("COUNTRY"), resultSet.getString("POSTCODE"),
                        resultSet.getString("TELNRS1"), resultSet.getString("TELNRS2"),
                        resultSet.getString("FAXNR"), resultSet.getString("TAXNR"),
                        resultSet.getString("TAXOFFICE"), resultSet.getString("INCHARGE"),
                        resultSet.getFloat("DISCRATE"), resultSet.getInt("EXTENREF"),
                        resultSet.getInt("PAYMENTREF"), resultSet.getString("EMAILADDR"),
                        resultSet.getString("WEBADDR"), resultSet.getShort("WARNMETHOD"),
                        resultSet.getString("WARNEMAILADDR"), resultSet.getString("WARNFAXNR"),
                        resultSet.getShort("CLANGUAGE"), resultSet.getString("VATNR"),
                        resultSet.getShort("BLOCKED"), resultSet.getString("BANKBRANCHS1"),
                        resultSet.getString("BANKBRANCHS2"), resultSet.getString("BANKBRANCHS3"),
                        resultSet.getString("BANKBRANCHS4"), resultSet.getString("BANKBRANCHS5"),
                        resultSet.getString("BANKBRANCHS6"), resultSet.getString("BANKBRANCHS7"),
                        resultSet.getString("BANKACCOUNTS1"), resultSet.getString("BANKACCOUNTS2"),
                        resultSet.getString("BANKACCOUNTS3"), resultSet.getString("BANKACCOUNTS4"),
                        resultSet.getString("BANKACCOUNTS5"), resultSet.getString("BANKACCOUNTS6"),
                        resultSet.getString("BANKACCOUNTS7"), resultSet.getString("DELIVERYMETHOD"),
                        resultSet.getString("DELIVERYFIRM"), resultSet.getShort("CCURRENCY"),
                        resultSet.getShort("TEXTINC"), resultSet.getShort("SITEID"),
                        resultSet.getShort("RECSTATUS"), resultSet.getInt("ORGLOGICREF"),
                        resultSet.getString("EDINO"), resultSet.getString("TRADINGGRP"),
                        resultSet.getShort("CAPIBLOCK_CREATEDBY"), resultSet.getString("CAPIBLOCK_CREADEDDATE"),
                        resultSet.getShort("CAPIBLOCK_CREATEDHOUR"), resultSet.getShort("CAPIBLOCK_CREATEDMIN"),
                        resultSet.getShort("CAPIBLOCK_CREATEDSEC"), resultSet.getShort("CAPIBLOCK_MODIFIEDBY"),
                        resultSet.getString("CAPIBLOCK_MODIFIEDDATE"), resultSet.getShort("CAPIBLOCK_MODIFIEDHOUR"),
                        resultSet.getShort("CAPIBLOCK_MODIFIEDMIN"), resultSet.getShort("CAPIBLOCK_MODIFIEDSEC"),
                        resultSet.getShort("PAYMENTPROC"), resultSet.getShort("CRATEDIFFPROC"),
                        resultSet.getInt("WFSTATUS"), resultSet.getString("PPGROUPCODE"),
                        resultSet.getInt("PPGROUPREF"), resultSet.getString("TAXOFFCODE"),
                        resultSet.getString("TOWNCODE"), resultSet.getString("TOWN"),
                        resultSet.getString("DISTRICT"), resultSet.getString("CITYCODE"),
                        resultSet.getString("COUNTRYCODE"), resultSet.getString("DISTRICTCODE"),
                        resultSet.getShort("ORDSENDMETHOD"), resultSet.getString("ORDSENDEMAILADDR"),
                        resultSet.getString("ORDSENDFAXNR"), resultSet.getShort("DSPSENDMETHOD"),
                        resultSet.getString("DSPSENDEMAILADDR"), resultSet.getString("DSPSENDFAXNR"),
                        resultSet.getShort("INVSENDMETHOD"), resultSet.getString("INVSENDEMAILADDR"),
                        resultSet.getString("INVSENDFAXNR"), resultSet.getShort("SUBSCRIBERSTAT"),
                        resultSet.getString("SUBSCRIBEREXT"), resultSet.getString("AUTOPAIDBANK"),
                        resultSet.getShort("PAYMENTTYPE"), resultSet.getInt("LASTSENDREMLEV"),
                        resultSet.getInt("EXTACCESSFLAGS"), resultSet.getShort("ORDSENDFORMAT"),
                        resultSet.getShort("DSPSENDFORMAT"), resultSet.getShort("INVSENDFORMAT"),
                        resultSet.getShort("REMSENDFORMAT"), resultSet.getString("STORECREDITCARDNO"),
                        resultSet.getShort("CLORDFREQ"), resultSet.getShort("ORDDAY"),
                        resultSet.getString("LOGOID"), resultSet.getShort("LIDCONFIRMED"),
                        resultSet.getString("EXPREGNO"), resultSet.getString("EXPDOCNO"),
                        resultSet.getInt("EXPBUSTYPREF"), resultSet.getShort("INVPRINTCNT"),
                        resultSet.getShort("PIECEORDINFLICT"), resultSet.getShort("COLLECTINVOICING"),
                        resultSet.getShort("EBUSDATASENDTYPE"), resultSet.getInt("INISTATUSFLAGS"),
                        resultSet.getShort("SLSORDERSTATUS"), resultSet.getShort("SLSORDERPRICE"),
                        resultSet.getShort("LTRSENDMETHOD"), resultSet.getString("LTRSENDEMAILADDR"),
                        resultSet.getString("LTRSENDFAXNR"), resultSet.getShort("LTRSENDFORMAT"),
                        resultSet.getShort("IMAGEINC"), resultSet.getString("CELLPHONE"),
                        resultSet.getShort("SAMEITEMCODEUSE"), resultSet.getString("STATECODE"),
                        resultSet.getString("STATENAME"), resultSet.getInt("WFLOWCRDREF"),
                        resultSet.getInt("PARENTCLREF"), resultSet.getInt("LOWLEVELCODES1"),
                        resultSet.getInt("LOWLEVELCODES2"), resultSet.getInt("LOWLEVELCODES3"),
                        resultSet.getInt("LOWLEVELCODES4"), resultSet.getInt("LOWLEVELCODES5"),
                        resultSet.getInt("LOWLEVELCODES6"), resultSet.getInt("LOWLEVELCODES7"),
                        resultSet.getInt("LOWLEVELCODES8"), resultSet.getInt("LOWLEVELCODES9"),
                        resultSet.getInt("LOWLEVELCODES10"), resultSet.getString("TELCODES1"),
                        resultSet.getString("TELCODES2"), resultSet.getString("FAXCODE"),
                        resultSet.getShort("SALESBRWS"), resultSet.getShort("PURCHBRWS"),
                        resultSet.getShort("IMPBRWS"), resultSet.getShort("EXPBRWS"),
                        resultSet.getShort("FINBRWS"), resultSet.getString("ORGLOGOID"),
                        resultSet.getShort("ADDTOREFLIST"), resultSet.getShort("TEXTREFTR"),
                        resultSet.getShort("TEXTREFEN"), resultSet.getShort("ARPQUOTEINC"),
                        resultSet.getShort("CLCRM"), resultSet.getShort("GRPFIRMNR"),
                        resultSet.getInt("CONSCODEREF"), resultSet.getString("SPECODE2"),
                        resultSet.getString("SPECODE3"), resultSet.getString("SPECODE4"),
                        resultSet.getString("SPECODE5"), resultSet.getShort("OFFSENDMETHOD"),
                        resultSet.getString("OFFSENDEMAILADDR"), resultSet.getString("OFFSENDFAXNR"),
                        resultSet.getShort("OFFSENDFORMAT"), resultSet.getShort("EBANKNO"),
                        resultSet.getShort("LOANGRPCTRL"), resultSet.getString("BANKNAMES1"),
                        resultSet.getString("BANKNAMES2"), resultSet.getString("BANKNAMES3"),
                        resultSet.getString("BANKNAMES4"), resultSet.getString("BANKNAMES5"),
                        resultSet.getString("BANKNAMES6"), resultSet.getString("BANKNAMES7"),
                        resultSet.getShort("LDXFIRMNR"));
                tableValue.add(card);
            }
            return tableValue;
        } catch (SQLException ex) {
            Logger.getLogger(ClCardSender.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
            return null;
        }
    }

    //method to convert ArrayList<model> to JsonObject
    public JsonObject getClCardJson(ArrayList<ClCard> list) {
        CompanyConstants c = new CompanyConstants();

        JsonObject jsonObject = new JsonObject();
        JSONArray logicalRef = new JSONArray();
        JSONArray active = new JSONArray();
        JSONArray cardType = new JSONArray();
        JSONArray code = new JSONArray();
        JSONArray definition = new JSONArray();
        JSONArray specode = new JSONArray();
        JSONArray cyphcode = new JSONArray();
        JSONArray addr1 = new JSONArray();
        JSONArray addr2 = new JSONArray();
        JSONArray city = new JSONArray();
        JSONArray country = new JSONArray();
        JSONArray postcode = new JSONArray();
        JSONArray telnrs1 = new JSONArray();
        JSONArray telnrs2 = new JSONArray();
        JSONArray faxNr = new JSONArray();
        JSONArray taxNr = new JSONArray();
        JSONArray taxOffice = new JSONArray();
        JSONArray incharge = new JSONArray();
        JSONArray discrate = new JSONArray();
        JSONArray extenRef = new JSONArray();
        JSONArray paymentRef = new JSONArray();
        JSONArray emailAddr = new JSONArray();
        JSONArray webAddr = new JSONArray();
        JSONArray warnMethod = new JSONArray();
        JSONArray warnEmailAddr = new JSONArray();
        JSONArray warnFaxNr = new JSONArray();
        JSONArray clanguage = new JSONArray();
        JSONArray vatNr = new JSONArray();
        JSONArray blocked = new JSONArray();
        JSONArray bankBranchs1 = new JSONArray();
        JSONArray bankBranchs2 = new JSONArray();
        JSONArray bankBranchs3 = new JSONArray();
        JSONArray bankBranchs4 = new JSONArray();
        JSONArray bankBranchs5 = new JSONArray();
        JSONArray bankBranchs6 = new JSONArray();
        JSONArray bankBranchs7 = new JSONArray();
        JSONArray bankAccounts1 = new JSONArray();
        JSONArray bankAccounts2 = new JSONArray();
        JSONArray bankAccounts3 = new JSONArray();
        JSONArray bankAccounts4 = new JSONArray();
        JSONArray bankAccounts5 = new JSONArray();
        JSONArray bankAccounts6 = new JSONArray();
        JSONArray bankAccounts7 = new JSONArray();
        JSONArray deliveryMethod = new JSONArray();
        JSONArray deliveryFirm = new JSONArray();
        JSONArray cCurrency = new JSONArray();
        JSONArray textInc = new JSONArray();
        JSONArray siteId = new JSONArray();
        JSONArray recStatus = new JSONArray();
        JSONArray orgLogRef = new JSONArray();
        JSONArray edino = new JSONArray();
        JSONArray tradingGrp = new JSONArray();
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
        JSONArray paymentProc = new JSONArray();
        JSONArray cratediffProc = new JSONArray();
        JSONArray wfStatus = new JSONArray();
        JSONArray ppGroupCode = new JSONArray();
        JSONArray ppGroupRef = new JSONArray();
        JSONArray taxOfficeCode = new JSONArray();
        JSONArray townCode = new JSONArray();
        JSONArray town = new JSONArray();
        JSONArray district = new JSONArray();
        JSONArray cityCode = new JSONArray();
        JSONArray countryCode = new JSONArray();
        JSONArray districtCode = new JSONArray();
        JSONArray ordSendMethod = new JSONArray();
        JSONArray ordSendEmailAddr = new JSONArray();
        JSONArray ordSendFaxNr = new JSONArray();
        JSONArray dspSendMethod = new JSONArray();
        JSONArray dspSendEmailAddr = new JSONArray();
        JSONArray dspSendFaxNr = new JSONArray();
        JSONArray invSendMethod = new JSONArray();
        JSONArray invSendEmailAddr = new JSONArray();
        JSONArray invSendFaxNr = new JSONArray();
        JSONArray subscriberStat = new JSONArray();
        JSONArray subscriberExt = new JSONArray();
        JSONArray autoPaidBank = new JSONArray();
        JSONArray paymentType = new JSONArray();
        JSONArray lastSendRemLev = new JSONArray();
        JSONArray extAccessFlags = new JSONArray();
        JSONArray ordSendFormat = new JSONArray();
        JSONArray dspSendFormat = new JSONArray();
        JSONArray invSendFormat = new JSONArray();
        JSONArray remSendFormat = new JSONArray();
        JSONArray storeCreditCardNo = new JSONArray();
        JSONArray clordFreq = new JSONArray();
        JSONArray ordDay = new JSONArray();
        JSONArray logoId = new JSONArray();
        JSONArray lidConfirmed = new JSONArray();
        JSONArray expRegNo = new JSONArray();
        JSONArray expDocNo = new JSONArray();
        JSONArray expBusTypeRef = new JSONArray();
        JSONArray invPrintcnt = new JSONArray();
        JSONArray pieceOrdInflict = new JSONArray();
        JSONArray collectionVoicing = new JSONArray();
        JSONArray ebusDataSendType = new JSONArray();
        JSONArray inistatusFlags = new JSONArray();
        JSONArray slsOrderStatus = new JSONArray();
        JSONArray slsOrderPrice = new JSONArray();
        JSONArray ltrSendMethod = new JSONArray();
        JSONArray ltrSendEmailAddr = new JSONArray();
        JSONArray ltrSendFaxNr = new JSONArray();
        JSONArray ltrSendFormat = new JSONArray();
        JSONArray imageInc = new JSONArray();
        JSONArray cellPhone = new JSONArray();
        JSONArray sameItemCodeUse = new JSONArray();
        JSONArray stateCode = new JSONArray();
        JSONArray stateName = new JSONArray();
        JSONArray wflowcrdref = new JSONArray();
        JSONArray parentClRef = new JSONArray();
        JSONArray lowlevelcodes1 = new JSONArray();
        JSONArray lowlevelcodes2 = new JSONArray();
        JSONArray lowlevelcodes3 = new JSONArray();
        JSONArray lowlevelcodes4 = new JSONArray();
        JSONArray lowlevelcodes5 = new JSONArray();
        JSONArray lowlevelcodes6 = new JSONArray();
        JSONArray lowlevelcodes7 = new JSONArray();
        JSONArray lowlevelcodes8 = new JSONArray();
        JSONArray lowlevelcodes9 = new JSONArray();
        JSONArray lowlevelcodes10 = new JSONArray();
        JSONArray telCodes1 = new JSONArray();
        JSONArray telCodes2 = new JSONArray();
        JSONArray taxCode = new JSONArray();
        JSONArray salesBrws = new JSONArray();
        JSONArray purchBrws = new JSONArray();
        JSONArray impBrws = new JSONArray();
        JSONArray expBrws = new JSONArray();
        JSONArray finBrws = new JSONArray();
        JSONArray orgLogoId = new JSONArray();
        JSONArray addToRefList = new JSONArray();
        JSONArray textRefTr = new JSONArray();
        JSONArray textRefEn = new JSONArray();
        JSONArray arpQuoteInc = new JSONArray();
        JSONArray clcrm = new JSONArray();
        JSONArray grpFirmNr = new JSONArray();
        JSONArray consCodeRef = new JSONArray();
        JSONArray specode2 = new JSONArray();
        JSONArray specode3 = new JSONArray();
        JSONArray specode4 = new JSONArray();
        JSONArray specode5 = new JSONArray();
        JSONArray offSendMethod = new JSONArray();
        JSONArray offSendEmailAddr = new JSONArray();
        JSONArray offSendFaxNr = new JSONArray();
        JSONArray offSendFormat = new JSONArray();
        JSONArray eBankNo = new JSONArray();
        JSONArray loanGrpCtrl = new JSONArray();
        JSONArray bankNames1 = new JSONArray();
        JSONArray bankNames2 = new JSONArray();
        JSONArray bankNames3 = new JSONArray();
        JSONArray bankNames4 = new JSONArray();
        JSONArray bankNames5 = new JSONArray();
        JSONArray bankNames6 = new JSONArray();
        JSONArray bankNames7 = new JSONArray();
        JSONArray ldxFirmNr = new JSONArray();

        for (int a = 0; a < list.size(); a++) {

            /*here we setting the specode with local logicalRef (Code should be 
            setted for depo example: 110.DE or DE.110)*/
            if (list.get(a).getTaxNr().equals("")) {
                if ((c.DEPO_CODE - list.get(a).getLogicalRef()) != 111111111) {
                    taxNr.add(a, String.valueOf(c.DEPO_CODE - list.get(a).getLogicalRef()));
                } else {
                    JOptionPane.showMessageDialog(null, "TaxNr icin logRef 111111111 sayisini asmistir!");
                }
            } else {
                taxNr.add(list.get(a).getTaxNr());
            }

            logicalRef.add(list.get(a).getLogicalRef());
            active.add(list.get(a).getActive());
            cardType.add(list.get(a).getCardType());
            code.add(list.get(a).getCode());
            definition.add(list.get(a).getDefinition());
            specode.add(list.get(a).getSpecode());
            cyphcode.add(list.get(a).getCyphcode());
            addr1.add(list.get(a).getAddr1());
            addr2.add(list.get(a).getAddr2());
            city.add(list.get(a).getCity());
            country.add(list.get(a).getCountry());
            postcode.add(list.get(a).getPostcode());
            telnrs1.add(list.get(a).getTelnrs1());
            telnrs2.add(list.get(a).getTelnrs2());
            faxNr.add(list.get(a).getFaxNr());
            taxOffice.add(list.get(a).getTaxOffice());
            incharge.add(list.get(a).getIncharge());
            discrate.add(list.get(a).getDiscrate());
            extenRef.add(list.get(a).getExtenRef());
            paymentRef.add(list.get(a).getPaymentRef());
            emailAddr.add(list.get(a).getEmailAddr());
            webAddr.add(list.get(a).getWebAddr());
            warnMethod.add(list.get(a).getWarnMethod());
            warnEmailAddr.add(list.get(a).getWarnEmailAddr());
            warnFaxNr.add(list.get(a).getWarnFaxNr());
            clanguage.add(list.get(a).getClanguage());
            vatNr.add(list.get(a).getVatNr());
            blocked.add(list.get(a).getBlocked());
            bankBranchs1.add(list.get(a).getBankBranchs1());
            bankBranchs2.add(list.get(a).getBankBranchs2());
            bankBranchs3.add(list.get(a).getBankBranchs3());
            bankBranchs4.add(list.get(a).getBankBranchs4());
            bankBranchs5.add(list.get(a).getBankBranchs5());
            bankBranchs6.add(list.get(a).getBankBranchs6());
            bankBranchs7.add(list.get(a).getBankBranchs7());
            bankAccounts1.add(list.get(a).getBankAccounts1());
            bankAccounts2.add(list.get(a).getBankAccounts2());
            bankAccounts3.add(list.get(a).getBankAccounts3());
            bankAccounts4.add(list.get(a).getBankAccounts4());
            bankAccounts5.add(list.get(a).getBankAccounts5());
            bankAccounts6.add(list.get(a).getBankAccounts6());
            bankAccounts7.add(list.get(a).getBankAccounts7());
            deliveryMethod.add(list.get(a).getDeliveryMethod());
            deliveryFirm.add(list.get(a).getDeliveryFirm());
            cCurrency.add(list.get(a).getcCurrency());
            textInc.add(list.get(a).getTextInc());
            siteId.add(list.get(a).getSiteId());
            recStatus.add(list.get(a).getRecStatus());
            orgLogRef.add(list.get(a).getOrgLogRef());
            edino.add(list.get(a).getEdino());
            tradingGrp.add(list.get(a).getTradingGrp());
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
            paymentProc.add(list.get(a).getPaymentProc());
            cratediffProc.add(list.get(a).getCratediffProc());
            wfStatus.add(list.get(a).getWfStatus());
            ppGroupCode.add(list.get(a).getPpGroupCode());
            ppGroupRef.add(list.get(a).getPpGroupRef());
            taxOfficeCode.add(list.get(a).getTaxOfficeCode());
            townCode.add(list.get(a).getTownCode());
            town.add(list.get(a).getTown());
            district.add(list.get(a).getDistrict());
            cityCode.add(list.get(a).getCityCode());
            countryCode.add(list.get(a).getCountryCode());
            districtCode.add(list.get(a).getDistrictCode());
            ordSendMethod.add(list.get(a).getOrdSendMethod());
            ordSendEmailAddr.add(list.get(a).getOrdSendEmailAddr());
            ordSendFaxNr.add(list.get(a).getOrdSendFaxNr());
            dspSendMethod.add(list.get(a).getDspSendMethod());
            dspSendEmailAddr.add(list.get(a).getDspSendEmailAddr());
            dspSendFaxNr.add(list.get(a).getDspSendFaxNr());
            invSendMethod.add(list.get(a).getInvSendMethod());
            invSendEmailAddr.add(list.get(a).getInvSendEmailAddr());
            invSendFaxNr.add(list.get(a).getInvSendFaxNr());
            subscriberStat.add(list.get(a).getSubscriberStat());
            subscriberExt.add(list.get(a).getSubscriberExt());
            autoPaidBank.add(list.get(a).getAutoPaidBank());
            paymentType.add(list.get(a).getPaymentType());
            lastSendRemLev.add(list.get(a).getLastSendRemLev());
            extAccessFlags.add(list.get(a).getExtAccessFlags());
            ordSendFormat.add(list.get(a).getOrdSendFormat());
            dspSendFormat.add(list.get(a).getDspSendFormat());
            invSendFormat.add(list.get(a).getInvSendFormat());
            remSendFormat.add(list.get(a).getRemSendFormat());
            storeCreditCardNo.add(list.get(a).getStoreCreditCardNo());
            clordFreq.add(list.get(a).getClordFreq());
            ordDay.add(list.get(a).getOrdDay());
            logoId.add(list.get(a).getLogoId());
            lidConfirmed.add(list.get(a).getLidConfirmed());
            expRegNo.add(list.get(a).getExpRegNo());
            expDocNo.add(list.get(a).getExpDocNo());
            expBusTypeRef.add(list.get(a).getExpBusTypeRef());
            invPrintcnt.add(list.get(a).getInvPrintcnt());
            pieceOrdInflict.add(list.get(a).getPieceOrdInflict());
            collectionVoicing.add(list.get(a).getCollectionVoicing());
            ebusDataSendType.add(list.get(a).getEbusDataSendType());
            inistatusFlags.add(list.get(a).getInistatusFlags());
            slsOrderStatus.add(list.get(a).getSlsOrderStatus());
            slsOrderPrice.add(list.get(a).getSlsOrderPrice());
            ltrSendMethod.add(list.get(a).getLtrSendMethod());
            ltrSendEmailAddr.add(list.get(a).getLtrSendEmailAddr());
            ltrSendFaxNr.add(list.get(a).getLtrSendFaxNr());
            ltrSendFormat.add(list.get(a).getLtrSendFormat());
            imageInc.add(list.get(a).getImageInc());
            cellPhone.add(list.get(a).getCellPhone());
            sameItemCodeUse.add(list.get(a).getSameItemCodeUse());
            stateCode.add(list.get(a).getStateCode());
            stateName.add(list.get(a).getStateName());
            wflowcrdref.add(list.get(a).getWflowcrdref());
            parentClRef.add(list.get(a).getParentClRef());
            lowlevelcodes1.add(list.get(a).getLowlevelcodes1());
            lowlevelcodes2.add(list.get(a).getLowlevelcodes2());
            lowlevelcodes3.add(list.get(a).getLowlevelcodes3());
            lowlevelcodes4.add(list.get(a).getLowlevelcodes4());
            lowlevelcodes5.add(list.get(a).getLowlevelcodes5());
            lowlevelcodes6.add(list.get(a).getLowlevelcodes6());
            lowlevelcodes7.add(list.get(a).getLowlevelcodes7());
            lowlevelcodes8.add(list.get(a).getLowlevelcodes8());
            lowlevelcodes9.add(list.get(a).getLowlevelcodes9());
            lowlevelcodes10.add(list.get(a).getLowlevelcodes10());
            telCodes1.add(list.get(a).getTelCodes1());
            telCodes2.add(list.get(a).getTelCodes2());
            taxCode.add(list.get(a).getTaxCode());
            salesBrws.add(list.get(a).getSalesBrws());
            purchBrws.add(list.get(a).getPurchBrws());
            impBrws.add(list.get(a).getImpBrws());
            expBrws.add(list.get(a).getExpBrws());
            finBrws.add(list.get(a).getFinBrws());
            orgLogoId.add(list.get(a).getOrgLogoId());
            addToRefList.add(list.get(a).getAddToRefList());
            textRefTr.add(list.get(a).getTextRefTr());
            textRefEn.add(list.get(a).getTextRefEn());
            arpQuoteInc.add(list.get(a).getArpQuoteInc());
            clcrm.add(list.get(a).getClcrm());
            grpFirmNr.add(list.get(a).getGrpFirmNr());
            consCodeRef.add(list.get(a).getConsCodeRef());
            specode2.add(list.get(a).getSpecode2());
            specode3.add(list.get(a).getSpecode3());
            specode4.add(list.get(a).getSpecode4());
            specode5.add(list.get(a).getSpecode5());
            offSendMethod.add(list.get(a).getOffSendMethod());
            offSendEmailAddr.add(list.get(a).getOffSendEmailAddr());
            offSendFaxNr.add(list.get(a).getOffSendFaxNr());
            offSendFormat.add(list.get(a).getOffSendFormat());
            eBankNo.add(list.get(a).geteBankNo());
            loanGrpCtrl.add(list.get(a).getLoanGrpCtrl());
            bankNames1.add(list.get(a).getBankNames1());
            bankNames2.add(list.get(a).getBankNames2());
            bankNames3.add(list.get(a).getBankNames3());
            bankNames4.add(list.get(a).getBankNames4());
            bankNames5.add(list.get(a).getBankNames5());
            bankNames6.add(list.get(a).getBankNames6());
            bankNames7.add(list.get(a).getBankNames7());
            ldxFirmNr.add(list.get(a).getLdxFirmNr());
        }
        jsonObject.setObject("LOGICALREF", logicalRef);
        jsonObject.setObject("ACTIVE", active);
        jsonObject.setObject("CARDTYPE", cardType);
        jsonObject.setObject("CODE", code);
        jsonObject.setObject("DEFINITION_", definition);
        jsonObject.setObject("SPECODE", specode);
        jsonObject.setObject("CYPHCODE", cyphcode);
        jsonObject.setObject("ADDR1", addr1);
        jsonObject.setObject("ADDR2", addr2);
        jsonObject.setObject("CITY", city);
        jsonObject.setObject("COUNTRY", country);
        jsonObject.setObject("POSTCODE", postcode);
        jsonObject.setObject("TELNRS1", telnrs1);
        jsonObject.setObject("TELNRS2", telnrs2);
        jsonObject.setObject("FAXNR", faxNr);
        jsonObject.setObject("TAXNR", taxNr);
        jsonObject.setObject("TAXOFFICE", taxOffice);
        jsonObject.setObject("INCHARGE", incharge);
        jsonObject.setObject("DISCRATE", discrate);
        jsonObject.setObject("EXTENREF", extenRef);
        jsonObject.setObject("PAYMENTREF", paymentRef);
        jsonObject.setObject("EMAILADDR", emailAddr);
        jsonObject.setObject("WEBADDR", webAddr);
        jsonObject.setObject("WARNMETHOD", warnMethod);
        jsonObject.setObject("WARNEMAILADDR", warnEmailAddr);
        jsonObject.setObject("WARNFAXNR", warnFaxNr);
        jsonObject.setObject("CLANGUAGE", clanguage);
        jsonObject.setObject("VATNR", vatNr);
        jsonObject.setObject("BLOCKED", blocked);
        jsonObject.setObject("BANKBRANCHS1", bankBranchs1);
        jsonObject.setObject("BANKBRANCHS2", bankBranchs2);
        jsonObject.setObject("BANKBRANCHS3", bankBranchs3);
        jsonObject.setObject("BANKBRANCHS4", bankBranchs4);
        jsonObject.setObject("BANKBRANCHS5", bankBranchs5);
        jsonObject.setObject("BANKBRANCHS6", bankBranchs6);
        jsonObject.setObject("BANKBRANCHS7", bankBranchs7);
        jsonObject.setObject("BANKACCOUNTS1", bankAccounts1);
        jsonObject.setObject("BANKACCOUNTS2", bankAccounts2);
        jsonObject.setObject("BANKACCOUNTS3", bankAccounts3);
        jsonObject.setObject("BANKACCOUNTS4", bankAccounts4);
        jsonObject.setObject("BANKACCOUNTS5", bankAccounts5);
        jsonObject.setObject("BANKACCOUNTS6", bankAccounts6);
        jsonObject.setObject("BANKACCOUNTS7", bankAccounts7);
        jsonObject.setObject("DELIVERYMETHOD", deliveryMethod);
        jsonObject.setObject("DELIVERYFIRM", deliveryFirm);
        jsonObject.setObject("CCURRENCY", cCurrency);
        jsonObject.setObject("TEXTINC", textInc);
        jsonObject.setObject("SITEID", siteId);
        jsonObject.setObject("RECSTATUS", recStatus);
        jsonObject.setObject("ORGLOGICREF", orgLogRef);
        jsonObject.setObject("EDINO", edino);
        jsonObject.setObject("TRADINGGRP", tradingGrp);
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
        jsonObject.setObject("PAYMENTPROC", paymentProc);
        jsonObject.setObject("CRATEDIFFPROC", cratediffProc);
        jsonObject.setObject("WFSTATUS", wfStatus);
        jsonObject.setObject("PPGROUPCODE", ppGroupCode);
        jsonObject.setObject("PPGROUPREF", ppGroupRef);
        jsonObject.setObject("TAXOFFCODE", taxOfficeCode);
        jsonObject.setObject("TOWNCODE", townCode);
        jsonObject.setObject("TOWN", town);
        jsonObject.setObject("DISTRICT", district);
        jsonObject.setObject("CITYCODE", cityCode);
        jsonObject.setObject("COUNTRYCODE", countryCode);
        jsonObject.setObject("DISTRICTCODE", districtCode);
        jsonObject.setObject("ORDSENDMETHOD", ordSendMethod);
        jsonObject.setObject("ORDSENDEMAILADDR", ordSendEmailAddr);
        jsonObject.setObject("ORDSENDFAXNR", ordSendFaxNr);
        jsonObject.setObject("DSPSENDMETHOD", dspSendMethod);
        jsonObject.setObject("DSPSENDEMAILADDR", dspSendEmailAddr);
        jsonObject.setObject("DSPSENDFAXNR", dspSendFaxNr);
        jsonObject.setObject("INVSENDMETHOD", invSendMethod);
        jsonObject.setObject("INVSENDEMAILADDR", invSendEmailAddr);
        jsonObject.setObject("INVSENDFAXNR", invSendFaxNr);
        jsonObject.setObject("SUBSCRIBERSTAT", subscriberStat);
        jsonObject.setObject("SUBSCRIBEREXT", subscriberExt);
        jsonObject.setObject("AUTOPAIDBANK", autoPaidBank);
        jsonObject.setObject("PAYMENTTYPE", paymentType);
        jsonObject.setObject("LASTSENDREMLEV", lastSendRemLev);
        jsonObject.setObject("EXTACCESSFLAGS", extAccessFlags);
        jsonObject.setObject("ORDSENDFORMAT", ordSendFormat);
        jsonObject.setObject("DSPSENDFORMAT", dspSendFormat);
        jsonObject.setObject("INVSENDFORMAT", invSendFormat);
        jsonObject.setObject("REMSENDFORMAT", remSendFormat);
        jsonObject.setObject("STORECREDITCARDNO", storeCreditCardNo);
        jsonObject.setObject("CLORDFREQ", clordFreq);
        jsonObject.setObject("ORDDAY", ordDay);
        jsonObject.setObject("LOGOID", logoId);
        jsonObject.setObject("LIDCONFIRMED", lidConfirmed);
        jsonObject.setObject("EXPREGNO", expRegNo);
        jsonObject.setObject("EXPDOCNO", expDocNo);
        jsonObject.setObject("EXPBUSTYPREF", expBusTypeRef);
        jsonObject.setObject("INVPRINTCNT", invPrintcnt);
        jsonObject.setObject("PIECEORDINFLICT", pieceOrdInflict);
        jsonObject.setObject("COLLECTINVOICING", collectionVoicing);
        jsonObject.setObject("EBUSDATASENDTYPE", ebusDataSendType);
        jsonObject.setObject("INISTATUSFLAGS", inistatusFlags);
        jsonObject.setObject("SLSORDERSTATUS", slsOrderStatus);
        jsonObject.setObject("SLSORDERPRICE", slsOrderPrice);
        jsonObject.setObject("LTRSENDMETHOD", ltrSendMethod);
        jsonObject.setObject("LTRSENDEMAILADDR", ltrSendEmailAddr);
        jsonObject.setObject("LTRSENDFAXNR", ltrSendFaxNr);
        jsonObject.setObject("LTRSENDFORMAT", ltrSendFormat);
        jsonObject.setObject("IMAGEINC", imageInc);
        jsonObject.setObject("CELLPHONE", cellPhone);
        jsonObject.setObject("SAMEITEMCODEUSE", sameItemCodeUse);
        jsonObject.setObject("STATECODE", stateCode);
        jsonObject.setObject("STATENAME", stateName);
        jsonObject.setObject("WFLOWCRDREF", wflowcrdref);
        jsonObject.setObject("PARENTCLREF", parentClRef);
        jsonObject.setObject("LOWLEVELCODES1", lowlevelcodes1);
        jsonObject.setObject("LOWLEVELCODES2", lowlevelcodes2);
        jsonObject.setObject("LOWLEVELCODES3", lowlevelcodes3);
        jsonObject.setObject("LOWLEVELCODES4", lowlevelcodes4);
        jsonObject.setObject("LOWLEVELCODES5", lowlevelcodes5);
        jsonObject.setObject("LOWLEVELCODES6", lowlevelcodes6);
        jsonObject.setObject("LOWLEVELCODES7", lowlevelcodes7);
        jsonObject.setObject("LOWLEVELCODES8", lowlevelcodes8);
        jsonObject.setObject("LOWLEVELCODES9", lowlevelcodes9);
        jsonObject.setObject("LOWLEVELCODES10", lowlevelcodes10);
        jsonObject.setObject("TELCODES1", telCodes1);
        jsonObject.setObject("TELCODES2", telCodes2);
        jsonObject.setObject("FAXCODE", taxCode);
        jsonObject.setObject("SALESBRWS", salesBrws);
        jsonObject.setObject("PURCHBRWS", purchBrws);
        jsonObject.setObject("IMPBRWS", impBrws);
        jsonObject.setObject("EXPBRWS", expBrws);
        jsonObject.setObject("FINBRWS", finBrws);
        jsonObject.setObject("ORGLOGOID", orgLogoId);
        jsonObject.setObject("ADDTOREFLIST", addToRefList);
        jsonObject.setObject("TEXTREFTR", textRefTr);
        jsonObject.setObject("TEXTREFEN", textRefEn);
        jsonObject.setObject("ARPQUOTEINC", arpQuoteInc);
        jsonObject.setObject("CLCRM", clcrm);
        jsonObject.setObject("GRPFIRMNR", grpFirmNr);
        jsonObject.setObject("CONSCODEREF", consCodeRef);
        jsonObject.setObject("SPECODE2", specode2);
        jsonObject.setObject("SPECODE3", specode3);
        jsonObject.setObject("SPECODE4", specode4);
        jsonObject.setObject("SPECODE5", specode5);
        jsonObject.setObject("OFFSENDMETHOD", offSendMethod);
        jsonObject.setObject("OFFSENDEMAILADDR", offSendEmailAddr);
        jsonObject.setObject("OFFSENDFAXNR", offSendFaxNr);
        jsonObject.setObject("OFFSENDFORMAT", offSendFormat);
        jsonObject.setObject("EBANKNO", eBankNo);
        jsonObject.setObject("LOANGRPCTRL", loanGrpCtrl);
        jsonObject.setObject("BANKNAMES1", bankNames1);
        jsonObject.setObject("BANKNAMES2", bankNames2);
        jsonObject.setObject("BANKNAMES3", bankNames3);
        jsonObject.setObject("BANKNAMES4", bankNames4);
        jsonObject.setObject("BANKNAMES5", bankNames5);
        jsonObject.setObject("BANKNAMES6", bankNames6);
        jsonObject.setObject("BANKNAMES7", bankNames7);
        jsonObject.setObject("LDXFIRMNR", ldxFirmNr);
        return jsonObject;
    }

    //*****************************CLRNUMS**************************************
    // method to get ArrayList of CLRNUMS from db
    public ArrayList<ClrNums> getClrNumsArrayList(ResultSet resultSet) {

        ArrayList<ClrNums> tableValue = new ArrayList<>();
        ClrNums unit;

        try {

            while (resultSet.next()) {
                unit = new ClrNums(
                        resultSet.getInt("LOGICALREF"), resultSet.getInt("CLCARDREF"),
                        resultSet.getShort("RISKTYPE"), resultSet.getShort("RISKOVER"),
                        resultSet.getFloat("PS"), resultSet.getFloat("KC"),
                        resultSet.getFloat("RISKTOTAL"), resultSet.getFloat("DESPRISKTOTAL"),
                        resultSet.getFloat("RISKLIMIT"), resultSet.getFloat("RISKBALANCED"),
                        resultSet.getFloat("CEKRISKFACTOR"), resultSet.getFloat("SENETRISKFACTOR"),
                        resultSet.getFloat("CEK0_DEBIT"), resultSet.getFloat("CEK0_CREDIT"),
                        resultSet.getFloat("CEK1_DEBIT"), resultSet.getFloat("CEK1_CREDIT"),
                        resultSet.getFloat("SENET0_DEBIT"), resultSet.getFloat("SENET0_CREDIT"),
                        resultSet.getFloat("SENET1_DEBIT"), resultSet.getFloat("SENET1_CREDIT"),
                        resultSet.getFloat("CEKCURR0_DEBIT"), resultSet.getFloat("CEKCURR0_CREDIT"),
                        resultSet.getFloat("CEKCURR1_DEBIT"), resultSet.getFloat("CEKCURR1_CREDIT"),
                        resultSet.getFloat("SENETCURR0_DEBIT"), resultSet.getFloat("SENETCURR0_CREDIT"),
                        resultSet.getFloat("SENETCURR1_DEBIT"), resultSet.getFloat("SENETCURR1_CREDIT"),
                        resultSet.getShort("ORDRISKOVER"), resultSet.getShort("DESPRISKOVER"),
                        resultSet.getShort("USEREPRISK"), resultSet.getFloat("REPRISKTOTAL"),
                        resultSet.getFloat("REPDESPRISKTOTAL"), resultSet.getFloat("REPRISKLIMIT"),
                        resultSet.getFloat("REPRISKBALANCED"), resultSet.getFloat("REPPS"),
                        resultSet.getFloat("REPKC"), resultSet.getFloat("ORDRISKTOTAL"),
                        resultSet.getFloat("ORDRISKTOTALSUGG"), resultSet.getFloat("REPORDRISKTOTAL"),
                        resultSet.getFloat("REPORDRISKTOTALSUGG"), resultSet.getShort("RISKTYPES1"),
                        resultSet.getShort("RISKTYPES2"), resultSet.getShort("RISKTYPES3"),
                        resultSet.getShort("RISKTYPES4"), resultSet.getShort("RISKTYPES5"),
                        resultSet.getShort("RISKTYPES6"), resultSet.getShort("RISKTYPES7"),
                        resultSet.getShort("RISKTYPES8"), resultSet.getShort("RISKTYPES9"),
                        resultSet.getShort("RISKTYPES10"), resultSet.getShort("RISKTYPES11"),
                        resultSet.getShort("RISKTYPES12"), resultSet.getShort("RISKTYPES13"),
                        resultSet.getShort("RISKTYPES14"), resultSet.getShort("RISKTYPES15"),
                        resultSet.getFloat("CSTCEKRISKFACTOR"), resultSet.getFloat("CSTSENETRISKFACTOR"),
                        resultSet.getShort("RISKGRPCONTROL"), resultSet.getShort("ACCRISKOVER"),
                        resultSet.getShort("CSTCSRISKOVER"), resultSet.getShort("MYCSRISKOVER"),
                        resultSet.getShort("RISKCTRLTYPE"), resultSet.getFloat("ACCRISKTOTAL"),
                        resultSet.getFloat("REPACCRISKTOTAL"), resultSet.getFloat("CSTCSRISKTOTAL"),
                        resultSet.getFloat("REPCSTCSRISKTOTAL"), resultSet.getFloat("MYCSRISKTOTAL"),
                        resultSet.getFloat("REPMYCSRISKTOTAL"), resultSet.getFloat("ACCRISKLIMIT"),
                        resultSet.getFloat("REPACCRISKLIMIT"), resultSet.getFloat("CSTCSRISKLIMIT"),
                        resultSet.getFloat("REPCSTCSRISKLIMIT"), resultSet.getFloat("MYCSRISKLIMIT"),
                        resultSet.getFloat("REPMYCSRISKLIMIT"), resultSet.getFloat("DESPRISKLIMIT"),
                        resultSet.getFloat("REPDESPRISKLIMIT"), resultSet.getFloat("ORDRISKLIMIT"),
                        resultSet.getFloat("REPORDRISKLIMIT"), resultSet.getFloat("ORDRISKLIMITSUGG"),
                        resultSet.getFloat("REPORDRISKLIMITSUGG"), resultSet.getFloat("ACCRSKBLNCED"),
                        resultSet.getFloat("REPACCRSKBLNCED"), resultSet.getFloat("CSTCSRSKBLNCED"),
                        resultSet.getFloat("REPCSTCSRSKBLNCED"), resultSet.getFloat("MYCSRSKBLNCED"),
                        resultSet.getFloat("REPMYCSRSKBLNCED"), resultSet.getFloat("DESPRSKBLNCED"),
                        resultSet.getFloat("REPDESPRSKBLNCED"), resultSet.getFloat("ORDRSKBLNCED"),
                        resultSet.getFloat("REPORDRSKBLNCED"), resultSet.getFloat("ORDRSKBLNCEDSUG"),
                        resultSet.getFloat("REPORDRSKBLNCEDSUG"));
                tableValue.add(unit);
            }
            return tableValue;
        } catch (SQLException ex) {
            Logger.getLogger(ClCardSender.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
            return null;
        }
    }

    //method to convert ArrayList<model> to JsonObject
    public JsonObject getClrNumsJson(ArrayList<ClrNums> list) {
        JsonObject jsonObject = new JsonObject();
        JSONArray logicalRef = new JSONArray();
        JSONArray clCardRef = new JSONArray();
        JSONArray riskType = new JSONArray();
        JSONArray riskOver = new JSONArray();
        JSONArray ps = new JSONArray();
        JSONArray kc = new JSONArray();
        JSONArray riskTotal = new JSONArray();
        JSONArray despRiskTotal = new JSONArray();
        JSONArray riskLimit = new JSONArray();
        JSONArray riskBalanced = new JSONArray();
        JSONArray cekRsikFactor = new JSONArray();
        JSONArray senetRsikFactor = new JSONArray();
        JSONArray cek0Debit = new JSONArray();
        JSONArray cek0Credit = new JSONArray();
        JSONArray cek1Debit = new JSONArray();
        JSONArray cek1Credit = new JSONArray();
        JSONArray senet0Debit = new JSONArray();
        JSONArray senet0Credit = new JSONArray();
        JSONArray senet1Debit = new JSONArray();
        JSONArray senet1Credit = new JSONArray();
        JSONArray cekCurr0Debit = new JSONArray();
        JSONArray cekCurr0Credit = new JSONArray();
        JSONArray cekCurr1Debit = new JSONArray();
        JSONArray cekCurr1Credit = new JSONArray();
        JSONArray senetCurr0Debit = new JSONArray();
        JSONArray senetCurr0Credit = new JSONArray();
        JSONArray senetCurr1Debit = new JSONArray();
        JSONArray senetCurr1Credit = new JSONArray();
        JSONArray ordRiskOver = new JSONArray();
        JSONArray despRiskOver = new JSONArray();
        JSONArray userEpRisk = new JSONArray();
        JSONArray repRiskTotal = new JSONArray();
        JSONArray repDepRiskTotal = new JSONArray();
        JSONArray repRiskLimit = new JSONArray();
        JSONArray repRiskBalanced = new JSONArray();
        JSONArray repps = new JSONArray();
        JSONArray repkc = new JSONArray();
        JSONArray ordRiskTotal = new JSONArray();
        JSONArray ordRiskTotalSugg = new JSONArray();
        JSONArray repOrdRiskTotal = new JSONArray();
        JSONArray repOrdRiskTotalSugg = new JSONArray();
        JSONArray riskType1 = new JSONArray();
        JSONArray riskType2 = new JSONArray();
        JSONArray riskType3 = new JSONArray();
        JSONArray riskType4 = new JSONArray();
        JSONArray riskType5 = new JSONArray();
        JSONArray riskType6 = new JSONArray();
        JSONArray riskType7 = new JSONArray();
        JSONArray riskType8 = new JSONArray();
        JSONArray riskType9 = new JSONArray();
        JSONArray riskType10 = new JSONArray();
        JSONArray riskType11 = new JSONArray();
        JSONArray riskType12 = new JSONArray();
        JSONArray riskType13 = new JSONArray();
        JSONArray riskType14 = new JSONArray();
        JSONArray riskType15 = new JSONArray();
        JSONArray cstcekRiskFactor = new JSONArray();
        JSONArray cstSenetRiskFactor = new JSONArray();
        JSONArray riskGrpControl = new JSONArray();
        JSONArray accRiskOver = new JSONArray();
        JSONArray cstcsRiskOver = new JSONArray();
        JSONArray mycsRiskOver = new JSONArray();
        JSONArray riskCtrlType = new JSONArray();
        JSONArray accRiskTotal = new JSONArray();
        JSONArray repAccRiskTotal = new JSONArray();
        JSONArray cstcsRiskTotal = new JSONArray();
        JSONArray repCstcsRiskTotal = new JSONArray();
        JSONArray mycsRiskTotal = new JSONArray();
        JSONArray repMycsRiskTotal = new JSONArray();
        JSONArray accRiskLimit = new JSONArray();
        JSONArray repAccRiskLimit = new JSONArray();
        JSONArray cstcsRiskLimit = new JSONArray();
        JSONArray repCstcsRiskLimit = new JSONArray();
        JSONArray mycsRiskLimit = new JSONArray();
        JSONArray repMycsRiskLimit = new JSONArray();
        JSONArray despRiskLimit = new JSONArray();
        JSONArray repDespRiskLimit = new JSONArray();
        JSONArray ordRiskLimit = new JSONArray();
        JSONArray repOrdRiskLimit = new JSONArray();
        JSONArray ordRiskLimitSugg = new JSONArray();
        JSONArray repOrdRiskLimitSugg = new JSONArray();
        JSONArray accRskBlnced = new JSONArray();
        JSONArray repaAcRskBlnced = new JSONArray();
        JSONArray cstcsRskBlnced = new JSONArray();
        JSONArray repcstcsRskBlnced = new JSONArray();
        JSONArray mycsRskBlnced = new JSONArray();
        JSONArray repmycsRskBlnced = new JSONArray();
        JSONArray despRskBlnced = new JSONArray();
        JSONArray repdespRskBlnced = new JSONArray();
        JSONArray ordRskBlnced = new JSONArray();
        JSONArray repordRskBlnced = new JSONArray();
        JSONArray ordRskBlncedSugg = new JSONArray();
        JSONArray repordRskBlncedSugg = new JSONArray();

        for (int a = 0; a < list.size(); a++) {

            logicalRef.add(list.get(a).getLogicalRef());
            clCardRef.add(list.get(a).getClCardRef());
            riskType.add(list.get(a).getRiskType());
            riskOver.add(list.get(a).getRiskOver());
            ps.add(list.get(a).getPs());
            kc.add(list.get(a).getKc());
            riskTotal.add(list.get(a).getRiskTotal());
            despRiskTotal.add(list.get(a).getDespRiskTotal());
            riskLimit.add(list.get(a).getRiskLimit());
            riskBalanced.add(list.get(a).getRiskBalanced());
            cekRsikFactor.add(list.get(a).getCekRsikFactor());
            senetRsikFactor.add(list.get(a).getSenetRsikFactor());
            cek0Debit.add(list.get(a).getCek0Debit());
            cek0Credit.add(list.get(a).getCek0Credit());
            cek1Debit.add(list.get(a).getCek1Debit());
            cek1Credit.add(list.get(a).getCek1Credit());
            senet0Debit.add(list.get(a).getSenet0Debit());
            senet0Credit.add(list.get(a).getSenet0Credit());
            senet1Debit.add(list.get(a).getSenet1Debit());
            senet1Credit.add(list.get(a).getSenet1Credit());
            cekCurr0Debit.add(list.get(a).getCekCurr0Debit());
            cekCurr0Credit.add(list.get(a).getCekCurr0Credit());
            cekCurr1Debit.add(list.get(a).getCekCurr1Debit());
            cekCurr1Credit.add(list.get(a).getCekCurr1Credit());
            senetCurr0Debit.add(list.get(a).getSenetCurr0Debit());
            senetCurr0Credit.add(list.get(a).getSenetCurr0Credit());
            senetCurr1Debit.add(list.get(a).getSenetCurr1Debit());
            senetCurr1Credit.add(list.get(a).getSenetCurr1Credit());
            ordRiskOver.add(list.get(a).getOrdRiskOver());
            despRiskOver.add(list.get(a).getDespRiskOver());
            userEpRisk.add(list.get(a).getUserEpRisk());
            repRiskTotal.add(list.get(a).getRepRiskTotal());
            repDepRiskTotal.add(list.get(a).getRepDepRiskTotal());
            repRiskLimit.add(list.get(a).getRepRiskLimit());
            repRiskBalanced.add(list.get(a).getRepRiskBalanced());
            repps.add(list.get(a).getRepps());
            repkc.add(list.get(a).getRepkc());
            ordRiskTotal.add(list.get(a).getOrdRiskTotal());
            ordRiskTotalSugg.add(list.get(a).getOrdRiskTotalSugg());
            repOrdRiskTotal.add(list.get(a).getRepOrdRiskTotal());
            repOrdRiskTotalSugg.add(list.get(a).getRepOrdRiskTotalSugg());
            riskType1.add(list.get(a).getRiskType1());
            riskType2.add(list.get(a).getRiskType2());
            riskType3.add(list.get(a).getRiskType3());
            riskType4.add(list.get(a).getRiskType4());
            riskType5.add(list.get(a).getRiskType5());
            riskType6.add(list.get(a).getRiskType6());
            riskType7.add(list.get(a).getRiskType7());
            riskType8.add(list.get(a).getRiskType8());
            riskType9.add(list.get(a).getRiskType9());
            riskType10.add(list.get(a).getRiskType10());
            riskType11.add(list.get(a).getRiskType11());
            riskType12.add(list.get(a).getRiskType12());
            riskType13.add(list.get(a).getRiskType13());
            riskType14.add(list.get(a).getRiskType14());
            riskType15.add(list.get(a).getRiskType15());
            cstcekRiskFactor.add(list.get(a).getCstcekRiskFactor());
            cstSenetRiskFactor.add(list.get(a).getCstSenetRiskFactor());
            riskGrpControl.add(list.get(a).getRiskGrpControl());
            accRiskOver.add(list.get(a).getAccRiskOver());
            cstcsRiskOver.add(list.get(a).getCstcsRiskOver());
            mycsRiskOver.add(list.get(a).getMycsRiskOver());
            riskCtrlType.add(list.get(a).getRiskCtrlType());
            accRiskTotal.add(list.get(a).getAccRiskTotal());
            repAccRiskTotal.add(list.get(a).getRepAccRiskTotal());
            cstcsRiskTotal.add(list.get(a).getCstcsRiskTotal());
            repCstcsRiskTotal.add(list.get(a).getRepCstcsRiskTotal());
            mycsRiskTotal.add(list.get(a).getMycsRiskTotal());
            repMycsRiskTotal.add(list.get(a).getRepMycsRiskTotal());
            accRiskLimit.add(list.get(a).getAccRiskLimit());
            repAccRiskLimit.add(list.get(a).getRepAccRiskLimit());
            cstcsRiskLimit.add(list.get(a).getCstcsRiskLimit());
            repCstcsRiskLimit.add(list.get(a).getRepCstcsRiskLimit());
            mycsRiskLimit.add(list.get(a).getMycsRiskLimit());
            repMycsRiskLimit.add(list.get(a).getRepMycsRiskLimit());
            despRiskLimit.add(list.get(a).getDespRiskLimit());
            repDespRiskLimit.add(list.get(a).getRepDespRiskLimit());
            ordRiskLimit.add(list.get(a).getOrdRiskLimit());
            repOrdRiskLimit.add(list.get(a).getRepOrdRiskLimit());
            ordRiskLimitSugg.add(list.get(a).getOrdRiskLimitSugg());
            repOrdRiskLimitSugg.add(list.get(a).getRepOrdRiskLimitSugg());
            accRskBlnced.add(list.get(a).getAccRskBlnced());
            repaAcRskBlnced.add(list.get(a).getRepaAcRskBlnced());
            cstcsRskBlnced.add(list.get(a).getCstcsRskBlnced());
            repcstcsRskBlnced.add(list.get(a).getRepcstcsRskBlnced());
            mycsRskBlnced.add(list.get(a).getMycsRskBlnced());
            repmycsRskBlnced.add(list.get(a).getRepmycsRskBlnced());
            despRskBlnced.add(list.get(a).getDespRskBlnced());
            repdespRskBlnced.add(list.get(a).getRepdespRskBlnced());
            ordRskBlnced.add(list.get(a).getOrdRskBlnced());
            repordRskBlnced.add(list.get(a).getRepordRskBlnced());
            ordRskBlncedSugg.add(list.get(a).getOrdRskBlncedSugg());
            repordRskBlncedSugg.add(list.get(a).getRepordRskBlncedSugg());
        }
        jsonObject.setObject("LOGICALREF", logicalRef);
        jsonObject.setObject("CLCARDREF", clCardRef);
        jsonObject.setObject("RISKTYPE", riskType);
        jsonObject.setObject("RISKOVER", riskOver);
        jsonObject.setObject("PS", ps);
        jsonObject.setObject("KC", kc);
        jsonObject.setObject("RISKTOTAL", riskTotal);
        jsonObject.setObject("DESPRISKTOTAL", despRiskTotal);
        jsonObject.setObject("RISKLIMIT", riskLimit);
        jsonObject.setObject("RISKBALANCED", riskBalanced);
        jsonObject.setObject("CEKRISKFACTOR", cekRsikFactor);
        jsonObject.setObject("SENETRISKFACTOR", senetRsikFactor);
        jsonObject.setObject("CEK0_DEBIT", cek0Debit);
        jsonObject.setObject("CEK0_CREDIT", cek0Credit);
        jsonObject.setObject("CEK1_DEBIT", cek1Debit);
        jsonObject.setObject("CEK1_CREDIT", cek1Credit);
        jsonObject.setObject("SENET0_DEBIT", senet0Debit);
        jsonObject.setObject("SENET0_CREDIT", senet0Credit);
        jsonObject.setObject("SENET1_DEBIT", senet1Debit);
        jsonObject.setObject("SENET1_CREDIT", senet1Credit);
        jsonObject.setObject("CEKCURR0_DEBIT", cekCurr0Debit);
        jsonObject.setObject("CEKCURR0_CREDIT", cekCurr0Credit);
        jsonObject.setObject("CEKCURR1_DEBIT", cekCurr1Debit);
        jsonObject.setObject("CEKCURR1_CREDIT", cekCurr1Credit);
        jsonObject.setObject("SENETCURR0_DEBIT", senetCurr0Debit);
        jsonObject.setObject("SENETCURR0_CREDIT", senetCurr0Credit);
        jsonObject.setObject("SENETCURR1_DEBIT", senetCurr1Debit);
        jsonObject.setObject("SENETCURR1_CREDIT", senetCurr1Credit);
        jsonObject.setObject("ORDRISKOVER", ordRiskOver);
        jsonObject.setObject("DESPRISKOVER", despRiskOver);
        jsonObject.setObject("USEREPRISK", userEpRisk);
        jsonObject.setObject("REPRISKTOTAL", repRiskTotal);
        jsonObject.setObject("REPDESPRISKTOTAL", repDepRiskTotal);
        jsonObject.setObject("REPRISKLIMIT", repRiskLimit);
        jsonObject.setObject("REPRISKBALANCED", repRiskBalanced);
        jsonObject.setObject("REPPS", repps);
        jsonObject.setObject("REPKC", repkc);
        jsonObject.setObject("ORDRISKTOTAL", ordRiskTotal);
        jsonObject.setObject("ORDRISKTOTALSUGG", ordRiskTotalSugg);
        jsonObject.setObject("REPORDRISKTOTAL", repOrdRiskTotal);
        jsonObject.setObject("REPORDRISKTOTALSUGG", repOrdRiskTotalSugg);
        jsonObject.setObject("RISKTYPES1", riskType1);
        jsonObject.setObject("RISKTYPES2", riskType2);
        jsonObject.setObject("RISKTYPES3", riskType3);
        jsonObject.setObject("RISKTYPES4", riskType4);
        jsonObject.setObject("RISKTYPES5", riskType5);
        jsonObject.setObject("RISKTYPES6", riskType6);
        jsonObject.setObject("RISKTYPES7", riskType7);
        jsonObject.setObject("RISKTYPES8", riskType8);
        jsonObject.setObject("RISKTYPES9", riskType9);
        jsonObject.setObject("RISKTYPES10", riskType10);
        jsonObject.setObject("RISKTYPES11", riskType11);
        jsonObject.setObject("RISKTYPES12", riskType12);
        jsonObject.setObject("RISKTYPES13", riskType13);
        jsonObject.setObject("RISKTYPES14", riskType14);
        jsonObject.setObject("RISKTYPES15", riskType15);
        jsonObject.setObject("CSTCEKRISKFACTOR", cstcekRiskFactor);
        jsonObject.setObject("CSTSENETRISKFACTOR", cstSenetRiskFactor);
        jsonObject.setObject("RISKGRPCONTROL", riskGrpControl);
        jsonObject.setObject("ACCRISKOVER", accRiskOver);
        jsonObject.setObject("CSTCSRISKOVER", cstcsRiskOver);
        jsonObject.setObject("MYCSRISKOVER", mycsRiskOver);
        jsonObject.setObject("RISKCTRLTYPE", riskCtrlType);
        jsonObject.setObject("ACCRISKTOTAL", accRiskTotal);
        jsonObject.setObject("REPACCRISKTOTAL", repAccRiskTotal);
        jsonObject.setObject("CSTCSRISKTOTAL", cstcsRiskTotal);
        jsonObject.setObject("REPCSTCSRISKTOTAL", repCstcsRiskTotal);
        jsonObject.setObject("MYCSRISKTOTAL", mycsRiskTotal);
        jsonObject.setObject("REPMYCSRISKTOTAL", repMycsRiskTotal);
        jsonObject.setObject("ACCRISKLIMIT", accRiskLimit);
        jsonObject.setObject("REPACCRISKLIMIT", repAccRiskLimit);
        jsonObject.setObject("CSTCSRISKLIMIT", cstcsRiskLimit);
        jsonObject.setObject("REPCSTCSRISKLIMIT", repCstcsRiskLimit);
        jsonObject.setObject("MYCSRISKLIMIT", mycsRiskLimit);
        jsonObject.setObject("REPMYCSRISKLIMIT", repMycsRiskLimit);
        jsonObject.setObject("DESPRISKLIMIT", despRiskLimit);
        jsonObject.setObject("REPDESPRISKLIMIT", repDespRiskLimit);
        jsonObject.setObject("ORDRISKLIMIT", ordRiskLimit);
        jsonObject.setObject("REPORDRISKLIMIT", repOrdRiskLimit);
        jsonObject.setObject("ORDRISKLIMITSUGG", ordRiskLimitSugg);
        jsonObject.setObject("REPORDRISKLIMITSUGG", repOrdRiskLimitSugg);
        jsonObject.setObject("ACCRSKBLNCED", accRskBlnced);
        jsonObject.setObject("REPACCRSKBLNCED", repaAcRskBlnced);
        jsonObject.setObject("CSTCSRSKBLNCED", cstcsRskBlnced);
        jsonObject.setObject("REPCSTCSRSKBLNCED", repcstcsRskBlnced);
        jsonObject.setObject("MYCSRSKBLNCED", mycsRskBlnced);
        jsonObject.setObject("REPMYCSRSKBLNCED", repmycsRskBlnced);
        jsonObject.setObject("DESPRSKBLNCED", despRskBlnced);
        jsonObject.setObject("REPDESPRSKBLNCED", repdespRskBlnced);
        jsonObject.setObject("ORDRSKBLNCED", ordRskBlnced);
        jsonObject.setObject("REPORDRSKBLNCED", repordRskBlnced);
        jsonObject.setObject("ORDRSKBLNCEDSUG", ordRskBlncedSugg);
        jsonObject.setObject("REPORDRSKBLNCEDSUG", repordRskBlncedSugg);
        return jsonObject;
    }

    //**************************CLCOLLATRLRISK**********************************
    // method to get ArrayList of CLCOLLATRLRISK from db
    public ArrayList<ClcollatrlRisk> getClcollatrlRiskArrayList(ResultSet resultSet) {

        ArrayList<ClcollatrlRisk> tableValue = new ArrayList<>();
        ClcollatrlRisk unit;

        try {
            while (resultSet.next()) {
                unit = new ClcollatrlRisk(
                        resultSet.getInt("LOGICALREF"), resultSet.getInt("CLCARDREF"),
                        resultSet.getShort("RISKTYPE"), resultSet.getShort("RISKOVER"),
                        resultSet.getShort("ORDRISKOVER"), resultSet.getShort("DESPRISKOVER"),
                        resultSet.getShort("USEREPRISK"), resultSet.getFloat("PCOLLATRLTOTAL"),
                        resultSet.getFloat("REPPCOLLATRLTOTAL"), resultSet.getFloat("SCOLLATRLTOTAL"),
                        resultSet.getFloat("REPSCOLLATRLTOTAL"), resultSet.getFloat("RISKTOTAL"),
                        resultSet.getFloat("REPRISKTOTAL"), resultSet.getFloat("DESPRISKTOTAL"),
                        resultSet.getFloat("REPDESPRISKTOTAL"), resultSet.getFloat("RISKLIMIT"),
                        resultSet.getFloat("REPRISKLIMIT"), resultSet.getFloat("RISKBALANCED"),
                        resultSet.getFloat("REPRISKBALANCED"), resultSet.getFloat("ORDRISKTOTAL"),
                        resultSet.getFloat("REPORDRISKTOTAL"), resultSet.getFloat("ORDRISKTOTALSUGG"),
                        resultSet.getFloat("REPORDRISKTOTALSUGG"));
                tableValue.add(unit);
            }
            return tableValue;
        } catch (SQLException ex) {
            Logger.getLogger(ClCardSender.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
            return null;
        }
    }

    //method to convert ArrayList<model> to JsonObject
    public JsonObject getClcollatrlRiskJson(ArrayList<ClcollatrlRisk> list) {
        JsonObject jsonObject = new JsonObject();
        JSONArray logicalRef = new JSONArray();
        JSONArray clCardRef = new JSONArray();
        JSONArray riskType = new JSONArray();
        JSONArray riskOver = new JSONArray();
        JSONArray ordRiskOver = new JSONArray();
        JSONArray despRiskOver = new JSONArray();
        JSONArray userEpRisk = new JSONArray();
        JSONArray pcollatrlTotal = new JSONArray();
        JSONArray repPcollatrlTotal = new JSONArray();
        JSONArray scollatrlTotal = new JSONArray();
        JSONArray repscollatrlTotal = new JSONArray();
        JSONArray riskTotal = new JSONArray();
        JSONArray repRiskTotal = new JSONArray();
        JSONArray despRiskTotal = new JSONArray();
        JSONArray repDespRiskTotal = new JSONArray();
        JSONArray riskLimit = new JSONArray();
        JSONArray repRiskLimit = new JSONArray();
        JSONArray riskBalanced = new JSONArray();
        JSONArray repRiskBalanced = new JSONArray();
        JSONArray ordRiskTotal = new JSONArray();
        JSONArray repOrdRiskTotal = new JSONArray();
        JSONArray ordRiskTotalSugg = new JSONArray();
        JSONArray repOrdRiskTotalSugg = new JSONArray();

        for (int a = 0; a < list.size(); a++) {

            logicalRef.add(list.get(a).getLogicalRef());
            clCardRef.add(list.get(a).getClCardRef());
            riskType.add(list.get(a).getRiskType());
            riskOver.add(list.get(a).getRiskOver());
            ordRiskOver.add(list.get(a).getOrdRiskType());
            despRiskOver.add(list.get(a).getDespRiskOver());
            userEpRisk.add(list.get(a).getUserEpRisk());
            pcollatrlTotal.add(list.get(a).getPcollatrlTotal());
            repPcollatrlTotal.add(list.get(a).getRepPcollatrlTotal());
            scollatrlTotal.add(list.get(a).getScollatrlTotal());
            repscollatrlTotal.add(list.get(a).getRepscollatrlTotal());
            riskTotal.add(list.get(a).getRiskTotal());
            repRiskTotal.add(list.get(a).getRepRiskTotal());
            despRiskTotal.add(list.get(a).getDespRiskTotal());
            repDespRiskTotal.add(list.get(a).getRepDespRiskTotal());
            riskLimit.add(list.get(a).getRiskLimit());
            repRiskLimit.add(list.get(a).getRepRiskLimit());
            riskBalanced.add(list.get(a).getRiskBalanced());
            repRiskBalanced.add(list.get(a).getRepRiskBalanced());
            ordRiskTotal.add(list.get(a).getOrdRiskTotal());
            repOrdRiskTotal.add(list.get(a).getRepOrdRiskTotal());
            ordRiskTotalSugg.add(list.get(a).getOrdRiskTotalSugg());
            repOrdRiskTotalSugg.add(list.get(a).getRepOrdRiskTotalSugg());
        }
        jsonObject.setObject("LOGICALREF", logicalRef);
        jsonObject.setObject("CLCARDREF", clCardRef);
        jsonObject.setObject("RISKTYPE", riskType);
        jsonObject.setObject("RISKOVER", riskOver);
        jsonObject.setObject("ORDRISKOVER", ordRiskOver);
        jsonObject.setObject("DESPRISKOVER", despRiskOver);
        jsonObject.setObject("USEREPRISK", userEpRisk);
        jsonObject.setObject("PCOLLATRLTOTAL", pcollatrlTotal);
        jsonObject.setObject("REPPCOLLATRLTOTAL", repPcollatrlTotal);
        jsonObject.setObject("SCOLLATRLTOTAL", scollatrlTotal);
        jsonObject.setObject("REPSCOLLATRLTOTAL", repscollatrlTotal);
        jsonObject.setObject("RISKTOTAL", riskTotal);
        jsonObject.setObject("REPRISKTOTAL", repRiskTotal);
        jsonObject.setObject("DESPRISKTOTAL", despRiskTotal);
        jsonObject.setObject("REPDESPRISKTOTAL", repDespRiskTotal);
        jsonObject.setObject("RISKLIMIT", riskLimit);
        jsonObject.setObject("REPRISKLIMIT", repRiskLimit);
        jsonObject.setObject("RISKBALANCED", riskBalanced);
        jsonObject.setObject("REPRISKBALANCED", repRiskBalanced);
        jsonObject.setObject("ORDRISKTOTAL", ordRiskTotal);
        jsonObject.setObject("REPORDRISKTOTAL", repOrdRiskTotal);
        jsonObject.setObject("ORDRISKTOTALSUGG", ordRiskTotalSugg);
        jsonObject.setObject("REPORDRISKTOTALSUGG", repOrdRiskTotalSugg);

        return jsonObject;
    }
}

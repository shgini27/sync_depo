/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sender.sales;

import com.saptaslama.controller.CompanyConstants;
import com.saptaslama.controller.DbConnection;
import com.saptaslama.controller.sender.Sender;
import com.saptaslama.model.Invoice;
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
public class InvoiceSender extends Sender{

//**************************INITIALIZER**********************************
    public void init() {
        DbConnection db;
        Connection con;
        ResultSet resultSetInvoice;
        
        String tabelNameInvoice = CompanyConstants.COMPANY + CompanyConstants
                .SUBCOMPANY + "INVOICE";
        
        String fileNameInvoice = "Invoice.json";
        
        String queryCondition = "TRACKNR LIKE ''";
        
        /*
        SELECT * FROM LG_007_01_INVOICE 
            WHERE TRACKNR LIKE '' AND CAPIBLOCK_CREADEDDATE 
                BETWEEN '2017-02-01 00:00:00.000' AND '2017-03-01 00:00:00.000' 
		OR CAPIBLOCK_MODIFIEDDATE BETWEEN '2017-02-01 00:00:00.000' AND '2017-03-01 00:00:00.000'
        */
        
        db = new DbConnection();
        con = db.getConnection();
        
        resultSetInvoice = db.querySelectStatement(con, tabelNameInvoice, queryCondition);
        
        sendJsonFile(getInvoiceJson(getInvoiceArrayList(resultSetInvoice)), 
                CompanyConstants.FILE_PATH_SEND + fileNameInvoice);

        db.closeConnection(con);
        db.closeResultSet(resultSetInvoice);
    }
    
    // to get ArrayList of data from db
    public ArrayList<Invoice> getInvoiceArrayList(ResultSet resultSet) {

        ArrayList<Invoice> tableValue = new ArrayList<>();
        Invoice invoice;

        try {
            while (resultSet.next()) {
                invoice = new Invoice(
                        resultSet.getInt("LOGICALREF"), resultSet.getShort("GRPCODE"),
                        resultSet.getShort("TRCODE"), resultSet.getString("FICHENO"),
                        resultSet.getString("DATE_"), resultSet.getInt("TIME_"),
                        resultSet.getString("DOCODE"), resultSet.getString("SPECODE"),
                        resultSet.getString("CYPHCODE"), resultSet.getInt("CLIENTREF"),
                        resultSet.getInt("RECVREF"), resultSet.getInt("CENTERREF"),
                        resultSet.getInt("ACCOUNTREF"), resultSet.getShort("SOURCEINDEX"),
                        resultSet.getShort("SOURCECOSTGRP"), resultSet.getShort("CANCELLED"),
                        resultSet.getShort("ACCOUNTED"), resultSet.getShort("PAIDINCASH"),
                        resultSet.getShort("FROMKASA"), resultSet.getShort("ENTEGSET"),
                        resultSet.getFloat("VAT"), resultSet.getFloat("ADDDISCOUNTS"),
                        resultSet.getFloat("TOTALDISCOUNTS"), resultSet.getFloat("TOTALDISCOUNTED"),
                        resultSet.getFloat("ADDEXPENSES"), resultSet.getFloat("TOTALEXPENSES"),
                        resultSet.getFloat("DISTEXPENSE"), resultSet.getFloat("TOTALDEPOZITO"),
                        resultSet.getFloat("TOTALPROMOTIONS"), resultSet.getFloat("VATINCGROSS"),
                        resultSet.getFloat("TOTALVAT"), resultSet.getFloat("GROSSTOTAL"),
                        resultSet.getFloat("NETTOTAL"), resultSet.getString("GENEXP1"),
                        resultSet.getString("GENEXP2"), resultSet.getString("GENEXP3"),
                        resultSet.getString("GENEXP4"), resultSet.getFloat("INTERESTAPP"),
                        resultSet.getShort("TRCURR"), resultSet.getFloat("TRRATE"),
                        resultSet.getFloat("TRNET"), resultSet.getFloat("REPORTRATE"),
                        resultSet.getFloat("REPORTNET"), resultSet.getShort("ONLYONEPAYLINE"),
                        resultSet.getInt("KASTRANSREF"), resultSet.getInt("PAYDEFREF"),
                        resultSet.getShort("PRINTCNT"), resultSet.getShort("GVATINC"),
                        resultSet.getShort("BRANCH"), resultSet.getShort("DEPARTMENT"),
                        resultSet.getInt("ACCFICHEREF"), resultSet.getInt("ADDEXPACCREF"),
                        resultSet.getInt("ADDEXPCENTREF"), resultSet.getShort("DECPRDIFF"),
                        resultSet.getShort("CAPIBLOCK_CREATEDBY"), resultSet.getString("CAPIBLOCK_CREADEDDATE"),
                        resultSet.getShort("CAPIBLOCK_CREATEDHOUR"), resultSet.getShort("CAPIBLOCK_CREATEDMIN"),
                        resultSet.getShort("CAPIBLOCK_CREATEDSEC"), resultSet.getShort("CAPIBLOCK_MODIFIEDBY"),
                        resultSet.getString("CAPIBLOCK_MODIFIEDDATE"), resultSet.getShort("CAPIBLOCK_MODIFIEDHOUR"),
                        resultSet.getShort("CAPIBLOCK_MODIFIEDMIN"), resultSet.getShort("CAPIBLOCK_MODIFIEDSEC"),
                        resultSet.getInt("SALESMANREF"), resultSet.getShort("CANCELLEDACC"),
                        resultSet.getString("SHPTYPCOD"), resultSet.getString("SHPAGNCOD"),
                        resultSet.getString("TRACKNR"), resultSet.getShort("GENEXCTYP"),
                        resultSet.getShort("LINEEXCTYP"), resultSet.getString("TRADINGGRP"),
                        resultSet.getShort("TEXTINC"), resultSet.getShort("SITEID"),
                        resultSet.getShort("RECSTATUS"), resultSet.getInt("ORGLOGICREF"),
                        resultSet.getShort("FACTORYNR"), resultSet.getInt("WFSTATUS"),
                        resultSet.getInt("SHIPINFOREF"), resultSet.getInt("DISTORDERREF"),
                        resultSet.getShort("SENDCNT"), resultSet.getShort("DLVCLIENT"),
                        resultSet.getInt("COSTOFSALEFCREF"), resultSet.getShort("OPSTAT"),
                        resultSet.getString("DOCTRACKINGNR"), resultSet.getFloat("TOTALADDTAX"),
                        resultSet.getShort("PAYMENTTYPE"), resultSet.getFloat("INFIDX"),
                        resultSet.getShort("ACCOUNTEDCNT"), resultSet.getString("ORGLOGOID"),
                        resultSet.getShort("FROMEXIM"), resultSet.getString("FRGTYPCOD"),
                        resultSet.getShort("EXIMFCTYPE"), resultSet.getShort("FROMORDWITHPAY"),
                        resultSet.getInt("PROJECTREF"), resultSet.getInt("WFLOWCRDREF"),
                        resultSet.getShort("STATUS"), resultSet.getShort("DEDUCTIONPART1"),
                        resultSet.getShort("DEDUCTIONPART2"), resultSet.getFloat("TOTALEXADDTAX"),
                        resultSet.getShort("EXACCOUNTED"), resultSet.getShort("FROMBANK"),
                        resultSet.getInt("BNTRANSREF"), resultSet.getShort("AFFECTCOLLATRL"),
                        resultSet.getShort("GRPFIRMTRANS"), resultSet.getShort("AFFECTRISK"),
                        resultSet.getShort("CONTROLINFO"), resultSet.getShort("POSTRANSFERINFO"),
                        resultSet.getShort("TAXFREECHX"), resultSet.getString("PASSPORTNO"),
                        resultSet.getString("CREDITCARDNO"));
                tableValue.add(invoice);
            }
            return tableValue;
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceSender.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
            return null;
        }
    }
    
    //metod to convert ArrayList<> to JsonObject
    public JsonObject getInvoiceJson(ArrayList<Invoice> list) {
        JsonObject jsonObject = new JsonObject();
        JSONArray logicalRef = new JSONArray();
        JSONArray grpCode = new JSONArray();
        JSONArray trCode = new JSONArray();
        JSONArray ficheNo = new JSONArray();
        JSONArray date = new JSONArray();
        JSONArray time = new JSONArray();
        JSONArray doCode = new JSONArray();
        JSONArray specode = new JSONArray();
        JSONArray cyphCode = new JSONArray();
        JSONArray clientRef = new JSONArray();
        JSONArray recvRef = new JSONArray();
        JSONArray centerRef = new JSONArray();
        JSONArray accountRef = new JSONArray();
        JSONArray sourceIndex = new JSONArray();
        JSONArray sourceCostGrp = new JSONArray();
        JSONArray cancelled = new JSONArray();
        JSONArray accounted = new JSONArray();
        JSONArray paidInCash = new JSONArray();
        JSONArray fromKasa = new JSONArray();
        JSONArray entegSet = new JSONArray();
        JSONArray vat = new JSONArray();
        JSONArray addDiscounts = new JSONArray();
        JSONArray totalDiscounts = new JSONArray();
        JSONArray totalDiscounted = new JSONArray();
        JSONArray addExpenses = new JSONArray();
        JSONArray totalExpenses = new JSONArray();
        JSONArray distExpense = new JSONArray();
        JSONArray totalDeposito = new JSONArray();
        JSONArray totalPromotions = new JSONArray();
        JSONArray vatIncGross = new JSONArray();
        JSONArray totalVat = new JSONArray();
        JSONArray grossTotal = new JSONArray();
        JSONArray netTotal = new JSONArray();
        JSONArray genexp1 = new JSONArray();
        JSONArray genexp2 = new JSONArray();
        JSONArray genexp3 = new JSONArray();
        JSONArray genexp4 = new JSONArray();
        JSONArray interestApp = new JSONArray();
        JSONArray trCurr = new JSONArray();
        JSONArray trRate = new JSONArray();
        JSONArray trNet = new JSONArray();
        JSONArray reportRate = new JSONArray();
        JSONArray reportNet = new JSONArray();
        JSONArray onlyOnePayLine = new JSONArray();
        JSONArray kastransRef = new JSONArray();
        JSONArray payDefRef = new JSONArray();
        JSONArray printCnt = new JSONArray();
        JSONArray gVatInc = new JSONArray();
        JSONArray branch = new JSONArray();
        JSONArray department = new JSONArray();
        JSONArray accFisheRef = new JSONArray();
        JSONArray addExpAccRef = new JSONArray();
        JSONArray addExpCentRef = new JSONArray();
        JSONArray decprdiff = new JSONArray();
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
        JSONArray salesManRef = new JSONArray();
        JSONArray cancelledAcc = new JSONArray();
        JSONArray shpTypeCode = new JSONArray();
        JSONArray shpAgnCode = new JSONArray();
        JSONArray trackNr = new JSONArray();
        JSONArray genexcTyp = new JSONArray();
        JSONArray lineExcTyp = new JSONArray();
        JSONArray tradingGrp = new JSONArray();
        JSONArray textInc = new JSONArray();
        JSONArray siteId = new JSONArray();
        JSONArray recStatus = new JSONArray();
        JSONArray orgLogRef = new JSONArray();
        JSONArray factoryNr = new JSONArray();
        JSONArray wfStatus = new JSONArray();
        JSONArray shipInfoRef = new JSONArray();
        JSONArray distOrderRef = new JSONArray();
        JSONArray sendCnt = new JSONArray();
        JSONArray dlvClient = new JSONArray();
        JSONArray costOfSaleFcRef = new JSONArray();
        JSONArray opStat = new JSONArray();
        JSONArray docTrackinNr = new JSONArray();
        JSONArray totalAddTax = new JSONArray();
        JSONArray paymentType = new JSONArray();
        JSONArray infidx = new JSONArray();
        JSONArray accountedCnt = new JSONArray();
        JSONArray orgLogoId = new JSONArray();
        JSONArray fromExim = new JSONArray();
        JSONArray frgTypeCode = new JSONArray();
        JSONArray eximfcType = new JSONArray();
        JSONArray fromOrdWithPay = new JSONArray();
        JSONArray projectRef = new JSONArray();
        JSONArray wFlowCardRef = new JSONArray();
        JSONArray status = new JSONArray();
        JSONArray deductionPart1 = new JSONArray();
        JSONArray deductionPart2 = new JSONArray();
        JSONArray totalExAddTax = new JSONArray();
        JSONArray exAccounted = new JSONArray();
        JSONArray fromBank = new JSONArray();
        JSONArray bnTransRef = new JSONArray();
        JSONArray affectCollatrl = new JSONArray();
        JSONArray grpFirmTrns = new JSONArray();
        JSONArray affectRisk = new JSONArray();
        JSONArray controlInfo = new JSONArray();
        JSONArray postTransferInfo = new JSONArray();
        JSONArray taxFreeChx = new JSONArray();
        JSONArray passportNo = new JSONArray();
        JSONArray creditCardNo = new JSONArray();
        
        CompanyConstants c = new CompanyConstants();

        for (int a = 0; a < list.size(); a++) {

            //here we setting the specode with local logicalRef (example: if depo 
            //then we adding "D" infront of LogREf)
            if((c.DEPO_CODE - list.get(a).getLogicalRef()) != 111111111){
                trackNr.add(String.valueOf(c.DEPO_CODE - list.get(a).getLogicalRef()));
            }else{
                JOptionPane.showMessageDialog(null, "TrackNr icin logRef 111111111 sayisini asmistir!");
            }
            logicalRef.add(list.get(a).getLogicalRef());
            grpCode.add(list.get(a).getGrpCode());
            trCode.add(list.get(a).getTrCode());
            date.add(list.get(a).getDate());
            time.add(list.get(a).getTime());
            doCode.add(list.get(a).getDoCode());
            specode.add(list.get(a).getSpecode());
            cyphCode.add(list.get(a).getCyphCode());
            ficheNo.add(list.get(a).getFicheNo());
            clientRef.add(list.get(a).getClientRef());
            recvRef.add(list.get(a).getRecvRef());
            centerRef.add(list.get(a).getCenterRef());
            accountRef.add(list.get(a).getAccountRef());
            sourceIndex.add(list.get(a).getSourceIndex());
            sourceCostGrp.add(list.get(a).getSourceCostGrp());
            cancelled.add(list.get(a).getCancelled());
            accounted.add(list.get(a).getAccounted());
            paidInCash.add(list.get(a).getPaidInCash());
            fromKasa.add(list.get(a).getFromKasa());
            entegSet.add(list.get(a).getEntegSet());
            vat.add(list.get(a).getVat());
            addDiscounts.add(list.get(a).getAddDiscounts());
            totalDiscounts.add(list.get(a).getTotalDiscounts());
            totalDiscounted.add(list.get(a).getTotalDiscounted());
            addExpenses.add(list.get(a).getAddExpenses());
            totalExpenses.add(list.get(a).getTotalExpenses());
            distExpense.add(list.get(a).getDistExpense());
            totalDeposito.add(list.get(a).getTotalDeposito());
            totalPromotions.add(list.get(a).getTotalPromotions());
            vatIncGross.add(list.get(a).getVatIncGross());
            totalVat.add(list.get(a).getTotalVat());
            grossTotal.add(list.get(a).getGrossTotal());
            netTotal.add(list.get(a).getNetTotal());
            genexp1.add(list.get(a).getGenexp1());
            genexp2.add(list.get(a).getGenexp2());
            genexp3.add(list.get(a).getGenexp3());
            genexp4.add(list.get(a).getGenexp4());
            interestApp.add(list.get(a).getInterestApp());
            trCurr.add(list.get(a).getTrCurr());
            trRate.add(list.get(a).getTrRate());
            trNet.add(list.get(a).getTrNet());
            reportRate.add(list.get(a).getReportRate());
            reportNet.add(list.get(a).getReportNet());
            onlyOnePayLine.add(list.get(a).getOnlyOnePayLine());
            kastransRef.add(list.get(a).getKastransRef());
            payDefRef.add(list.get(a).getPayDefRef());
            printCnt.add(list.get(a).getPrintCnt());
            gVatInc.add(list.get(a).getgVatInc());
            branch.add(list.get(a).getBranch());
            department.add(list.get(a).getDepartment());
            accFisheRef.add(list.get(a).getAccFisheRef());
            addExpAccRef.add(list.get(a).getAddExpAccRef());
            addExpCentRef.add(list.get(a).getAddExpCentRef());
            decprdiff.add(list.get(a).getDecprdiff());
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
            salesManRef.add(list.get(a).getSalesManRef());
            cancelledAcc.add(list.get(a).getCancelledAcc());
            shpTypeCode.add(list.get(a).getShpTypeCode());
            shpAgnCode.add(list.get(a).getShpAgnCode());
            genexcTyp.add(list.get(a).getGenexcTyp());
            lineExcTyp.add(list.get(a).getLineExcTyp());
            tradingGrp.add(list.get(a).getTradingGrp());
            textInc.add(list.get(a).getTextInc());
            siteId.add(list.get(a).getSiteId());
            recStatus.add(list.get(a).getRecStatus());
            orgLogRef.add(list.get(a).getOrgLogRef());
            factoryNr.add(list.get(a).getFactoryNr());
            wfStatus.add(list.get(a).getWfStatus());
            shipInfoRef.add(list.get(a).getShipInfoRef());
            distOrderRef.add(list.get(a).getDistOrderRef());
            sendCnt.add(list.get(a).getSendCnt());
            dlvClient.add(list.get(a).getDlvClient());
            costOfSaleFcRef.add(list.get(a).getCostOfSaleFcRef());
            opStat.add(list.get(a).getOpStat());
            docTrackinNr.add(list.get(a).getDocTrackinNr());
            totalAddTax.add(list.get(a).getTotalAddTax());
            paymentType.add(list.get(a).getPaymentType());
            infidx.add(list.get(a).getInfidx());
            accountedCnt.add(list.get(a).getAccountedCnt());
            orgLogoId.add(list.get(a).getOrgLogoId());
            fromExim.add(list.get(a).getFromExim());
            frgTypeCode.add(list.get(a).getFrgTypeCode());
            eximfcType.add(list.get(a).getEximfcType());
            fromOrdWithPay.add(list.get(a).getFromOrdWithPay());
            projectRef.add(list.get(a).getProjectRef());
            wFlowCardRef.add(list.get(a).getwFlowCardRef());
            status.add(list.get(a).getStatus());
            deductionPart1.add(list.get(a).getDeductionPart1());
            deductionPart2.add(list.get(a).getDeductionPart2());
            totalExAddTax.add(list.get(a).getTotalExAddTax());
            exAccounted.add(list.get(a).getExAccounted());
            fromBank.add(list.get(a).getFromBank());
            bnTransRef.add(list.get(a).getBnTransRef());
            affectCollatrl.add(list.get(a).getAffectCollatrl());
            grpFirmTrns.add(list.get(a).getGrpFirmTrns());
            affectRisk.add(list.get(a).getAffectRisk());
            controlInfo.add(list.get(a).getControlInfo());
            postTransferInfo.add(list.get(a).getPostTransferInfo());
            taxFreeChx.add(list.get(a).getTaxFreeChx());
            passportNo.add(list.get(a).getPassportNo());
            creditCardNo.add(list.get(a).getCreditCardNo());
        }
        jsonObject.setObject("LOGICALREF", logicalRef);
        jsonObject.setObject("GRPCODE", grpCode);
        jsonObject.setObject("TRCODE", trCode);
        jsonObject.setObject("FICHENO", ficheNo);
        jsonObject.setObject("DATE_", date);
        jsonObject.setObject("TIME_", time);
        jsonObject.setObject("DOCODE", doCode);
        jsonObject.setObject("SPECODE", specode);
        jsonObject.setObject("CYPHCODE", cyphCode);
        jsonObject.setObject("CLIENTREF", clientRef);
        jsonObject.setObject("RECVREF", recvRef);
        jsonObject.setObject("CENTERREF", centerRef);
        jsonObject.setObject("ACCOUNTREF", accountRef);
        jsonObject.setObject("SOURCEINDEX", sourceIndex);
        jsonObject.setObject("SOURCECOSTGRP", sourceCostGrp);
        jsonObject.setObject("CANCELLED", cancelled);
        jsonObject.setObject("ACCOUNTED", accounted);
        jsonObject.setObject("PAIDINCASH", paidInCash);
        jsonObject.setObject("FROMKASA", fromKasa);
        jsonObject.setObject("ENTEGSET", entegSet);
        jsonObject.setObject("VAT", vat);
        jsonObject.setObject("ADDDISCOUNTS", addDiscounts);
        jsonObject.setObject("TOTALDISCOUNTS", totalDiscounts);
        jsonObject.setObject("TOTALDISCOUNTED", totalDiscounted);
        jsonObject.setObject("ADDEXPENSES", addExpenses);
        jsonObject.setObject("TOTALEXPENSES", totalExpenses);
        jsonObject.setObject("DISTEXPENSE", distExpense);
        jsonObject.setObject("TOTALDEPOZITO", totalDeposito);
        jsonObject.setObject("TOTALPROMOTIONS", totalPromotions);
        jsonObject.setObject("VATINCGROSS", vatIncGross);
        jsonObject.setObject("TOTALVAT", totalVat);
        jsonObject.setObject("GROSSTOTAL", grossTotal);
        jsonObject.setObject("NETTOTAL", netTotal);
        jsonObject.setObject("GENEXP1", genexp1);
        jsonObject.setObject("GENEXP2", genexp2);
        jsonObject.setObject("GENEXP3", genexp3);
        jsonObject.setObject("GENEXP4", genexp4);
        jsonObject.setObject("INTERESTAPP", interestApp);
        jsonObject.setObject("TRCURR", trCurr);
        jsonObject.setObject("TRRATE", trRate);
        jsonObject.setObject("TRNET", trNet);
        jsonObject.setObject("REPORTRATE", reportRate);
        jsonObject.setObject("REPORTNET", reportNet);
        jsonObject.setObject("ONLYONEPAYLINE", onlyOnePayLine);
        jsonObject.setObject("KASTRANSREF", kastransRef);
        jsonObject.setObject("PAYDEFREF", payDefRef);
        jsonObject.setObject("PRINTCNT", printCnt);
        jsonObject.setObject("GVATINC", gVatInc);
        jsonObject.setObject("BRANCH", branch);
        jsonObject.setObject("DEPARTMENT", department);
        jsonObject.setObject("ACCFICHEREF", accFisheRef);
        jsonObject.setObject("ADDEXPACCREF", addExpAccRef);
        jsonObject.setObject("ADDEXPCENTREF", addExpCentRef);
        jsonObject.setObject("DECPRDIFF", decprdiff);
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
        jsonObject.setObject("SALESMANREF", salesManRef);
        jsonObject.setObject("CANCELLEDACC", cancelledAcc);
        jsonObject.setObject("SHPTYPCOD", shpTypeCode);
        jsonObject.setObject("SHPAGNCOD", shpAgnCode);
        jsonObject.setObject("TRACKNR", trackNr);
        jsonObject.setObject("GENEXCTYP", genexcTyp);
        jsonObject.setObject("LINEEXCTYP", lineExcTyp);
        jsonObject.setObject("TRADINGGRP", tradingGrp);
        jsonObject.setObject("TEXTINC", textInc);
        jsonObject.setObject("SITEID", siteId);
        jsonObject.setObject("RECSTATUS", recStatus);
        jsonObject.setObject("ORGLOGICREF", orgLogRef);
        jsonObject.setObject("FACTORYNR", factoryNr);
        jsonObject.setObject("WFSTATUS", wfStatus);
        jsonObject.setObject("SHIPINFOREF", shipInfoRef);
        jsonObject.setObject("DISTORDERREF", distOrderRef);
        jsonObject.setObject("SENDCNT", sendCnt);
        jsonObject.setObject("DLVCLIENT", dlvClient);
        jsonObject.setObject("COSTOFSALEFCREF", costOfSaleFcRef);
        jsonObject.setObject("OPSTAT", opStat);
        jsonObject.setObject("DOCTRACKINGNR", docTrackinNr);
        jsonObject.setObject("TOTALADDTAX", totalAddTax);
        jsonObject.setObject("PAYMENTTYPE", paymentType);
        jsonObject.setObject("INFIDX", infidx);
        jsonObject.setObject("ACCOUNTEDCNT", accountedCnt);
        jsonObject.setObject("ORGLOGOID", orgLogoId);
        jsonObject.setObject("FROMEXIM", fromExim);
        jsonObject.setObject("FRGTYPCOD", frgTypeCode);
        jsonObject.setObject("EXIMFCTYPE", eximfcType);
        jsonObject.setObject("FROMORDWITHPAY", fromOrdWithPay);
        jsonObject.setObject("PROJECTREF", projectRef);
        jsonObject.setObject("WFLOWCRDREF", wFlowCardRef);
        jsonObject.setObject("STATUS", status);
        jsonObject.setObject("DEDUCTIONPART1", deductionPart1);
        jsonObject.setObject("DEDUCTIONPART2", deductionPart2);
        jsonObject.setObject("TOTALEXADDTAX", totalExAddTax);
        jsonObject.setObject("EXACCOUNTED", exAccounted);
        jsonObject.setObject("FROMBANK", fromBank);
        jsonObject.setObject("BNTRANSREF", bnTransRef);
        jsonObject.setObject("AFFECTCOLLATRL", affectCollatrl);
        jsonObject.setObject("GRPFIRMTRANS", grpFirmTrns);
        jsonObject.setObject("AFFECTRISK", affectRisk);
        jsonObject.setObject("CONTROLINFO", controlInfo);
        jsonObject.setObject("POSTRANSFERINFO", postTransferInfo);
        jsonObject.setObject("TAXFREECHX", taxFreeChx);
        jsonObject.setObject("PASSPORTNO", passportNo);
        jsonObject.setObject("CREDITCARDNO", creditCardNo);
        return jsonObject;
    }
}

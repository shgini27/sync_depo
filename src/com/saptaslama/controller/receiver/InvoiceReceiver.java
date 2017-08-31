/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.receiver;

import com.saptaslama.controller.sender.Sender;
import com.saptaslama.model.Invoice;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class InvoiceReceiver extends Sender{
    //metod to get ArrayList<model> from json object
    public ArrayList<Invoice> getInvoiceArrayList(JSONObject jObject) {

        ArrayList<Invoice> tableValue = new ArrayList<>();
        Invoice invoice;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray grpCode = (JSONArray) jObject.get("GRPCODE");
        JSONArray trCode = (JSONArray) jObject.get("TRCODE");
        JSONArray ficheNo = (JSONArray) jObject.get("FICHENO");
        JSONArray date = (JSONArray) jObject.get("DATE_");
        JSONArray time = (JSONArray) jObject.get("TIME_");
        JSONArray doCode = (JSONArray) jObject.get("DOCODE");
        JSONArray specode = (JSONArray) jObject.get("SPECODE");
        JSONArray cyphCode = (JSONArray) jObject.get("CYPHCODE");
        JSONArray clientRef = (JSONArray) jObject.get("CLIENTREF");
        JSONArray recvRef = (JSONArray) jObject.get("RECVREF");
        JSONArray CenterRef = (JSONArray) jObject.get("CENTERREF");
        JSONArray accountRef = (JSONArray) jObject.get("ACCOUNTREF");
        JSONArray sourceIndex = (JSONArray) jObject.get("SOURCEINDEX");
        JSONArray sourceCostGrp = (JSONArray) jObject.get("SOURCECOSTGRP");
        JSONArray cancelled = (JSONArray) jObject.get("CANCELLED");
        JSONArray accounted = (JSONArray) jObject.get("ACCOUNTED");
        JSONArray paidInCash = (JSONArray) jObject.get("PAIDINCASH");
        JSONArray fromKasa = (JSONArray) jObject.get("FROMKASA");
        JSONArray entegSet = (JSONArray) jObject.get("ENTEGSET");
        JSONArray vat = (JSONArray) jObject.get("VAT");
        JSONArray addDiscounts = (JSONArray) jObject.get("ADDDISCOUNTS");
        JSONArray totalDiscounts = (JSONArray) jObject.get("TOTALDISCOUNTS");
        JSONArray totalDiscounted = (JSONArray) jObject.get("TOTALDISCOUNTED");
        JSONArray addExpenses = (JSONArray) jObject.get("ADDEXPENSES");
        JSONArray totalExpenses = (JSONArray) jObject.get("TOTALEXPENSES");
        JSONArray distExpense = (JSONArray) jObject.get("DISTEXPENSE");
        JSONArray totalDeposito = (JSONArray) jObject.get("TOTALDEPOZITO");
        JSONArray totalPromotions = (JSONArray) jObject.get("TOTALPROMOTIONS");
        JSONArray vatIncGross = (JSONArray) jObject.get("VATINCGROSS");
        JSONArray totalVat = (JSONArray) jObject.get("TOTALVAT");
        JSONArray grossTotal = (JSONArray) jObject.get("GROSSTOTAL");
        JSONArray netTotal = (JSONArray) jObject.get("NETTOTAL");
        JSONArray genexp1 = (JSONArray) jObject.get("GENEXP1");
        JSONArray genexp2 = (JSONArray) jObject.get("GENEXP2");
        JSONArray genexp3 = (JSONArray) jObject.get("GENEXP3");
        JSONArray genexp4 = (JSONArray) jObject.get("GENEXP4");
        JSONArray interestApp = (JSONArray) jObject.get("INTERESTAPP");
        JSONArray trCurr = (JSONArray) jObject.get("TRCURR");
        JSONArray trRate = (JSONArray) jObject.get("TRRATE");
        JSONArray trNet = (JSONArray) jObject.get("TRNET");
        JSONArray reportRate = (JSONArray) jObject.get("REPORTRATE");
        JSONArray reportNet = (JSONArray) jObject.get("REPORTNET");
        JSONArray onlyOnePayLine = (JSONArray) jObject.get("ONLYONEPAYLINE");
        JSONArray kastransRef = (JSONArray) jObject.get("KASTRANSREF");
        JSONArray payDefRef = (JSONArray) jObject.get("PAYDEFREF");
        JSONArray printCnt = (JSONArray) jObject.get("PRINTCNT");
        JSONArray gVatInc = (JSONArray) jObject.get("GVATINC");
        JSONArray branch = (JSONArray) jObject.get("BRANCH");
        JSONArray department = (JSONArray) jObject.get("DEPARTMENT");
        JSONArray accFisheRef = (JSONArray) jObject.get("ACCFICHEREF");
        JSONArray addExpAccRef = (JSONArray) jObject.get("ADDEXPACCREF");
        JSONArray addExpCentRef = (JSONArray) jObject.get("ADDEXPCENTREF");
        JSONArray decprdiff = (JSONArray) jObject.get("DECPRDIFF");
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
        JSONArray salesManRef = (JSONArray) jObject.get("SALESMANREF");
        JSONArray cancelledAcc = (JSONArray) jObject.get("CANCELLEDACC");
        JSONArray shpTypeCode = (JSONArray) jObject.get("SHPTYPCOD");
        JSONArray shpAgnCode = (JSONArray) jObject.get("SHPAGNCOD");
        JSONArray trackNr = (JSONArray) jObject.get("TRACKNR");
        JSONArray genexcTyp = (JSONArray) jObject.get("GENEXCTYP");
        JSONArray lineExcTyp = (JSONArray) jObject.get("LINEEXCTYP");
        JSONArray tradingGrp = (JSONArray) jObject.get("TRADINGGRP");
        JSONArray textInc = (JSONArray) jObject.get("TEXTINC");
        JSONArray siteId = (JSONArray) jObject.get("SITEID");
        JSONArray recStatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray orgLogRef = (JSONArray) jObject.get("ORGLOGICREF");
        JSONArray factoryNr = (JSONArray) jObject.get("FACTORYNR");
        JSONArray wfStatus = (JSONArray) jObject.get("WFSTATUS");
        JSONArray shipInfoRef = (JSONArray) jObject.get("SHIPINFOREF");
        JSONArray distOrderRef = (JSONArray) jObject.get("DISTORDERREF");
        JSONArray sendCnt = (JSONArray) jObject.get("SENDCNT");
        JSONArray dlvClient = (JSONArray) jObject.get("DLVCLIENT");
        JSONArray costOfSaleFcRef = (JSONArray) jObject.get("COSTOFSALEFCREF");
        JSONArray opStat = (JSONArray) jObject.get("OPSTAT");
        JSONArray docTrackinNr = (JSONArray) jObject.get("DOCTRACKINGNR");
        JSONArray totalAddTax = (JSONArray) jObject.get("TOTALADDTAX");
        JSONArray paymentType = (JSONArray) jObject.get("PAYMENTTYPE");
        JSONArray infidx = (JSONArray) jObject.get("INFIDX");
        JSONArray accountedCnt = (JSONArray) jObject.get("ACCOUNTEDCNT");
        JSONArray orgLogoId = (JSONArray) jObject.get("ORGLOGOID");
        JSONArray fromExim = (JSONArray) jObject.get("FROMEXIM");
        JSONArray frgTypeCode = (JSONArray) jObject.get("FRGTYPCOD");
        JSONArray eximfcType = (JSONArray) jObject.get("EXIMFCTYPE");
        JSONArray fromOrdWithPay = (JSONArray) jObject.get("FROMORDWITHPAY");
        JSONArray projectRef = (JSONArray) jObject.get("PROJECTREF");
        JSONArray wFlowCardRef = (JSONArray) jObject.get("WFLOWCRDREF");
        JSONArray status = (JSONArray) jObject.get("STATUS");
        JSONArray deductionPart1 = (JSONArray) jObject.get("DEDUCTIONPART1");
        JSONArray deductionPart2 = (JSONArray) jObject.get("DEDUCTIONPART2");
        JSONArray totalExAddTax = (JSONArray) jObject.get("TOTALEXADDTAX");
        JSONArray exAccounted = (JSONArray) jObject.get("EXACCOUNTED");
        JSONArray fromBank = (JSONArray) jObject.get("FROMBANK");
        JSONArray bnTransRef = (JSONArray) jObject.get("BNTRANSREF");
        JSONArray affectCollatrl = (JSONArray) jObject.get("AFFECTCOLLATRL");
        JSONArray grpFirmTrns = (JSONArray) jObject.get("GRPFIRMTRANS");
        JSONArray affectRisk = (JSONArray) jObject.get("AFFECTRISK");
        JSONArray controlInfo = (JSONArray) jObject.get("CONTROLINFO");
        JSONArray postTransferInfo = (JSONArray) jObject.get("POSTRANSFERINFO");
        JSONArray taxFreeChx = (JSONArray) jObject.get("TAXFREECHX");
        JSONArray passportNo = (JSONArray) jObject.get("PASSPORTNO");
        JSONArray creditCardNo = (JSONArray) jObject.get("CREDITCARDNO");

        for (int i = 0; i < logicalRef.size(); i++) {
            invoice = new Invoice(
                    Integer.parseInt(logicalRef.get(i).toString()), Short.parseShort(grpCode.get(i).toString()),
                    Short.parseShort(trCode.get(i).toString()), ficheNo.get(i).toString(),
                    date.get(i).toString(), Integer.parseInt(time.get(i).toString()),
                    doCode.get(i).toString(), specode.get(i).toString(),
                    cyphCode.get(i).toString(), Integer.parseInt(clientRef.get(i).toString()),
                    Integer.parseInt(recvRef.get(i).toString()), Integer.parseInt(CenterRef.get(i).toString()),
                    Integer.parseInt(accountRef.get(i).toString()), Short.parseShort(sourceIndex.get(i).toString()),
                    Short.parseShort(sourceCostGrp.get(i).toString()), Short.parseShort(cancelled.get(i).toString()),
                    Short.parseShort(accounted.get(i).toString()), Short.parseShort(paidInCash.get(i).toString()),
                    Short.parseShort(fromKasa.get(i).toString()), Short.parseShort(entegSet.get(i).toString()),
                    Float.parseFloat(vat.get(i).toString()), Float.parseFloat(addDiscounts.get(i).toString()),
                    Float.parseFloat(totalDiscounts.get(i).toString()), Float.parseFloat(totalDiscounted.get(i).toString()),
                    Float.parseFloat(addExpenses.get(i).toString()), Float.parseFloat(totalExpenses.get(i).toString()),
                    Float.parseFloat(distExpense.get(i).toString()), Float.parseFloat(totalDeposito.get(i).toString()),
                    Float.parseFloat(totalPromotions.get(i).toString()), Float.parseFloat(vatIncGross.get(i).toString()),
                    Float.parseFloat(totalVat.get(i).toString()), Float.parseFloat(grossTotal.get(i).toString()),
                    Float.parseFloat(netTotal.get(i).toString()), genexp1.get(i).toString(),
                    genexp2.get(i).toString(), genexp3.get(i).toString(),
                    genexp4.get(i).toString(), Float.parseFloat(interestApp.get(i).toString()),
                    Short.parseShort(trCurr.get(i).toString()), Float.parseFloat(trRate.get(i).toString()),
                    Float.parseFloat(trNet.get(i).toString()), Float.parseFloat(reportRate.get(i).toString()),
                    Float.parseFloat(reportNet.get(i).toString()), Short.parseShort(onlyOnePayLine.get(i).toString()),
                    Integer.parseInt(kastransRef.get(i).toString()), Integer.parseInt(payDefRef.get(i).toString()),
                    Short.parseShort(printCnt.get(i).toString()), Short.parseShort(gVatInc.get(i).toString()),
                    Short.parseShort(branch.get(i).toString()), Short.parseShort(department.get(i).toString()),
                    Integer.parseInt(accFisheRef.get(i).toString()), Integer.parseInt(addExpAccRef.get(i).toString()),
                    Integer.parseInt(addExpCentRef.get(i).toString()), Short.parseShort(decprdiff.get(i).toString()),
                    Short.parseShort(capiblockCreatedby.get(i).toString()), capiblockCreadeddate.get(i).toString(),
                    Short.parseShort(capiblockCreatedhour.get(i).toString()), Short.parseShort(capiblockCreatedmin.get(i).toString()),
                    Short.parseShort(capiblockCreatedsec.get(i).toString()), Short.parseShort(capiblockModifiedby.get(i).toString()),
                    capiblockModifieddate.get(i).toString(), Short.parseShort(capiblockModifiedhour.get(i).toString()),
                    Short.parseShort(capiblockModifiedmin.get(i).toString()), Short.parseShort(capiblockModifiedsec.get(i).toString()),
                    Integer.parseInt(salesManRef.get(i).toString()), Short.parseShort(cancelledAcc.get(i).toString()),
                    shpTypeCode.get(i).toString(), shpAgnCode.get(i).toString(),
                    trackNr.get(i).toString(), Short.parseShort(genexcTyp.get(i).toString()),
                    Short.parseShort(lineExcTyp.get(i).toString()), tradingGrp.get(i).toString(),
                    Short.parseShort(textInc.get(i).toString()), Short.parseShort(siteId.get(i).toString()),
                    Short.parseShort(recStatus.get(i).toString()), Integer.parseInt(orgLogRef.get(i).toString()),
                    Short.parseShort(factoryNr.get(i).toString()), Integer.parseInt(wfStatus.get(i).toString()),
                    Integer.parseInt(shipInfoRef.get(i).toString()), Integer.parseInt(distOrderRef.get(i).toString()),
                    Short.parseShort(sendCnt.get(i).toString()), Short.parseShort(dlvClient.get(i).toString()),
                    Integer.parseInt(costOfSaleFcRef.get(i).toString()), Short.parseShort(opStat.get(i).toString()),
                    docTrackinNr.get(i).toString(), Float.parseFloat(totalAddTax.get(i).toString()),
                    Short.parseShort(paymentType.get(i).toString()), Float.parseFloat(infidx.get(i).toString()),
                    Short.parseShort(accountedCnt.get(i).toString()), orgLogoId.get(i).toString(),
                    Short.parseShort(fromExim.get(i).toString()), frgTypeCode.get(i).toString(),
                    Short.parseShort(eximfcType.get(i).toString()), Short.parseShort(fromOrdWithPay.get(i).toString()),
                    Integer.parseInt(projectRef.get(i).toString()), Integer.parseInt(wFlowCardRef.get(i).toString()),
                    Short.parseShort(status.get(i).toString()), Short.parseShort(deductionPart1.get(i).toString()),
                    Short.parseShort(deductionPart2.get(i).toString()), Float.parseFloat(totalExAddTax.get(i).toString()),
                    Short.parseShort(exAccounted.get(i).toString()), Short.parseShort(fromBank.get(i).toString()),
                    Integer.parseInt(bnTransRef.get(i).toString()), Short.parseShort(affectCollatrl.get(i).toString()),
                    Short.parseShort(grpFirmTrns.get(i).toString()), Short.parseShort(affectRisk.get(i).toString()),
                    Short.parseShort(controlInfo.get(i).toString()), Short.parseShort(postTransferInfo.get(i).toString()),
                    Short.parseShort(taxFreeChx.get(i).toString()), passportNo.get(i).toString(),
                    creditCardNo.get(i).toString());

            tableValue.add(invoice);
        }
        return tableValue;
    }
}

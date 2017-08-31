/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.receiver;

import com.saptaslama.controller.sender.Sender;
import com.saptaslama.model.StFiche;
import com.saptaslama.model.StLine;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class StFicheReceiver extends Sender{
    
    public ArrayList<StFiche> getStFicheArrayList(JSONObject jObject) {

        ArrayList<StFiche> tableValue = new ArrayList<>();
        StFiche card;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray grpCode = (JSONArray) jObject.get("GRPCODE");
        JSONArray trCode = (JSONArray) jObject.get("TRCODE");
        JSONArray ioCode = (JSONArray) jObject.get("IOCODE");
        JSONArray ficheNo = (JSONArray) jObject.get("FICHENO");
        JSONArray date = (JSONArray) jObject.get("DATE_");
        JSONArray fTime = (JSONArray) jObject.get("FTIME");
        JSONArray doCode = (JSONArray) jObject.get("DOCODE");
        JSONArray invNo = (JSONArray) jObject.get("INVNO");
        JSONArray specode = (JSONArray) jObject.get("SPECODE");
        JSONArray cyphCode = (JSONArray) jObject.get("CYPHCODE");
        JSONArray invoiceRef = (JSONArray) jObject.get("INVOICEREF");
        JSONArray clientRef = (JSONArray) jObject.get("CLIENTREF");
        JSONArray recvRef = (JSONArray) jObject.get("RECVREF");
        JSONArray accountRef = (JSONArray) jObject.get("ACCOUNTREF");
        JSONArray centerRef = (JSONArray) jObject.get("CENTERREF");
        JSONArray prodOrderRef = (JSONArray) jObject.get("PRODORDERREF");
        JSONArray pOrderFicheNo = (JSONArray) jObject.get("PORDERFICHENO");
        JSONArray sourceType = (JSONArray) jObject.get("SOURCETYPE");
        JSONArray sourceIndex = (JSONArray) jObject.get("SOURCEINDEX");
        JSONArray sourceWsRef = (JSONArray) jObject.get("SOURCEWSREF");
        JSONArray sourcePolnRef = (JSONArray) jObject.get("SOURCEPOLNREF");
        JSONArray sourceCostGrp = (JSONArray) jObject.get("SOURCECOSTGRP");
        JSONArray destType = (JSONArray) jObject.get("DESTTYPE");
        JSONArray destIndex = (JSONArray) jObject.get("DESTINDEX");
        JSONArray destwsRef = (JSONArray) jObject.get("DESTWSREF");
        JSONArray destPolnRef = (JSONArray) jObject.get("DESTPOLNREF");
        JSONArray destCostGrp = (JSONArray) jObject.get("DESTCOSTGRP");
        JSONArray factoryNr = (JSONArray) jObject.get("FACTORYNR");
        JSONArray branch = (JSONArray) jObject.get("BRANCH");
        JSONArray department = (JSONArray) jObject.get("DEPARTMENT");
        JSONArray compBranch = (JSONArray) jObject.get("COMPBRANCH");
        JSONArray compDepartment = (JSONArray) jObject.get("COMPDEPARTMENT");
        JSONArray compFactory = (JSONArray) jObject.get("COMPFACTORY");
        JSONArray prodStat = (JSONArray) jObject.get("PRODSTAT");
        JSONArray devir = (JSONArray) jObject.get("DEVIR");
        JSONArray cancelled = (JSONArray) jObject.get("CANCELLED");
        JSONArray billed = (JSONArray) jObject.get("BILLED");
        JSONArray accounted = (JSONArray) jObject.get("ACCOUNTED");
        JSONArray updCurr = (JSONArray) jObject.get("UPDCURR");
        JSONArray inUse = (JSONArray) jObject.get("INUSE");
        JSONArray invcInd = (JSONArray) jObject.get("INVKIND");
        JSONArray addDiscounts = (JSONArray) jObject.get("ADDDISCOUNTS");
        JSONArray totalDiscounts = (JSONArray) jObject.get("TOTALDISCOUNTS");
        JSONArray totalDiscounted = (JSONArray) jObject.get("TOTALDISCOUNTED");
        JSONArray addExpenses = (JSONArray) jObject.get("ADDEXPENSES");
        JSONArray totalExpenses = (JSONArray) jObject.get("TOTALEXPENSES");
        JSONArray totalDeposito = (JSONArray) jObject.get("TOTALDEPOZITO");
        JSONArray totalPromotions = (JSONArray) jObject.get("TOTALPROMOTIONS");
        JSONArray totalVat = (JSONArray) jObject.get("TOTALVAT");
        JSONArray grossTotal = (JSONArray) jObject.get("GROSSTOTAL");
        JSONArray netTotal = (JSONArray) jObject.get("NETTOTAL");
        JSONArray genexp1 = (JSONArray) jObject.get("GENEXP1");
        JSONArray genexp2 = (JSONArray) jObject.get("GENEXP2");
        JSONArray genexp3 = (JSONArray) jObject.get("GENEXP3");
        JSONArray genexp4 = (JSONArray) jObject.get("GENEXP4");
        JSONArray reportRate = (JSONArray) jObject.get("REPORTRATE");
        JSONArray reportNet = (JSONArray) jObject.get("REPORTNET");
        JSONArray extenRef = (JSONArray) jObject.get("EXTENREF");
        JSONArray payDefRef = (JSONArray) jObject.get("PAYDEFREF");
        JSONArray printCnt = (JSONArray) jObject.get("PRINTCNT");
        JSONArray ficheCnt = (JSONArray) jObject.get("FICHECNT");
        JSONArray accFicheRef = (JSONArray) jObject.get("ACCFICHEREF");
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
        JSONArray wfStatus = (JSONArray) jObject.get("WFSTATUS");
        JSONArray shipInfoRef = (JSONArray) jObject.get("SHIPINFOREF");
        JSONArray distOrderRef = (JSONArray) jObject.get("DISTORDERREF");
        JSONArray sendCnt = (JSONArray) jObject.get("SENDCNT");
        JSONArray dlvClient = (JSONArray) jObject.get("DLVCLIENT");
        JSONArray docTrackingGnr = (JSONArray) jObject.get("DOCTRACKINGNR");
        JSONArray addTaxCalc = (JSONArray) jObject.get("ADDTAXCALC");
        JSONArray totalAddTax = (JSONArray) jObject.get("TOTALADDTAX");
        JSONArray ugirTrackingNo = (JSONArray) jObject.get("UGIRTRACKINGNO");
        JSONArray qProdfcRef = (JSONArray) jObject.get("QPRODFCREF");
        JSONArray vaaccRef = (JSONArray) jObject.get("VAACCREF");
        JSONArray vaCenterRef = (JSONArray) jObject.get("VACENTERREF");
        JSONArray orgLogoId = (JSONArray) jObject.get("ORGLOGOID");
        JSONArray fromExim = (JSONArray) jObject.get("FROMEXIM");
        JSONArray frgTypeCode = (JSONArray) jObject.get("FRGTYPCOD");
        JSONArray trCurr = (JSONArray) jObject.get("TRCURR");
        JSONArray trRate = (JSONArray) jObject.get("TRRATE");
        JSONArray trNet = (JSONArray) jObject.get("TRNET");
        JSONArray eximwhfcRef = (JSONArray) jObject.get("EXIMWHFCREF");
        JSONArray eximfcType = (JSONArray) jObject.get("EXIMFCTYPE");
        JSONArray mainstfcRef = (JSONArray) jObject.get("MAINSTFCREF");
        JSONArray fromOrdWithPay = (JSONArray) jObject.get("FROMORDWITHPAY");
        JSONArray projectRef = (JSONArray) jObject.get("PROJECTREF");
        JSONArray wFlowCardRef = (JSONArray) jObject.get("WFLOWCRDREF");
        JSONArray status = (JSONArray) jObject.get("STATUS");
        JSONArray updTrCurr = (JSONArray) jObject.get("UPDTRCURR");
        JSONArray totalExAddTax = (JSONArray) jObject.get("TOTALEXADDTAX");
        JSONArray affectCollatrl = (JSONArray) jObject.get("AFFECTCOLLATRL");
        JSONArray deductionPart1 = (JSONArray) jObject.get("DEDUCTIONPART1");
        JSONArray deductionPart2 = (JSONArray) jObject.get("DEDUCTIONPART2");
        JSONArray grpFirmTrans = (JSONArray) jObject.get("GRPFIRMTRANS");
        JSONArray affectRisk = (JSONArray) jObject.get("AFFECTRISK");

        for (int i = 0; i < logicalRef.size(); i++) {
            card = new StFiche(
                    Integer.parseInt(logicalRef.get(i).toString()), Short.parseShort(grpCode.get(i).toString()),
                    Short.parseShort(trCode.get(i).toString()), Short.parseShort(ioCode.get(i).toString()),
                    ficheNo.get(i).toString(), date.get(i).toString(),
                    Integer.parseInt(fTime.get(i).toString()), doCode.get(i).toString(),
                    invNo.get(i).toString(), specode.get(i).toString(),
                    cyphCode.get(i).toString(), Integer.parseInt(invoiceRef.get(i).toString()),
                    Integer.parseInt(clientRef.get(i).toString()), Integer.parseInt(recvRef.get(i).toString()),
                    Integer.parseInt(accountRef.get(i).toString()), Integer.parseInt(centerRef.get(i).toString()),
                    Integer.parseInt(prodOrderRef.get(i).toString()), pOrderFicheNo.get(i).toString(),
                    Short.parseShort(sourceType.get(i).toString()), Short.parseShort(sourceIndex.get(i).toString()),
                    Integer.parseInt(sourceWsRef.get(i).toString()), Integer.parseInt(sourcePolnRef.get(i).toString()),
                    Short.parseShort(sourceCostGrp.get(i).toString()), Short.parseShort(destType.get(i).toString()),
                    Short.parseShort(destIndex.get(i).toString()), Integer.parseInt(destwsRef.get(i).toString()),
                    Integer.parseInt(destPolnRef.get(i).toString()), Short.parseShort(destCostGrp.get(i).toString()),
                    Short.parseShort(factoryNr.get(i).toString()), Short.parseShort(branch.get(i).toString()),
                    Short.parseShort(department.get(i).toString()), Short.parseShort(compBranch.get(i).toString()),
                    Short.parseShort(compDepartment.get(i).toString()), Short.parseShort(compFactory.get(i).toString()),
                    Short.parseShort(prodStat.get(i).toString()), Short.parseShort(devir.get(i).toString()),
                    Short.parseShort(cancelled.get(i).toString()), Short.parseShort(billed.get(i).toString()),
                    Short.parseShort(accounted.get(i).toString()), Short.parseShort(updCurr.get(i).toString()),
                    Short.parseShort(inUse.get(i).toString()), Short.parseShort(invcInd.get(i).toString()),
                    Float.parseFloat(addDiscounts.get(i).toString()), Float.parseFloat(totalDiscounts.get(i).toString()),
                    Float.parseFloat(totalDiscounted.get(i).toString()), Float.parseFloat(addExpenses.get(i).toString()),
                    Float.parseFloat(totalExpenses.get(i).toString()), Float.parseFloat(totalDeposito.get(i).toString()),
                    Float.parseFloat(totalPromotions.get(i).toString()), Float.parseFloat(totalVat.get(i).toString()),
                    Float.parseFloat(grossTotal.get(i).toString()), Float.parseFloat(netTotal.get(i).toString()),
                    genexp1.get(i).toString(), genexp2.get(i).toString(),
                    genexp3.get(i).toString(), genexp4.get(i).toString(),
                    Float.parseFloat(reportRate.get(i).toString()), Float.parseFloat(reportNet.get(i).toString()),
                    Integer.parseInt(extenRef.get(i).toString()), Integer.parseInt(payDefRef.get(i).toString()),
                    Short.parseShort(printCnt.get(i).toString()), Short.parseShort(ficheCnt.get(i).toString()),
                    Integer.parseInt(accFicheRef.get(i).toString()), Short.parseShort(capiblockCreatedby.get(i).toString()),
                    capiblockCreadeddate.get(i).toString(), Short.parseShort(capiblockCreatedhour.get(i).toString()),
                    Short.parseShort(capiblockCreatedmin.get(i).toString()), Short.parseShort(capiblockCreatedsec.get(i).toString()),
                    Short.parseShort(capiblockModifiedby.get(i).toString()), capiblockModifieddate.get(i).toString(),
                    Short.parseShort(capiblockModifiedhour.get(i).toString()), Short.parseShort(capiblockModifiedmin.get(i).toString()),
                    Short.parseShort(capiblockModifiedsec.get(i).toString()), Integer.parseInt(salesManRef.get(i).toString()),
                    Short.parseShort(cancelledAcc.get(i).toString()), shpTypeCode.get(i).toString(),
                    shpAgnCode.get(i).toString(), trackNr.get(i).toString(),
                    Short.parseShort(genexcTyp.get(i).toString()), Short.parseShort(lineExcTyp.get(i).toString()),
                    tradingGrp.get(i).toString(), Short.parseShort(textInc.get(i).toString()),
                    Short.parseShort(siteId.get(i).toString()), Short.parseShort(recStatus.get(i).toString()),
                    Integer.parseInt(orgLogRef.get(i).toString()), Integer.parseInt(wfStatus.get(i).toString()),
                    Integer.parseInt(shipInfoRef.get(i).toString()), Integer.parseInt(distOrderRef.get(i).toString()),
                    Short.parseShort(sendCnt.get(i).toString()), Short.parseShort(dlvClient.get(i).toString()),
                    docTrackingGnr.get(i).toString(), Short.parseShort(addTaxCalc.get(i).toString()),
                    Float.parseFloat(totalAddTax.get(i).toString()), ugirTrackingNo.get(i).toString(),
                    Integer.parseInt(qProdfcRef.get(i).toString()), Integer.parseInt(vaaccRef.get(i).toString()),
                    Integer.parseInt(vaCenterRef.get(i).toString()), orgLogoId.get(i).toString(),
                    Short.parseShort(fromExim.get(i).toString()), frgTypeCode.get(i).toString(),
                    Short.parseShort(trCurr.get(i).toString()), Float.parseFloat(trRate.get(i).toString()),
                    Float.parseFloat(trNet.get(i).toString()), Integer.parseInt(eximwhfcRef.get(i).toString()),
                    Short.parseShort(eximfcType.get(i).toString()), Integer.parseInt(mainstfcRef.get(i).toString()),
                    Short.parseShort(fromOrdWithPay.get(i).toString()), Integer.parseInt(projectRef.get(i).toString()),
                    Integer.parseInt(wFlowCardRef.get(i).toString()), Short.parseShort(status.get(i).toString()),
                    Short.parseShort(updTrCurr.get(i).toString()), Float.parseFloat(totalExAddTax.get(i).toString()),
                    Short.parseShort(affectCollatrl.get(i).toString()), Short.parseShort(deductionPart1.get(i).toString()),
                    Short.parseShort(deductionPart2.get(i).toString()), Short.parseShort(grpFirmTrans.get(i).toString()),
                    Short.parseShort(affectRisk.get(i).toString()));

            tableValue.add(card);
        }
        return tableValue;
    }
    
    public ArrayList<StLine> getStLineArrayList(JSONObject jObject) {

        ArrayList<StLine> tableValue = new ArrayList<>();
        StLine line;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray stockRef = (JSONArray) jObject.get("STOCKREF");
        JSONArray lineType = (JSONArray) jObject.get("LINETYPE");
        JSONArray prevLineRef = (JSONArray) jObject.get("PREVLINEREF");
        JSONArray prevLineNo = (JSONArray) jObject.get("PREVLINENO");
        JSONArray detLine = (JSONArray) jObject.get("DETLINE");
        JSONArray trCode = (JSONArray) jObject.get("TRCODE");
        JSONArray date = (JSONArray) jObject.get("DATE_");
        JSONArray fTime = (JSONArray) jObject.get("FTIME");
        JSONArray globTrans = (JSONArray) jObject.get("GLOBTRANS");
        JSONArray calcType = (JSONArray) jObject.get("CALCTYPE");
        JSONArray prodOrderRef = (JSONArray) jObject.get("PRODORDERREF");
        JSONArray sourceType = (JSONArray) jObject.get("SOURCETYPE");
        JSONArray sourceIndex = (JSONArray) jObject.get("SOURCEINDEX");
        JSONArray sourceCostGrp = (JSONArray) jObject.get("SOURCECOSTGRP");
        JSONArray sourceWsRef = (JSONArray) jObject.get("SOURCEWSREF");// BOW GELIO???
        JSONArray sourcePolnRef = (JSONArray) jObject.get("SOURCEPOLNREF");
        JSONArray destType = (JSONArray) jObject.get("DESTTYPE");
        JSONArray destIndex = (JSONArray) jObject.get("DESTINDEX");
        JSONArray destCostGrp = (JSONArray) jObject.get("DESTCOSTGRP");
        JSONArray destWsRef = (JSONArray) jObject.get("DESTWSREF");
        JSONArray destPolnRef = (JSONArray) jObject.get("DESTPOLNREF");
        JSONArray factoryNr = (JSONArray) jObject.get("FACTORYNR");
        JSONArray ioCode = (JSONArray) jObject.get("IOCODE");
        JSONArray stFicheRef = (JSONArray) jObject.get("STFICHEREF");
        JSONArray stFicheLnNo = (JSONArray) jObject.get("STFICHELNNO");
        JSONArray invoiceRef = (JSONArray) jObject.get("INVOICEREF");
        JSONArray invoiceLnNo = (JSONArray) jObject.get("INVOICELNNO");
        JSONArray clientRef = (JSONArray) jObject.get("CLIENTREF");
        JSONArray ordTransRef = (JSONArray) jObject.get("ORDTRANSREF");
        JSONArray ordFicheRef = (JSONArray) jObject.get("ORDFICHEREF");
        JSONArray centerRef = (JSONArray) jObject.get("CENTERREF");
        JSONArray accountRef = (JSONArray) jObject.get("ACCOUNTREF");
        JSONArray vataccRef = (JSONArray) jObject.get("VATACCREF");
        JSONArray vatCenterRef = (JSONArray) jObject.get("VATCENTERREF");
        JSONArray praccRef = (JSONArray) jObject.get("PRACCREF");
        JSONArray prCenterRef = (JSONArray) jObject.get("PRCENTERREF");
        JSONArray prvatAccRef = (JSONArray) jObject.get("PRVATACCREF");
        JSONArray prvatCenRef = (JSONArray) jObject.get("PRVATCENREF");
        JSONArray promRef = (JSONArray) jObject.get("PROMREF");
        JSONArray payDefRef = (JSONArray) jObject.get("PAYDEFREF");
        JSONArray specode = (JSONArray) jObject.get("SPECODE");
        JSONArray delyvryCode = (JSONArray) jObject.get("DELVRYCODE");
        JSONArray amount = (JSONArray) jObject.get("AMOUNT");
        JSONArray price = (JSONArray) jObject.get("PRICE");
        JSONArray total = (JSONArray) jObject.get("TOTAL");
        JSONArray prCurr = (JSONArray) jObject.get("PRCURR");
        JSONArray prPrice = (JSONArray) jObject.get("PRPRICE");
        JSONArray trCurr = (JSONArray) jObject.get("TRCURR");
        JSONArray trRate = (JSONArray) jObject.get("TRRATE");
        JSONArray reportRate = (JSONArray) jObject.get("REPORTRATE");
        JSONArray distCost = (JSONArray) jObject.get("DISTCOST");
        JSONArray distDisc = (JSONArray) jObject.get("DISTDISC");
        JSONArray distExp = (JSONArray) jObject.get("DISTEXP");
        JSONArray distProm = (JSONArray) jObject.get("DISTPROM");
        JSONArray discPer = (JSONArray) jObject.get("DISCPER");
        JSONArray lineExp = (JSONArray) jObject.get("LINEEXP");
        JSONArray uomRef = (JSONArray) jObject.get("UOMREF");
        JSONArray usRef = (JSONArray) jObject.get("USREF");
        JSONArray uInfo1 = (JSONArray) jObject.get("UINFO1");
        JSONArray uInfo2 = (JSONArray) jObject.get("UINFO2");
        JSONArray uInfo3 = (JSONArray) jObject.get("UINFO3");
        JSONArray uInfo4 = (JSONArray) jObject.get("UINFO4");
        JSONArray uInfo5 = (JSONArray) jObject.get("UINFO5");
        JSONArray uInfo6 = (JSONArray) jObject.get("UINFO6");
        JSONArray uInfo7 = (JSONArray) jObject.get("UINFO7");
        JSONArray uInfo8 = (JSONArray) jObject.get("UINFO8");
        JSONArray plnAmount = (JSONArray) jObject.get("PLNAMOUNT");
        JSONArray vatInc = (JSONArray) jObject.get("VATINC");
        JSONArray vat = (JSONArray) jObject.get("VAT");
        JSONArray vatAmnt = (JSONArray) jObject.get("VATAMNT");
        JSONArray vatMatrah = (JSONArray) jObject.get("VATMATRAH");
        JSONArray billedItem = (JSONArray) jObject.get("BILLEDITEM");
        JSONArray billed = (JSONArray) jObject.get("BILLED");
        JSONArray cpstFlag = (JSONArray) jObject.get("CPSTFLAG");
        JSONArray retCostType = (JSONArray) jObject.get("RETCOSTTYPE");
        JSONArray sourceLink = (JSONArray) jObject.get("SOURCELINK");
        JSONArray retCost = (JSONArray) jObject.get("RETCOST");
        JSONArray retCostCurr = (JSONArray) jObject.get("RETCOSTCURR");
        JSONArray outCost = (JSONArray) jObject.get("OUTCOST");
        JSONArray outCostCurr = (JSONArray) jObject.get("OUTCOSTCURR");
        JSONArray retAmount = (JSONArray) jObject.get("RETAMOUNT");
        JSONArray fareGRef = (JSONArray) jObject.get("FAREGREF");
        JSONArray faattrib = (JSONArray) jObject.get("FAATTRIB");
        JSONArray cancelled = (JSONArray) jObject.get("CANCELLED");
        JSONArray lineNet = (JSONArray) jObject.get("LINENET");
        JSONArray distAddExp = (JSONArray) jObject.get("DISTADDEXP");
        JSONArray fadAccRef = (JSONArray) jObject.get("FADACCREF");
        JSONArray fadCenterRef = (JSONArray) jObject.get("FADCENTERREF");
        JSONArray farAccRef = (JSONArray) jObject.get("FARACCREF");
        JSONArray farCenterRef = (JSONArray) jObject.get("FARCENTERREF");
        JSONArray diffPrice = (JSONArray) jObject.get("DIFFPRICE");
        JSONArray diffPrCost = (JSONArray) jObject.get("DIFFPRCOST");
        JSONArray decPrDiff = (JSONArray) jObject.get("DECPRDIFF");
        JSONArray lprodStat = (JSONArray) jObject.get("LPRODSTAT");
        JSONArray prdExpTotal = (JSONArray) jObject.get("PRDEXPTOTAL");
        JSONArray diffRepPrice = (JSONArray) jObject.get("DIFFREPPRICE");
        JSONArray diffPrCrCost = (JSONArray) jObject.get("DIFFPRCRCOST");
        JSONArray salesManRef = (JSONArray) jObject.get("SALESMANREF");
        JSONArray faplAccRef = (JSONArray) jObject.get("FAPLACCREF");
        JSONArray faplCenterRef = (JSONArray) jObject.get("FAPLCENTERREF");
        JSONArray outputIdCode = (JSONArray) jObject.get("OUTPUTIDCODE");
        JSONArray dRef = (JSONArray) jObject.get("DREF");
        JSONArray costRate = (JSONArray) jObject.get("COSTRATE");
        JSONArray xPriceUpd = (JSONArray) jObject.get("XPRICEUPD");
        JSONArray xPrice = (JSONArray) jObject.get("XPRICE");
        JSONArray xRepRate = (JSONArray) jObject.get("XREPRATE");
        JSONArray distCoef = (JSONArray) jObject.get("DISTCOEF");
        JSONArray transQcok = (JSONArray) jObject.get("TRANSQCOK");
        JSONArray siteId = (JSONArray) jObject.get("SITEID");
        JSONArray recStatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray orgLogRef = (JSONArray) jObject.get("ORGLOGICREF");
        JSONArray wfStatus = (JSONArray) jObject.get("WFSTATUS");
        JSONArray poLineRef = (JSONArray) jObject.get("POLINEREF");
        JSONArray plnstTransRef = (JSONArray) jObject.get("PLNSTTRANSREF");
        JSONArray netDiscFlag = (JSONArray) jObject.get("NETDISCFLAG");
        JSONArray netDiscPerc = (JSONArray) jObject.get("NETDISCPERC");
        JSONArray netDiscAmnt = (JSONArray) jObject.get("NETDISCAMNT");
        JSONArray netCalcDiff = (JSONArray) jObject.get("VATCALCDIFF");
        JSONArray conditionRef = (JSONArray) jObject.get("CONDITIONREF");
        JSONArray distOrderRef = (JSONArray) jObject.get("DISTORDERREF");
        JSONArray distOrderLineRef = (JSONArray) jObject.get("DISTORDLINEREF");
        JSONArray campaignRefs1 = (JSONArray) jObject.get("CAMPAIGNREFS1");
        JSONArray campaignRefs2 = (JSONArray) jObject.get("CAMPAIGNREFS2");
        JSONArray campaignRefs3 = (JSONArray) jObject.get("CAMPAIGNREFS3");
        JSONArray campaignRefs4 = (JSONArray) jObject.get("CAMPAIGNREFS4");
        JSONArray campaignRefs5 = (JSONArray) jObject.get("CAMPAIGNREFS5");
        JSONArray pointCampRef = (JSONArray) jObject.get("POINTCAMPREF");
        JSONArray campPoint = (JSONArray) jObject.get("CAMPPOINT");
        JSONArray promClasItemRef = (JSONArray) jObject.get("PROMCLASITEMREF");
        JSONArray cmpgLineRef = (JSONArray) jObject.get("CMPGLINEREF");
        JSONArray plnstTransPerNr = (JSONArray) jObject.get("PLNSTTRANSPERNR");
        JSONArray pordclsplnAmnt = (JSONArray) jObject.get("PORDCLSPLNAMNT");
        JSONArray vendcomm = (JSONArray) jObject.get("VENDCOMM");
        JSONArray previousOutCode = (JSONArray) jObject.get("PREVIOUSOUTCOST");
        JSONArray costOfSaleAccRef = (JSONArray) jObject.get("COSTOFSALEACCREF");
        JSONArray purchAccRef = (JSONArray) jObject.get("PURCHACCREF");
        JSONArray costOfSaleCentRef = (JSONArray) jObject.get("COSTOFSALECNTREF");
        JSONArray purchCentRef = (JSONArray) jObject.get("PURCHCENTREF");
        JSONArray prevOutCostCurr = (JSONArray) jObject.get("PREVOUTCOSTCURR");
        JSONArray abvatAmount = (JSONArray) jObject.get("ABVATAMOUNT");
        JSONArray abvatStatus = (JSONArray) jObject.get("ABVATSTATUS");
        JSONArray prRate = (JSONArray) jObject.get("PRRATE");
        JSONArray addTaxRate = (JSONArray) jObject.get("ADDTAXRATE");
        JSONArray addTaxConvFact = (JSONArray) jObject.get("ADDTAXCONVFACT");
        JSONArray addTaxAmount = (JSONArray) jObject.get("ADDTAXAMOUNT");
        JSONArray addTaxPrCost = (JSONArray) jObject.get("ADDTAXPRCOST");
        JSONArray addTaxRetCost = (JSONArray) jObject.get("ADDTAXRETCOST");
        JSONArray addTaxRetCostCurr = (JSONArray) jObject.get("ADDTAXRETCOSTCURR");
        JSONArray grossuInfo1 = (JSONArray) jObject.get("GROSSUINFO1");
        JSONArray grossuInfo2 = (JSONArray) jObject.get("GROSSUINFO2");
        JSONArray addTaxPrCostCurr = (JSONArray) jObject.get("ADDTAXPRCOSTCURR");
        JSONArray addTaxAccRef = (JSONArray) jObject.get("ADDTAXACCREF");
        JSONArray addTaxCenterRef = (JSONArray) jObject.get("ADDTAXCENTERREF");
        JSONArray addTaxAmntisupd = (JSONArray) jObject.get("ADDTAXAMNTISUPD");
        JSONArray infidx = (JSONArray) jObject.get("INFIDX");
        JSONArray addTaxCosAccRef = (JSONArray) jObject.get("ADDTAXCOSACCREF");
        JSONArray addTaxCoscntRef = (JSONArray) jObject.get("ADDTAXCOSCNTREF");
        JSONArray previousaTaxPrCost = (JSONArray) jObject.get("PREVIOUSATAXPRCOST");
        JSONArray prevaTaxPrCostCurr = (JSONArray) jObject.get("PREVATAXPRCOSTCURR");
        JSONArray prdOrdTotCoef = (JSONArray) jObject.get("PRDORDTOTCOEF");
        JSONArray dempeggedAmnt = (JSONArray) jObject.get("DEMPEGGEDAMNT");
        JSONArray stdUnitCost = (JSONArray) jObject.get("STDUNITCOST");
        JSONArray stdrpUnitCost = (JSONArray) jObject.get("STDRPUNITCOST");
        JSONArray costDiffAccRef = (JSONArray) jObject.get("COSTDIFFACCREF");
        JSONArray costDiffCentRef = (JSONArray) jObject.get("COSTDIFFCENREF");
        JSONArray textInc = (JSONArray) jObject.get("TEXTINC");
        JSONArray addTaxDiscAmount = (JSONArray) jObject.get("ADDTAXDISCAMOUNT");
        JSONArray orgLogoId = (JSONArray) jObject.get("ORGLOGOID");
        JSONArray eximFicheNo = (JSONArray) jObject.get("EXIMFICHENO");
        JSONArray eximFicheType = (JSONArray) jObject.get("EXIMFCTYPE");
        JSONArray transExpLine = (JSONArray) jObject.get("TRANSEXPLINE");
        JSONArray insExpLine = (JSONArray) jObject.get("INSEXPLINE");
        JSONArray eximwhfcRef = (JSONArray) jObject.get("EXIMWHFCREF");
        JSONArray eximwhlnRef = (JSONArray) jObject.get("EXIMWHLNREF");
        JSONArray eximFileRef = (JSONArray) jObject.get("EXIMFILEREF");
        JSONArray eximprocnr = (JSONArray) jObject.get("EXIMPROCNR");
        JSONArray eisrvdsttyp = (JSONArray) jObject.get("EISRVDSTTYP");
        JSONArray mainStLnRef = (JSONArray) jObject.get("MAINSTLNREF");
        JSONArray madeOfShred = (JSONArray) jObject.get("MADEOFSHRED");
        JSONArray fromOrdWithPay = (JSONArray) jObject.get("FROMORDWITHPAY");
        JSONArray projectRef = (JSONArray) jObject.get("PROJECTREF");
        JSONArray status = (JSONArray) jObject.get("STATUS");
        JSONArray doReserve = (JSONArray) jObject.get("DORESERVE");
        JSONArray pointCampRefs1 = (JSONArray) jObject.get("POINTCAMPREFS1");
        JSONArray pointCampRefs2 = (JSONArray) jObject.get("POINTCAMPREFS2");
        JSONArray pointCampRefs3 = (JSONArray) jObject.get("POINTCAMPREFS3");
        JSONArray pointCampRefs4 = (JSONArray) jObject.get("POINTCAMPREFS4");
        JSONArray campPoints1 = (JSONArray) jObject.get("CAMPPOINTS1");
        JSONArray campPoints2 = (JSONArray) jObject.get("CAMPPOINTS2");
        JSONArray campPoints3 = (JSONArray) jObject.get("CAMPPOINTS3");
        JSONArray campPoints4 = (JSONArray) jObject.get("CAMPPOINTS4");
        JSONArray cmpgLineRefs1 = (JSONArray) jObject.get("CMPGLINEREFS1");
        JSONArray cmpgLineRefs2 = (JSONArray) jObject.get("CMPGLINEREFS2");
        JSONArray cmpgLineRefs3 = (JSONArray) jObject.get("CMPGLINEREFS3");
        JSONArray cmpgLineRefs4 = (JSONArray) jObject.get("CMPGLINEREFS4");
        JSONArray prcListRef = (JSONArray) jObject.get("PRCLISTREF");
        JSONArray pordsymOutLn = (JSONArray) jObject.get("PORDSYMOUTLN");
        JSONArray month = (JSONArray) jObject.get("MONTH_");
        JSONArray year = (JSONArray) jObject.get("YEAR_");
        JSONArray exAddTaxRate = (JSONArray) jObject.get("EXADDTAXRATE");
        JSONArray exAddTaxConvf = (JSONArray) jObject.get("EXADDTAXCONVF");
        JSONArray exAddTaxaRef = (JSONArray) jObject.get("EXADDTAXAREF");
        JSONArray exAddTaxcRef = (JSONArray) jObject.get("EXADDTAXCREF");
        JSONArray otherAddTaxaRef = (JSONArray) jObject.get("OTHRADDTAXAREF");
        JSONArray otherAddTaxcRef = (JSONArray) jObject.get("OTHRADDTAXCREF");
        JSONArray exAddTaxAmnt = (JSONArray) jObject.get("EXADDTAXAMNT");
        JSONArray affectCollatRl = (JSONArray) jObject.get("AFFECTCOLLATRL");
        JSONArray altPromFlag = (JSONArray) jObject.get("ALTPROMFLAG");
        JSONArray eidistflnNr = (JSONArray) jObject.get("EIDISTFLNNR");
        JSONArray eximType = (JSONArray) jObject.get("EXIMTYPE");
        JSONArray variantRef = (JSONArray) jObject.get("VARIANTREF");
        JSONArray canDeduct = (JSONArray) jObject.get("CANDEDUCT");
        JSONArray outRemAmnt = (JSONArray) jObject.get("OUTREMAMNT");
        JSONArray outRemCost = (JSONArray) jObject.get("OUTREMCOST");
        JSONArray outRemCostCurr = (JSONArray) jObject.get("OUTREMCOSTCURR");
        JSONArray reflvataccRef = (JSONArray) jObject.get("REFLVATACCREF");
        JSONArray reflvatothaccRef = (JSONArray) jObject.get("REFLVATOTHACCREF");
        JSONArray parentLnRef = (JSONArray) jObject.get("PARENTLNREF");
        JSONArray affectRisk = (JSONArray) jObject.get("AFFECTRISK");

        for (int i = 0; i < logicalRef.size(); i++) {
            line = new StLine(
                    Integer.parseInt(logicalRef.get(i).toString()), Integer.parseInt(stockRef.get(i).toString()),
                    Short.parseShort(lineType.get(i).toString()), Integer.parseInt(prevLineRef.get(i).toString()),
                    Short.parseShort(prevLineNo.get(i).toString()), Short.parseShort(detLine.get(i).toString()),
                    Short.parseShort(trCode.get(i).toString()), date.get(i).toString(),
                    Integer.parseInt(fTime.get(i).toString()), Short.parseShort(globTrans.get(i).toString()),
                    Short.parseShort(calcType.get(i).toString()), Integer.parseInt(prodOrderRef.get(i).toString()),
                    Short.parseShort(sourceType.get(i).toString()), Short.parseShort(sourceIndex.get(i).toString()),
                    Short.parseShort(sourceCostGrp.get(i).toString()), Integer.parseInt(sourceWsRef.get(i).toString()),
                    Integer.parseInt(sourcePolnRef.get(i).toString()), Short.parseShort(destType.get(i).toString()),
                    Short.parseShort(destIndex.get(i).toString()), Short.parseShort(destCostGrp.get(i).toString()),
                    Integer.parseInt(destWsRef.get(i).toString()), Integer.parseInt(destPolnRef.get(i).toString()),
                    Short.parseShort(factoryNr.get(i).toString()), Short.parseShort(ioCode.get(i).toString()),
                    Integer.parseInt(stFicheRef.get(i).toString()), Short.parseShort(stFicheLnNo.get(i).toString()),
                    Integer.parseInt(invoiceRef.get(i).toString()), Short.parseShort(invoiceLnNo.get(i).toString()),
                    Integer.parseInt(clientRef.get(i).toString()), Integer.parseInt(ordTransRef.get(i).toString()),
                    Integer.parseInt(ordFicheRef.get(i).toString()), Integer.parseInt(centerRef.get(i).toString()),
                    Integer.parseInt(accountRef.get(i).toString()), Integer.parseInt(vataccRef.get(i).toString()),
                    Integer.parseInt(vatCenterRef.get(i).toString()), Integer.parseInt(praccRef.get(i).toString()),
                    Integer.parseInt(prCenterRef.get(i).toString()), Integer.parseInt(prvatAccRef.get(i).toString()),
                    Integer.parseInt(prvatCenRef.get(i).toString()), Integer.parseInt(promRef.get(i).toString()),
                    Integer.parseInt(payDefRef.get(i).toString()), specode.get(i).toString(),
                    delyvryCode.get(i).toString(), Float.parseFloat(amount.get(i).toString()),
                    Float.parseFloat(price.get(i).toString()), Float.parseFloat(total.get(i).toString()),
                    Short.parseShort(prCurr.get(i).toString()), Float.parseFloat(prPrice.get(i).toString()),
                    Short.parseShort(trCurr.get(i).toString()), Float.parseFloat(trRate.get(i).toString()),
                    Float.parseFloat(reportRate.get(i).toString()), Float.parseFloat(distCost.get(i).toString()),
                    Float.parseFloat(distDisc.get(i).toString()), Float.parseFloat(distExp.get(i).toString()),
                    Float.parseFloat(distProm.get(i).toString()), Float.parseFloat(discPer.get(i).toString()),
                    lineExp.get(i).toString(), Integer.parseInt(uomRef.get(i).toString()),
                    Integer.parseInt(usRef.get(i).toString()), Float.parseFloat(uInfo1.get(i).toString()),
                    Float.parseFloat(uInfo2.get(i).toString()), Float.parseFloat(uInfo3.get(i).toString()),
                    Float.parseFloat(uInfo4.get(i).toString()), Float.parseFloat(uInfo5.get(i).toString()),
                    Float.parseFloat(uInfo6.get(i).toString()), Float.parseFloat(uInfo7.get(i).toString()),
                    Float.parseFloat(uInfo8.get(i).toString()), Float.parseFloat(plnAmount.get(i).toString()),
                    Short.parseShort(vatInc.get(i).toString()), Float.parseFloat(vat.get(i).toString()),
                    Float.parseFloat(vatAmnt.get(i).toString()), Float.parseFloat(vatMatrah.get(i).toString()),
                    Integer.parseInt(billedItem.get(i).toString()), Short.parseShort(billed.get(i).toString()),
                    Short.parseShort(cpstFlag.get(i).toString()), Short.parseShort(retCostType.get(i).toString()),
                    Integer.parseInt(sourceLink.get(i).toString()), Float.parseFloat(retCost.get(i).toString()),
                    Float.parseFloat(retCostCurr.get(i).toString()), Float.parseFloat(outCost.get(i).toString()),
                    Float.parseFloat(outCostCurr.get(i).toString()), Float.parseFloat(retAmount.get(i).toString()),
                    Integer.parseInt(fareGRef.get(i).toString()), Short.parseShort(faattrib.get(i).toString()),
                    Short.parseShort(cancelled.get(i).toString()), Float.parseFloat(lineNet.get(i).toString()),
                    Float.parseFloat(distAddExp.get(i).toString()), Integer.parseInt(fadAccRef.get(i).toString()),
                    Integer.parseInt(fadCenterRef.get(i).toString()), Integer.parseInt(farAccRef.get(i).toString()),
                    Integer.parseInt(farCenterRef.get(i).toString()), Float.parseFloat(diffPrice.get(i).toString()),
                    Float.parseFloat(diffPrCost.get(i).toString()), Short.parseShort(decPrDiff.get(i).toString()),
                    Short.parseShort(lprodStat.get(i).toString()), Float.parseFloat(prdExpTotal.get(i).toString()),
                    Float.parseFloat(diffRepPrice.get(i).toString()), Float.parseFloat(diffPrCrCost.get(i).toString()),
                    Integer.parseInt(salesManRef.get(i).toString()), Integer.parseInt(faplAccRef.get(i).toString()),
                    Integer.parseInt(faplCenterRef.get(i).toString()), outputIdCode.get(i).toString(),
                    Integer.parseInt(dRef.get(i).toString()), Float.parseFloat(costRate.get(i).toString()),
                    Short.parseShort(xPriceUpd.get(i).toString()), Float.parseFloat(xPrice.get(i).toString()),
                    Float.parseFloat(xRepRate.get(i).toString()), Float.parseFloat(distCoef.get(i).toString()),
                    Short.parseShort(transQcok.get(i).toString()), Short.parseShort(siteId.get(i).toString()),
                    Short.parseShort(recStatus.get(i).toString()), Integer.parseInt(orgLogRef.get(i).toString()),
                    Integer.parseInt(wfStatus.get(i).toString()), Integer.parseInt(poLineRef.get(i).toString()),
                    Integer.parseInt(plnstTransRef.get(i).toString()), Short.parseShort(netDiscFlag.get(i).toString()),
                    Float.parseFloat(netDiscPerc.get(i).toString()), Float.parseFloat(netDiscAmnt.get(i).toString()),
                    Float.parseFloat(netCalcDiff.get(i).toString()), Integer.parseInt(conditionRef.get(i).toString()),
                    Integer.parseInt(distOrderRef.get(i).toString()), Integer.parseInt(distOrderLineRef.get(i).toString()),
                    Integer.parseInt(campaignRefs1.get(i).toString()), Integer.parseInt(campaignRefs2.get(i).toString()),
                    Integer.parseInt(campaignRefs3.get(i).toString()), Integer.parseInt(campaignRefs4.get(i).toString()),
                    Integer.parseInt(campaignRefs5.get(i).toString()), Integer.parseInt(pointCampRef.get(i).toString()),
                    Float.parseFloat(campPoint.get(i).toString()), Integer.parseInt(promClasItemRef.get(i).toString()),
                    Integer.parseInt(cmpgLineRef.get(i).toString()), Integer.parseInt(plnstTransPerNr.get(i).toString()),
                    Float.parseFloat(pordclsplnAmnt.get(i).toString()), Float.parseFloat(vendcomm.get(i).toString()),
                    Float.parseFloat(previousOutCode.get(i).toString()), Integer.parseInt(costOfSaleAccRef.get(i).toString()),
                    Integer.parseInt(purchAccRef.get(i).toString()), Integer.parseInt(costOfSaleCentRef.get(i).toString()),
                    Integer.parseInt(purchCentRef.get(i).toString()), Float.parseFloat(prevOutCostCurr.get(i).toString()),
                    Float.parseFloat(abvatAmount.get(i).toString()), Short.parseShort(abvatStatus.get(i).toString()),
                    Float.parseFloat(prRate.get(i).toString()), Float.parseFloat(addTaxRate.get(i).toString()),
                    Float.parseFloat(addTaxConvFact.get(i).toString()), Float.parseFloat(addTaxAmount.get(i).toString()),
                    Float.parseFloat(addTaxPrCost.get(i).toString()), Float.parseFloat(addTaxRetCost.get(i).toString()),
                    Float.parseFloat(addTaxRetCostCurr.get(i).toString()), Float.parseFloat(grossuInfo1.get(i).toString()),
                    Float.parseFloat(grossuInfo2.get(i).toString()), Float.parseFloat(addTaxPrCostCurr.get(i).toString()),
                    Integer.parseInt(addTaxAccRef.get(i).toString()), Integer.parseInt(addTaxCenterRef.get(i).toString()),
                    Short.parseShort(addTaxAmntisupd.get(i).toString()), Float.parseFloat(infidx.get(i).toString()),
                    Integer.parseInt(addTaxCosAccRef.get(i).toString()), Integer.parseInt(addTaxCoscntRef.get(i).toString()),
                    Float.parseFloat(previousaTaxPrCost.get(i).toString()), Float.parseFloat(prevaTaxPrCostCurr.get(i).toString()),
                    Float.parseFloat(prdOrdTotCoef.get(i).toString()), Float.parseFloat(dempeggedAmnt.get(i).toString()),
                    Float.parseFloat(stdUnitCost.get(i).toString()), Float.parseFloat(stdrpUnitCost.get(i).toString()),
                    Integer.parseInt(costDiffAccRef.get(i).toString()), Integer.parseInt(costDiffCentRef.get(i).toString()),
                    Short.parseShort(textInc.get(i).toString()), Float.parseFloat(addTaxDiscAmount.get(i).toString()),
                    orgLogoId.get(i).toString(), eximFicheNo.get(i).toString(),
                    Short.parseShort(eximFicheType.get(i).toString()), Short.parseShort(transExpLine.get(i).toString()),
                    Short.parseShort(insExpLine.get(i).toString()), Integer.parseInt(eximwhfcRef.get(i).toString()),
                    Integer.parseInt(eximwhlnRef.get(i).toString()), Integer.parseInt(eximFileRef.get(i).toString()),
                    Short.parseShort(eximprocnr.get(i).toString()), Short.parseShort(eisrvdsttyp.get(i).toString()),
                    Integer.parseInt(mainStLnRef.get(i).toString()), Short.parseShort(madeOfShred.get(i).toString()),
                    Short.parseShort(fromOrdWithPay.get(i).toString()), Integer.parseInt(projectRef.get(i).toString()),
                    Short.parseShort(status.get(i).toString()), Short.parseShort(doReserve.get(i).toString()),
                    Integer.parseInt(pointCampRefs1.get(i).toString()), Integer.parseInt(pointCampRefs2.get(i).toString()),
                    Integer.parseInt(pointCampRefs3.get(i).toString()), Integer.parseInt(pointCampRefs4.get(i).toString()),
                    Float.parseFloat(campPoints1.get(i).toString()), Float.parseFloat(campPoints2.get(i).toString()),
                    Float.parseFloat(campPoints3.get(i).toString()), Float.parseFloat(campPoints4.get(i).toString()),
                    Integer.parseInt(cmpgLineRefs1.get(i).toString()), Integer.parseInt(cmpgLineRefs2.get(i).toString()),
                    Integer.parseInt(cmpgLineRefs3.get(i).toString()), Integer.parseInt(cmpgLineRefs4.get(i).toString()),
                    Integer.parseInt(prcListRef.get(i).toString()), Short.parseShort(pordsymOutLn.get(i).toString()),
                    Short.parseShort(month.get(i).toString()), Short.parseShort(year.get(i).toString()),
                    Float.parseFloat(exAddTaxRate.get(i).toString()), Float.parseFloat(exAddTaxConvf.get(i).toString()),
                    Integer.parseInt(exAddTaxaRef.get(i).toString()), Integer.parseInt(exAddTaxcRef.get(i).toString()),
                    Integer.parseInt(otherAddTaxaRef.get(i).toString()), Integer.parseInt(otherAddTaxcRef.get(i).toString()),
                    Float.parseFloat(exAddTaxAmnt.get(i).toString()), Short.parseShort(affectCollatRl.get(i).toString()),
                    Short.parseShort(altPromFlag.get(i).toString()), Short.parseShort(eidistflnNr.get(i).toString()),
                    Short.parseShort(eximType.get(i).toString()), Integer.parseInt(variantRef.get(i).toString()),
                    Short.parseShort(canDeduct.get(i).toString()), Float.parseFloat(outRemAmnt.get(i).toString()),
                    Float.parseFloat(outRemCost.get(i).toString()), Float.parseFloat(outRemCostCurr.get(i).toString()),
                    Integer.parseInt(reflvataccRef.get(i).toString()), Integer.parseInt(reflvatothaccRef.get(i).toString()),
                    Integer.parseInt(parentLnRef.get(i).toString()), Short.parseShort(affectRisk.get(i).toString()));

            tableValue.add(line);
        }
        return tableValue;
    }
}

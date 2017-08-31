/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sender.sales;

import com.saptaslama.controller.CompanyConstants;
import com.saptaslama.controller.DbConnection;
import com.saptaslama.controller.sender.Sender;
import com.saptaslama.model.JsonObject;
import com.saptaslama.model.StFiche;
import com.saptaslama.model.StLine;
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
public class StFicheSender extends Sender{

//**************************INITIALIZER**********************************
    public void init() {
        DbConnection db;
        Connection con;
        ResultSet resultSetStFiche, resultSetStLine;
        
        String tabelNameStFiche = CompanyConstants.COMPANY + CompanyConstants
                .SUBCOMPANY + "STFICHE";
        String tabelNameStLine = CompanyConstants.COMPANY + CompanyConstants
                .SUBCOMPANY + "STLINE";
        
        String fileNameStFiche = "StFiche.json";
        String fileNameStLine = "StLine.json";
        
        //SELECT statement
        String queryConditionStLine = "STFICHEREF IN(SELECT LOGICALREF FROM " + 
                tabelNameStFiche + " WHERE DOCTRACKINGNR LIKE '') OR INVOICEREF "
                + "IN(SELECT LOGICALREF FROM " + CompanyConstants.COMPANY
                + CompanyConstants.SUBCOMPANY + "INVOICE WHERE TRACKNR LIKE '') AND OUTPUTIDCODE LIKE ''";
        
        String queryConditionStFiche = "DOCTRACKINGNR LIKE ''";
        
        /*
        SELECT * FROM LG_007_01_STFICHE 
            WHERE DOCTRACKINGNR LIKE '' AND CAPIBLOCK_CREADEDDATE 
                BETWEEN '2017-03-10 00:00:00.000' AND '2017-03-20 00:00:00.000' 
		OR CAPIBLOCK_MODIFIEDDATE BETWEEN '2017-03-10 00:00:00.000' AND '2017-03-20 00:00:00.000'
        
        SELECT * FROM LG_007_01_STLINE 
	WHERE STFICHEREF IN(SELECT LOGICALREF FROM LG_007_01_STFICHE 
		WHERE DOCTRACKINGNR LIKE '' AND CAPIBLOCK_CREADEDDATE 
                        BETWEEN '2017-03-03 00:00:00.000' AND '2017-03-20 00:00:00.000' 
			OR CAPIBLOCK_MODIFIEDDATE BETWEEN '2017-03-03 00:00:00.000' AND '2017-03-20 00:00:00.000') 
			OR INVOICEREF IN(SELECT LOGICALREF FROM LG_007_01_INVOICE 
				WHERE TRACKNR LIKE '' AND CAPIBLOCK_CREADEDDATE 
					BETWEEN '2017-03-03 00:00:00.000' AND '2017-03-20 00:00:00.000' 
					OR CAPIBLOCK_MODIFIEDDATE BETWEEN '2017-03-03 00:00:00.000' 
                                        AND '2017-03-20 00:00:00.000') 
					AND OUTPUTIDCODE LIKE ''
        */
        
        db = new DbConnection();
        con = db.getConnection();
        
        resultSetStFiche = db.querySelectStatement(con, tabelNameStFiche, queryConditionStFiche);
        resultSetStLine = db.querySelectStatement(con, tabelNameStLine, queryConditionStLine);
        
        sendJsonFile(getStFicheJson(getStFicheArrayList(resultSetStFiche)), 
                CompanyConstants.FILE_PATH_SEND + fileNameStFiche);
        
        sendJsonFile(getStLineJson(getStLineArrayList(resultSetStLine)), 
                CompanyConstants.FILE_PATH_SEND + fileNameStLine);

        db.closeConnection(con);
        db.closeResultSet(resultSetStFiche);
        db.closeResultSet(resultSetStLine);
    }
    
    //******************************STFICHE*************************************
    public ArrayList<StFiche> getStFicheArrayList(ResultSet resultSet) {

        ArrayList<StFiche> tableValue = new ArrayList<>();
        StFiche fiche;

        try {
            while (resultSet.next()) {
                fiche = new StFiche(
                        resultSet.getInt("LOGICALREF"), resultSet.getShort("GRPCODE"), 
                        resultSet.getShort("TRCODE"), resultSet.getShort("IOCODE"), 
                        resultSet.getString("FICHENO"), resultSet.getString("DATE_"), 
                        resultSet.getInt("FTIME"), resultSet.getString("DOCODE"), 
                        resultSet.getString("INVNO"), resultSet.getString("SPECODE"), 
                        resultSet.getString("CYPHCODE"), resultSet.getInt("INVOICEREF"), 
                        resultSet.getInt("CLIENTREF"), resultSet.getInt("RECVREF"), 
                        resultSet.getInt("ACCOUNTREF"), resultSet.getInt("CENTERREF"), 
                        resultSet.getInt("PRODORDERREF"), resultSet.getString("PORDERFICHENO"), 
                        resultSet.getShort("SOURCETYPE"), resultSet.getShort("SOURCEINDEX"), 
                        resultSet.getInt("SOURCEWSREF"), resultSet.getInt("SOURCEPOLNREF"), 
                        resultSet.getShort("SOURCECOSTGRP"), resultSet.getShort("DESTTYPE"), 
                        resultSet.getShort("DESTINDEX"), resultSet.getInt("DESTWSREF"), 
                        resultSet.getInt("DESTPOLNREF"), resultSet.getShort("DESTCOSTGRP"), 
                        resultSet.getShort("FACTORYNR"), resultSet.getShort("BRANCH"), 
                        resultSet.getShort("DEPARTMENT"), resultSet.getShort("COMPBRANCH"), 
                        resultSet.getShort("COMPDEPARTMENT"), resultSet.getShort("COMPFACTORY"), 
                        resultSet.getShort("PRODSTAT"), resultSet.getShort("DEVIR"), 
                        resultSet.getShort("CANCELLED"), resultSet.getShort("BILLED"), 
                        resultSet.getShort("ACCOUNTED"), resultSet.getShort("UPDCURR"), 
                        resultSet.getShort("INUSE"), resultSet.getShort("INVKIND"), 
                        resultSet.getFloat("ADDDISCOUNTS"), resultSet.getFloat("TOTALDISCOUNTS"), 
                        resultSet.getFloat("TOTALDISCOUNTED"), resultSet.getFloat("ADDEXPENSES"), 
                        resultSet.getFloat("TOTALEXPENSES"), resultSet.getFloat("TOTALDEPOZITO"), 
                        resultSet.getFloat("TOTALPROMOTIONS"), resultSet.getFloat("TOTALVAT"), 
                        resultSet.getFloat("GROSSTOTAL"), resultSet.getFloat("NETTOTAL"), 
                        resultSet.getString("GENEXP1"), resultSet.getString("GENEXP2"), 
                        resultSet.getString("GENEXP3"), resultSet.getString("GENEXP4"), 
                        resultSet.getFloat("REPORTRATE"), resultSet.getFloat("REPORTNET"), 
                        resultSet.getInt("EXTENREF"), resultSet.getInt("PAYDEFREF"), 
                        resultSet.getShort("PRINTCNT"), resultSet.getShort("FICHECNT"), 
                        resultSet.getInt("ACCFICHEREF"), resultSet.getShort("CAPIBLOCK_CREATEDBY"), 
                        resultSet.getString("CAPIBLOCK_CREADEDDATE"), resultSet.getShort("CAPIBLOCK_CREATEDHOUR"), 
                        resultSet.getShort("CAPIBLOCK_CREATEDMIN"), resultSet.getShort("CAPIBLOCK_CREATEDSEC"), 
                        resultSet.getShort("CAPIBLOCK_MODIFIEDBY"), resultSet.getString("CAPIBLOCK_MODIFIEDDATE"), 
                        resultSet.getShort("CAPIBLOCK_MODIFIEDHOUR"), resultSet.getShort("CAPIBLOCK_MODIFIEDMIN"), 
                        resultSet.getShort("CAPIBLOCK_MODIFIEDSEC"), resultSet.getInt("SALESMANREF"), 
                        resultSet.getShort("CANCELLEDACC"), resultSet.getString("SHPTYPCOD"), 
                        resultSet.getString("SHPAGNCOD"), resultSet.getString("TRACKNR"), 
                        resultSet.getShort("GENEXCTYP"), resultSet.getShort("LINEEXCTYP"), 
                        resultSet.getString("TRADINGGRP"), resultSet.getShort("TEXTINC"), 
                        resultSet.getShort("SITEID"), resultSet.getShort("RECSTATUS"), 
                        resultSet.getInt("ORGLOGICREF"), resultSet.getInt("WFSTATUS"), 
                        resultSet.getInt("SHIPINFOREF"), resultSet.getInt("DISTORDERREF"), 
                        resultSet.getShort("SENDCNT"), resultSet.getShort("DLVCLIENT"), 
                        resultSet.getString("DOCTRACKINGNR"), resultSet.getShort("ADDTAXCALC"), 
                        resultSet.getFloat("TOTALADDTAX"), resultSet.getString("UGIRTRACKINGNO"), 
                        resultSet.getInt("QPRODFCREF"), resultSet.getInt("VAACCREF"), 
                        resultSet.getInt("VACENTERREF"), resultSet.getString("ORGLOGOID"), 
                        resultSet.getShort("FROMEXIM"), resultSet.getString("FRGTYPCOD"), 
                        resultSet.getShort("TRCURR"), resultSet.getFloat("TRRATE"), 
                        resultSet.getFloat("TRNET"), resultSet.getInt("EXIMWHFCREF"), 
                        resultSet.getShort("EXIMFCTYPE"), resultSet.getInt("MAINSTFCREF"), 
                        resultSet.getShort("FROMORDWITHPAY"), resultSet.getInt("PROJECTREF"), 
                        resultSet.getInt("WFLOWCRDREF"), resultSet.getShort("STATUS"), 
                        resultSet.getShort("UPDTRCURR"), resultSet.getFloat("TOTALEXADDTAX"), 
                        resultSet.getShort("AFFECTCOLLATRL"), resultSet.getShort("DEDUCTIONPART1"), 
                        resultSet.getShort("DEDUCTIONPART2"), resultSet.getShort("GRPFIRMTRANS"), 
                        resultSet.getShort("AFFECTRISK"));
                tableValue.add(fiche);
            }
            return tableValue;
        } catch (SQLException ex) {
            Logger.getLogger(StFicheSender.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
            return null;
        }
    }
    
    public JsonObject getStFicheJson(ArrayList<StFiche> list) {
        JsonObject jsonObject = new JsonObject();
        JSONArray logicalRef = new JSONArray();
        JSONArray grpCode = new JSONArray();
        JSONArray trCode = new JSONArray();
        JSONArray ioCode = new JSONArray();
        JSONArray ficheNo = new JSONArray();
        JSONArray date = new JSONArray();
        JSONArray fTime = new JSONArray();
        JSONArray doCode = new JSONArray();
        JSONArray invNo = new JSONArray();
        JSONArray specode = new JSONArray();
        JSONArray cyphCode = new JSONArray();
        JSONArray invoiceRef = new JSONArray();
        JSONArray clientRef = new JSONArray();
        JSONArray recvRef = new JSONArray();
        JSONArray accountRef = new JSONArray();
        JSONArray centerRef = new JSONArray();
        JSONArray prodOrderRef = new JSONArray();
        JSONArray pOrderFicheNo = new JSONArray();
        JSONArray sourceType = new JSONArray();
        JSONArray sourceIndex = new JSONArray();
        JSONArray sourceWsRef = new JSONArray();
        JSONArray sourcePolnRef = new JSONArray();
        JSONArray sourceCostGrp = new JSONArray();
        JSONArray destType = new JSONArray();
        JSONArray destIndex = new JSONArray();
        JSONArray destwsRef = new JSONArray();
        JSONArray destPolnRef = new JSONArray();
        JSONArray destCostGrp = new JSONArray();
        JSONArray factoryNr = new JSONArray();
        JSONArray branch = new JSONArray();
        JSONArray department = new JSONArray();
        JSONArray compBranch = new JSONArray();
        JSONArray compDepartment = new JSONArray();
        JSONArray compFactory = new JSONArray();
        JSONArray prodStat = new JSONArray();
        JSONArray devir = new JSONArray();
        JSONArray cancelled = new JSONArray();
        JSONArray billed = new JSONArray();
        JSONArray accounted = new JSONArray();
        JSONArray updCurr = new JSONArray();
        JSONArray inUse = new JSONArray();
        JSONArray invcInd = new JSONArray();
        JSONArray addDiscounts = new JSONArray();
        JSONArray totalDiscounts = new JSONArray();
        JSONArray totalDiscounted = new JSONArray();
        JSONArray addExpenses = new JSONArray();
        JSONArray totalExpenses = new JSONArray();
        JSONArray totalDeposito = new JSONArray();
        JSONArray totalPromotions = new JSONArray();
        JSONArray totalVat = new JSONArray();
        JSONArray grossTotal = new JSONArray();
        JSONArray netTotal = new JSONArray();
        JSONArray genexp1 = new JSONArray();
        JSONArray genexp2 = new JSONArray();
        JSONArray genexp3 = new JSONArray();
        JSONArray genexp4 = new JSONArray();
        JSONArray reportRate = new JSONArray();
        JSONArray reportNet = new JSONArray();
        JSONArray extenRef = new JSONArray();
        JSONArray payDefRef = new JSONArray();
        JSONArray printCnt = new JSONArray();
        JSONArray ficheCnt = new JSONArray();
        JSONArray accFicheRef = new JSONArray();
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
        JSONArray wfStatus = new JSONArray();
        JSONArray shipInfoRef = new JSONArray();
        JSONArray distOrderRef = new JSONArray();
        JSONArray sendCnt = new JSONArray();
        JSONArray dlvClient = new JSONArray();
        JSONArray docTrackingGnr = new JSONArray();
        JSONArray addTaxCalc = new JSONArray();
        JSONArray totalAddTax = new JSONArray();
        JSONArray ugirTrackingNo = new JSONArray();
        JSONArray qProdfcRef = new JSONArray();
        JSONArray vaaccRef = new JSONArray();
        JSONArray vaCenterRef = new JSONArray();
        JSONArray orgLogoId = new JSONArray();
        JSONArray fromExim = new JSONArray();
        JSONArray frgTypeCode = new JSONArray();
        JSONArray trCurr = new JSONArray();
        JSONArray trRate = new JSONArray();
        JSONArray trNet = new JSONArray();
        JSONArray eximwhfcRef = new JSONArray();
        JSONArray eximfcType = new JSONArray();
        JSONArray mainstfcRef = new JSONArray();
        JSONArray fromOrdWithPay = new JSONArray();
        JSONArray projectRef = new JSONArray();
        JSONArray wFlowCardRef = new JSONArray();
        JSONArray status = new JSONArray();
        JSONArray updTrCurr = new JSONArray();
        JSONArray totalExAddTax = new JSONArray();
        JSONArray deductionPart1 = new JSONArray();
        JSONArray deductionPart2 = new JSONArray();
        JSONArray affectCollatrl = new JSONArray();
        JSONArray grpFirmTrans = new JSONArray();
        JSONArray affectRisk = new JSONArray();
        
        CompanyConstants c = new CompanyConstants();

        for (int a = 0; a < list.size(); a++) {
            
            //here we setting the specode with local logicalRef (example: if depo then we adding "D" infront of LogREf)
            if((c.DEPO_CODE - list.get(a).getLogicalRef()) != 111111111){
                docTrackingGnr.add(a, String.valueOf(c.DEPO_CODE - list.get(a).getLogicalRef()));
            }else{
                JOptionPane.showMessageDialog(null, "DOCTRACKINGNR icin logRef 111111111 sayisini asmistir!");
            }

            logicalRef.add(list.get(a).getLogicalRef());
            grpCode.add(list.get(a).getGrpCode());
            trCode.add(list.get(a).getTrCode());
            ioCode.add(list.get(a).getIoCode());
            date.add(list.get(a).getDate());
            fTime.add(list.get(a).getfTime());
            doCode.add(list.get(a).getDoCode());
            ficheNo.add(list.get(a).getFicheNo());
            invNo.add(list.get(a).getInvNo());
            specode.add(list.get(a).getSpecode());
            cyphCode.add(list.get(a).getCyphCode());
            invoiceRef.add(list.get(a).getInvoiceRef());
            clientRef.add(list.get(a).getClientRef());
            recvRef.add(list.get(a).getRecvRef());
            accountRef.add(list.get(a).getAccountRef());
            centerRef.add(list.get(a).getCenterRef());
            prodOrderRef.add(list.get(a).getProdOrderRef());
            pOrderFicheNo.add(list.get(a).getpOrderFicheNo());
            sourceType.add(list.get(a).getSourceType());
            sourceIndex.add(list.get(a).getSourceIndex());
            sourceWsRef.add(list.get(a).getSourceWsRef());
            sourcePolnRef.add(list.get(a).getSourcePolnRef());
            sourceCostGrp.add(list.get(a).getSourceCostGrp());
            destType.add(list.get(a).getDestType());
            destIndex.add(list.get(a).getDestIndex());
            destwsRef.add(list.get(a).getDestwsRef());
            destPolnRef.add(list.get(a).getDestPolnRef());
            destCostGrp.add(list.get(a).getDestCostGrp());
            factoryNr.add(list.get(a).getFactoryNr());
            branch.add(list.get(a).getBranch());
            department.add(list.get(a).getDepartment());
            compBranch.add(list.get(a).getCompBranch());
            compDepartment.add(list.get(a).getCompDepartment());
            compFactory.add(list.get(a).getCompFactory());
            prodStat.add(list.get(a).getProdStat());
            devir.add(list.get(a).getDevir());
            cancelled.add(list.get(a).getCancelled());
            billed.add(list.get(a).getBilled());
            accounted.add(list.get(a).getAccounted());
            updCurr.add(list.get(a).getUpdCurr());
            inUse.add(list.get(a).getInUse());
            invcInd.add(list.get(a).getInvcInd());
            addDiscounts.add(list.get(a).getAddDiscounts());
            totalDiscounts.add(list.get(a).getTotalDiscounts());
            totalDiscounted.add(list.get(a).getTotalDiscounted());
            addExpenses.add(list.get(a).getAddExpenses());
            totalExpenses.add(list.get(a).getTotalExpenses());
            totalDeposito.add(list.get(a).getTotalDeposito());
            totalPromotions.add(list.get(a).getTotalPromotions());
            totalVat.add(list.get(a).getTotalVat());
            grossTotal.add(list.get(a).getGrossTotal());
            netTotal.add(list.get(a).getNetTotal());
            genexp1.add(list.get(a).getGenexp1());
            genexp2.add(list.get(a).getGenexp2());
            genexp3.add(list.get(a).getGenexp3());
            genexp4.add(list.get(a).getGenexp4());
            reportRate.add(list.get(a).getReportRate());
            reportNet.add(list.get(a).getReportNet());
            extenRef.add(list.get(a).getExtenRef());
            payDefRef.add(list.get(a).getPayDefRef());
            printCnt.add(list.get(a).getPrintCnt());
            ficheCnt.add(list.get(a).getFicheCnt());
            accFicheRef.add(list.get(a).getAccFicheRef());
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
            trackNr.add(list.get(a).getTrackNr());
            genexcTyp.add(list.get(a).getGenexcTyp());
            lineExcTyp.add(list.get(a).getLineExcTyp());
            tradingGrp.add(list.get(a).getTradingGrp());
            textInc.add(list.get(a).getTextInc());
            siteId.add(list.get(a).getSiteId());
            recStatus.add(list.get(a).getRecStatus());
            orgLogRef.add(list.get(a).getOrgLogRef());
            wfStatus.add(list.get(a).getWfStatus());
            shipInfoRef.add(list.get(a).getShipInfoRef());
            distOrderRef.add(list.get(a).getDistOrderRef());
            sendCnt.add(list.get(a).getSendCnt());
            dlvClient.add(list.get(a).getDlvClient());
            
            addTaxCalc.add(list.get(a).getAddTaxCalc());
            totalAddTax.add(list.get(a).getTotalAddTax());
            ugirTrackingNo.add(list.get(a).getUgirTrackingNo());
            qProdfcRef.add(list.get(a).getqProdfcRef());
            vaaccRef.add(list.get(a).getVaaccRef());
            vaCenterRef.add(list.get(a).getVaCenterRef());
            orgLogoId.add(list.get(a).getOrgLogoId());
            fromExim.add(list.get(a).getFromExim());
            frgTypeCode.add(list.get(a).getFrgTypeCode());
            trCurr.add(list.get(a).getTrCurr());
            trRate.add(list.get(a).getTrRate());
            trNet.add(list.get(a).getTrNet());
            eximwhfcRef.add(list.get(a).getEximwhfcRef());
            eximfcType.add(list.get(a).getEximfcType());
            mainstfcRef.add(list.get(a).getMainstfcRef());
            fromOrdWithPay.add(list.get(a).getFromOrdWithPay());
            projectRef.add(list.get(a).getProjectRef());
            wFlowCardRef.add(list.get(a).getwFlowCardRef());
            status.add(list.get(a).getStatus());
            updTrCurr.add(list.get(a).getUpdCurr());
            totalExAddTax.add(list.get(a).getTotalExAddTax());
            deductionPart1.add(list.get(a).getDeductionPart1());
            deductionPart2.add(list.get(a).getDeductionPart2());
            affectCollatrl.add(list.get(a).getAffectCollatrl());
            grpFirmTrans.add(list.get(a).getGrpFirmTrans());
            affectRisk.add(list.get(a).getAffectRisk());
        }
        jsonObject.setObject("LOGICALREF", logicalRef);
        jsonObject.setObject("GRPCODE", grpCode);
        jsonObject.setObject("TRCODE", trCode);
        jsonObject.setObject("IOCODE", ioCode);
        jsonObject.setObject("FICHENO", ficheNo);
        jsonObject.setObject("DATE_", date);
        jsonObject.setObject("FTIME", fTime);
        jsonObject.setObject("DOCODE", doCode);
        jsonObject.setObject("INVNO", invNo);
        jsonObject.setObject("SPECODE", specode);
        jsonObject.setObject("CYPHCODE", cyphCode);
        jsonObject.setObject("INVOICEREF", invoiceRef);
        jsonObject.setObject("CLIENTREF", clientRef);
        jsonObject.setObject("RECVREF", recvRef);
        jsonObject.setObject("ACCOUNTREF", accountRef);
        jsonObject.setObject("CENTERREF", centerRef);
        jsonObject.setObject("PRODORDERREF", prodOrderRef);
        jsonObject.setObject("PORDERFICHENO", pOrderFicheNo);
        jsonObject.setObject("SOURCETYPE", sourceType);
        jsonObject.setObject("SOURCEINDEX", sourceIndex);
        jsonObject.setObject("SOURCEWSREF", sourceWsRef);
        jsonObject.setObject("SOURCEPOLNREF", sourcePolnRef);
        jsonObject.setObject("SOURCECOSTGRP", sourceCostGrp);
        jsonObject.setObject("DESTTYPE", destType);
        jsonObject.setObject("DESTINDEX", destIndex);
        jsonObject.setObject("DESTWSREF", destwsRef);
        jsonObject.setObject("DESTPOLNREF", destPolnRef);
        jsonObject.setObject("DESTCOSTGRP", destCostGrp);
        jsonObject.setObject("FACTORYNR", factoryNr);
        jsonObject.setObject("BRANCH", branch);
        jsonObject.setObject("DEPARTMENT", department);
        jsonObject.setObject("COMPBRANCH", compBranch);
        jsonObject.setObject("COMPDEPARTMENT", compDepartment);
        jsonObject.setObject("COMPFACTORY", compFactory);
        jsonObject.setObject("PRODSTAT", prodStat);
        jsonObject.setObject("DEVIR", devir);
        jsonObject.setObject("CANCELLED", cancelled);
        jsonObject.setObject("BILLED", billed);
        jsonObject.setObject("ACCOUNTED", accounted);
        jsonObject.setObject("UPDCURR", updCurr);
        jsonObject.setObject("INUSE", inUse);
        jsonObject.setObject("INVKIND", invcInd);
        jsonObject.setObject("ADDDISCOUNTS", addDiscounts);
        jsonObject.setObject("TOTALDISCOUNTS", totalDiscounts);
        jsonObject.setObject("TOTALDISCOUNTED", totalDiscounted);
        jsonObject.setObject("ADDEXPENSES", addExpenses);
        jsonObject.setObject("TOTALEXPENSES", totalExpenses);
        jsonObject.setObject("TOTALDEPOZITO", totalDeposito);
        jsonObject.setObject("TOTALPROMOTIONS", totalPromotions);
        jsonObject.setObject("TOTALVAT", totalVat);
        jsonObject.setObject("GROSSTOTAL", grossTotal);
        jsonObject.setObject("NETTOTAL", netTotal);
        jsonObject.setObject("GENEXP1", genexp1);
        jsonObject.setObject("GENEXP2", genexp2);
        jsonObject.setObject("GENEXP3", genexp3);
        jsonObject.setObject("GENEXP4", genexp4);
        jsonObject.setObject("REPORTRATE", reportRate);
        jsonObject.setObject("REPORTNET", reportNet);
        jsonObject.setObject("EXTENREF", extenRef);
        jsonObject.setObject("PAYDEFREF", payDefRef);
        jsonObject.setObject("PRINTCNT", printCnt);
        jsonObject.setObject("FICHECNT", ficheCnt);
        jsonObject.setObject("ACCFICHEREF", accFicheRef);
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
        jsonObject.setObject("WFSTATUS", wfStatus);
        jsonObject.setObject("SHIPINFOREF", shipInfoRef);
        jsonObject.setObject("DISTORDERREF", distOrderRef);
        jsonObject.setObject("SENDCNT", sendCnt);
        jsonObject.setObject("DLVCLIENT", dlvClient);
        jsonObject.setObject("DOCTRACKINGNR", docTrackingGnr);
        jsonObject.setObject("ADDTAXCALC", addTaxCalc);
        jsonObject.setObject("TOTALADDTAX", totalAddTax);
        jsonObject.setObject("UGIRTRACKINGNO", ugirTrackingNo);
        jsonObject.setObject("QPRODFCREF", qProdfcRef);
        jsonObject.setObject("VAACCREF", vaaccRef);
        jsonObject.setObject("VACENTERREF", vaCenterRef);
        jsonObject.setObject("ORGLOGOID", orgLogoId);
        jsonObject.setObject("FROMEXIM", fromExim);
        jsonObject.setObject("FRGTYPCOD", frgTypeCode);
        jsonObject.setObject("TRCURR", trCurr);
        jsonObject.setObject("TRRATE", trRate);
        jsonObject.setObject("TRNET", trNet);
        jsonObject.setObject("EXIMWHFCREF", eximwhfcRef);
        jsonObject.setObject("EXIMFCTYPE", eximfcType);
        jsonObject.setObject("MAINSTFCREF", mainstfcRef);
        jsonObject.setObject("FROMORDWITHPAY", fromOrdWithPay);
        jsonObject.setObject("PROJECTREF", projectRef);
        jsonObject.setObject("WFLOWCRDREF", wFlowCardRef);
        jsonObject.setObject("STATUS", status);
        jsonObject.setObject("UPDTRCURR", updTrCurr);
        jsonObject.setObject("TOTALEXADDTAX", totalExAddTax);
        jsonObject.setObject("DEDUCTIONPART1", deductionPart1);
        jsonObject.setObject("DEDUCTIONPART2", deductionPart2);
        jsonObject.setObject("AFFECTCOLLATRL", affectCollatrl);
        jsonObject.setObject("GRPFIRMTRANS", grpFirmTrans);
        jsonObject.setObject("AFFECTRISK", affectRisk);
        return jsonObject;
    }
    
    //******************************STLINE**************************************
    public ArrayList<StLine> getStLineArrayList(ResultSet resultSet) {

        ArrayList<StLine> tableValue = new ArrayList<>();
        StLine unit;

        try {
            while (resultSet.next()) {
                unit = new StLine(
                        resultSet.getInt("LOGICALREF"), resultSet.getInt("STOCKREF"),
                        resultSet.getShort("LINETYPE"), resultSet.getInt("PREVLINEREF"),
                        resultSet.getShort("PREVLINENO"), resultSet.getShort("DETLINE"),
                        resultSet.getShort("TRCODE"), resultSet.getString("DATE_"),
                        resultSet.getInt("FTIME"), resultSet.getShort("GLOBTRANS"),
                        resultSet.getShort("CALCTYPE"), resultSet.getInt("PRODORDERREF"),
                        resultSet.getShort("SOURCETYPE"), resultSet.getShort("SOURCEINDEX"),
                        resultSet.getShort("SOURCECOSTGRP"), resultSet.getInt("SOURCEWSREF"),
                        resultSet.getInt("SOURCEPOLNREF"), resultSet.getShort("DESTTYPE"),
                        resultSet.getShort("DESTINDEX"), resultSet.getShort("DESTCOSTGRP"),
                        resultSet.getInt("DESTWSREF"), resultSet.getInt("DESTPOLNREF"),
                        resultSet.getShort("FACTORYNR"), resultSet.getShort("IOCODE"),
                        resultSet.getInt("STFICHEREF"), resultSet.getShort("STFICHELNNO"),
                        resultSet.getInt("INVOICEREF"), resultSet.getShort("INVOICELNNO"),
                        resultSet.getInt("CLIENTREF"), resultSet.getInt("ORDTRANSREF"),
                        resultSet.getInt("ORDFICHEREF"), resultSet.getInt("CENTERREF"),
                        resultSet.getInt("ACCOUNTREF"), resultSet.getInt("VATACCREF"),
                        resultSet.getInt("VATCENTERREF"), resultSet.getInt("PRACCREF"),
                        resultSet.getInt("PRCENTERREF"), resultSet.getInt("PRVATACCREF"),
                        resultSet.getInt("PRVATCENREF"), resultSet.getInt("PROMREF"),
                        resultSet.getInt("PAYDEFREF"), resultSet.getString("SPECODE"),
                        resultSet.getString("DELVRYCODE"), resultSet.getFloat("AMOUNT"),
                        resultSet.getFloat("PRICE"), resultSet.getFloat("TOTAL"),
                        resultSet.getShort("PRCURR"), resultSet.getFloat("PRPRICE"),
                        resultSet.getShort("TRCURR"), resultSet.getFloat("TRRATE"),
                        resultSet.getFloat("REPORTRATE"), resultSet.getFloat("DISTCOST"),
                        resultSet.getFloat("DISTDISC"), resultSet.getFloat("DISTEXP"),
                        resultSet.getFloat("DISTPROM"), resultSet.getFloat("DISCPER"),
                        resultSet.getString("LINEEXP"), resultSet.getInt("UOMREF"),
                        resultSet.getInt("USREF"), resultSet.getFloat("UINFO1"),
                        resultSet.getFloat("UINFO2"), resultSet.getFloat("UINFO3"),
                        resultSet.getFloat("UINFO4"), resultSet.getFloat("UINFO5"),
                        resultSet.getFloat("UINFO6"), resultSet.getFloat("UINFO7"),
                        resultSet.getFloat("UINFO8"), resultSet.getFloat("PLNAMOUNT"),
                        resultSet.getShort("VATINC"), resultSet.getFloat("VAT"),
                        resultSet.getFloat("VATAMNT"), resultSet.getFloat("VATMATRAH"),
                        resultSet.getInt("BILLEDITEM"), resultSet.getShort("BILLED"),
                        resultSet.getShort("CPSTFLAG"), resultSet.getShort("RETCOSTTYPE"),
                        resultSet.getInt("SOURCELINK"), resultSet.getFloat("RETCOST"),
                        resultSet.getFloat("RETCOSTCURR"), resultSet.getFloat("OUTCOST"),
                        resultSet.getFloat("OUTCOSTCURR"), resultSet.getFloat("RETAMOUNT"),
                        resultSet.getInt("FAREGREF"), resultSet.getShort("FAATTRIB"),
                        resultSet.getShort("CANCELLED"), resultSet.getFloat("LINENET"),
                        resultSet.getFloat("DISTADDEXP"), resultSet.getInt("FADACCREF"),
                        resultSet.getInt("FADCENTERREF"), resultSet.getInt("FARACCREF"),
                        resultSet.getInt("FARCENTERREF"), resultSet.getFloat("DIFFPRICE"),
                        resultSet.getFloat("DIFFPRCOST"), resultSet.getShort("DECPRDIFF"),
                        resultSet.getShort("LPRODSTAT"), resultSet.getFloat("PRDEXPTOTAL"),
                        resultSet.getFloat("DIFFREPPRICE"), resultSet.getFloat("DIFFPRCRCOST"),
                        resultSet.getInt("SALESMANREF"), resultSet.getInt("FAPLACCREF"),
                        resultSet.getInt("FAPLCENTERREF"), resultSet.getString("OUTPUTIDCODE"),
                        resultSet.getInt("DREF"), resultSet.getFloat("COSTRATE"),
                        resultSet.getShort("XPRICEUPD"), resultSet.getFloat("XPRICE"),
                        resultSet.getFloat("XREPRATE"), resultSet.getFloat("DISTCOEF"),
                        resultSet.getShort("TRANSQCOK"), resultSet.getShort("SITEID"),
                        resultSet.getShort("RECSTATUS"), resultSet.getInt("ORGLOGICREF"),
                        resultSet.getInt("WFSTATUS"), resultSet.getInt("POLINEREF"),
                        resultSet.getInt("PLNSTTRANSREF"), resultSet.getShort("NETDISCFLAG"),
                        resultSet.getFloat("NETDISCPERC"), resultSet.getFloat("NETDISCAMNT"),
                        resultSet.getFloat("VATCALCDIFF"), resultSet.getInt("CONDITIONREF"),
                        resultSet.getInt("DISTORDERREF"), resultSet.getInt("DISTORDLINEREF"),
                        resultSet.getInt("CAMPAIGNREFS1"), resultSet.getInt("CAMPAIGNREFS2"),
                        resultSet.getInt("CAMPAIGNREFS3"), resultSet.getInt("CAMPAIGNREFS4"),
                        resultSet.getInt("CAMPAIGNREFS5"), resultSet.getInt("POINTCAMPREF"),
                        resultSet.getFloat("CAMPPOINT"), resultSet.getInt("PROMCLASITEMREF"),
                        resultSet.getInt("CMPGLINEREF"), resultSet.getInt("PLNSTTRANSPERNR"),
                        resultSet.getFloat("PORDCLSPLNAMNT"), resultSet.getFloat("VENDCOMM"),
                        resultSet.getFloat("PREVIOUSOUTCOST"), resultSet.getInt("COSTOFSALEACCREF"),
                        resultSet.getInt("PURCHACCREF"), resultSet.getInt("COSTOFSALECNTREF"),
                        resultSet.getInt("PURCHCENTREF"), resultSet.getFloat("PREVOUTCOSTCURR"),
                        resultSet.getFloat("ABVATAMOUNT"), resultSet.getShort("ABVATSTATUS"),
                        resultSet.getFloat("PRRATE"), resultSet.getFloat("ADDTAXRATE"),
                        resultSet.getFloat("ADDTAXCONVFACT"), resultSet.getFloat("ADDTAXAMOUNT"),
                        resultSet.getFloat("ADDTAXPRCOST"), resultSet.getFloat("ADDTAXRETCOST"),
                        resultSet.getFloat("ADDTAXRETCOSTCURR"), resultSet.getFloat("GROSSUINFO1"),
                        resultSet.getFloat("GROSSUINFO2"), resultSet.getFloat("ADDTAXPRCOSTCURR"),
                        resultSet.getInt("ADDTAXACCREF"), resultSet.getInt("ADDTAXCENTERREF"),
                        resultSet.getShort("ADDTAXAMNTISUPD"), resultSet.getFloat("INFIDX"),
                        resultSet.getInt("ADDTAXCOSACCREF"), resultSet.getInt("ADDTAXCOSCNTREF"),
                        resultSet.getFloat("PREVIOUSATAXPRCOST"), resultSet.getFloat("PREVATAXPRCOSTCURR"),
                        resultSet.getFloat("PRDORDTOTCOEF"), resultSet.getFloat("DEMPEGGEDAMNT"),
                        resultSet.getFloat("STDUNITCOST"), resultSet.getFloat("STDRPUNITCOST"),
                        resultSet.getInt("COSTDIFFACCREF"), resultSet.getInt("COSTDIFFCENREF"),
                        resultSet.getShort("TEXTINC"), resultSet.getFloat("ADDTAXDISCAMOUNT"),
                        resultSet.getString("ORGLOGOID"), resultSet.getString("EXIMFICHENO"),
                        resultSet.getShort("EXIMFCTYPE"), resultSet.getShort("TRANSEXPLINE"),
                        resultSet.getShort("INSEXPLINE"), resultSet.getInt("EXIMWHFCREF"),
                        resultSet.getInt("EXIMWHLNREF"), resultSet.getInt("EXIMFILEREF"),
                        resultSet.getShort("EXIMPROCNR"), resultSet.getShort("EISRVDSTTYP"),
                        resultSet.getInt("MAINSTLNREF"), resultSet.getShort("MADEOFSHRED"),
                        resultSet.getShort("FROMORDWITHPAY"), resultSet.getInt("PROJECTREF"),
                        resultSet.getShort("STATUS"), resultSet.getShort("DORESERVE"),
                        resultSet.getInt("POINTCAMPREFS1"), resultSet.getInt("POINTCAMPREFS2"),
                        resultSet.getInt("POINTCAMPREFS3"), resultSet.getInt("POINTCAMPREFS4"),
                        resultSet.getFloat("CAMPPOINTS1"),
                        resultSet.getFloat("CAMPPOINTS2"), resultSet.getFloat("CAMPPOINTS3"),
                        resultSet.getFloat("CAMPPOINTS4"), resultSet.getInt("CMPGLINEREFS1"),
                        resultSet.getInt("CMPGLINEREFS2"), resultSet.getInt("CMPGLINEREFS3"),
                        resultSet.getInt("CMPGLINEREFS4"), resultSet.getInt("PRCLISTREF"),
                        resultSet.getShort("PORDSYMOUTLN"), resultSet.getShort("MONTH_"),
                        resultSet.getShort("YEAR_"), resultSet.getFloat("EXADDTAXRATE"),
                        resultSet.getFloat("EXADDTAXCONVF"), resultSet.getInt("EXADDTAXAREF"),
                        resultSet.getInt("EXADDTAXCREF"), resultSet.getInt("OTHRADDTAXAREF"),
                        resultSet.getInt("OTHRADDTAXCREF"), resultSet.getFloat("EXADDTAXAMNT"),
                        resultSet.getShort("AFFECTCOLLATRL"), resultSet.getShort("ALTPROMFLAG"),
                        resultSet.getShort("EIDISTFLNNR"), resultSet.getShort("EXIMTYPE"),
                        resultSet.getInt("VARIANTREF"), resultSet.getShort("CANDEDUCT"),
                        resultSet.getFloat("OUTREMAMNT"), resultSet.getFloat("OUTREMCOST"),
                        resultSet.getFloat("OUTREMCOSTCURR"), resultSet.getInt("REFLVATACCREF"),
                        resultSet.getInt("REFLVATOTHACCREF"), resultSet.getInt("PARENTLNREF"),
                        resultSet.getShort("AFFECTRISK"));
                tableValue.add(unit);
            }
            return tableValue;
        } catch (SQLException ex) {
            Logger.getLogger(StFicheSender.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
            return null;
        }
    }
    
    public JsonObject getStLineJson(ArrayList<StLine> list) {
        JsonObject jsonObject = new JsonObject();
        JSONArray logicalRef = new JSONArray();
        JSONArray stockRef = new JSONArray();
        JSONArray lineType = new JSONArray();
        JSONArray prevLineRef = new JSONArray();
        JSONArray prevLineNo = new JSONArray();
        JSONArray detLine = new JSONArray();
        JSONArray trCode = new JSONArray();
        JSONArray date = new JSONArray();
        JSONArray fTime = new JSONArray();
        JSONArray globTrans = new JSONArray();
        JSONArray calcType = new JSONArray();
        JSONArray prodOrderRef = new JSONArray();
        JSONArray sourceType = new JSONArray();
        JSONArray sourceIndex = new JSONArray();
        JSONArray sourceCostGrp = new JSONArray();
        JSONArray sourceWsRef = new JSONArray();
        JSONArray sourcePolnRef = new JSONArray();
        JSONArray destType = new JSONArray();
        JSONArray destIndex = new JSONArray();
        JSONArray destCostGrp = new JSONArray();
        JSONArray destWsRef = new JSONArray();
        JSONArray destPolnRef = new JSONArray();
        JSONArray factoryNr = new JSONArray();
        JSONArray ioCode = new JSONArray();
        JSONArray stFicheRef = new JSONArray();
        JSONArray stFicheLnNo = new JSONArray();
        JSONArray invoiceRef = new JSONArray();
        JSONArray invoiceLnNo = new JSONArray();
        JSONArray clientRef = new JSONArray();
        JSONArray ordTransRef = new JSONArray();
        JSONArray ordFicheRef = new JSONArray();
        JSONArray centerRef = new JSONArray();
        JSONArray accountRef = new JSONArray();
        JSONArray vataccRef = new JSONArray();
        JSONArray vatCenterRef = new JSONArray();
        JSONArray praccRef = new JSONArray();
        JSONArray prCenterRef = new JSONArray();
        JSONArray prvatAccRef = new JSONArray();
        JSONArray prvatCenRef = new JSONArray();
        JSONArray promRef = new JSONArray();
        JSONArray payDefRef = new JSONArray();
        JSONArray specode = new JSONArray();
        JSONArray delyvryCode = new JSONArray();
        JSONArray amount = new JSONArray();
        JSONArray price = new JSONArray();
        JSONArray total = new JSONArray();
        JSONArray prCurr = new JSONArray();
        JSONArray prPrice = new JSONArray();
        JSONArray trCurr = new JSONArray();
        JSONArray trRate = new JSONArray();
        JSONArray reportRate = new JSONArray();
        JSONArray distCost = new JSONArray();
        JSONArray distDisc = new JSONArray();
        JSONArray distExp = new JSONArray();
        JSONArray distProm = new JSONArray();
        JSONArray discPer = new JSONArray();
        JSONArray lineExp = new JSONArray();
        JSONArray uomRef = new JSONArray();
        JSONArray usRef = new JSONArray();
        JSONArray uInfo1 = new JSONArray();
        JSONArray uInfo2 = new JSONArray();
        JSONArray uInfo3 = new JSONArray();
        JSONArray uInfo4 = new JSONArray();
        JSONArray uInfo5 = new JSONArray();
        JSONArray uInfo6 = new JSONArray();
        JSONArray uInfo7 = new JSONArray();
        JSONArray uInfo8 = new JSONArray();
        JSONArray plnAmount = new JSONArray();
        JSONArray vatInc = new JSONArray();
        JSONArray vat = new JSONArray();
        JSONArray vatAmnt = new JSONArray();
        JSONArray vatMatrah = new JSONArray();
        JSONArray billedItem = new JSONArray();
        JSONArray billed = new JSONArray();
        JSONArray cpstFlag = new JSONArray();
        JSONArray retCostType = new JSONArray();
        JSONArray sourceLink = new JSONArray();
        JSONArray retCost = new JSONArray();
        JSONArray retCostCurr = new JSONArray();
        JSONArray outCost = new JSONArray();
        JSONArray outCostCurr = new JSONArray();
        JSONArray retAmount = new JSONArray();
        JSONArray fareGRef = new JSONArray();
        JSONArray faattrib = new JSONArray();
        JSONArray cancelled = new JSONArray();
        JSONArray lineNet = new JSONArray();
        JSONArray distAddExp = new JSONArray();
        JSONArray fadAccRef = new JSONArray();
        JSONArray fadCenterRef = new JSONArray();
        JSONArray farAccRef = new JSONArray();
        JSONArray farCenterRef = new JSONArray();
        JSONArray diffPrice = new JSONArray();
        JSONArray diffPrCost = new JSONArray();
        JSONArray decPrDiff = new JSONArray();
        JSONArray lprodStat = new JSONArray();
        JSONArray prdExpTotal = new JSONArray();
        JSONArray diffRepPrice = new JSONArray();
        JSONArray diffPrCrCost = new JSONArray();
        JSONArray salesManRef = new JSONArray();
        JSONArray faplAccRef = new JSONArray();
        JSONArray faplCenterRef = new JSONArray();
        JSONArray outputIdCode = new JSONArray();
        JSONArray dRef = new JSONArray();
        JSONArray costRate = new JSONArray();
        JSONArray xPriceUpd = new JSONArray();
        JSONArray xPrice = new JSONArray();
        JSONArray xRepRate = new JSONArray();
        JSONArray distCoef = new JSONArray();
        JSONArray transQcok = new JSONArray();
        JSONArray siteId = new JSONArray();
        JSONArray recStatus = new JSONArray();
        JSONArray orgLogRef = new JSONArray();
        JSONArray wfStatus = new JSONArray();
        JSONArray poLineRef = new JSONArray();
        JSONArray plnstTransRef = new JSONArray();
        JSONArray netDiscFlag = new JSONArray();
        JSONArray netDiscPerc = new JSONArray();
        JSONArray netDiscAmnt = new JSONArray();
        JSONArray netCalcDiff = new JSONArray();
        JSONArray conditionRef = new JSONArray();
        JSONArray distOrderRef = new JSONArray();
        JSONArray distOrderLineRef = new JSONArray();
        JSONArray campaignRefs1 = new JSONArray();
        JSONArray campaignRefs2 = new JSONArray();
        JSONArray campaignRefs3 = new JSONArray();
        JSONArray campaignRefs4 = new JSONArray();
        JSONArray campaignRefs5 = new JSONArray();
        JSONArray pointCampRef = new JSONArray();
        JSONArray campPoint = new JSONArray();
        JSONArray promClasItemRef = new JSONArray();
        JSONArray cmpgLineRef = new JSONArray();
        JSONArray plnstTransPerNr = new JSONArray();
        JSONArray pordclsplnAmnt = new JSONArray();
        JSONArray vendcomm = new JSONArray();
        JSONArray previousOutCode = new JSONArray();
        JSONArray costOfSaleAccRef = new JSONArray();
        JSONArray purchAccRef = new JSONArray();
        JSONArray costOfSaleCentRef = new JSONArray();
        JSONArray purchCentRef = new JSONArray();
        JSONArray prevOutCostCurr = new JSONArray();
        JSONArray abvatAmount = new JSONArray();
        JSONArray abvatStatus = new JSONArray();
        JSONArray prRate = new JSONArray();
        JSONArray addTaxRate = new JSONArray();
        JSONArray addTaxConvFact = new JSONArray();
        JSONArray addTaxAmount = new JSONArray();
        JSONArray addTaxPrCost = new JSONArray();
        JSONArray addTaxRetCost = new JSONArray();
        JSONArray addTaxRetCostCurr = new JSONArray();
        JSONArray grossuInfo1 = new JSONArray();
        JSONArray grossuInfo2 = new JSONArray();
        JSONArray addTaxPrCostCurr = new JSONArray();
        JSONArray addTaxAccRef = new JSONArray();
        JSONArray addTaxCenterRef = new JSONArray();
        JSONArray addTaxAmntisupd = new JSONArray();
        JSONArray infidx = new JSONArray();
        JSONArray addTaxCosAccRef = new JSONArray();
        JSONArray addTaxCoscntRef = new JSONArray();
        JSONArray previousaTaxPrCost = new JSONArray();
        JSONArray prevaTaxPrCostCurr = new JSONArray();
        JSONArray prdOrdTotCoef = new JSONArray();
        JSONArray dempeggedAmnt = new JSONArray();
        JSONArray stdUnitCost = new JSONArray();
        JSONArray stdrpUnitCost = new JSONArray();
        JSONArray costDiffAccRef = new JSONArray();
        JSONArray costDiffCentRef = new JSONArray();
        JSONArray textInc = new JSONArray();
        JSONArray addTaxDiscAmount = new JSONArray();
        JSONArray orgLogoId = new JSONArray();
        JSONArray eximFicheNo = new JSONArray();
        JSONArray eximFicheType = new JSONArray();
        JSONArray transExpLine = new JSONArray();
        JSONArray insExpLine = new JSONArray();
        JSONArray eximwhfcRef = new JSONArray();
        JSONArray eximwhlnRef = new JSONArray();
        JSONArray eximFileRef = new JSONArray();
        JSONArray eximprocnr = new JSONArray();
        JSONArray eisrvdsttyp = new JSONArray();
        JSONArray mainStLnRef = new JSONArray();
        JSONArray madeOfShred = new JSONArray();
        JSONArray fromOrdWithPay = new JSONArray();
        JSONArray projectRef = new JSONArray();
        JSONArray status = new JSONArray();
        JSONArray doReserve = new JSONArray();
        JSONArray pointCampRefs1 = new JSONArray();
        JSONArray pointCampRefs2 = new JSONArray();
        JSONArray pointCampRefs3 = new JSONArray();
        JSONArray pointCampRefs4 = new JSONArray();
        JSONArray campPoints1 = new JSONArray();
        JSONArray campPoints2 = new JSONArray();
        JSONArray campPoints3 = new JSONArray();
        JSONArray campPoints4 = new JSONArray();
        JSONArray cmpgLineRefs1 = new JSONArray();
        JSONArray cmpgLineRefs2 = new JSONArray();
        JSONArray cmpgLineRefs3 = new JSONArray();
        JSONArray cmpgLineRefs4 = new JSONArray();
        JSONArray prcListRef = new JSONArray();
        JSONArray pordsymOutLn = new JSONArray();
        JSONArray month = new JSONArray();
        JSONArray year = new JSONArray();
        JSONArray exAddTaxRate = new JSONArray();
        JSONArray exAddTaxConvf = new JSONArray();
        JSONArray exAddTaxaRef = new JSONArray();
        JSONArray exAddTaxcRef = new JSONArray();
        JSONArray otherAddTaxaRef = new JSONArray();
        JSONArray otherAddTaxcRef = new JSONArray();
        JSONArray exAddTaxAmnt = new JSONArray();
        JSONArray affectCollatRl = new JSONArray();
        JSONArray altPromFlag = new JSONArray();
        JSONArray eidistflnNr = new JSONArray();
        JSONArray eximType = new JSONArray();
        JSONArray variantRef = new JSONArray();
        JSONArray canDeduct = new JSONArray();
        JSONArray outRemAmnt = new JSONArray();
        JSONArray outRemCost = new JSONArray();
        JSONArray outRemCostCurr = new JSONArray();
        JSONArray reflvataccRef = new JSONArray();
        JSONArray reflvatothaccRef = new JSONArray();
        JSONArray parentLnRef = new JSONArray();
        JSONArray affectRisk = new JSONArray();
        
        CompanyConstants c = new CompanyConstants();

        for (int a = 0; a < list.size(); a++) {
            
            //here we setting the specode with local logicalRef (example: if depo then we adding "D" infront of LogREf)
            if((c.DEPO_CODE - list.get(a).getLogicalRef()) != 111111111){
                outputIdCode.add(a, String.valueOf(c.DEPO_CODE - list.get(a).getLogicalRef()));
            }else{
                JOptionPane.showMessageDialog(null, "OUTPUTIDCODE icin logRef 111111111 sayisini asmistir!");
            }

            logicalRef.add(list.get(a).getLogicalRef());
            stockRef.add(list.get(a).getStockRef());
            lineType.add(list.get(a).getLineType());
            prevLineRef.add(list.get(a).getPrevLineRef());
            prevLineNo.add(list.get(a).getPrevLineNo());
            detLine.add(list.get(a).getDetLine());
            trCode.add(list.get(a).getTrCode());
            specode.add(list.get(a).getSpecode());
            date.add(list.get(a).getDate());
            fTime.add(list.get(a).getfTime());
            globTrans.add(list.get(a).getGlobTrans());
            calcType.add(list.get(a).getCalcType());
            prodOrderRef.add(list.get(a).getProdOrderRef());
            sourceType.add(list.get(a).getSourceType());
            sourceIndex.add(list.get(a).getSourceIndex());
            sourceCostGrp.add(list.get(a).getSourceCostGrp());
            sourceWsRef.add(list.get(a).getSourceWsRef());
            sourcePolnRef.add(list.get(a).getSourcePolnRef());
            destType.add(list.get(a).getDestType());
            destIndex.add(list.get(a).getDestIndex());
            destCostGrp.add(list.get(a).getDestCostGrp());
            destWsRef.add(list.get(a).getDestWsRef());
            destPolnRef.add(list.get(a).getDestPolnRef());
            factoryNr.add(list.get(a).getFactoryNr());
            ioCode.add(list.get(a).getIoCode());
            stFicheRef.add(list.get(a).getStFicheRef());
            stFicheLnNo.add(list.get(a).getStFicheLnNo());
            invoiceRef.add(list.get(a).getInvoiceRef());
            invoiceLnNo.add(list.get(a).getInvoiceLnNo());
            clientRef.add(list.get(a).getClientRef());
            ordTransRef.add(list.get(a).getOrdTransRef());
            ordFicheRef.add(list.get(a).getOrdFicheRef());
            centerRef.add(list.get(a).getCenterRef());
            accountRef.add(list.get(a).getAccountRef());
            vataccRef.add(list.get(a).getVataccRef());
            vatCenterRef.add(list.get(a).getVatCenterRef());
            praccRef.add(list.get(a).getPraccRef());
            prCenterRef.add(list.get(a).getPrCenterRef());
            prvatAccRef.add(list.get(a).getPrvatAccRef());
            prvatCenRef.add(list.get(a).getPrvatCenRef());
            promRef.add(list.get(a).getPromRef());
            payDefRef.add(list.get(a).getPayDefRef());
            
            delyvryCode.add(list.get(a).getDelyvryCode());
            amount.add(list.get(a).getAmount());
            price.add(list.get(a).getPrice());
            total.add(list.get(a).getTotal());
            prCurr.add(list.get(a).getPrCurr());
            prPrice.add(list.get(a).getPrPrice());
            trCurr.add(list.get(a).getTrCurr());
            trRate.add(list.get(a).getTrRate());
            reportRate.add(list.get(a).getReportRate());
            distCost.add(list.get(a).getDistCost());
            distDisc.add(list.get(a).getDistDisc());
            distExp.add(list.get(a).getDistExp());
            distProm.add(list.get(a).getDistProm());
            discPer.add(list.get(a).getDiscPer());
            lineExp.add(list.get(a).getLineExp());
            uomRef.add(list.get(a).getUomRef());
            usRef.add(list.get(a).getUsRef());
            uInfo1.add(list.get(a).getuInfo1());
            uInfo2.add(list.get(a).getuInfo2());
            uInfo3.add(list.get(a).getuInfo3());
            uInfo4.add(list.get(a).getuInfo4());
            uInfo5.add(list.get(a).getuInfo5());
            uInfo6.add(list.get(a).getuInfo6());
            uInfo7.add(list.get(a).getuInfo7());
            uInfo8.add(list.get(a).getuInfo8());
            plnAmount.add(list.get(a).getPlnAmount());
            vatInc.add(list.get(a).getVatInc());
            vat.add(list.get(a).getVat());
            vatAmnt.add(list.get(a).getVatAmnt());
            vatMatrah.add(list.get(a).getVatMatrah());
            billedItem.add(list.get(a).getBilledItem());
            billed.add(list.get(a).getBilled());
            cpstFlag.add(list.get(a).getCpstFlag());
            retCostType.add(list.get(a).getRetCostType());
            sourceLink.add(list.get(a).getSourceLink());
            retCost.add(list.get(a).getRetCost());
            retCostCurr.add(list.get(a).getRetCostCurr());
            outCost.add(list.get(a).getOutCost());
            outCostCurr.add(list.get(a).getOutCostCurr());
            retAmount.add(list.get(a).getRetAmount());
            fareGRef.add(list.get(a).getFareGRef());
            faattrib.add(list.get(a).getFaattrib());
            cancelled.add(list.get(a).getCancelled());
            lineNet.add(list.get(a).getLineNet());
            distAddExp.add(list.get(a).getDistAddExp());
            fadAccRef.add(list.get(a).getFadAccRef());
            fadCenterRef.add(list.get(a).getFadCenterRef());
            farAccRef.add(list.get(a).getFarAccRef());
            farCenterRef.add(list.get(a).getFarCenterRef());
            diffPrice.add(list.get(a).getDiffPrice());
            diffPrCost.add(list.get(a).getDiffPrCost());
            decPrDiff.add(list.get(a).getDecPrDiff());
            lprodStat.add(list.get(a).getLprodStat());
            prdExpTotal.add(list.get(a).getPrdExpTotal());
            diffRepPrice.add(list.get(a).getDiffRepPrice());
            diffPrCrCost.add(list.get(a).getDiffPrCrCost());
            salesManRef.add(list.get(a).getSalesManRef());
            faplAccRef.add(list.get(a).getFaplAccRef());
            faplCenterRef.add(list.get(a).getFaplCenterRef());
            dRef.add(list.get(a).getdRef());
            costRate.add(list.get(a).getCostRate());
            xPriceUpd.add(list.get(a).getxPriceUpd());
            xPrice.add(list.get(a).getxPrice());
            xRepRate.add(list.get(a).getxRepRate());
            distCoef.add(list.get(a).getDistCoef());
            transQcok.add(list.get(a).getTransQcok());
            siteId.add(list.get(a).getSiteId());
            recStatus.add(list.get(a).getRecStatus());
            orgLogRef.add(list.get(a).getOrgLogRef());
            wfStatus.add(list.get(a).getWfStatus());
            poLineRef.add(list.get(a).getPoLineRef());
            plnstTransRef.add(list.get(a).getPlnstTransRef());
            netDiscFlag.add(list.get(a).getNetDiscFlag());
            netDiscPerc.add(list.get(a).getNetDiscPerc());
            netDiscAmnt.add(list.get(a).getNetDiscAmnt());
            netCalcDiff.add(list.get(a).getNetCalcDiff());
            conditionRef.add(list.get(a).getConditionRef());
            distOrderRef.add(list.get(a).getDistOrderRef());
            distOrderLineRef.add(list.get(a).getDistOrderLineRef());
            campaignRefs1.add(list.get(a).getCampaignRefs1());
            campaignRefs2.add(list.get(a).getCampaignRefs2());
            campaignRefs3.add(list.get(a).getCampaignRefs3());
            campaignRefs4.add(list.get(a).getCampaignRefs4());
            campaignRefs5.add(list.get(a).getCampaignRefs5());
            pointCampRef.add(list.get(a).getPointCampRef());
            campPoint.add(list.get(a).getCampPoint());
            promClasItemRef.add(list.get(a).getPromClasItemRef());
            cmpgLineRef.add(list.get(a).getCmpgLineRef());
            plnstTransPerNr.add(list.get(a).getPlnstTransPerNr());
            pordclsplnAmnt.add(list.get(a).getPordclsplnAmnt());
            vendcomm.add(list.get(a).getVendcomm());
            previousOutCode.add(list.get(a).getPreviousOutCode());
            costOfSaleAccRef.add(list.get(a).getCostOfSaleAccRef());
            purchAccRef.add(list.get(a).getPurchAccRef());
            costOfSaleCentRef.add(list.get(a).getCostOfSaleCentRef());
            purchCentRef.add(list.get(a).getPurchCentRef());
            prevOutCostCurr.add(list.get(a).getPrevOutCostCurr());
            abvatAmount.add(list.get(a).getAbvatAmount());
            abvatStatus.add(list.get(a).getAbvatStatus());
            prRate.add(list.get(a).getPrRate());
            addTaxRate.add(list.get(a).getAddTaxRate());
            addTaxConvFact.add(list.get(a).getAddTaxConvFact());
            addTaxAmount.add(list.get(a).getAddTaxAmount());
            addTaxPrCost.add(list.get(a).getAddTaxPrCost());
            addTaxRetCost.add(list.get(a).getAddTaxRetCost());
            addTaxRetCostCurr.add(list.get(a).getAddTaxRetCostCurr());
            grossuInfo1.add(list.get(a).getGrossuInfo1());
            grossuInfo2.add(list.get(a).getGrossuInfo2());
            addTaxPrCostCurr.add(list.get(a).getAddTaxPrCostCurr());
            addTaxAccRef.add(list.get(a).getAddTaxAccRef());
            addTaxCenterRef.add(list.get(a).getAddTaxCenterRef());
            addTaxAmntisupd.add(list.get(a).getAddTaxAmntisupd());
            infidx.add(list.get(a).getInfidx());
            addTaxCosAccRef.add(list.get(a).getAddTaxCosAccRef());
            addTaxCoscntRef.add(list.get(a).getAddTaxCoscntRef());
            previousaTaxPrCost.add(list.get(a).getPreviousaTaxPrCost());
            prevaTaxPrCostCurr.add(list.get(a).getPrevaTaxPrCostCurr());
            prdOrdTotCoef.add(list.get(a).getPrdOrdTotCoef());
            dempeggedAmnt.add(list.get(a).getDempeggedAmnt());
            stdUnitCost.add(list.get(a).getStdUnitCost());
            stdrpUnitCost.add(list.get(a).getStdrpUnitCost());
            costDiffAccRef.add(list.get(a).getCostDiffAccRef());
            costDiffCentRef.add(list.get(a).getCostDiffCentRef());
            textInc.add(list.get(a).getTextInc());
            addTaxDiscAmount.add(list.get(a).getAddTaxDiscAmount());
            orgLogoId.add(list.get(a).getOrgLogoId());
            eximFicheNo.add(list.get(a).getEximFicheNo());
            eximFicheType.add(list.get(a).getEximFicheType());
            transExpLine.add(list.get(a).getTransExpLine());
            insExpLine.add(list.get(a).getInsExpLine());
            eximwhfcRef.add(list.get(a).getEximwhfcRef());
            eximwhlnRef.add(list.get(a).getEximwhlnRef());
            eximFileRef.add(list.get(a).getEximFileRef());
            eximprocnr.add(list.get(a).getEximprocnr());
            eisrvdsttyp.add(list.get(a).getEisrvdsttyp());
            mainStLnRef.add(list.get(a).getMainStLnRef());
            madeOfShred.add(list.get(a).getMadeOfShred());
            fromOrdWithPay.add(list.get(a).getFromOrdWithPay());
            projectRef.add(list.get(a).getProjectRef());
            status.add(list.get(a).getStatus());
            doReserve.add(list.get(a).getDoReserve());
            pointCampRefs1.add(list.get(a).getPointCampRefs1());
            pointCampRefs2.add(list.get(a).getPointCampRefs2());
            pointCampRefs3.add(list.get(a).getPointCampRefs3());
            pointCampRefs4.add(list.get(a).getPointCampRefs4());
            campPoints1.add(list.get(a).getCampPoints1());
            campPoints2.add(list.get(a).getCampPoints2());
            campPoints3.add(list.get(a).getCampPoints3());
            campPoints4.add(list.get(a).getCampPoints4());
            cmpgLineRefs1.add(list.get(a).getCmpgLineRefs1());
            cmpgLineRefs2.add(list.get(a).getCmpgLineRefs2());
            cmpgLineRefs3.add(list.get(a).getCmpgLineRefs3());
            cmpgLineRefs4.add(list.get(a).getCmpgLineRefs4());
            prcListRef.add(list.get(a).getPrcListRef());
            pordsymOutLn.add(list.get(a).getPordsymOutLn());
            month.add(list.get(a).getMonth());
            year.add(list.get(a).getYear());
            exAddTaxRate.add(list.get(a).getExAddTaxRate());
            exAddTaxConvf.add(list.get(a).getExAddTaxConvf());
            exAddTaxaRef.add(list.get(a).getExAddTaxaRef());
            exAddTaxcRef.add(list.get(a).getExAddTaxcRef());
            otherAddTaxaRef.add(list.get(a).getOtherAddTaxaRef());
            otherAddTaxcRef.add(list.get(a).getOtherAddTaxcRef());
            exAddTaxAmnt.add(list.get(a).getExAddTaxAmnt());
            affectCollatRl.add(list.get(a).getAffectCollatRl());
            altPromFlag.add(list.get(a).getAltPromFlag());
            eidistflnNr.add(list.get(a).getEidistflnNr());
            eximType.add(list.get(a).getEximType());
            variantRef.add(list.get(a).getVariantRef());
            canDeduct.add(list.get(a).getCanDeduct());
            outRemAmnt.add(list.get(a).getOutRemAmnt());
            outRemCost.add(list.get(a).getOutRemCost());
            outRemCostCurr.add(list.get(a).getOutRemCostCurr());
            reflvataccRef.add(list.get(a).getReflvataccRef());
            reflvatothaccRef.add(list.get(a).getReflvatothaccRef());
            parentLnRef.add(list.get(a).getParentLnRef());
            affectRisk.add(list.get(a).getAffectRisk());
        }
        jsonObject.setObject("LOGICALREF", logicalRef);
        jsonObject.setObject("STOCKREF", stockRef);
        jsonObject.setObject("LINETYPE", lineType);
        jsonObject.setObject("PREVLINEREF", prevLineRef);
        jsonObject.setObject("PREVLINENO", prevLineNo);
        jsonObject.setObject("DETLINE", detLine);
        jsonObject.setObject("TRCODE", trCode);
        jsonObject.setObject("DATE_", date);
        jsonObject.setObject("FTIME", fTime);
        jsonObject.setObject("GLOBTRANS", globTrans);
        jsonObject.setObject("CALCTYPE", calcType);
        jsonObject.setObject("PRODORDERREF", prodOrderRef);
        jsonObject.setObject("SOURCETYPE", sourceType);
        jsonObject.setObject("SOURCEINDEX", sourceIndex);
        jsonObject.setObject("SOURCECOSTGRP", sourceCostGrp);
        jsonObject.setObject("SOURCEWSREF", sourceWsRef);
        jsonObject.setObject("SOURCEPOLNREF", sourcePolnRef);
        jsonObject.setObject("DESTTYPE", destType);
        jsonObject.setObject("DESTINDEX", destIndex);
        jsonObject.setObject("DESTCOSTGRP", destCostGrp);
        jsonObject.setObject("DESTWSREF", destWsRef);
        jsonObject.setObject("DESTPOLNREF", destPolnRef);
        jsonObject.setObject("FACTORYNR", factoryNr);
        jsonObject.setObject("IOCODE", ioCode);
        jsonObject.setObject("STFICHEREF", stFicheRef);
        jsonObject.setObject("STFICHELNNO", stFicheLnNo);
        jsonObject.setObject("INVOICEREF", invoiceRef);
        jsonObject.setObject("INVOICELNNO", invoiceLnNo);
        jsonObject.setObject("CLIENTREF", clientRef);
        jsonObject.setObject("ORDTRANSREF", ordTransRef);
        jsonObject.setObject("ORDFICHEREF", ordFicheRef);
        jsonObject.setObject("CENTERREF", centerRef);
        jsonObject.setObject("ACCOUNTREF", accountRef);
        jsonObject.setObject("VATACCREF", vataccRef);
        jsonObject.setObject("VATCENTERREF", vatCenterRef);
        jsonObject.setObject("PRACCREF", praccRef);
        jsonObject.setObject("PRCENTERREF", prCenterRef);
        jsonObject.setObject("PRVATACCREF", prvatAccRef);
        jsonObject.setObject("PRVATCENREF", prvatCenRef);
        jsonObject.setObject("PROMREF", promRef);
        jsonObject.setObject("PAYDEFREF", payDefRef);
        jsonObject.setObject("SPECODE", specode);
        jsonObject.setObject("DELVRYCODE", delyvryCode);
        jsonObject.setObject("AMOUNT", amount);
        jsonObject.setObject("PRICE", price);
        jsonObject.setObject("TOTAL", total);
        jsonObject.setObject("PRCURR", prCurr);
        jsonObject.setObject("PRPRICE", prPrice);
        jsonObject.setObject("TRCURR", trCurr);
        jsonObject.setObject("TRRATE", trRate);
        jsonObject.setObject("REPORTRATE", reportRate);
        jsonObject.setObject("DISTCOST", distCost);
        jsonObject.setObject("DISTDISC", distDisc);
        jsonObject.setObject("DISTEXP", distExp);
        jsonObject.setObject("DISTPROM", distProm);
        jsonObject.setObject("DISCPER", discPer);
        jsonObject.setObject("LINEEXP", lineExp);
        jsonObject.setObject("UOMREF", uomRef);
        jsonObject.setObject("USREF", usRef);
        jsonObject.setObject("UINFO1", uInfo1);
        jsonObject.setObject("UINFO2", uInfo2);
        jsonObject.setObject("UINFO3", uInfo3);
        jsonObject.setObject("UINFO4", uInfo4);
        jsonObject.setObject("UINFO5", uInfo5);
        jsonObject.setObject("UINFO6", uInfo6);
        jsonObject.setObject("UINFO7", uInfo7);
        jsonObject.setObject("UINFO8", uInfo8);
        jsonObject.setObject("PLNAMOUNT", plnAmount);
        jsonObject.setObject("VATINC", vatInc);
        jsonObject.setObject("VAT", vat);
        jsonObject.setObject("VATAMNT", vatAmnt);
        jsonObject.setObject("VATMATRAH", vatMatrah);
        jsonObject.setObject("BILLEDITEM", billedItem);
        jsonObject.setObject("BILLED", billed);
        jsonObject.setObject("CPSTFLAG", cpstFlag);
        jsonObject.setObject("RETCOSTTYPE", retCostType);
        jsonObject.setObject("SOURCELINK", sourceLink);
        jsonObject.setObject("RETCOST", retCost);
        jsonObject.setObject("RETCOSTCURR", retCostCurr);
        jsonObject.setObject("OUTCOST", outCost);
        jsonObject.setObject("OUTCOSTCURR", outCostCurr);
        jsonObject.setObject("RETAMOUNT", retAmount);
        jsonObject.setObject("FAREGREF", fareGRef);
        jsonObject.setObject("FAATTRIB", faattrib);
        jsonObject.setObject("CANCELLED", cancelled);
        jsonObject.setObject("LINENET", lineNet);
        jsonObject.setObject("DISTADDEXP", distAddExp);
        jsonObject.setObject("FADACCREF", fadAccRef);
        jsonObject.setObject("FADCENTERREF", fadCenterRef);
        jsonObject.setObject("FARACCREF", farAccRef);
        jsonObject.setObject("FARCENTERREF", farCenterRef);
        jsonObject.setObject("DIFFPRICE", diffPrice);
        jsonObject.setObject("DIFFPRCOST", diffPrCost);
        jsonObject.setObject("DECPRDIFF", decPrDiff);
        jsonObject.setObject("LPRODSTAT", lprodStat);
        jsonObject.setObject("PRDEXPTOTAL", prdExpTotal);
        jsonObject.setObject("DIFFREPPRICE", diffRepPrice);
        jsonObject.setObject("DIFFPRCRCOST", diffPrCrCost);
        jsonObject.setObject("SALESMANREF", salesManRef);
        jsonObject.setObject("FAPLACCREF", faplAccRef);
        jsonObject.setObject("FAPLCENTERREF", faplCenterRef);
        jsonObject.setObject("OUTPUTIDCODE", outputIdCode);
        jsonObject.setObject("DREF", dRef);
        jsonObject.setObject("COSTRATE", costRate);
        jsonObject.setObject("XPRICEUPD", xPriceUpd);
        jsonObject.setObject("XPRICE", xPrice);
        jsonObject.setObject("XREPRATE", xRepRate);
        jsonObject.setObject("DISTCOEF", distCoef);
        jsonObject.setObject("TRANSQCOK", transQcok);
        jsonObject.setObject("SITEID", siteId);
        jsonObject.setObject("RECSTATUS", recStatus);
        jsonObject.setObject("ORGLOGICREF", orgLogRef);
        jsonObject.setObject("WFSTATUS", wfStatus);
        jsonObject.setObject("POLINEREF", poLineRef);
        jsonObject.setObject("PLNSTTRANSREF", plnstTransRef);
        jsonObject.setObject("NETDISCFLAG", netDiscFlag);
        jsonObject.setObject("NETDISCPERC", netDiscPerc);
        jsonObject.setObject("NETDISCAMNT", netDiscAmnt);
        jsonObject.setObject("VATCALCDIFF", netCalcDiff);
        jsonObject.setObject("CONDITIONREF", conditionRef);
        jsonObject.setObject("DISTORDERREF", distOrderRef);
        jsonObject.setObject("DISTORDLINEREF", distOrderLineRef);
        jsonObject.setObject("CAMPAIGNREFS1", campaignRefs1);
        jsonObject.setObject("CAMPAIGNREFS2", campaignRefs2);
        jsonObject.setObject("CAMPAIGNREFS3", campaignRefs3);
        jsonObject.setObject("CAMPAIGNREFS4", campaignRefs4);
        jsonObject.setObject("CAMPAIGNREFS5", campaignRefs5);
        jsonObject.setObject("POINTCAMPREF", pointCampRef);
        jsonObject.setObject("CAMPPOINT", campPoint);
        jsonObject.setObject("PROMCLASITEMREF", promClasItemRef);
        jsonObject.setObject("CMPGLINEREF", cmpgLineRef);
        jsonObject.setObject("PLNSTTRANSPERNR", plnstTransPerNr);
        jsonObject.setObject("PORDCLSPLNAMNT", pordclsplnAmnt);
        jsonObject.setObject("VENDCOMM", vendcomm);
        jsonObject.setObject("PREVIOUSOUTCOST", previousOutCode);
        jsonObject.setObject("COSTOFSALEACCREF", costOfSaleAccRef);
        jsonObject.setObject("PURCHACCREF", purchAccRef);
        jsonObject.setObject("COSTOFSALECNTREF", costOfSaleCentRef);
        jsonObject.setObject("PURCHCENTREF", purchCentRef);
        jsonObject.setObject("PREVOUTCOSTCURR", prevOutCostCurr);
        jsonObject.setObject("ABVATAMOUNT", abvatAmount);
        jsonObject.setObject("ABVATSTATUS", abvatStatus);
        jsonObject.setObject("PRRATE", prRate);
        jsonObject.setObject("ADDTAXRATE", addTaxRate);
        jsonObject.setObject("ADDTAXCONVFACT", addTaxConvFact);
        jsonObject.setObject("ADDTAXAMOUNT", addTaxAmount);
        jsonObject.setObject("ADDTAXPRCOST", addTaxPrCost);
        jsonObject.setObject("ADDTAXRETCOST", addTaxRetCost);
        jsonObject.setObject("ADDTAXRETCOSTCURR", addTaxRetCostCurr);
        jsonObject.setObject("GROSSUINFO1", grossuInfo1);
        jsonObject.setObject("GROSSUINFO2", grossuInfo2);
        jsonObject.setObject("ADDTAXPRCOSTCURR", addTaxPrCostCurr);
        jsonObject.setObject("ADDTAXACCREF", addTaxAccRef);
        jsonObject.setObject("ADDTAXCENTERREF", addTaxCenterRef);
        jsonObject.setObject("ADDTAXAMNTISUPD", addTaxAmntisupd);
        jsonObject.setObject("INFIDX", infidx);
        jsonObject.setObject("ADDTAXCOSACCREF", addTaxCosAccRef);
        jsonObject.setObject("ADDTAXCOSCNTREF", addTaxCoscntRef);
        jsonObject.setObject("PREVIOUSATAXPRCOST", previousaTaxPrCost);
        jsonObject.setObject("PREVATAXPRCOSTCURR", prevaTaxPrCostCurr);
        jsonObject.setObject("PRDORDTOTCOEF", prdOrdTotCoef);
        jsonObject.setObject("DEMPEGGEDAMNT", dempeggedAmnt);
        jsonObject.setObject("STDUNITCOST", stdUnitCost);
        jsonObject.setObject("STDRPUNITCOST", stdrpUnitCost);
        jsonObject.setObject("COSTDIFFACCREF", costDiffAccRef);
        jsonObject.setObject("COSTDIFFCENREF", costDiffCentRef);
        jsonObject.setObject("TEXTINC", textInc);
        jsonObject.setObject("ADDTAXDISCAMOUNT", addTaxDiscAmount);
        jsonObject.setObject("ORGLOGOID", orgLogoId);
        jsonObject.setObject("EXIMFICHENO", eximFicheNo);
        jsonObject.setObject("EXIMFCTYPE", eximFicheType);
        jsonObject.setObject("TRANSEXPLINE", transExpLine);
        jsonObject.setObject("INSEXPLINE", insExpLine);
        jsonObject.setObject("EXIMWHFCREF", eximwhfcRef);
        jsonObject.setObject("EXIMWHLNREF", eximwhlnRef);
        jsonObject.setObject("EXIMFILEREF", eximFileRef);
        jsonObject.setObject("EXIMPROCNR", eximprocnr);
        jsonObject.setObject("EISRVDSTTYP", eisrvdsttyp);
        jsonObject.setObject("MAINSTLNREF", mainStLnRef);
        jsonObject.setObject("MADEOFSHRED", madeOfShred);
        jsonObject.setObject("FROMORDWITHPAY", fromOrdWithPay);
        jsonObject.setObject("PROJECTREF", projectRef);
        jsonObject.setObject("STATUS", status);
        jsonObject.setObject("DORESERVE", doReserve);
        jsonObject.setObject("POINTCAMPREFS1", pointCampRefs1);
        jsonObject.setObject("POINTCAMPREFS2", pointCampRefs2);
        jsonObject.setObject("POINTCAMPREFS3", pointCampRefs3);
        jsonObject.setObject("POINTCAMPREFS4", pointCampRefs4);
        jsonObject.setObject("CAMPPOINTS1", campPoints1);
        jsonObject.setObject("CAMPPOINTS2", campPoints2);
        jsonObject.setObject("CAMPPOINTS3", campPoints3);
        jsonObject.setObject("CAMPPOINTS4", campPoints4);
        jsonObject.setObject("CMPGLINEREFS1", cmpgLineRefs1);
        jsonObject.setObject("CMPGLINEREFS2", cmpgLineRefs2);
        jsonObject.setObject("CMPGLINEREFS3", cmpgLineRefs3);
        jsonObject.setObject("CMPGLINEREFS4", cmpgLineRefs4);
        jsonObject.setObject("PRCLISTREF", prcListRef);
        jsonObject.setObject("PORDSYMOUTLN", pordsymOutLn);
        jsonObject.setObject("MONTH_", month);
        jsonObject.setObject("YEAR_", year);
        jsonObject.setObject("EXADDTAXRATE", exAddTaxRate);
        jsonObject.setObject("EXADDTAXCONVF", exAddTaxConvf);
        jsonObject.setObject("EXADDTAXAREF", exAddTaxaRef);
        jsonObject.setObject("EXADDTAXCREF", exAddTaxcRef);
        jsonObject.setObject("OTHRADDTAXAREF", otherAddTaxaRef);
        jsonObject.setObject("OTHRADDTAXCREF", otherAddTaxcRef);
        jsonObject.setObject("EXADDTAXAMNT", exAddTaxAmnt);
        jsonObject.setObject("AFFECTCOLLATRL", affectCollatRl);
        jsonObject.setObject("ALTPROMFLAG", altPromFlag);
        jsonObject.setObject("EIDISTFLNNR", eidistflnNr);
        jsonObject.setObject("EXIMTYPE", eximType);
        jsonObject.setObject("VARIANTREF", variantRef);
        jsonObject.setObject("CANDEDUCT", canDeduct);
        jsonObject.setObject("OUTREMAMNT", outRemAmnt);
        jsonObject.setObject("OUTREMCOST", outRemCost);
        jsonObject.setObject("OUTREMCOSTCURR", outRemCostCurr);
        jsonObject.setObject("REFLVATACCREF", reflvataccRef);
        jsonObject.setObject("REFLVATOTHACCREF", reflvatothaccRef);
        jsonObject.setObject("PARENTLNREF", parentLnRef);
        jsonObject.setObject("AFFECTRISK", affectRisk);
        return jsonObject;
    }
}

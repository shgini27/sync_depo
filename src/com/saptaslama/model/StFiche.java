/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.model;

/**
 *
 * @author Shagy
 */
public class StFiche implements java.io.Serializable{
    private int logicalRef;
    private Short grpCode;
    private Short trCode;
    private Short ioCode;
    private String ficheNo;
    private String date;
    private int fTime;
    private String doCode;
    private String invNo;
    private String specode;
    private String cyphCode;
    private int invoiceRef;
    private int clientRef;
    private int recvRef;
    private int accountRef;
    private int centerRef;
    private int prodOrderRef;
    private String pOrderFicheNo;
    private Short sourceType;
    private Short sourceIndex;
    private int sourceWsRef;
    private int sourcePolnRef;
    private Short sourceCostGrp;
    private Short destType;
    private Short destIndex;
    private int destwsRef;
    private int destPolnRef;
    private Short destCostGrp;
    private Short factoryNr;
    private Short branch;
    private Short department;
    private Short compBranch;
    private Short compDepartment;
    private Short compFactory;
    private Short prodStat;
    private Short devir;
    private Short cancelled;
    private Short billed;
    private Short accounted;
    private Short updCurr;
    private Short inUse;
    private Short invcInd;
    private float addDiscounts;
    private float totalDiscounts;
    private float totalDiscounted;
    private float addExpenses;
    private float totalExpenses;
    private float totalDeposito;
    private float totalPromotions;
    private float totalVat;
    private float grossTotal;
    private float netTotal;
    private String genexp1;
    private String genexp2;
    private String genexp3;
    private String genexp4;
    private float reportRate;
    private float reportNet;
    private int extenRef;
    private int payDefRef;
    private Short printCnt;
    private Short ficheCnt;
    private int accFicheRef;
    private Short capiblockCreatedby;
    private String capiblockCreadeddate;
    private Short capiblockCreatedhour;
    private Short capiblockCreatedmin;
    private Short capiblockCreatedsec;
    private Short capiblockModifiedby;
    private String capiblockModifieddate;
    private Short capiblockModifiedhour;
    private Short capiblockModifiedmin;
    private Short capiblockModifiedsec;
    private int salesManRef;
    private Short cancelledAcc;
    private String shpTypeCode;
    private String shpAgnCode;
    private String trackNr;
    private Short genexcTyp;
    private Short lineExcTyp;
    private String tradingGrp;
    private Short textInc;
    private Short siteId;
    private Short recStatus;
    private int orgLogRef;
    private int wfStatus;
    private int shipInfoRef;
    private int distOrderRef;
    private Short sendCnt;
    private Short dlvClient;
    private String docTrackingGnr;
    private Short addTaxCalc;
    private float totalAddTax;
    private String ugirTrackingNo;
    private int qProdfcRef;
    private int vaaccRef;
    private int vaCenterRef;
    private String orgLogoId;
    private Short fromExim;
    private String frgTypeCode;
    private Short trCurr;
    private float trRate;
    private float trNet;
    private int eximwhfcRef;
    private Short eximfcType;
    private int mainstfcRef;
    private Short fromOrdWithPay;
    private int projectRef;
    private int wFlowCardRef;
    private Short status;
    private Short updTrCurr;
    private float totalExAddTax;
    private Short affectCollatrl;
    private Short deductionPart1;
    private Short deductionPart2;
    private Short grpFirmTrans;
    private Short affectRisk;

    public StFiche(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public StFiche(int logicalRef, Short grpCode, Short trCode, Short ioCode, 
            String ficheNo, String date, int fTime, String doCode, String invNo, 
            String specode, String cyphCode, int invoiceRef, int clientRef, int recvRef, 
            int accountRef, int centerRef, int prodOrderRef, String pOrderFicheNo, 
            Short sourceType, Short sourceIndex, int sourceWsRef, int sourcePolnRef, 
            Short sourceCostGrp, Short destType, Short destIndex, int destwsRef, 
            int destPolnRef, Short destCostGrp, Short factoryNr, Short branch, 
            Short department, Short compBranch, Short compDepartment, Short compFactory, 
            Short prodStat, Short devir, Short cancelled, Short billed, Short accounted, 
            Short updCurr, Short inUse, Short invcInd, float addDiscounts, float totalDiscounts, 
            float totalDiscounted, float addExpenses, float totalExpenses, float totalDeposito, 
            float totalPromotions, float totalVat, float grossTotal, float netTotal, 
            String genexp1, String genexp2, String genexp3, String genexp4, float reportRate, 
            float reportNet, int extenRef, int payDefRef, Short printCnt, Short ficheCnt, 
            int accFicheRef, Short capiblockCreatedby, String capiblockCreadeddate, 
            Short capiblockCreatedhour, Short capiblockCreatedmin, Short capiblockCreatedsec, 
            Short capiblockModifiedby, String capiblockModifieddate, Short capiblockModifiedhour, 
            Short capiblockModifiedmin, Short capiblockModifiedsec, int salesManRef, 
            Short cancelledAcc, String shpTypeCode, String shpAgnCode, String trackNr, 
            Short genexcTyp, Short lineExcTyp, String tradingGrp, Short textInc, Short siteId, 
            Short recStatus, int orgLogRef, int wfStatus, int shipInfoRef, int distOrderRef, 
            Short sendCnt, Short dlvClient, String docTrackingGnr, Short addTaxCalc, 
            float totalAddTax, String ugirTrackingNo, int qProdfcRef, int vaaccRef, 
            int vaCenterRef, String orgLogoId, Short fromExim, String frgTypeCode, 
            Short trCurr, float trRate, float trNet, int eximwhfcRef, Short eximfcType, 
            int mainstfcRef, Short fromOrdWithPay, int projectRef, int wFlowCardRef, 
            Short status, Short updTrCurr, float totalExAddTax, Short affectCollatrl, 
            Short deductionPart1, Short deductionPart2, Short grpFirmTrans, Short affectRisk) {
        this.logicalRef = logicalRef;
        this.grpCode = grpCode;
        this.trCode = trCode;
        this.ioCode = ioCode;
        this.ficheNo = ficheNo;
        this.date = date;
        this.fTime = fTime;
        this.doCode = doCode;
        this.invNo = invNo;
        this.specode = specode;
        this.cyphCode = cyphCode;
        this.invoiceRef = invoiceRef;
        this.clientRef = clientRef;
        this.recvRef = recvRef;
        this.accountRef = accountRef;
        this.centerRef = centerRef;
        this.prodOrderRef = prodOrderRef;
        this.pOrderFicheNo = pOrderFicheNo;
        this.sourceType = sourceType;
        this.sourceIndex = sourceIndex;
        this.sourceWsRef = sourceWsRef;
        this.sourcePolnRef = sourcePolnRef;
        this.sourceCostGrp = sourceCostGrp;
        this.destType = destType;
        this.destIndex = destIndex;
        this.destwsRef = destwsRef;
        this.destPolnRef = destPolnRef;
        this.destCostGrp = destCostGrp;
        this.factoryNr = factoryNr;
        this.branch = branch;
        this.department = department;
        this.compBranch = compBranch;
        this.compDepartment = compDepartment;
        this.compFactory = compFactory;
        this.prodStat = prodStat;
        this.devir = devir;
        this.cancelled = cancelled;
        this.billed = billed;
        this.accounted = accounted;
        this.updCurr = updCurr;
        this.inUse = inUse;
        this.invcInd = invcInd;
        this.addDiscounts = addDiscounts;
        this.totalDiscounts = totalDiscounts;
        this.totalDiscounted = totalDiscounted;
        this.addExpenses = addExpenses;
        this.totalExpenses = totalExpenses;
        this.totalDeposito = totalDeposito;
        this.totalPromotions = totalPromotions;
        this.totalVat = totalVat;
        this.grossTotal = grossTotal;
        this.netTotal = netTotal;
        this.genexp1 = genexp1;
        this.genexp2 = genexp2;
        this.genexp3 = genexp3;
        this.genexp4 = genexp4;
        this.reportRate = reportRate;
        this.reportNet = reportNet;
        this.extenRef = extenRef;
        this.payDefRef = payDefRef;
        this.printCnt = printCnt;
        this.ficheCnt = ficheCnt;
        this.accFicheRef = accFicheRef;
        this.capiblockCreatedby = capiblockCreatedby;
        this.capiblockCreadeddate = capiblockCreadeddate;
        this.capiblockCreatedhour = capiblockCreatedhour;
        this.capiblockCreatedmin = capiblockCreatedmin;
        this.capiblockCreatedsec = capiblockCreatedsec;
        this.capiblockModifiedby = capiblockModifiedby;
        this.capiblockModifieddate = checkDate(capiblockModifieddate);
        this.capiblockModifiedhour = capiblockModifiedhour;
        this.capiblockModifiedmin = capiblockModifiedmin;
        this.capiblockModifiedsec = capiblockModifiedsec;
        this.salesManRef = salesManRef;
        this.cancelledAcc = cancelledAcc;
        this.shpTypeCode = shpTypeCode;
        this.shpAgnCode = shpAgnCode;
        this.trackNr = trackNr;
        this.genexcTyp = genexcTyp;
        this.lineExcTyp = lineExcTyp;
        this.tradingGrp = tradingGrp;
        this.textInc = textInc;
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogRef = orgLogRef;
        this.wfStatus = wfStatus;
        this.shipInfoRef = shipInfoRef;
        this.distOrderRef = distOrderRef;
        this.sendCnt = sendCnt;
        this.dlvClient = dlvClient;
        this.docTrackingGnr = docTrackingGnr;
        this.addTaxCalc = addTaxCalc;
        this.totalAddTax = totalAddTax;
        this.ugirTrackingNo = ugirTrackingNo;
        this.qProdfcRef = qProdfcRef;
        this.vaaccRef = vaaccRef;
        this.vaCenterRef = vaCenterRef;
        this.orgLogoId = orgLogoId;
        this.fromExim = fromExim;
        this.frgTypeCode = frgTypeCode;
        this.trCurr = trCurr;
        this.trRate = trRate;
        this.trNet = trNet;
        this.eximwhfcRef = eximwhfcRef;
        this.eximfcType = eximfcType;
        this.mainstfcRef = mainstfcRef;
        this.fromOrdWithPay = fromOrdWithPay;
        this.projectRef = projectRef;
        this.wFlowCardRef = wFlowCardRef;
        this.status = status;
        this.updTrCurr = updTrCurr;
        this.totalExAddTax = totalExAddTax;
        this.affectCollatrl = affectCollatrl;
        this.deductionPart1 = deductionPart1;
        this.deductionPart2 = deductionPart2;
        this.grpFirmTrans = grpFirmTrans;
        this.affectRisk = affectRisk;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public Short getGrpCode() {
        return grpCode;
    }

    public void setGrpCode(Short grpCode) {
        this.grpCode = grpCode;
    }

    public Short getTrCode() {
        return trCode;
    }

    public void setTrCode(Short trCode) {
        this.trCode = trCode;
    }

    public Short getIoCode() {
        return ioCode;
    }

    public void setIoCode(Short ioCode) {
        this.ioCode = ioCode;
    }

    public String getFicheNo() {
        return ficheNo;
    }

    public void setFicheNo(String ficheNo) {
        this.ficheNo = ficheNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getfTime() {
        return fTime;
    }

    public void setfTime(int fTime) {
        this.fTime = fTime;
    }

    public String getDoCode() {
        return doCode;
    }

    public void setDoCode(String doCode) {
        this.doCode = doCode;
    }

    public String getInvNo() {
        return invNo;
    }

    public void setInvNo(String invNo) {
        this.invNo = invNo;
    }

    public String getSpecode() {
        return specode;
    }

    public void setSpecode(String specode) {
        this.specode = specode;
    }

    public String getCyphCode() {
        return cyphCode;
    }

    public void setCyphCode(String cyphCode) {
        this.cyphCode = cyphCode;
    }

    public int getInvoiceRef() {
        return invoiceRef;
    }

    public void setInvoiceRef(int invoiceRef) {
        this.invoiceRef = invoiceRef;
    }

    public int getClientRef() {
        return clientRef;
    }

    public void setClientRef(int clientRef) {
        this.clientRef = clientRef;
    }

    public int getRecvRef() {
        return recvRef;
    }

    public void setRecvRef(int recvRef) {
        this.recvRef = recvRef;
    }

    public int getAccountRef() {
        return accountRef;
    }

    public void setAccountRef(int accountRef) {
        this.accountRef = accountRef;
    }

    public int getCenterRef() {
        return centerRef;
    }

    public void setCenterRef(int centerRef) {
        this.centerRef = centerRef;
    }

    public int getProdOrderRef() {
        return prodOrderRef;
    }

    public void setProdOrderRef(int prodOrderRef) {
        this.prodOrderRef = prodOrderRef;
    }

    public String getpOrderFicheNo() {
        return pOrderFicheNo;
    }

    public void setpOrderFicheNo(String pOrderFicheNo) {
        this.pOrderFicheNo = pOrderFicheNo;
    }

    public Short getSourceType() {
        return sourceType;
    }

    public void setSourceType(Short sourceType) {
        this.sourceType = sourceType;
    }

    public Short getSourceIndex() {
        return sourceIndex;
    }

    public void setSourceIndex(Short sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    public int getSourceWsRef() {
        return sourceWsRef;
    }

    public void setSourceWsRef(int sourceWsRef) {
        this.sourceWsRef = sourceWsRef;
    }

    public int getSourcePolnRef() {
        return sourcePolnRef;
    }

    public void setSourcePolnRef(int sourcePolnRef) {
        this.sourcePolnRef = sourcePolnRef;
    }

    public Short getSourceCostGrp() {
        return sourceCostGrp;
    }

    public void setSourceCostGrp(Short sourceCostGrp) {
        this.sourceCostGrp = sourceCostGrp;
    }

    public Short getDestType() {
        return destType;
    }

    public void setDestType(Short destType) {
        this.destType = destType;
    }

    public Short getDestIndex() {
        return destIndex;
    }

    public void setDestIndex(Short destIndex) {
        this.destIndex = destIndex;
    }

    public int getDestwsRef() {
        return destwsRef;
    }

    public void setDestwsRef(int destwsRef) {
        this.destwsRef = destwsRef;
    }

    public int getDestPolnRef() {
        return destPolnRef;
    }

    public void setDestPolnRef(int destPolnRef) {
        this.destPolnRef = destPolnRef;
    }

    public Short getDestCostGrp() {
        return destCostGrp;
    }

    public void setDestCostGrp(Short destCostGrp) {
        this.destCostGrp = destCostGrp;
    }

    public Short getFactoryNr() {
        return factoryNr;
    }

    public void setFactoryNr(Short factoryNr) {
        this.factoryNr = factoryNr;
    }

    public Short getBranch() {
        return branch;
    }

    public void setBranch(Short branch) {
        this.branch = branch;
    }

    public Short getDepartment() {
        return department;
    }

    public void setDepartment(Short department) {
        this.department = department;
    }

    public Short getCompBranch() {
        return compBranch;
    }

    public void setCompBranch(Short compBranch) {
        this.compBranch = compBranch;
    }

    public Short getCompDepartment() {
        return compDepartment;
    }

    public void setCompDepartment(Short compDepartment) {
        this.compDepartment = compDepartment;
    }

    public Short getCompFactory() {
        return compFactory;
    }

    public void setCompFactory(Short compFactory) {
        this.compFactory = compFactory;
    }

    public Short getProdStat() {
        return prodStat;
    }

    public void setProdStat(Short prodStat) {
        this.prodStat = prodStat;
    }

    public Short getDevir() {
        return devir;
    }

    public void setDevir(Short devir) {
        this.devir = devir;
    }

    public Short getCancelled() {
        return cancelled;
    }

    public void setCancelled(Short cancelled) {
        this.cancelled = cancelled;
    }

    public Short getBilled() {
        return billed;
    }

    public void setBilled(Short billed) {
        this.billed = billed;
    }

    public Short getAccounted() {
        return accounted;
    }

    public void setAccounted(Short accounted) {
        this.accounted = accounted;
    }

    public Short getUpdCurr() {
        return updCurr;
    }

    public void setUpdCurr(Short updCurr) {
        this.updCurr = updCurr;
    }

    public Short getInUse() {
        return inUse;
    }

    public void setInUse(Short inUse) {
        this.inUse = inUse;
    }

    public Short getInvcInd() {
        return invcInd;
    }

    public void setInvcInd(Short invcInd) {
        this.invcInd = invcInd;
    }

    public float getAddDiscounts() {
        return addDiscounts;
    }

    public void setAddDiscounts(float addDiscounts) {
        this.addDiscounts = addDiscounts;
    }

    public float getTotalDiscounts() {
        return totalDiscounts;
    }

    public void setTotalDiscounts(float totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    public float getTotalDiscounted() {
        return totalDiscounted;
    }

    public void setTotalDiscounted(float totalDiscounted) {
        this.totalDiscounted = totalDiscounted;
    }

    public float getAddExpenses() {
        return addExpenses;
    }

    public void setAddExpenses(float addExpenses) {
        this.addExpenses = addExpenses;
    }

    public float getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(float totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public float getTotalDeposito() {
        return totalDeposito;
    }

    public void setTotalDeposito(float totalDeposito) {
        this.totalDeposito = totalDeposito;
    }

    public float getTotalPromotions() {
        return totalPromotions;
    }

    public void setTotalPromotions(float totalPromotions) {
        this.totalPromotions = totalPromotions;
    }

    public float getTotalVat() {
        return totalVat;
    }

    public void setTotalVat(float totalVat) {
        this.totalVat = totalVat;
    }

    public float getGrossTotal() {
        return grossTotal;
    }

    public void setGrossTotal(float grossTotal) {
        this.grossTotal = grossTotal;
    }

    public float getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(float netTotal) {
        this.netTotal = netTotal;
    }

    public String getGenexp1() {
        return genexp1;
    }

    public void setGenexp1(String genexp1) {
        this.genexp1 = genexp1;
    }

    public String getGenexp2() {
        return genexp2;
    }

    public void setGenexp2(String genexp2) {
        this.genexp2 = genexp2;
    }

    public String getGenexp3() {
        return genexp3;
    }

    public void setGenexp3(String genexp3) {
        this.genexp3 = genexp3;
    }

    public String getGenexp4() {
        return genexp4;
    }

    public void setGenexp4(String genexp4) {
        this.genexp4 = genexp4;
    }

    public float getReportRate() {
        return reportRate;
    }

    public void setReportRate(float reportRate) {
        this.reportRate = reportRate;
    }

    public float getReportNet() {
        return reportNet;
    }

    public void setReportNet(float reportNet) {
        this.reportNet = reportNet;
    }

    public int getExtenRef() {
        return extenRef;
    }

    public void setExtenRef(int extenRef) {
        this.extenRef = extenRef;
    }

    public int getPayDefRef() {
        return payDefRef;
    }

    public void setPayDefRef(int payDefRef) {
        this.payDefRef = payDefRef;
    }

    public Short getPrintCnt() {
        return printCnt;
    }

    public void setPrintCnt(Short printCnt) {
        this.printCnt = printCnt;
    }

    public Short getFicheCnt() {
        return ficheCnt;
    }

    public void setFicheCnt(Short ficheCnt) {
        this.ficheCnt = ficheCnt;
    }

    public int getAccFicheRef() {
        return accFicheRef;
    }

    public void setAccFicheRef(int accFicheRef) {
        this.accFicheRef = accFicheRef;
    }

    public Short getCapiblockCreatedby() {
        return capiblockCreatedby;
    }

    public void setCapiblockCreatedby(Short capiblockCreatedby) {
        this.capiblockCreatedby = capiblockCreatedby;
    }

    public String getCapiblockCreadeddate() {
        return capiblockCreadeddate;
    }

    public void setCapiblockCreadeddate(String capiblockCreadeddate) {
        this.capiblockCreadeddate = capiblockCreadeddate;
    }

    public Short getCapiblockCreatedhour() {
        return capiblockCreatedhour;
    }

    public void setCapiblockCreatedhour(Short capiblockCreatedhour) {
        this.capiblockCreatedhour = capiblockCreatedhour;
    }

    public Short getCapiblockCreatedmin() {
        return capiblockCreatedmin;
    }

    public void setCapiblockCreatedmin(Short capiblockCreatedmin) {
        this.capiblockCreatedmin = capiblockCreatedmin;
    }

    public Short getCapiblockCreatedsec() {
        return capiblockCreatedsec;
    }

    public void setCapiblockCreatedsec(Short capiblockCreatedsec) {
        this.capiblockCreatedsec = capiblockCreatedsec;
    }

    public Short getCapiblockModifiedby() {
        return capiblockModifiedby;
    }

    public void setCapiblockModifiedby(Short capiblockModifiedby) {
        this.capiblockModifiedby = capiblockModifiedby;
    }

    public String getCapiblockModifieddate() {
        return capiblockModifieddate;
    }

    public void setCapiblockModifieddate(String capiblockModifieddate) {
        this.capiblockModifieddate = checkDate(capiblockModifieddate);
    }

    public Short getCapiblockModifiedhour() {
        return capiblockModifiedhour;
    }

    public void setCapiblockModifiedhour(Short capiblockModifiedhour) {
        this.capiblockModifiedhour = capiblockModifiedhour;
    }

    public Short getCapiblockModifiedmin() {
        return capiblockModifiedmin;
    }

    public void setCapiblockModifiedmin(Short capiblockModifiedmin) {
        this.capiblockModifiedmin = capiblockModifiedmin;
    }

    public Short getCapiblockModifiedsec() {
        return capiblockModifiedsec;
    }

    public void setCapiblockModifiedsec(Short capiblockModifiedsec) {
        this.capiblockModifiedsec = capiblockModifiedsec;
    }

    public int getSalesManRef() {
        return salesManRef;
    }

    public void setSalesManRef(int salesManRef) {
        this.salesManRef = salesManRef;
    }

    public Short getCancelledAcc() {
        return cancelledAcc;
    }

    public void setCancelledAcc(Short cancelledAcc) {
        this.cancelledAcc = cancelledAcc;
    }

    public String getShpTypeCode() {
        return shpTypeCode;
    }

    public void setShpTypeCode(String shpTypeCode) {
        this.shpTypeCode = shpTypeCode;
    }

    public String getShpAgnCode() {
        return shpAgnCode;
    }

    public void setShpAgnCode(String shpAgnCode) {
        this.shpAgnCode = shpAgnCode;
    }

    public String getTrackNr() {
        return trackNr;
    }

    public void setTrackNr(String trackNr) {
        this.trackNr = trackNr;
    }

    public Short getGenexcTyp() {
        return genexcTyp;
    }

    public void setGenexcTyp(Short genexcTyp) {
        this.genexcTyp = genexcTyp;
    }

    public Short getLineExcTyp() {
        return lineExcTyp;
    }

    public void setLineExcTyp(Short lineExcTyp) {
        this.lineExcTyp = lineExcTyp;
    }

    public String getTradingGrp() {
        return tradingGrp;
    }

    public void setTradingGrp(String tradingGrp) {
        this.tradingGrp = tradingGrp;
    }

    public Short getTextInc() {
        return textInc;
    }

    public void setTextInc(Short textInc) {
        this.textInc = textInc;
    }

    public Short getSiteId() {
        return siteId;
    }

    public void setSiteId(Short siteId) {
        this.siteId = siteId;
    }

    public Short getRecStatus() {
        return recStatus;
    }

    public void setRecStatus(Short recStatus) {
        this.recStatus = recStatus;
    }

    public int getOrgLogRef() {
        return orgLogRef;
    }

    public void setOrgLogRef(int orgLogRef) {
        this.orgLogRef = orgLogRef;
    }

    public int getWfStatus() {
        return wfStatus;
    }

    public void setWfStatus(int wfStatus) {
        this.wfStatus = wfStatus;
    }

    public int getShipInfoRef() {
        return shipInfoRef;
    }

    public void setShipInfoRef(int shipInfoRef) {
        this.shipInfoRef = shipInfoRef;
    }

    public int getDistOrderRef() {
        return distOrderRef;
    }

    public void setDistOrderRef(int distOrderRef) {
        this.distOrderRef = distOrderRef;
    }

    public Short getSendCnt() {
        return sendCnt;
    }

    public void setSendCnt(Short sendCnt) {
        this.sendCnt = sendCnt;
    }

    public Short getDlvClient() {
        return dlvClient;
    }

    public void setDlvClient(Short dlvClient) {
        this.dlvClient = dlvClient;
    }

    public String getDocTrackingGnr() {
        return docTrackingGnr;
    }

    public void setDocTrackingGnr(String docTrackingGnr) {
        this.docTrackingGnr = docTrackingGnr;
    }

    public Short getAddTaxCalc() {
        return addTaxCalc;
    }

    public void setAddTaxCalc(Short addTaxCalc) {
        this.addTaxCalc = addTaxCalc;
    }

    public float getTotalAddTax() {
        return totalAddTax;
    }

    public void setTotalAddTax(float totalAddTax) {
        this.totalAddTax = totalAddTax;
    }

    public String getUgirTrackingNo() {
        return ugirTrackingNo;
    }

    public void setUgirTrackingNo(String ugirTrackingNo) {
        this.ugirTrackingNo = ugirTrackingNo;
    }

    public int getqProdfcRef() {
        return qProdfcRef;
    }

    public void setqProdfcRef(int qProdfcRef) {
        this.qProdfcRef = qProdfcRef;
    }

    public int getVaaccRef() {
        return vaaccRef;
    }

    public void setVaaccRef(int vaaccRef) {
        this.vaaccRef = vaaccRef;
    }

    public int getVaCenterRef() {
        return vaCenterRef;
    }

    public void setVaCenterRef(int vaCenterRef) {
        this.vaCenterRef = vaCenterRef;
    }

    public String getOrgLogoId() {
        return orgLogoId;
    }

    public void setOrgLogoId(String orgLogoId) {
        this.orgLogoId = orgLogoId;
    }

    public Short getFromExim() {
        return fromExim;
    }

    public void setFromExim(Short fromExim) {
        this.fromExim = fromExim;
    }

    public String getFrgTypeCode() {
        return frgTypeCode;
    }

    public void setFrgTypeCode(String frgTypeCode) {
        this.frgTypeCode = frgTypeCode;
    }

    public Short getTrCurr() {
        return trCurr;
    }

    public void setTrCurr(Short trCurr) {
        this.trCurr = trCurr;
    }

    public float getTrRate() {
        return trRate;
    }

    public void setTrRate(float trRate) {
        this.trRate = trRate;
    }

    public float getTrNet() {
        return trNet;
    }

    public void setTrNet(float trNet) {
        this.trNet = trNet;
    }

    public int getEximwhfcRef() {
        return eximwhfcRef;
    }

    public void setEximwhfcRef(int eximwhfcRef) {
        this.eximwhfcRef = eximwhfcRef;
    }

    public Short getEximfcType() {
        return eximfcType;
    }

    public void setEximfcType(Short eximfcType) {
        this.eximfcType = eximfcType;
    }

    public int getMainstfcRef() {
        return mainstfcRef;
    }

    public void setMainstfcRef(int mainstfcRef) {
        this.mainstfcRef = mainstfcRef;
    }

    public Short getFromOrdWithPay() {
        return fromOrdWithPay;
    }

    public void setFromOrdWithPay(Short fromOrdWithPay) {
        this.fromOrdWithPay = fromOrdWithPay;
    }

    public int getProjectRef() {
        return projectRef;
    }

    public void setProjectRef(int projectRef) {
        this.projectRef = projectRef;
    }

    public int getwFlowCardRef() {
        return wFlowCardRef;
    }

    public void setwFlowCardRef(int wFlowCardRef) {
        this.wFlowCardRef = wFlowCardRef;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getUpdTrCurr() {
        return updTrCurr;
    }

    public void setUpdTrCurr(Short updTrCurr) {
        this.updTrCurr = updTrCurr;
    }

    public float getTotalExAddTax() {
        return totalExAddTax;
    }

    public void setTotalExAddTax(float totalExAddTax) {
        this.totalExAddTax = totalExAddTax;
    }

    public Short getDeductionPart1() {
        return deductionPart1;
    }

    public void setDeductionPart1(Short deductionPart1) {
        this.deductionPart1 = deductionPart1;
    }

    public Short getDeductionPart2() {
        return deductionPart2;
    }

    public void setDeductionPart2(Short deductionPart2) {
        this.deductionPart2 = deductionPart2;
    }

    public Short getAffectCollatrl() {
        return affectCollatrl;
    }

    public void setAffectCollatrl(Short affectCollatrl) {
        this.affectCollatrl = affectCollatrl;
    }

    public Short getGrpFirmTrans() {
        return grpFirmTrans;
    }

    public void setGrpFirmTrans(Short grpFirmTrans) {
        this.grpFirmTrans = grpFirmTrans;
    }

    public Short getAffectRisk() {
        return affectRisk;
    }

    public void setAffectRisk(Short affectRisk) {
        this.affectRisk = affectRisk;
    }
    
    private String checkDate(String date){
        String newDate;
        if(date == null){
            newDate = "NULL";
        }else{
            newDate = date;
        }
        return newDate;
    }
}

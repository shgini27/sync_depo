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
public class Invoice implements java.io.Serializable{
    private int logicalRef;
    private Short grpCode;
    private Short trCode;
    private String ficheNo;
    private String date;
    private int time;
    private String doCode;
    private String specode;
    private String cyphCode;
    private int clientRef;
    private int recvRef;
    private int CenterRef;
    private int accountRef;
    private Short sourceIndex;
    private Short sourceCostGrp;
    private Short cancelled;
    private Short accounted;
    private Short paidInCash;
    private Short fromKasa;
    private Short entegSet;
    private float vat;
    private float addDiscounts;
    private float totalDiscounts;
    private float totalDiscounted;
    private float addExpenses;
    private float totalExpenses;
    private float distExpense;
    private float totalDeposito;
    private float totalPromotions;
    private float vatIncGross;
    private float totalVat;
    private float grossTotal;
    private float netTotal;
    private String genexp1;
    private String genexp2;
    private String genexp3;
    private String genexp4;
    private float interestApp;
    private Short trCurr;
    private float trRate;
    private float trNet;
    private float reportRate;
    private float reportNet;
    private Short onlyOnePayLine;
    private int kastransRef;
    private int payDefRef;
    private Short printCnt;
    private Short gVatInc;
    private Short branch;
    private Short department;
    private int accFisheRef;
    private int addExpAccRef;
    private int addExpCentRef;
    private Short decprdiff;
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
    private Short factoryNr;
    private int wfStatus;
    private int shipInfoRef;
    private int distOrderRef;
    private Short sendCnt;
    private Short dlvClient;
    private int costOfSaleFcRef;
    private Short opStat;
    private String docTrackinNr;
    private float totalAddTax;
    private Short paymentType;
    private float infidx;
    private Short accountedCnt;
    private String orgLogoId;
    private Short fromExim;
    private String frgTypeCode;
    private Short eximfcType;
    private Short fromOrdWithPay;
    private int projectRef;
    private int wFlowCardRef;
    private Short status;
    private Short deductionPart1;
    private Short deductionPart2;
    private float totalExAddTax;
    private Short exAccounted;
    private Short fromBank;
    private int bnTransRef;
    private Short affectCollatrl;
    private Short grpFirmTrns;
    private Short affectRisk;
    private Short controlInfo;
    private Short postTransferInfo;
    private Short taxFreeChx;
    private String passportNo;
    private String creditCardNo;

    public Invoice(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public Invoice(int logicalRef, Short grpCode, Short trCode, String ficheNo, 
            String date, int time, String doCode, String specode, String cyphCode, 
            int clientRef, int recvRef, int CenterRef, int accountRef, Short sourceIndex, 
            Short sourceCostGrp, Short cancelled, Short accounted, Short paidInCash, 
            Short fromKasa, Short entegSet, float vat, float addDiscounts, float totalDiscounts, 
            float totalDiscounted, float addExpenses, float totalExpenses, float distExpense, 
            float totalDeposito, float totalPromotions, float vatIncGross, float totalVat, 
            float grossTotal, float netTotal, String genexp1, String genexp2, String genexp3, 
            String genexp4, float interestApp, Short trCurr, float trRate, float trNet, 
            float reportRate, float reportNet, Short onlyOnePayLine, int kastransRef, 
            int payDefRef, Short printCnt, Short gVatInc, Short branch, Short department, 
            int accFisheRef, int addExpAccRef, int addExpCentRef, Short decprdiff, 
            Short capiblockCreatedby, String capiblockCreadeddate, Short capiblockCreatedhour, 
            Short capiblockCreatedmin, Short capiblockCreatedsec, Short capiblockModifiedby, 
            String capiblockModifieddate, Short capiblockModifiedhour, Short capiblockModifiedmin, 
            Short capiblockModifiedsec, int salesManRef, Short cancelledAcc, String shpTypeCode, 
            String shpAgnCode, String trackNr, Short genexcTyp, Short LineExcTyp, String tradingGrp, 
            Short textInc, Short siteId, Short recStatus, int orgLogRef, Short factoryNr, int wfStatus, 
            int shipInfoRef, int distOrderRef, Short sendCnt, Short dlvClient, int costOfSaleFcRef, 
            Short opStat, String docTrackinNr, float totalAddTax, Short paymentType, float infidx, 
            Short accountedCnt, String orgLogoId, Short fromExim, String frgTypeCode, Short eximfcType, 
            Short fromOrdWithPay, int projectRef, int wFlowCardRef, Short status, Short deductionPart1, 
            Short deductionPart2, float totalExAddTax, Short exAccounted, Short fromBank, int bnTransRef, 
            Short affectCollatrl, Short grpFirmTrns, Short affectRisk, Short controlInfo, Short postTransferInfo, 
            Short taxFreeChx, String passportNo, String creditCardNo) {
        this.logicalRef = logicalRef;
        this.grpCode = grpCode;
        this.trCode = trCode;
        this.ficheNo = ficheNo;
        this.date = date;
        this.time = time;
        this.doCode = doCode;
        this.specode = specode;
        this.cyphCode = cyphCode;
        this.clientRef = clientRef;
        this.recvRef = recvRef;
        this.CenterRef = CenterRef;
        this.accountRef = accountRef;
        this.sourceIndex = sourceIndex;
        this.sourceCostGrp = sourceCostGrp;
        this.cancelled = cancelled;
        this.accounted = accounted;
        this.paidInCash = paidInCash;
        this.fromKasa = fromKasa;
        this.entegSet = entegSet;
        this.vat = vat;
        this.addDiscounts = addDiscounts;
        this.totalDiscounts = totalDiscounts;
        this.totalDiscounted = totalDiscounted;
        this.addExpenses = addExpenses;
        this.totalExpenses = totalExpenses;
        this.distExpense = distExpense;
        this.totalDeposito = totalDeposito;
        this.totalPromotions = totalPromotions;
        this.vatIncGross = vatIncGross;
        this.totalVat = totalVat;
        this.grossTotal = grossTotal;
        this.netTotal = netTotal;
        this.genexp1 = genexp1;
        this.genexp2 = genexp2;
        this.genexp3 = genexp3;
        this.genexp4 = genexp4;
        this.interestApp = interestApp;
        this.trCurr = trCurr;
        this.trRate = trRate;
        this.trNet = trNet;
        this.reportRate = reportRate;
        this.reportNet = reportNet;
        this.onlyOnePayLine = onlyOnePayLine;
        this.kastransRef = kastransRef;
        this.payDefRef = payDefRef;
        this.printCnt = printCnt;
        this.gVatInc = gVatInc;
        this.branch = branch;
        this.department = department;
        this.accFisheRef = accFisheRef;
        this.addExpAccRef = addExpAccRef;
        this.addExpCentRef = addExpCentRef;
        this.decprdiff = decprdiff;
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
        this.lineExcTyp = LineExcTyp;
        this.tradingGrp = tradingGrp;
        this.textInc = textInc;
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogRef = orgLogRef;
        this.factoryNr = factoryNr;
        this.wfStatus = wfStatus;
        this.shipInfoRef = shipInfoRef;
        this.distOrderRef = distOrderRef;
        this.sendCnt = sendCnt;
        this.dlvClient = dlvClient;
        this.costOfSaleFcRef = costOfSaleFcRef;
        this.opStat = opStat;
        this.docTrackinNr = docTrackinNr;
        this.totalAddTax = totalAddTax;
        this.paymentType = paymentType;
        this.infidx = infidx;
        this.accountedCnt = accountedCnt;
        this.orgLogoId = orgLogoId;
        this.fromExim = fromExim;
        this.frgTypeCode = frgTypeCode;
        this.eximfcType = eximfcType;
        this.fromOrdWithPay = fromOrdWithPay;
        this.projectRef = projectRef;
        this.wFlowCardRef = wFlowCardRef;
        this.status = status;
        this.deductionPart1 = deductionPart1;
        this.deductionPart2 = deductionPart2;
        this.totalExAddTax = totalExAddTax;
        this.exAccounted = exAccounted;
        this.fromBank = fromBank;
        this.bnTransRef = bnTransRef;
        this.affectCollatrl = affectCollatrl;
        this.grpFirmTrns = grpFirmTrns;
        this.affectRisk = affectRisk;
        this.controlInfo = controlInfo;
        this.postTransferInfo = postTransferInfo;
        this.taxFreeChx = taxFreeChx;
        this.passportNo = passportNo;
        this.creditCardNo = creditCardNo;
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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDoCode() {
        return doCode;
    }

    public void setDoCode(String doCode) {
        this.doCode = doCode;
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

    public int getCenterRef() {
        return CenterRef;
    }

    public void setCenterRef(int CenterRef) {
        this.CenterRef = CenterRef;
    }

    public int getAccountRef() {
        return accountRef;
    }

    public void setAccountRef(int accountRef) {
        this.accountRef = accountRef;
    }

    public Short getSourceIndex() {
        return sourceIndex;
    }

    public void setSourceIndex(Short sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    public Short getSourceCostGrp() {
        return sourceCostGrp;
    }

    public void setSourceCostGrp(Short sourceCostGrp) {
        this.sourceCostGrp = sourceCostGrp;
    }

    public Short getCancelled() {
        return cancelled;
    }

    public void setCancelled(Short cancelled) {
        this.cancelled = cancelled;
    }

    public Short getAccounted() {
        return accounted;
    }

    public void setAccounted(Short accounted) {
        this.accounted = accounted;
    }

    public Short getPaidInCash() {
        return paidInCash;
    }

    public void setPaidInCash(Short paidInCash) {
        this.paidInCash = paidInCash;
    }

    public Short getFromKasa() {
        return fromKasa;
    }

    public void setFromKasa(Short fromKasa) {
        this.fromKasa = fromKasa;
    }

    public Short getEntegSet() {
        return entegSet;
    }

    public void setEntegSet(Short entegSet) {
        this.entegSet = entegSet;
    }

    public float getVat() {
        return vat;
    }

    public void setVat(float vat) {
        this.vat = vat;
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

    public float getDistExpense() {
        return distExpense;
    }

    public void setDistExpense(float distExpense) {
        this.distExpense = distExpense;
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

    public float getVatIncGross() {
        return vatIncGross;
    }

    public void setVatIncGross(float vatIncGross) {
        this.vatIncGross = vatIncGross;
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

    public float getInterestApp() {
        return interestApp;
    }

    public void setInterestApp(float interestApp) {
        this.interestApp = interestApp;
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

    public Short getOnlyOnePayLine() {
        return onlyOnePayLine;
    }

    public void setOnlyOnePayLine(Short onlyOnePayLine) {
        this.onlyOnePayLine = onlyOnePayLine;
    }

    public int getKastransRef() {
        return kastransRef;
    }

    public void setKastransRef(int kastransRef) {
        this.kastransRef = kastransRef;
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

    public Short getgVatInc() {
        return gVatInc;
    }

    public void setgVatInc(Short gVatInc) {
        this.gVatInc = gVatInc;
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

    public int getAccFisheRef() {
        return accFisheRef;
    }

    public void setAccFisheRef(int accFisheRef) {
        this.accFisheRef = accFisheRef;
    }

    public int getAddExpAccRef() {
        return addExpAccRef;
    }

    public void setAddExpAccRef(int addExpAccRef) {
        this.addExpAccRef = addExpAccRef;
    }

    public int getAddExpCentRef() {
        return addExpCentRef;
    }

    public void setAddExpCentRef(int addExpCentRef) {
        this.addExpCentRef = addExpCentRef;
    }

    public Short getDecprdiff() {
        return decprdiff;
    }

    public void setDecprdiff(Short decprdiff) {
        this.decprdiff = decprdiff;
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

    public void setLineExcTyp(Short LineExcTyp) {
        this.lineExcTyp = LineExcTyp;
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

    public Short getFactoryNr() {
        return factoryNr;
    }

    public void setFactoryNr(Short factoryNr) {
        this.factoryNr = factoryNr;
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

    public int getCostOfSaleFcRef() {
        return costOfSaleFcRef;
    }

    public void setCostOfSaleFcRef(int costOfSaleFcRef) {
        this.costOfSaleFcRef = costOfSaleFcRef;
    }

    public Short getOpStat() {
        return opStat;
    }

    public void setOpStat(Short opStat) {
        this.opStat = opStat;
    }

    public String getDocTrackinNr() {
        return docTrackinNr;
    }

    public void setDocTrackinNr(String docTrackinNr) {
        this.docTrackinNr = docTrackinNr;
    }

    public float getTotalAddTax() {
        return totalAddTax;
    }

    public void setTotalAddTax(float totalAddTax) {
        this.totalAddTax = totalAddTax;
    }

    public Short getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Short paymentType) {
        this.paymentType = paymentType;
    }

    public float getInfidx() {
        return infidx;
    }

    public void setInfidx(float infidx) {
        this.infidx = infidx;
    }

    public Short getAccountedCnt() {
        return accountedCnt;
    }

    public void setAccountedCnt(Short accountedCnt) {
        this.accountedCnt = accountedCnt;
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

    public Short getEximfcType() {
        return eximfcType;
    }

    public void setEximfcType(Short eximfcType) {
        this.eximfcType = eximfcType;
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

    public float getTotalExAddTax() {
        return totalExAddTax;
    }

    public void setTotalExAddTax(float totalExAddTax) {
        this.totalExAddTax = totalExAddTax;
    }

    public Short getExAccounted() {
        return exAccounted;
    }

    public void setExAccounted(Short exAccounted) {
        this.exAccounted = exAccounted;
    }

    public Short getFromBank() {
        return fromBank;
    }

    public void setFromBank(Short fromBank) {
        this.fromBank = fromBank;
    }

    public int getBnTransRef() {
        return bnTransRef;
    }

    public void setBnTransRef(int bnTransRef) {
        this.bnTransRef = bnTransRef;
    }

    public Short getAffectCollatrl() {
        return affectCollatrl;
    }

    public void setAffectCollatrl(Short affectCollatrl) {
        this.affectCollatrl = affectCollatrl;
    }

    public Short getGrpFirmTrns() {
        return grpFirmTrns;
    }

    public void setGrpFirmTrns(Short grpFirmTrns) {
        this.grpFirmTrns = grpFirmTrns;
    }

    public Short getAffectRisk() {
        return affectRisk;
    }

    public void setAffectRisk(Short affectRisk) {
        this.affectRisk = affectRisk;
    }

    public Short getControlInfo() {
        return controlInfo;
    }

    public void setControlInfo(Short controlInfo) {
        this.controlInfo = controlInfo;
    }

    public Short getPostTransferInfo() {
        return postTransferInfo;
    }

    public void setPostTransferInfo(Short postTransferInfo) {
        this.postTransferInfo = postTransferInfo;
    }

    public Short getTaxFreeChx() {
        return taxFreeChx;
    }

    public void setTaxFreeChx(Short taxFreeChx) {
        this.taxFreeChx = taxFreeChx;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
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

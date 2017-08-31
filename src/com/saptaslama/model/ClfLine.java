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
public class ClfLine implements java.io.Serializable{
    private int logicalRef;
    private int clientRef;
    private int claccRef;
    private int clCenterRef;
    private int cashCenterRef;
    private int cashAccountRef;
    private int virManRef;
    private int sourceFRef;
    private String date;
    private Short department;
    private Short branch;
    private Short moduleNr;
    private Short trCode;
    private Short lineNr;
    private String specode;
    private String cyphCode;
    private String tranNo;
    private String doCode;
    private String lineExp;
    private Short accounted;
    private Short sign;
    private float amount;
    private Short trCurr;
    private float trRate;
    private float trNet;
    private float reportRate;
    private float reportNet;
    private int extenRef;
    private int payDefRef;
    private int accFicheRef;
    private Short printCnt;
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
    private Short cancelled;
    private Short trgFlag;
    private String tradingGrp;
    private Short lineExpType;
    private Short onlyOnePayLine;
    private Short discFlag;
    private float discRate;
    private float vatRate;
    private float cashAmount;
    private int discAccRef;
    private int discCentRef;
    private int vatrAccRef;
    private int vatrCenRef;
    private int paymentRef;
    private float vatAmount;
    private Short siteId;
    private Short recStatus;
    private int orgLogicRef;
    private float infidx;
    private int poscommAccRef;
    private int poscommCenRef;
    private int pointCommAccRef;
    private int pointCommCenRef;
    private String cheqInfo;
    private String creditCno;
    private int clprjRef;
    private Short status;
    private int eximFileRef;
    private Short eximProcNr;
    private Short month;
    private Short year;
    private float fundsShareRat;
    private Short affectCollatRl;
    private Short grpFirmTrans;
    private int reflVatAccRef;
    private int reflVatOthAccRef;
    private Short affectRisk;
    private int batchNr;
    private int approveNr;
    private String batchNum;
    private String approveNum;

    public ClfLine(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public ClfLine(int logicalRef, int clientRef, int claccRef, int clCenterRef, 
            int cashCenterRef, int cashAccountRef, int virManRef, int sourceFRef, String date, Short department, 
            Short branch, Short moduleNr, Short trCode, Short lineNr, String specode, 
            String cyphCode, String tranNo, String doCode, String lineExp, Short accounted, 
            Short sign, float amount, Short trCurr, float trRate, float trNet, float reportRate, 
            float reportNet, int extenRef, int payDefRef, int accFicheRef, Short printCnt, 
            Short capiblockCreatedby, String capiblockCreadeddate, Short capiblockCreatedhour, 
            Short capiblockCreatedmin, Short capiblockCreatedsec, Short capiblockModifiedby, 
            String capiblockModifieddate, Short capiblockModifiedhour, Short capiblockModifiedmin, 
            Short capiblockModifiedsec, Short cancelled, Short trgFlag, String tradingGrp, 
            Short lineExpType, Short onlyOnePayLine, Short discFlag, float discRate, float vatRate, 
            float cashAmount, int discAccRef, int discCentRef, int vatrAccRef, int vatrCenRef, 
            int paymentRef, float vatAmount, Short siteId, Short recStatus, int orgLogicRef, 
            float infidx, int poscommAccRef, int poscommCenRef, int pointCommAccRef, int pointCommCenRef, 
            String cheqInfo, String creditCno, int clprjRef, Short status, int eximFileRef, 
            Short eximProcNr, Short month, Short year, float fundsShareRat, Short affectCollatRl, 
            Short grpFirmTrans, int reflVatAccRef, int reflVatOthAccRef, Short affectRisk, 
            int batchNr, int approveNr, String batchNum, String approveNum) {
        this.logicalRef = logicalRef;
        this.clientRef = clientRef;
        this.claccRef = claccRef;
        this.clCenterRef = clCenterRef;
        this.cashCenterRef = cashCenterRef;
        this.cashAccountRef = cashAccountRef;
        this.virManRef = virManRef;
        this.sourceFRef = sourceFRef;
        this.date = date;
        this.department = department;
        this.branch = branch;
        this.moduleNr = moduleNr;
        this.trCode = trCode;
        this.lineNr = lineNr;
        this.specode = specode;
        this.cyphCode = cyphCode;
        this.tranNo = tranNo;
        this.doCode = doCode;
        this.lineExp = lineExp;
        this.accounted = accounted;
        this.sign = sign;
        this.amount = amount;
        this.trCurr = trCurr;
        this.trRate = trRate;
        this.trNet = trNet;
        this.reportRate = reportRate;
        this.reportNet = reportNet;
        this.extenRef = extenRef;
        this.payDefRef = payDefRef;
        this.accFicheRef = accFicheRef;
        this.printCnt = printCnt;
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
        this.cancelled = cancelled;
        this.trgFlag = trgFlag;
        this.tradingGrp = tradingGrp;
        this.lineExpType = lineExpType;
        this.onlyOnePayLine = onlyOnePayLine;
        this.discFlag = discFlag;
        this.discRate = discRate;
        this.vatRate = vatRate;
        this.cashAmount = cashAmount;
        this.discAccRef = discAccRef;
        this.discCentRef = discCentRef;
        this.vatrAccRef = vatrAccRef;
        this.vatrCenRef = vatrCenRef;
        this.paymentRef = paymentRef;
        this.vatAmount = vatAmount;
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogicRef = orgLogicRef;
        this.infidx = infidx;
        this.poscommAccRef = poscommAccRef;
        this.poscommCenRef = poscommCenRef;
        this.pointCommAccRef = pointCommAccRef;
        this.pointCommCenRef = pointCommCenRef;
        this.cheqInfo = cheqInfo;
        this.creditCno = creditCno;
        this.clprjRef = clprjRef;
        this.status = status;
        this.eximFileRef = eximFileRef;
        this.eximProcNr = eximProcNr;
        this.month = month;
        this.year = year;
        this.fundsShareRat = fundsShareRat;
        this.affectCollatRl = affectCollatRl;
        this.grpFirmTrans = grpFirmTrans;
        this.reflVatAccRef = reflVatAccRef;
        this.reflVatOthAccRef = reflVatOthAccRef;
        this.affectRisk = affectRisk;
        this.batchNr = batchNr;
        this.approveNr = approveNr;
        this.batchNum = batchNum;
        this.approveNum = approveNum;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public int getClientRef() {
        return clientRef;
    }

    public void setClientRef(int clientRef) {
        this.clientRef = clientRef;
    }

    public int getClaccRef() {
        return claccRef;
    }

    public void setClaccRef(int claccRef) {
        this.claccRef = claccRef;
    }

    public int getClCenterRef() {
        return clCenterRef;
    }

    public void setClCenterRef(int clCenterRef) {
        this.clCenterRef = clCenterRef;
    }

    public int getCashCenterRef() {
        return cashCenterRef;
    }

    public void setCashCenterRef(int cashCenterRef) {
        this.cashCenterRef = cashCenterRef;
    }

    public int getCashAccountRef() {
        return cashAccountRef;
    }

    public void setCashAccountRef(int cashAccountRef) {
        this.cashAccountRef = cashAccountRef;
    }

    
    public int getVirManRef() {
        return virManRef;
    }

    public void setVirManRef(int virManRef) {
        this.virManRef = virManRef;
    }

    public int getSourceFRef() {
        return sourceFRef;
    }

    public void setSourceFRef(int sourceFRef) {
        this.sourceFRef = sourceFRef;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Short getDepartment() {
        return department;
    }

    public void setDepartment(Short department) {
        this.department = department;
    }

    public Short getBranch() {
        return branch;
    }

    public void setBranch(Short branch) {
        this.branch = branch;
    }

    public Short getModuleNr() {
        return moduleNr;
    }

    public void setModuleNr(Short moduleNr) {
        this.moduleNr = moduleNr;
    }

    public Short getTrCode() {
        return trCode;
    }

    public void setTrCode(Short trCode) {
        this.trCode = trCode;
    }

    public Short getLineNr() {
        return lineNr;
    }

    public void setLineNr(Short lineNr) {
        this.lineNr = lineNr;
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

    public String getTranNo() {
        return tranNo;
    }

    public void setTranNo(String tranNo) {
        this.tranNo = tranNo;
    }

    public String getDoCode() {
        return doCode;
    }

    public void setDoCode(String doCode) {
        this.doCode = doCode;
    }

    public String getLineExp() {
        return lineExp;
    }

    public void setLineExp(String lineExp) {
        this.lineExp = lineExp;
    }

    public Short getAccounted() {
        return accounted;
    }

    public void setAccounted(Short accounted) {
        this.accounted = accounted;
    }

    public Short getSign() {
        return sign;
    }

    public void setSign(Short sign) {
        this.sign = sign;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
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

    public int getAccFicheRef() {
        return accFicheRef;
    }

    public void setAccFicheRef(int accFicheRef) {
        this.accFicheRef = accFicheRef;
    }

    public Short getPrintCnt() {
        return printCnt;
    }

    public void setPrintCnt(Short printCnt) {
        this.printCnt = printCnt;
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

    public Short getCancelled() {
        return cancelled;
    }

    public void setCancelled(Short cancelled) {
        this.cancelled = cancelled;
    }

    public Short getTrgFlag() {
        return trgFlag;
    }

    public void setTrgFlag(Short trgFlag) {
        this.trgFlag = trgFlag;
    }

    public String getTradingGrp() {
        return tradingGrp;
    }

    public void setTradingGrp(String tradingGrp) {
        this.tradingGrp = tradingGrp;
    }

    public Short getLineExpType() {
        return lineExpType;
    }

    public void setLineExpType(Short lineExpType) {
        this.lineExpType = lineExpType;
    }

    public Short getOnlyOnePayLine() {
        return onlyOnePayLine;
    }

    public void setOnlyOnePayLine(Short onlyOnePayLine) {
        this.onlyOnePayLine = onlyOnePayLine;
    }

    public Short getDiscFlag() {
        return discFlag;
    }

    public void setDiscFlag(Short discFlag) {
        this.discFlag = discFlag;
    }

    public float getDiscRate() {
        return discRate;
    }

    public void setDiscRate(float discRate) {
        this.discRate = discRate;
    }

    public float getVatRate() {
        return vatRate;
    }

    public void setVatRate(float vatRate) {
        this.vatRate = vatRate;
    }

    public float getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(float cashAmount) {
        this.cashAmount = cashAmount;
    }

    public int getDiscAccRef() {
        return discAccRef;
    }

    public void setDiscAccRef(int discAccRef) {
        this.discAccRef = discAccRef;
    }

    public int getDiscCentRef() {
        return discCentRef;
    }

    public void setDiscCentRef(int discCentRef) {
        this.discCentRef = discCentRef;
    }

    public int getVatrAccRef() {
        return vatrAccRef;
    }

    public void setVatrAccRef(int vatrAccRef) {
        this.vatrAccRef = vatrAccRef;
    }

    public int getVatrCenRef() {
        return vatrCenRef;
    }

    public void setVatrCenRef(int vatrCenRef) {
        this.vatrCenRef = vatrCenRef;
    }

    public int getPaymentRef() {
        return paymentRef;
    }

    public void setPaymentRef(int paymentRef) {
        this.paymentRef = paymentRef;
    }

    public float getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(float vatAmount) {
        this.vatAmount = vatAmount;
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

    public int getOrgLogicRef() {
        return orgLogicRef;
    }

    public void setOrgLogicRef(int orgLogicRef) {
        this.orgLogicRef = orgLogicRef;
    }

    public float getInfidx() {
        return infidx;
    }

    public void setInfidx(float infidx) {
        this.infidx = infidx;
    }

    public int getPoscommAccRef() {
        return poscommAccRef;
    }

    public void setPoscommAccRef(int poscommAccRef) {
        this.poscommAccRef = poscommAccRef;
    }

    public int getPoscommCenRef() {
        return poscommCenRef;
    }

    public void setPoscommCenRef(int poscommCenRef) {
        this.poscommCenRef = poscommCenRef;
    }

    public int getPointCommAccRef() {
        return pointCommAccRef;
    }

    public void setPointCommAccRef(int pointCommAccRef) {
        this.pointCommAccRef = pointCommAccRef;
    }

    public int getPointCommCenRef() {
        return pointCommCenRef;
    }

    public void setPointCommCenRef(int pointCommCenRef) {
        this.pointCommCenRef = pointCommCenRef;
    }

    public String getCheqInfo() {
        return cheqInfo;
    }

    public void setCheqInfo(String cheqInfo) {
        this.cheqInfo = cheqInfo;
    }

    public String getCreditCno() {
        return creditCno;
    }

    public void setCreditCno(String creditCno) {
        this.creditCno = creditCno;
    }

    public int getClprjRef() {
        return clprjRef;
    }

    public void setClprjRef(int clprjRef) {
        this.clprjRef = clprjRef;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public int getEximFileRef() {
        return eximFileRef;
    }

    public void setEximFileRef(int eximFileRef) {
        this.eximFileRef = eximFileRef;
    }

    public Short getEximProcNr() {
        return eximProcNr;
    }

    public void setEximProcNr(Short eximProcNr) {
        this.eximProcNr = eximProcNr;
    }

    public Short getMonth() {
        return month;
    }

    public void setMonth(Short month) {
        this.month = month;
    }

    public Short getYear() {
        return year;
    }

    public void setYear(Short year) {
        this.year = year;
    }

    public float getFundsShareRat() {
        return fundsShareRat;
    }

    public void setFundsShareRat(float fundsShareRat) {
        this.fundsShareRat = fundsShareRat;
    }

    public Short getAffectCollatRl() {
        return affectCollatRl;
    }

    public void setAffectCollatRl(Short affectCollatRl) {
        this.affectCollatRl = affectCollatRl;
    }

    public Short getGrpFirmTrans() {
        return grpFirmTrans;
    }

    public void setGrpFirmTrans(Short grpFirmTrans) {
        this.grpFirmTrans = grpFirmTrans;
    }

    public int getReflVatAccRef() {
        return reflVatAccRef;
    }

    public void setReflVatAccRef(int reflVatAccRef) {
        this.reflVatAccRef = reflVatAccRef;
    }

    public int getReflVatOthAccRef() {
        return reflVatOthAccRef;
    }

    public void setReflVatOthAccRef(int reflVatOthAccRef) {
        this.reflVatOthAccRef = reflVatOthAccRef;
    }

    public Short getAffectRisk() {
        return affectRisk;
    }

    public void setAffectRisk(Short affectRisk) {
        this.affectRisk = affectRisk;
    }

    public int getBatchNr() {
        return batchNr;
    }

    public void setBatchNr(int batchNr) {
        this.batchNr = batchNr;
    }

    public int getApproveNr() {
        return approveNr;
    }

    public void setApproveNr(int approveNr) {
        this.approveNr = approveNr;
    }

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }

    public String getApproveNum() {
        return approveNum;
    }

    public void setApproveNum(String approveNum) {
        this.approveNum = approveNum;
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

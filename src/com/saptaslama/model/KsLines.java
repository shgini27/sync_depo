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
public class KsLines implements java.io.Serializable{
    private int logicalRef;
    private int cardRef;
    private int vCardRef;
    private int transRef;
    private int accRef;
    private int centerRef;
    private int csAccRef;
    private int csCenterRef;
    private String date;
    private Short hour;
    private Short minute;
    private Short trCode;
    private Short branch;
    private Short department;
    private Short destBranch;
    private Short destDepartment;
    private String specode;
    private String cyphCode;
    private String ficheNo;
    private String custTitle;
    private String lineExp;
    private float amount;
    private float reportRate;
    private float reportNet;
    private float trRate;
    private float trNet;
    private Short trCurr;
    private Short sign;
    private Short accounted;
    private Short cancelled;
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
    private Short cancelledAcc;
    private Short genexcTyp;
    private Short lineExcTyp;
    private String tradingGrp;
    private Short textInc;
    private Short siteId;
    private Short recStatus;
    private int orgLogicRef;
    private int wfStatus;
    private Short gpopType;
    private float gpincometacrat;
    private float gpFundShareRat;
    private String gpPlate;
    private int gpTaxAcc;
    private int gpFundAcc;
    private String gpAddr;
    private float smmVatRate;
    private int smmVatAcRef;
    private int smmVatCenterRef;
    private String smmDoCode;
    private float infidx;
    private String tranGrpNo;
    private Short tranGrpLineNo;
    private String orgLogoId;
    private Short vatInc;
    private float vatRate;
    private int vatAccRef;
    private float vatTot;
    private int projectRef;
    private int csTransRef;
    private Short status;
    private int wFlowCrdRef;
    private Short affectCollatRl;
    private Short grpFirmTrans;
    private String tranNo;
    private String doCode;
    private Short affectRisk;

    public KsLines(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public KsLines(int logicalRef, int cardRef, int vCardRef, int transRef, 
            int accRef, int centerRef, int csAccRef, int csCenterRef, String date, 
            Short hour, Short minute, Short trCode, Short branch, Short department, 
            Short destBranch, Short destDepartment, String specode, String cyphCode, 
            String ficheNo, String custTitle, String lineExp, float amount, float reportRate, 
            float reportNet, float trRate, float trNet, Short trCurr, Short sign, Short accounted, 
            Short cancelled, int accFicheRef, Short printCnt, Short capiblockCreatedby, 
            String capiblockCreadeddate, Short capiblockCreatedhour, Short capiblockCreatedmin, 
            Short capiblockCreatedsec, Short capiblockModifiedby, String capiblockModifieddate, 
            Short capiblockModifiedhour, Short capiblockModifiedmin, Short capiblockModifiedsec, 
            Short cancelledAcc, Short genexcTyp, Short lineExcTyp, String tradingGrp, Short textInc, 
            Short siteId, Short recStatus, int orgLogicRef, int wfStatus, Short gpopType, 
            float gpincometacrat, float gpFundShareRat, String gpPlate, int gpTaxAcc, int gpFundAcc, 
            String gpAddr, float smmVatRate, int smmVatAcRef, int smmVatCenterRef, String smmDoCode, 
            float infidx, String tranGrpNo, Short tranGrpLineNo, String orgLogoId, Short vatInc, 
            float vatRate, int vatAccRef, float vatTot, int projectRef, int csTransRef, Short status, 
            int wFlowCrdRef, Short affectCollatRl, Short grpFirmTrans, String tranNo, String doCode, 
            Short affectRisk) {
        this.logicalRef = logicalRef;
        this.cardRef = cardRef;
        this.vCardRef = vCardRef;
        this.transRef = transRef;
        this.accRef = accRef;
        this.centerRef = centerRef;
        this.csAccRef = csAccRef;
        this.csCenterRef = csCenterRef;
        this.date = checkDate(date);
        this.hour = hour;
        this.minute = minute;
        this.trCode = trCode;
        this.branch = branch;
        this.department = department;
        this.destBranch = destBranch;
        this.destDepartment = destDepartment;
        this.specode = specode;
        this.cyphCode = cyphCode;
        this.ficheNo = ficheNo;
        this.custTitle = custTitle;
        this.lineExp = lineExp;
        this.amount = amount;
        this.reportRate = reportRate;
        this.reportNet = reportNet;
        this.trRate = trRate;
        this.trNet = trNet;
        this.trCurr = trCurr;
        this.sign = sign;
        this.accounted = accounted;
        this.cancelled = cancelled;
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
        this.cancelledAcc = cancelledAcc;
        this.genexcTyp = genexcTyp;
        this.lineExcTyp = lineExcTyp;
        this.tradingGrp = tradingGrp;
        this.textInc = textInc;
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogicRef = orgLogicRef;
        this.wfStatus = wfStatus;
        this.gpopType = gpopType;
        this.gpincometacrat = gpincometacrat;
        this.gpFundShareRat = gpFundShareRat;
        this.gpPlate = gpPlate;
        this.gpTaxAcc = gpTaxAcc;
        this.gpFundAcc = gpFundAcc;
        this.gpAddr = gpAddr;
        this.smmVatRate = smmVatRate;
        this.smmVatAcRef = smmVatAcRef;
        this.smmVatCenterRef = smmVatCenterRef;
        this.smmDoCode = smmDoCode;
        this.infidx = infidx;
        this.tranGrpNo = tranGrpNo;
        this.tranGrpLineNo = tranGrpLineNo;
        this.orgLogoId = orgLogoId;
        this.vatInc = vatInc;
        this.vatRate = vatRate;
        this.vatAccRef = vatAccRef;
        this.vatTot = vatTot;
        this.projectRef = projectRef;
        this.csTransRef = csTransRef;
        this.status = status;
        this.wFlowCrdRef = wFlowCrdRef;
        this.affectCollatRl = affectCollatRl;
        this.grpFirmTrans = grpFirmTrans;
        this.tranNo = tranNo;
        this.doCode = doCode;
        this.affectRisk = affectRisk;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public int getCardRef() {
        return cardRef;
    }

    public void setCardRef(int cardRef) {
        this.cardRef = cardRef;
    }

    public int getvCardRef() {
        return vCardRef;
    }

    public void setvCardRef(int vCardRef) {
        this.vCardRef = vCardRef;
    }

    public int getTransRef() {
        return transRef;
    }

    public void setTransRef(int transRef) {
        this.transRef = transRef;
    }

    public int getAccRef() {
        return accRef;
    }

    public void setAccRef(int accRef) {
        this.accRef = accRef;
    }

    public int getCenterRef() {
        return centerRef;
    }

    public void setCenterRef(int centerRef) {
        this.centerRef = centerRef;
    }

    public int getCsAccRef() {
        return csAccRef;
    }

    public void setCsAccRef(int csAccRef) {
        this.csAccRef = csAccRef;
    }

    public int getCsCenterRef() {
        return csCenterRef;
    }

    public void setCsCenterRef(int csCenterRef) {
        this.csCenterRef = csCenterRef;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = checkDate(date);
    }

    public Short getHour() {
        return hour;
    }

    public void setHour(Short hour) {
        this.hour = hour;
    }

    public Short getMinute() {
        return minute;
    }

    public void setMinute(Short minute) {
        this.minute = minute;
    }

    public Short getTrCode() {
        return trCode;
    }

    public void setTrCode(Short trCode) {
        this.trCode = trCode;
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

    public Short getDestBranch() {
        return destBranch;
    }

    public void setDestBranch(Short destBranch) {
        this.destBranch = destBranch;
    }

    public Short getDestDepartment() {
        return destDepartment;
    }

    public void setDestDepartment(Short destDepartment) {
        this.destDepartment = destDepartment;
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

    public String getFicheNo() {
        return ficheNo;
    }

    public void setFicheNo(String ficheNo) {
        this.ficheNo = ficheNo;
    }

    public String getCustTitle() {
        return custTitle;
    }

    public void setCustTitle(String custTitle) {
        this.custTitle = custTitle;
    }

    public String getLineExp() {
        return lineExp;
    }

    public void setLineExp(String lineExp) {
        this.lineExp = lineExp;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
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

    public Short getTrCurr() {
        return trCurr;
    }

    public void setTrCurr(Short trCurr) {
        this.trCurr = trCurr;
    }

    public Short getSign() {
        return sign;
    }

    public void setSign(Short sign) {
        this.sign = sign;
    }

    public Short getAccounted() {
        return accounted;
    }

    public void setAccounted(Short accounted) {
        this.accounted = accounted;
    }

    public Short getCancelled() {
        return cancelled;
    }

    public void setCancelled(Short cancelled) {
        this.cancelled = cancelled;
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

    public Short getCancelledAcc() {
        return cancelledAcc;
    }

    public void setCancelledAcc(Short cancelledAcc) {
        this.cancelledAcc = cancelledAcc;
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

    public int getOrgLogicRef() {
        return orgLogicRef;
    }

    public void setOrgLogicRef(int orgLogicRef) {
        this.orgLogicRef = orgLogicRef;
    }

    public int getWfStatus() {
        return wfStatus;
    }

    public void setWfStatus(int wfStatus) {
        this.wfStatus = wfStatus;
    }

    public Short getGpopType() {
        return gpopType;
    }

    public void setGpopType(Short gpopType) {
        this.gpopType = gpopType;
    }

    public float getGpincometacrat() {
        return gpincometacrat;
    }

    public void setGpincometacrat(float gpincometacrat) {
        this.gpincometacrat = gpincometacrat;
    }

    public float getGpFundShareRat() {
        return gpFundShareRat;
    }

    public void setGpFundShareRat(float gpFundShareRat) {
        this.gpFundShareRat = gpFundShareRat;
    }

    public String getGpPlate() {
        return gpPlate;
    }

    public void setGpPlate(String gpPlate) {
        this.gpPlate = gpPlate;
    }

    public int getGpTaxAcc() {
        return gpTaxAcc;
    }

    public void setGpTaxAcc(int gpTaxAcc) {
        this.gpTaxAcc = gpTaxAcc;
    }

    public int getGpFundAcc() {
        return gpFundAcc;
    }

    public void setGpFundAcc(int gpFundAcc) {
        this.gpFundAcc = gpFundAcc;
    }

    public String getGpAddr() {
        return gpAddr;
    }

    public void setGpAddr(String gpAddr) {
        this.gpAddr = gpAddr;
    }

    public float getSmmVatRate() {
        return smmVatRate;
    }

    public void setSmmVatRate(float smmVatRate) {
        this.smmVatRate = smmVatRate;
    }

    public int getSmmVatAcRef() {
        return smmVatAcRef;
    }

    public void setSmmVatAcRef(int smmVatAcRef) {
        this.smmVatAcRef = smmVatAcRef;
    }

    public int getSmmVatCenterRef() {
        return smmVatCenterRef;
    }

    public void setSmmVatCenterRef(int smmVatCenterRef) {
        this.smmVatCenterRef = smmVatCenterRef;
    }

    public String getSmmDoCode() {
        return smmDoCode;
    }

    public void setSmmDoCode(String smmDoCode) {
        this.smmDoCode = smmDoCode;
    }

    public float getInfidx() {
        return infidx;
    }

    public void setInfidx(float infidx) {
        this.infidx = infidx;
    }

    public String getTranGrpNo() {
        return tranGrpNo;
    }

    public void setTranGrpNo(String tranGrpNo) {
        this.tranGrpNo = tranGrpNo;
    }

    public Short getTranGrpLineNo() {
        return tranGrpLineNo;
    }

    public void setTranGrpLineNo(Short tranGrpLineNo) {
        this.tranGrpLineNo = tranGrpLineNo;
    }

    public String getOrgLogoId() {
        return orgLogoId;
    }

    public void setOrgLogoId(String orgLogoId) {
        this.orgLogoId = orgLogoId;
    }

    public Short getVatInc() {
        return vatInc;
    }

    public void setVatInc(Short vatInc) {
        this.vatInc = vatInc;
    }

    public float getVatRate() {
        return vatRate;
    }

    public void setVatRate(float vatRate) {
        this.vatRate = vatRate;
    }

    public int getVatAccRef() {
        return vatAccRef;
    }

    public void setVatAccRef(int vatAccRef) {
        this.vatAccRef = vatAccRef;
    }

    public float getVatTot() {
        return vatTot;
    }

    public void setVatTot(float vatTot) {
        this.vatTot = vatTot;
    }

    public int getProjectRef() {
        return projectRef;
    }

    public void setProjectRef(int projectRef) {
        this.projectRef = projectRef;
    }

    public int getCsTransRef() {
        return csTransRef;
    }

    public void setCsTransRef(int csTransRef) {
        this.csTransRef = csTransRef;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public int getwFlowCrdRef() {
        return wFlowCrdRef;
    }

    public void setwFlowCrdRef(int wFlowCrdRef) {
        this.wFlowCrdRef = wFlowCrdRef;
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

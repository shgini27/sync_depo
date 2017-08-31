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
public class BnFiche implements java.io.Serializable{
    private int logicalRef;
    private String date;
    private String ficheNo;
    private String specode;
    private String cyphCode;
    private Short branch;
    private Short department;
    private Short trCode;
    private Short moduleNr;
    private int sourceRef;
    private Short accounted;
    private Short cancelled;
    private Short sign;
    private float debitTot;
    private float creditTot;
    private String genexp1;
    private String genexp2;
    private String genexp3;
    private String genexp4;
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
    private int accFicheRef;
    private Short genexcTyp;
    private Short lineExcTyp;
    private Short siteId;
    private Short recStatus;
    private int orgLogicRef;
    private float repDebit;
    private float repCredit;
    private Short textInc;
    private int wfStatus;
    private Short crCardWzd;
    private int bnAccountRef;
    private String tranGrpNo;
    private int projectRef;
    private int collatRollRef;
    private int collatTrnRef;
    private int bnCrRef;

    public BnFiche(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public BnFiche(int logicalRef, String date, String ficheNo, String specode, 
            String cyphCode, Short branch, Short department, Short trCode, Short moduleNr, 
            int sourceRef, Short accounted, Short cancelled, Short sign, float debitTot, 
            float creditTot, String genexp1, String genexp2, String genexp3, String genexp4, 
            Short printCnt, Short capiblockCreatedby, String capiblockCreadeddate, 
            Short capiblockCreatedhour, Short capiblockCreatedmin, Short capiblockCreatedsec, 
            Short capiblockModifiedby, String capiblockModifieddate, Short capiblockModifiedhour, 
            Short capiblockModifiedmin, Short capiblockModifiedsec, Short cancelledAcc, int accFicheRef, 
            Short genexcTyp, Short lineExcTyp, Short siteId, Short recStatus, int orgLogicRef, 
            float repDebit, float repCredit, Short textInc, int wfStatus, Short crCardWzd, 
            int bnAccountRef, String tranGrpNo, int projectRef, int collatRollRef, int collatTrnRef, 
            int bnCrRef) {
        this.logicalRef = logicalRef;
        this.date = checkDate(date);
        this.ficheNo = ficheNo;
        this.specode = specode;
        this.cyphCode = cyphCode;
        this.branch = branch;
        this.department = department;
        this.trCode = trCode;
        this.moduleNr = moduleNr;
        this.sourceRef = sourceRef;
        this.accounted = accounted;
        this.cancelled = cancelled;
        this.sign = sign;
        this.debitTot = debitTot;
        this.creditTot = creditTot;
        this.genexp1 = genexp1;
        this.genexp2 = genexp2;
        this.genexp3 = genexp3;
        this.genexp4 = genexp4;
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
        this.accFicheRef = accFicheRef;
        this.genexcTyp = genexcTyp;
        this.lineExcTyp = lineExcTyp;
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogicRef = orgLogicRef;
        this.repDebit = repDebit;
        this.repCredit = repCredit;
        this.textInc = textInc;
        this.wfStatus = wfStatus;
        this.crCardWzd = crCardWzd;
        this.bnAccountRef = bnAccountRef;
        this.tranGrpNo = tranGrpNo;
        this.projectRef = projectRef;
        this.collatRollRef = collatRollRef;
        this.collatTrnRef = collatTrnRef;
        this.bnCrRef = bnCrRef;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = checkDate(date);
    }

    public String getFicheNo() {
        return ficheNo;
    }

    public void setFicheNo(String ficheNo) {
        this.ficheNo = ficheNo;
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

    public Short getTrCode() {
        return trCode;
    }

    public void setTrCode(Short trCode) {
        this.trCode = trCode;
    }

    public Short getModuleNr() {
        return moduleNr;
    }

    public void setModuleNr(Short moduleNr) {
        this.moduleNr = moduleNr;
    }

    public int getSourceRef() {
        return sourceRef;
    }

    public void setSourceRef(int sourceRef) {
        this.sourceRef = sourceRef;
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

    public Short getSign() {
        return sign;
    }

    public void setSign(Short sign) {
        this.sign = sign;
    }

    public float getDebitTot() {
        return debitTot;
    }

    public void setDebitTot(float debitTot) {
        this.debitTot = debitTot;
    }

    public float getCreditTot() {
        return creditTot;
    }

    public void setCreditTot(float creditTot) {
        this.creditTot = creditTot;
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

    public int getAccFicheRef() {
        return accFicheRef;
    }

    public void setAccFicheRef(int accFicheRef) {
        this.accFicheRef = accFicheRef;
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

    public float getRepDebit() {
        return repDebit;
    }

    public void setRepDebit(float repDebit) {
        this.repDebit = repDebit;
    }

    public float getRepCredit() {
        return repCredit;
    }

    public void setRepCredit(float repCredit) {
        this.repCredit = repCredit;
    }

    public Short getTextInc() {
        return textInc;
    }

    public void setTextInc(Short textInc) {
        this.textInc = textInc;
    }

    public int getWfStatus() {
        return wfStatus;
    }

    public void setWfStatus(int wfStatus) {
        this.wfStatus = wfStatus;
    }

    public Short getCrCardWzd() {
        return crCardWzd;
    }

    public void setCrCardWzd(Short crCardWzd) {
        this.crCardWzd = crCardWzd;
    }

    public int getBnAccountRef() {
        return bnAccountRef;
    }

    public void setBnAccountRef(int bnAccountRef) {
        this.bnAccountRef = bnAccountRef;
    }

    public String getTranGrpNo() {
        return tranGrpNo;
    }

    public void setTranGrpNo(String tranGrpNo) {
        this.tranGrpNo = tranGrpNo;
    }

    public int getProjectRef() {
        return projectRef;
    }

    public void setProjectRef(int projectRef) {
        this.projectRef = projectRef;
    }

    public int getCollatRollRef() {
        return collatRollRef;
    }

    public void setCollatRollRef(int collatRollRef) {
        this.collatRollRef = collatRollRef;
    }

    public int getCollatTrnRef() {
        return collatTrnRef;
    }

    public void setCollatTrnRef(int collatTrnRef) {
        this.collatTrnRef = collatTrnRef;
    }

    public int getBnCrRef() {
        return bnCrRef;
    }

    public void setBnCrRef(int bnCrRef) {
        this.bnCrRef = bnCrRef;
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

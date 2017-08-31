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
public class ClFiche implements java.io.Serializable{
    private int logicalRef;
    private String ficheNo;
    private String date;
    private String doCode;
    private String trCode;
    private String specode;
    private String cyphCode;
    private Short branch;
    private Short department;
    private String genexp1;
    private String genexp2;
    private String genexp3;
    private String genexp4;
    private float debit;
    private float credit;
    private float repDebit;
    private float repCredit;
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
    private Short accounted;
    private int invoRef;
    private int cashAccRef;
    private int cashCentRef;
    private Short printCnt;
    private Short cancelled;
    private Short cancelledAcc;
    private int accFicheRef;
    private Short genexcTyp;
    private Short lineExcTyp;
    private Short textInc;
    private Short siteId;
    private Short recStatus;
    private int orgLogicRef;
    private int wfStatus;
    private int time;
    private int clCardRef;
    private int bankAccRef;
    private int bnAccRef;
    private int bnCenterRef;
    private String tradingGrp;
    private int poscommAccRef;
    private int poscommCenRef;
    private int pointCommAccRef;
    private int pointCommCenRef;
    private int projectRef;
    private Short status;
    private int wFlowCrdRef;
    private String orgLogoId;
    private Short affectCollatRl;
    private Short grpFirmTrans;
    private Short affectRisk;
    private int posterminalNr;
    private String posterminalNum;

    public ClFiche(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public ClFiche(int logicalRef, String ficheNo, String date, String doCode, 
            String trCode, String specode, String cyphCode, Short branch, Short department, 
            String genexp1, String genexp2, String genexp3, String genexp4, float debit, 
            float credit, float repDebit, float repCredit, Short capiblockCreatedby, 
            String capiblockCreadeddate, Short capiblockCreatedhour, Short capiblockCreatedmin, 
            Short capiblockCreatedsec, Short capiblockModifiedby, String capiblockModifieddate, 
            Short capiblockModifiedhour, Short capiblockModifiedmin, Short capiblockModifiedsec, 
            Short accounted, int invoRef, int cashAccRef, int cashCentRef, Short printCnt, 
            Short cancelled, Short cancelledAcc, int accFicheRef, Short genexcTyp, Short lineExcTyp, 
            Short textInc, Short siteId, Short recStatus, int orgLogicRef, int wfStatus, int time, 
            int clCardRef, int bankAccRef, int bnAccRef, int bnCenterRef, String tradingGrp, 
            int poscommAccRef, int poscommCenRef, int pointCommAccRef, int pointCommCenRef, 
            int projectRef, Short status, int wFlowCrdRef, String orgLogoId, Short affectCollatRl, 
            Short grpFirmTrans, Short affectRisk, int posterminalNr, String posterminalNum) {
        this.logicalRef = logicalRef;
        this.ficheNo = ficheNo;
        this.date = date;
        this.doCode = doCode;
        this.trCode = trCode;
        this.specode = specode;
        this.cyphCode = cyphCode;
        this.branch = branch;
        this.department = department;
        this.genexp1 = genexp1;
        this.genexp2 = genexp2;
        this.genexp3 = genexp3;
        this.genexp4 = genexp4;
        this.debit = debit;
        this.credit = credit;
        this.repDebit = repDebit;
        this.repCredit = repCredit;
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
        this.accounted = accounted;
        this.invoRef = invoRef;
        this.cashAccRef = cashAccRef;
        this.cashCentRef = cashCentRef;
        this.printCnt = printCnt;
        this.cancelled = cancelled;
        this.cancelledAcc = cancelledAcc;
        this.accFicheRef = accFicheRef;
        this.genexcTyp = genexcTyp;
        this.lineExcTyp = lineExcTyp;
        this.textInc = textInc;
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogicRef = orgLogicRef;
        this.wfStatus = wfStatus;
        this.time = time;
        this.clCardRef = clCardRef;
        this.bankAccRef = bankAccRef;
        this.bnAccRef = bnAccRef;
        this.bnCenterRef = bnCenterRef;
        this.tradingGrp = tradingGrp;
        this.poscommAccRef = poscommAccRef;
        this.poscommCenRef = poscommCenRef;
        this.pointCommAccRef = pointCommAccRef;
        this.pointCommCenRef = pointCommCenRef;
        this.projectRef = projectRef;
        this.status = status;
        this.wFlowCrdRef = wFlowCrdRef;
        this.orgLogoId = orgLogoId;
        this.affectCollatRl = affectCollatRl;
        this.grpFirmTrans = grpFirmTrans;
        this.affectRisk = affectRisk;
        this.posterminalNr = posterminalNr;
        this.posterminalNum = posterminalNum;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        
        this.logicalRef = logicalRef;
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

    public String getDoCode() {
        return doCode;
    }

    public void setDoCode(String doCode) {
        this.doCode = doCode;
    }

    public String getTrCode() {
        return trCode;
    }

    public void setTrCode(String trCode) {
        this.trCode = trCode;
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

    public float getDebit() {
        return debit;
    }

    public void setDebit(float debit) {
        this.debit = debit;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
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

    public Short getAccounted() {
        return accounted;
    }

    public void setAccounted(Short accounted) {
        this.accounted = accounted;
    }

    public int getInvoRef() {
        return invoRef;
    }

    public void setInvoRef(int invoRef) {
        this.invoRef = invoRef;
    }

    public int getCashAccRef() {
        return cashAccRef;
    }

    public void setCashAccRef(int cashAccRef) {
        this.cashAccRef = cashAccRef;
    }

    public int getCashCentRef() {
        return cashCentRef;
    }

    public void setCashCentRef(int cashCentRef) {
        this.cashCentRef = cashCentRef;
    }

    public Short getPrintCnt() {
        return printCnt;
    }

    public void setPrintCnt(Short printCnt) {
        this.printCnt = printCnt;
    }

    public Short getCancelled() {
        return cancelled;
    }

    public void setCancelled(Short cancelled) {
        this.cancelled = cancelled;
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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getClCardRef() {
        return clCardRef;
    }

    public void setClCardRef(int clCardRef) {
        this.clCardRef = clCardRef;
    }

    public int getBankAccRef() {
        return bankAccRef;
    }

    public void setBankAccRef(int bankAccRef) {
        this.bankAccRef = bankAccRef;
    }

    public int getBnAccRef() {
        return bnAccRef;
    }

    public void setBnAccRef(int bnAccRef) {
        this.bnAccRef = bnAccRef;
    }

    public int getBnCenterRef() {
        return bnCenterRef;
    }

    public void setBnCenterRef(int bnCenterRef) {
        this.bnCenterRef = bnCenterRef;
    }

    public String getTradingGrp() {
        return tradingGrp;
    }

    public void setTradingGrp(String tradingGrp) {
        this.tradingGrp = tradingGrp;
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

    public int getProjectRef() {
        return projectRef;
    }

    public void setProjectRef(int projectRef) {
        this.projectRef = projectRef;
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

    public String getOrgLogoId() {
        return orgLogoId;
    }

    public void setOrgLogoId(String orgLogoId) {
        this.orgLogoId = orgLogoId;
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
    
    

    public Short getAffectRisk() {
        return affectRisk;
    }

    public void setAffectRisk(Short affectRisk) {
        this.affectRisk = affectRisk;
    }

    public int getPosterminalNr() {
        return posterminalNr;
    }

    public void setPosterminalNr(int posterminalNr) {
        this.posterminalNr = posterminalNr;
    }

    public String getPosterminalNum() {
        return posterminalNum;
    }

    public void setPosterminalNum(String posterminalNum) {
        this.posterminalNum = posterminalNum;
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

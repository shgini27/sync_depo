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
public class BankAcc implements java.io.Serializable{
    private int logicalRef;
    private Short cardType;
    private String code;
    private String definition;
    private String specode;
    private String cyphCode;
    private int bankRef;
    private float checkMargin;
    private float noteMargin;
    private float checkLimit;
    private float noteLimit;
    private float custInterest;
    private float skInterest;
    private float ckInterest;
    private float stopajper;
    private float fonper;
    private Short currency;
    private int extenRef;
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
    private Short active;
    private String accountNo;
    private Short textInc;
    private Short siteId;
    private Short recStatus;
    private int orgLogicRef;
    private int wfStatus;
    private Short kkUsage;
    private float collatRlLimit;
    private Short curRateType;
    private float wthcltrlInterest;
    private float wthcltrlLimit;

    public BankAcc(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public BankAcc(int logicalRef, String specode) {
        this.logicalRef = logicalRef;
        this.specode = specode;
    }
    
    public BankAcc(int logicalRef, Short cardType, String code, String definition, 
            String specode, String cyphCode, int bankRef, float checkMargin, float noteMargin, 
            float checkLimit, float noteLimit, float custInterest, float skInterest, 
            float ckInterest, float stopajper, float fonper, Short currency, int extenRef, 
            Short capiblockCreatedby, String capiblockCreadeddate, Short capiblockCreatedhour, 
            Short capiblockCreatedmin, Short capiblockCreatedsec, Short capiblockModifiedby, 
            String capiblockModifieddate, Short capiblockModifiedhour, Short capiblockModifiedmin, 
            Short capiblockModifiedsec, Short active, String accountNo, Short textInc, Short siteId, 
            Short recStatus, int orgLogicRef, int wfStatus, Short kkUsage, float collatRlLimit, 
            Short curRateType, float wthcltrlInterest, float wthcltrlLimit) {
        this.logicalRef = logicalRef;
        this.cardType = cardType;
        this.code = code;
        this.definition = definition;
        this.specode = specode;
        this.cyphCode = cyphCode;
        this.bankRef = bankRef;
        this.checkMargin = checkMargin;
        this.noteMargin = noteMargin;
        this.checkLimit = checkLimit;
        this.noteLimit = noteLimit;
        this.custInterest = custInterest;
        this.skInterest = skInterest;
        this.ckInterest = ckInterest;
        this.stopajper = stopajper;
        this.fonper = fonper;
        this.currency = currency;
        this.extenRef = extenRef;
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
        this.active = active;
        this.accountNo = accountNo;
        this.textInc = textInc;
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogicRef = orgLogicRef;
        this.wfStatus = wfStatus;
        this.kkUsage = kkUsage;
        this.collatRlLimit = collatRlLimit;
        this.curRateType = curRateType;
        this.wthcltrlInterest = wthcltrlInterest;
        this.wthcltrlLimit = wthcltrlLimit;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public Short getCardType() {
        return cardType;
    }

    public void setCardType(Short cardType) {
        this.cardType = cardType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
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

    public int getBankRef() {
        return bankRef;
    }

    public void setBankRef(int bankRef) {
        this.bankRef = bankRef;
    }

    public float getCheckMargin() {
        return checkMargin;
    }

    public void setCheckMargin(float checkMargin) {
        this.checkMargin = checkMargin;
    }

    public float getNoteMargin() {
        return noteMargin;
    }

    public void setNoteMargin(float noteMargin) {
        this.noteMargin = noteMargin;
    }

    public float getCheckLimit() {
        return checkLimit;
    }

    public void setCheckLimit(float checkLimit) {
        this.checkLimit = checkLimit;
    }

    public float getNoteLimit() {
        return noteLimit;
    }

    public void setNoteLimit(float noteLimit) {
        this.noteLimit = noteLimit;
    }

    public float getCustInterest() {
        return custInterest;
    }

    public void setCustInterest(float custInterest) {
        this.custInterest = custInterest;
    }

    public float getSkInterest() {
        return skInterest;
    }

    public void setSkInterest(float skInterest) {
        this.skInterest = skInterest;
    }

    public float getCkInterest() {
        return ckInterest;
    }

    public void setCkInterest(float ckInterest) {
        this.ckInterest = ckInterest;
    }

    public float getStopajper() {
        return stopajper;
    }

    public void setStopajper(float stopajper) {
        this.stopajper = stopajper;
    }

    public float getFonper() {
        return fonper;
    }

    public void setFonper(float fonper) {
        this.fonper = fonper;
    }

    public Short getCurrency() {
        return currency;
    }

    public void setCurrency(Short currency) {
        this.currency = currency;
    }

    public int getExtenRef() {
        return extenRef;
    }

    public void setExtenRef(int extenRef) {
        this.extenRef = extenRef;
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

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
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

    public Short getKkUsage() {
        return kkUsage;
    }

    public void setKkUsage(Short kkUsage) {
        this.kkUsage = kkUsage;
    }

    public float getCollatRlLimit() {
        return collatRlLimit;
    }

    public void setCollatRlLimit(float collatRlLimit) {
        this.collatRlLimit = collatRlLimit;
    }

    public Short getCurRateType() {
        return curRateType;
    }

    public void setCurRateType(Short curRateType) {
        this.curRateType = curRateType;
    }

    public float getWthcltrlInterest() {
        return wthcltrlInterest;
    }

    public void setWthcltrlInterest(float wthcltrlInterest) {
        this.wthcltrlInterest = wthcltrlInterest;
    }

    public float getWthcltrlLimit() {
        return wthcltrlLimit;
    }

    public void setWthcltrlLimit(float wthcltrlLimit) {
        this.wthcltrlLimit = wthcltrlLimit;
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

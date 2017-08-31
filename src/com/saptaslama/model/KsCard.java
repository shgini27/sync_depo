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
public class KsCard implements java.io.Serializable{
    private int logicalRef;
    private String code;
    private String name;
    private String specode;
    private String cyphCode;
    private String explain;
    private String addr1;
    private String addr2;
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
    private Short siteId;
    private Short recStatus;
    private int orgLogicRef;
    private int wfStatus;
    private Short cCurrancy;
    private Short curRateType;
    private Short fixedCurrType;

    public KsCard(int logicalRef) {
        this.logicalRef = logicalRef;
    }
    
    public KsCard(int logicalRef, String specode) {
        this.logicalRef = logicalRef;
        this.specode = specode;
    }

    public KsCard(int logicalRef, String code, String name, String specode, 
            String cyphCode, String explain, String addr1, String addr2, Short capiblockCreatedby, 
            String capiblockCreadeddate, Short capiblockCreatedhour, Short capiblockCreatedmin, 
            Short capiblockCreatedsec, Short capiblockModifiedby, String capiblockModifieddate, 
            Short capiblockModifiedhour, Short capiblockModifiedmin, Short capiblockModifiedsec, 
            Short active, Short siteId, Short recStatus, int orgLogicRef, int wfStatus, 
            Short cCurrancy, Short curRateType, Short fixedCurrType) {
        this.logicalRef = logicalRef;
        this.code = code;
        this.name = name;
        this.specode = specode;
        this.cyphCode = cyphCode;
        this.explain = explain;
        this.addr1 = addr1;
        this.addr2 = addr2;
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
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogicRef = orgLogicRef;
        this.wfStatus = wfStatus;
        this.cCurrancy = cCurrancy;
        this.curRateType = curRateType;
        this.fixedCurrType = fixedCurrType;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
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
        this.capiblockModifieddate = capiblockModifieddate;
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

    public Short getcCurrancy() {
        return cCurrancy;
    }

    public void setcCurrancy(Short cCurrancy) {
        this.cCurrancy = cCurrancy;
    }

    public Short getCurRateType() {
        return curRateType;
    }

    public void setCurRateType(Short curRateType) {
        this.curRateType = curRateType;
    }

    public Short getFixedCurrType() {
        return fixedCurrType;
    }

    public void setFixedCurrType(Short fixedCurrType) {
        this.fixedCurrType = fixedCurrType;
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

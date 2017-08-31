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
public class SrvCard implements java.io.Serializable{
    private int logicalRef;
    private Short active;
    private Short cardType;
    private String code;
    private String definition;
    private String specode;
    private String cyphCode;
    private float vat;
    private int extenRef;
    private int paymentRef;
    private int unitSetRef;
    private Short capiblockCreatedBy;
    private String capiblockCreatedDate;
    private Short capiblockCreatedHour;
    private Short capiblockCreatedMin;
    private Short capiblockCreatedSec;
    private Short capiblockModifiedBy;
    private String capiblockModifiedDate;
    private Short capiblockModifiedHour;
    private Short capiblockModifiedMin;
    private Short capiblockModifiedSec;
    private Short siteId;
    private Short recStatus;
    private int orgLogicRef;
    private int wfStatus;
    private float returnVat;
    private Short importExpns;
    private Short affectCost;
    private int addTaxRef;
    private Short distType;

    public SrvCard(int logicalRef) {
        this.logicalRef = logicalRef;
    }
    
    public SrvCard(int logicalRef, String specode) {
        this.logicalRef = logicalRef;
        this.specode = specode;
    }

    public SrvCard(int logicalRef, Short active, Short cardType, String code, 
            String definition, String specode, String cyphCode, float vat, int extenRef, 
            int paymentRef, int unitSetRef, Short capiblockCreatedBy, String capiblockCreatedDate, 
            Short capiblockCreatedHour, Short capiblockCreatedMin, Short capiblockCreatedSec, 
            Short capiblockModifiedBy, String capiblockModifiedDate, Short capiblockModifiedHour, 
            Short capiblockModifiedMin, Short capiblockModifiedSec, Short siteId, Short recStatus, 
            int orgLogicRef, int wfStatus, float returnVat, Short importExpns, Short affectCost, 
            int addTaxRef, Short distType) {
        this.logicalRef = logicalRef;
        this.active = active;
        this.cardType = cardType;
        this.code = code;
        this.definition = definition;
        this.specode = specode;
        this.cyphCode = cyphCode;
        this.vat = vat;
        this.extenRef = extenRef;
        this.paymentRef = paymentRef;
        this.unitSetRef = unitSetRef;
        this.capiblockCreatedBy = capiblockCreatedBy;
        this.capiblockCreatedDate = capiblockCreatedDate;
        this.capiblockCreatedHour = capiblockCreatedHour;
        this.capiblockCreatedMin = capiblockCreatedMin;
        this.capiblockCreatedSec = capiblockCreatedSec;
        this.capiblockModifiedBy = capiblockModifiedBy;
        this.capiblockModifiedDate = checkDate(capiblockModifiedDate);
        this.capiblockModifiedHour = capiblockModifiedHour;
        this.capiblockModifiedMin = capiblockModifiedMin;
        this.capiblockModifiedSec = capiblockModifiedSec;
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogicRef = orgLogicRef;
        this.wfStatus = wfStatus;
        this.returnVat = returnVat;
        this.importExpns = importExpns;
        this.affectCost = affectCost;
        this.addTaxRef = addTaxRef;
        this.distType = distType;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
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

    public float getVat() {
        return vat;
    }

    public void setVat(float vat) {
        this.vat = vat;
    }

    public int getExtenRef() {
        return extenRef;
    }

    public void setExtenRef(int extenRef) {
        this.extenRef = extenRef;
    }

    public int getPaymentRef() {
        return paymentRef;
    }

    public void setPaymentRef(int paymentRef) {
        this.paymentRef = paymentRef;
    }

    public int getUnitSetRef() {
        return unitSetRef;
    }

    public void setUnitSetRef(int unitSetRef) {
        this.unitSetRef = unitSetRef;
    }

    public Short getCapiblockCreatedBy() {
        return capiblockCreatedBy;
    }

    public void setCapiblockCreatedBy(Short capiblockCreatedBy) {
        this.capiblockCreatedBy = capiblockCreatedBy;
    }

    public String getCapiblockCreatedDate() {
        return capiblockCreatedDate;
    }

    public void setCapiblockCreatedDate(String capiblockCreatedDate) {
        this.capiblockCreatedDate = capiblockCreatedDate;
    }

    public Short getCapiblockCreatedHour() {
        return capiblockCreatedHour;
    }

    public void setCapiblockCreatedHour(Short capiblockCreatedHour) {
        this.capiblockCreatedHour = capiblockCreatedHour;
    }

    public Short getCapiblockCreatedMin() {
        return capiblockCreatedMin;
    }

    public void setCapiblockCreatedMin(Short capiblockCreatedMin) {
        this.capiblockCreatedMin = capiblockCreatedMin;
    }

    public Short getCapiblockCreatedSec() {
        return capiblockCreatedSec;
    }

    public void setCapiblockCreatedSec(Short capiblockCreatedSec) {
        this.capiblockCreatedSec = capiblockCreatedSec;
    }

    public Short getCapiblockModifiedBy() {
        return capiblockModifiedBy;
    }

    public void setCapiblockModifiedBy(Short capiblockModifiedBy) {
        this.capiblockModifiedBy = capiblockModifiedBy;
    }

    public String getCapiblockModifiedDate() {
        return capiblockModifiedDate;
    }

    public void setCapiblockModifiedDate(String capiblockModifiedDate) {
        this.capiblockModifiedDate = checkDate(capiblockModifiedDate);
    }

    public Short getCapiblockModifiedHour() {
        return capiblockModifiedHour;
    }

    public void setCapiblockModifiedHour(Short capiblockModifiedHour) {
        this.capiblockModifiedHour = capiblockModifiedHour;
    }

    public Short getCapiblockModifiedMin() {
        return capiblockModifiedMin;
    }

    public void setCapiblockModifiedMin(Short capiblockModifiedMin) {
        this.capiblockModifiedMin = capiblockModifiedMin;
    }

    public Short getCapiblockModifiedSec() {
        return capiblockModifiedSec;
    }

    public void setCapiblockModifiedSec(Short capiblockModifiedSec) {
        this.capiblockModifiedSec = capiblockModifiedSec;
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

    public float getReturnVat() {
        return returnVat;
    }

    public void setReturnVat(float returnVat) {
        this.returnVat = returnVat;
    }

    public Short getImportExpns() {
        return importExpns;
    }

    public void setImportExpns(Short importExpns) {
        this.importExpns = importExpns;
    }

    public Short getAffectCost() {
        return affectCost;
    }

    public void setAffectCost(Short affectCost) {
        this.affectCost = affectCost;
    }

    public int getAddTaxRef() {
        return addTaxRef;
    }

    public void setAddTaxRef(int addTaxRef) {
        this.addTaxRef = addTaxRef;
    }

    public Short getDistType() {
        return distType;
    }

    public void setDistType(Short distType) {
        this.distType = distType;
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

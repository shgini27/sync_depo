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
public class UnitBarcode implements java.io.Serializable{
    private int logicalRef;
    private int itmUnitARef;
    private int itemRef;
    private int variantRef;
    private int unitLineRef;
    private Short lineNr;
    private String barcode;
    private int siteId;
    private Short recStatus;
    private int orgLogicRef;

    
    public UnitBarcode(int logicalRef){
        this.logicalRef = logicalRef;
    }
    
    public UnitBarcode(int logicalRef, int itmUnitARef, int itemRef, int variantRef, 
            int unitLineRef, Short lineNr, String barcode, int siteId, Short recStatus, 
            int orgLogicRef) {
        this.logicalRef = logicalRef;
        this.itmUnitARef = itmUnitARef;
        this.itemRef = itemRef;
        this.variantRef = variantRef;
        this.unitLineRef = unitLineRef;
        this.lineNr = lineNr;
        this.barcode = barcode;
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogicRef = orgLogicRef;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public int getItmUnitARef() {
        return itmUnitARef;
    }

    public void setItmUnitARef(int itmUnitARef) {
        this.itmUnitARef = itmUnitARef;
    }

    public int getItemRef() {
        return itemRef;
    }

    public void setItemRef(int itemRef) {
        this.itemRef = itemRef;
    }

    public int getVariantRef() {
        return variantRef;
    }

    public void setVariantRef(int variantRef) {
        this.variantRef = variantRef;
    }

    public int getUnitLineRef() {
        return unitLineRef;
    }

    public void setUnitLineRef(int unitLineRef) {
        this.unitLineRef = unitLineRef;
    }

    public Short getLineNr() {
        return lineNr;
    }

    public void setLineNr(Short lineNr) {
        this.lineNr = lineNr;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
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
    
    
}

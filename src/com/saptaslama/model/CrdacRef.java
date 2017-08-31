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
public class CrdacRef implements java.io.Serializable{
    private int logicalRef;
    private Short trCode;
    private int cardRef;
    private Short typ;
    private int accountRef;
    private int centerRef;
    private Short siteId;
    private Short recStatus;
    private int orgLogicRef;
    private int projectRef;

    public CrdacRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public CrdacRef(int logicalRef, Short trCode, int cardRef, Short typ, int accountRef, 
            int centerRef, Short siteId, Short recStatus, int orgLogicRef, int projectRef) {
        this.logicalRef = logicalRef;
        this.trCode = trCode;
        this.cardRef = cardRef;
        this.typ = typ;
        this.accountRef = accountRef;
        this.centerRef = centerRef;
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogicRef = orgLogicRef;
        this.projectRef = projectRef;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public Short getTrCode() {
        return trCode;
    }

    public void setTrCode(Short trCode) {
        this.trCode = trCode;
    }

    public int getCardRef() {
        return cardRef;
    }

    public void setCardRef(int cardRef) {
        this.cardRef = cardRef;
    }

    public Short getTyp() {
        return typ;
    }

    public void setTyp(Short typ) {
        this.typ = typ;
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

    public int getProjectRef() {
        return projectRef;
    }

    public void setProjectRef(int projectRef) {
        this.projectRef = projectRef;
    }
    
}

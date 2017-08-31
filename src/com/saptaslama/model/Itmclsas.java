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
public class Itmclsas implements java.io.Serializable{
    private int logicalRef;
    private int parentRef;
    private int childRef;
    private Short upLevel;
    private Short siteId;
    private Short recStatus;
    private int orgLogicRef;
    
    public Itmclsas(int logicalRef){
        this.logicalRef = logicalRef;
    }
    
    public Itmclsas(int logicalRef, int parentRef, int childRef, Short upLevel, 
            Short siteId, Short recStatus, int orgLogicRef) {
        this.logicalRef = logicalRef;
        this.parentRef = parentRef;
        this.childRef = childRef;
        this.upLevel = upLevel;
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

    public int getParentRef() {
        return parentRef;
    }

    public void setParentRef(int parentRef) {
        this.parentRef = parentRef;
    }

    public int getChildRef() {
        return childRef;
    }

    public void setChildRef(int childRef) {
        this.childRef = childRef;
    }

    public Short getUpLevel() {
        return upLevel;
    }

    public void setUpLevel(Short upLevel) {
        this.upLevel = upLevel;
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

}

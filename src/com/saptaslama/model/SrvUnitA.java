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
public class SrvUnitA implements java.io.Serializable{
    private int logicalRef;
    private int srvRef;
    private Short lineNr;
    private int unitLineRef;
    private Short priority;

    public SrvUnitA(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public SrvUnitA(int logicalRef, int srvRef, Short lineNr, int unitLineRef, 
            Short priority) {
        this.logicalRef = logicalRef;
        this.srvRef = srvRef;
        this.lineNr = lineNr;
        this.unitLineRef = unitLineRef;
        this.priority = priority;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public int getSrvRef() {
        return srvRef;
    }

    public void setSrvRef(int srvRef) {
        this.srvRef = srvRef;
    }

    public Short getLineNr() {
        return lineNr;
    }

    public void setLineNr(Short lineNr) {
        this.lineNr = lineNr;
    }

    public int getUnitLineRef() {
        return unitLineRef;
    }

    public void setUnitLineRef(int unitLineRef) {
        this.unitLineRef = unitLineRef;
    }

    public Short getPriority() {
        return priority;
    }

    public void setPriority(Short priority) {
        this.priority = priority;
    }
    
    
}

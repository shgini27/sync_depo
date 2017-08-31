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
public class SrvTot implements java.io.Serializable{
    private int logicalRef;
    private int cardRef;
    private Short invenno;
    private Short month;
    private float totalsAmount;
    private float totalsCashAmnt;
    private float totalsCurrAmnt;
    private Short year;

    public SrvTot(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public SrvTot(int logicalRef, int cardRef, Short invenno, Short month, 
            float totalsAmount, float totalsCashAmnt, float totalsCurrAmnt, Short year) {
        this.logicalRef = logicalRef;
        this.cardRef = cardRef;
        this.invenno = invenno;
        this.month = month;
        this.totalsAmount = totalsAmount;
        this.totalsCashAmnt = totalsCashAmnt;
        this.totalsCurrAmnt = totalsCurrAmnt;
        this.year = year;
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

    public Short getInvenno() {
        return invenno;
    }

    public void setInvenno(Short invenno) {
        this.invenno = invenno;
    }

    public Short getMonth() {
        return month;
    }

    public void setMonth(Short month) {
        this.month = month;
    }

    public float getTotalsAmount() {
        return totalsAmount;
    }

    public void setTotalsAmount(float totalsAmount) {
        this.totalsAmount = totalsAmount;
    }

    public float getTotalsCashAmnt() {
        return totalsCashAmnt;
    }

    public void setTotalsCashAmnt(float totalsCashAmnt) {
        this.totalsCashAmnt = totalsCashAmnt;
    }

    public float getTotalsCurrAmnt() {
        return totalsCurrAmnt;
    }

    public void setTotalsCurrAmnt(float totalsCurrAmnt) {
        this.totalsCurrAmnt = totalsCurrAmnt;
    }

    public Short getYear() {
        return year;
    }

    public void setYear(Short year) {
        this.year = year;
    }
    
    
}

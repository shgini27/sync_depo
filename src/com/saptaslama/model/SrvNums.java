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
public class SrvNums implements java.io.Serializable{
    private int logicalRef;
    private int cardRef;
    private Short invenno;
    private Short duration;
    private float ordered;
    private float shipped;
    private String lastTrDate;

    public SrvNums(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public SrvNums(int logicalRef, int cardRef, Short invenno, Short duration, 
            float ordered, float shipped, String lastTrDate) {
        this.logicalRef = logicalRef;
        this.cardRef = cardRef;
        this.invenno = invenno;
        this.duration = duration;
        this.ordered = ordered;
        this.shipped = shipped;
        this.lastTrDate = checkDate(lastTrDate);
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

    public Short getDuration() {
        return duration;
    }

    public void setDuration(Short duration) {
        this.duration = duration;
    }

    public float getOrdered() {
        return ordered;
    }

    public void setOrdered(float ordered) {
        this.ordered = ordered;
    }

    public float getShipped() {
        return shipped;
    }

    public void setShipped(float shipped) {
        this.shipped = shipped;
    }

    public String getLastTrDate() {
        return lastTrDate;
    }

    public void setLastTrDate(String lastTrDate) {
        this.lastTrDate = checkDate(lastTrDate);
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

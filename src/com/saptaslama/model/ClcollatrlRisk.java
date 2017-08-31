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
public class ClcollatrlRisk implements java.io.Serializable{
    private int logicalRef;
    private int clCardRef;
    private Short riskType;
    private Short riskOver;
    private Short ordRiskOver;
    private Short despRiskOver;
    private Short userEpRisk;
    private float pcollatrlTotal;
    private float repPcollatrlTotal;
    private float scollatrlTotal;
    private float repscollatrlTotal;
    private float riskTotal;
    private float repRiskTotal;
    private float despRiskTotal;
    private float repDespRiskTotal;
    private float riskLimit;
    private float repRiskLimit;
    private float riskBalanced;
    private float repRiskBalanced;
    private float ordRiskTotal;
    private float repOrdRiskTotal;
    private float ordRiskTotalSugg;
    private float repOrdRiskTotalSugg;

    public ClcollatrlRisk(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public ClcollatrlRisk(int logicalRef, int clCardRef, Short riskType, 
            Short riskOver, Short ordRiskType, Short despRiskOver, Short userEpRisk, 
            float pcollatrlTotal, float repPcollatrlTotal, float scollatrlTotal, 
            float repscollatrlTotal, float riskTotal, float repRiskTotal, float despRiskTotal, 
            float repDespRiskTotal, float riskLimit, float repRiskLimit, float riskBalanced, 
            float repRiskBalanced, float ordRiskTotal, float repOrdRiskTotal, float ordRiskTotalSugg, 
            float repOrdRiskTotalSugg) {
        this.logicalRef = logicalRef;
        this.clCardRef = clCardRef;
        this.riskType = riskType;
        this.riskOver = riskOver;
        this.ordRiskOver = ordRiskType;
        this.despRiskOver = despRiskOver;
        this.userEpRisk = userEpRisk;
        this.pcollatrlTotal = pcollatrlTotal;
        this.repPcollatrlTotal = repPcollatrlTotal;
        this.scollatrlTotal = scollatrlTotal;
        this.repscollatrlTotal = repscollatrlTotal;
        this.riskTotal = riskTotal;
        this.repRiskTotal = repRiskTotal;
        this.despRiskTotal = despRiskTotal;
        this.repDespRiskTotal = repDespRiskTotal;
        this.riskLimit = riskLimit;
        this.repRiskLimit = repRiskLimit;
        this.riskBalanced = riskBalanced;
        this.repRiskBalanced = repRiskBalanced;
        this.ordRiskTotal = ordRiskTotal;
        this.repOrdRiskTotal = repOrdRiskTotal;
        this.ordRiskTotalSugg = ordRiskTotalSugg;
        this.repOrdRiskTotalSugg = repOrdRiskTotalSugg;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public int getClCardRef() {
        return clCardRef;
    }

    public void setClCardRef(int clCardRef) {
        this.clCardRef = clCardRef;
    }

    public Short getRiskType() {
        return riskType;
    }

    public void setRiskType(Short riskType) {
        this.riskType = riskType;
    }

    public Short getRiskOver() {
        return riskOver;
    }

    public void setRiskOver(Short riskOver) {
        this.riskOver = riskOver;
    }

    public Short getOrdRiskType() {
        return ordRiskOver;
    }

    public void setOrdRiskType(Short ordRiskType) {
        this.ordRiskOver = ordRiskType;
    }

    public Short getDespRiskOver() {
        return despRiskOver;
    }

    public void setDespRiskOver(Short despRiskOver) {
        this.despRiskOver = despRiskOver;
    }

    public Short getUserEpRisk() {
        return userEpRisk;
    }

    public void setUserEpRisk(Short userEpRisk) {
        this.userEpRisk = userEpRisk;
    }

    public float getPcollatrlTotal() {
        return pcollatrlTotal;
    }

    public void setPcollatrlTotal(float pcollatrlTotal) {
        this.pcollatrlTotal = pcollatrlTotal;
    }

    public float getRepPcollatrlTotal() {
        return repPcollatrlTotal;
    }

    public void setRepPcollatrlTotal(float repPcollatrlTotal) {
        this.repPcollatrlTotal = repPcollatrlTotal;
    }

    public float getScollatrlTotal() {
        return scollatrlTotal;
    }

    public void setScollatrlTotal(float scollatrlTotal) {
        this.scollatrlTotal = scollatrlTotal;
    }

    public float getRepscollatrlTotal() {
        return repscollatrlTotal;
    }

    public void setRepscollatrlTotal(float repscollatrlTotal) {
        this.repscollatrlTotal = repscollatrlTotal;
    }

    public float getRiskTotal() {
        return riskTotal;
    }

    public void setRiskTotal(float riskTotal) {
        this.riskTotal = riskTotal;
    }

    public float getRepRiskTotal() {
        return repRiskTotal;
    }

    public void setRepRiskTotal(float repRiskTotal) {
        this.repRiskTotal = repRiskTotal;
    }

    public float getDespRiskTotal() {
        return despRiskTotal;
    }

    public void setDespRiskTotal(float despRiskTotal) {
        this.despRiskTotal = despRiskTotal;
    }

    public float getRepDespRiskTotal() {
        return repDespRiskTotal;
    }

    public void setRepDespRiskTotal(float repDespRiskTotal) {
        this.repDespRiskTotal = repDespRiskTotal;
    }

    public float getRiskLimit() {
        return riskLimit;
    }

    public void setRiskLimit(float riskLimit) {
        this.riskLimit = riskLimit;
    }

    public float getRepRiskLimit() {
        return repRiskLimit;
    }

    public void setRepRiskLimit(float repRiskLimit) {
        this.repRiskLimit = repRiskLimit;
    }

    public float getRiskBalanced() {
        return riskBalanced;
    }

    public void setRiskBalanced(float riskBalanced) {
        this.riskBalanced = riskBalanced;
    }

    public float getRepRiskBalanced() {
        return repRiskBalanced;
    }

    public void setRepRiskBalanced(float repRiskBalanced) {
        this.repRiskBalanced = repRiskBalanced;
    }

    public float getOrdRiskTotal() {
        return ordRiskTotal;
    }

    public void setOrdRiskTotal(float ordRiskTotal) {
        this.ordRiskTotal = ordRiskTotal;
    }

    public float getRepOrdRiskTotal() {
        return repOrdRiskTotal;
    }

    public void setRepOrdRiskTotal(float repOrdRiskTotal) {
        this.repOrdRiskTotal = repOrdRiskTotal;
    }

    public float getOrdRiskTotalSugg() {
        return ordRiskTotalSugg;
    }

    public void setOrdRiskTotalSugg(float ordRiskTotalSugg) {
        this.ordRiskTotalSugg = ordRiskTotalSugg;
    }

    public float getRepOrdRiskTotalSugg() {
        return repOrdRiskTotalSugg;
    }

    public void setRepOrdRiskTotalSugg(float repOrdRiskTotalSugg) {
        this.repOrdRiskTotalSugg = repOrdRiskTotalSugg;
    }
    
    
}

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
public class ClrNums implements java.io.Serializable{
    private int logicalRef;
    private int clCardRef;
    private Short riskType;
    private Short riskOver;
    private float ps;
    private float kc;
    private float riskTotal;
    private float despRiskTotal;
    private float riskLimit;
    private float riskBalanced;
    private float cekRsikFactor;
    private float senetRsikFactor;
    private float cek0Debit;
    private float cek0Credit;
    private float cek1Debit;
    private float cek1Credit;
    private float senet0Debit;
    private float senet0Credit;
    private float senet1Debit;
    private float senet1Credit;
    private float cekCurr0Debit;
    private float cekCurr0Credit;
    private float cekCurr1Debit;
    private float cekCurr1Credit;
    private float senetCurr0Debit;
    private float senetCurr0Credit;
    private float senetCurr1Debit;
    private float senetCurr1Credit;
    private Short ordRiskOver;
    private Short despRiskOver;
    private Short userEpRisk;
    private float repRiskTotal;
    private float repDepRiskTotal;
    private float repRiskLimit;
    private float repRiskBalanced;
    private float repps;
    private float repkc;
    private float ordRiskTotal;
    private float ordRiskTotalSugg;
    private float repOrdRiskTotal;
    private float repOrdRiskTotalSugg;
    private Short riskType1;
    private Short riskType2;
    private Short riskType3;
    private Short riskType4;
    private Short riskType5;
    private Short riskType6;
    private Short riskType7;
    private Short riskType8;
    private Short riskType9;
    private Short riskType10;
    private Short riskType11;
    private Short riskType12;
    private Short riskType13;
    private Short riskType14;
    private Short riskType15;
    private float cstcekRiskFactor;
    private float cstSenetRiskFactor;
    private Short riskGrpControl;
    private Short accRiskOver;
    private Short cstcsRiskOver;
    private Short mycsRiskOver;
    private Short riskCtrlType;
    private float accRiskTotal;
    private float repAccRiskTotal;
    private float cstcsRiskTotal;
    private float repCstcsRiskTotal;
    private float mycsRiskTotal;
    private float repMycsRiskTotal;
    private float accRiskLimit;
    private float repAccRiskLimit;
    private float cstcsRiskLimit;
    private float repCstcsRiskLimit;
    private float mycsRiskLimit;
    private float repMycsRiskLimit;
    private float despRiskLimit;
    private float repDespRiskLimit;
    private float ordRiskLimit;
    private float repOrdRiskLimit;
    private float ordRiskLimitSugg;
    private float repOrdRiskLimitSugg;
    private float accRskBlnced;
    private float repaAcRskBlnced;
    private float cstcsRskBlnced;
    private float repcstcsRskBlnced;
    private float mycsRskBlnced;
    private float repmycsRskBlnced;
    private float despRskBlnced;
    private float repdespRskBlnced;
    private float ordRskBlnced;
    private float repordRskBlnced;
    private float ordRskBlncedSugg;
    private float repordRskBlncedSugg;

    public ClrNums(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public ClrNums(int logicalRef, int clCardRef, Short riskType, Short riskOver, 
            float ps, float kc, float riskTotal, float despRiskTotal, float riskLimit, 
            float riskBalanced, float cekRsikFactor, float senetRsikFactor, float cek0Debit, 
            float cek0Credit, float cek1Debit, float cek1Credit, float senet0Debit, 
            float senet0Credit, float senet1Debit, float senet1Credit, float cekCurr0Debit, 
            float cekCurr0Credit, float cekCurr1Debit, float cekCurr1Credit, float senetCurr0Debit, 
            float senetCurr0Credit, float senetCurr1Debit, float senetCurr1Credit, Short ordRiskOver, 
            Short despRiskOver, Short userEpRisk, float repRiskTotal, float repDepRiskTotal, 
            float repRiskLimit, float repRiskBalanced, float repps, float repkc, float ordRiskTotal, 
            float ordRiskTotalSugg, float repOrdRiskTotal, float repOrdRiskTotalSugg, Short riskType1, 
            Short riskType2, Short riskType3, Short riskType4, Short riskType5, Short riskType6, 
            Short riskType7, Short riskType8, Short riskType9, Short riskType10, Short riskType11, 
            Short riskType12, Short riskType13, Short riskType14, Short riskType15, float cstcekRiskFactor, 
            float cstSenetRiskFactor, Short riskGrpControl, Short accRiskOver, Short cstcsRiskOver, 
            Short mycsRiskOver, Short riskCtrlType, float accRiskTotal, float repAccRiskTotal, 
            float cstcsRiskTotal, float repCstcsRiskTotal, float mycsRiskTotal, float repMycsRiskTotal, 
            float accRiskLimit, float repAccRiskLimit, float cstcsRiskLimit, float repCstcsRiskLimit, 
            float mycsRiskLimit, float repMycsRiskLimit, float despRiskLimit, float repDespRiskLimit, 
            float ordRiskLimit, float repOrdRiskLimit, float ordRiskLimitSugg, float repOrdRiskLimitSugg, 
            float accRskBlnced, float repaAcRskBlnced, float cstcsRskBlnced, float repcstcsRskBlnced, 
            float mycsRskBlnced, float repmycsRskBlnced, float despRskBlnced, float repdespRskBlnced, 
            float ordRskBlnced, float repordRskBlnced, float ordRskBlncedSugg, float repordRskBlncedSugg) {
        this.logicalRef = logicalRef;
        this.clCardRef = clCardRef;
        this.riskType = riskType;
        this.riskOver = riskOver;
        this.ps = ps;
        this.kc = kc;
        this.riskTotal = riskTotal;
        this.despRiskTotal = despRiskTotal;
        this.riskLimit = riskLimit;
        this.riskBalanced = riskBalanced;
        this.cekRsikFactor = cekRsikFactor;
        this.senetRsikFactor = senetRsikFactor;
        this.cek0Debit = cek0Debit;
        this.cek0Credit = cek0Credit;
        this.cek1Debit = cek1Debit;
        this.cek1Credit = cek1Credit;
        this.senet0Debit = senet0Debit;
        this.senet0Credit = senet0Credit;
        this.senet1Debit = senet1Debit;
        this.senet1Credit = senet1Credit;
        this.cekCurr0Debit = cekCurr0Debit;
        this.cekCurr0Credit = cekCurr0Credit;
        this.cekCurr1Debit = cekCurr1Debit;
        this.cekCurr1Credit = cekCurr1Credit;
        this.senetCurr0Debit = senetCurr0Debit;
        this.senetCurr0Credit = senetCurr0Credit;
        this.senetCurr1Debit = senetCurr1Debit;
        this.senetCurr1Credit = senetCurr1Credit;
        this.ordRiskOver = ordRiskOver;
        this.despRiskOver = despRiskOver;
        this.userEpRisk = userEpRisk;
        this.repRiskTotal = repRiskTotal;
        this.repDepRiskTotal = repDepRiskTotal;
        this.repRiskLimit = repRiskLimit;
        this.repRiskBalanced = repRiskBalanced;
        this.repps = repps;
        this.repkc = repkc;
        this.ordRiskTotal = ordRiskTotal;
        this.ordRiskTotalSugg = ordRiskTotalSugg;
        this.repOrdRiskTotal = repOrdRiskTotal;
        this.repOrdRiskTotalSugg = repOrdRiskTotalSugg;
        this.riskType1 = riskType1;
        this.riskType2 = riskType2;
        this.riskType3 = riskType3;
        this.riskType4 = riskType4;
        this.riskType5 = riskType5;
        this.riskType6 = riskType6;
        this.riskType7 = riskType7;
        this.riskType8 = riskType8;
        this.riskType9 = riskType9;
        this.riskType10 = riskType10;
        this.riskType11 = riskType11;
        this.riskType12 = riskType12;
        this.riskType13 = riskType13;
        this.riskType14 = riskType14;
        this.riskType15 = riskType15;
        this.cstcekRiskFactor = cstcekRiskFactor;
        this.cstSenetRiskFactor = cstSenetRiskFactor;
        this.riskGrpControl = riskGrpControl;
        this.accRiskOver = accRiskOver;
        this.cstcsRiskOver = cstcsRiskOver;
        this.mycsRiskOver = mycsRiskOver;
        this.riskCtrlType = riskCtrlType;
        this.accRiskTotal = accRiskTotal;
        this.repAccRiskTotal = repAccRiskTotal;
        this.cstcsRiskTotal = cstcsRiskTotal;
        this.repCstcsRiskTotal = repCstcsRiskTotal;
        this.mycsRiskTotal = mycsRiskTotal;
        this.repMycsRiskTotal = repMycsRiskTotal;
        this.accRiskLimit = accRiskLimit;
        this.repAccRiskLimit = repAccRiskLimit;
        this.cstcsRiskLimit = cstcsRiskLimit;
        this.repCstcsRiskLimit = repCstcsRiskLimit;
        this.mycsRiskLimit = mycsRiskLimit;
        this.repMycsRiskLimit = repMycsRiskLimit;
        this.despRiskLimit = despRiskLimit;
        this.repDespRiskLimit = repDespRiskLimit;
        this.ordRiskLimit = ordRiskLimit;
        this.repOrdRiskLimit = repOrdRiskLimit;
        this.ordRiskLimitSugg = ordRiskLimitSugg;
        this.repOrdRiskLimitSugg = repOrdRiskLimitSugg;
        this.accRskBlnced = accRskBlnced;
        this.repaAcRskBlnced = repaAcRskBlnced;
        this.cstcsRskBlnced = cstcsRskBlnced;
        this.repcstcsRskBlnced = repcstcsRskBlnced;
        this.mycsRskBlnced = mycsRskBlnced;
        this.repmycsRskBlnced = repmycsRskBlnced;
        this.despRskBlnced = despRskBlnced;
        this.repdespRskBlnced = repdespRskBlnced;
        this.ordRskBlnced = ordRskBlnced;
        this.repordRskBlnced = repordRskBlnced;
        this.ordRskBlncedSugg = ordRskBlncedSugg;
        this.repordRskBlncedSugg = repordRskBlncedSugg;
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

    public float getPs() {
        return ps;
    }

    public void setPs(float ps) {
        this.ps = ps;
    }

    public float getKc() {
        return kc;
    }

    public void setKc(float kc) {
        this.kc = kc;
    }

    public float getRiskTotal() {
        return riskTotal;
    }

    public void setRiskTotal(float riskTotal) {
        this.riskTotal = riskTotal;
    }

    public float getDespRiskTotal() {
        return despRiskTotal;
    }

    public void setDespRiskTotal(float despRiskTotal) {
        this.despRiskTotal = despRiskTotal;
    }

    public float getRiskLimit() {
        return riskLimit;
    }

    public void setRiskLimit(float riskLimit) {
        this.riskLimit = riskLimit;
    }

    public float getRiskBalanced() {
        return riskBalanced;
    }

    public void setRiskBalanced(float riskBalanced) {
        this.riskBalanced = riskBalanced;
    }

    public float getCekRsikFactor() {
        return cekRsikFactor;
    }

    public void setCekRsikFactor(float cekRsikFactor) {
        this.cekRsikFactor = cekRsikFactor;
    }

    public float getSenetRsikFactor() {
        return senetRsikFactor;
    }

    public void setSenetRsikFactor(float senetRsikFactor) {
        this.senetRsikFactor = senetRsikFactor;
    }

    public float getCek0Debit() {
        return cek0Debit;
    }

    public void setCek0Debit(float cek0Debit) {
        this.cek0Debit = cek0Debit;
    }

    public float getCek0Credit() {
        return cek0Credit;
    }

    public void setCek0Credit(float cek0Credit) {
        this.cek0Credit = cek0Credit;
    }

    public float getCek1Debit() {
        return cek1Debit;
    }

    public void setCek1Debit(float cek1Debit) {
        this.cek1Debit = cek1Debit;
    }

    public float getCek1Credit() {
        return cek1Credit;
    }

    public void setCek1Credit(float cek1Credit) {
        this.cek1Credit = cek1Credit;
    }

    public float getSenet0Debit() {
        return senet0Debit;
    }

    public void setSenet0Debit(float senet0Debit) {
        this.senet0Debit = senet0Debit;
    }

    public float getSenet0Credit() {
        return senet0Credit;
    }

    public void setSenet0Credit(float senet0Credit) {
        this.senet0Credit = senet0Credit;
    }

    public float getSenet1Debit() {
        return senet1Debit;
    }

    public void setSenet1Debit(float senet1Debit) {
        this.senet1Debit = senet1Debit;
    }

    public float getSenet1Credit() {
        return senet1Credit;
    }

    public void setSenet1Credit(float senet1Credit) {
        this.senet1Credit = senet1Credit;
    }

    public float getCekCurr0Debit() {
        return cekCurr0Debit;
    }

    public void setCekCurr0Debit(float cekCurr0Debit) {
        this.cekCurr0Debit = cekCurr0Debit;
    }

    public float getCekCurr0Credit() {
        return cekCurr0Credit;
    }

    public void setCekCurr0Credit(float cekCurr0Credit) {
        this.cekCurr0Credit = cekCurr0Credit;
    }

    public float getCekCurr1Debit() {
        return cekCurr1Debit;
    }

    public void setCekCurr1Debit(float cekCurr1Debit) {
        this.cekCurr1Debit = cekCurr1Debit;
    }

    public float getCekCurr1Credit() {
        return cekCurr1Credit;
    }

    public void setCekCurr1Credit(float cekCurr1Credit) {
        this.cekCurr1Credit = cekCurr1Credit;
    }

    public float getSenetCurr0Debit() {
        return senetCurr0Debit;
    }

    public void setSenetCurr0Debit(float senetCurr0Debit) {
        this.senetCurr0Debit = senetCurr0Debit;
    }

    public float getSenetCurr0Credit() {
        return senetCurr0Credit;
    }

    public void setSenetCurr0Credit(float senetCurr0Credit) {
        this.senetCurr0Credit = senetCurr0Credit;
    }

    public float getSenetCurr1Debit() {
        return senetCurr1Debit;
    }

    public void setSenetCurr1Debit(float senetCurr1Debit) {
        this.senetCurr1Debit = senetCurr1Debit;
    }

    public float getSenetCurr1Credit() {
        return senetCurr1Credit;
    }

    public void setSenetCurr1Credit(float senetCurr1Credit) {
        this.senetCurr1Credit = senetCurr1Credit;
    }

    public Short getOrdRiskOver() {
        return ordRiskOver;
    }

    public void setOrdRiskOver(Short ordRiskOver) {
        this.ordRiskOver = ordRiskOver;
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

    public float getRepRiskTotal() {
        return repRiskTotal;
    }

    public void setRepRiskTotal(float repRiskTotal) {
        this.repRiskTotal = repRiskTotal;
    }

    public float getRepDepRiskTotal() {
        return repDepRiskTotal;
    }

    public void setRepDepRiskTotal(float repDepRiskTotal) {
        this.repDepRiskTotal = repDepRiskTotal;
    }

    public float getRepRiskLimit() {
        return repRiskLimit;
    }

    public void setRepRiskLimit(float repRiskLimit) {
        this.repRiskLimit = repRiskLimit;
    }

    public float getRepRiskBalanced() {
        return repRiskBalanced;
    }

    public void setRepRiskBalanced(float repRiskBalanced) {
        this.repRiskBalanced = repRiskBalanced;
    }

    public float getRepps() {
        return repps;
    }

    public void setRepps(float repps) {
        this.repps = repps;
    }

    public float getRepkc() {
        return repkc;
    }

    public void setRepkc(float repkc) {
        this.repkc = repkc;
    }

    public float getOrdRiskTotal() {
        return ordRiskTotal;
    }

    public void setOrdRiskTotal(float ordRiskTotal) {
        this.ordRiskTotal = ordRiskTotal;
    }

    public float getOrdRiskTotalSugg() {
        return ordRiskTotalSugg;
    }

    public void setOrdRiskTotalSugg(float ordRiskTotalSugg) {
        this.ordRiskTotalSugg = ordRiskTotalSugg;
    }

    public float getRepOrdRiskTotal() {
        return repOrdRiskTotal;
    }

    public void setRepOrdRiskTotal(float repOrdRiskTotal) {
        this.repOrdRiskTotal = repOrdRiskTotal;
    }

    public float getRepOrdRiskTotalSugg() {
        return repOrdRiskTotalSugg;
    }

    public void setRepOrdRiskTotalSugg(float repOrdRiskTotalSugg) {
        this.repOrdRiskTotalSugg = repOrdRiskTotalSugg;
    }

    public Short getRiskType1() {
        return riskType1;
    }

    public void setRiskType1(Short riskType1) {
        this.riskType1 = riskType1;
    }

    public Short getRiskType2() {
        return riskType2;
    }

    public void setRiskType2(Short riskType2) {
        this.riskType2 = riskType2;
    }

    public Short getRiskType3() {
        return riskType3;
    }

    public void setRiskType3(Short riskType3) {
        this.riskType3 = riskType3;
    }

    public Short getRiskType4() {
        return riskType4;
    }

    public void setRiskType4(Short riskType4) {
        this.riskType4 = riskType4;
    }

    public Short getRiskType5() {
        return riskType5;
    }

    public void setRiskType5(Short riskType5) {
        this.riskType5 = riskType5;
    }

    public Short getRiskType6() {
        return riskType6;
    }

    public void setRiskType6(Short riskType6) {
        this.riskType6 = riskType6;
    }

    public Short getRiskType7() {
        return riskType7;
    }

    public void setRiskType7(Short riskType7) {
        this.riskType7 = riskType7;
    }

    public Short getRiskType8() {
        return riskType8;
    }

    public void setRiskType8(Short riskType8) {
        this.riskType8 = riskType8;
    }

    public Short getRiskType9() {
        return riskType9;
    }

    public void setRiskType9(Short riskType9) {
        this.riskType9 = riskType9;
    }

    public Short getRiskType10() {
        return riskType10;
    }

    public void setRiskType10(Short riskType10) {
        this.riskType10 = riskType10;
    }

    public Short getRiskType11() {
        return riskType11;
    }

    public void setRiskType11(Short riskType11) {
        this.riskType11 = riskType11;
    }

    public Short getRiskType12() {
        return riskType12;
    }

    public void setRiskType12(Short riskType12) {
        this.riskType12 = riskType12;
    }

    public Short getRiskType13() {
        return riskType13;
    }

    public void setRiskType13(Short riskType13) {
        this.riskType13 = riskType13;
    }

    public Short getRiskType14() {
        return riskType14;
    }

    public void setRiskType14(Short riskType14) {
        this.riskType14 = riskType14;
    }

    public Short getRiskType15() {
        return riskType15;
    }

    public void setRiskType15(Short riskType15) {
        this.riskType15 = riskType15;
    }

    public float getCstcekRiskFactor() {
        return cstcekRiskFactor;
    }

    public void setCstcekRiskFactor(float cstcekRiskFactor) {
        this.cstcekRiskFactor = cstcekRiskFactor;
    }

    public float getCstSenetRiskFactor() {
        return cstSenetRiskFactor;
    }

    public void setCstSenetRiskFactor(float cstSenetRiskFactor) {
        this.cstSenetRiskFactor = cstSenetRiskFactor;
    }

    public Short getRiskGrpControl() {
        return riskGrpControl;
    }

    public void setRiskGrpControl(Short riskGrpControl) {
        this.riskGrpControl = riskGrpControl;
    }

    public Short getAccRiskOver() {
        return accRiskOver;
    }

    public void setAccRiskOver(Short accRiskOver) {
        this.accRiskOver = accRiskOver;
    }

    public Short getCstcsRiskOver() {
        return cstcsRiskOver;
    }

    public void setCstcsRiskOver(Short cstcsRiskOver) {
        this.cstcsRiskOver = cstcsRiskOver;
    }

    public Short getMycsRiskOver() {
        return mycsRiskOver;
    }

    public void setMycsRiskOver(Short mycsRiskOver) {
        this.mycsRiskOver = mycsRiskOver;
    }

    public Short getRiskCtrlType() {
        return riskCtrlType;
    }

    public void setRiskCtrlType(Short riskCtrlType) {
        this.riskCtrlType = riskCtrlType;
    }

    public float getAccRiskTotal() {
        return accRiskTotal;
    }

    public void setAccRiskTotal(float accRiskTotal) {
        this.accRiskTotal = accRiskTotal;
    }

    public float getRepAccRiskTotal() {
        return repAccRiskTotal;
    }

    public void setRepAccRiskTotal(float repAccRiskTotal) {
        this.repAccRiskTotal = repAccRiskTotal;
    }

    public float getCstcsRiskTotal() {
        return cstcsRiskTotal;
    }

    public void setCstcsRiskTotal(float cstcsRiskTotal) {
        this.cstcsRiskTotal = cstcsRiskTotal;
    }

    public float getRepCstcsRiskTotal() {
        return repCstcsRiskTotal;
    }

    public void setRepCstcsRiskTotal(float repCstcsRiskTotal) {
        this.repCstcsRiskTotal = repCstcsRiskTotal;
    }

    public float getMycsRiskTotal() {
        return mycsRiskTotal;
    }

    public void setMycsRiskTotal(float mycsRiskTotal) {
        this.mycsRiskTotal = mycsRiskTotal;
    }

    public float getRepMycsRiskTotal() {
        return repMycsRiskTotal;
    }

    public void setRepMycsRiskTotal(float repMycsRiskTotal) {
        this.repMycsRiskTotal = repMycsRiskTotal;
    }

    public float getAccRiskLimit() {
        return accRiskLimit;
    }

    public void setAccRiskLimit(float accRiskLimit) {
        this.accRiskLimit = accRiskLimit;
    }

    public float getRepAccRiskLimit() {
        return repAccRiskLimit;
    }

    public void setRepAccRiskLimit(float repAccRiskLimit) {
        this.repAccRiskLimit = repAccRiskLimit;
    }

    public float getCstcsRiskLimit() {
        return cstcsRiskLimit;
    }

    public void setCstcsRiskLimit(float cstcsRiskLimit) {
        this.cstcsRiskLimit = cstcsRiskLimit;
    }

    public float getRepCstcsRiskLimit() {
        return repCstcsRiskLimit;
    }

    public void setRepCstcsRiskLimit(float repCstcsRiskLimit) {
        this.repCstcsRiskLimit = repCstcsRiskLimit;
    }

    public float getMycsRiskLimit() {
        return mycsRiskLimit;
    }

    public void setMycsRiskLimit(float mycsRiskLimit) {
        this.mycsRiskLimit = mycsRiskLimit;
    }

    public float getRepMycsRiskLimit() {
        return repMycsRiskLimit;
    }

    public void setRepMycsRiskLimit(float repMycsRiskLimit) {
        this.repMycsRiskLimit = repMycsRiskLimit;
    }

    public float getDespRiskLimit() {
        return despRiskLimit;
    }

    public void setDespRiskLimit(float despRiskLimit) {
        this.despRiskLimit = despRiskLimit;
    }

    public float getRepDespRiskLimit() {
        return repDespRiskLimit;
    }

    public void setRepDespRiskLimit(float repDespRiskLimit) {
        this.repDespRiskLimit = repDespRiskLimit;
    }

    public float getOrdRiskLimit() {
        return ordRiskLimit;
    }

    public void setOrdRiskLimit(float ordRiskLimit) {
        this.ordRiskLimit = ordRiskLimit;
    }

    public float getRepOrdRiskLimit() {
        return repOrdRiskLimit;
    }

    public void setRepOrdRiskLimit(float repOrdRiskLimit) {
        this.repOrdRiskLimit = repOrdRiskLimit;
    }

    public float getOrdRiskLimitSugg() {
        return ordRiskLimitSugg;
    }

    public void setOrdRiskLimitSugg(float ordRiskLimitSugg) {
        this.ordRiskLimitSugg = ordRiskLimitSugg;
    }

    public float getRepOrdRiskLimitSugg() {
        return repOrdRiskLimitSugg;
    }

    public void setRepOrdRiskLimitSugg(float repOrdRiskLimitSugg) {
        this.repOrdRiskLimitSugg = repOrdRiskLimitSugg;
    }

    public float getAccRskBlnced() {
        return accRskBlnced;
    }

    public void setAccRskBlnced(float accRskBlnced) {
        this.accRskBlnced = accRskBlnced;
    }

    public float getRepaAcRskBlnced() {
        return repaAcRskBlnced;
    }

    public void setRepaAcRskBlnced(float repaAcRskBlnced) {
        this.repaAcRskBlnced = repaAcRskBlnced;
    }

    public float getCstcsRskBlnced() {
        return cstcsRskBlnced;
    }

    public void setCstcsRskBlnced(float cstcsRskBlnced) {
        this.cstcsRskBlnced = cstcsRskBlnced;
    }

    public float getRepcstcsRskBlnced() {
        return repcstcsRskBlnced;
    }

    public void setRepcstcsRskBlnced(float repcstcsRskBlnced) {
        this.repcstcsRskBlnced = repcstcsRskBlnced;
    }

    public float getMycsRskBlnced() {
        return mycsRskBlnced;
    }

    public void setMycsRskBlnced(float mycsRskBlnced) {
        this.mycsRskBlnced = mycsRskBlnced;
    }

    public float getRepmycsRskBlnced() {
        return repmycsRskBlnced;
    }

    public void setRepmycsRskBlnced(float repmycsRskBlnced) {
        this.repmycsRskBlnced = repmycsRskBlnced;
    }

    public float getDespRskBlnced() {
        return despRskBlnced;
    }

    public void setDespRskBlnced(float despRskBlnced) {
        this.despRskBlnced = despRskBlnced;
    }

    public float getRepdespRskBlnced() {
        return repdespRskBlnced;
    }

    public void setRepdespRskBlnced(float repdespRskBlnced) {
        this.repdespRskBlnced = repdespRskBlnced;
    }

    public float getOrdRskBlnced() {
        return ordRskBlnced;
    }

    public void setOrdRskBlnced(float ordRskBlnced) {
        this.ordRskBlnced = ordRskBlnced;
    }

    public float getRepordRskBlnced() {
        return repordRskBlnced;
    }

    public void setRepordRskBlnced(float repordRskBlnced) {
        this.repordRskBlnced = repordRskBlnced;
    }

    public float getOrdRskBlncedSugg() {
        return ordRskBlncedSugg;
    }

    public void setOrdRskBlncedSugg(float ordRskBlncedSugg) {
        this.ordRskBlncedSugg = ordRskBlncedSugg;
    }

    public float getRepordRskBlncedSugg() {
        return repordRskBlncedSugg;
    }

    public void setRepordRskBlncedSugg(float repordRskBlncedSugg) {
        this.repordRskBlncedSugg = repordRskBlncedSugg;
    }
    
    
}

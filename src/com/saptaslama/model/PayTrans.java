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
public class PayTrans implements java.io.Serializable{
    private int logicalRef;
    private int cardRef;
    private String date;
    private Short moduleNr;
    private Short sign;
    private int ficheRef;
    private int ficheLineRef;
    private Short trCode;
    private float total;
    private float paid;
    private float earlyIntRate;
    private float latelyIntRate;
    private int crossRef;
    private Short paidInCash;
    private Short cancelled;
    private String procDate;
    private Short trCurr;
    private float trRate;
    private float reportRate;
    private Short modified;
    private Short remindLev;
    private Short remindSent;
    private Short crossCurr;
    private float crossTotal;
    private Short discflag;
    private Short siteId;
    private int orgLogicRef;
    private int wfStatus;
    private float closingRate;
    private String discDueDate;
    private Short opStat;
    private Short recStatus;
    private float infidx;
    private Short payNo;
    private float delayTotal;
    private int lastSendRemLev;
    private Short pointTrans;
    private String bankPayDate;
    private float poscomsn;
    private float pointcomsn;
    private int bankAccRef;
    private Short paymentType;
    private int cashAccRef;
    private float trNet;
    private int repayPlanRef;
    private float dueDiffComsn;
    private Short calcType;
    private float netTotal;
    private Short repyPlnApplied;
    private Short payTrCurr;
    private float payTrRate;
    private float payTrNet;
    private Short bnTrCreated;
    private int bnFchRef;
    private int bnFlnRef;
    private Short installType;
    private int instalRef;
    private int mainInstalRef;

    public PayTrans(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public PayTrans(int logicalRef, int cardRef, String date, Short moduleNr, 
            Short sign, int ficheRef, int ficheLineRef, Short trCode, float total, 
            float paid, float earlyIntRate, float latelyIntRate, int crossRef, 
            Short paidInCash, Short cancelled, String procDate, Short trCurr, 
            float trRate, float reportRate, Short modified, Short remindLev, 
            Short remindSent, Short crossCurr, float crossTotal, Short discflag, 
            Short siteId, int orgLogicRef, int wfStatus, float closingRate, 
            String discDueDate, Short opStat, Short recStatus, float infidx, 
            Short payNo, float delayTotal, int lastSendRemLev, Short pointTrans, 
            String bankPayDate, float poscomsn, float pointcomsn, int bankAccRef, 
            Short paymentType, int cashAccRef, float trNet, int repayPlanRef, 
            float dueDiffComsn, Short calcType, float netTotal, Short repyPlnApplied, 
            Short payTrCurr, float payTrRate, float payTrNet, Short bnTrCreated, 
            int bnFchRef, int bnFlnRef, Short installType, int instalRef, int mainInstalRef) {
        this.logicalRef = logicalRef;
        this.cardRef = cardRef;
        this.date = checkDate(date);
        this.moduleNr = moduleNr;
        this.sign = sign;
        this.ficheRef = ficheRef;
        this.ficheLineRef = ficheLineRef;
        this.trCode = trCode;
        this.total = total;
        this.paid = paid;
        this.earlyIntRate = earlyIntRate;
        this.latelyIntRate = latelyIntRate;
        this.crossRef = crossRef;
        this.paidInCash = paidInCash;
        this.cancelled = cancelled;
        this.procDate = checkDate(procDate);
        this.trCurr = trCurr;
        this.trRate = trRate;
        this.reportRate = reportRate;
        this.modified = modified;
        this.remindLev = remindLev;
        this.remindSent = remindSent;
        this.crossCurr = crossCurr;
        this.crossTotal = crossTotal;
        this.discflag = discflag;
        this.siteId = siteId;
        this.orgLogicRef = orgLogicRef;
        this.wfStatus = wfStatus;
        this.closingRate = closingRate;
        this.discDueDate = checkDate(discDueDate);
        this.opStat = opStat;
        this.recStatus = recStatus;
        this.infidx = infidx;
        this.payNo = payNo;
        this.delayTotal = delayTotal;
        this.lastSendRemLev = lastSendRemLev;
        this.pointTrans = pointTrans;
        this.bankPayDate = checkDate(bankPayDate);
        this.poscomsn = poscomsn;
        this.pointcomsn = pointcomsn;
        this.bankAccRef = bankAccRef;
        this.paymentType = paymentType;
        this.cashAccRef = cashAccRef;
        this.trNet = trNet;
        this.repayPlanRef = repayPlanRef;
        this.dueDiffComsn = dueDiffComsn;
        this.calcType = calcType;
        this.netTotal = netTotal;
        this.repyPlnApplied = repyPlnApplied;
        this.payTrCurr = payTrCurr;
        this.payTrRate = payTrRate;
        this.payTrNet = payTrNet;
        this.bnTrCreated = bnTrCreated;
        this.bnFchRef = bnFchRef;
        this.bnFlnRef = bnFlnRef;
        this.installType = installType;
        this.instalRef = instalRef;
        this.mainInstalRef = mainInstalRef;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = checkDate(date);
    }

    public Short getModuleNr() {
        return moduleNr;
    }

    public void setModuleNr(Short moduleNr) {
        this.moduleNr = moduleNr;
    }

    public Short getSign() {
        return sign;
    }

    public void setSign(Short sign) {
        this.sign = sign;
    }

    public int getFicheRef() {
        return ficheRef;
    }

    public void setFicheRef(int ficheRef) {
        this.ficheRef = ficheRef;
    }

    public int getFicheLineRef() {
        return ficheLineRef;
    }

    public void setFicheLineRef(int ficheLineRef) {
        this.ficheLineRef = ficheLineRef;
    }

    public Short getTrCode() {
        return trCode;
    }

    public void setTrCode(Short trCode) {
        this.trCode = trCode;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getPaid() {
        return paid;
    }

    public void setPaid(float paid) {
        this.paid = paid;
    }

    public float getEarlyIntRate() {
        return earlyIntRate;
    }

    public void setEarlyIntRate(float earlyIntRate) {
        this.earlyIntRate = earlyIntRate;
    }

    public float getLatelyIntRate() {
        return latelyIntRate;
    }

    public void setLatelyIntRate(float latelyIntRate) {
        this.latelyIntRate = latelyIntRate;
    }

    public int getCrossRef() {
        return crossRef;
    }

    public void setCrossRef(int crossRef) {
        this.crossRef = crossRef;
    }

    public Short getPaidInCash() {
        return paidInCash;
    }

    public void setPaidInCash(Short paidInCash) {
        this.paidInCash = paidInCash;
    }

    public Short getCancelled() {
        return cancelled;
    }

    public void setCancelled(Short cancelled) {
        this.cancelled = cancelled;
    }

    public String getProcDate() {
        return procDate;
    }

    public void setProcDate(String procDate) {
        this.procDate = checkDate(procDate);
    }

    public Short getTrCurr() {
        return trCurr;
    }

    public void setTrCurr(Short trCurr) {
        this.trCurr = trCurr;
    }

    public float getTrRate() {
        return trRate;
    }

    public void setTrRate(float trRate) {
        this.trRate = trRate;
    }

    public float getReportRate() {
        return reportRate;
    }

    public void setReportRate(float reportRate) {
        this.reportRate = reportRate;
    }

    public Short getModified() {
        return modified;
    }

    public void setModified(Short modified) {
        this.modified = modified;
    }

    public Short getRemindLev() {
        return remindLev;
    }

    public void setRemindLev(Short remindLev) {
        this.remindLev = remindLev;
    }

    public Short getRemindSent() {
        return remindSent;
    }

    public void setRemindSent(Short remindSent) {
        this.remindSent = remindSent;
    }

    public Short getCrossCurr() {
        return crossCurr;
    }

    public void setCrossCurr(Short crossCurr) {
        this.crossCurr = crossCurr;
    }

    public float getCrossTotal() {
        return crossTotal;
    }

    public void setCrossTotal(float crossTotal) {
        this.crossTotal = crossTotal;
    }

    public Short getDiscflag() {
        return discflag;
    }

    public void setDiscflag(Short discflag) {
        this.discflag = discflag;
    }

    public Short getSiteId() {
        return siteId;
    }

    public void setSiteId(Short siteId) {
        this.siteId = siteId;
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

    public float getClosingRate() {
        return closingRate;
    }

    public void setClosingRate(float closingRate) {
        this.closingRate = closingRate;
    }

    public String getDiscDueDate() {
        return discDueDate;
    }

    public void setDiscDueDate(String discDueDate) {
        this.discDueDate = checkDate(discDueDate);
    }

    public Short getOpStat() {
        return opStat;
    }

    public void setOpStat(Short opStat) {
        this.opStat = opStat;
    }

    public Short getRecStatus() {
        return recStatus;
    }

    public void setRecStatus(Short recStatus) {
        this.recStatus = recStatus;
    }

    public float getInfidx() {
        return infidx;
    }

    public void setInfidx(float infidx) {
        this.infidx = infidx;
    }

    public Short getPayNo() {
        return payNo;
    }

    public void setPayNo(Short payNo) {
        this.payNo = payNo;
    }

    public float getDelayTotal() {
        return delayTotal;
    }

    public void setDelayTotal(float delayTotal) {
        this.delayTotal = delayTotal;
    }

    public int getLastSendRemLev() {
        return lastSendRemLev;
    }

    public void setLastSendRemLev(int lastSendRemLev) {
        this.lastSendRemLev = lastSendRemLev;
    }

    public Short getPointTrans() {
        return pointTrans;
    }

    public void setPointTrans(Short pointTrans) {
        this.pointTrans = pointTrans;
    }

    public String getBankPayDate() {
        return bankPayDate;
    }

    public void setBankPayDate(String bankPayDate) {
        this.bankPayDate = checkDate(bankPayDate);
    }

    public float getPoscomsn() {
        return poscomsn;
    }

    public void setPoscomsn(float poscomsn) {
        this.poscomsn = poscomsn;
    }

    public float getPointcomsn() {
        return pointcomsn;
    }

    public void setPointcomsn(float pointcomsn) {
        this.pointcomsn = pointcomsn;
    }

    public int getBankAccRef() {
        return bankAccRef;
    }

    public void setBankAccRef(int bankAccRef) {
        this.bankAccRef = bankAccRef;
    }

    public Short getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Short paymentType) {
        this.paymentType = paymentType;
    }

    public int getCashAccRef() {
        return cashAccRef;
    }

    public void setCashAccRef(int cashAccRef) {
        this.cashAccRef = cashAccRef;
    }

    public float getTrNet() {
        return trNet;
    }

    public void setTrNet(float trNet) {
        this.trNet = trNet;
    }

    public int getRepayPlanRef() {
        return repayPlanRef;
    }

    public void setRepayPlanRef(int repayPlanRef) {
        this.repayPlanRef = repayPlanRef;
    }

    public float getDueDiffComsn() {
        return dueDiffComsn;
    }

    public void setDueDiffComsn(float dueDiffComsn) {
        this.dueDiffComsn = dueDiffComsn;
    }

    public Short getCalcType() {
        return calcType;
    }

    public void setCalcType(Short calcType) {
        this.calcType = calcType;
    }

    public float getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(float netTotal) {
        this.netTotal = netTotal;
    }

    public Short getRepyPlnApplied() {
        return repyPlnApplied;
    }

    public void setRepyPlnApplied(Short repyPlnApplied) {
        this.repyPlnApplied = repyPlnApplied;
    }

    public Short getPayTrCurr() {
        return payTrCurr;
    }

    public void setPayTrCurr(Short payTrCurr) {
        this.payTrCurr = payTrCurr;
    }

    public float getPayTrRate() {
        return payTrRate;
    }

    public void setPayTrRate(float payTrRate) {
        this.payTrRate = payTrRate;
    }

    public float getPayTrNet() {
        return payTrNet;
    }

    public void setPayTrNet(float payTrNet) {
        this.payTrNet = payTrNet;
    }

    public Short getBnTrCreated() {
        return bnTrCreated;
    }

    public void setBnTrCreated(Short bnTrCreated) {
        this.bnTrCreated = bnTrCreated;
    }

    public int getBnFchRef() {
        return bnFchRef;
    }

    public void setBnFchRef(int bnFchRef) {
        this.bnFchRef = bnFchRef;
    }

    public int getBnFlnRef() {
        return bnFlnRef;
    }

    public void setBnFlnRef(int bnFlnRef) {
        this.bnFlnRef = bnFlnRef;
    }

    public Short getInstallType() {
        return installType;
    }

    public void setInstallType(Short installType) {
        this.installType = installType;
    }

    public int getInstalRef() {
        return instalRef;
    }

    public void setInstalRef(int instalRef) {
        this.instalRef = instalRef;
    }

    public int getMainInstalRef() {
        return mainInstalRef;
    }

    public void setMainInstalRef(int mainInstalRef) {
        this.mainInstalRef = mainInstalRef;
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

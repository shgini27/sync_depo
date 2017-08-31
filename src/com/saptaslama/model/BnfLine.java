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
public class BnfLine implements java.io.Serializable{
    private int logicalRef;
    private int bankRef;
    private int bnAccRef;
    private int clientRef;
    private int accountRef;
    private int centerRef;
    private int bnAccountRef;
    private int bnCenterRef;
    private int virmanRef;
    private int sourceRef;
    private Short transType;
    private String date;
    private Short department;
    private Short branch;
    private Short sign;
    private Short trCode;
    private Short moduleNr;
    private Short lineNr;
    private String specode;
    private String cyphCode;
    private String tranNo;
    private String doCode;
    private String lineExp;
    private Short accounted;
    private Short trCurr;
    private float amount;
    private float trRate;
    private float trNet;
    private float reportRate;
    private float reportNet;
    private int extenRef;
    private int accFicheRef;
    private Short printCnt;
    private Short capiblockCreatedby;
    private String capiblockCreadeddate;
    private Short capiblockCreatedhour;
    private Short capiblockCreatedmin;
    private Short capiblockCreatedsec;
    private Short capiblockModifiedby;
    private String capiblockModifieddate;
    private Short capiblockModifiedhour;
    private Short capiblockModifiedmin;
    private Short capiblockModifiedsec;
    private Short cancelled;
    private String clBnBranchNo;
    private String clBnAccountNo;
    private String bnTrackingNo;
    private Short trnState;
    private String tradingGrp;
    private Short lineExcTyp;
    private Short discFlag;
    private float discRate;
    private float vatRate;
    private float arCloseAmount;
    private int discAccRef;
    private int discCentRef;
    private int vatrAccRef;
    private int vatrCentRef;
    private int paymentRef;
    private Short bankProcType;
    private Short bankProcCode;
    private String transDueDate;
    private Short siteId;
    private Short recStatus;
    private int orgLogicRef;
    private Short opstat;
    private float infdix;
    private String eximFicheNo;
    private Short bnTranVatInc;
    private float bnTranVatRat;
    private int bnTranVatAccRef;
    private int bnTranVatCenRef;
    private float bnTranVatTot;
    private String cheqInfo;
    private int eximInfoRef;
    private float eximInfoPar;
    private int excreRef;
    private Short crCardWzd;
    private Short comsType;
    private int proVisionRef;
    private Short tranGrpLineNo;
    private int projectRef;
    private String tranGrpDate;
    private String tranGrpNo;
    private String bankRefNr;
    private String customDocNr;
    private int dabLnRef;
    private int transRef;
    private Short affectCollatRl;
    private int collatRollRef;
    private int collatTrnRef;
    private int collatCardRef;
    private Short grpFirmTrans;
    private Short affectRisk;
    private Short bnCrSource;
    private int bnCrRef;
    private Short bnCrLnType;

    public BnfLine(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public BnfLine(int logicalRef, int bankRef, int bnAccRef, int clientRef, 
            int accountRef, int centerRef, int bnAccountRef, int bnCenterRef, 
            int virmanRef, int sourceRef, Short transType, String date, Short department, 
            Short branch, Short sign, Short trCode, Short moduleNr, Short lineNr, String specode, 
            String cyphCode, String tranNo, String doCode, String lineExp, Short accounted, 
            Short trCurr, float amount, float trRate, float trNet, float reportRate, float reportNet, 
            int extenRef, int accFicheRef, Short printCnt, Short capiblockCreatedby, String capiblockCreadeddate, 
            Short capiblockCreatedhour, Short capiblockCreatedmin, Short capiblockCreatedsec, 
            Short capiblockModifiedby, String capiblockModifieddate, Short capiblockModifiedhour, 
            Short capiblockModifiedmin, Short capiblockModifiedsec, Short cancelled, String clBnBranchNo, 
            String clBnAccountNo, String bnTrackingNo, Short trnState, String tradingGrp, Short lineExcTyp, 
            Short discFlag, float discRate, float vatRate, float arCloseAmount, int discAccRef, int discCentRef, 
            int vatrAccRef, int vatrCentRef, int paymentRef, Short bankProcType, Short bankProcCode, 
            String transDueDate, Short siteId, Short recStatus, int orgLogicRef, Short opstat, float infdix, 
            String eximFicheNo, Short bnTranVatInc, float bnTranVatRat, int bnTranVatAccRef, int bnTranVatCenRef, 
            float bnTranVatTot, String cheqInfo, int eximInfoRef, float eximInfoPar, int excreRef, Short crCardWzd, 
            Short comsType, int proVisionRef, Short tranGrpLineNo, int projectRef, String tranGrpDate, 
            String tranGrpNo, String bankRefNr, String customDocNr, int dabLnRef, int transRef, Short affectCollatRl, 
            int collatRollRef, int collatTrnRef, int collatCardRef, Short grpFirmTrans, Short affectRisk, 
            Short bnCrSource, int bnCrRef, Short bnCrLnType) {
        this.logicalRef = logicalRef;
        this.bankRef = bankRef;
        this.bnAccRef = bnAccRef;
        this.clientRef = clientRef;
        this.accountRef = accountRef;
        this.centerRef = centerRef;
        this.bnAccountRef = bnAccountRef;
        this.bnCenterRef = bnCenterRef;
        this.virmanRef = virmanRef;
        this.sourceRef = sourceRef;
        this.transType = transType;
        this.date = checkDate(date);
        this.department = department;
        this.branch = branch;
        this.sign = sign;
        this.trCode = trCode;
        this.moduleNr = moduleNr;
        this.lineNr = lineNr;
        this.specode = specode;
        this.cyphCode = cyphCode;
        this.tranNo = tranNo;
        this.doCode = doCode;
        this.lineExp = lineExp;
        this.accounted = accounted;
        this.trCurr = trCurr;
        this.amount = amount;
        this.trRate = trRate;
        this.trNet = trNet;
        this.reportRate = reportRate;
        this.reportNet = reportNet;
        this.extenRef = extenRef;
        this.accFicheRef = accFicheRef;
        this.printCnt = printCnt;
        this.capiblockCreatedby = capiblockCreatedby;
        this.capiblockCreadeddate = capiblockCreadeddate;
        this.capiblockCreatedhour = capiblockCreatedhour;
        this.capiblockCreatedmin = capiblockCreatedmin;
        this.capiblockCreatedsec = capiblockCreatedsec;
        this.capiblockModifiedby = capiblockModifiedby;
        this.capiblockModifieddate = checkDate(capiblockModifieddate);
        this.capiblockModifiedhour = capiblockModifiedhour;
        this.capiblockModifiedmin = capiblockModifiedmin;
        this.capiblockModifiedsec = capiblockModifiedsec;
        this.cancelled = cancelled;
        this.clBnBranchNo = clBnBranchNo;
        this.clBnAccountNo = clBnAccountNo;
        this.bnTrackingNo = bnTrackingNo;
        this.trnState = trnState;
        this.tradingGrp = tradingGrp;
        this.lineExcTyp = lineExcTyp;
        this.discFlag = discFlag;
        this.discRate = discRate;
        this.vatRate = vatRate;
        this.arCloseAmount = arCloseAmount;
        this.discAccRef = discAccRef;
        this.discCentRef = discCentRef;
        this.vatrAccRef = vatrAccRef;
        this.vatrCentRef = vatrCentRef;
        this.paymentRef = paymentRef;
        this.bankProcType = bankProcType;
        this.bankProcCode = bankProcCode;
        this.transDueDate = checkDate(transDueDate);
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogicRef = orgLogicRef;
        this.opstat = opstat;
        this.infdix = infdix;
        this.eximFicheNo = eximFicheNo;
        this.bnTranVatInc = bnTranVatInc;
        this.bnTranVatRat = bnTranVatRat;
        this.bnTranVatAccRef = bnTranVatAccRef;
        this.bnTranVatCenRef = bnTranVatCenRef;
        this.bnTranVatTot = bnTranVatTot;
        this.cheqInfo = cheqInfo;
        this.eximInfoRef = eximInfoRef;
        this.eximInfoPar = eximInfoPar;
        this.excreRef = excreRef;
        this.crCardWzd = crCardWzd;
        this.comsType = comsType;
        this.proVisionRef = proVisionRef;
        this.tranGrpLineNo = tranGrpLineNo;
        this.projectRef = projectRef;
        this.tranGrpDate = checkDate(tranGrpDate);
        this.tranGrpNo = tranGrpNo;
        this.bankRefNr = bankRefNr;
        this.customDocNr = customDocNr;
        this.dabLnRef = dabLnRef;
        this.transRef = transRef;
        this.affectCollatRl = affectCollatRl;
        this.collatRollRef = collatRollRef;
        this.collatTrnRef = collatTrnRef;
        this.collatCardRef = collatCardRef;
        this.grpFirmTrans = grpFirmTrans;
        this.affectRisk = affectRisk;
        this.bnCrSource = bnCrSource;
        this.bnCrRef = bnCrRef;
        this.bnCrLnType = bnCrLnType;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public int getBankRef() {
        return bankRef;
    }

    public void setBankRef(int bankRef) {
        this.bankRef = bankRef;
    }

    public int getBnAccRef() {
        return bnAccRef;
    }

    public void setBnAccRef(int bnAccRef) {
        this.bnAccRef = bnAccRef;
    }

    public int getClientRef() {
        return clientRef;
    }

    public void setClientRef(int clientRef) {
        this.clientRef = clientRef;
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

    public int getBnAccountRef() {
        return bnAccountRef;
    }

    public void setBnAccountRef(int bnAccountRef) {
        this.bnAccountRef = bnAccountRef;
    }

    public int getBnCenterRef() {
        return bnCenterRef;
    }

    public void setBnCenterRef(int bnCenterRef) {
        this.bnCenterRef = bnCenterRef;
    }

    public int getVirmanRef() {
        return virmanRef;
    }

    public void setVirmanRef(int virmanRef) {
        this.virmanRef = virmanRef;
    }

    public int getSourceRef() {
        return sourceRef;
    }

    public void setSourceRef(int sourceRef) {
        this.sourceRef = sourceRef;
    }

    public Short getTransType() {
        return transType;
    }

    public void setTransType(Short transType) {
        this.transType = transType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = checkDate(date);
    }

    public Short getDepartment() {
        return department;
    }

    public void setDepartment(Short department) {
        this.department = department;
    }

    public Short getBranch() {
        return branch;
    }

    public void setBranch(Short branch) {
        this.branch = branch;
    }

    public Short getSign() {
        return sign;
    }

    public void setSign(Short sign) {
        this.sign = sign;
    }

    public Short getTrCode() {
        return trCode;
    }

    public void setTrCode(Short trCode) {
        this.trCode = trCode;
    }

    public Short getModuleNr() {
        return moduleNr;
    }

    public void setModuleNr(Short moduleNr) {
        this.moduleNr = moduleNr;
    }

    public Short getLineNr() {
        return lineNr;
    }

    public void setLineNr(Short lineNr) {
        this.lineNr = lineNr;
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

    public String getTranNo() {
        return tranNo;
    }

    public void setTranNo(String tranNo) {
        this.tranNo = tranNo;
    }

    public String getDoCode() {
        return doCode;
    }

    public void setDoCode(String doCode) {
        this.doCode = doCode;
    }

    public String getLineExp() {
        return lineExp;
    }

    public void setLineExp(String lineExp) {
        this.lineExp = lineExp;
    }

    public Short getAccounted() {
        return accounted;
    }

    public void setAccounted(Short accounted) {
        this.accounted = accounted;
    }

    public Short getTrCurr() {
        return trCurr;
    }

    public void setTrCurr(Short trCurr) {
        this.trCurr = trCurr;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getTrRate() {
        return trRate;
    }

    public void setTrRate(float trRate) {
        this.trRate = trRate;
    }

    public float getTrNet() {
        return trNet;
    }

    public void setTrNet(float trNet) {
        this.trNet = trNet;
    }

    public float getReportRate() {
        return reportRate;
    }

    public void setReportRate(float reportRate) {
        this.reportRate = reportRate;
    }

    public float getReportNet() {
        return reportNet;
    }

    public void setReportNet(float reportNet) {
        this.reportNet = reportNet;
    }

    public int getExtenRef() {
        return extenRef;
    }

    public void setExtenRef(int extenRef) {
        this.extenRef = extenRef;
    }

    public int getAccFicheRef() {
        return accFicheRef;
    }

    public void setAccFicheRef(int accFicheRef) {
        this.accFicheRef = accFicheRef;
    }

    public Short getPrintCnt() {
        return printCnt;
    }

    public void setPrintCnt(Short printCnt) {
        this.printCnt = printCnt;
    }

    public Short getCapiblockCreatedby() {
        return capiblockCreatedby;
    }

    public void setCapiblockCreatedby(Short capiblockCreatedby) {
        this.capiblockCreatedby = capiblockCreatedby;
    }

    public String getCapiblockCreadeddate() {
        return capiblockCreadeddate;
    }

    public void setCapiblockCreadeddate(String capiblockCreadeddate) {
        this.capiblockCreadeddate = capiblockCreadeddate;
    }

    public Short getCapiblockCreatedhour() {
        return capiblockCreatedhour;
    }

    public void setCapiblockCreatedhour(Short capiblockCreatedhour) {
        this.capiblockCreatedhour = capiblockCreatedhour;
    }

    public Short getCapiblockCreatedmin() {
        return capiblockCreatedmin;
    }

    public void setCapiblockCreatedmin(Short capiblockCreatedmin) {
        this.capiblockCreatedmin = capiblockCreatedmin;
    }

    public Short getCapiblockCreatedsec() {
        return capiblockCreatedsec;
    }

    public void setCapiblockCreatedsec(Short capiblockCreatedsec) {
        this.capiblockCreatedsec = capiblockCreatedsec;
    }

    public Short getCapiblockModifiedby() {
        return capiblockModifiedby;
    }

    public void setCapiblockModifiedby(Short capiblockModifiedby) {
        this.capiblockModifiedby = capiblockModifiedby;
    }

    public String getCapiblockModifieddate() {
        return capiblockModifieddate;
    }

    public void setCapiblockModifieddate(String capiblockModifieddate) {
        this.capiblockModifieddate = checkDate(capiblockModifieddate);
    }

    public Short getCapiblockModifiedhour() {
        return capiblockModifiedhour;
    }

    public void setCapiblockModifiedhour(Short capiblockModifiedhour) {
        this.capiblockModifiedhour = capiblockModifiedhour;
    }

    public Short getCapiblockModifiedmin() {
        return capiblockModifiedmin;
    }

    public void setCapiblockModifiedmin(Short capiblockModifiedmin) {
        this.capiblockModifiedmin = capiblockModifiedmin;
    }

    public Short getCapiblockModifiedsec() {
        return capiblockModifiedsec;
    }

    public void setCapiblockModifiedsec(Short capiblockModifiedsec) {
        this.capiblockModifiedsec = capiblockModifiedsec;
    }

    public Short getCancelled() {
        return cancelled;
    }

    public void setCancelled(Short cancelled) {
        this.cancelled = cancelled;
    }

    public String getClBnBranchNo() {
        return clBnBranchNo;
    }

    public void setClBnBranchNo(String clBnBranchNo) {
        this.clBnBranchNo = clBnBranchNo;
    }

    public String getClBnAccountNo() {
        return clBnAccountNo;
    }

    public void setClBnAccountNo(String clBnAccountNo) {
        this.clBnAccountNo = clBnAccountNo;
    }

    public String getBnTrackingNo() {
        return bnTrackingNo;
    }

    public void setBnTrackingNo(String bnTrackingNo) {
        this.bnTrackingNo = bnTrackingNo;
    }

    public Short getTrnState() {
        return trnState;
    }

    public void setTrnState(Short trnState) {
        this.trnState = trnState;
    }

    public String getTradingGrp() {
        return tradingGrp;
    }

    public void setTradingGrp(String tradingGrp) {
        this.tradingGrp = tradingGrp;
    }

    public Short getLineExcTyp() {
        return lineExcTyp;
    }

    public void setLineExcTyp(Short lineExcTyp) {
        this.lineExcTyp = lineExcTyp;
    }

    public Short getDiscFlag() {
        return discFlag;
    }

    public void setDiscFlag(Short discFlag) {
        this.discFlag = discFlag;
    }

    public float getDiscRate() {
        return discRate;
    }

    public void setDiscRate(float discRate) {
        this.discRate = discRate;
    }

    public float getVatRate() {
        return vatRate;
    }

    public void setVatRate(float vatRate) {
        this.vatRate = vatRate;
    }

    public float getArCloseAmount() {
        return arCloseAmount;
    }

    public void setArCloseAmount(float arCloseAmount) {
        this.arCloseAmount = arCloseAmount;
    }

    public int getDiscAccRef() {
        return discAccRef;
    }

    public void setDiscAccRef(int discAccRef) {
        this.discAccRef = discAccRef;
    }

    public int getDiscCentRef() {
        return discCentRef;
    }

    public void setDiscCentRef(int discCentRef) {
        this.discCentRef = discCentRef;
    }

    public int getVatrAccRef() {
        return vatrAccRef;
    }

    public void setVatrAccRef(int vatrAccRef) {
        this.vatrAccRef = vatrAccRef;
    }

    public int getVatrCentRef() {
        return vatrCentRef;
    }

    public void setVatrCentRef(int vatrCentRef) {
        this.vatrCentRef = vatrCentRef;
    }

    public int getPaymentRef() {
        return paymentRef;
    }

    public void setPaymentRef(int paymentRef) {
        this.paymentRef = paymentRef;
    }

    public Short getBankProcType() {
        return bankProcType;
    }

    public void setBankProcType(Short bankProcType) {
        this.bankProcType = bankProcType;
    }

    public Short getBankProcCode() {
        return bankProcCode;
    }

    public void setBankProcCode(Short bankProcCode) {
        this.bankProcCode = bankProcCode;
    }

    public String getTransDueDate() {
        return transDueDate;
    }

    public void setTransDueDate(String transDueDate) {
        this.transDueDate = checkDate(transDueDate);
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

    public Short getOpstat() {
        return opstat;
    }

    public void setOpstat(Short opstat) {
        this.opstat = opstat;
    }

    public float getInfdix() {
        return infdix;
    }

    public void setInfdix(float infdix) {
        this.infdix = infdix;
    }

    public String getEximFicheNo() {
        return eximFicheNo;
    }

    public void setEximFicheNo(String eximFicheNo) {
        this.eximFicheNo = eximFicheNo;
    }

    public Short getBnTranVatInc() {
        return bnTranVatInc;
    }

    public void setBnTranVatInc(Short bnTranVatInc) {
        this.bnTranVatInc = bnTranVatInc;
    }

    public float getBnTranVatRat() {
        return bnTranVatRat;
    }

    public void setBnTranVatRat(float bnTranVatRat) {
        this.bnTranVatRat = bnTranVatRat;
    }

    public int getBnTranVatAccRef() {
        return bnTranVatAccRef;
    }

    public void setBnTranVatAccRef(int bnTranVatAccRef) {
        this.bnTranVatAccRef = bnTranVatAccRef;
    }

    public int getBnTranVatCenRef() {
        return bnTranVatCenRef;
    }

    public void setBnTranVatCenRef(int bnTranVatCenRef) {
        this.bnTranVatCenRef = bnTranVatCenRef;
    }

    public float getBnTranVatTot() {
        return bnTranVatTot;
    }

    public void setBnTranVatTot(float bnTranVatTot) {
        this.bnTranVatTot = bnTranVatTot;
    }

    public String getCheqInfo() {
        return cheqInfo;
    }

    public void setCheqInfo(String cheqInfo) {
        this.cheqInfo = cheqInfo;
    }

    public int getEximInfoRef() {
        return eximInfoRef;
    }

    public void setEximInfoRef(int eximInfoRef) {
        this.eximInfoRef = eximInfoRef;
    }

    public float getEximInfoPar() {
        return eximInfoPar;
    }

    public void setEximInfoPar(float eximInfoPar) {
        this.eximInfoPar = eximInfoPar;
    }

    public int getExcreRef() {
        return excreRef;
    }

    public void setExcreRef(int excreRef) {
        this.excreRef = excreRef;
    }

    public Short getCrCardWzd() {
        return crCardWzd;
    }

    public void setCrCardWzd(Short crCardWzd) {
        this.crCardWzd = crCardWzd;
    }

    public Short getComsType() {
        return comsType;
    }

    public void setComsType(Short comsType) {
        this.comsType = comsType;
    }

    public int getProVisionRef() {
        return proVisionRef;
    }

    public void setProVisionRef(int proVisionRef) {
        this.proVisionRef = proVisionRef;
    }

    public Short getTranGrpLineNo() {
        return tranGrpLineNo;
    }

    public void setTranGrpLineNo(Short tranGrpLineNo) {
        this.tranGrpLineNo = tranGrpLineNo;
    }

    public int getProjectRef() {
        return projectRef;
    }

    public void setProjectRef(int projectRef) {
        this.projectRef = projectRef;
    }

    public String getTranGrpDate() {
        return tranGrpDate;
    }

    public void setTranGrpDate(String tranGrpDate) {
        this.tranGrpDate = checkDate(tranGrpDate);
    }

    public String getTranGrpNo() {
        return tranGrpNo;
    }

    public void setTranGrpNo(String tranGrpNo) {
        this.tranGrpNo = tranGrpNo;
    }

    public String getBankRefNr() {
        return bankRefNr;
    }

    public void setBankRefNr(String bankRefNr) {
        this.bankRefNr = bankRefNr;
    }

    public String getCustomDocNr() {
        return customDocNr;
    }

    public void setCustomDocNr(String customDocNr) {
        this.customDocNr = customDocNr;
    }

    public int getDabLnRef() {
        return dabLnRef;
    }

    public void setDabLnRef(int dabLnRef) {
        this.dabLnRef = dabLnRef;
    }

    public int getTransRef() {
        return transRef;
    }

    public void setTransRef(int transRef) {
        this.transRef = transRef;
    }

    public Short getAffectCollatRl() {
        return affectCollatRl;
    }

    public void setAffectCollatRl(Short affectCollatRl) {
        this.affectCollatRl = affectCollatRl;
    }

    public int getCollatRollRef() {
        return collatRollRef;
    }

    public void setCollatRollRef(int collatRollRef) {
        this.collatRollRef = collatRollRef;
    }

    public int getCollatTrnRef() {
        return collatTrnRef;
    }

    public void setCollatTrnRef(int collatTrnRef) {
        this.collatTrnRef = collatTrnRef;
    }

    public int getCollatCardRef() {
        return collatCardRef;
    }

    public void setCollatCardRef(int collatCardRef) {
        this.collatCardRef = collatCardRef;
    }

    public Short getGrpFirmTrans() {
        return grpFirmTrans;
    }

    public void setGrpFirmTrans(Short grpFirmTrans) {
        this.grpFirmTrans = grpFirmTrans;
    }

    public Short getAffectRisk() {
        return affectRisk;
    }

    public void setAffectRisk(Short affectRisk) {
        this.affectRisk = affectRisk;
    }

    public Short getBnCrSource() {
        return bnCrSource;
    }

    public void setBnCrSource(Short bnCrSource) {
        this.bnCrSource = bnCrSource;
    }

    public int getBnCrRef() {
        return bnCrRef;
    }

    public void setBnCrRef(int bnCrRef) {
        this.bnCrRef = bnCrRef;
    }

    public Short getBnCrLnType() {
        return bnCrLnType;
    }

    public void setBnCrLnType(Short bnCrLnType) {
        this.bnCrLnType = bnCrLnType;
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

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
public class PrcList implements java.io.Serializable{
    private int logicalRef;
    private int cardRef;
    private String clientCode;
    private String clSpecode;
    private int payPlanRef;
    private Double price;
    private int uomRef;
    private Short incVat;
    private Short currency;
    private Short priority;
    private Short pType;
    private Short mtrlType;
    private int leadTime;
    private String begDate;//date format
    private String endDate;//date format
    private String condition;
    private String shiptyp;
    private Short specialized;
    private Short capiblockCreatedby;
    private String capiblockCreadeddate;//date format
    private Short capiblockCreatedhour;
    private Short capiblockCreatedmin;
    private Short capiblockCreatedsec;
    private Short capiblockModifiedby;
    private String capiblockModifieddate;//date format
    private Short capiblockModifiedhour;
    private Short capiblockModifiedmin;
    private Short capiblockModifiedsec;
    private Short siteId;
    private Short recStatus;
    private int orgLogicRef;
    private int wfSatus;
    private Short unitConvert;
    private int extAccessFlags;
    private String cyphCode;
    private String orgLogoId;
    private String trdaingGrp;
    private int begTime;
    private int endTime;
    private String definition;
    private String code;
    private String grpCode;
    private Short orderNr;
    private String geniusPayType;
    private int geniusshpNr;
    private Short prcaltertyp1;
    private Double prcalterlmt1;
    private Short prcaltertyp2;
    private Double prcalterlmt2;
    private Short prcaltertyp3;
    private Double prcalterlmt3;
    private Short active;
    private int purchContRef;
    private Short branch;
    
    public PrcList(int logicalRef){
        this.logicalRef = logicalRef;
    }

    public PrcList(int logicalRef, int cardRef, String clientCode, String clSpecode, 
            int payPlanRef, Double price, int uomRef, Short incVat, Short currency, 
            Short priority, Short pType, Short mtrlType, int leadTime, String begDate, 
            String endDate, String condition, String shiptyp, Short specialized, 
            Short capiblockCreatedby, String capiblockCreadeddate, Short capiblockCreatedhour, 
            Short capiblockCreatedmin, Short capiblockCreatedsec, Short capiblockModifiedby, 
            String capiblockModifieddate, Short capiblockModifiedhour, Short capiblockModifiedmin, 
            Short capiblockModifiedsec, Short siteId, Short recStatus, int orgLogicRef, 
            int wfSatus, Short unitConvert, int extAccessFlags, String cyphCode, 
            String orgLogoId, String trdaingGrp, int begTime, int endTime, String definition, 
            String code, String grpCode, Short orderNr, String geniusPayType, int geniusshpNr, 
            Short prcaltertyp1, Double prcalterlmt1, Short prcaltertyp2, Double prcalterlmt2, 
            Short prcaltertyp3, Double prcalterlmt3, Short active, int purchContRef, 
            Short branch) {
        this.logicalRef = logicalRef;
        this.cardRef = cardRef;
        this.clientCode = clientCode;
        this.clSpecode = clSpecode;
        this.payPlanRef = payPlanRef;
        this.price = price;
        this.uomRef = uomRef;
        this.incVat = incVat;
        this.currency = currency;
        this.priority = priority;
        this.pType = pType;
        this.mtrlType = mtrlType;
        this.leadTime = leadTime;
        this.begDate = begDate;
        this.endDate = endDate;
        this.condition = condition;
        this.shiptyp = shiptyp;
        this.specialized = specialized;
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
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogicRef = orgLogicRef;
        this.wfSatus = wfSatus;
        this.unitConvert = unitConvert;
        this.extAccessFlags = extAccessFlags;
        this.cyphCode = cyphCode;
        this.orgLogoId = orgLogoId;
        this.trdaingGrp = trdaingGrp;
        this.begTime = begTime;
        this.endTime = endTime;
        this.definition = definition;
        this.code = code;
        this.grpCode = grpCode;
        this.orderNr = orderNr;
        this.geniusPayType = geniusPayType;
        this.geniusshpNr = geniusshpNr;  //logical ref
        this.prcaltertyp1 = prcaltertyp1;
        this.prcalterlmt1 = prcalterlmt1;
        this.prcaltertyp2 = prcaltertyp2;
        this.prcalterlmt2 = prcalterlmt2;
        this.prcaltertyp3 = prcaltertyp3;
        this.prcalterlmt3 = prcalterlmt3;
        this.active = active;
        this.purchContRef = purchContRef;
        this.branch = branch;
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

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getClSpecode() {
        return clSpecode;
    }

    public void setClSpecode(String clSpecode) {
        this.clSpecode = clSpecode;
    }

    public int getPayPlanRef() {
        return payPlanRef;
    }

    public void setPayPlanRef(int payPlanRef) {
        this.payPlanRef = payPlanRef;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getUomRef() {
        return uomRef;
    }

    public void setUomRef(int uomRef) {
        this.uomRef = uomRef;
    }

    public Short getIncVat() {
        return incVat;
    }

    public void setIncVat(Short incVat) {
        this.incVat = incVat;
    }

    public Short getCurrency() {
        return currency;
    }

    public void setCurrency(Short currency) {
        this.currency = currency;
    }

    public Short getPriority() {
        return priority;
    }

    public void setPriority(Short priority) {
        this.priority = priority;
    }

    public Short getpType() {
        return pType;
    }

    public void setpType(Short pType) {
        this.pType = pType;
    }

    public Short getMtrlType() {
        return mtrlType;
    }

    public void setMtrlType(Short mtrlType) {
        this.mtrlType = mtrlType;
    }

    public int getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(int leadTime) {
        this.leadTime = leadTime;
    }

    public String getBegDate() {
        return begDate;
    }

    public void setBegDate(String begDate) {
        this.begDate = checkDate(begDate);
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = checkDate(endDate);
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getShiptyp() {
        return shiptyp;
    }

    public void setShiptyp(String shiptyp) {
        this.shiptyp = shiptyp;
    }

    public Short getSpecialized() {
        return specialized;
    }

    public void setSpecialized(Short specialized) {
        this.specialized = specialized;
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

    public int getWfSatus() {
        return wfSatus;
    }

    public void setWfSatus(int wfSatus) {
        this.wfSatus = wfSatus;
    }

    public Short getUnitConvert() {
        return unitConvert;
    }

    public void setUnitConvert(Short unitConvert) {
        this.unitConvert = unitConvert;
    }

    public int getExtAccessFlags() {
        return extAccessFlags;
    }

    public void setExtAccessFlags(int extAccessFlags) {
        this.extAccessFlags = extAccessFlags;
    }

    public String getCyphCode() {
        return cyphCode;
    }

    public void setCyphCode(String cyphCode) {
        this.cyphCode = cyphCode;
    }

    public String getOrgLogoId() {
        return orgLogoId;
    }

    public void setOrgLogoId(String orgLogoId) {
        this.orgLogoId = orgLogoId;
    }

    public String getTrdaingGrp() {
        return trdaingGrp;
    }

    public void setTrdaingGrp(String trdaingGrp) {
        this.trdaingGrp = trdaingGrp;
    }

    public int getBegTime() {
        return begTime;
    }

    public void setBegTime(int begTime) {
        this.begTime = begTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGrpCode() {
        return grpCode;
    }

    public void setGrpCode(String grpCode) {
        this.grpCode = grpCode;
    }

    public Short getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(Short orderNr) {
        this.orderNr = orderNr;
    }

    public String getGeniusPayType() {
        return geniusPayType;
    }

    public void setGeniusPayType(String geniusPayType) {
        this.geniusPayType = geniusPayType;
    }

    public int getGeniusshpNr() {
        return geniusshpNr;
    }

    public void setGeniusshpNr(int geniusshpNr) {
        this.geniusshpNr = geniusshpNr;
    }

    public Short getPrcaltertyp1() {
        return prcaltertyp1;
    }

    public void setPrcaltertyp1(Short prcaltertyp1) {
        this.prcaltertyp1 = prcaltertyp1;
    }

    public Double getPrcalterlmt1() {
        return prcalterlmt1;
    }

    public void setPrcalterlmt1(Double prcalterlmt1) {
        this.prcalterlmt1 = prcalterlmt1;
    }

    public Short getPrcaltertyp2() {
        return prcaltertyp2;
    }

    public void setPrcaltertyp2(Short prcaltertyp2) {
        this.prcaltertyp2 = prcaltertyp2;
    }

    public Double getPrcalterlmt2() {
        return prcalterlmt2;
    }

    public void setPrcalterlmt2(Double prcalterlmt2) {
        this.prcalterlmt2 = prcalterlmt2;
    }

    public Short getPrcaltertyp3() {
        return prcaltertyp3;
    }

    public void setPrcaltertyp3(Short prcaltertyp3) {
        this.prcaltertyp3 = prcaltertyp3;
    }

    public Double getPrcalterlmt3() {
        return prcalterlmt3;
    }

    public void setPrcalterlmt3(Double prcalterlmt3) {
        this.prcalterlmt3 = prcalterlmt3;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public int getPurchContRef() {
        return purchContRef;
    }

    public void setPurchContRef(int purchContRef) {
        this.purchContRef = purchContRef;
    }

    public Short getBranch() {
        return branch;
    }

    public void setBranch(Short branch) {
        this.branch = branch;
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

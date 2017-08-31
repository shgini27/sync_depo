/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.model;

import java.io.Serializable;

/**
 *
 * @author Shagy
 */
public class UnitSetF implements Serializable{
    private int logicalref;
     private String code;
     private String name;
     private Short cardtype;
     private Short specitem;
     private String specode;
     private String cyphcode;
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
     private Short siteid;
     private Short recstatus;
     private Integer orglogicref;
     private Integer wfstatus;
     
    public UnitSetF(int logicalref) {
        this.logicalref = logicalref;
    }
    
    public UnitSetF(int logicalref, String specode) {
        this.logicalref = logicalref;
        this.specode = specode;
    }
    
    public UnitSetF(int logicalref, String code, String name, Short cardtype, 
            Short specitem, String specode, String cyphcode, Short capiblockCreatedby, 
            String capiblockCreadeddate, Short capiblockCreatedhour, Short capiblockCreatedmin, 
            Short capiblockCreatedsec, Short capiblockModifiedby, String capiblockModifieddate, 
            Short capiblockModifiedhour, Short capiblockModifiedmin, Short capiblockModifiedsec, 
            Short siteid, Short recstatus, Integer orglogicref, Integer wfstatus) {
       this.logicalref = logicalref;
       this.code = code;
       this.name = name;
       this.cardtype = cardtype;
       this.specitem = specitem;
       this.specode = specode;//set logical ref
       this.cyphcode = cyphcode;
       this.capiblockCreatedby = capiblockCreatedby;
       this.capiblockCreadeddate = capiblockCreadeddate;
       this.capiblockCreatedhour = capiblockCreatedhour;
       this.capiblockCreatedmin = capiblockCreatedmin;
       this.capiblockCreatedsec = capiblockCreatedsec;
       this.capiblockModifiedby = capiblockModifiedby;
       this.capiblockModifieddate = checkDate(capiblockCreadeddate);
       this.capiblockModifiedhour = capiblockModifiedhour;
       this.capiblockModifiedmin = capiblockModifiedmin;
       this.capiblockModifiedsec = capiblockModifiedsec;
       this.siteid = siteid;
       this.recstatus = recstatus;
       this.orglogicref = orglogicref;
       this.wfstatus = wfstatus;
    }
   
    public int getLogicalref() {
        return this.logicalref;
    }
    
    public void setLogicalref(int logicalref) {
        this.logicalref = logicalref;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Short getCardtype() {
        return this.cardtype;
    }
    
    public void setCardtype(Short cardtype) {
        this.cardtype = cardtype;
    }
    public Short getSpecitem() {
        return this.specitem;
    }
    
    public void setSpecitem(Short specitem) {
        this.specitem = specitem;
    }
    public String getSpecode() {
        return this.specode;
    }
    
    public void setSpecode(String specode) {
        this.specode = specode;
    }
    public String getCyphcode() {
        return this.cyphcode;
    }
    
    public void setCyphcode(String cyphcode) {
        this.cyphcode = cyphcode;
    }
    public Short getCapiblockCreatedby() {
        return this.capiblockCreatedby;
    }
    
    public void setCapiblockCreatedby(Short capiblockCreatedby) {
        this.capiblockCreatedby = capiblockCreatedby;
    }
    public String getCapiblockCreadeddate() {
        return this.capiblockCreadeddate;
    }
    
    public void setCapiblockCreadeddate(String capiblockCreadeddate) {
        this.capiblockCreadeddate = capiblockCreadeddate;
    }
    public Short getCapiblockCreatedhour() {
        return this.capiblockCreatedhour;
    }
    
    public void setCapiblockCreatedhour(Short capiblockCreatedhour) {
        this.capiblockCreatedhour = capiblockCreatedhour;
    }
    public Short getCapiblockCreatedmin() {
        return this.capiblockCreatedmin;
    }
    
    public void setCapiblockCreatedmin(Short capiblockCreatedmin) {
        this.capiblockCreatedmin = capiblockCreatedmin;
    }
    public Short getCapiblockCreatedsec() {
        return this.capiblockCreatedsec;
    }
    
    public void setCapiblockCreatedsec(Short capiblockCreatedsec) {
        this.capiblockCreatedsec = capiblockCreatedsec;
    }
    public Short getCapiblockModifiedby() {
        return this.capiblockModifiedby;
    }
    
    public void setCapiblockModifiedby(Short capiblockModifiedby) {
        this.capiblockModifiedby = capiblockModifiedby;
    }
    public String getCapiblockModifieddate() {
        return this.capiblockModifieddate;
    }
    
    public void setCapiblockModifieddate(String capiblockModifieddate) {
        this.capiblockModifieddate = checkDate(capiblockModifieddate);
    }
    public Short getCapiblockModifiedhour() {
        return this.capiblockModifiedhour;
    }
    
    public void setCapiblockModifiedhour(Short capiblockModifiedhour) {
        this.capiblockModifiedhour = capiblockModifiedhour;
    }
    public Short getCapiblockModifiedmin() {
        return this.capiblockModifiedmin;
    }
    
    public void setCapiblockModifiedmin(Short capiblockModifiedmin) {
        this.capiblockModifiedmin = capiblockModifiedmin;
    }
    public Short getCapiblockModifiedsec() {
        return this.capiblockModifiedsec;
    }
    
    public void setCapiblockModifiedsec(Short capiblockModifiedsec) {
        this.capiblockModifiedsec = capiblockModifiedsec;
    }
    public Short getSiteid() {
        return this.siteid;
    }
    
    public void setSiteid(Short siteid) {
        this.siteid = siteid;
    }
    public Short getRecstatus() {
        return this.recstatus;
    }
    
    public void setRecstatus(Short recstatus) {
        this.recstatus = recstatus;
    }
    public Integer getOrglogicref() {
        return this.orglogicref;
    }
    
    public void setOrglogicref(Integer orglogicref) {
        this.orglogicref = orglogicref;
    }
    public Integer getWfstatus() {
        return this.wfstatus;
    }
    
    public void setWfstatus(Integer wfstatus) {
        this.wfstatus = wfstatus;
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

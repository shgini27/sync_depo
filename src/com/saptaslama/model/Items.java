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
public class Items implements Serializable{
    private int logicalref;
     private Short active;
     private Short cardtype;
     private String code;
     private String name;
     private String stgrpcode;
     private String producercode;
     private String specode;
     private String cyphcode;
     private Short classtype;
     private Short purchbrws;
     private Short salesbrws;
     private Short mtrlbrws;
     private Double vat;
     private Integer paymentref;
     private Short tracktype;
     private Short loctracking;
     private Short tool;
     private Short autoincsl;
     private Short divlotsize;
     private Double shelflife;
     private Short shelfdate;
     private Integer dominantrefs1;
     private Integer dominantrefs2;
     private Integer dominantrefs3;
     private Integer dominantrefs4;
     private Integer dominantrefs5;
     private Integer dominantrefs6;
     private Integer dominantrefs7;
     private Integer dominantrefs8;
     private Integer dominantrefs9;
     private Integer dominantrefs10;
     private Integer dominantrefs11;
     private Integer dominantrefs12;
     private Short imageinc;
     private Short textinc;
     private Short deprtype;
     private Double deprrate;
     private Short deprdur;
     private Double salvageval;
     private Short revalflag;
     private Short revdeprflag;
     private Short partdep;
     private Short deprtype2;
     private Double deprrate2;
     private Short deprdur2;
     private Short revalflag2;
     private Short revdeprflag2;
     private Short partdep2;
     private Short approved;
     private Integer unitsetref;
     private Integer qccsetref;
     private Double distamount;
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
     private String univid;
     private Short distlotunits;
     private Short comblotunits;
     private Integer wfstatus;
     private Double distpoint;
     private Double camppoint;
     private Short canuseintrns;
     private String isonr;             //isoNo
     private String groupnr;
     private String prodcountry;
     private Integer addtaxref;
     private Double qprodamnt;
     private Integer qproduom;
     private Short qprodsrcindex;
     private Integer extaccessflags;
     private Short packet;
     private Double salvageval2;
     private Double sellvat;
     private Double returnvat;
     private String logoid;
     private Short lidconfirmed;
     private String gtipcode;
     private String expctgno;
     private String b2ccode;
     private Integer markref;
     private Short image2inc;
     private Double avrwhduration;
     private Integer extcardflags;
     private Double minordamount;
     private String freightplace;
     private String freighttypcode1;
     private String freighttypcode2;
     private String freighttypcode3;
     private String freighttypcode4;
     private String freighttypcode5;
     private String freighttypcode6;
     private String freighttypcode7;
     private String freighttypcode8;
     private String freighttypcode9;
     private String freighttypcode10;
     private String statecode;
     private String statename;
     private String expcategory;
     private Double lostfactor;
     private Short textinceng;
     private String eanbarcode;
     private String deprclasstype;
     private Integer wflowcrdref;
     private Double sellprvat;
     private Double returnprvat;
     private Integer lowlevelcodes1;
     private Integer lowlevelcodes2;
     private Integer lowlevelcodes3;
     private Integer lowlevelcodes4;
     private Integer lowlevelcodes5;
     private Integer lowlevelcodes6;
     private Integer lowlevelcodes7;
     private Integer lowlevelcodes8;
     private Integer lowlevelcodes9;
     private Integer lowlevelcodes10;
     private String orglogoid;
     private Short qproddepart;
     private Short canconfigure;
     private Integer charsetref;
     private Short candeduct;
     private Integer conscoderef;
     private String specode2;
     private String specode3;
     private String specode4;
     private String specode5;
     private Short expense;
	
    public Items(int logicalref) {
        this.logicalref = logicalref;
    }
    
    public Items(int logicalref, String isonr) {
        this.logicalref = logicalref;
        this.isonr = isonr;
    }
    
    public Items(int logicalref, Short active, Short cardtype, String code,
            String name, String stgrpcode, String producercode, String specode, 
            String cyphcode, Short classtype, Short purchbrws, Short salesbrws, 
            Short mtrlbrws, Double vat, Integer paymentref, Short tracktype, 
            Short loctracking, Short tool, Short autoincsl, Short divlotsize, 
            Double shelflife, Short shelfdate, Integer dominantrefs1, Integer dominantrefs2, 
            Integer dominantrefs3, Integer dominantrefs4, Integer dominantrefs5, 
            Integer dominantrefs6, Integer dominantrefs7, Integer dominantrefs8, 
            Integer dominantrefs9, Integer dominantrefs10, Integer dominantrefs11, 
            Integer dominantrefs12, Short imageinc, Short textinc, Short deprtype, 
            Double deprrate, Short deprdur, Double salvageval, Short revalflag, 
            Short revdeprflag, Short partdep, Short deprtype2, Double deprrate2, 
            Short deprdur2, Short revalflag2, Short revdeprflag2, Short partdep2, 
            Short approved, Integer unitsetref, Integer qccsetref, Double distamount, 
            Short capiblockCreatedby, String capiblockCreadeddate, Short capiblockCreatedhour, 
            Short capiblockCreatedmin, Short capiblockCreatedsec, Short capiblockModifiedby, 
            String capiblockModifieddate, Short capiblockModifiedhour, Short capiblockModifiedmin, 
            Short capiblockModifiedsec, Short siteid, Short recstatus, Integer orglogicref, 
            String univid, Short distlotunits, Short comblotunits, Integer wfstatus, 
            Double distpoint, Double camppoint, Short canuseintrns, String isonr, 
            String groupnr, String prodcountry, Integer addtaxref, Double qprodamnt, 
            Integer qproduom, Short qprodsrcindex, Integer extaccessflags, Short packet, 
            Double salvageval2, Double sellvat, Double returnvat, String logoid, 
            Short lidconfirmed, String gtipcode, String expctgno, String b2ccode, 
            Integer markref, Short image2inc, Double avrwhduration, Integer extcardflags, 
            Double minordamount, String freightplace, String freighttypcode1, String freighttypcode2, 
            String freighttypcode3, String freighttypcode4, String freighttypcode5, 
            String freighttypcode6, String freighttypcode7, String freighttypcode8, 
            String freighttypcode9, String freighttypcode10, String statecode, 
            String statename, String expcategory, Double lostfactor, Short textinceng, 
            String eanbarcode, String deprclasstype, Integer wflowcrdref, Double sellprvat, 
            Double returnprvat, Integer lowlevelcodes1, Integer lowlevelcodes2, 
            Integer lowlevelcodes3, Integer lowlevelcodes4, Integer lowlevelcodes5, 
            Integer lowlevelcodes6, Integer lowlevelcodes7, Integer lowlevelcodes8, 
            Integer lowlevelcodes9, Integer lowlevelcodes10, String orglogoid, 
            Short qproddepart, Short canconfigure, Integer charsetref, Short candeduct, 
            Integer conscoderef, String specode2, String specode3, String specode4, 
            String specode5, Short expense) {
        
       this.logicalref = logicalref;
       this.active = active;
       this.cardtype = cardtype;
       this.code = code;
       this.name = name;
       this.stgrpcode = stgrpcode;
       this.producercode = producercode;
       this.specode = specode;
       this.cyphcode = cyphcode;
       this.classtype = classtype;
       this.purchbrws = purchbrws;
       this.salesbrws = salesbrws;
       this.mtrlbrws = mtrlbrws;
       this.vat = vat;
       this.paymentref = paymentref;
       this.tracktype = tracktype;
       this.loctracking = loctracking;
       this.tool = tool;
       this.autoincsl = autoincsl;
       this.divlotsize = divlotsize;
       this.shelflife = shelflife;
       this.shelfdate = shelfdate;
       this.dominantrefs1 = dominantrefs1;
       this.dominantrefs2 = dominantrefs2;
       this.dominantrefs3 = dominantrefs3;
       this.dominantrefs4 = dominantrefs4;
       this.dominantrefs5 = dominantrefs5;
       this.dominantrefs6 = dominantrefs6;
       this.dominantrefs7 = dominantrefs7;
       this.dominantrefs8 = dominantrefs8;
       this.dominantrefs9 = dominantrefs9;
       this.dominantrefs10 = dominantrefs10;
       this.dominantrefs11 = dominantrefs11;
       this.dominantrefs12 = dominantrefs12;
       this.imageinc = imageinc;
       this.textinc = textinc;
       this.deprtype = deprtype;
       this.deprrate = deprrate;
       this.deprdur = deprdur;
       this.salvageval = salvageval;
       this.revalflag = revalflag;
       this.revdeprflag = revdeprflag;
       this.partdep = partdep;
       this.deprtype2 = deprtype2;
       this.deprrate2 = deprrate2;
       this.deprdur2 = deprdur2;
       this.revalflag2 = revalflag2;
       this.revdeprflag2 = revdeprflag2;
       this.partdep2 = partdep2;
       this.approved = approved;
       this.unitsetref = unitsetref;
       this.qccsetref = qccsetref;
       this.distamount = distamount;
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
       this.siteid = siteid;
       this.recstatus = recstatus;
       this.orglogicref = orglogicref;
       this.univid = univid;
       this.distlotunits = distlotunits;
       this.comblotunits = comblotunits;
       this.wfstatus = wfstatus;
       this.distpoint = distpoint;
       this.camppoint = camppoint;
       this.canuseintrns = canuseintrns;
       this.isonr = isonr;                //isoNo
       this.groupnr = groupnr;
       this.prodcountry = prodcountry;
       this.addtaxref = addtaxref;
       this.qprodamnt = qprodamnt;
       this.qproduom = qproduom;
       this.qprodsrcindex = qprodsrcindex;
       this.extaccessflags = extaccessflags;
       this.packet = packet;
       this.salvageval2 = salvageval2;
       this.sellvat = sellvat;
       this.returnvat = returnvat;
       this.logoid = logoid;
       this.lidconfirmed = lidconfirmed;
       this.gtipcode = gtipcode;
       this.expctgno = expctgno;
       this.b2ccode = b2ccode;
       this.markref = markref;
       this.image2inc = image2inc;
       this.avrwhduration = avrwhduration;
       this.extcardflags = extcardflags;
       this.minordamount = minordamount;
       this.freightplace = freightplace;
       this.freighttypcode1 = freighttypcode1;
       this.freighttypcode2 = freighttypcode2;
       this.freighttypcode3 = freighttypcode3;
       this.freighttypcode4 = freighttypcode4;
       this.freighttypcode5 = freighttypcode5;
       this.freighttypcode6 = freighttypcode6;
       this.freighttypcode7 = freighttypcode7;
       this.freighttypcode8 = freighttypcode8;
       this.freighttypcode9 = freighttypcode9;
       this.freighttypcode10 = freighttypcode10;
       this.statecode = statecode;
       this.statename = statename;
       this.expcategory = expcategory;
       this.lostfactor = lostfactor;
       this.textinceng = textinceng;
       this.eanbarcode = eanbarcode;
       this.deprclasstype = deprclasstype;
       this.wflowcrdref = wflowcrdref;
       this.sellprvat = sellprvat;
       this.returnprvat = returnprvat;
       this.lowlevelcodes1 = lowlevelcodes1;
       this.lowlevelcodes2 = lowlevelcodes2;
       this.lowlevelcodes3 = lowlevelcodes3;
       this.lowlevelcodes4 = lowlevelcodes4;
       this.lowlevelcodes5 = lowlevelcodes5;
       this.lowlevelcodes6 = lowlevelcodes6;
       this.lowlevelcodes7 = lowlevelcodes7;
       this.lowlevelcodes8 = lowlevelcodes8;
       this.lowlevelcodes9 = lowlevelcodes9;
       this.lowlevelcodes10 = lowlevelcodes10;
       this.orglogoid = orglogoid;
       this.qproddepart = qproddepart;
       this.canconfigure = canconfigure;
       this.charsetref = charsetref;
       this.candeduct = candeduct;
       this.conscoderef = conscoderef;
       this.specode2 = specode2;
       this.specode3 = specode3;
       this.specode4 = specode4;
       this.specode5 = specode5;
       this.expense = expense;
    }
   
    public int getLogicalref() {
        return this.logicalref;
    }
    
    public void setLogicalref(int logicalref) {
        this.logicalref = logicalref;
    }
    public Short getActive() {
        return this.active;
    }
    
    public void setActive(Short active) {
        this.active = active;
    }
    public Short getCardtype() {
        return this.cardtype;
    }
    
    public void setCardtype(Short cardtype) {
        this.cardtype = cardtype;
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
    public String getStgrpcode() {
        return this.stgrpcode;
    }
    
    public void setStgrpcode(String stgrpcode) {
        this.stgrpcode = stgrpcode;
    }
    public String getProducercode() {
        return this.producercode;
    }
    
    public void setProducercode(String producercode) {
        this.producercode = producercode;
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
    public Short getClasstype() {
        return this.classtype;
    }
    
    public void setClasstype(Short classtype) {
        this.classtype = classtype;
    }
    public Short getPurchbrws() {
        return this.purchbrws;
    }
    
    public void setPurchbrws(Short purchbrws) {
        this.purchbrws = purchbrws;
    }
    public Short getSalesbrws() {
        return this.salesbrws;
    }
    
    public void setSalesbrws(Short salesbrws) {
        this.salesbrws = salesbrws;
    }
    public Short getMtrlbrws() {
        return this.mtrlbrws;
    }
    
    public void setMtrlbrws(Short mtrlbrws) {
        this.mtrlbrws = mtrlbrws;
    }
    public Double getVat() {
        return this.vat;
    }
    
    public void setVat(Double vat) {
        this.vat = vat;
    }
    public Integer getPaymentref() {
        return this.paymentref;
    }
    
    public void setPaymentref(Integer paymentref) {
        this.paymentref = paymentref;
    }
    public Short getTracktype() {
        return this.tracktype;
    }
    
    public void setTracktype(Short tracktype) {
        this.tracktype = tracktype;
    }
    public Short getLoctracking() {
        return this.loctracking;
    }
    
    public void setLoctracking(Short loctracking) {
        this.loctracking = loctracking;
    }
    public Short getTool() {
        return this.tool;
    }
    
    public void setTool(Short tool) {
        this.tool = tool;
    }
    public Short getAutoincsl() {
        return this.autoincsl;
    }
    
    public void setAutoincsl(Short autoincsl) {
        this.autoincsl = autoincsl;
    }
    public Short getDivlotsize() {
        return this.divlotsize;
    }
    
    public void setDivlotsize(Short divlotsize) {
        this.divlotsize = divlotsize;
    }
    public Double getShelflife() {
        return this.shelflife;
    }
    
    public void setShelflife(Double shelflife) {
        this.shelflife = shelflife;
    }
    public Short getShelfdate() {
        return this.shelfdate;
    }
    
    public void setShelfdate(Short shelfdate) {
        this.shelfdate = shelfdate;
    }
    public Integer getDominantrefs1() {
        return this.dominantrefs1;
    }
    
    public void setDominantrefs1(Integer dominantrefs1) {
        this.dominantrefs1 = dominantrefs1;
    }
    public Integer getDominantrefs2() {
        return this.dominantrefs2;
    }
    
    public void setDominantrefs2(Integer dominantrefs2) {
        this.dominantrefs2 = dominantrefs2;
    }
    public Integer getDominantrefs3() {
        return this.dominantrefs3;
    }
    
    public void setDominantrefs3(Integer dominantrefs3) {
        this.dominantrefs3 = dominantrefs3;
    }
    public Integer getDominantrefs4() {
        return this.dominantrefs4;
    }
    
    public void setDominantrefs4(Integer dominantrefs4) {
        this.dominantrefs4 = dominantrefs4;
    }
    public Integer getDominantrefs5() {
        return this.dominantrefs5;
    }
    
    public void setDominantrefs5(Integer dominantrefs5) {
        this.dominantrefs5 = dominantrefs5;
    }
    public Integer getDominantrefs6() {
        return this.dominantrefs6;
    }
    
    public void setDominantrefs6(Integer dominantrefs6) {
        this.dominantrefs6 = dominantrefs6;
    }
    public Integer getDominantrefs7() {
        return this.dominantrefs7;
    }
    
    public void setDominantrefs7(Integer dominantrefs7) {
        this.dominantrefs7 = dominantrefs7;
    }
    public Integer getDominantrefs8() {
        return this.dominantrefs8;
    }
    
    public void setDominantrefs8(Integer dominantrefs8) {
        this.dominantrefs8 = dominantrefs8;
    }
    public Integer getDominantrefs9() {
        return this.dominantrefs9;
    }
    
    public void setDominantrefs9(Integer dominantrefs9) {
        this.dominantrefs9 = dominantrefs9;
    }
    public Integer getDominantrefs10() {
        return this.dominantrefs10;
    }
    
    public void setDominantrefs10(Integer dominantrefs10) {
        this.dominantrefs10 = dominantrefs10;
    }
    public Integer getDominantrefs11() {
        return this.dominantrefs11;
    }
    
    public void setDominantrefs11(Integer dominantrefs11) {
        this.dominantrefs11 = dominantrefs11;
    }
    public Integer getDominantrefs12() {
        return this.dominantrefs12;
    }
    
    public void setDominantrefs12(Integer dominantrefs12) {
        this.dominantrefs12 = dominantrefs12;
    }
    public Short getImageinc() {
        return this.imageinc;
    }
    
    public void setImageinc(Short imageinc) {
        this.imageinc = imageinc;
    }
    public Short getTextinc() {
        return this.textinc;
    }
    
    public void setTextinc(Short textinc) {
        this.textinc = textinc;
    }
    public Short getDeprtype() {
        return this.deprtype;
    }
    
    public void setDeprtype(Short deprtype) {
        this.deprtype = deprtype;
    }
    public Double getDeprrate() {
        return this.deprrate;
    }
    
    public void setDeprrate(Double deprrate) {
        this.deprrate = deprrate;
    }
    public Short getDeprdur() {
        return this.deprdur;
    }
    
    public void setDeprdur(Short deprdur) {
        this.deprdur = deprdur;
    }
    public Double getSalvageval() {
        return this.salvageval;
    }
    
    public void setSalvageval(Double salvageval) {
        this.salvageval = salvageval;
    }
    public Short getRevalflag() {
        return this.revalflag;
    }
    
    public void setRevalflag(Short revalflag) {
        this.revalflag = revalflag;
    }
    public Short getRevdeprflag() {
        return this.revdeprflag;
    }
    
    public void setRevdeprflag(Short revdeprflag) {
        this.revdeprflag = revdeprflag;
    }
    public Short getPartdep() {
        return this.partdep;
    }
    
    public void setPartdep(Short partdep) {
        this.partdep = partdep;
    }
    public Short getDeprtype2() {
        return this.deprtype2;
    }
    
    public void setDeprtype2(Short deprtype2) {
        this.deprtype2 = deprtype2;
    }
    public Double getDeprrate2() {
        return this.deprrate2;
    }
    
    public void setDeprrate2(Double deprrate2) {
        this.deprrate2 = deprrate2;
    }
    public Short getDeprdur2() {
        return this.deprdur2;
    }
    
    public void setDeprdur2(Short deprdur2) {
        this.deprdur2 = deprdur2;
    }
    public Short getRevalflag2() {
        return this.revalflag2;
    }
    
    public void setRevalflag2(Short revalflag2) {
        this.revalflag2 = revalflag2;
    }
    public Short getRevdeprflag2() {
        return this.revdeprflag2;
    }
    
    public void setRevdeprflag2(Short revdeprflag2) {
        this.revdeprflag2 = revdeprflag2;
    }
    public Short getPartdep2() {
        return this.partdep2;
    }
    
    public void setPartdep2(Short partdep2) {
        this.partdep2 = partdep2;
    }
    public Short getApproved() {
        return this.approved;
    }
    
    public void setApproved(Short approved) {
        this.approved = approved;
    }
    public Integer getUnitsetref() {
        return this.unitsetref;
    }
    
    public void setUnitsetref(Integer unitsetref) {
        this.unitsetref = unitsetref;
    }
    public Integer getQccsetref() {
        return this.qccsetref;
    }
    
    public void setQccsetref(Integer qccsetref) {
        this.qccsetref = qccsetref;
    }
    public Double getDistamount() {
        return this.distamount;
    }
    
    public void setDistamount(Double distamount) {
        this.distamount = distamount;
    }
    public Short getCapiblockCreatedby() {
        return this.capiblockCreatedby;
    }
    
    public void setCapiblockCreatedby(Short capiblockCreatedby) {
        this.capiblockCreatedby = capiblockCreatedby;
    }
    public String getCapiblockCreateddate() {
        return this.capiblockCreadeddate;
    }
    
    public void setCapiblockCreateddate(String capiblockCreadeddate) {
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
    public String getUnivid() {
        return this.univid;
    }
    
    public void setUnivid(String univid) {
        this.univid = univid;
    }
    public Short getDistlotunits() {
        return this.distlotunits;
    }
    
    public void setDistlotunits(Short distlotunits) {
        this.distlotunits = distlotunits;
    }
    public Short getComblotunits() {
        return this.comblotunits;
    }
    
    public void setComblotunits(Short comblotunits) {
        this.comblotunits = comblotunits;
    }
    public Integer getWfstatus() {
        return this.wfstatus;
    }
    
    public void setWfstatus(Integer wfstatus) {
        this.wfstatus = wfstatus;
    }
    public Double getDistpoint() {
        return this.distpoint;
    }
    
    public void setDistpoint(Double distpoint) {
        this.distpoint = distpoint;
    }
    public Double getCamppoint() {
        return this.camppoint;
    }
    
    public void setCamppoint(Double camppoint) {
        this.camppoint = camppoint;
    }
    public Short getCanuseintrns() {
        return this.canuseintrns;
    }
    
    public void setCanuseintrns(Short canuseintrns) {
        this.canuseintrns = canuseintrns;
    }
    public String getIsonr() {
        return this.isonr;
    }
    
    public void setIsonr(String isonr) {
        this.isonr = isonr;
    }
    public String getGroupnr() {
        return this.groupnr;
    }
    
    public void setGroupnr(String groupnr) {
        this.groupnr = groupnr;
    }
    public String getProdcountry() {
        return this.prodcountry;
    }
    
    public void setProdcountry(String prodcountry) {
        this.prodcountry = prodcountry;
    }
    public Integer getAddtaxref() {
        return this.addtaxref;
    }
    
    public void setAddtaxref(Integer addtaxref) {
        this.addtaxref = addtaxref;
    }
    public Double getQprodamnt() {
        return this.qprodamnt;
    }
    
    public void setQprodamnt(Double qprodamnt) {
        this.qprodamnt = qprodamnt;
    }
    public Integer getQproduom() {
        return this.qproduom;
    }
    
    public void setQproduom(Integer qproduom) {
        this.qproduom = qproduom;
    }
    public Short getQprodsrcindex() {
        return this.qprodsrcindex;
    }
    
    public void setQprodsrcindex(Short qprodsrcindex) {
        this.qprodsrcindex = qprodsrcindex;
    }
    public Integer getExtaccessflags() {
        return this.extaccessflags;
    }
    
    public void setExtaccessflags(Integer extaccessflags) {
        this.extaccessflags = extaccessflags;
    }
    public Short getPacket() {
        return this.packet;
    }
    
    public void setPacket(Short packet) {
        this.packet = packet;
    }
    public Double getSalvageval2() {
        return this.salvageval2;
    }
    
    public void setSalvageval2(Double salvageval2) {
        this.salvageval2 = salvageval2;
    }
    public Double getSellvat() {
        return this.sellvat;
    }
    
    public void setSellvat(Double sellvat) {
        this.sellvat = sellvat;
    }
    public Double getReturnvat() {
        return this.returnvat;
    }
    
    public void setReturnvat(Double returnvat) {
        this.returnvat = returnvat;
    }
    public String getLogoid() {
        return this.logoid;
    }
    
    public void setLogoid(String logoid) {
        this.logoid = logoid;
    }
    public Short getLidconfirmed() {
        return this.lidconfirmed;
    }
    
    public void setLidconfirmed(Short lidconfirmed) {
        this.lidconfirmed = lidconfirmed;
    }
    public String getGtipcode() {
        return this.gtipcode;
    }
    
    public void setGtipcode(String gtipcode) {
        this.gtipcode = gtipcode;
    }
    public String getExpctgno() {
        return this.expctgno;
    }
    
    public void setExpctgno(String expctgno) {
        this.expctgno = expctgno;
    }
    public String getB2ccode() {
        return this.b2ccode;
    }
    
    public void setB2ccode(String b2ccode) {
        this.b2ccode = b2ccode;
    }
    public Integer getMarkref() {
        return this.markref;
    }
    
    public void setMarkref(Integer markref) {
        this.markref = markref;
    }
    public Short getImage2inc() {
        return this.image2inc;
    }
    
    public void setImage2inc(Short image2inc) {
        this.image2inc = image2inc;
    }
    public Double getAvrwhduration() {
        return this.avrwhduration;
    }
    
    public void setAvrwhduration(Double avrwhduration) {
        this.avrwhduration = avrwhduration;
    }
    public Integer getExtcardflags() {
        return this.extcardflags;
    }
    
    public void setExtcardflags(Integer extcardflags) {
        this.extcardflags = extcardflags;
    }
    public Double getMinordamount() {
        return this.minordamount;
    }
    
    public void setMinordamount(Double minordamount) {
        this.minordamount = minordamount;
    }
    public String getFreightplace() {
        return this.freightplace;
    }
    
    public void setFreightplace(String freightplace) {
        this.freightplace = freightplace;
    }
    public String getFreighttypcode1() {
        return this.freighttypcode1;
    }
    
    public void setFreighttypcode1(String freighttypcode1) {
        this.freighttypcode1 = freighttypcode1;
    }
    public String getFreighttypcode2() {
        return this.freighttypcode2;
    }
    
    public void setFreighttypcode2(String freighttypcode2) {
        this.freighttypcode2 = freighttypcode2;
    }
    public String getFreighttypcode3() {
        return this.freighttypcode3;
    }
    
    public void setFreighttypcode3(String freighttypcode3) {
        this.freighttypcode3 = freighttypcode3;
    }
    public String getFreighttypcode4() {
        return this.freighttypcode4;
    }
    
    public void setFreighttypcode4(String freighttypcode4) {
        this.freighttypcode4 = freighttypcode4;
    }
    public String getFreighttypcode5() {
        return this.freighttypcode5;
    }
    
    public void setFreighttypcode5(String freighttypcode5) {
        this.freighttypcode5 = freighttypcode5;
    }
    public String getFreighttypcode6() {
        return this.freighttypcode6;
    }
    
    public void setFreighttypcode6(String freighttypcode6) {
        this.freighttypcode6 = freighttypcode6;
    }
    public String getFreighttypcode7() {
        return this.freighttypcode7;
    }
    
    public void setFreighttypcode7(String freighttypcode7) {
        this.freighttypcode7 = freighttypcode7;
    }
    public String getFreighttypcode8() {
        return this.freighttypcode8;
    }
    
    public void setFreighttypcode8(String freighttypcode8) {
        this.freighttypcode8 = freighttypcode8;
    }
    public String getFreighttypcode9() {
        return this.freighttypcode9;
    }
    
    public void setFreighttypcode9(String freighttypcode9) {
        this.freighttypcode9 = freighttypcode9;
    }
    public String getFreighttypcode10() {
        return this.freighttypcode10;
    }
    
    public void setFreighttypcode10(String freighttypcode10) {
        this.freighttypcode10 = freighttypcode10;
    }
    public String getStatecode() {
        return this.statecode;
    }
    
    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }
    public String getStatename() {
        return this.statename;
    }
    
    public void setStatename(String statename) {
        this.statename = statename;
    }
    public String getExpcategory() {
        return this.expcategory;
    }
    
    public void setExpcategory(String expcategory) {
        this.expcategory = expcategory;
    }
    public Double getLostfactor() {
        return this.lostfactor;
    }
    
    public void setLostfactor(Double lostfactor) {
        this.lostfactor = lostfactor;
    }
    public Short getTextinceng() {
        return this.textinceng;
    }
    
    public void setTextinceng(Short textinceng) {
        this.textinceng = textinceng;
    }
    public String getEanbarcode() {
        return this.eanbarcode;
    }
    
    public void setEanbarcode(String eanbarcode) {
        this.eanbarcode = eanbarcode;
    }
    public String getDeprclasstype() {
        return this.deprclasstype;
    }
    
    public void setDeprclasstype(String deprclasstype) {
        this.deprclasstype = deprclasstype;
    }
    public Integer getWflowcrdref() {
        return this.wflowcrdref;
    }
    
    public void setWflowcrdref(Integer wflowcrdref) {
        this.wflowcrdref = wflowcrdref;
    }
    public Double getSellprvat() {
        return this.sellprvat;
    }
    
    public void setSellprvat(Double sellprvat) {
        this.sellprvat = sellprvat;
    }
    public Double getReturnprvat() {
        return this.returnprvat;
    }
    
    public void setReturnprvat(Double returnprvat) {
        this.returnprvat = returnprvat;
    }
    public Integer getLowlevelcodes1() {
        return this.lowlevelcodes1;
    }
    
    public void setLowlevelcodes1(Integer lowlevelcodes1) {
        this.lowlevelcodes1 = lowlevelcodes1;
    }
    public Integer getLowlevelcodes2() {
        return this.lowlevelcodes2;
    }
    
    public void setLowlevelcodes2(Integer lowlevelcodes2) {
        this.lowlevelcodes2 = lowlevelcodes2;
    }
    public Integer getLowlevelcodes3() {
        return this.lowlevelcodes3;
    }
    
    public void setLowlevelcodes3(Integer lowlevelcodes3) {
        this.lowlevelcodes3 = lowlevelcodes3;
    }
    public Integer getLowlevelcodes4() {
        return this.lowlevelcodes4;
    }
    
    public void setLowlevelcodes4(Integer lowlevelcodes4) {
        this.lowlevelcodes4 = lowlevelcodes4;
    }
    public Integer getLowlevelcodes5() {
        return this.lowlevelcodes5;
    }
    
    public void setLowlevelcodes5(Integer lowlevelcodes5) {
        this.lowlevelcodes5 = lowlevelcodes5;
    }
    public Integer getLowlevelcodes6() {
        return this.lowlevelcodes6;
    }
    
    public void setLowlevelcodes6(Integer lowlevelcodes6) {
        this.lowlevelcodes6 = lowlevelcodes6;
    }
    public Integer getLowlevelcodes7() {
        return this.lowlevelcodes7;
    }
    
    public void setLowlevelcodes7(Integer lowlevelcodes7) {
        this.lowlevelcodes7 = lowlevelcodes7;
    }
    public Integer getLowlevelcodes8() {
        return this.lowlevelcodes8;
    }
    
    public void setLowlevelcodes8(Integer lowlevelcodes8) {
        this.lowlevelcodes8 = lowlevelcodes8;
    }
    public Integer getLowlevelcodes9() {
        return this.lowlevelcodes9;
    }
    
    public void setLowlevelcodes9(Integer lowlevelcodes9) {
        this.lowlevelcodes9 = lowlevelcodes9;
    }
    public Integer getLowlevelcodes10() {
        return this.lowlevelcodes10;
    }
    
    public void setLowlevelcodes10(Integer lowlevelcodes10) {
        this.lowlevelcodes10 = lowlevelcodes10;
    }
    public String getOrglogoid() {
        return this.orglogoid;
    }
    
    public void setOrglogoid(String orglogoid) {
        this.orglogoid = orglogoid;
    }
    public Short getQproddepart() {
        return this.qproddepart;
    }
    
    public void setQproddepart(Short qproddepart) {
        this.qproddepart = qproddepart;
    }
    public Short getCanconfigure() {
        return this.canconfigure;
    }
    
    public void setCanconfigure(Short canconfigure) {
        this.canconfigure = canconfigure;
    }
    public Integer getCharsetref() {
        return this.charsetref;
    }
    
    public void setCharsetref(Integer charsetref) {
        this.charsetref = charsetref;
    }
    public Short getCandeduct() {
        return this.candeduct;
    }
    
    public void setCandeduct(Short candeduct) {
        this.candeduct = candeduct;
    }
    public Integer getConscoderef() {
        return this.conscoderef;
    }
    
    public void setConscoderef(Integer conscoderef) {
        this.conscoderef = conscoderef;
    }
    public String getSpecode2() {
        return this.specode2;
    }
    
    public void setSpecode2(String specode2) {
        this.specode2 = specode2;
    }
    public String getSpecode3() {
        return this.specode3;
    }
    
    public void setSpecode3(String specode3) {
        this.specode3 = specode3;
    }
    public String getSpecode4() {
        return this.specode4;
    }
    
    public void setSpecode4(String specode4) {
        this.specode4 = specode4;
    }
    public String getSpecode5() {
        return this.specode5;
    }
    
    public void setSpecode5(String specode5) {
        this.specode5 = specode5;
    }
    public Short getExpense() {
        return this.expense;
    }
    
    public void setExpense(Short expense) {
        this.expense = expense;
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

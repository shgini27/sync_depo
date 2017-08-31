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
public class ClCard implements java.io.Serializable{
    private int logicalRef;
    private Short active;
    private Short cardType;
    private String code;
    private String definition;
    private String specode;
    private String cyphcode;
    private String addr1;
    private String addr2;
    private String city;
    private String country;
    private String postcode;
    private String telnrs1;
    private String telnrs2;
    private String faxNr;
    private String taxNr;
    private String taxOffice;
    private String incharge;
    private float discrate;
    private int extenRef;
    private int paymentRef;
    private String emailAddr;
    private String webAddr;
    private Short warnMethod;
    private String warnEmailAddr;
    private String warnFaxNr;
    private Short clanguage;
    private String vatNr;
    private Short blocked;
    private String bankBranchs1;
    private String bankBranchs2;
    private String bankBranchs3;
    private String bankBranchs4;
    private String bankBranchs5;
    private String bankBranchs6;
    private String bankBranchs7;
    private String bankAccounts1;
    private String bankAccounts2;
    private String bankAccounts3;
    private String bankAccounts4;
    private String bankAccounts5;
    private String bankAccounts6;
    private String bankAccounts7;
    private String deliveryMethod;
    private String deliveryFirm;
    private Short cCurrency;
    private Short textInc;
    private Short siteId;
    private Short recStatus;
    private int orgLogRef;
    private String edino;
    private String tradingGrp;
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
    private Short paymentProc;
    private Short cratediffProc;
    private int wfStatus;
    private String ppGroupCode;
    private int ppGroupRef;
    private String taxOfficeCode;
    private String townCode;
    private String town;
    private String district;
    private String cityCode;
    private String countryCode;
    private String districtCode;
    private Short ordSendMethod;
    private String ordSendEmailAddr;
    private String ordSendFaxNr;
    private Short dspSendMethod;
    private String dspSendEmailAddr;
    private String dspSendFaxNr;
    private Short invSendMethod;
    private String invSendEmailAddr;
    private String invSendFaxNr;
    private Short subscriberStat;
    private String subscriberExt;
    private String autoPaidBank;
    private Short paymentType;
    private int lastSendRemLev;
    private int extAccessFlags;
    private Short ordSendFormat;
    private Short dspSendFormat;
    private Short invSendFormat;
    private Short remSendFormat;
    private String storeCreditCardNo;
    private Short clordFreq;
    private Short ordDay;
    private String logoId;
    private Short lidConfirmed;
    private String expRegNo;
    private String expDocNo;
    private int expBusTypeRef;
    private Short invPrintcnt;
    private Short pieceOrdInflict;
    private Short collectionVoicing;
    private Short ebusDataSendType;
    private int inistatusFlags;
    private Short slsOrderStatus;
    private Short slsOrderPrice;
    private Short ltrSendMethod;
    private String ltrSendEmailAddr;
    private String ltrSendFaxNr;
    private Short ltrSendFormat;
    private Short imageInc;
    private String cellPhone;
    private Short sameItemCodeUse;
    private String stateCode;
    private String stateName;
    private int wflowcrdref;
    private int parentClRef;
    private int lowlevelcodes1;
    private int lowlevelcodes2;
    private int lowlevelcodes3;
    private int lowlevelcodes4;
    private int lowlevelcodes5;
    private int lowlevelcodes6;
    private int lowlevelcodes7;
    private int lowlevelcodes8;
    private int lowlevelcodes9;
    private int lowlevelcodes10;
    private String telCodes1;
    private String telCodes2;
    private String taxCode;
    private Short salesBrws;
    private Short purchBrws;
    private Short impBrws;
    private Short expBrws;
    private Short finBrws;
    private String orgLogoId;
    private Short addToRefList;
    private Short textRefTr;
    private Short textRefEn;
    private Short arpQuoteInc;
    private Short clcrm;
    private Short grpFirmNr;
    private int consCodeRef;
    private String specode2;
    private String specode3;
    private String specode4;
    private String specode5;
    private Short offSendMethod;
    private String offSendEmailAddr;
    private String offSendFaxNr;
    private Short offSendFormat;
    private Short eBankNo;
    private Short loanGrpCtrl;
    private String bankNames1;
    private String bankNames2;
    private String bankNames3;
    private String bankNames4;
    private String bankNames5;
    private String bankNames6;
    private String bankNames7;
    private Short ldxFirmNr;

    public ClCard(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public ClCard(int logicalRef, Short active, Short cardType, String code, 
            String definition, String specode, String cyphcode, String addr1, 
            String addr2, String city, String country, String postcode, String telnrs1, 
            String telnrs2, String faxNr, String taxNr, String taxOffice, String incharge, 
            float discrate, int extenRef, int paymentRef, String emailAddr, String webAddr, 
            Short warnMethod, String warnEmailAddr, String warnFaxNr, Short clanguage, 
            String vatNr, Short blocked, String bankBranchs1, String bankBranchs2, 
            String bankBranchs3, String bankBranchs4, String bankBranchs5, String bankBranchs6, 
            String bankBranchs7, String bankAccounts1, String bankAccount2, String bankAccounts3, 
            String bankAccounts4, String bankAccounts5, String bankAccounts6, String bankAccounts7, 
            String deliveryMethod, String deliveryFirm, Short cCurrency, Short textInc, Short siteId, 
            Short recStatus, int orgLogRef, String edino, String tradingGrp, Short capiblockCreatedby, 
            String capiblockCreadeddate, Short capiblockCreatedhour, Short capiblockCreatedmin, 
            Short capiblockCreatedsec, Short capiblockModifiedby, String capiblockModifieddate, 
            Short capiblockModifiedhour, Short capiblockModifiedmin, Short capiblockModifiedsec, 
            Short paymentProc, Short cratediffProc, int wfStatus, String ppGroupCode, int ppGroupRef, 
            String taxOfficeCode, String townCode, String town, String district, String cityCode, 
            String countryCode, String districtCode, Short ordSendMethod, String ordSendEmailAddr, 
            String ordSendFaxNr, Short dspSendMethod, String dspSendEmailAddr, String dspSendFaxNr, 
            Short invSendMethod, String invSendEmailAddr, String invSendFaxNr, Short subscriberStat, 
            String subscriberExt, String autoPaidBank, Short paymentType, int lastSendRemLev, 
            int extAccessFlags, Short ordSendFormat, Short dspSendFormat, Short invSendFormat, 
            Short remSendFormat, String storeCreditCardNo, Short clordFreq, Short ordDay, String logoId, 
            Short lidConfirmed, String expRegNo, String expDocNo, int expBusTypeRef, Short invPrintcnt, 
            Short pieceOrdInflict, Short collectionVoicing, Short ebusDataSendType, int inistatusFlags, 
            Short slsOrderStatus, Short slsOrderPrice, Short ltrSendMethod, String ltrSendEmailAddr, 
            String ltrSendFaxNr, Short ltrSendFormat, Short imageInc, String cellPhone, Short sameItemCodeUse, 
            String stateCode, String stateName, int wflowcrdref, int parentClRef, int lowlevelcodes1, 
            int lowlevelcodes2, int lowlevelcodes3, int lowlevelcodes4, int lowlevelcodes5, int lowlevelcodes6, 
            int lowlevelcodes7, int lowlevelcodes8, int lowlevelcodes9, int lowlevelcodes10, String telCodes1, 
            String telCodes2, String taxCode, Short salesBrws, Short purchBrws, Short impBrws, Short expBrws, 
            Short finBrws, String orgLogoId, Short addToRefList, Short textRefTr, Short textRefEn, 
            Short arpQuoteInc, Short clcrm, Short grpFirmNr, int consCodeRef, String specode2, 
            String specode3, String specode4, String specode5, Short offSendMethod, String offSendEmailAddr, 
            String offSendFaxNr, Short offSendFormat, Short eBankNo, Short loanGrpCtrl, String bankNames1, 
            String bankNames2, String bankNames3, String bankNames4, String bankNames5, String bankNames6, 
            String bankNames7, Short ldxFirmNr) {
        this.logicalRef = logicalRef;
        this.active = active;
        this.cardType = cardType;
        this.code = code;
        this.definition = definition;
        this.specode = specode;
        this.cyphcode = cyphcode;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.city = city;
        this.country = country;
        this.postcode = postcode;
        this.telnrs1 = telnrs1;
        this.telnrs2 = telnrs2;
        this.faxNr = faxNr;
        this.taxNr = taxNr;
        this.taxOffice = taxOffice;
        this.incharge = incharge;
        this.discrate = discrate;
        this.extenRef = extenRef;
        this.paymentRef = paymentRef;
        this.emailAddr = emailAddr;
        this.webAddr = webAddr;
        this.warnMethod = warnMethod;
        this.warnEmailAddr = warnEmailAddr;
        this.warnFaxNr = warnFaxNr;
        this.clanguage = clanguage;
        this.vatNr = vatNr;
        this.blocked = blocked;
        this.bankBranchs1 = bankBranchs1;
        this.bankBranchs2 = bankBranchs2;
        this.bankBranchs3 = bankBranchs3;
        this.bankBranchs4 = bankBranchs4;
        this.bankBranchs5 = bankBranchs5;
        this.bankBranchs6 = bankBranchs6;
        this.bankBranchs7 = bankBranchs7;
        this.bankAccounts1 = bankAccounts1;
        this.bankAccounts2 = bankAccount2;
        this.bankAccounts3 = bankAccounts3;
        this.bankAccounts4 = bankAccounts4;
        this.bankAccounts5 = bankAccounts5;
        this.bankAccounts6 = bankAccounts6;
        this.bankAccounts7 = bankAccounts7;
        this.deliveryMethod = deliveryMethod;
        this.deliveryFirm = deliveryFirm;
        this.cCurrency = cCurrency;
        this.textInc = textInc;
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogRef = orgLogRef;
        this.edino = edino;
        this.tradingGrp = tradingGrp;
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
        this.paymentProc = paymentProc;
        this.cratediffProc = cratediffProc;
        this.wfStatus = wfStatus;
        this.ppGroupCode = ppGroupCode;
        this.ppGroupRef = ppGroupRef;
        this.taxOfficeCode = taxOfficeCode;
        this.townCode = townCode;
        this.town = town;
        this.district = district;
        this.cityCode = cityCode;
        this.countryCode = countryCode;
        this.districtCode = districtCode;
        this.ordSendMethod = ordSendMethod;
        this.ordSendEmailAddr = ordSendEmailAddr;
        this.ordSendFaxNr = ordSendFaxNr;
        this.dspSendMethod = dspSendMethod;
        this.dspSendEmailAddr = dspSendEmailAddr;
        this.dspSendFaxNr = dspSendFaxNr;
        this.invSendMethod = invSendMethod;
        this.invSendEmailAddr = invSendEmailAddr;
        this.invSendFaxNr = invSendFaxNr;
        this.subscriberStat = subscriberStat;
        this.subscriberExt = subscriberExt;
        this.autoPaidBank = autoPaidBank;
        this.paymentType = paymentType;
        this.lastSendRemLev = lastSendRemLev;
        this.extAccessFlags = extAccessFlags;
        this.ordSendFormat = ordSendFormat;
        this.dspSendFormat = dspSendFormat;
        this.invSendFormat = invSendFormat;
        this.remSendFormat = remSendFormat;
        this.storeCreditCardNo = storeCreditCardNo;
        this.clordFreq = clordFreq;
        this.ordDay = ordDay;
        this.logoId = logoId;
        this.lidConfirmed = lidConfirmed;
        this.expRegNo = expRegNo;
        this.expDocNo = expDocNo;
        this.expBusTypeRef = expBusTypeRef;
        this.invPrintcnt = invPrintcnt;
        this.pieceOrdInflict = pieceOrdInflict;
        this.collectionVoicing = collectionVoicing;
        this.ebusDataSendType = ebusDataSendType;
        this.inistatusFlags = inistatusFlags;
        this.slsOrderStatus = slsOrderStatus;
        this.slsOrderPrice = slsOrderPrice;
        this.ltrSendMethod = ltrSendMethod;
        this.ltrSendEmailAddr = ltrSendEmailAddr;
        this.ltrSendFaxNr = ltrSendFaxNr;
        this.ltrSendFormat = ltrSendFormat;
        this.imageInc = imageInc;
        this.cellPhone = cellPhone;
        this.sameItemCodeUse = sameItemCodeUse;
        this.stateCode = stateCode;
        this.stateName = stateName;
        this.wflowcrdref = wflowcrdref;
        this.parentClRef = parentClRef;
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
        this.telCodes1 = telCodes1;
        this.telCodes2 = telCodes2;
        this.taxCode = taxCode;
        this.salesBrws = salesBrws;
        this.purchBrws = purchBrws;
        this.impBrws = impBrws;
        this.expBrws = expBrws;
        this.finBrws = finBrws;
        this.orgLogoId = orgLogoId;
        this.addToRefList = addToRefList;
        this.textRefTr = textRefTr;
        this.textRefEn = textRefEn;
        this.arpQuoteInc = arpQuoteInc;
        this.clcrm = clcrm;
        this.grpFirmNr = grpFirmNr;
        this.consCodeRef = consCodeRef;
        this.specode2 = specode2;
        this.specode3 = specode3;
        this.specode4 = specode4;
        this.specode5 = specode5;
        this.offSendMethod = offSendMethod;
        this.offSendEmailAddr = offSendEmailAddr;
        this.offSendFaxNr = offSendFaxNr;
        this.offSendFormat = offSendFormat;
        this.eBankNo = eBankNo;
        this.loanGrpCtrl = loanGrpCtrl;
        this.bankNames1 = bankNames1;
        this.bankNames2 = bankNames2;
        this.bankNames3 = bankNames3;
        this.bankNames4 = bankNames4;
        this.bankNames5 = bankNames5;
        this.bankNames6 = bankNames6;
        this.bankNames7 = bankNames7;
        this.ldxFirmNr = ldxFirmNr;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public Short getCardType() {
        return cardType;
    }

    public void setCardType(Short cardType) {
        this.cardType = cardType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getSpecode() {
        return specode;
    }

    public void setSpecode(String specode) {
        this.specode = specode;
    }

    public String getCyphcode() {
        return cyphcode;
    }

    public void setCyphcode(String cyphcode) {
        this.cyphcode = cyphcode;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getTelnrs1() {
        return telnrs1;
    }

    public void setTelnrs1(String telnrs1) {
        this.telnrs1 = telnrs1;
    }

    public String getTelnrs2() {
        return telnrs2;
    }

    public void setTelnrs2(String telnrs2) {
        this.telnrs2 = telnrs2;
    }

    public String getFaxNr() {
        return faxNr;
    }

    public void setFaxNr(String faxNr) {
        this.faxNr = faxNr;
    }

    public String getTaxNr() {
        return taxNr;
    }

    public void setTaxNr(String taxNr) {
        this.taxNr = taxNr;
    }

    public String getTaxOffice() {
        return taxOffice;
    }

    public void setTaxOffice(String taxOffice) {
        this.taxOffice = taxOffice;
    }

    public String getIncharge() {
        return incharge;
    }

    public void setIncharge(String incharge) {
        this.incharge = incharge;
    }

    public float getDiscrate() {
        return discrate;
    }

    public void setDiscrate(float discrate) {
        this.discrate = discrate;
    }

    public int getExtenRef() {
        return extenRef;
    }

    public void setExtenRef(int extenRef) {
        this.extenRef = extenRef;
    }

    public int getPaymentRef() {
        return paymentRef;
    }

    public void setPaymentRef(int paymentRef) {
        this.paymentRef = paymentRef;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getWebAddr() {
        return webAddr;
    }

    public void setWebAddr(String webAddr) {
        this.webAddr = webAddr;
    }

    public Short getWarnMethod() {
        return warnMethod;
    }

    public void setWarnMethod(Short warnMethod) {
        this.warnMethod = warnMethod;
    }

    public String getWarnEmailAddr() {
        return warnEmailAddr;
    }

    public void setWarnEmailAddr(String warnEmailAddr) {
        this.warnEmailAddr = warnEmailAddr;
    }

    public String getWarnFaxNr() {
        return warnFaxNr;
    }

    public void setWarnFaxNr(String warnFaxNr) {
        this.warnFaxNr = warnFaxNr;
    }

    public Short getClanguage() {
        return clanguage;
    }

    public void setClanguage(Short clanguage) {
        this.clanguage = clanguage;
    }

    public String getVatNr() {
        return vatNr;
    }

    public void setVatNr(String vatNr) {
        this.vatNr = vatNr;
    }

    public Short getBlocked() {
        return blocked;
    }

    public void setBlocked(Short blocked) {
        this.blocked = blocked;
    }

    public String getBankBranchs1() {
        return bankBranchs1;
    }

    public void setBankBranchs1(String bankBranchs1) {
        this.bankBranchs1 = bankBranchs1;
    }

    public String getBankBranchs2() {
        return bankBranchs2;
    }

    public void setBankBranchs2(String bankBranchs2) {
        this.bankBranchs2 = bankBranchs2;
    }

    public String getBankBranchs3() {
        return bankBranchs3;
    }

    public void setBankBranchs3(String bankBranchs3) {
        this.bankBranchs3 = bankBranchs3;
    }

    public String getBankBranchs4() {
        return bankBranchs4;
    }

    public void setBankBranchs4(String bankBranchs4) {
        this.bankBranchs4 = bankBranchs4;
    }

    public String getBankBranchs5() {
        return bankBranchs5;
    }

    public void setBankBranchs5(String bankBranchs5) {
        this.bankBranchs5 = bankBranchs5;
    }

    public String getBankBranchs6() {
        return bankBranchs6;
    }

    public void setBankBranchs6(String bankBranchs6) {
        this.bankBranchs6 = bankBranchs6;
    }

    public String getBankBranchs7() {
        return bankBranchs7;
    }

    public void setBankBranchs7(String bankBranchs7) {
        this.bankBranchs7 = bankBranchs7;
    }

    public String getBankAccounts1() {
        return bankAccounts1;
    }

    public void setBankAccounts1(String bankAccounts1) {
        this.bankAccounts1 = bankAccounts1;
    }

    public String getBankAccounts2() {
        return bankAccounts2;
    }

    public void setBankAccounts2(String bankAccounts2) {
        this.bankAccounts2 = bankAccounts2;
    }

    public String getBankAccounts3() {
        return bankAccounts3;
    }

    public void setBankAccounts3(String bankAccounts3) {
        this.bankAccounts3 = bankAccounts3;
    }

    public String getBankAccounts4() {
        return bankAccounts4;
    }

    public void setBankAccounts4(String bankAccounts4) {
        this.bankAccounts4 = bankAccounts4;
    }

    public String getBankAccounts5() {
        return bankAccounts5;
    }

    public void setBankAccounts5(String bankAccounts5) {
        this.bankAccounts5 = bankAccounts5;
    }

    public String getBankAccounts6() {
        return bankAccounts6;
    }

    public void setBankAccounts6(String bankAccounts6) {
        this.bankAccounts6 = bankAccounts6;
    }

    public String getBankAccounts7() {
        return bankAccounts7;
    }

    public void setBankAccounts7(String bankAccounts7) {
        this.bankAccounts7 = bankAccounts7;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getDeliveryFirm() {
        return deliveryFirm;
    }

    public void setDeliveryFirm(String deliveryFirm) {
        this.deliveryFirm = deliveryFirm;
    }

    public Short getcCurrency() {
        return cCurrency;
    }

    public void setcCurrency(Short cCurrency) {
        this.cCurrency = cCurrency;
    }

    public Short getTextInc() {
        return textInc;
    }

    public void setTextInc(Short textInc) {
        this.textInc = textInc;
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

    public int getOrgLogRef() {
        return orgLogRef;
    }

    public void setOrgLogRef(int orgLogRef) {
        this.orgLogRef = orgLogRef;
    }

    public String getEdino() {
        return edino;
    }

    public void setEdino(String edino) {
        this.edino = edino;
    }

    public String getTradingGrp() {
        return tradingGrp;
    }

    public void setTradingGrp(String tradingGrp) {
        this.tradingGrp = tradingGrp;
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

    public Short getPaymentProc() {
        return paymentProc;
    }

    public void setPaymentProc(Short paymentProc) {
        this.paymentProc = paymentProc;
    }

    public Short getCratediffProc() {
        return cratediffProc;
    }

    public void setCratediffProc(Short cratediffProc) {
        this.cratediffProc = cratediffProc;
    }

    public int getWfStatus() {
        return wfStatus;
    }

    public void setWfStatus(int wfStatus) {
        this.wfStatus = wfStatus;
    }

    public String getPpGroupCode() {
        return ppGroupCode;
    }

    public void setPpGroupCode(String ppGroupCode) {
        this.ppGroupCode = ppGroupCode;
    }

    public int getPpGroupRef() {
        return ppGroupRef;
    }

    public void setPpGroupRef(int ppGroupRef) {
        this.ppGroupRef = ppGroupRef;
    }

    public String getTaxOfficeCode() {
        return taxOfficeCode;
    }

    public void setTaxOfficeCode(String taxOfficeCode) {
        this.taxOfficeCode = taxOfficeCode;
    }

    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public Short getOrdSendMethod() {
        return ordSendMethod;
    }

    public void setOrdSendMethod(Short ordSendMethod) {
        this.ordSendMethod = ordSendMethod;
    }

    public String getOrdSendEmailAddr() {
        return ordSendEmailAddr;
    }

    public void setOrdSendEmailAddr(String ordSendEmailAddr) {
        this.ordSendEmailAddr = ordSendEmailAddr;
    }

    public String getOrdSendFaxNr() {
        return ordSendFaxNr;
    }

    public void setOrdSendFaxNr(String ordSendFaxNr) {
        this.ordSendFaxNr = ordSendFaxNr;
    }

    public Short getDspSendMethod() {
        return dspSendMethod;
    }

    public void setDspSendMethod(Short dspSendMethod) {
        this.dspSendMethod = dspSendMethod;
    }

    public String getDspSendEmailAddr() {
        return dspSendEmailAddr;
    }

    public void setDspSendEmailAddr(String dspSendEmailAddr) {
        this.dspSendEmailAddr = dspSendEmailAddr;
    }

    public String getDspSendFaxNr() {
        return dspSendFaxNr;
    }

    public void setDspSendFaxNr(String dspSendFaxNr) {
        this.dspSendFaxNr = dspSendFaxNr;
    }

    public Short getInvSendMethod() {
        return invSendMethod;
    }

    public void setInvSendMethod(Short invSendMethod) {
        this.invSendMethod = invSendMethod;
    }

    public String getInvSendEmailAddr() {
        return invSendEmailAddr;
    }

    public void setInvSendEmailAddr(String invSendEmailAddr) {
        this.invSendEmailAddr = invSendEmailAddr;
    }

    public String getInvSendFaxNr() {
        return invSendFaxNr;
    }

    public void setInvSendFaxNr(String invSendFaxNr) {
        this.invSendFaxNr = invSendFaxNr;
    }

    public Short getSubscriberStat() {
        return subscriberStat;
    }

    public void setSubscriberStat(Short subscriberStat) {
        this.subscriberStat = subscriberStat;
    }

    public String getSubscriberExt() {
        return subscriberExt;
    }

    public void setSubscriberExt(String subscriberExt) {
        this.subscriberExt = subscriberExt;
    }

    public String getAutoPaidBank() {
        return autoPaidBank;
    }

    public void setAutoPaidBank(String autoPaidBank) {
        this.autoPaidBank = autoPaidBank;
    }

    public Short getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Short paymentType) {
        this.paymentType = paymentType;
    }

    public int getLastSendRemLev() {
        return lastSendRemLev;
    }

    public void setLastSendRemLev(int lastSendRemLev) {
        this.lastSendRemLev = lastSendRemLev;
    }

    public int getExtAccessFlags() {
        return extAccessFlags;
    }

    public void setExtAccessFlags(int extAccessFlags) {
        this.extAccessFlags = extAccessFlags;
    }

    public Short getOrdSendFormat() {
        return ordSendFormat;
    }

    public void setOrdSendFormat(Short ordSendFormat) {
        this.ordSendFormat = ordSendFormat;
    }

    public Short getDspSendFormat() {
        return dspSendFormat;
    }

    public void setDspSendFormat(Short dspSendFormat) {
        this.dspSendFormat = dspSendFormat;
    }

    public Short getInvSendFormat() {
        return invSendFormat;
    }

    public void setInvSendFormat(Short invSendFormat) {
        this.invSendFormat = invSendFormat;
    }

    public Short getRemSendFormat() {
        return remSendFormat;
    }

    public void setRemSendFormat(Short remSendFormat) {
        this.remSendFormat = remSendFormat;
    }

    public String getStoreCreditCardNo() {
        return storeCreditCardNo;
    }

    public void setStoreCreditCardNo(String storeCreditCardNo) {
        this.storeCreditCardNo = storeCreditCardNo;
    }

    public Short getClordFreq() {
        return clordFreq;
    }

    public void setClordFreq(Short clordFreq) {
        this.clordFreq = clordFreq;
    }

    public Short getOrdDay() {
        return ordDay;
    }

    public void setOrdDay(Short ordDay) {
        this.ordDay = ordDay;
    }

    public String getLogoId() {
        return logoId;
    }

    public void setLogoId(String logoId) {
        this.logoId = logoId;
    }

    public Short getLidConfirmed() {
        return lidConfirmed;
    }

    public void setLidConfirmed(Short lidConfirmed) {
        this.lidConfirmed = lidConfirmed;
    }

    public String getExpRegNo() {
        return expRegNo;
    }

    public void setExpRegNo(String expRegNo) {
        this.expRegNo = expRegNo;
    }

    public String getExpDocNo() {
        return expDocNo;
    }

    public void setExpDocNo(String expDocNo) {
        this.expDocNo = expDocNo;
    }

    public int getExpBusTypeRef() {
        return expBusTypeRef;
    }

    public void setExpBusTypeRef(int expBusTypeRef) {
        this.expBusTypeRef = expBusTypeRef;
    }

    public Short getInvPrintcnt() {
        return invPrintcnt;
    }

    public void setInvPrintcnt(Short invPrintcnt) {
        this.invPrintcnt = invPrintcnt;
    }

    public Short getPieceOrdInflict() {
        return pieceOrdInflict;
    }

    public void setPieceOrdInflict(Short pieceOrdInflict) {
        this.pieceOrdInflict = pieceOrdInflict;
    }

    public Short getCollectionVoicing() {
        return collectionVoicing;
    }

    public void setCollectionVoicing(Short collectionVoicing) {
        this.collectionVoicing = collectionVoicing;
    }

    public Short getEbusDataSendType() {
        return ebusDataSendType;
    }

    public void setEbusDataSendType(Short ebusDataSendType) {
        this.ebusDataSendType = ebusDataSendType;
    }

    public int getInistatusFlags() {
        return inistatusFlags;
    }

    public void setInistatusFlags(int inistatusFlags) {
        this.inistatusFlags = inistatusFlags;
    }

    public Short getSlsOrderStatus() {
        return slsOrderStatus;
    }

    public void setSlsOrderStatus(Short slsOrderStatus) {
        this.slsOrderStatus = slsOrderStatus;
    }

    public Short getSlsOrderPrice() {
        return slsOrderPrice;
    }

    public void setSlsOrderPrice(Short slsOrderPrice) {
        this.slsOrderPrice = slsOrderPrice;
    }

    public Short getLtrSendMethod() {
        return ltrSendMethod;
    }

    public void setLtrSendMethod(Short ltrSendMethod) {
        this.ltrSendMethod = ltrSendMethod;
    }

    public String getLtrSendEmailAddr() {
        return ltrSendEmailAddr;
    }

    public void setLtrSendEmailAddr(String ltrSendEmailAddr) {
        this.ltrSendEmailAddr = ltrSendEmailAddr;
    }

    public String getLtrSendFaxNr() {
        return ltrSendFaxNr;
    }

    public void setLtrSendFaxNr(String ltrSendFaxNr) {
        this.ltrSendFaxNr = ltrSendFaxNr;
    }

    public Short getLtrSendFormat() {
        return ltrSendFormat;
    }

    public void setLtrSendFormat(Short ltrSendFormat) {
        this.ltrSendFormat = ltrSendFormat;
    }

    public Short getImageInc() {
        return imageInc;
    }

    public void setImageInc(Short imageInc) {
        this.imageInc = imageInc;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public Short getSameItemCodeUse() {
        return sameItemCodeUse;
    }

    public void setSameItemCodeUse(Short sameItemCodeUse) {
        this.sameItemCodeUse = sameItemCodeUse;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getWflowcrdref() {
        return wflowcrdref;
    }

    public void setWflowcrdref(int wflowcrdref) {
        this.wflowcrdref = wflowcrdref;
    }

    public int getParentClRef() {
        return parentClRef;
    }

    public void setParentClRef(int parentClRef) {
        this.parentClRef = parentClRef;
    }

    public int getLowlevelcodes1() {
        return lowlevelcodes1;
    }

    public void setLowlevelcodes1(int lowlevelcodes1) {
        this.lowlevelcodes1 = lowlevelcodes1;
    }

    public int getLowlevelcodes2() {
        return lowlevelcodes2;
    }

    public void setLowlevelcodes2(int lowlevelcodes2) {
        this.lowlevelcodes2 = lowlevelcodes2;
    }

    public int getLowlevelcodes3() {
        return lowlevelcodes3;
    }

    public void setLowlevelcodes3(int lowlevelcodes3) {
        this.lowlevelcodes3 = lowlevelcodes3;
    }

    public int getLowlevelcodes4() {
        return lowlevelcodes4;
    }

    public void setLowlevelcodes4(int lowlevelcodes4) {
        this.lowlevelcodes4 = lowlevelcodes4;
    }

    public int getLowlevelcodes5() {
        return lowlevelcodes5;
    }

    public void setLowlevelcodes5(int lowlevelcodes5) {
        this.lowlevelcodes5 = lowlevelcodes5;
    }

    public int getLowlevelcodes6() {
        return lowlevelcodes6;
    }

    public void setLowlevelcodes6(int lowlevelcodes6) {
        this.lowlevelcodes6 = lowlevelcodes6;
    }

    public int getLowlevelcodes7() {
        return lowlevelcodes7;
    }

    public void setLowlevelcodes7(int lowlevelcodes7) {
        this.lowlevelcodes7 = lowlevelcodes7;
    }

    public int getLowlevelcodes8() {
        return lowlevelcodes8;
    }

    public void setLowlevelcodes8(int lowlevelcodes8) {
        this.lowlevelcodes8 = lowlevelcodes8;
    }

    public int getLowlevelcodes9() {
        return lowlevelcodes9;
    }

    public void setLowlevelcodes9(int lowlevelcodes9) {
        this.lowlevelcodes9 = lowlevelcodes9;
    }

    public int getLowlevelcodes10() {
        return lowlevelcodes10;
    }

    public void setLowlevelcodes10(int lowlevelcodes10) {
        this.lowlevelcodes10 = lowlevelcodes10;
    }

    public String getTelCodes1() {
        return telCodes1;
    }

    public void setTelCodes1(String telCodes1) {
        this.telCodes1 = telCodes1;
    }

    public String getTelCodes2() {
        return telCodes2;
    }

    public void setTelCodes2(String telCodes2) {
        this.telCodes2 = telCodes2;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public Short getSalesBrws() {
        return salesBrws;
    }

    public void setSalesBrws(Short salesBrws) {
        this.salesBrws = salesBrws;
    }

    public Short getPurchBrws() {
        return purchBrws;
    }

    public void setPurchBrws(Short purchBrws) {
        this.purchBrws = purchBrws;
    }

    public Short getImpBrws() {
        return impBrws;
    }

    public void setImpBrws(Short impBrws) {
        this.impBrws = impBrws;
    }

    public Short getExpBrws() {
        return expBrws;
    }

    public void setExpBrws(Short expBrws) {
        this.expBrws = expBrws;
    }

    public Short getFinBrws() {
        return finBrws;
    }

    public void setFinBrws(Short finBrws) {
        this.finBrws = finBrws;
    }

    public String getOrgLogoId() {
        return orgLogoId;
    }

    public void setOrgLogoId(String orgLogoId) {
        this.orgLogoId = orgLogoId;
    }

    public Short getAddToRefList() {
        return addToRefList;
    }

    public void setAddToRefList(Short addToRefList) {
        this.addToRefList = addToRefList;
    }

    public Short getTextRefTr() {
        return textRefTr;
    }

    public void setTextRefTr(Short textRefTr) {
        this.textRefTr = textRefTr;
    }

    public Short getTextRefEn() {
        return textRefEn;
    }

    public void setTextRefEn(Short textRefEn) {
        this.textRefEn = textRefEn;
    }

    public Short getArpQuoteInc() {
        return arpQuoteInc;
    }

    public void setArpQuoteInc(Short arpQuoteInc) {
        this.arpQuoteInc = arpQuoteInc;
    }

    public Short getClcrm() {
        return clcrm;
    }

    public void setClcrm(Short clcrm) {
        this.clcrm = clcrm;
    }

    public Short getGrpFirmNr() {
        return grpFirmNr;
    }

    public void setGrpFirmNr(Short grpFirmNr) {
        this.grpFirmNr = grpFirmNr;
    }

    public int getConsCodeRef() {
        return consCodeRef;
    }

    public void setConsCodeRef(int consCodeRef) {
        this.consCodeRef = consCodeRef;
    }

    public String getSpecode2() {
        return specode2;
    }

    public void setSpecode2(String specode2) {
        this.specode2 = specode2;
    }

    public String getSpecode3() {
        return specode3;
    }

    public void setSpecode3(String specode3) {
        this.specode3 = specode3;
    }

    public String getSpecode4() {
        return specode4;
    }

    public void setSpecode4(String specode4) {
        this.specode4 = specode4;
    }

    public String getSpecode5() {
        return specode5;
    }

    public void setSpecode5(String specode5) {
        this.specode5 = specode5;
    }

    public Short getOffSendMethod() {
        return offSendMethod;
    }

    public void setOffSendMethod(Short offSendMethod) {
        this.offSendMethod = offSendMethod;
    }

    public String getOffSendEmailAddr() {
        return offSendEmailAddr;
    }

    public void setOffSendEmailAddr(String offSendEmailAddr) {
        this.offSendEmailAddr = offSendEmailAddr;
    }

    public String getOffSendFaxNr() {
        return offSendFaxNr;
    }

    public void setOffSendFaxNr(String offSendFaxNr) {
        this.offSendFaxNr = offSendFaxNr;
    }

    public Short getOffSendFormat() {
        return offSendFormat;
    }

    public void setOffSendFormat(Short offSendFormat) {
        this.offSendFormat = offSendFormat;
    }

    public Short geteBankNo() {
        return eBankNo;
    }

    public void seteBankNo(Short eBankNo) {
        this.eBankNo = eBankNo;
    }

    public Short getLoanGrpCtrl() {
        return loanGrpCtrl;
    }

    public void setLoanGrpCtrl(Short loanGrpCtrl) {
        this.loanGrpCtrl = loanGrpCtrl;
    }

    public String getBankNames1() {
        return bankNames1;
    }

    public void setBankNames1(String bankNames1) {
        this.bankNames1 = bankNames1;
    }

    public String getBankNames2() {
        return bankNames2;
    }

    public void setBankNames2(String bankNames2) {
        this.bankNames2 = bankNames2;
    }

    public String getBankNames3() {
        return bankNames3;
    }

    public void setBankNames3(String bankNames3) {
        this.bankNames3 = bankNames3;
    }

    public String getBankNames4() {
        return bankNames4;
    }

    public void setBankNames4(String bankNames4) {
        this.bankNames4 = bankNames4;
    }

    public String getBankNames5() {
        return bankNames5;
    }

    public void setBankNames5(String bankNames5) {
        this.bankNames5 = bankNames5;
    }

    public String getBankNames6() {
        return bankNames6;
    }

    public void setBankNames6(String bankNames6) {
        this.bankNames6 = bankNames6;
    }

    public String getBankNames7() {
        return bankNames7;
    }

    public void setBankNames7(String bankNames7) {
        this.bankNames7 = bankNames7;
    }

    public Short getLdxFirmNr() {
        return ldxFirmNr;
    }

    public void setLdxFirmNr(Short ldxFirmNr) {
        this.ldxFirmNr = ldxFirmNr;
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

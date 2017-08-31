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
public class ItmUnitA implements java.io.Serializable{
    
    private int logicalRef;
    private int itemRef;
    private Short lineNr;
    private int unitLineRef;
    private String barcode;
    private Short mtrlclas;
    private Short purchclas;
    private Short salesclas;
    private Short mtrlPriority;
    private Short purchPriority;
    private Short salesPriority;
    private int width; //logicalRef kaydet
    private Double length;
    private Double height;
    private Double area;
    private Double volume;
    private Double weight;
    private Integer widthref;
    private Integer lengthref;
    private Integer heightref;
    private Integer arearef;
    private Integer volumeref;
    private Integer weightref;
    private Double crossVolume;
    private Double crossWeight;
    private Integer crossVolumeRef;
    private Integer crossWeightRef;
    private Double convfact1;
    private Double convfact2;
    private int extAccessFlags;
    private Short siteId;
    private Short recStatus;
    private int orgLogicRef;
    private String barcode2;
    private String barcode3;
    private String wBarcode;
    private Short wBarcodeShift;
    private int variantRef;
    
    public ItmUnitA(int logicalRef){
        this.logicalRef = logicalRef;
    }
    
    public ItmUnitA(int logicalRef, int itemRef, Short lineNr, int unitLineRef, 
            String barcode, Short mtrlclas, Short purchclas, Short salesclas, 
            Short mtrlPriority, Short purchPriority, Short salesPriority, int width, 
            Double length, Double height, Double area, Double volume, Double weight, 
            Integer widthref, Integer lengthref, Integer heightref, Integer arearef, 
            Integer volumeref, Integer weightref, Double crossVolume, Double crossWeight, 
            Integer crossVolumeRef, Integer crossWeightRef, Double convfact1, Double convfact2, 
            int extAccessFlags, Short siteId, Short recStatus, int orgLogicRef, String barcode2, 
            String barcode3, String wBarcode, Short wBarcodeShift, int variantRef) {
        this.logicalRef = logicalRef;
        this.itemRef = itemRef;
        this.lineNr = lineNr;
        this.unitLineRef = unitLineRef;
        this.barcode = barcode;
        this.mtrlclas = mtrlclas;
        this.purchclas = purchclas;
        this.salesclas = salesclas;
        this.mtrlPriority = mtrlPriority;
        this.purchPriority = purchPriority;
        this.salesPriority = salesPriority;
        this.width = width;
        this.length = length;
        this.height = height;
        this.area = area;
        this.volume = volume;
        this.weight = weight;
        this.widthref = widthref;
        this.lengthref = lengthref;
        this.heightref = heightref;
        this.arearef = arearef;
        this.volumeref = volumeref;
        this.weightref = weightref;
        this.crossVolume = crossVolume;
        this.crossWeight = crossWeight;
        this.crossVolumeRef = crossVolumeRef;
        this.crossWeightRef = crossWeightRef;
        this.convfact1 = convfact1;
        this.convfact2 = convfact2;
        this.extAccessFlags = extAccessFlags;
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogicRef = orgLogicRef;
        this.barcode2 = barcode2;
        this.barcode3 = barcode3;
        this.wBarcode = wBarcode;
        this.wBarcodeShift = wBarcodeShift;
        this.variantRef = variantRef;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public int getItemRef() {
        return itemRef;
    }

    public void setItemRef(int itemRef) {
        this.itemRef = itemRef;
    }

    public Short getLineNr() {
        return lineNr;
    }

    public void setLineNr(Short lineNr) {
        this.lineNr = lineNr;
    }

    public int getUnitLineRef() {
        return unitLineRef;
    }

    public void setUnitLineRef(int unitLineRef) {
        this.unitLineRef = unitLineRef;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Short getMtrlclas() {
        return mtrlclas;
    }

    public void setMtrlclas(Short mtrlclas) {
        this.mtrlclas = mtrlclas;
    }

    public Short getPurchclas() {
        return purchclas;
    }

    public void setPurchclas(Short purchclas) {
        this.purchclas = purchclas;
    }

    public Short getSalesclas() {
        return salesclas;
    }

    public void setSalesclas(Short salesclas) {
        this.salesclas = salesclas;
    }

    public Short getMtrlPriority() {
        return mtrlPriority;
    }

    public void setMtrlPriority(Short mtrlPriority) {
        this.mtrlPriority = mtrlPriority;
    }

    public Short getPurchPriority() {
        return purchPriority;
    }

    public void setPurchPriority(Short purchPriority) {
        this.purchPriority = purchPriority;
    }

    public Short getSalesPriority() {
        return salesPriority;
    }

    public void setSalesPriority(Short salesPriority) {
        this.salesPriority = salesPriority;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int logicalRef) {
        this.width = logicalRef;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getWidthref() {
        return widthref;
    }

    public void setWidthref(Integer widthref) {
        this.widthref = widthref;
    }

    public Integer getLengthref() {
        return lengthref;
    }

    public void setLengthref(Integer lengthref) {
        this.lengthref = lengthref;
    }

    public Integer getHeightref() {
        return heightref;
    }

    public void setHeightref(Integer heightref) {
        this.heightref = heightref;
    }

    public Integer getArearef() {
        return arearef;
    }

    public void setArearef(Integer arearef) {
        this.arearef = arearef;
    }

    public Integer getVolumeref() {
        return volumeref;
    }

    public void setVolumeref(Integer volumeref) {
        this.volumeref = volumeref;
    }

    public Integer getWeightref() {
        return weightref;
    }

    public void setWeightref(Integer weightref) {
        this.weightref = weightref;
    }

    public Double getCrossVolume() {
        return crossVolume;
    }

    public void setCrossVolume(Double crossVolume) {
        this.crossVolume = crossVolume;
    }

    public Double getCrossWeight() {
        return crossWeight;
    }

    public void setCrossWeight(Double crossWeight) {
        this.crossWeight = crossWeight;
    }

    public Integer getCrossVolumeRef() {
        return crossVolumeRef;
    }

    public void setCrossVolumeRef(Integer crossVolumeRef) {
        this.crossVolumeRef = crossVolumeRef;
    }

    public Integer getCrossWeightRef() {
        return crossWeightRef;
    }

    public void setCrossWeightRef(Integer crossWeightRef) {
        this.crossWeightRef = crossWeightRef;
    }

    public Double getConvfact1() {
        return convfact1;
    }

    public void setConvfact1(Double convfact1) {
        this.convfact1 = convfact1;
    }

    public Double getConvfact2() {
        return convfact2;
    }

    public void setConvfact2(Double convfact2) {
        this.convfact2 = convfact2;
    }

    public int getExtAccessFlags() {
        return extAccessFlags;
    }

    public void setExtAccessFlags(int extAccessFlags) {
        this.extAccessFlags = extAccessFlags;
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

    public String getBarcode2() {
        return barcode2;
    }

    public void setBarcode2(String barcode2) {
        this.barcode2 = barcode2;
    }

    public String getBarcode3() {
        return barcode3;
    }

    public void setBarcode3(String barcode3) {
        this.barcode3 = barcode3;
    }

    public String getwBarcode() {
        return wBarcode;
    }

    public void setwBarcode(String wBarcode) {
        this.wBarcode = wBarcode;
    }

    public Short getwBarcodeShift() {
        return wBarcodeShift;
    }

    public void setwBarcodeShift(Short wBarcodeShift) {
        this.wBarcodeShift = wBarcodeShift;
    }

    public int getVariantRef() {
        return variantRef;
    }

    public void setVariantRef(int variantRef) {
        this.variantRef = variantRef;
    }
    
    
}

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
public class UnitSetL implements java.io.Serializable{


     private int logicalref;
     private String code;
     private String name;
     private Integer unitsetref;
     private Short linenr;
     private Short mainunit;
     private Double convfact1;
     private Double convfact2;
     private int width;     ///logicalRef kaydediyoruz
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
     private Short divunit;
	
    public UnitSetL(int logicalref) {
        this.logicalref = logicalref;
    }
    
    public UnitSetL(int logicalref, int width) {
        this.logicalref = logicalref;
        this.width = width;
    }
    
    public UnitSetL(int logicalref, String code, String name, Integer unitsetref, 
            Short linenr, Short mainunit, Double convfact1, Double convfact2, 
            int width, Double length, Double height, Double area, Double volume, 
            Double weight, Integer widthref, Integer lengthref, Integer heightref, 
            Integer arearef, Integer volumeref, Integer weightref, Short divunit) {
       this.logicalref = logicalref;
       this.code = code;
       this.name = name;
       this.unitsetref = unitsetref;
       this.linenr = linenr;
       this.mainunit = mainunit;
       this.convfact1 = convfact1;
       this.convfact2 = convfact2;
       this.width = width; //we save int logicalRef here to find later
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
       this.divunit = divunit;
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
    public Integer getUnitsetref() {
        return this.unitsetref;
    }
    
    public void setUnitsetref(Integer unitsetref) {
        this.unitsetref = unitsetref;
    }
    public Short getLinenr() {
        return this.linenr;
    }
    
    public void setLinenr(Short linenr) {
        this.linenr = linenr;
    }
    public Short getMainunit() {
        return this.mainunit;
    }
    
    public void setMainunit(Short mainunit) {
        this.mainunit = mainunit;
    }
    public Double getConvfact1() {
        return this.convfact1;
    }
    
    public void setConvfact1(Double convfact1) {
        this.convfact1 = convfact1;
    }
    public Double getConvfact2() {
        return this.convfact2;
    }
    
    public void setConvfact2(Double convfact2) {
        this.convfact2 = convfact2;
    }
    public int getWidth() {
        return this.width;
    }
    
    public void setWidth(int logicalRef) {
        this.width = logicalRef;
    }
    public Double getLength() {
        return this.length;
    }
    
    public void setLength(Double length) {
        this.length = length;
    }
    public Double getHeight() {
        return this.height;
    }
    
    public void setHeight(Double height) {
        this.height = height;
    }
    public Double getArea() {
        return this.area;
    }
    
    public void setArea(Double area) {
        this.area = area;
    }
    
    public Double getVolume() {
        return this.volume;
    }
    
    public void setVolume(Double volume) {
        this.volume = volume;
    }
    public Double getWeight() {
        return this.weight;
    }
    
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Integer getWidthref() {
        return this.widthref;
    }
    
    public void setWidthref(Integer widthref) {
        this.widthref = widthref;
    }
    public Integer getLengthref() {
        return this.lengthref;
    }
    
    public void setLengthref(Integer lengthref) {
        this.lengthref = lengthref;
    }
    public Integer getHeightref() {
        return this.heightref;
    }
    
    public void setHeightref(Integer heightref) {
        this.heightref = heightref;
    }
    public Integer getArearef() {
        return this.arearef;
    }
    
    public void setArearef(Integer arearef) {
        this.arearef = arearef;
    }
    public Integer getVolumeref() {
        return this.volumeref;
    }
    
    public void setVolumeref(Integer volumeref) {
        this.volumeref = volumeref;
    }
    public Integer getWeightref() {
        return this.weightref;
    }
    
    public void setWeightref(Integer weightref) {
        this.weightref = weightref;
    }
    public Short getDivunit() {
        return this.divunit;
    }
    
    public void setDivunit(Short divunit) {
        this.divunit = divunit;
    }
    
    //NumberFormat numberFormat = new 




}
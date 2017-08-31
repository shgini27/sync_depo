/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class JsonObject {
    private final JSONObject object;
    
    public JsonObject(){
        object = new JSONObject();
    }
    
    public JSONObject getObject(){
        return object;
    }
    
    public void setObject(String colum, JSONArray value){
        object.put(colum, value);
    }
    
    @Override
    public String toString(){
        return object.toJSONString();
    }
    
    public int getJsonSize(){
        return object.size();
    }
}

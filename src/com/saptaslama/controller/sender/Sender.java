/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sender;

import com.saptaslama.model.JsonObject;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Shagy
 */
public class Sender {
    //get column names of given table
    public String[] getColumnNames(ResultSet resultSet) {
        String[] columnNames;
        ResultSetMetaData metaData;
        int count;

        try {
            metaData = resultSet.getMetaData();
            count = metaData.getColumnCount();
            columnNames = new String[count];

            for (int i = 1; i <= count; i++) {
                columnNames[i - 1] = metaData.getColumnName(i);
                //System.out.println(i + " Column Names: " + columnNames[i - 1]);
            }
            return columnNames;
        } catch (SQLException ex) {
            Logger.getLogger(Sender.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    // read file from server and return jsonObject
    public JSONObject getJsonObjectFromFile(String filePath) {
        JSONObject jObject;
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader(filePath));
            jObject = (JSONObject) obj;
            return jObject;
        } catch (FileNotFoundException e) {
            Logger.getLogger(Sender.class.getName()).log(Level.SEVERE, null, e);
            return null;
        } catch (IOException | ParseException e) {
            Logger.getLogger(Sender.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    //send jsonfile to server
    public void sendJsonFile(JsonObject jObject, String filePath) {
        try (FileWriter file = new FileWriter(filePath)) { //C:\Users\Shagy\Desktop\jsonSynch

            file.write(jObject.toString());
            file.flush();

        } catch (IOException e) {
            Logger.getLogger(Sender.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public Date parseDate(String dateString) {
        //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
        Date date;

        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(dateString);
            System.out.println("date: " + date);
            return date;
        } catch (java.text.ParseException ex) {
            System.out.println("date: " + null);
            Logger.getLogger(Sender.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public String parseToString(Date dateString){
        String date = "0000-00-00 00:00:00.000";
        if(dateString != null){
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").format(dateString);
        }
        return date;
    }
}

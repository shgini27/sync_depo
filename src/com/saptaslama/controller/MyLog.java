/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Shagy
 */
public class MyLog {

    private static final Logger LOGGER = Logger.getLogger("MyLog");
    private static FileHandler fileHandler;
    private static final SimpleFormatter FORMATTER = new SimpleFormatter();

    public static void writeLog(String tableName, boolean flag) {
        String logMessageOK = tableName + " INSERT OR UPDATE IS SUCCESSIFULLY!";
        String logMessageNotOK = tableName + " INSERT OR UPDATE IS FAILED!!!";

        if (flag == true) {
            LOGGER.info(logMessageOK);
        } else {
            LOGGER.info(logMessageNotOK);
        }
    }
    
    public static void writeConnectionLog(String dbName, boolean flag) {
        String logMessageOK = dbName + " CONNECTION IS SUCCESSIFULLY!";
        String logMessageNotOK = dbName + " CONNECTION IS FAILED!!!";

        if (flag == true) {
            LOGGER.info(logMessageOK);
        } else {
            LOGGER.info(logMessageNotOK);
        }
    }

    public static void initLog() {

        try {
            fileHandler = new FileHandler(CompanyConstants.LOG_FILE_PATH + "MyLogFile.log");
            LOGGER.addHandler(fileHandler);
            fileHandler.setFormatter(FORMATTER);
        } catch (SecurityException | IOException ex) {
            Logger.getLogger(MyLog.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }

}

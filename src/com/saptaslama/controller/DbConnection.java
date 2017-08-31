/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller;

import com.saptaslama.model.ClcollatrlRisk;
import com.saptaslama.model.ClrNums;
import com.saptaslama.model.CrdacRef;
import com.saptaslama.model.Items;
import com.saptaslama.model.ItmUnitA;
import com.saptaslama.model.JsonObject;
import com.saptaslama.model.PrcList;
import com.saptaslama.model.SrvNums;
import com.saptaslama.model.SrvTot;
import com.saptaslama.model.SrvUnitA;
import com.saptaslama.model.StLine;
import com.saptaslama.model.UnitBarcode;
import com.saptaslama.model.UnitSetL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class DbConnection {

    private String localUrl = "jdbc:jtds:sqlserver://LOCALHOST:1433;databaseName=Logo2";
    private String localUserName = "sa";
    private String localPassword = "sb19861905";

    public DbConnection() {

    }

    public DbConnection(String url, String userName, String password) {
        this.localUrl = url;
        this.localUserName = userName;
        this.localPassword = password;
    }

    public Connection getConnection() {

        Connection conn;
        boolean flag;
        try {
            System.out.println("getting connection...");
            conn = DriverManager.getConnection(localUrl, localUserName, localPassword);
            System.out.println("Connected!!!");
            flag = true;
            MyLog.writeConnectionLog(localUrl, flag);
            return conn;
        } catch (SQLException ex) {
            flag = false;
            MyLog.writeConnectionLog(localUrl, flag);
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Sorry, an ERROR acquired! Driver "
                    + "loaded but could not connect to database."
                    + "\n \n\nTIP: Please check internet connection and try again.");
            System.exit(0);
            return null;
        }
    }

    public Connection getConnection(String url, String userName, String password) {

        Connection conn;
        try {
            System.out.println("getting connection...");
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected!!!");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Sorry, an ERROR acquired! Driver "
                    + "loaded but could not connect to database."
                    + "\n \n\nTIP: Please check internet connection and try again.");
            System.exit(0);
            return null;
        }
    }

    //metod to close connection with database
    public void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println("Connection closed!!!");
    }

    //metod to close resultSet
    public void closeResultSet(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println("ResultSet is closed!!!");
    }

    //metod to execute query to database
    private ResultSet executionQuery(Connection connection, String sql) {
        //connectDatabase();
        ResultSet resultSet = null;
        try {
            resultSet = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery(sql);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return resultSet;
    }

    //metod to view all
    public ResultSet querySelectAll(Connection connection, String tableName) {
        String sql = "SELECT * FROM " + tableName;
        System.out.println(sql);
        return executionQuery(connection, sql);
    }

    //metod for view all with specific clause (with state)
    public ResultSet querySelectStatement(Connection connection, String tableName, String state) {
        String sql = "SELECT * FROM " + tableName + " WHERE " + state;
        System.out.println(sql);
        return this.executionQuery(connection, sql);
    }
    
    //metod for view all with specific clause (with state)
    public ResultSet querySelectCondition(Connection connection, String column, 
            String tableName, String state) {
        String sql = "SELECT " + column + " FROM " + tableName + " WHERE " + state;
        System.out.println(sql);
        return this.executionQuery(connection, sql);
    }
    
    //metod for execution of application update
    public String executionUpdate(Connection connection, String sql, String tableName) {
        boolean flag;
        try {
            connection.createStatement().executeUpdate(sql);
            flag = true;
            MyLog.writeLog(tableName, flag);
            return sql;
        } catch (SQLException ex) {
            flag = false;
            MyLog.writeLog(tableName, flag);
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
            return ex.getMessage();
        }
    }

    // metod to get primaryKey for update metod
    public ArrayList<UnitSetL> getUnitLLogRefs(Connection connection, String table,
            String columKey, String columSearch, int searchCondition) {

        ResultSet resultSet;
        ArrayList<UnitSetL> tableValue = new ArrayList<>();
        UnitSetL unit;
        String sql = "SELECT " + columKey + " FROM " + table + " WHERE "
                + columSearch + " = '" + searchCondition + "' ORDER BY " + columKey + " ASC";

        resultSet = executionQuery(connection, sql);

        try {
            while (resultSet.next()) {
                unit = new UnitSetL(resultSet.getInt(columKey));
                tableValue.add(unit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        } finally {
            closeResultSet(resultSet);
        }
        return tableValue;
    }

    // metod to get primaryKey for update metod
    public ArrayList<ItmUnitA> getPrimaryKeyItmUnitA(Connection connection, String table,
            String searchCondition, String columKey, String columSearch) {

        ResultSet resultSet;
        ArrayList<ItmUnitA> tableValue = new ArrayList<>();
        ItmUnitA unit;
        String sql = "SELECT " + columKey + " FROM " + table + " WHERE "
                + columSearch + " = '" + searchCondition + "' ORDER BY " + columKey + " ASC";

        resultSet = executionQuery(connection, sql);

        try {
            while (resultSet.next()) {
                unit = new ItmUnitA(resultSet.getInt(columKey));
                tableValue.add(unit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        } finally {
            closeResultSet(resultSet);
        }
        return tableValue;
    }

    // metod to get primaryKey for update metod
    public ArrayList<Items> getPrimaryKeyItem(Connection connection, String table,
            String searchCondition, String columKey, String columSearch) {

        ResultSet resultSet;
        ArrayList<Items> tableValue = new ArrayList<>();
        Items unit;
        String sql = "SELECT " + columKey + " FROM " + table + " WHERE "
                + columSearch + " = '" + searchCondition + "' ORDER BY " + columKey + " ASC";

        resultSet = executionQuery(connection, sql);

        try {
            while (resultSet.next()) {
                unit = new Items(resultSet.getInt(columKey));
                tableValue.add(unit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        } finally {
            closeResultSet(resultSet);
        }
        return tableValue;
    }

    // metod to get primaryKey for update metod
    public ArrayList<UnitBarcode> getPrimaryKeyBarcode(Connection connection, String table,
            String searchCondition, String columKey, String columSearch) {

        ResultSet resultSet;
        ArrayList<UnitBarcode> tableValue = new ArrayList<>();
        UnitBarcode unit;
        String sql = "SELECT " + columKey + " FROM " + table + " WHERE "
                + columSearch + " = '" + searchCondition + "' ORDER BY " + columKey + " ASC";

        resultSet = executionQuery(connection, sql);

        try {
            while (resultSet.next()) {
                unit = new UnitBarcode(resultSet.getInt(columKey));
                tableValue.add(unit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        } finally {
            closeResultSet(resultSet);
        }
        return tableValue;
    }

    // metod to get primaryKey for update metod
    public ArrayList<PrcList> getPrimaryKeyPrcList(Connection connection, String table,
            String searchCondition, String columKey, String columSearch) {

        ResultSet resultSet;
        ArrayList<PrcList> tableValue = new ArrayList<>();
        PrcList unit;
        String sql = "SELECT " + columKey + " FROM " + table + " WHERE "
                + columSearch + " = '" + searchCondition + "' ORDER BY " + columKey + " ASC";

        resultSet = executionQuery(connection, sql);

        try {
            while (resultSet.next()) {
                unit = new PrcList(resultSet.getInt(columKey));
                tableValue.add(unit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        } finally {
            closeResultSet(resultSet);
        }
        return tableValue;
    }

    // metod to get primaryKey for update metod
    public int getPrimaryKeyInt(Connection connection, String table,
            String searchCondition, String columKey, String columSearch) {

        int primaryKey = 0;
        ResultSet resultSet = null;
        String sql = "SELECT " + columKey + " FROM " + table + " WHERE "
                + columSearch + " = '" + searchCondition + "'";
        System.out.println("query: " + sql);
        try {
            resultSet = executionQuery(connection, sql);
            while (resultSet.next()) {
                primaryKey = resultSet.getInt(columKey);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        } finally {
            closeResultSet(resultSet);
        }
        return primaryKey;
    }

    //select logref with two condition
    // metod to get primaryKey for update metod
    public int getLogRef(Connection connection, String table, String columKey,
            int searchCondition, String columSearch, int searchCondition2,
            String columSearch2) {

        int primaryKey = 0;
        ResultSet resultSet = null;
        String sql = "SELECT " + columKey + " FROM " + table + " WHERE "
                + columSearch + " = '" + searchCondition + "' AND " + columSearch2
                + " = '" + searchCondition2 + "'";
        try {
            resultSet = executionQuery(connection, sql);
            while (resultSet.next()) {
                primaryKey = resultSet.getInt(columKey);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        } finally {
            closeResultSet(resultSet);
        }
        return primaryKey;
    }

    // metod to get primaryKey for update metod
    public Date getModifiedDate(Connection connection, String table, String columKey,
            int searchCondition, String columSearch) {

        Date modifiedDate = null;
        ResultSet resultSet;
        String sql = "SELECT " + columKey + " FROM " + table + " WHERE "
                + columSearch + " = '" + searchCondition + "'";
        try {
            resultSet = executionQuery(connection, sql);
            while (resultSet.next()) {
                modifiedDate = resultSet.getDate(columKey);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modifiedDate;
    }
        //method to get clrNums logicalRefs
    public ArrayList<ClrNums> getClrNumsLogRef(Connection connection, String table,
            String columKey, String columSearch, int searchCondition) {
        ResultSet resultSet;
        ArrayList<ClrNums> tableValue = new ArrayList<>();
        ClrNums numLog;
        String sql = "SELECT " + columKey + " FROM " + table + " WHERE "
                + columSearch + " = '" + searchCondition + "' ORDER BY " + columKey + " ASC";

        resultSet = executionQuery(connection, sql);

        try {
            while (resultSet.next()) {
                numLog = new ClrNums(resultSet.getInt(columKey));
                tableValue.add(numLog);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        } finally {
            closeResultSet(resultSet);
        }
        return tableValue;
    }
    
    //method to get srvUnitA logicalRefs
    public ArrayList<SrvUnitA> getSrvUnitALogRef(Connection connection, String table,
            String columKey, String columSearch, int searchCondition) {
        ResultSet resultSet;
        ArrayList<SrvUnitA> tableValue = new ArrayList<>();
        SrvUnitA numLog;
        String sql = "SELECT " + columKey + " FROM " + table + " WHERE "
                + columSearch + " = '" + searchCondition + "' ORDER BY " + columKey + " ASC";

        resultSet = executionQuery(connection, sql);

        try {
            while (resultSet.next()) {
                numLog = new SrvUnitA(resultSet.getInt(columKey));
                tableValue.add(numLog);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        } finally {
            closeResultSet(resultSet);
        }
        return tableValue;
    }

    //method to get clCollatRisk logicalRefs
    public ArrayList<ClcollatrlRisk> getClCollatRiskLogRef(Connection connection, String table,
            String columKey, String columSearch, int searchCondition) {
        ResultSet resultSet;
        ArrayList<ClcollatrlRisk> tableValue = new ArrayList<>();
        ClcollatrlRisk numLog;
        String sql = "SELECT " + columKey + " FROM " + table + " WHERE "
                + columSearch + " = '" + searchCondition + "' ORDER BY " + columKey + " ASC";

        resultSet = executionQuery(connection, sql);

        try {
            while (resultSet.next()) {
                numLog = new ClcollatrlRisk(resultSet.getInt(columKey));
                tableValue.add(numLog);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        } finally {
            closeResultSet(resultSet);
        }
        return tableValue;
    }

    //method to get srvNums logicalRefs
    public ArrayList<SrvNums> getSrvNumsLogRef(Connection connection, String table,
            String columKey, String columSearch, int searchCondition) {
        ResultSet resultSet;
        ArrayList<SrvNums> tableValue = new ArrayList<>();
        SrvNums numLog;
        String sql = "SELECT " + columKey + " FROM " + table + " WHERE "
                + columSearch + " = '" + searchCondition + "' ORDER BY " + columKey + " ASC";

        resultSet = executionQuery(connection, sql);

        try {
            while (resultSet.next()) {
                numLog = new SrvNums(resultSet.getInt(columKey));
                tableValue.add(numLog);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        } finally {
            closeResultSet(resultSet);
        }
        return tableValue;
    }

    //method to get srvTot logicalRefs
    public ArrayList<SrvTot> getSrvTotLogRef(Connection connection, String table,
            String columKey, String columSearch, int searchCondition) {
        ResultSet resultSet;
        ArrayList<SrvTot> tableValue = new ArrayList<>();
        SrvTot numLog;
        String sql = "SELECT " + columKey + " FROM " + table + " WHERE "
                + columSearch + " = '" + searchCondition + "' ORDER BY " + columKey + " ASC";

        resultSet = executionQuery(connection, sql);

        try {
            while (resultSet.next()) {
                numLog = new SrvTot(resultSet.getInt(columKey));
                tableValue.add(numLog);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        } finally {
            closeResultSet(resultSet);
        }
        return tableValue;
    }

    //method to get stLine logicalRefs
    public ArrayList<StLine> getStLineLogRef(Connection connection, String table,
            String columKey, String columSearch, int searchCondition) {
        ResultSet resultSet;
        ArrayList<StLine> tableValue = new ArrayList<>();
        StLine numLog;
        String sql = "SELECT " + columKey + " FROM " + table + " WHERE "
                + columSearch + " = '" + searchCondition + "' ORDER BY " + columKey + " ASC";

        resultSet = executionQuery(connection, sql);

        try {
            while (resultSet.next()) {
                numLog = new StLine(resultSet.getInt(columKey));
                tableValue.add(numLog);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        } finally {
            closeResultSet(resultSet);
        }
        return tableValue;
    }

    //method to get log refs of CRDACREF table
    public ArrayList<CrdacRef> getCrdacLogRef(Connection connection, String table,
            String columKey, String columSearch, int searchCondition) {
        ResultSet resultSet;
        ArrayList<CrdacRef> tableValue = new ArrayList<>();
        CrdacRef numLog;
        String sql = "SELECT " + columKey + " FROM " + table + " WHERE "
                + columSearch + " = '" + searchCondition + "' ORDER BY " + columKey + " ASC";

        resultSet = executionQuery(connection, sql);

        try {
            while (resultSet.next()) {
                numLog = new CrdacRef(resultSet.getInt(columKey));
                tableValue.add(numLog);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        } finally {
            closeResultSet(resultSet);
        }
        return tableValue;
    }
    
    //to update primary key value in given table
    public void updateKey(Connection connection, int primaryKey, String table) {
        String sql = "UPDATE " + table + " SET LASTLREF = " + primaryKey + " WHERE ID = 1";
        try {
            System.out.println("sql query: " + sql);
            //wait();
            connection.createStatement().executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }
    
    // delete according to the LOGICALREF
    public String deleteLogRef(Connection connection, String tableName, String columnName, int conditionValue) {
        String sql;
        sql = "DELETE FROM " + tableName + " WHERE " + columnName + " = " + conditionValue;
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }
    
    // delete according to the LOGICALREF
    public String deleteStatement(Connection connection, String tableName, String condition) {
        String sql;
        sql = "DELETE FROM " + tableName + " WHERE " + condition;
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }
        
    //method to update the source refrances
    public void updateSource(Connection connection, String tableName, String updateCloumn,
            int updateValue, int searchValue) {
        String sql = "UPDATE " + tableName + " SET " + updateCloumn + " = " + updateValue
                + " WHERE LOGICALREF = " + searchValue;
        try {
            System.out.println("sql query: " + sql);
            //wait();
            connection.createStatement().executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }

    //*************************SYNC INSERT QUERY**********************************************
    //metod to prepare the insert metod and insert the data to db
    public String insertQ(Connection connection, String tableName, String[] columns,
            JsonObject data, int index, int logicalRef, int unitSetRef) {

        JSONArray ar;

        String sql = "INSERT INTO " + tableName + "(";

        for (int i = 0; i <= columns.length - 1; i++) {
            sql += columns[i];
            if (i < columns.length - 1) {
                sql += ",";
            }
        }
        sql += ") VALUES (";

        switch (tableName) {
            case CompanyConstants.COMPANY + "UNITSETF":
                for (int i = 0; i <= columns.length - 1; i++) {
                    ar = (JSONArray) data.getObject().get(columns[i]);
                    if (columns[i].equals("LOGICALREF")) {
                        sql += "'" + logicalRef + "'";
                    } else {
                        sql += "'" + ar.get(index) + "'";//veriler dogru almali!
                    }
                    if (i < columns.length - 1) {
                        sql += ",";
                    }
                }
                break;
            case CompanyConstants.COMPANY + "UNITSETL":
                for (int i = 0; i <= columns.length - 1; i++) {
                    ar = (JSONArray) data.getObject().get(columns[i]);
                    switch (columns[i]) {
                        case "LOGICALREF":
                            sql += "'" + logicalRef + "'";
                            break;
                        case "UNITSETREF":
                            sql += "'" + unitSetRef + "'";
                            break;
                        default:
                            sql += "'" + ar.get(index) + "'";//veriler dogru almali!
                            break;
                    }
                    if (i < columns.length - 1) {
                        sql += ",";
                    }
                }
                break;
        }

        sql += ")"; //this.executionUpdate(connection, sql);
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }

    
    //************************SYNC UPDATE QUERY*********************************
    //metod to prepare for UPDATE the table of given DB

    public String updateQ(Connection connection, String tableName, String[] colum,
            JsonObject data, int logicalRef, int a, int unitSetRef) {

        JSONArray ar;

        String sql = "UPDATE " + tableName + " SET ";

        switch (tableName) {
            case CompanyConstants.COMPANY + "UNITSETF":
                //TO GET NEW VALUES FOR UPDATE
                for (int i = 0; i <= colum.length - 1; i++) {
                    ar = (JSONArray) data.getObject().get(colum[i]);
                    if (colum[i].equals("LOGICALREF")) {
                        sql += "LOGICALREF = '" + logicalRef + "'";
                    } else {
                        sql += colum[i] + " = '" + ar.get(a) + "'";
                    }
                    if (i < colum.length - 1) {
                        sql += ", ";
                    }
                }
                sql += " WHERE LOGICALREF = '" + logicalRef + "'";
                break;
            case CompanyConstants.COMPANY + "UNITSETL":
                for (int i = 0; i <= colum.length - 1; i++) {
                    ar = (JSONArray) data.getObject().get(colum[i]);
                    switch (colum[i]) {
                        case "LOGICALREF":
                            sql += "LOGICALREF = '" + logicalRef + "'";
                            break;
                        case "UNITSETREF":
                            sql += "UNITSETREF = '" + unitSetRef + "'";
                            break;
                        default:
                            sql += colum[i] + " = '" + ar.get(a) + "'";//dogry my chek?
                            break;
                    }
                    if (i < colum.length - 1) {
                        sql += ", ";
                    }
                }

                sql += " WHERE LOGICALREF = '" + logicalRef + "'";

                break; //this.executionUpdate(connection, sql);
        }
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }


    //INSERT METOD FOR ITEMS AND RELATED TABLES
    public String insertItemQuery(Connection connection, JSONObject jsn, String tableName, String[] column,
            int logicalRef, int childRef, int itemRef, int unitLineRef, int index) {

        String sql = null;
        JSONArray ar;
        switch (tableName) {
            case CompanyConstants.COMPANY + "ITEMS":
                ar = (JSONArray) jsn.get("CAPIBLOCK_MODIFIEDDATE");
                if (ar.get(index).toString().equals("NULL")) {
                    sql = "INSERT INTO " + tableName + "(";
                    for (int i = 0; i <= column.length - 1; i++) {
                        if (!column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                            sql += column[i];
                        }
                        if (i < column.length - 1 && !column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                            sql += ",";
                        }
                    }
                    sql += ") VALUES (";

                    for (int i = 0; i <= column.length - 1; i++) {
                        ar = (JSONArray) jsn.get(column[i]);
                        switch (column[i]) {
                            case "LOGICALREF":
                                sql += "'" + logicalRef + "'";
                                break;
                            case "UNITSETREF":
                                sql += "'" + childRef + "'";
                                break;
                            case "CAPIBLOCK_MODIFIEDDATE":
                                break;
                            default:
                                sql += "'" + ar.get(index) + "'";
                                break;
                        }
                        if (i < column.length - 1 && !column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                            sql += ", ";
                        }
                    }
                    sql += ")";
                } else {
                    sql = "INSERT INTO " + tableName + "(";
                    for (int i = 0; i <= column.length - 1; i++) {
                        sql += column[i];
                        if (i < column.length - 1) {
                            sql += ",";
                        }
                    }
                    sql += ") VALUES (";

                    for (int i = 0; i <= column.length - 1; i++) {
                        ar = (JSONArray) jsn.get(column[i]);
                        switch (column[i]) {
                            case "LOGICALREF":
                                sql += "'" + logicalRef + "'";
                                break;
                            case "UNITSETREF":
                                sql += "'" + childRef + "'";
                                break;
                            default:
                                sql += "'" + ar.get(index) + "'";
                                break;
                        }
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    sql += ")";
                }
                break;
            case CompanyConstants.COMPANY + "ITMCLSAS":
                sql = "INSERT INTO " + tableName + "(";
                for (int i = 0; i <= column.length - 1; i++) {
                    sql += column[i];
                    if (i < column.length - 1) {
                        sql += ",";
                    }
                }
                sql += ") VALUES (";
                for (int i = 0; i <= column.length - 1; i++) {
                    ar = (JSONArray) jsn.get(column[i]);
                    switch (column[i]) {
                        case "LOGICALREF":
                            sql += "'" + logicalRef + "'";
                            break;
                        case "CHILDREF":
                            sql += "'" + childRef + "'";
                            break;
                        default:
                            sql += "'" + ar.get(index) + "'";
                            break;
                    }
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                }
                sql += ")";
                break;
            case CompanyConstants.COMPANY + "ITMUNITA":
                sql = "INSERT INTO " + tableName + "(";
                for (int i = 0; i <= column.length - 1; i++) {
                    sql += column[i];
                    if (i < column.length - 1) {
                        sql += ",";
                    }
                }
                sql += ") VALUES (";
                for (int i = 0; i <= column.length - 1; i++) {
                    ar = (JSONArray) jsn.get(column[i]);
                    switch (column[i]) {
                        case "LOGICALREF":
                            sql += "'" + logicalRef + "'";
                            break;
                        case "ITEMREF":
                            sql += "'" + itemRef + "'";
                            break;
                        case "UNITLINEREF":
                            sql += "'" + unitLineRef + "'";
                            break;
                        default:
                            sql += "'" + ar.get(index) + "'";
                            break;
                    }
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                }
                sql += ")";
                break;
            case CompanyConstants.COMPANY + "UNITBARCODE":
                sql = "INSERT INTO " + tableName + "(";
                for (int i = 0; i <= column.length - 1; i++) {
                    sql += column[i];
                    if (i < column.length - 1) {
                        sql += ",";
                    }
                }
                sql += ") VALUES (";
                for (int i = 0; i <= column.length - 1; i++) {
                    ar = (JSONArray) jsn.get(column[i]);
                    switch (column[i]) {
                        case "LOGICALREF":
                            sql += "'" + logicalRef + "'";
                            break;
                        case "ITMUNITAREF":
                            sql += "'" + childRef + "'";
                            break;
                        case "ITEMREF":
                            sql += "'" + itemRef + "'";
                            break;
                        case "UNITLINEREF":
                            sql += "'" + unitLineRef + "'";
                            break;
                        default:
                            sql += "'" + ar.get(index) + "'";
                            break;
                    }
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                }
                sql += ")";
                break;
            case CompanyConstants.COMPANY + "PRCLIST":
                ar = (JSONArray) jsn.get("CAPIBLOCK_MODIFIEDDATE");
                if (ar.get(index).toString().equals("NULL")) {
                    sql = "INSERT INTO " + tableName + "(";
                    for (int i = 0; i <= column.length - 1; i++) {
                        if (!column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                            sql += column[i];
                        }
                        if (i < column.length - 1 && !column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                            sql += ",";
                        }
                    }
                    sql += ") VALUES (";

                    for (int i = 0; i <= column.length - 1; i++) {
                        ar = (JSONArray) jsn.get(column[i]);
                        switch (column[i]) {
                            case "LOGICALREF":
                                sql += "'" + logicalRef + "'";
                                break;
                            case "CARDREF":
                                sql += "'" + itemRef + "'";
                                break;
                            case "UOMREF":
                                sql += "'" + childRef + "'";
                                break;
                            case "CAPIBLOCK_MODIFIEDDATE":
                                break;
                            default:
                                sql += "'" + ar.get(index) + "'";
                                break;
                        }
                        if (i < column.length - 1 && !column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                            sql += ", ";
                        }
                    }
                    sql += ")";
                } else {
                    sql = "INSERT INTO " + tableName + "(";
                    for (int i = 0; i <= column.length - 1; i++) {
                        sql += column[i];
                        if (i < column.length - 1) {
                            sql += ",";
                        }
                    }
                    sql += ") VALUES (";

                    for (int i = 0; i <= column.length - 1; i++) {
                        ar = (JSONArray) jsn.get(column[i]);
                        switch (column[i]) {
                            case "LOGICALREF":
                                sql += "'" + logicalRef + "'";
                                break;
                            case "CARDREF":
                                sql += "'" + itemRef + "'";
                                break;
                            case "UOMREF":
                                sql += "'" + childRef + "'";
                                break;
                            default:
                                sql += "'" + ar.get(index) + "'";
                                break;
                        }
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    sql += ")";
                }
                break; //this.executionUpdate(connection, sql);
        }
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }

    //UPDATE METOD FOR ITEMS AND RELATED TABLES
    public String updateItemQuery(Connection connection, JSONObject jsn, String tableName, String[] column,
            int logicalRef, int itemRef, int itmUnitARef, int unitLineRef, int index) {
        String sql = null;
        JSONArray ar;
        switch (tableName) {
            case CompanyConstants.COMPANY + "ITEMS":
                ar = (JSONArray) jsn.get("CAPIBLOCK_MODIFIEDDATE");
                if (ar.get(index).toString().equals("NULL")) {

                    sql = "UPDATE " + tableName + " SET ";
                    for (int i = 0; i <= column.length - 1; i++) {
                        ar = (JSONArray) jsn.get(column[i]);
                        switch (column[i]) {
                            case "LOGICALREF":
                                sql += "LOGICALREF = '" + logicalRef + "'";
                                break;
                            case "UNITSETREF":
                                sql += "UNITSETREF = '" + itmUnitARef + "'";
                                break;
                            case "LOWLEVELCODES1":
                                sql += "LOWLEVELCODES1 = '" + itemRef + "'";
                                break;
                            case "CAPIBLOCK_MODIFIEDDATE":
                                break;
                            default:
                                sql += column[i] + " = '" + ar.get(index) + "'";
                                break;
                        }
                        if (i < column.length - 1 && !column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                            sql += ",";
                        }
                    }
                    sql += " WHERE LOGICALREF = '" + logicalRef + "'";

                } else {
                    sql = "UPDATE " + tableName + " SET ";
                    for (int i = 0; i <= column.length - 1; i++) {
                        ar = (JSONArray) jsn.get(column[i]);
                        switch (column[i]) {
                            case "LOGICALREF":
                                sql += "LOGICALREF = '" + logicalRef + "'";
                                break;
                            case "UNITSETREF":
                                sql += "UNITSETREF = '" + itmUnitARef + "'";
                                break;
                            case "LOWLEVELCODES1":
                                sql += "LOWLEVELCODES1 = '" + itemRef + "'";
                                break;
                            default:
                                sql += column[i] + " = '" + ar.get(index) + "'";
                                break;
                        }
                        if (i < column.length - 1) {
                            sql += ",";
                        }
                    }
                    sql += " WHERE LOGICALREF = '" + logicalRef + "'";
                }
                break;
            case CompanyConstants.COMPANY + "ITMUNITA":
                sql = "UPDATE " + tableName + " SET ";
                for (int i = 0; i <= column.length - 1; i++) {
                    ar = (JSONArray) jsn.get(column[i]);
                    switch (column[i]) {
                        case "LOGICALREF":
                            sql += "LOGICALREF = '" + logicalRef + "'";
                            break;
                        case "ITEMREF":
                            sql += "ITEMREF = '" + itemRef + "'";
                            break;
                        case "UNITLINEREF":
                            sql += "UNITLINEREF = '" + unitLineRef + "'";
                            break;
                        default:
                            sql += column[i] + " = '" + ar.get(index) + "'";//dogry my chek?
                            break;
                    }
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                }

                sql += " WHERE LOGICALREF = '" + logicalRef + "'";

                break;
            case CompanyConstants.COMPANY + "UNITBARCODE":
                sql = "UPDATE " + tableName + " SET ";
                for (int i = 0; i <= column.length - 1; i++) {
                    ar = (JSONArray) jsn.get(column[i]);
                    switch (column[i]) {
                        case "LOGICALREF":
                            sql += "LOGICALREF = '" + logicalRef + "'";
                            break;
                        case "ITEMREF":
                            sql += "ITEMREF = '" + itemRef + "'";
                            break;
                        case "ITMUNITAREF":
                            sql += "ITMUNITAREF = '" + itmUnitARef + "'";
                            break;
                        case "UNITLINEREF":
                            sql += "UNITLINEREF = '" + unitLineRef + "'";
                            break;
                        default:
                            sql += column[i] + " = '" + ar.get(index) + "'";//dogry my chek?
                            break;
                    }
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                }

                sql += " WHERE LOGICALREF = '" + logicalRef + "'";

                break;
            case CompanyConstants.COMPANY + "PRCLIST":
                ar = (JSONArray) jsn.get("CAPIBLOCK_MODIFIEDDATE");
                if (ar.get(index).toString().equals("NULL")) {

                    sql = "UPDATE " + tableName + " SET ";
                    for (int i = 0; i <= column.length - 1; i++) {
                        ar = (JSONArray) jsn.get(column[i]);
                        switch (column[i]) {
                            case "LOGICALREF":
                                sql += "LOGICALREF = '" + logicalRef + "'";
                                break;
                            case "CARDREF":
                                sql += "CARDREF = '" + itemRef + "'";
                                break;
                            case "UOMREF":
                                sql += "'" + unitLineRef + "'";//chek it!
                                break;
                            case "CAPIBLOCK_MODIFIEDDATE":
                                break;
                            default:
                                sql += column[i] + " = '" + ar.get(index) + "'";
                                break;
                        }
                        if (i < column.length - 1 && !column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                            sql += ",";
                        }
                    }
                    sql += " WHERE LOGICALREF = '" + logicalRef + "'";

                } else {
                    sql = "UPDATE " + tableName + " SET ";
                    for (int i = 0; i <= column.length - 1; i++) {
                        ar = (JSONArray) jsn.get(column[i]);
                        switch (column[i]) {
                            case "LOGICALREF":
                                sql += "LOGICALREF = '" + logicalRef + "'";
                                break;
                            case "CARDREF":
                                sql += "CARDREF = '" + itemRef + "'";
                                break;
                            case "UOMREF":
                                sql += "'" + unitLineRef + "'";//chek it!
                                break;
                            default:
                                sql += column[i] + " = '" + ar.get(index) + "'";
                                break;
                        }
                        if (i < column.length - 1) {
                            sql += ",";
                        }
                    }
                    sql += " WHERE LOGICALREF = '" + logicalRef + "'";
                }
                break; //this.executionUpdate(connection, sql);
        }
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }

    // METHOD TO GET INSERT QUERY FOR ALL CARD TYPES 
    public String insertCards(Connection connection, JSONObject json, String tableName,
            String[] column, int logicalRef, int unitSetRef, int lowLevelCodes1, int index) {
        String sql;
        JSONArray ar;
        ar = (JSONArray) json.get("CAPIBLOCK_MODIFIEDDATE");
        if (ar.get(index).toString().equals("NULL")) {
            sql = "INSERT INTO " + tableName + "(";
            for (int i = 0; i <= column.length - 1; i++) {
                if (!column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                    sql += column[i];
                }
                if (i < column.length - 1 && !column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                    sql += ",";
                }
            }
            sql += ") VALUES (";

            for (int i = 0; i <= column.length - 1; i++) {
                ar = (JSONArray) json.get(column[i]);
                switch (column[i]) {
                    case "LOGICALREF":
                        sql += "'" + logicalRef + "'";
                        break;
                    case "CAPIBLOCK_MODIFIEDDATE":
                        break;
                    case "CLIENTREF":
                        sql += "'" + unitSetRef + "'";
                        break;
                    case "UNITSETREF":
                        sql += "'" + unitSetRef + "'";
                        break;
                    case "BANKREF":
                        sql += "'" + unitSetRef + "'";
                        break;
                    case "LOWLEVELCODES1":
                        sql += "'" + lowLevelCodes1 + "'";
                        break;
                    default:
                        sql += "'" + ar.get(index) + "'";
                        break;
                }
                if (i < column.length - 1 && !column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                    sql += ", ";
                }
            }
            sql += ")";
        } else {
            sql = "INSERT INTO " + tableName + "(";
            for (int i = 0; i <= column.length - 1; i++) {
                sql += column[i];
                if (i < column.length - 1) {
                    sql += ",";
                }
            }
            sql += ") VALUES (";

            for (int i = 0; i <= column.length - 1; i++) {
                ar = (JSONArray) json.get(column[i]);
                switch (column[i]) {
                    case "LOGICALREF":
                        sql += "'" + logicalRef + "'";
                        break;
                    case "CLIENTREF":
                        sql += "'" + unitSetRef + "'";
                        break;
                    case "UNITSETREF":
                        sql += "'" + unitSetRef + "'";
                        break;
                    case "BANKREF":
                        sql += "'" + unitSetRef + "'";
                        break;
                    case "LOWLEVELCODES1":
                        sql += "'" + lowLevelCodes1 + "'";
                        break;
                    default:
                        sql += "'" + ar.get(index) + "'";
                        break;
                }
                if (i < column.length - 1) {
                    sql += ", ";
                }
            }
            sql += ")";
        }
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }


    public String insertNums(Connection connection, JSONObject json, String tableName,
            String[] column, int logicalRef, int cardRef, int index) {

        String sql;
        JSONArray ar;
        sql = "INSERT INTO " + tableName + "(";
        for (int i = 0; i <= column.length - 1; i++) {
            sql += column[i];
            if (i < column.length - 1) {
                sql += ",";
            }
        }
        sql += ") VALUES (";
        for (int i = 0; i <= column.length - 1; i++) {
            ar = (JSONArray) json.get(column[i]);
            switch (column[i]) {
                case "LOGICALREF":
                    sql += "'" + logicalRef + "'";
                    break;
                case "CLCARDREF":
                    sql += "'" + cardRef + "'";
                    break;
                case "CARDREF":
                    sql += "'" + cardRef + "'";
                    break;
                case "UNITSETREF":
                    sql += "'" + cardRef + "'";
                    break;
                default:
                    sql += "'" + ar.get(index) + "'";
                    break;
            }
            if (i < column.length - 1) {
                sql += ", ";
            }
        }
        sql += ")";
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }

    public String insertSrvUnitA(Connection connection, JSONObject json, String tableName,
            String[] column, int logicalRef, int srvRef, int unitLineRef, int index) {
        String sql;
        JSONArray ar;
        sql = "INSERT INTO " + tableName + "(";
        for (int i = 0; i <= column.length - 1; i++) {
            sql += column[i];
            if (i < column.length - 1) {
                sql += ",";
            }
        }
        sql += ") VALUES (";
        for (int i = 0; i <= column.length - 1; i++) {
            ar = (JSONArray) json.get(column[i]);
            switch (column[i]) {
                case "LOGICALREF":
                    sql += "'" + logicalRef + "'";
                    break;
                case "SRVREF":
                    sql += "'" + srvRef + "'";
                    break;
                case "STOCKREF":
                    sql += "'" + srvRef + "'";
                    break;
                case "UNITLINEREF":
                    sql += "'" + unitLineRef + "'";
                    break;
                default:
                    sql += "'" + ar.get(index) + "'";
                    break;
            }
            if (i < column.length - 1) {
                sql += ", ";
            }
        }
        sql += ")";
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }

    public String insertInvoice(Connection connection, JSONObject json, String tableName,
            String[] column, int logicalRef, int clientRef, int recieverRef, int salesManRef, int index) {
        String sql;
        JSONArray ar;
        ar = (JSONArray) json.get("CAPIBLOCK_MODIFIEDDATE");
        if (ar.get(index).toString().equals("NULL")) {
            sql = "INSERT INTO " + tableName + "(";
            for (int i = 0; i <= column.length - 1; i++) {
                if (!column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                    sql += column[i];
                }
                if (i < column.length - 1 && !column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                    sql += ",";
                }
            }
            sql += ") VALUES (";

            for (int i = 0; i <= column.length - 1; i++) {
                ar = (JSONArray) json.get(column[i]);
                switch (column[i]) {
                    case "LOGICALREF":
                        sql += "'" + logicalRef + "'";
                        break;
                    case "CAPIBLOCK_MODIFIEDDATE":
                        break;
                    case "CLIENTREF":
                        sql += "'" + clientRef + "'";
                        break;
                    case "RECVREF":
                        sql += "'" + recieverRef + "'";
                        break;
                    case "SALESMANREF":
                        sql += "'" + salesManRef + "'";
                        break;
                    default:
                        sql += "'" + ar.get(index) + "'";
                        break;
                }
                if (i < column.length - 1 && !column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                    sql += ", ";
                }
            }
            sql += ")";
        } else {
            sql = "INSERT INTO " + tableName + "(";
            for (int i = 0; i <= column.length - 1; i++) {
                sql += column[i];
                if (i < column.length - 1) {
                    sql += ",";
                }
            }
            sql += ") VALUES (";

            for (int i = 0; i <= column.length - 1; i++) {
                ar = (JSONArray) json.get(column[i]);
                switch (column[i]) {
                    case "LOGICALREF":
                        sql += "'" + logicalRef + "'";
                        break;
                    case "CLIENTREF":
                        sql += "'" + clientRef + "'";
                        break;
                    case "RECVREF":
                        sql += "'" + recieverRef + "'";
                        break;
                    case "SALESMANREF":
                        sql += "'" + salesManRef + "'";
                        break;
                    default:
                        sql += "'" + ar.get(index) + "'";
                        break;
                }
                if (i < column.length - 1) {
                    sql += ", ";
                }
            }
            sql += ")";
        }
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }

    public String insertFiche(Connection connection, JSONObject json, String tableName,
            String[] column, int logicalRef, int invoiceRef, int clientRef, int recieverRef,
            int salesManRef, int index) {
        String sql;
        JSONArray ar;
        ar = (JSONArray) json.get("CAPIBLOCK_MODIFIEDDATE");
        if (ar.get(index).toString().equals("NULL")) {
            sql = "INSERT INTO " + tableName + "(";
            for (int i = 0; i <= column.length - 1; i++) {
                if (!column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                    sql += column[i];
                }
                if (i < column.length - 1 && !column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                    sql += ",";
                }
            }
            sql += ") VALUES (";

            for (int i = 0; i <= column.length - 1; i++) {
                ar = (JSONArray) json.get(column[i]);
                switch (column[i]) {
                    case "LOGICALREF":
                        sql += "'" + logicalRef + "'";
                        break;
                    case "CAPIBLOCK_MODIFIEDDATE":
                        break;
                    case "INVOICEREF":
                        sql += "'" + invoiceRef + "'";
                        break;
                    case "CLIENTREF":
                        sql += "'" + clientRef + "'";
                        break;
                    case "RECVREF":
                        sql += "'" + recieverRef + "'";
                        break;
                    case "SALESMANREF":
                        sql += "'" + salesManRef + "'";
                        break;
                    default:
                        sql += "'" + ar.get(index) + "'";
                        break;
                }
                if (i < column.length - 1 && !column[i].equals("CAPIBLOCK_MODIFIEDDATE")) {
                    sql += ", ";
                }
            }
            sql += ")";
        } else {
            sql = "INSERT INTO " + tableName + "(";
            for (int i = 0; i <= column.length - 1; i++) {
                sql += column[i];
                if (i < column.length - 1) {
                    sql += ",";
                }
            }
            sql += ") VALUES (";

            for (int i = 0; i <= column.length - 1; i++) {
                ar = (JSONArray) json.get(column[i]);
                switch (column[i]) {
                    case "LOGICALREF":
                        sql += "'" + logicalRef + "'";
                        break;
                    case "INVOICEREF":
                        sql += "'" + invoiceRef + "'";
                        break;
                    case "CLIENTREF":
                        sql += "'" + clientRef + "'";
                        break;
                    case "RECVREF":
                        sql += "'" + recieverRef + "'";
                        break;
                    case "SALESMANREF":
                        sql += "'" + salesManRef + "'";
                        break;
                    default:
                        sql += "'" + ar.get(index) + "'";
                        break;
                }
                if (i < column.length - 1) {
                    sql += ", ";
                }
            }
            sql += ")";
        }
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }

    public String insertStLine(Connection connection, JSONObject json, String tableName,
            String[] column, int logicalRef, int ficheRef, int itemsRef, int uomRef, int usRef,
            int invoiceRef, int clientRef, int salesManRef, int index) {
        String sql;
        JSONArray ar;
        sql = "INSERT INTO " + tableName + "(";
        for (int i = 0; i <= column.length - 1; i++) {
            sql += column[i];
            if (i < column.length - 1) {
                sql += ",";
            }
        }
        sql += ") VALUES (";
        for (int i = 0; i <= column.length - 1; i++) {
            ar = (JSONArray) json.get(column[i]);
            switch (column[i]) {
                case "LOGICALREF":
                    sql += "'" + logicalRef + "'";
                    break;
                case "STOCKREF":
                    sql += "'" + itemsRef + "'";
                    break;
                case "STFICHEREF":
                    sql += "'" + ficheRef + "'";
                    break;
                case "INVOICEREF":
                    sql += "'" + invoiceRef + "'";
                    break;
                case "UOMREF":
                    sql += "'" + uomRef + "'";
                    break;
                case "USREF":
                    sql += "'" + usRef + "'";
                    break;
                case "CLIENTREF":
                    sql += "'" + clientRef + "'";
                    break;
                case "SALESMANREF":
                    sql += "'" + salesManRef + "'";
                    break;
                default:
                    sql += "'" + ar.get(index) + "'";
                    break;
            }
            if (i < column.length - 1) {
                sql += ", ";
            }
        }
        sql += ")";
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }

    // METHOD TO GET INSERT QUERY FOR ALL CARD TYPES 
    public String insertPayTrans(Connection connection, JSONObject json, String tableName,
            String[] column, int logicalRef, int cardRef, int fishRef, int index) {
        String sql;
        JSONArray ar;
        ar = (JSONArray) json.get("BANKPAYDATE");
        if (ar.get(index).toString().equals("NULL")) {
            sql = "INSERT INTO " + tableName + "(";
            for (int i = 0; i <= column.length - 1; i++) {
                if (!column[i].equals("BANKPAYDATE")) {
                    sql += column[i];
                }
                if (i < column.length - 1 && !column[i].equals("BANKPAYDATE")) {
                    sql += ",";
                }
            }
            sql += ") VALUES (";

            for (int i = 0; i <= column.length - 1; i++) {
                ar = (JSONArray) json.get(column[i]);
                switch (column[i]) {
                    case "LOGICALREF":
                        sql += "'" + logicalRef + "'";
                        break;
                    case "BANKPAYDATE":
                        break;
                    case "CARDREF":
                        sql += "'" + cardRef + "'";
                        break;
                    case "FICHEREF":
                        sql += "'" + fishRef + "'";
                        break;
                    default:
                        sql += "'" + ar.get(index) + "'";
                        break;
                }
                if (i < column.length - 1 && !column[i].equals("BANKPAYDATE")) {
                    sql += ", ";
                }
            }
            sql += ")";
        } else {
            sql = "INSERT INTO " + tableName + "(";
            for (int i = 0; i <= column.length - 1; i++) {
                sql += column[i];
                if (i < column.length - 1) {
                    sql += ",";
                }
            }
            sql += ") VALUES (";

            for (int i = 0; i <= column.length - 1; i++) {
                ar = (JSONArray) json.get(column[i]);
                switch (column[i]) {
                    case "LOGICALREF":
                        sql += "'" + logicalRef + "'";
                        break;
                    case "CARDREF":
                        sql += "'" + cardRef + "'";
                        break;
                    case "FICHEREF":
                        sql += "'" + fishRef + "'";
                        break;
                    default:
                        sql += "'" + ar.get(index) + "'";
                        break;
                }
                if (i < column.length - 1) {
                    sql += ", ";
                }
            }
            sql += ")";
        }
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }

    // METHOD TO GET INSERT QUERY FOR ALL CARD TYPES 
    public String insertSrvNums(Connection connection, JSONObject json, String tableName,
            String[] column, int logicalRef, int cardRef, int index) {
        String sql;
        JSONArray ar;
        ar = (JSONArray) json.get("LASTTRDATE");
        if (ar.get(index).toString().equals("NULL")) {
            sql = "INSERT INTO " + tableName + "(";
            for (int i = 0; i <= column.length - 1; i++) {
                if (!column[i].equals("LASTTRDATE")) {
                    sql += column[i];
                }
                if (i < column.length - 1 && !column[i].equals("LASTTRDATE")) {
                    if (!column[i + 1].equals("LASTTRDATE")) {
                        sql += ",";
                    }
                }
            }
            sql += ") VALUES (";

            for (int i = 0; i <= column.length - 1; i++) {
                ar = (JSONArray) json.get(column[i]);
                switch (column[i]) {
                    case "LOGICALREF":
                        sql += "'" + logicalRef + "'";
                        break;
                    case "CARDREF":
                        sql += "'" + cardRef + "'";
                        break;
                    case "LASTTRDATE":
                        break;
                    default:
                        sql += "'" + ar.get(index) + "'";
                        break;
                }
                if (i < column.length - 1 && !column[i].equals("LASTTRDATE")) {
                    if (!column[i + 1].equals("LASTTRDATE")) {
                        sql += ", ";
                    }
                }
            }
            sql += ")";
        } else {
            sql = "INSERT INTO " + tableName + "(";
            for (int i = 0; i <= column.length - 1; i++) {
                sql += column[i];
                if (i < column.length - 1) {
                    sql += ",";
                }
            }
            sql += ") VALUES (";

            for (int i = 0; i <= column.length - 1; i++) {
                ar = (JSONArray) json.get(column[i]);
                switch (column[i]) {
                    case "LOGICALREF":
                        sql += "'" + logicalRef + "'";
                        break;
                    case "CARDREF":
                        sql += "'" + cardRef + "'";
                        break;
                    default:
                        sql += "'" + ar.get(index) + "'";
                        break;
                }
                if (i < column.length - 1) {
                    sql += ", ";
                }
            }
            sql += ")";
        }
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }

    //method to get insert query for KSLINES
    public String insertKsLine(Connection connection, JSONObject json, String tableName,
            String[] column, int logicalRef, int cardRef, int transRef, int index) {
        String sql;
        JSONArray array, modifiedDate, date;
        modifiedDate = (JSONArray) json.get("CAPIBLOCK_MODIFIEDDATE");
        date = (JSONArray) json.get("DATE_");

        sql = "INSERT INTO " + tableName + "(";
        for (int i = 0; i <= column.length - 1; i++) {
            switch (column[i]) {
                case "CAPIBLOCK_MODIFIEDDATE":
                    if (!modifiedDate.get(index).toString().equals("NULL")) {
                        sql += column[i];
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    break;
                case "DATE_":
                    if (!date.get(index).toString().equals("NULL")) {
                        sql += column[i];
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    break;
                default:
                    sql += column[i];
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
            }
        }
        sql += ") VALUES (";

        for (int i = 0; i <= column.length - 1; i++) {
            array = (JSONArray) json.get(column[i]);
            switch (column[i]) {
                case "LOGICALREF":
                    sql += "'" + logicalRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "CAPIBLOCK_MODIFIEDDATE":
                    if (!modifiedDate.get(index).toString().equals("NULL")) {
                        sql += "'" + array.get(index) + "'";
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    break;
                case "DATE_":
                    if (!date.get(index).toString().equals("NULL")) {
                        sql += "'" + array.get(index) + "'";
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    break;
                case "CARDREF":
                    sql += "'" + cardRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "TRANSREF":
                    sql += "'" + transRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "CLIENTREF":
                    sql += "'" + cardRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "SOURCEFREF":
                    sql += "'" + transRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                default:
                    sql += "'" + array.get(index) + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
            }
        }
        sql += ")";

        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }

    //method to get insert query for KSLINES
    public String insertBnfLine(Connection connection, JSONObject json, String tableName,
            String[] column, int logicalRef, int bankRef, int bankAccRef, int clientRef,
            int sourcefRef, int index) {
        String sql;
        JSONArray array, modifiedDate, date, transDueDate, tranGrpDate;
        modifiedDate = (JSONArray) json.get("CAPIBLOCK_MODIFIEDDATE");
        date = (JSONArray) json.get("DATE_");
        transDueDate = (JSONArray) json.get("TRANSDUEDATE");
        tranGrpDate = (JSONArray) json.get("TRANGRPDATE");

        sql = "INSERT INTO " + tableName + "(";
        for (int i = 0; i <= column.length - 1; i++) {
            switch (column[i]) {
                case "CAPIBLOCK_MODIFIEDDATE":
                    if (!modifiedDate.get(index).toString().equals("NULL")) {
                        sql += column[i];
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    break;
                case "DATE_":
                    if (!date.get(index).toString().equals("NULL")) {
                        sql += column[i];
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    break;
                case "TRANSDUEDATE":
                    if (!transDueDate.get(index).toString().equals("NULL")) {
                        sql += column[i];
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    break;
                case "TRANGRPDATE":
                    if (!tranGrpDate.get(index).toString().equals("NULL")) {
                        sql += column[i];
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    break;
                default:
                    sql += column[i];
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
            }
        }

        sql += ") VALUES (";

        for (int i = 0; i <= column.length - 1; i++) {
            array = (JSONArray) json.get(column[i]);
            switch (column[i]) {
                case "LOGICALREF":
                    sql += "'" + logicalRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "CAPIBLOCK_MODIFIEDDATE":
                    if (!modifiedDate.get(index).equals("NULL")) {
                        sql += "'" + array.get(index) + "'";
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    break;
                case "DATE_":
                    if (!date.get(index).equals("NULL")) {
                        sql += "'" + array.get(index) + "'";
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    break;
                case "TRANSDUEDATE":
                    if (!transDueDate.get(index).equals("NULL")) {
                        sql += "'" + array.get(index) + "'";
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    break;
                case "TRANGRPDATE":
                    if (!tranGrpDate.get(index).equals("NULL")) {
                        sql += "'" + array.get(index) + "'";
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    break;
                case "BANKREF":
                    sql += "'" + bankRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "BNACCREF":
                    sql += "'" + bankAccRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "CLIENTREF":
                    sql += "'" + clientRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "SOURCEFREF":
                    sql += "'" + sourcefRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                default:
                    sql += "'" + array.get(index) + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
            }
        }
        sql += ")";

        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }
    
        public String updateStFiche(Connection connection, JSONObject json, String tableName,
            String[] column, int logicalRef, int invoiceRef, int clientRef, int recieverRef,
            int salesManRef, int index) {

        JSONArray array;
        JSONArray modifiedDate = (JSONArray) json.get("CAPIBLOCK_MODIFIEDDATE");
        JSONArray date = (JSONArray) json.get("DATE_");

        String sql = "UPDATE " + tableName + " SET ";
        //TO GET NEW VALUES FOR UPDATE
        for (int i = 0; i <= column.length - 1; i++) {
            array = (JSONArray) json.get(column[i]);
            switch (column[i]) {
                case "LOGICALREF":
                    sql += "LOGICALREF = '" + logicalRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "CAPIBLOCK_MODIFIEDDATE":
                    if (!modifiedDate.get(index).equals("NULL")) {
                        sql += column[i] + " = '" + array.get(index) + "'";
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    break;
                case "DATE_":
                    if (!date.get(index).equals("NULL")) {
                        sql += column[i] + " = '" + array.get(index) + "'";
                        if (i < column.length - 1) {
                            sql += ", ";
                        }
                    }
                    break;
                case "INVOICEREF":
                    sql += "INVOICEREF = '" + invoiceRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "RECVREF":
                    sql += "RECVREF = '" + recieverRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "CLIENTREF":
                    sql += "CLIENTREF = '" + clientRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "SALESMANREF":
                    sql += "SALESMANREF = '" + salesManRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                default:
                    sql += column[i] + " = '" + array.get(index) + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
            }
        }
        sql += " WHERE LOGICALREF = '" + logicalRef + "'";
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }

    public String updateStLine(Connection connection, JSONObject json, String tableName,
            String[] column, int logicalRef, int ficheRef, int itemsRef, int uomRef, int usRef,
            int invoiceRef, int clientRef, int salesManRef, int index) {

        JSONArray array;

        String sql = "UPDATE " + tableName + " SET ";
        //TO GET NEW VALUES FOR UPDATE
        for (int i = 0; i <= column.length - 1; i++) {
            array = (JSONArray) json.get(column[i]);
            switch (column[i]) {
                case "LOGICALREF":
                    sql += "LOGICALREF = '" + logicalRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "STOCKREF":
                    sql += "STOCKREF = '" + itemsRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "STFICHEREF":
                    sql += "STFICHEREF = '" + ficheRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "INVOICEREF":
                    sql += "INVOICEREF = '" + invoiceRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "UOMREF":
                    sql += "UOMREF = '" + uomRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "USREF":
                    sql += "USREF = '" + usRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "CLIENTREF":
                    sql += "CLIENTREF = '" + clientRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                case "SALESMANREF":
                    sql += "SALESMANREF = '" + salesManRef + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
                default:
                    sql += column[i] + " = '" + array.get(index) + "'";
                    if (i < column.length - 1) {
                        sql += ", ";
                    }
                    break;
            }
        }
        sql += " WHERE LOGICALREF = '" + logicalRef + "'";
        System.out.println(sql);
        return this.executionUpdate(connection, sql, tableName);
    }
}

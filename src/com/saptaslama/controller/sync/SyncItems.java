/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sync;

import com.saptaslama.controller.CompanyConstants;
import com.saptaslama.controller.DbConnection;
import com.saptaslama.controller.receiver.ItemsReceiver;
import com.saptaslama.model.Items;
import com.saptaslama.model.ItmUnitA;
import com.saptaslama.model.Itmclsas;
import com.saptaslama.model.PrcList;
import com.saptaslama.model.UnitBarcode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class SyncItems {

    private ItemsReceiver items;

    //using local date for manupulation
    private DbConnection dbLocal;
    private String[] columnItems, columnItmUnitA, columnItmclsas, columnPrcList,
            columnUnitBarcode;

    //items
    private final String tableNameItems = CompanyConstants.COMPANY + "ITEMS";
    private final String tableNameItmUnitA = CompanyConstants.COMPANY + "ITMUNITA";
    private final String tableNameItmclsas = CompanyConstants.COMPANY + "ITMCLSAS";
    private final String tableNamePrcList = CompanyConstants.COMPANY + "PRCLIST";
    private final String tableNameUnitBarcode = CompanyConstants.COMPANY + "UNITBARCODE";

    // seq
    private final String tableNameItemsSeq = tableNameItems + "SEQ";
    private final String tableNameItmUnitASeq = tableNameItmUnitA + "SEQ";
    private final String tableNameItmclsasSeq = tableNameItmclsas + "SEQ";
    private final String tableNamePrcListSeq = tableNamePrcList + "SEQ";
    private final String tableNameUnitBarcodeSeq = tableNameUnitBarcode + "SEQ";

    private Connection connection;

    public SyncItems(ItemsReceiver items) {

        this.items = items;

        dbLocal = new DbConnection();
    }

    //initialize metod
    public void init() {
        ResultSet resultSetItems, resultSetItmUnitA, resultSetItmclsas, resultSetPrcList,
            resultSetUnitBarcode;
        
        String fileNameItems = "Items.json";
        String fileNameItmclsas = "Itmclsas.json";
        String fileNameUnitA = "ItmUnitA.json";
        String fileNameUnitBarcode = "UnitBarcode.json";
        String fileNamePrcList = "PrcList.json";

        //geting connection to local db
        connection = dbLocal.getConnection();

        //geting local tables resultSet's
        resultSetItems = dbLocal.querySelectStatement(connection, tableNameItems, "LOGICALREF != 1");
        resultSetItmUnitA = dbLocal.querySelectAll(connection, tableNameItmUnitA);
        resultSetItmclsas = dbLocal.querySelectAll(connection, tableNameItmclsas);
        resultSetPrcList = dbLocal.querySelectAll(connection, tableNamePrcList);
        resultSetUnitBarcode = dbLocal.querySelectAll(connection, tableNameUnitBarcode);

        //geting local db tables column names
        System.out.println("\n*********" + tableNameItems + " table column names***************");
        columnItems = items.getColumnNames(resultSetItems);

        System.out.println("\n*********" + tableNameItmUnitA + " table column names***************");
        columnItmUnitA = items.getColumnNames(resultSetItmUnitA);

        System.out.println("\n*********" + tableNameItmclsas + " table column names***************");
        columnItmclsas = items.getColumnNames(resultSetItmclsas);

        System.out.println("\n*********" + tableNamePrcList + " table column names***************");
        columnPrcList = items.getColumnNames(resultSetPrcList);

        System.out.println("\n*********" + tableNameUnitBarcode + " table column names***************");
        columnUnitBarcode = items.getColumnNames(resultSetUnitBarcode);

        //sync ITEMS table
        syncItem(items.getItemsArrayList(items.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameItems)), items.getJsonObjectFromFile(
                        CompanyConstants.FILE_PATH_RECEIVE + fileNameItems));

        //sync ITMCLSAS table
        syncItmclsas(items.getItmclsasArrayList(items.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameItmclsas)), items.getJsonObjectFromFile(
                        CompanyConstants.FILE_PATH_RECEIVE + fileNameItmclsas));

        //sync ITMUNITA table
        syncUpdateUnitA(items.getItmUnitAArrayList(items.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNameUnitA)), items.getJsonObjectFromFile(
                        CompanyConstants.FILE_PATH_RECEIVE + fileNameUnitA));

        //sync UNITBARCODE table
        syncUpdateBarcode(items.getUnitBarcodeArrayList(items.getJsonObjectFromFile(
                CompanyConstants.FILE_PATH_RECEIVE + fileNameUnitBarcode)), 
                items.getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameUnitBarcode));

        //sync PRCLIST table
        syncUpdatePrcList(items.getPrcListArrayList(items.getJsonObjectFromFile(CompanyConstants
                .FILE_PATH_RECEIVE + fileNamePrcList)), items.getJsonObjectFromFile(
                        CompanyConstants.FILE_PATH_RECEIVE + fileNamePrcList));

        //CLOSE ALL CONNECTIONS
        dbLocal.closeConnection(connection);
        dbLocal.closeResultSet(resultSetItems);
        dbLocal.closeResultSet(resultSetItmUnitA);
        dbLocal.closeResultSet(resultSetItmclsas);
        dbLocal.closeResultSet(resultSetUnitBarcode);
        dbLocal.closeResultSet(resultSetPrcList);
        dbLocal = null;
        items = null;
        columnItems = null;
        columnItmUnitA = null;
        columnItmclsas = null;
        columnPrcList = null;
        columnUnitBarcode = null;
    }

    // metod to sync data from file to local db
    public void syncItem(ArrayList<Items> itemCloud, JSONObject jsonItems) {
        for (int i = 0; i < itemCloud.size(); i++) {

            int itemLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameItems,
                    String.valueOf(itemCloud.get(i).getIsonr()), "LOGICALREF", "ISONR");

            int unitSetRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "UNITSETF",
                    String.valueOf(itemCloud.get(i).getUnitsetref()), "LOGICALREF", "SPECODE");

            if (itemLogRef != 0) {
                dbLocal.updateItemQuery(connection, jsonItems,
                        tableNameItems, columnItems, itemLogRef, 0, unitSetRef, 0, i);

                // here we update items table to change LOWLEVELCODE! value
                int lowLevelCode = dbLocal.getPrimaryKeyInt(connection, tableNameItems,
                        String.valueOf(itemLogRef - 1), "LOWLEVELCODES1", "LOGICALREF");
                lowLevelCode = lowLevelCode + 1;
                dbLocal.updateItemQuery(connection, jsonItems, tableNameItems,
                        columnItems, itemLogRef, lowLevelCode, unitSetRef, 0, i);

            } else {
                // INSERT ITEMS TO THE RELETAD TABLE
                int newItemLogicalRef = dbLocal.getPrimaryKeyInt(connection, tableNameItemsSeq,
                        "1", "LASTLREF", "ID");
                newItemLogicalRef = newItemLogicalRef + 1;

                dbLocal.insertItemQuery(connection, jsonItems,
                        tableNameItems, columnItems, newItemLogicalRef, unitSetRef, 0, 0, i);
                //  update ITEMSSEQ tables LASTLREF value with new value
                if (dbLocal.getPrimaryKeyInt(connection, tableNameItems,
                        String.valueOf(newItemLogicalRef), "LOGICALREF", "LOGICALREF") == newItemLogicalRef) {

                    dbLocal.updateKey(connection, newItemLogicalRef, tableNameItemsSeq);

                    // here we update items table to change LOWLEVELCODE! value
                    int lowLevelCode = dbLocal.getPrimaryKeyInt(connection, tableNameItems,
                            String.valueOf(newItemLogicalRef - 1), "LOWLEVELCODES1", "LOGICALREF");
                    lowLevelCode = lowLevelCode + 1;
                    dbLocal.updateItemQuery(connection, jsonItems, tableNameItems,
                            columnItems, newItemLogicalRef, lowLevelCode, unitSetRef, 0, i);
                }
            }
        }
    }

    // metod to sync and insert ITMCLSAS table values
    public void syncItmclsas(ArrayList<Itmclsas> itmclsasFromCloud, JSONObject jsonItmclsas) {
        for (int i = 0; i < itmclsasFromCloud.size(); i++) {
            int itemLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameItems,
                    String.valueOf(itmclsasFromCloud.get(i).getChildRef()), "LOGICALREF", "ISONR");

            if (itemLogRef != 0) {

                int itmclsasLogRef = dbLocal.getPrimaryKeyInt(connection,
                        tableNameItmclsas, String.valueOf(itemLogRef), "LOGICALREF", "CHILDREF");
                if (itmclsasLogRef == 0) {
                    int newItmclsasLogicalRef = dbLocal.getPrimaryKeyInt(connection, tableNameItmclsasSeq,
                            "1", "LASTLREF", "ID");

                    newItmclsasLogicalRef = newItmclsasLogicalRef + 1;
                    dbLocal.insertItemQuery(connection, jsonItmclsas,
                            tableNameItmclsas, columnItmclsas, newItmclsasLogicalRef,
                            itemLogRef, 0, 0, i);//chald ref update etmeli bolya
                    //  update ITMCLSASSEQ tables LASTLREF value with new value
                    if (dbLocal.getPrimaryKeyInt(connection, tableNameItmclsas,
                            String.valueOf(newItmclsasLogicalRef), "LOGICALREF", "LOGICALREF") == newItmclsasLogicalRef) {

                        dbLocal.updateKey(connection, newItmclsasLogicalRef, tableNameItmclsasSeq);
                    }
                }
            } else {
                System.err.println("ITMCLSAS table'de hata var! ITEMREF = 0");
            }
        }
    }

    //metod to sycn and update prcList to the related table
    private void syncUpdatePrcList(ArrayList<PrcList> priceFromCloud, JSONObject jsonPrcList) {
        //int counter = 0;
        for (int a = 0; a < priceFromCloud.size(); a++) {
            int itemLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameItems,
                    String.valueOf(priceFromCloud.get(a).getCardRef()), "LOGICALREF", "ISONR");
//            ArrayList<Lg001PrcList> prcLogRefs = dbLocal.getPrimaryKeyPrcList(connection,
//                        tableNamePrcList, String.valueOf(itemLogRef), "LOGICALREF", "CARDREF");

            if (itemLogRef != 0) {
                int cardRef = itemLogRef;

                int prcLogRef = dbLocal.getPrimaryKeyInt(connection, tableNamePrcList,
                        String.valueOf(priceFromCloud.get(a).getLogicalRef()), "LOGICALREF", "GENIUSSHPNR");

                int uomRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "UNITSETL",
                        String.valueOf(priceFromCloud.get(a).getUomRef()), "LOGICALREF", "WIDTH");

                if (prcLogRef != 0) {
                    //int prcListLogRef = prcLogRefs.get(counter).getLogicalRef();

                    dbLocal.deleteLogRef(connection, tableNamePrcList, "LOGICALREF", prcLogRef);
                    dbLocal.insertItemQuery(connection, jsonPrcList,
                            tableNamePrcList, columnPrcList, prcLogRef, uomRef,
                            cardRef, 0, a);
                    //counter++;
                } else {
                    System.out.println("counter uly localPrcListden: ");
                    int newPrcListLogRef = dbLocal.getPrimaryKeyInt(connection,
                            tableNamePrcListSeq, "1", "LASTLREF", "ID");

                    newPrcListLogRef = newPrcListLogRef + 1;
                    dbLocal.insertItemQuery(connection, jsonPrcList, tableNamePrcList,
                            columnPrcList, newPrcListLogRef, uomRef, cardRef, 0, a);
                    //update PRCLISTSEQ tables LASTLREF value with new value
                    if (dbLocal.getPrimaryKeyInt(connection, tableNamePrcList,
                            String.valueOf(newPrcListLogRef), "LOGICALREF", "LOGICALREF") == newPrcListLogRef) {

                        dbLocal.updateKey(connection, newPrcListLogRef, tableNamePrcListSeq);
                    }
                }
            } else {
                System.err.println("PrcList'de hata var!");
            }

        }

    }

    //metod to update and sync data to db
    private void syncUpdateBarcode(ArrayList<UnitBarcode> fromCloudBarcode, JSONObject jsonUnitBarcode) {

        System.out.println("UPDATE UNITBARCODE TABLE!");
        //int counter = 0;
        for (int w = 0; w < fromCloudBarcode.size(); w++) {

            int itemLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameItems,
                    String.valueOf(fromCloudBarcode.get(w).getItemRef()), "LOGICALREF", "ISONR");

            if (itemLogRef != 0) {
//                ArrayList<Lg001UnitBarcode> localBarcode = dbLocal.getPrimaryKeyBarcode(connection,
//                        tableNameUnitBarcode, String.valueOf(itemLogRef),
//                        "LOGICALREF", "ITEMREF");

                int unitBarcodeRef = dbLocal.getPrimaryKeyInt(connection, tableNameUnitBarcode,
                        String.valueOf(fromCloudBarcode.get(w).getLogicalRef()), "LOGICALREF", "SITEID");

                int itmUnitARef = dbLocal.getPrimaryKeyInt(connection, tableNameItmUnitA,
                        String.valueOf(fromCloudBarcode.get(w).getItmUnitARef()), "LOGICALREF", "WIDTH");//unitA table should be already inserted

                int unitLineRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "UNITSETL",
                        String.valueOf(fromCloudBarcode.get(w).getUnitLineRef()), "LOGICALREF", "WIDTH");//unitSetL table should be already inserted

                if (unitBarcodeRef != 0) {
                    System.out.println("we: " + w
                            + "\nlocalBarcode size: " + unitBarcodeRef);
                    //int unitBarcodeLogRef = localBarcode.get(counter).getLogicalRef();

                    dbLocal.deleteLogRef(connection, tableNameUnitBarcode, "LOGICALREF", unitBarcodeRef);
                    dbLocal.insertItemQuery(connection, jsonUnitBarcode,
                            tableNameUnitBarcode, columnUnitBarcode, unitBarcodeRef, itmUnitARef,
                            itemLogRef, unitLineRef, w);
                    //counter++;
                } else {
                    System.out.println();
                    int checkLogRef = dbLocal.getLogRef(connection, tableNameUnitBarcode, "LOGICALREF",
                            itmUnitARef, "ITMUNITAREF", fromCloudBarcode.get(w).getLineNr(), "LINENR");
                    if (checkLogRef == 0) {
                        int newUnitBarcodeLogRef = dbLocal.getPrimaryKeyInt(
                                connection, tableNameUnitBarcodeSeq, "1", "LASTLREF", "ID");

                        newUnitBarcodeLogRef = newUnitBarcodeLogRef + 1;

                        dbLocal.insertItemQuery(connection, jsonUnitBarcode,
                                tableNameUnitBarcode, columnUnitBarcode, newUnitBarcodeLogRef, itmUnitARef,
                                itemLogRef, unitLineRef, w);
                        //update UNITBARCODESEQ tables LASTLREF value with new value
                        if (dbLocal.getPrimaryKeyInt(connection, tableNameUnitBarcode,
                                String.valueOf(newUnitBarcodeLogRef), "LOGICALREF", "LOGICALREF") == newUnitBarcodeLogRef) {

                            dbLocal.updateKey(connection, newUnitBarcodeLogRef, tableNameUnitBarcodeSeq);
                        }
                    } else {
                        dbLocal.deleteLogRef(connection, tableNameUnitBarcode, "LOGICALREF", checkLogRef);
                        dbLocal.insertItemQuery(connection, jsonUnitBarcode,
                                tableNameUnitBarcode, columnUnitBarcode, checkLogRef, itmUnitARef,
                                itemLogRef, unitLineRef, w);
                    }
                }
            } else {
                System.err.println("UNITBARCODE TABLE SYNCDA ITEMREF = 0!");
            }
        }
    }

    //sync and update ITMUNITA
    private void syncUpdateUnitA(ArrayList<ItmUnitA> fromCloudUnitA, JSONObject jsonItmUnitA) {
        int counter = 0;
        for (int z = 0; z < fromCloudUnitA.size(); z++) {
            int itemLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameItems,
                    String.valueOf(fromCloudUnitA.get(z).getItemRef()), "LOGICALREF", "ISONR");

            if (itemLogRef != 0) {

                int unitAlogRef = dbLocal.getPrimaryKeyInt(connection, tableNameItmUnitA,
                        String.valueOf(fromCloudUnitA.get(z).getLogicalRef()), "LOGICALREF", "WIDTH");
                int unitLineRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "UNITSETL",
                        String.valueOf(fromCloudUnitA.get(z).getUnitLineRef()), "LOGICALREF", "WIDTH");
                if (unitAlogRef != 0) {

                    //int localUnitALogicalRef = unitA.get(counter).getLogicalRef();
                    dbLocal.deleteLogRef(connection, tableNameItmUnitA, "LOGICALREF", unitAlogRef);
                    dbLocal.insertItemQuery(connection, jsonItmUnitA,
                            tableNameItmUnitA, columnItmUnitA, unitAlogRef, 0,
                            itemLogRef, unitLineRef, z);
                } else {
                    System.out.println("UnitA empty: " + counter);
                    int localUnitALogicalRef = dbLocal.getPrimaryKeyInt(connection, tableNameItmUnitASeq,
                            "1", "LASTLREF", "ID");
                    localUnitALogicalRef = localUnitALogicalRef + 1;
                    dbLocal.insertItemQuery(connection, jsonItmUnitA,
                            tableNameItmUnitA, columnItmUnitA, localUnitALogicalRef, 0,
                            itemLogRef, unitLineRef, z);
                    //update ITMUNITASEQ tables LASTLREF value with new value
                    if (dbLocal.getPrimaryKeyInt(connection, tableNameItmUnitA,
                            String.valueOf(localUnitALogicalRef), "LOGICALREF", "LOGICALREF") == localUnitALogicalRef) {

                        dbLocal.updateKey(connection, localUnitALogicalRef, tableNameItmUnitASeq);
                    }
                }
            } else {
                System.err.println("UNITBARCODE TABLE SYNCDA ITEMREF = 0!");
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.sync;

import com.saptaslama.controller.CompanyConstants;
import com.saptaslama.controller.DbConnection;
import com.saptaslama.controller.receiver.ClCardReceiver;
import com.saptaslama.controller.receiver.InvoiceReceiver;
import com.saptaslama.model.ClCard;
import com.saptaslama.model.Invoice;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class SyncInvoice {

    private InvoiceReceiver invoice;
    
    private DbConnection dbLocal;
    
    private Connection connection;

    private String[] columnInvoice;

    private final String tableNameInvoice = CompanyConstants.COMPANY
            + CompanyConstants.SUBCOMPANY + "INVOICE";

    private final String tableNameInvoiceSeq = tableNameInvoice + "SEQ";

    private final String fileNameInvoice = "Invoice.json";

    public SyncInvoice(InvoiceReceiver invoice) {

        this.invoice = invoice;

        dbLocal = new DbConnection();
    }

    public void init() {
        ResultSet resultSetInvoice;
        
        connection = dbLocal.getConnection();
        
        resultSetInvoice = dbLocal.querySelectAll(connection, tableNameInvoice);

        System.out.println("\n*********" + tableNameInvoice + " table column names***************");
        columnInvoice = invoice.getColumnNames(resultSetInvoice);

        // here we sync the invoice
        syncInvoice(invoice.getInvoiceArrayList(invoice
                .getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameInvoice)), invoice
                .getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + fileNameInvoice));

        dbLocal.closeConnection(connection);
        dbLocal.closeResultSet(resultSetInvoice);
        dbLocal = null;
        invoice = null;
        columnInvoice = null;
    }
    //method to sync and insert INVOICE table values

    public void syncInvoice(ArrayList<Invoice> invoiceFromCloud, JSONObject jObject) {
        for (int i = 0; i < invoiceFromCloud.size(); i++) {
            int invoiceLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameInvoice,
                    String.valueOf(invoiceFromCloud.get(i).getTrackNr()), "LOGICALREF", "TRACKNR");

            int clientRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "CLCARD",
                    String.valueOf(invoiceFromCloud.get(i).getClientRef()), "LOGICALREF", "TAXNR");
            if (clientRef == 0 && invoiceFromCloud.get(i).getClientRef() != 0) {
                ClCardReceiver clCard = new ClCardReceiver();
                ArrayList<ClCard> clCardList = clCard.getClCardArrayList(clCard
                        .getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + "ClCard.json"));
                for (int a = 0; a < clCardList.size(); a++) {
                    if (clCardList.get(a).getLogicalRef() == invoiceFromCloud.get(i).getClientRef()) {
                        clientRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "CLCARD",
                                String.valueOf(clCardList.get(a).getTaxNr()),
                                "LOGICALREF", "TAXNR");
                        break;
                    }
                }
            }
            int recieverRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "CLCARD",
                    String.valueOf(invoiceFromCloud.get(i).getRecvRef()), "LOGICALREF", "TAXNR");
            if (recieverRef == 0 && invoiceFromCloud.get(i).getRecvRef() != 0) {
                ClCardReceiver clCard = new ClCardReceiver();
                ArrayList<ClCard> clCardList = clCard.getClCardArrayList(clCard
                        .getJsonObjectFromFile(CompanyConstants.FILE_PATH_RECEIVE + "ClCard.json"));
                for (int a = 0; a < clCardList.size(); a++) {
                    if (clCardList.get(a).getLogicalRef() == invoiceFromCloud.get(i).getRecvRef()) {
                        recieverRef = dbLocal.getPrimaryKeyInt(connection, CompanyConstants.COMPANY + "CLCARD",
                                String.valueOf(clCardList.get(a).getTaxNr()),
                                "LOGICALREF", "TAXNR");
                        break;
                    }
                }
            }

            if (invoiceLogRef != 0) {
                System.err.println("UPDATE INVOICE TABLE");
                System.err.println("DELETE logicalRef: " + invoiceLogRef + "AND INSERT AGAIN!");

                dbLocal.deleteLogRef(connection, tableNameInvoice, "LOGICALREF", invoiceLogRef);
                dbLocal.insertInvoice(connection, jObject, tableNameInvoice,
                        columnInvoice, invoiceLogRef, clientRef, recieverRef, 0, i);
            } else {
                System.err.println("INSERT INVOICE TABLE");
                int newInvoiceLogRef = dbLocal.getPrimaryKeyInt(connection, tableNameInvoiceSeq,
                        "1", "LASTLREF", "ID");

                newInvoiceLogRef = newInvoiceLogRef + 1;
                dbLocal.insertInvoice(connection, jObject, tableNameInvoice,
                        columnInvoice, newInvoiceLogRef, clientRef, recieverRef, 0, i);
                //  update INVOICESEQ tables LASTLREF value with new value
                if (dbLocal.getPrimaryKeyInt(connection, tableNameInvoice,
                        String.valueOf(newInvoiceLogRef), "LOGICALREF", "LOGICALREF") == newInvoiceLogRef) {

                    dbLocal.updateKey(connection, newInvoiceLogRef, tableNameInvoiceSeq);
                }
            }
        }
    }
}

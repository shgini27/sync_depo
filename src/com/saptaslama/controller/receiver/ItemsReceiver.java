/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.receiver;

import com.saptaslama.controller.sender.Sender;
import com.saptaslama.model.Items;
import com.saptaslama.model.ItmUnitA;
import com.saptaslama.model.Itmclsas;
import com.saptaslama.model.PrcList;
import com.saptaslama.model.UnitBarcode;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class ItemsReceiver extends Sender{
    public ArrayList<Items> getItemsArrayList(JSONObject jObject) {

        ArrayList<Items> tableValue = new ArrayList<>();
        Items items;

        JSONArray arrayListLogicalref = (JSONArray) jObject.get("LOGICALREF");
        JSONArray arrayListActive = (JSONArray) jObject.get("ACTIVE");
        JSONArray arrayListCardType = (JSONArray) jObject.get("CARDTYPE");
        JSONArray arrayListCode = (JSONArray) jObject.get("CODE");
        JSONArray arrayListName = (JSONArray) jObject.get("NAME");
        JSONArray arrayListStgrpCode = (JSONArray) jObject.get("STGRPCODE");
        JSONArray arrayListProducerCode = (JSONArray) jObject.get("PRODUCERCODE");
        JSONArray arrayListSpecode = (JSONArray) jObject.get("SPECODE");
        JSONArray arrayListCyphCode = (JSONArray) jObject.get("CYPHCODE");
        JSONArray arrayListClassType = (JSONArray) jObject.get("CLASSTYPE");
        JSONArray arrayListPurchbrws = (JSONArray) jObject.get("PURCHBRWS");
        JSONArray arrayListSalesbrws = (JSONArray) jObject.get("SALESBRWS");
        JSONArray arrayListMtrlbrws = (JSONArray) jObject.get("MTRLBRWS");
        JSONArray arrayListVat = (JSONArray) jObject.get("VAT");
        JSONArray arrayListPaymentRef = (JSONArray) jObject.get("PAYMENTREF");
        JSONArray arrayListTrackType = (JSONArray) jObject.get("TRACKTYPE");
        JSONArray arrayListLocTracking = (JSONArray) jObject.get("LOCTRACKING");
        JSONArray arrayListTool = (JSONArray) jObject.get("TOOL");
        JSONArray arrayListAutoincsl = (JSONArray) jObject.get("AUTOINCSL");
        JSONArray arrayListDivlotSize = (JSONArray) jObject.get("DIVLOTSIZE");
        JSONArray arrayListShelfLife = (JSONArray) jObject.get("SHELFLIFE");
        JSONArray arrayListShelfdate = (JSONArray) jObject.get("SHELFDATE");
        JSONArray arrayListDominantrefs1 = (JSONArray) jObject.get("DOMINANTREFS1");
        JSONArray arrayListDominantrefs2 = (JSONArray) jObject.get("DOMINANTREFS2");
        JSONArray arrayListDominantrefs3 = (JSONArray) jObject.get("DOMINANTREFS3");
        JSONArray arrayListDominantrefs4 = (JSONArray) jObject.get("DOMINANTREFS4");
        JSONArray arrayListDominantrefs5 = (JSONArray) jObject.get("DOMINANTREFS5");
        JSONArray arrayListDominantrefs6 = (JSONArray) jObject.get("DOMINANTREFS6");
        JSONArray arrayListDominantrefs7 = (JSONArray) jObject.get("DOMINANTREFS7");
        JSONArray arrayListDominantrefs8 = (JSONArray) jObject.get("DOMINANTREFS8");
        JSONArray arrayListDominantrefs9 = (JSONArray) jObject.get("DOMINANTREFS9");
        JSONArray arrayListDominantrefs10 = (JSONArray) jObject.get("DOMINANTREFS10");
        JSONArray arrayListDominantrefs11 = (JSONArray) jObject.get("DOMINANTREFS11");
        JSONArray arrayListDominantrefs12 = (JSONArray) jObject.get("DOMINANTREFS12");
        JSONArray arrayListImageinc = (JSONArray) jObject.get("IMAGEINC");
        JSONArray arrayListTextinc = (JSONArray) jObject.get("TEXTINC");
        JSONArray arrayListDeprtype = (JSONArray) jObject.get("DEPRTYPE");
        JSONArray arrayListDeprrate = (JSONArray) jObject.get("DEPRRATE");
        JSONArray arrayListDeprdur = (JSONArray) jObject.get("DEPRDUR");
        JSONArray arrayListSalvageval = (JSONArray) jObject.get("SALVAGEVAL");
        JSONArray arrayListRevalflag = (JSONArray) jObject.get("REVALFLAG");
        JSONArray arrayListRevdeprflag = (JSONArray) jObject.get("REVDEPRFLAG");
        JSONArray arrayListPartdep = (JSONArray) jObject.get("PARTDEP");
        JSONArray arrayListDeprtype2 = (JSONArray) jObject.get("DEPRTYPE2");
        JSONArray arrayListDeprrate2 = (JSONArray) jObject.get("DEPRRATE2");
        JSONArray arrayListDeprdur2 = (JSONArray) jObject.get("DEPRDUR2");
        JSONArray arrayListRevalflag2 = (JSONArray) jObject.get("REVALFLAG2");
        JSONArray arrayListRevdeprflag2 = (JSONArray) jObject.get("REVDEPRFLAG2");
        JSONArray arrayListPartdep2 = (JSONArray) jObject.get("PARTDEP2");
        JSONArray arrayListApproved = (JSONArray) jObject.get("APPROVED");
        JSONArray arrayListUnitsetref = (JSONArray) jObject.get("UNITSETREF");
        JSONArray arrayListQccsetref = (JSONArray) jObject.get("QCCSETREF");
        JSONArray arrayListDistamount = (JSONArray) jObject.get("DISTAMOUNT");
        JSONArray arrayListCapiblockCreatedby = (JSONArray) jObject.get("CAPIBLOCK_CREATEDBY");
        JSONArray arrayListCapiblockCreateddate = (JSONArray) jObject.get("CAPIBLOCK_CREADEDDATE");///BUNA BAK
        JSONArray arrayListCapiblockCreatedhour = (JSONArray) jObject.get("CAPIBLOCK_CREATEDHOUR");
        JSONArray arrayListCapiblockCreatedmin = (JSONArray) jObject.get("CAPIBLOCK_CREATEDMIN");
        JSONArray arrayListCapiblockCreatedsec = (JSONArray) jObject.get("CAPIBLOCK_CREATEDSEC");
        JSONArray arrayListCapiblockModifiedby = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDBY");
        JSONArray arrayListCapiblockModifieddate = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDDATE");
        JSONArray arrayListCapiblockModifiedhour = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDHOUR");
        JSONArray arrayListCapiblockModifiedmin = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDMIN");
        JSONArray arrayListCapiblockModifiedsec = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDSEC");
        JSONArray arrayListSiteid = (JSONArray) jObject.get("SITEID");
        JSONArray arrayListRecstatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray arrayListOrglogicref = (JSONArray) jObject.get("ORGLOGICREF");
        JSONArray arrayListUnivid = (JSONArray) jObject.get("UNIVID");
        JSONArray arrayListDistlotunits = (JSONArray) jObject.get("DISTLOTUNITS");
        JSONArray arrayListComblotunits = (JSONArray) jObject.get("COMBLOTUNITS");
        JSONArray arrayListWfstatus = (JSONArray) jObject.get("WFSTATUS");
        JSONArray arrayListDistpoint = (JSONArray) jObject.get("DISTPOINT");
        JSONArray arrayListCamppoint = (JSONArray) jObject.get("CAMPPOINT");
        JSONArray arrayListCanuseintrns = (JSONArray) jObject.get("CANUSEINTRNS");
        JSONArray arrayListIsonr = (JSONArray) jObject.get("ISONR");
        JSONArray arrayListGroupnr = (JSONArray) jObject.get("GROUPNR");
        JSONArray arrayListProdcountry = (JSONArray) jObject.get("PRODCOUNTRY");
        JSONArray arrayListAddtaxref = (JSONArray) jObject.get("ADDTAXREF");
        JSONArray arrayListQprodamnt = (JSONArray) jObject.get("QPRODAMNT");
        JSONArray arrayListQproduom = (JSONArray) jObject.get("QPRODUOM");
        JSONArray arrayListQprodsrcindex = (JSONArray) jObject.get("QPRODSRCINDEX");
        JSONArray arrayListExtaccessflags = (JSONArray) jObject.get("EXTACCESSFLAGS");
        JSONArray arrayListPacket = (JSONArray) jObject.get("PACKET");
        JSONArray arrayListSalvageval2 = (JSONArray) jObject.get("SALVAGEVAL2");
        JSONArray arrayListSellvat = (JSONArray) jObject.get("SELLVAT");
        JSONArray arrayListReturnvat = (JSONArray) jObject.get("RETURNVAT");
        JSONArray arrayListLogoid = (JSONArray) jObject.get("LOGOID");
        JSONArray arrayListLidconfirmed = (JSONArray) jObject.get("LIDCONFIRMED");
        JSONArray arrayListGtipcode = (JSONArray) jObject.get("GTIPCODE");
        JSONArray arrayListExpctgno = (JSONArray) jObject.get("EXPCTGNO");
        JSONArray arrayListB2ccode = (JSONArray) jObject.get("B2CCODE");
        JSONArray arrayListMarkref = (JSONArray) jObject.get("MARKREF");
        JSONArray arrayListImage2inc = (JSONArray) jObject.get("IMAGE2INC");
        JSONArray arrayListAvrwhduration = (JSONArray) jObject.get("AVRWHDURATION");
        JSONArray arrayListExtcardflags = (JSONArray) jObject.get("EXTCARDFLAGS");
        JSONArray arrayListMinordamount = (JSONArray) jObject.get("MINORDAMOUNT");
        JSONArray arrayListFreightplace = (JSONArray) jObject.get("FREIGHTPLACE");
        JSONArray arrayListFreighttypcode1 = (JSONArray) jObject.get("FREIGHTTYPCODE1");
        JSONArray arrayListFreighttypcode2 = (JSONArray) jObject.get("FREIGHTTYPCODE2");
        JSONArray arrayListFreighttypcode3 = (JSONArray) jObject.get("FREIGHTTYPCODE3");
        JSONArray arrayListFreighttypcode4 = (JSONArray) jObject.get("FREIGHTTYPCODE4");
        JSONArray arrayListFreighttypcode5 = (JSONArray) jObject.get("FREIGHTTYPCODE5");
        JSONArray arrayListFreighttypcode6 = (JSONArray) jObject.get("FREIGHTTYPCODE6");
        JSONArray arrayListFreighttypcode7 = (JSONArray) jObject.get("FREIGHTTYPCODE7");
        JSONArray arrayListFreighttypcode8 = (JSONArray) jObject.get("FREIGHTTYPCODE8");
        JSONArray arrayListFreighttypcode9 = (JSONArray) jObject.get("FREIGHTTYPCODE9");
        JSONArray arrayListFreighttypcode10 = (JSONArray) jObject.get("FREIGHTTYPCODE10");
        JSONArray arrayListStatecode = (JSONArray) jObject.get("STATECODE");
        JSONArray arrayListStatename = (JSONArray) jObject.get("STATENAME");
        JSONArray arrayListExpcategory = (JSONArray) jObject.get("EXPCATEGORY");
        JSONArray arrayListLostfactor = (JSONArray) jObject.get("LOSTFACTOR");
        JSONArray arrayListTextinceng = (JSONArray) jObject.get("TEXTINCENG");
        JSONArray arrayListEanbarcode = (JSONArray) jObject.get("EANBARCODE");
        JSONArray arrayListDeprclasstype = (JSONArray) jObject.get("DEPRCLASSTYPE");
        JSONArray arrayListWflowcrdref = (JSONArray) jObject.get("WFLOWCRDREF");
        JSONArray arrayListSellprvat = (JSONArray) jObject.get("SELLPRVAT");
        JSONArray arrayListReturnprvat = (JSONArray) jObject.get("RETURNPRVAT");
        JSONArray arrayListLowlevelcodes1 = (JSONArray) jObject.get("LOWLEVELCODES1");
        JSONArray arrayListLowlevelcodes2 = (JSONArray) jObject.get("LOWLEVELCODES2");
        JSONArray arrayListLowlevelcodes3 = (JSONArray) jObject.get("LOWLEVELCODES3");
        JSONArray arrayListLowlevelcodes4 = (JSONArray) jObject.get("LOWLEVELCODES4");
        JSONArray arrayListLowlevelcodes5 = (JSONArray) jObject.get("LOWLEVELCODES5");
        JSONArray arrayListLowlevelcodes6 = (JSONArray) jObject.get("LOWLEVELCODES6");
        JSONArray arrayListLowlevelcodes7 = (JSONArray) jObject.get("LOWLEVELCODES7");
        JSONArray arrayListLowlevelcodes8 = (JSONArray) jObject.get("LOWLEVELCODES8");
        JSONArray arrayListLowlevelcodes9 = (JSONArray) jObject.get("LOWLEVELCODES9");
        JSONArray arrayListLowlevelcodes10 = (JSONArray) jObject.get("LOWLEVELCODES10");
        JSONArray arrayListOrglogoid = (JSONArray) jObject.get("ORGLOGOID");
        JSONArray arrayListQproddepart = (JSONArray) jObject.get("QPRODDEPART");
        JSONArray arrayListCanconfigure = (JSONArray) jObject.get("CANCONFIGURE");
        JSONArray arrayListCharsetref = (JSONArray) jObject.get("CHARSETREF");
        JSONArray arrayListCandeduct = (JSONArray) jObject.get("CANDEDUCT");
        JSONArray arrayListConscoderef = (JSONArray) jObject.get("CONSCODEREF");
        JSONArray arrayListSpecode2 = (JSONArray) jObject.get("SPECODE2");
        JSONArray arrayListSpecode3 = (JSONArray) jObject.get("SPECODE3");
        JSONArray arrayListSpecode4 = (JSONArray) jObject.get("SPECODE4");
        JSONArray arrayListSpecode5 = (JSONArray) jObject.get("SPECODE5");
        JSONArray arrayListExpense = (JSONArray) jObject.get("EXPENSE");

        for (int i = 0; i < arrayListLogicalref.size(); i++) {
            items = new Items(
                        Integer.parseInt(arrayListLogicalref.get(i).toString()), Short.parseShort(arrayListActive.get(i).toString()),
                        Short.parseShort(arrayListCardType.get(i).toString()), arrayListCode.get(i).toString(), 
                        arrayListName.get(i).toString(), arrayListStgrpCode.get(i).toString(),
                        arrayListProducerCode.get(i).toString(), arrayListSpecode.get(i).toString(),
                        arrayListCyphCode.get(i).toString(), Short.parseShort(arrayListClassType.get(i).toString()), 
                        Short.parseShort(arrayListPurchbrws.get(i).toString()), Short.parseShort(arrayListSalesbrws.get(i).toString()), 
                        Short.parseShort(arrayListMtrlbrws.get(i).toString()), Double.parseDouble(arrayListVat.get(i).toString()), 
                        Integer.parseInt(arrayListPaymentRef.get(i).toString()), Short.parseShort(arrayListTrackType.get(i).toString()), 
                        Short.parseShort(arrayListLocTracking.get(i).toString()), Short.parseShort(arrayListTool.get(i).toString()), 
                        Short.parseShort(arrayListAutoincsl.get(i).toString()), Short.parseShort(arrayListDivlotSize.get(i).toString()), 
                        Double.parseDouble(arrayListShelfLife.get(i).toString()), Short.parseShort(arrayListShelfdate.get(i).toString()), 
                        Integer.parseInt(arrayListDominantrefs1.get(i).toString()), Integer.parseInt(arrayListDominantrefs2.get(i).toString()), 
                        Integer.parseInt(arrayListDominantrefs3.get(i).toString()), Integer.parseInt(arrayListDominantrefs4.get(i).toString()), 
                        Integer.parseInt(arrayListDominantrefs5.get(i).toString()), Integer.parseInt(arrayListDominantrefs6.get(i).toString()), 
                        Integer.parseInt(arrayListDominantrefs7.get(i).toString()), Integer.parseInt(arrayListDominantrefs8.get(i).toString()), 
                        Integer.parseInt(arrayListDominantrefs9.get(i).toString()), Integer.parseInt(arrayListDominantrefs10.get(i).toString()), 
                        Integer.parseInt(arrayListDominantrefs11.get(i).toString()), Integer.parseInt(arrayListDominantrefs12.get(i).toString()), 
                        Short.parseShort(arrayListImageinc.get(i).toString()), Short.parseShort(arrayListTextinc.get(i).toString()), 
                        Short.parseShort(arrayListDeprtype.get(i).toString()), Double.parseDouble(arrayListDeprrate.get(i).toString()), 
                        Short.parseShort(arrayListDeprdur.get(i).toString()), Double.parseDouble(arrayListSalvageval.get(i).toString()), 
                        Short.parseShort(arrayListRevalflag.get(i).toString()), Short.parseShort(arrayListRevdeprflag.get(i).toString()), 
                        Short.parseShort(arrayListPartdep.get(i).toString()), Short.parseShort(arrayListDeprtype2.get(i).toString()), 
                        Double.parseDouble(arrayListDeprrate2.get(i).toString()), Short.parseShort(arrayListDeprdur2.get(i).toString()), 
                        Short.parseShort(arrayListRevalflag2.get(i).toString()), Short.parseShort(arrayListRevdeprflag2.get(i).toString()), 
                        Short.parseShort(arrayListPartdep2.get(i).toString()), Short.parseShort(arrayListApproved.get(i).toString()), 
                        Integer.parseInt(arrayListUnitsetref.get(i).toString()), Integer.parseInt(arrayListQccsetref.get(i).toString()), 
                        Double.parseDouble(arrayListDistamount.get(i).toString()), Short.parseShort(arrayListCapiblockCreatedby.get(i).toString()), 
                        arrayListCapiblockCreateddate.get(i).toString(), Short.parseShort(arrayListCapiblockCreatedhour.get(i).toString()), 
                        Short.parseShort(arrayListCapiblockCreatedmin.get(i).toString()), Short.parseShort(arrayListCapiblockCreatedsec.get(i).toString()), 
                        Short.parseShort(arrayListCapiblockModifiedby.get(i).toString()), arrayListCapiblockModifieddate.get(i).toString(), 
                        Short.parseShort(arrayListCapiblockModifiedhour.get(i).toString()), Short.parseShort(arrayListCapiblockModifiedmin.get(i).toString()), 
                        Short.parseShort(arrayListCapiblockModifiedsec.get(i).toString()), Short.parseShort(arrayListSiteid.get(i).toString()), 
                        Short.parseShort(arrayListRecstatus.get(i).toString()), Integer.parseInt(arrayListOrglogicref.get(i).toString()), 
                        arrayListUnivid.get(i).toString(), Short.parseShort(arrayListDistlotunits.get(i).toString()), 
                        Short.parseShort(arrayListComblotunits.get(i).toString()), Integer.parseInt(arrayListWfstatus.get(i).toString()), 
                        Double.parseDouble(arrayListDistpoint.get(i).toString()), Double.parseDouble(arrayListCamppoint.get(i).toString()), 
    /*     ISONR    */  Short.parseShort(arrayListCanuseintrns.get(i).toString()), arrayListIsonr.get(i).toString(), 
                        arrayListGroupnr.get(i).toString(), arrayListProdcountry.get(i).toString(), 
                        Integer.parseInt(arrayListAddtaxref.get(i).toString()), Double.parseDouble(arrayListQprodamnt.get(i).toString()), 
                        Integer.parseInt(arrayListQproduom.get(i).toString()), Short.parseShort(arrayListQprodsrcindex.get(i).toString()), 
                        Integer.parseInt(arrayListExtaccessflags.get(i).toString()), Short.parseShort(arrayListPacket.get(i).toString()), 
                        Double.parseDouble(arrayListSalvageval2.get(i).toString()), Double.parseDouble(arrayListSellvat.get(i).toString()), 
                        Double.parseDouble(arrayListReturnvat.get(i).toString()), arrayListLogoid.get(i).toString(), 
                        Short.parseShort(arrayListLidconfirmed.get(i).toString()), arrayListGtipcode.get(i).toString(), 
                        arrayListExpctgno.get(i).toString(), arrayListB2ccode.get(i).toString(), 
                        Integer.parseInt(arrayListMarkref.get(i).toString()), Short.parseShort(arrayListImage2inc.get(i).toString()), 
                        Double.parseDouble(arrayListAvrwhduration.get(i).toString()), Integer.parseInt(arrayListExtcardflags.get(i).toString()), 
                        Double.parseDouble(arrayListMinordamount.get(i).toString()), arrayListFreightplace.get(i).toString(), 
                        arrayListFreighttypcode1.get(i).toString(), arrayListFreighttypcode2.get(i).toString(), 
                        arrayListFreighttypcode3.get(i).toString(), arrayListFreighttypcode4.get(i).toString(), 
                        arrayListFreighttypcode5.get(i).toString(), arrayListFreighttypcode6.get(i).toString(), 
                        arrayListFreighttypcode7.get(i).toString(), arrayListFreighttypcode8.get(i).toString(), 
                        arrayListFreighttypcode9.get(i).toString(), arrayListFreighttypcode10.get(i).toString(), 
                        arrayListStatecode.get(i).toString(), arrayListStatename.get(i).toString(), 
                        arrayListExpcategory.get(i).toString(), Double.parseDouble(arrayListLostfactor.get(i).toString()), 
                        Short.parseShort(arrayListTextinceng.get(i).toString()), arrayListEanbarcode.get(i).toString(), 
                        arrayListDeprclasstype.get(i).toString(), Integer.parseInt(arrayListWflowcrdref.get(i).toString()), 
                        Double.parseDouble(arrayListSellprvat.get(i).toString()), Double.parseDouble(arrayListReturnprvat.get(i).toString()), 
                        Integer.parseInt(arrayListLowlevelcodes1.get(i).toString()), Integer.parseInt(arrayListLowlevelcodes2.get(i).toString()), 
                        Integer.parseInt(arrayListLowlevelcodes3.get(i).toString()), Integer.parseInt(arrayListLowlevelcodes4.get(i).toString()), 
                        Integer.parseInt(arrayListLowlevelcodes5.get(i).toString()), Integer.parseInt(arrayListLowlevelcodes6.get(i).toString()), 
                        Integer.parseInt(arrayListLowlevelcodes7.get(i).toString()), Integer.parseInt(arrayListLowlevelcodes8.get(i).toString()), 
                        Integer.parseInt(arrayListLowlevelcodes9.get(i).toString()), Integer.parseInt(arrayListLowlevelcodes10.get(i).toString()), 
                        arrayListOrglogoid.get(i).toString(), Short.parseShort(arrayListQproddepart.get(i).toString()), 
                        Short.parseShort(arrayListCanconfigure.get(i).toString()), Integer.parseInt(arrayListCharsetref.get(i).toString()), 
                        Short.parseShort(arrayListCandeduct.get(i).toString()), Integer.parseInt(arrayListConscoderef.get(i).toString()), 
                        arrayListSpecode2.get(i).toString(), arrayListSpecode3.get(i).toString(), arrayListSpecode4.get(i).toString(), 
                        arrayListSpecode5.get(i).toString(), Short.parseShort(arrayListExpense.get(i).toString()));

            tableValue.add(items);
        }
        return tableValue;
    }
    
    public ArrayList<ItmUnitA> getItmUnitAArrayList(JSONObject jObject) {

        ArrayList<ItmUnitA> tableValue = new ArrayList<>();
        ItmUnitA unitA;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray itemRef = (JSONArray) jObject.get("ITEMREF");
        JSONArray lineNr = (JSONArray) jObject.get("LINENR");
        JSONArray unitLineRef = (JSONArray) jObject.get("UNITLINEREF");
        JSONArray barcode = (JSONArray) jObject.get("BARCODE");
        JSONArray mtrlClas = (JSONArray) jObject.get("MTRLCLAS");
        JSONArray purchClas = (JSONArray) jObject.get("PURCHCLAS");
        JSONArray salesClas = (JSONArray) jObject.get("SALESCLAS");
        JSONArray mtrlPriority = (JSONArray) jObject.get("MTRLPRIORITY");
        JSONArray purchPriority = (JSONArray) jObject.get("PURCHPRIORTY");
        JSONArray salesPriority = (JSONArray) jObject.get("SALESPRIORITY");
        JSONArray width = (JSONArray) jObject.get("WIDTH");
        JSONArray length = (JSONArray) jObject.get("LENGTH");
        JSONArray height = (JSONArray) jObject.get("HEIGHT");
        JSONArray area = (JSONArray) jObject.get("AREA");
        JSONArray volume = (JSONArray) jObject.get("VOLUME_");
        JSONArray weight = (JSONArray) jObject.get("WEIGHT");
        JSONArray widthRef = (JSONArray) jObject.get("WIDTHREF");
        JSONArray lengthRef = (JSONArray) jObject.get("LENGTHREF");
        JSONArray heightRef = (JSONArray) jObject.get("HEIGHTREF");
        JSONArray areaRef = (JSONArray) jObject.get("AREAREF");
        JSONArray volumeRef = (JSONArray) jObject.get("VOLUMEREF");
        JSONArray weightRef = (JSONArray) jObject.get("WEIGHTREF");
        JSONArray crossVolume = (JSONArray) jObject.get("GROSSVOLUME");
        JSONArray crossWeight = (JSONArray) jObject.get("GROSSWEIGHT");
        JSONArray crossVolRef = (JSONArray) jObject.get("GROSSVOLREF");
        JSONArray crossWghtRef = (JSONArray) jObject.get("GROSSWGHTREF");
        JSONArray confact1 = (JSONArray) jObject.get("CONVFACT1");
        JSONArray confact2 = (JSONArray) jObject.get("CONVFACT2");
        JSONArray extAccessFlags = (JSONArray) jObject.get("EXTACCESSFLAGS");
        JSONArray siteId = (JSONArray) jObject.get("SITEID");
        JSONArray recStatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray orgLogicRef = (JSONArray) jObject.get("ORGLOGICREF");
        JSONArray barcode2 = (JSONArray) jObject.get("BARCODE2");
        JSONArray barcode3 = (JSONArray) jObject.get("BARCODE3");
        JSONArray wBarcode = (JSONArray) jObject.get("WBARCODE");
        JSONArray wBarcodeShift = (JSONArray) jObject.get("WBARCODESHIFT");
        JSONArray variantRef = (JSONArray) jObject.get("VARIANTREF");

        for (int i = 0; i < logicalRef.size(); i++) {
            unitA = new ItmUnitA(
                    Integer.parseInt(logicalRef.get(i).toString()), Integer.parseInt(itemRef.get(i).toString()),
                    Short.parseShort(lineNr.get(i).toString()), Integer.parseInt(unitLineRef.get(i).toString()),
                    barcode.get(i).toString(), Short.parseShort(mtrlClas.get(i).toString()),
                    Short.parseShort(purchClas.get(i).toString()), Short.parseShort(salesClas.get(i).toString()),
                    Short.parseShort(mtrlPriority.get(i).toString()), Short.parseShort(purchPriority.get(i).toString()),
                    Short.parseShort(salesPriority.get(i).toString()), Integer.parseInt(width.get(i).toString()),
                    Double.parseDouble(length.get(i).toString()), Double.parseDouble(height.get(i).toString()),
                    Double.parseDouble(area.get(i).toString()), Double.parseDouble(volume.get(i).toString()),
                    Double.parseDouble(weight.get(i).toString()), Integer.parseInt(widthRef.get(i).toString()),
                    Integer.parseInt(lengthRef.get(i).toString()), Integer.parseInt(heightRef.get(i).toString()),
                    Integer.parseInt(areaRef.get(i).toString()), Integer.parseInt(volumeRef.get(i).toString()),
                    Integer.parseInt(weightRef.get(i).toString()), Double.parseDouble(crossVolume.get(i).toString()),
                    Double.parseDouble(crossWeight.get(i).toString()), Integer.parseInt(crossVolRef.get(i).toString()),
                    Integer.parseInt(crossWghtRef.get(i).toString()), Double.parseDouble(confact1.get(i).toString()),
                    Double.parseDouble(confact2.get(i).toString()), Integer.parseInt(extAccessFlags.get(i).toString()),
                    Short.parseShort(siteId.get(i).toString()), Short.parseShort(recStatus.get(i).toString()),
                    Integer.parseInt(orgLogicRef.get(i).toString()), barcode2.get(i).toString(),
                    barcode3.get(i).toString(), wBarcode.get(i).toString(),
                    Short.parseShort(wBarcodeShift.get(i).toString()), Short.parseShort(variantRef.get(i).toString()));

            tableValue.add(unitA);
        }

        return tableValue;
    }
    
    public ArrayList<Itmclsas> getItmclsasArrayList(JSONObject jObject) {

        ArrayList<Itmclsas> tableValue = new ArrayList<>();
        Itmclsas unitSet;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray parentRef = (JSONArray) jObject.get("PARENTREF");
        JSONArray childRef = (JSONArray) jObject.get("CHILDREF");
        JSONArray upLevel = (JSONArray) jObject.get("UPLEVEL");
        JSONArray siteId = (JSONArray) jObject.get("SITEID");
        JSONArray recStatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray orgLogicalRef = (JSONArray) jObject.get("ORGLOGICREF");

        for (int i = 0; i < logicalRef.size(); i++) {
            unitSet = new Itmclsas(
                    Integer.parseInt(logicalRef.get(i).toString()), 
                    Integer.parseInt(parentRef.get(i).toString()), 
                    Integer.parseInt(childRef.get(i).toString()), 
                    Short.parseShort(upLevel.get(i).toString()), 
                    Short.parseShort(siteId.get(i).toString()), 
                    Short.parseShort(recStatus.get(i).toString()), 
                    Integer.parseInt(orgLogicalRef.get(i).toString()));

            tableValue.add(unitSet);
        }
        return tableValue;
    }
    
    public ArrayList<PrcList> getPrcListArrayList(JSONObject jObject) {

        ArrayList<PrcList> tableValue = new ArrayList<>();
        PrcList unitSet;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray cardRef = (JSONArray) jObject.get("CARDREF");
        JSONArray clientCode = (JSONArray) jObject.get("CLIENTCODE");
        JSONArray clSpecode = (JSONArray) jObject.get("CLSPECODE");
        JSONArray payplanRef = (JSONArray) jObject.get("PAYPLANREF");
        JSONArray price = (JSONArray) jObject.get("PRICE");
        JSONArray uomRef = (JSONArray) jObject.get("UOMREF");
        JSONArray inVat = (JSONArray) jObject.get("INCVAT");
        JSONArray currency = (JSONArray) jObject.get("CURRENCY");
        JSONArray priority = (JSONArray) jObject.get("PRIORITY");
        JSONArray pType = (JSONArray) jObject.get("PTYPE");
        JSONArray mtrlType = (JSONArray) jObject.get("MTRLTYPE");
        JSONArray leadTime = (JSONArray) jObject.get("LEADTIME");
        JSONArray begDate = (JSONArray) jObject.get("BEGDATE");
        JSONArray endDate = (JSONArray) jObject.get("ENDDATE");
        JSONArray condition = (JSONArray) jObject.get("CONDITION");
        JSONArray shipTyp = (JSONArray) jObject.get("SHIPTYP");
        JSONArray specialized = (JSONArray) jObject.get("SPECIALIZED");
        JSONArray capiblockCreatedBy = (JSONArray) jObject.get("CAPIBLOCK_CREATEDBY");
        JSONArray capiblockCreatedDate = (JSONArray) jObject.get("CAPIBLOCK_CREADEDDATE");
        JSONArray capiblockCreatedHour = (JSONArray) jObject.get("CAPIBLOCK_CREATEDHOUR");
        JSONArray capiblockCreatedMin = (JSONArray) jObject.get("CAPIBLOCK_CREATEDMIN");
        JSONArray capiblockCreatedSec = (JSONArray) jObject.get("CAPIBLOCK_CREATEDSEC");
        JSONArray capiblockModifiedBy = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDBY");
        JSONArray capiblockModifiedDate = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDDATE");
        JSONArray capiblockModifiedHour = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDHOUR");
        JSONArray capiblockModifiedMin = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDMIN");
        JSONArray capiblockModifiedSec = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDSEC");
        JSONArray siteId = (JSONArray) jObject.get("SITEID");
        JSONArray recStatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray orgLogicRef = (JSONArray) jObject.get("ORGLOGICREF");
        JSONArray wfStatus = (JSONArray) jObject.get("WFSTATUS");
        JSONArray unitConvert = (JSONArray) jObject.get("UNITCONVERT");
        JSONArray axtAccessFlags = (JSONArray) jObject.get("EXTACCESSFLAGS");
        JSONArray cyphCode = (JSONArray) jObject.get("CYPHCODE");
        JSONArray orgLogoId = (JSONArray) jObject.get("ORGLOGOID");
        JSONArray tradingGrp = (JSONArray) jObject.get("TRADINGGRP");
        JSONArray begTime = (JSONArray) jObject.get("BEGTIME");
        JSONArray endTime = (JSONArray) jObject.get("ENDTIME");
        JSONArray definition = (JSONArray) jObject.get("DEFINITION_");
        JSONArray code = (JSONArray) jObject.get("CODE");
        JSONArray grpCode = (JSONArray) jObject.get("GRPCODE");
        JSONArray orderNr = (JSONArray) jObject.get("ORDERNR");
        JSONArray geniusPayType = (JSONArray) jObject.get("GENIUSPAYTYPE");
        JSONArray geniusShpnr = (JSONArray) jObject.get("GENIUSSHPNR");
        JSONArray prcaltertyp1 = (JSONArray) jObject.get("PRCALTERTYP1");
        JSONArray prcalterlmt1 = (JSONArray) jObject.get("PRCALTERLMT1");
        JSONArray prcaltertyp2 = (JSONArray) jObject.get("PRCALTERTYP2");
        JSONArray prcalterlmt2 = (JSONArray) jObject.get("PRCALTERLMT2");
        JSONArray prcaltertyp3 = (JSONArray) jObject.get("PRCALTERTYP3");
        JSONArray prcalterlmt3 = (JSONArray) jObject.get("PRCALTERLMT3");
        JSONArray active = (JSONArray) jObject.get("ACTIVE");
        JSONArray purchcontRef = (JSONArray) jObject.get("PURCHCONTREF");
        JSONArray branch = (JSONArray) jObject.get("BRANCH");

        for (int i = 0; i < logicalRef.size(); i++) {
            unitSet = new PrcList(
                    Integer.parseInt(logicalRef.get(i).toString()), 
                    Integer.parseInt(cardRef.get(i).toString()), 
                    clientCode.get(i).toString(), clSpecode.get(i).toString(), 
                    Integer.parseInt(payplanRef.get(i).toString()),
                    Double.parseDouble(price.get(i).toString()), 
                    Integer.parseInt(uomRef.get(i).toString()),
                    Short.parseShort(inVat.get(i).toString()), 
                    Short.parseShort(currency.get(i).toString()),
                    Short.parseShort(priority.get(i).toString()), 
                    Short.parseShort(pType.get(i).toString()),
                    Short.parseShort(mtrlType.get(i).toString()),
                    Integer.parseInt(leadTime.get(i).toString()), 
                    begDate.get(i).toString(), endDate.get(i).toString(), //date format
                    condition.get(i).toString(), shipTyp.get(i).toString(), 
                    Short.parseShort(specialized.get(i).toString()), 
                    Short.parseShort(capiblockCreatedBy.get(i).toString()), 
                    capiblockCreatedDate.get(i).toString(), 
                    Short.parseShort(capiblockCreatedHour.get(i).toString()),
                    Short.parseShort(capiblockCreatedMin.get(i).toString()), 
                    Short.parseShort(capiblockCreatedSec.get(i).toString()),
                    Short.parseShort(capiblockModifiedBy.get(i).toString()), 
                    capiblockModifiedDate.get(i).toString(), //date format
                    Short.parseShort(capiblockModifiedHour.get(i).toString()),
                    Short.parseShort(capiblockModifiedMin.get(i).toString()), 
                    Short.parseShort(capiblockModifiedSec.get(i).toString()),
                    Short.parseShort(siteId.get(i).toString()), 
                    Short.parseShort(recStatus.get(i).toString()), 
                    Integer.parseInt(orgLogicRef.get(i).toString()), 
                    Integer.parseInt(wfStatus.get(i).toString()), 
                    Short.parseShort(unitConvert.get(i).toString()), 
                    Integer.parseInt(axtAccessFlags.get(i).toString()), 
                    cyphCode.get(i).toString(), orgLogoId.get(i).toString(), 
                    tradingGrp.get(i).toString(), Integer.parseInt(begTime.get(i).toString()), 
                    Integer.parseInt(endTime.get(i).toString()), definition.get(i).toString(), 
                    code.get(i).toString(), grpCode.get(i).toString(), 
                    Short.parseShort(orderNr.get(i).toString()), geniusPayType.get(i).toString(), 
                    Integer.parseInt(geniusShpnr.get(i).toString()), 
                    Short.parseShort(prcaltertyp1.get(i).toString()), 
                    Double.parseDouble(prcalterlmt1.get(i).toString()), 
                    Short.parseShort(prcaltertyp2.get(i).toString()), 
                    Double.parseDouble(prcalterlmt2.get(i).toString()), 
                    Short.parseShort(prcaltertyp3.get(i).toString()), 
                    Double.parseDouble(prcalterlmt3.get(i).toString()), 
                    Short.parseShort(active.get(i).toString()), 
                    Integer.parseInt(purchcontRef.get(i).toString()), 
                    Short.parseShort(branch.get(i).toString()));

            tableValue.add(unitSet);
        }
        return tableValue;
    }
    
    public ArrayList<UnitBarcode> getUnitBarcodeArrayList(JSONObject jObject) {

        ArrayList<UnitBarcode> tableValue = new ArrayList<>();
        UnitBarcode unitSet;

        JSONArray logicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray itmUnitRef = (JSONArray) jObject.get("ITMUNITAREF");
        JSONArray itemRef = (JSONArray) jObject.get("ITEMREF");
        JSONArray variantRef = (JSONArray) jObject.get("VARIANTREF");
        JSONArray unitLineRef = (JSONArray) jObject.get("UNITLINEREF");
        JSONArray lineNr = (JSONArray) jObject.get("LINENR");
        JSONArray barcode = (JSONArray) jObject.get("BARCODE");
        JSONArray siteId = (JSONArray) jObject.get("SITEID");
        JSONArray recStatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray orgLogicalRef = (JSONArray) jObject.get("ORGLOGICREF");

        for (int i = 0; i < logicalRef.size(); i++) {
            unitSet = new UnitBarcode(
                    Integer.parseInt(logicalRef.get(i).toString()), 
                    Integer.parseInt(itmUnitRef.get(i).toString()), 
                    Integer.parseInt(itemRef.get(i).toString()), 
                    Integer.parseInt(variantRef.get(i).toString()), 
                    Integer.parseInt(unitLineRef.get(i).toString()),
                    Short.parseShort(lineNr.get(i).toString()), 
                    barcode.get(i).toString(),
                    Integer.parseInt(siteId.get(i).toString()), 
                    Short.parseShort(recStatus.get(i).toString()), 
                    Integer.parseInt(orgLogicalRef.get(i).toString()));

            tableValue.add(unitSet);
        }
        return tableValue;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saptaslama.controller.receiver;

import com.saptaslama.controller.sender.Sender;
import com.saptaslama.model.UnitSetF;
import com.saptaslama.model.UnitSetL;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Shagy
 */
public class UnitReceiver extends Sender{
    public ArrayList<UnitSetF> getUnitSetFArrayList(JSONObject jObject) {

        ArrayList<UnitSetF> tableValue = new ArrayList<>();
        UnitSetF unitSet;

        JSONArray arrayLogicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray arrayCode = (JSONArray) jObject.get("CODE");
        JSONArray arrayName = (JSONArray) jObject.get("NAME");
        JSONArray arrayCardType = (JSONArray) jObject.get("CARDTYPE");
        JSONArray arraySpecItem = (JSONArray) jObject.get("SPECITEM");
        JSONArray arraySpeCode = (JSONArray) jObject.get("SPECODE");
        JSONArray arrayCyphCode = (JSONArray) jObject.get("CYPHCODE");
        JSONArray arrayCapiBlockCreatedBy = (JSONArray) jObject.get("CAPIBLOCK_CREATEDBY");
        JSONArray arrayCapiBlockCreatedDate = (JSONArray) jObject.get("CAPIBLOCK_CREADEDDATE");
        JSONArray arrayCapiBlockCreatedHour = (JSONArray) jObject.get("CAPIBLOCK_CREATEDHOUR");
        JSONArray arrayCapiBlockCreatedMin = (JSONArray) jObject.get("CAPIBLOCK_CREATEDMIN");
        JSONArray arrayCapiBlockCreatedSec = (JSONArray) jObject.get("CAPIBLOCK_CREATEDSEC");
        JSONArray arrayCapiBlockModifiedBy = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDBY");
        JSONArray arrayCapiBlockModifiedDate = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDDATE");
        JSONArray arrayCapiBlockModifiedHour = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDHOUR");
        JSONArray arrayCapiBlockModifiedMin = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDMIN");
        JSONArray arrayCapiBlockModifiedSec = (JSONArray) jObject.get("CAPIBLOCK_MODIFIEDSEC");
        JSONArray arraySiteId = (JSONArray) jObject.get("SITEID");
        JSONArray arrayRecStatus = (JSONArray) jObject.get("RECSTATUS");
        JSONArray arrayOrgLogicRef = (JSONArray) jObject.get("ORGLOGICREF");
        JSONArray arrayWfStatus = (JSONArray) jObject.get("WFSTATUS");

        for (int i = 0; i < arrayLogicalRef.size(); i++) {
            unitSet = new UnitSetF(Integer.parseInt(arrayLogicalRef.get(i).toString()),
                    arrayCode.get(i).toString(), arrayName.get(i).toString(), 
                    Short.parseShort(arrayCardType.get(i).toString()), 
                    Short.parseShort(arraySpecItem.get(i).toString()), 
                    arraySpeCode.get(i).toString(), arrayCyphCode.get(i).toString(),
                    Short.parseShort(arrayCapiBlockCreatedBy.get(i).toString()), 
                    arrayCapiBlockCreatedDate.get(i).toString(),
                    Short.parseShort(arrayCapiBlockCreatedHour.get(i).toString()),
                    Short.parseShort(arrayCapiBlockCreatedMin.get(i).toString()),
                    Short.parseShort(arrayCapiBlockCreatedSec.get(i).toString()),
                    Short.parseShort(arrayCapiBlockModifiedBy.get(i).toString()),
                    arrayCapiBlockModifiedDate.get(i).toString(),
                    Short.parseShort(arrayCapiBlockModifiedHour.get(i).toString()),
                    Short.parseShort(arrayCapiBlockModifiedMin.get(i).toString()),
                    Short.parseShort(arrayCapiBlockModifiedSec.get(i).toString()),
                    Short.parseShort(arraySiteId.get(i).toString()),
                    Short.parseShort(arrayRecStatus.get(i).toString()),
                    Integer.parseInt(arrayOrgLogicRef.get(i).toString()),
                    Integer.parseInt(arrayWfStatus.get(i).toString()));

            tableValue.add(unitSet);
        }

        return tableValue;
    }
    
    public ArrayList<UnitSetL> getUnitSetLArrayList(JSONObject jObject) {

        ArrayList<UnitSetL> tableValue = new ArrayList<>();
        UnitSetL unitSet;

        JSONArray arrayCode = (JSONArray) jObject.get("CODE");
        JSONArray arrayArea = (JSONArray) jObject.get("AREA");
        JSONArray arrayAreaRef = (JSONArray) jObject.get("AREAREF");
        JSONArray arrayConvFact1 = (JSONArray) jObject.get("CONVFACT1");
        JSONArray arrayConvFact2 = (JSONArray) jObject.get("CONVFACT2");
        JSONArray arrayDivUnit = (JSONArray) jObject.get("DIVUNIT");
        JSONArray arrayHeight = (JSONArray) jObject.get("HEIGHT");
        JSONArray arrayHeightRef = (JSONArray) jObject.get("HEIGHTREF");
        JSONArray arrayLength = (JSONArray) jObject.get("LENGTH");
        JSONArray arrayLengthRef = (JSONArray) jObject.get("LENGTHREF");
        JSONArray arrayLinenr = (JSONArray) jObject.get("LINENR");
        JSONArray arrayLogicalRef = (JSONArray) jObject.get("LOGICALREF");
        JSONArray arrayMainUnit = (JSONArray) jObject.get("MAINUNIT");
        JSONArray arrayName = (JSONArray) jObject.get("NAME");
        JSONArray arrayUnitSetRef = (JSONArray) jObject.get("UNITSETREF");
        JSONArray arrayVolume = (JSONArray) jObject.get("VOLUME_");
        JSONArray arrayVolumeRef = (JSONArray) jObject.get("VOLUMEREF");
        JSONArray arrayWeight = (JSONArray) jObject.get("WEIGHT");
        JSONArray arrayWeightRef = (JSONArray) jObject.get("WEIGHTREF");
        JSONArray arrayWidth = (JSONArray) jObject.get("WIDTH");
        JSONArray arrayWidthRef = (JSONArray) jObject.get("WIDTHREF");

        for (int i = 0; i < arrayArea.size(); i++) {
            unitSet = new UnitSetL(Integer.parseInt(arrayLogicalRef.get(i).toString()),
                    arrayCode.get(i).toString(), arrayName.get(i).toString(),
                    Integer.parseInt(arrayUnitSetRef.get(i).toString()),
                    Short.parseShort(arrayLinenr.get(i).toString()),
                    Short.parseShort(arrayMainUnit.get(i).toString()),
                    Double.parseDouble(arrayConvFact1.get(i).toString()),
                    Double.parseDouble(arrayConvFact2.get(i).toString()),
                    Integer.parseInt(arrayWidth.get(i).toString()),
                    Double.parseDouble(arrayLength.get(i).toString()),
                    Double.parseDouble(arrayHeight.get(i).toString()),
                    Double.parseDouble(arrayArea.get(i).toString()),
                    Double.parseDouble(arrayVolume.get(i).toString()),
                    Double.parseDouble(arrayWeight.get(i).toString()),
                    Integer.parseInt(arrayWidthRef.get(i).toString()),
                    Integer.parseInt(arrayLengthRef.get(i).toString()),
                    Integer.parseInt(arrayHeightRef.get(i).toString()),
                    Integer.parseInt(arrayAreaRef.get(i).toString()),
                    Integer.parseInt(arrayVolumeRef.get(i).toString()),
                    Integer.parseInt(arrayWeightRef.get(i).toString()),
                    Short.parseShort(arrayDivUnit.get(i).toString()));

            tableValue.add(unitSet);
        }
        return tableValue;
    }
}

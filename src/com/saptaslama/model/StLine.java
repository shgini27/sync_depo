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
public class StLine implements java.io.Serializable{
    private int logicalRef;
    private int stockRef;
    private Short lineType;
    private int prevLineRef;
    private Short prevLineNo;
    private Short detLine;
    private Short trCode;
    private String date;
    private int fTime;
    private Short globTrans;
    private Short calcType;
    private int prodOrderRef;
    private Short sourceType;
    private Short sourceIndex;
    private Short sourceCostGrp;
    private int sourceWsRef;
    private int sourcePolnRef;
    private Short destType;
    private Short destIndex;
    private Short destCostGrp;
    private int destWsRef;
    private int destPolnRef;
    private Short factoryNr;
    private Short ioCode;
    private int stFicheRef;
    private Short stFicheLnNo;
    private int invoiceRef;
    private Short invoiceLnNo;
    private int clientRef;
    private int ordTransRef;
    private int ordFicheRef;
    private int centerRef;
    private int accountRef;
    private int vataccRef;
    private int vatCenterRef;
    private int praccRef;
    private int prCenterRef;
    private int prvatAccRef;
    private int prvatCenRef;
    private int promRef;
    private int payDefRef;
    private String specode;
    private String delyvryCode;
    private float amount;
    private float price;
    private float total;
    private Short prCurr;
    private float prPrice;
    private Short trCurr;
    private float trRate;
    private float reportRate;
    private float distCost;
    private float distDisc;
    private float distExp;
    private float distProm;
    private float discPer;
    private String lineExp;
    private int uomRef;
    private int usRef;
    private float uInfo1;
    private float uInfo2;
    private float uInfo3;
    private float uInfo4;
    private float uInfo5;
    private float uInfo6;
    private float uInfo7;
    private float uInfo8;
    private float plnAmount;
    private Short vatInc;
    private float vat;
    private float vatAmnt;
    private float vatMatrah;
    private int billedItem;
    private Short billed;
    private Short cpstFlag;
    private Short retCostType;
    private int sourceLink;
    private float retCost;
    private float retCostCurr;
    private float outCost;
    private float outCostCurr;
    private float retAmount;
    private int fareGRef;
    private Short faattrib;
    private Short cancelled;
    private float lineNet;
    private float distAddExp;
    private int fadAccRef;
    private int fadCenterRef;
    private int farAccRef;
    private int farCenterRef;
    private float diffPrice;
    private float diffPrCost;
    private Short decPrDiff;
    private Short lprodStat;
    private float prdExpTotal;
    private float diffRepPrice;
    private float diffPrCrCost;
    private int salesManRef;
    private int faplAccRef;
    private int faplCenterRef;
    private String outputIdCode;
    private int dRef;
    private float costRate;
    private Short xPriceUpd;
    private float xPrice;
    private float xRepRate;
    private float distCoef;
    private Short transQcok;
    private Short siteId;
    private Short recStatus;
    private int orgLogRef;
    private int wfStatus;
    private int poLineRef;
    private int plnstTransRef;
    private Short netDiscFlag;
    private float netDiscPerc;
    private float netDiscAmnt;
    private float netCalcDiff;
    private int conditionRef;
    private int distOrderRef;
    private int distOrderLineRef;
    private int campaignRefs1;
    private int campaignRefs2;
    private int campaignRefs3;
    private int campaignRefs4;
    private int campaignRefs5;
    private int pointCampRef;
    private float campPoint;
    private int promClasItemRef;
    private int cmpgLineRef;
    private int plnstTransPerNr;
    private float pordclsplnAmnt;
    private float vendcomm;
    private float previousOutCode;
    private int costOfSaleAccRef;
    private int purchAccRef;
    private int costOfSaleCentRef;
    private int purchCentRef;
    private float prevOutCostCurr;
    private float abvatAmount;
    private Short abvatStatus;
    private float prRate;
    private float addTaxRate;
    private float addTaxConvFact;
    private float addTaxAmount;
    private float addTaxPrCost;
    private float addTaxRetCost;
    private float addTaxRetCostCurr;
    private float grossuInfo1;
    private float grossuInfo2;
    private float addTaxPrCostCurr;
    private int addTaxAccRef;
    private int addTaxCenterRef;
    private Short addTaxAmntisupd;
    private float infidx;
    private int addTaxCosAccRef;
    private int addTaxCoscntRef;
    private float previousaTaxPrCost;
    private float prevaTaxPrCostCurr;
    private float prdOrdTotCoef;
    private float dempeggedAmnt;
    private float stdUnitCost;
    private float stdrpUnitCost;
    private int costDiffAccRef;
    private int costDiffCentRef;
    private Short textInc;
    private float addTaxDiscAmount;
    private String orgLogoId;
    private String eximFicheNo;
    private Short eximFicheType;
    private Short transExpLine;
    private Short insExpLine;
    private int eximwhfcRef;
    private int eximwhlnRef;
    private int eximFileRef;
    private Short eximprocnr;
    private Short eisrvdsttyp;
    private int mainStLnRef;
    private Short madeOfShred;
    private Short fromOrdWithPay;
    private int projectRef;
    private Short status;
    private Short doReserve;
    private int pointCampRefs1;
    private int pointCampRefs2;
    private int pointCampRefs3;
    private int pointCampRefs4;
    private float campPoints1;
    private float campPoints2;
    private float campPoints3;
    private float campPoints4;
    private int cmpgLineRefs1;
    private int cmpgLineRefs2;
    private int cmpgLineRefs3;
    private int cmpgLineRefs4;
    private int prcListRef;
    private Short pordsymOutLn;
    private Short month;
    private Short year;
    private float exAddTaxRate;
    private float exAddTaxConvf;
    private int exAddTaxaRef;
    private int exAddTaxcRef;
    private int otherAddTaxaRef;
    private int otherAddTaxcRef;
    private float exAddTaxAmnt;
    private Short affectCollatRl;
    private Short altPromFlag;
    private Short eidistflnNr;
    private Short eximType;
    private int variantRef;
    private Short canDeduct;
    private float outRemAmnt;
    private float outRemCost;
    private float outRemCostCurr;
    private int reflvataccRef;
    private int reflvatothaccRef;
    private int parentLnRef;
    private Short affectRisk;

    public StLine(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public StLine(int logicalRef, int stockRef, Short lineType, int prevLineRef, 
            Short prevLineNo, Short detLine, Short trCode, String date, int fTime, 
            Short globTrans, Short calcType, int prodOrderRef, Short sourceType, 
            Short sourceIndex, Short sourceCostGrp, int sourceWsRef, int sourcePolnRef, 
            Short destType, Short destIndex, Short destCostGrp, int destWsRef, int destPolnRef, 
            Short factoryNr, Short ioCode, int stFicheRef, Short stFicheLnNo, int invoiceRef, 
            Short invoiceLnNo, int clientRef, int ordTransRef, int ordFicheRef, int centerRef, 
            int accountRef, int vataccRef, int vatCenterRef, int praccRef, int prCenterRef, 
            int prvatAccRef, int prvatCenRef, int promRef, int payDefRef, String specode, 
            String delyvryCode, float amount, float price, float total, Short prCurr, 
            float prPrice, Short trCurr, float trRate, float reportRate, float distCost, 
            float distDisc, float distExp, float distProm, float discPer, String lineExp, 
            int uomRef, int usRef, float uInfo1, float uInfo2, float uInfo3, float uInfo4, 
            float uInfo5, float uInfo6, float uInfo7, float uInfo8, float plnAmount, 
            Short vatInc, float vat, float vatAmnt, float vatMatrah, int billedItem, 
            Short billed, Short cpstFlag, Short retCostType, int sourceLink, float retCost, 
            float retCostCurr, float outCost, float outCostCurr, float retAmount, 
            int fareGRef, Short faattrib, Short cancelled, float lineNet, float distAddExp, 
            int fadAccRef, int fadCenterRef, int farAccRef, int farCenterRef, float diffPrice, 
            float diffPrCost, Short decPrDiff, Short lprodStat, float prdExpTotal, float diffRepPrice, 
            float diffPrCrCost, int salesManRef, int faplAccRef, int faplCenterRef, String outputIdCode, 
            int dRef, float costRate, Short xPriceUpd, float xPrice, float xRepRate, float distCoef, 
            Short transQcok, Short siteId, Short recStatus, int orgLogRef, int wfStatus, 
            int poLineRef, int plnstTransRef, Short netDiscFlag, float netDiscPerc, float netDiscAmnt, 
            float netCalcDiff, int conditionRef, int distOrderRef, int distOrderLineRef, 
            int campaignRefs1, int campaignRefs2, int campaignRefs3, int campaignRefs4, 
            int campaignRefs5, int pointCampRef, float campPoint, int promClasItemRef, 
            int cmpgLineRef, int plnstTransPerNr, float pordclsplnAmnt, float vendcomm, 
            float previousOutCode, int costOfSaleAccRef, int purchAccRef, int costOfSaleCentRef, 
            int purchCentRef, float prevOutCostCurr, float abvatAmount, Short abvatStatus, 
            float prRate, float addTaxRate, float addTaxConvFact, float addTaxAmount, 
            float addTaxPrCost, float addTaxRetCost, float addTaxRetCostCurr, float grossuInfo1, 
            float grossuInfo2, float addTaxPrCostCurr, int addTaxAccRef, int addTaxCenterRef, 
            Short addTaxAmntisupd, float infidx, int addTaxCosAccRef, int addTaxCoscntRef, 
            float previousaTaxPrCost, float prevaTaxPrCostCurr, float prdOrdTotCoef, 
            float dempeggedAmnt, float stdUnitCost, float stdrpUnitCost, int costDiffAccRef, 
            int costDiffCentRef, Short textInc, float addTaxDiscAmount, String orgLogoId, 
            String eximFicheNo, Short eximFicheType, Short transExpLine, Short insExpLine, 
            int eximwhfcRef, int eximwhlnRef, int eximFileRef, Short eximprocnr, 
            Short eisrvdsttyp, int mainStLnRef, Short madeOfShred, Short fromOrdWithPay, 
            int projectRef, Short status, Short doReserve, int pointCampRefs1, 
            int pointCampRefs2, int pointCampRefs3, int pointCampRefs4, 
            float campPoints1, float campPoints2, float campPoints3, float campPoints4, 
            int cmpgLineRefs1, int cmpgLineRefs2, int cmpgLineRefs3, int cmpgLineRefs4, 
            int prcListRef, Short pordsymOutLn, Short month, Short year, float exAddTaxRate, 
            float exAddTaxConvf, int exAddTaxaRef, int exAddTaxcRef, int otherAddTaxaRef, 
            int otherAddTaxcRef, float exAddTaxAmnt, Short affectCollatRl, Short altPromFlag, 
            Short eidistflnNr, Short eximType, int variantRef, Short canDeduct, float outRemAmnt, 
            float outRemCost, float outRemCostCurr, int reflvataccRef, int reflvatothaccRef, 
            int parentLnRef, Short affectRisk) {
        this.logicalRef = logicalRef;
        this.stockRef = stockRef;
        this.lineType = lineType;
        this.prevLineRef = prevLineRef;
        this.prevLineNo = prevLineNo;
        this.detLine = detLine;
        this.trCode = trCode;
        this.date = date;
        this.fTime = fTime;
        this.globTrans = globTrans;
        this.calcType = calcType;
        this.prodOrderRef = prodOrderRef;
        this.sourceType = sourceType;
        this.sourceIndex = sourceIndex;
        this.sourceCostGrp = sourceCostGrp;
        this.sourceWsRef = sourceWsRef;
        this.sourcePolnRef = sourcePolnRef;
        this.destType = destType;
        this.destIndex = destIndex;
        this.destCostGrp = destCostGrp;
        this.destWsRef = destWsRef;
        this.destPolnRef = destPolnRef;
        this.factoryNr = factoryNr;
        this.ioCode = ioCode;
        this.stFicheRef = stFicheRef;
        this.stFicheLnNo = stFicheLnNo;
        this.invoiceRef = invoiceRef;
        this.invoiceLnNo = invoiceLnNo;
        this.clientRef = clientRef;
        this.ordTransRef = ordTransRef;
        this.ordFicheRef = ordFicheRef;
        this.centerRef = centerRef;
        this.accountRef = accountRef;
        this.vataccRef = vataccRef;
        this.vatCenterRef = vatCenterRef;
        this.praccRef = praccRef;
        this.prCenterRef = prCenterRef;
        this.prvatAccRef = prvatAccRef;
        this.prvatCenRef = prvatCenRef;
        this.promRef = promRef;
        this.payDefRef = payDefRef;
        this.specode = specode;
        this.delyvryCode = delyvryCode;
        this.amount = amount;
        this.price = price;
        this.total = total;
        this.prCurr = prCurr;
        this.prPrice = prPrice;
        this.trCurr = trCurr;
        this.trRate = trRate;
        this.reportRate = reportRate;
        this.distCost = distCost;
        this.distDisc = distDisc;
        this.distExp = distExp;
        this.distProm = distProm;
        this.discPer = discPer;
        this.lineExp = lineExp;
        this.uomRef = uomRef;
        this.usRef = usRef;
        this.uInfo1 = uInfo1;
        this.uInfo2 = uInfo2;
        this.uInfo3 = uInfo3;
        this.uInfo4 = uInfo4;
        this.uInfo5 = uInfo5;
        this.uInfo6 = uInfo6;
        this.uInfo7 = uInfo7;
        this.uInfo8 = uInfo8;
        this.plnAmount = plnAmount;
        this.vatInc = vatInc;
        this.vat = vat;
        this.vatAmnt = vatAmnt;
        this.vatMatrah = vatMatrah;
        this.billedItem = billedItem;
        this.billed = billed;
        this.cpstFlag = cpstFlag;
        this.retCostType = retCostType;
        this.sourceLink = sourceLink;
        this.retCost = retCost;
        this.retCostCurr = retCostCurr;
        this.outCost = outCost;
        this.outCostCurr = outCostCurr;
        this.retAmount = retAmount;
        this.fareGRef = fareGRef;
        this.faattrib = faattrib;
        this.cancelled = cancelled;
        this.lineNet = lineNet;
        this.distAddExp = distAddExp;
        this.fadAccRef = fadAccRef;
        this.fadCenterRef = fadCenterRef;
        this.farAccRef = farAccRef;
        this.farCenterRef = farCenterRef;
        this.diffPrice = diffPrice;
        this.diffPrCost = diffPrCost;
        this.decPrDiff = decPrDiff;
        this.lprodStat = lprodStat;
        this.prdExpTotal = prdExpTotal;
        this.diffRepPrice = diffRepPrice;
        this.diffPrCrCost = diffPrCrCost;
        this.salesManRef = salesManRef;
        this.faplAccRef = faplAccRef;
        this.faplCenterRef = faplCenterRef;
        this.outputIdCode = outputIdCode;
        this.dRef = dRef;
        this.costRate = costRate;
        this.xPriceUpd = xPriceUpd;
        this.xPrice = xPrice;
        this.xRepRate = xRepRate;
        this.distCoef = distCoef;
        this.transQcok = transQcok;
        this.siteId = siteId;
        this.recStatus = recStatus;
        this.orgLogRef = orgLogRef;
        this.wfStatus = wfStatus;
        this.poLineRef = poLineRef;
        this.plnstTransRef = plnstTransRef;
        this.netDiscFlag = netDiscFlag;
        this.netDiscPerc = netDiscPerc;
        this.netDiscAmnt = netDiscAmnt;
        this.netCalcDiff = netCalcDiff;
        this.conditionRef = conditionRef;
        this.distOrderRef = distOrderRef;
        this.distOrderLineRef = distOrderLineRef;
        this.campaignRefs1 = campaignRefs1;
        this.campaignRefs2 = campaignRefs2;
        this.campaignRefs3 = campaignRefs3;
        this.campaignRefs4 = campaignRefs4;
        this.campaignRefs5 = campaignRefs5;
        this.pointCampRef = pointCampRef;
        this.campPoint = campPoint;
        this.promClasItemRef = promClasItemRef;
        this.cmpgLineRef = cmpgLineRef;
        this.plnstTransPerNr = plnstTransPerNr;
        this.pordclsplnAmnt = pordclsplnAmnt;
        this.vendcomm = vendcomm;
        this.previousOutCode = previousOutCode;
        this.costOfSaleAccRef = costOfSaleAccRef;
        this.purchAccRef = purchAccRef;
        this.costOfSaleCentRef = costOfSaleCentRef;
        this.purchCentRef = purchCentRef;
        this.prevOutCostCurr = prevOutCostCurr;
        this.abvatAmount = abvatAmount;
        this.abvatStatus = abvatStatus;
        this.prRate = prRate;
        this.addTaxRate = addTaxRate;
        this.addTaxConvFact = addTaxConvFact;
        this.addTaxAmount = addTaxAmount;
        this.addTaxPrCost = addTaxPrCost;
        this.addTaxRetCost = addTaxRetCost;
        this.addTaxRetCostCurr = addTaxRetCostCurr;
        this.grossuInfo1 = grossuInfo1;
        this.grossuInfo2 = grossuInfo2;
        this.addTaxPrCostCurr = addTaxPrCostCurr;
        this.addTaxAccRef = addTaxAccRef;
        this.addTaxCenterRef = addTaxCenterRef;
        this.addTaxAmntisupd = addTaxAmntisupd;
        this.infidx = infidx;
        this.addTaxCosAccRef = addTaxCosAccRef;
        this.addTaxCoscntRef = addTaxCoscntRef;
        this.previousaTaxPrCost = previousaTaxPrCost;
        this.prevaTaxPrCostCurr = prevaTaxPrCostCurr;
        this.prdOrdTotCoef = prdOrdTotCoef;
        this.dempeggedAmnt = dempeggedAmnt;
        this.stdUnitCost = stdUnitCost;
        this.stdrpUnitCost = stdrpUnitCost;
        this.costDiffAccRef = costDiffAccRef;
        this.costDiffCentRef = costDiffCentRef;
        this.textInc = textInc;
        this.addTaxDiscAmount = addTaxDiscAmount;
        this.orgLogoId = orgLogoId;
        this.eximFicheNo = eximFicheNo;
        this.eximFicheType = eximFicheType;
        this.transExpLine = transExpLine;
        this.insExpLine = insExpLine;
        this.eximwhfcRef = eximwhfcRef;
        this.eximwhlnRef = eximwhlnRef;
        this.eximFileRef = eximFileRef;
        this.eximprocnr = eximprocnr;
        this.eisrvdsttyp = eisrvdsttyp;
        this.mainStLnRef = mainStLnRef;
        this.madeOfShred = madeOfShred;
        this.fromOrdWithPay = fromOrdWithPay;
        this.projectRef = projectRef;
        this.status = status;
        this.doReserve = doReserve;
        this.pointCampRefs1 = pointCampRefs1;
        this.pointCampRefs2 = pointCampRefs2;
        this.pointCampRefs3 = pointCampRefs3;
        this.pointCampRefs4 = pointCampRefs4;
        this.campPoints1 = campPoints1;
        this.campPoints2 = campPoints2;
        this.campPoints3 = campPoints3;
        this.campPoints4 = campPoints4;
        this.cmpgLineRefs1 = cmpgLineRefs1;
        this.cmpgLineRefs2 = cmpgLineRefs2;
        this.cmpgLineRefs3 = cmpgLineRefs3;
        this.cmpgLineRefs4 = cmpgLineRefs4;
        this.prcListRef = prcListRef;
        this.pordsymOutLn = pordsymOutLn;
        this.month = month;
        this.year = year;
        this.exAddTaxRate = exAddTaxRate;
        this.exAddTaxConvf = exAddTaxConvf;
        this.exAddTaxaRef = exAddTaxaRef;
        this.exAddTaxcRef = exAddTaxcRef;
        this.otherAddTaxaRef = otherAddTaxaRef;
        this.otherAddTaxcRef = otherAddTaxcRef;
        this.exAddTaxAmnt = exAddTaxAmnt;
        this.affectCollatRl = affectCollatRl;
        this.altPromFlag = altPromFlag;
        this.eidistflnNr = eidistflnNr;
        this.eximType = eximType;
        this.variantRef = variantRef;
        this.canDeduct = canDeduct;
        this.outRemAmnt = outRemAmnt;
        this.outRemCost = outRemCost;
        this.outRemCostCurr = outRemCostCurr;
        this.reflvataccRef = reflvataccRef;
        this.reflvatothaccRef = reflvatothaccRef;
        this.parentLnRef = parentLnRef;
        this.affectRisk = affectRisk;
    }

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public int getStockRef() {
        return stockRef;
    }

    public void setStockRef(int stockRef) {
        this.stockRef = stockRef;
    }

    public Short getLineType() {
        return lineType;
    }

    public void setLineType(Short lineType) {
        this.lineType = lineType;
    }

    public int getPrevLineRef() {
        return prevLineRef;
    }

    public void setPrevLineRef(int prevLineRef) {
        this.prevLineRef = prevLineRef;
    }

    public Short getPrevLineNo() {
        return prevLineNo;
    }

    public void setPrevLineNo(Short prevLineNo) {
        this.prevLineNo = prevLineNo;
    }

    public Short getDetLine() {
        return detLine;
    }

    public void setDetLine(Short detLine) {
        this.detLine = detLine;
    }

    public Short getTrCode() {
        return trCode;
    }

    public void setTrCode(Short trCode) {
        this.trCode = trCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getfTime() {
        return fTime;
    }

    public void setfTime(int fTime) {
        this.fTime = fTime;
    }

    public Short getGlobTrans() {
        return globTrans;
    }

    public void setGlobTrans(Short globTrans) {
        this.globTrans = globTrans;
    }

    public Short getCalcType() {
        return calcType;
    }

    public void setCalcType(Short calcType) {
        this.calcType = calcType;
    }

    public int getProdOrderRef() {
        return prodOrderRef;
    }

    public void setProdOrderRef(int prodOrderRef) {
        this.prodOrderRef = prodOrderRef;
    }

    public Short getSourceType() {
        return sourceType;
    }

    public void setSourceType(Short sourceType) {
        this.sourceType = sourceType;
    }

    public Short getSourceIndex() {
        return sourceIndex;
    }

    public void setSourceIndex(Short sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    public Short getSourceCostGrp() {
        return sourceCostGrp;
    }

    public void setSourceCostGrp(Short sourceCostGrp) {
        this.sourceCostGrp = sourceCostGrp;
    }

    public int getSourceWsRef() {
        return sourceWsRef;
    }

    public void setSourceWsRef(int sourceWsRef) {
        this.sourceWsRef = sourceWsRef;
    }

    public int getSourcePolnRef() {
        return sourcePolnRef;
    }

    public void setSourcePolnRef(int sourcePolnRef) {
        this.sourcePolnRef = sourcePolnRef;
    }

    public Short getDestType() {
        return destType;
    }

    public void setDestType(Short destType) {
        this.destType = destType;
    }

    public Short getDestIndex() {
        return destIndex;
    }

    public void setDestIndex(Short destIndex) {
        this.destIndex = destIndex;
    }

    public Short getDestCostGrp() {
        return destCostGrp;
    }

    public void setDestCostGrp(Short destCostGrp) {
        this.destCostGrp = destCostGrp;
    }

    public int getDestWsRef() {
        return destWsRef;
    }

    public void setDestWsRef(int destWsRef) {
        this.destWsRef = destWsRef;
    }

    public int getDestPolnRef() {
        return destPolnRef;
    }

    public void setDestPolnRef(int destPolnRef) {
        this.destPolnRef = destPolnRef;
    }

    public Short getFactoryNr() {
        return factoryNr;
    }

    public void setFactoryNr(Short factoryNr) {
        this.factoryNr = factoryNr;
    }

    public Short getIoCode() {
        return ioCode;
    }

    public void setIoCode(Short ioCode) {
        this.ioCode = ioCode;
    }

    public int getStFicheRef() {
        return stFicheRef;
    }

    public void setStFicheRef(int stFicheRef) {
        this.stFicheRef = stFicheRef;
    }

    public Short getStFicheLnNo() {
        return stFicheLnNo;
    }

    public void setStFicheLnNo(Short stFicheLnNo) {
        this.stFicheLnNo = stFicheLnNo;
    }

    public int getInvoiceRef() {
        return invoiceRef;
    }

    public void setInvoiceRef(int invoiceRef) {
        this.invoiceRef = invoiceRef;
    }

    public Short getInvoiceLnNo() {
        return invoiceLnNo;
    }

    public void setInvoiceLnNo(Short invoiceLnNo) {
        this.invoiceLnNo = invoiceLnNo;
    }

    public int getClientRef() {
        return clientRef;
    }

    public void setClientRef(int clientRef) {
        this.clientRef = clientRef;
    }

    public int getOrdTransRef() {
        return ordTransRef;
    }

    public void setOrdTransRef(int ordTransRef) {
        this.ordTransRef = ordTransRef;
    }

    public int getOrdFicheRef() {
        return ordFicheRef;
    }

    public void setOrdFicheRef(int ordFicheRef) {
        this.ordFicheRef = ordFicheRef;
    }

    public int getCenterRef() {
        return centerRef;
    }

    public void setCenterRef(int centerRef) {
        this.centerRef = centerRef;
    }

    public int getAccountRef() {
        return accountRef;
    }

    public void setAccountRef(int accountRef) {
        this.accountRef = accountRef;
    }

    public int getVataccRef() {
        return vataccRef;
    }

    public void setVataccRef(int vataccRef) {
        this.vataccRef = vataccRef;
    }

    public int getVatCenterRef() {
        return vatCenterRef;
    }

    public void setVatCenterRef(int vatCenterRef) {
        this.vatCenterRef = vatCenterRef;
    }

    public int getPraccRef() {
        return praccRef;
    }

    public void setPraccRef(int praccRef) {
        this.praccRef = praccRef;
    }

    public int getPrCenterRef() {
        return prCenterRef;
    }

    public void setPrCenterRef(int prCenterRef) {
        this.prCenterRef = prCenterRef;
    }

    public int getPrvatAccRef() {
        return prvatAccRef;
    }

    public void setPrvatAccRef(int prvatAccRef) {
        this.prvatAccRef = prvatAccRef;
    }

    public int getPrvatCenRef() {
        return prvatCenRef;
    }

    public void setPrvatCenRef(int prvatCenRef) {
        this.prvatCenRef = prvatCenRef;
    }

    public int getPromRef() {
        return promRef;
    }

    public void setPromRef(int promRef) {
        this.promRef = promRef;
    }

    public int getPayDefRef() {
        return payDefRef;
    }

    public void setPayDefRef(int payDefRef) {
        this.payDefRef = payDefRef;
    }

    public String getSpecode() {
        return specode;
    }

    public void setSpecode(String specode) {
        this.specode = specode;
    }

    public String getDelyvryCode() {
        return delyvryCode;
    }

    public void setDelyvryCode(String delyvryCode) {
        this.delyvryCode = delyvryCode;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Short getPrCurr() {
        return prCurr;
    }

    public void setPrCurr(Short prCurr) {
        this.prCurr = prCurr;
    }

    public float getPrPrice() {
        return prPrice;
    }

    public void setPrPrice(float prPrice) {
        this.prPrice = prPrice;
    }

    public Short getTrCurr() {
        return trCurr;
    }

    public void setTrCurr(Short trCurr) {
        this.trCurr = trCurr;
    }

    public float getTrRate() {
        return trRate;
    }

    public void setTrRate(float trRate) {
        this.trRate = trRate;
    }

    public float getReportRate() {
        return reportRate;
    }

    public void setReportRate(float reportRate) {
        this.reportRate = reportRate;
    }

    public float getDistCost() {
        return distCost;
    }

    public void setDistCost(float distCost) {
        this.distCost = distCost;
    }

    public float getDistDisc() {
        return distDisc;
    }

    public void setDistDisc(float distDisc) {
        this.distDisc = distDisc;
    }

    public float getDistExp() {
        return distExp;
    }

    public void setDistExp(float distExp) {
        this.distExp = distExp;
    }

    public float getDistProm() {
        return distProm;
    }

    public void setDistProm(float distProm) {
        this.distProm = distProm;
    }

    public float getDiscPer() {
        return discPer;
    }

    public void setDiscPer(float discPer) {
        this.discPer = discPer;
    }

    public String getLineExp() {
        return lineExp;
    }

    public void setLineExp(String lineExp) {
        this.lineExp = lineExp;
    }

    public int getUomRef() {
        return uomRef;
    }

    public void setUomRef(int uomRef) {
        this.uomRef = uomRef;
    }

    public int getUsRef() {
        return usRef;
    }

    public void setUsRef(int usRef) {
        this.usRef = usRef;
    }

    public float getuInfo1() {
        return uInfo1;
    }

    public void setuInfo1(float uInfo1) {
        this.uInfo1 = uInfo1;
    }

    public float getuInfo2() {
        return uInfo2;
    }

    public void setuInfo2(float uInfo2) {
        this.uInfo2 = uInfo2;
    }

    public float getuInfo3() {
        return uInfo3;
    }

    public void setuInfo3(float uInfo3) {
        this.uInfo3 = uInfo3;
    }

    public float getuInfo4() {
        return uInfo4;
    }

    public void setuInfo4(float uInfo4) {
        this.uInfo4 = uInfo4;
    }

    public float getuInfo5() {
        return uInfo5;
    }

    public void setuInfo5(float uInfo5) {
        this.uInfo5 = uInfo5;
    }

    public float getuInfo6() {
        return uInfo6;
    }

    public void setuInfo6(float uInfo6) {
        this.uInfo6 = uInfo6;
    }

    public float getuInfo7() {
        return uInfo7;
    }

    public void setuInfo7(float uInfo7) {
        this.uInfo7 = uInfo7;
    }

    public float getuInfo8() {
        return uInfo8;
    }

    public void setuInfo8(float uInfo8) {
        this.uInfo8 = uInfo8;
    }

    public float getPlnAmount() {
        return plnAmount;
    }

    public void setPlnAmount(float plnAmount) {
        this.plnAmount = plnAmount;
    }

    public Short getVatInc() {
        return vatInc;
    }

    public void setVatInc(Short vatInc) {
        this.vatInc = vatInc;
    }

    public float getVat() {
        return vat;
    }

    public void setVat(float vat) {
        this.vat = vat;
    }

    public float getVatAmnt() {
        return vatAmnt;
    }

    public void setVatAmnt(float vatAmnt) {
        this.vatAmnt = vatAmnt;
    }

    public float getVatMatrah() {
        return vatMatrah;
    }

    public void setVatMatrah(float vatMatrah) {
        this.vatMatrah = vatMatrah;
    }

    public int getBilledItem() {
        return billedItem;
    }

    public void setBilledItem(int billedItem) {
        this.billedItem = billedItem;
    }

    public Short getBilled() {
        return billed;
    }

    public void setBilled(Short billed) {
        this.billed = billed;
    }

    public Short getCpstFlag() {
        return cpstFlag;
    }

    public void setCpstFlag(Short cpstFlag) {
        this.cpstFlag = cpstFlag;
    }

    public Short getRetCostType() {
        return retCostType;
    }

    public void setRetCostType(Short retCostType) {
        this.retCostType = retCostType;
    }

    public int getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(int sourceLink) {
        this.sourceLink = sourceLink;
    }

    public float getRetCost() {
        return retCost;
    }

    public void setRetCost(float retCost) {
        this.retCost = retCost;
    }

    public float getRetCostCurr() {
        return retCostCurr;
    }

    public void setRetCostCurr(float retCostCurr) {
        this.retCostCurr = retCostCurr;
    }

    public float getOutCost() {
        return outCost;
    }

    public void setOutCost(float outCost) {
        this.outCost = outCost;
    }

    public float getOutCostCurr() {
        return outCostCurr;
    }

    public void setOutCostCurr(float outCostCurr) {
        this.outCostCurr = outCostCurr;
    }

    public float getRetAmount() {
        return retAmount;
    }

    public void setRetAmount(float retAmount) {
        this.retAmount = retAmount;
    }

    public int getFareGRef() {
        return fareGRef;
    }

    public void setFareGRef(int fareGRef) {
        this.fareGRef = fareGRef;
    }

    public Short getFaattrib() {
        return faattrib;
    }

    public void setFaattrib(Short faattrib) {
        this.faattrib = faattrib;
    }

    public Short getCancelled() {
        return cancelled;
    }

    public void setCancelled(Short cancelled) {
        this.cancelled = cancelled;
    }

    public float getLineNet() {
        return lineNet;
    }

    public void setLineNet(float lineNet) {
        this.lineNet = lineNet;
    }

    public float getDistAddExp() {
        return distAddExp;
    }

    public void setDistAddExp(float distAddExp) {
        this.distAddExp = distAddExp;
    }

    public int getFadAccRef() {
        return fadAccRef;
    }

    public void setFadAccRef(int fadAccRef) {
        this.fadAccRef = fadAccRef;
    }

    public int getFadCenterRef() {
        return fadCenterRef;
    }

    public void setFadCenterRef(int fadCenterRef) {
        this.fadCenterRef = fadCenterRef;
    }

    public int getFarAccRef() {
        return farAccRef;
    }

    public void setFarAccRef(int farAccRef) {
        this.farAccRef = farAccRef;
    }

    public int getFarCenterRef() {
        return farCenterRef;
    }

    public void setFarCenterRef(int farCenterRef) {
        this.farCenterRef = farCenterRef;
    }

    public float getDiffPrice() {
        return diffPrice;
    }

    public void setDiffPrice(float diffPrice) {
        this.diffPrice = diffPrice;
    }

    public float getDiffPrCost() {
        return diffPrCost;
    }

    public void setDiffPrCost(float diffPrCost) {
        this.diffPrCost = diffPrCost;
    }

    public Short getDecPrDiff() {
        return decPrDiff;
    }

    public void setDecPrDiff(Short decPrDiff) {
        this.decPrDiff = decPrDiff;
    }

    public Short getLprodStat() {
        return lprodStat;
    }

    public void setLprodStat(Short lprodStat) {
        this.lprodStat = lprodStat;
    }

    public float getPrdExpTotal() {
        return prdExpTotal;
    }

    public void setPrdExpTotal(float prdExpTotal) {
        this.prdExpTotal = prdExpTotal;
    }

    public float getDiffRepPrice() {
        return diffRepPrice;
    }

    public void setDiffRepPrice(float diffRepPrice) {
        this.diffRepPrice = diffRepPrice;
    }

    public float getDiffPrCrCost() {
        return diffPrCrCost;
    }

    public void setDiffPrCrCost(float diffPrCrCost) {
        this.diffPrCrCost = diffPrCrCost;
    }

    public int getSalesManRef() {
        return salesManRef;
    }

    public void setSalesManRef(int salesManRef) {
        this.salesManRef = salesManRef;
    }

    public int getFaplAccRef() {
        return faplAccRef;
    }

    public void setFaplAccRef(int faplAccRef) {
        this.faplAccRef = faplAccRef;
    }

    public int getFaplCenterRef() {
        return faplCenterRef;
    }

    public void setFaplCenterRef(int faplCenterRef) {
        this.faplCenterRef = faplCenterRef;
    }

    public String getOutputIdCode() {
        return outputIdCode;
    }

    public void setOutputIdCode(String outputIdCode) {
        this.outputIdCode = outputIdCode;
    }

    public int getdRef() {
        return dRef;
    }

    public void setdRef(int dRef) {
        this.dRef = dRef;
    }

    public float getCostRate() {
        return costRate;
    }

    public void setCostRate(float costRate) {
        this.costRate = costRate;
    }

    public Short getxPriceUpd() {
        return xPriceUpd;
    }

    public void setxPriceUpd(Short xPriceUpd) {
        this.xPriceUpd = xPriceUpd;
    }

    public float getxPrice() {
        return xPrice;
    }

    public void setxPrice(float xPrice) {
        this.xPrice = xPrice;
    }

    public float getxRepRate() {
        return xRepRate;
    }

    public void setxRepRate(float xRepRate) {
        this.xRepRate = xRepRate;
    }

    public float getDistCoef() {
        return distCoef;
    }

    public void setDistCoef(float distCoef) {
        this.distCoef = distCoef;
    }

    public Short getTransQcok() {
        return transQcok;
    }

    public void setTransQcok(Short transQcok) {
        this.transQcok = transQcok;
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

    public int getOrgLogRef() {
        return orgLogRef;
    }

    public void setOrgLogRef(int orgLogRef) {
        this.orgLogRef = orgLogRef;
    }

    public int getWfStatus() {
        return wfStatus;
    }

    public void setWfStatus(int wfStatus) {
        this.wfStatus = wfStatus;
    }

    public int getPoLineRef() {
        return poLineRef;
    }

    public void setPoLineRef(int poLineRef) {
        this.poLineRef = poLineRef;
    }

    public int getPlnstTransRef() {
        return plnstTransRef;
    }

    public void setPlnstTransRef(int plnstTransRef) {
        this.plnstTransRef = plnstTransRef;
    }

    public Short getNetDiscFlag() {
        return netDiscFlag;
    }

    public void setNetDiscFlag(Short netDiscFlag) {
        this.netDiscFlag = netDiscFlag;
    }

    public float getNetDiscPerc() {
        return netDiscPerc;
    }

    public void setNetDiscPerc(float netDiscPerc) {
        this.netDiscPerc = netDiscPerc;
    }

    public float getNetDiscAmnt() {
        return netDiscAmnt;
    }

    public void setNetDiscAmnt(float netDiscAmnt) {
        this.netDiscAmnt = netDiscAmnt;
    }

    public float getNetCalcDiff() {
        return netCalcDiff;
    }

    public void setNetCalcDiff(float netCalcDiff) {
        this.netCalcDiff = netCalcDiff;
    }

    public int getConditionRef() {
        return conditionRef;
    }

    public void setConditionRef(int conditionRef) {
        this.conditionRef = conditionRef;
    }

    public int getDistOrderRef() {
        return distOrderRef;
    }

    public void setDistOrderRef(int distOrderRef) {
        this.distOrderRef = distOrderRef;
    }

    public int getDistOrderLineRef() {
        return distOrderLineRef;
    }

    public void setDistOrderLineRef(int distOrderLineRef) {
        this.distOrderLineRef = distOrderLineRef;
    }

    public int getCampaignRefs1() {
        return campaignRefs1;
    }

    public void setCampaignRefs1(int campaignRefs1) {
        this.campaignRefs1 = campaignRefs1;
    }

    public int getCampaignRefs2() {
        return campaignRefs2;
    }

    public void setCampaignRefs2(int campaignRefs2) {
        this.campaignRefs2 = campaignRefs2;
    }

    public int getCampaignRefs3() {
        return campaignRefs3;
    }

    public void setCampaignRefs3(int campaignRefs3) {
        this.campaignRefs3 = campaignRefs3;
    }

    public int getCampaignRefs4() {
        return campaignRefs4;
    }

    public void setCampaignRefs4(int campaignRefs4) {
        this.campaignRefs4 = campaignRefs4;
    }

    public int getCampaignRefs5() {
        return campaignRefs5;
    }

    public void setCampaignRefs5(int campaignRefs5) {
        this.campaignRefs5 = campaignRefs5;
    }

    public int getPointCampRef() {
        return pointCampRef;
    }

    public void setPointCampRef(int pointCampRef) {
        this.pointCampRef = pointCampRef;
    }

    public float getCampPoint() {
        return campPoint;
    }

    public void setCampPoint(float campPoint) {
        this.campPoint = campPoint;
    }

    public int getPromClasItemRef() {
        return promClasItemRef;
    }

    public void setPromClasItemRef(int promClasItemRef) {
        this.promClasItemRef = promClasItemRef;
    }

    public int getCmpgLineRef() {
        return cmpgLineRef;
    }

    public void setCmpgLineRef(int cmpgLineRef) {
        this.cmpgLineRef = cmpgLineRef;
    }

    public int getPlnstTransPerNr() {
        return plnstTransPerNr;
    }

    public void setPlnstTransPerNr(int plnstTransPerNr) {
        this.plnstTransPerNr = plnstTransPerNr;
    }

    public float getPordclsplnAmnt() {
        return pordclsplnAmnt;
    }

    public void setPordclsplnAmnt(float pordclsplnAmnt) {
        this.pordclsplnAmnt = pordclsplnAmnt;
    }

    public float getVendcomm() {
        return vendcomm;
    }

    public void setVendcomm(float vendcomm) {
        this.vendcomm = vendcomm;
    }

    public float getPreviousOutCode() {
        return previousOutCode;
    }

    public void setPreviousOutCode(float previousOutCode) {
        this.previousOutCode = previousOutCode;
    }

    public int getCostOfSaleAccRef() {
        return costOfSaleAccRef;
    }

    public void setCostOfSaleAccRef(int costOfSaleAccRef) {
        this.costOfSaleAccRef = costOfSaleAccRef;
    }

    public int getPurchAccRef() {
        return purchAccRef;
    }

    public void setPurchAccRef(int purchAccRef) {
        this.purchAccRef = purchAccRef;
    }

    public int getCostOfSaleCentRef() {
        return costOfSaleCentRef;
    }

    public void setCostOfSaleCentRef(int costOfSaleCentRef) {
        this.costOfSaleCentRef = costOfSaleCentRef;
    }

    public int getPurchCentRef() {
        return purchCentRef;
    }

    public void setPurchCentRef(int purchCentRef) {
        this.purchCentRef = purchCentRef;
    }

    public float getPrevOutCostCurr() {
        return prevOutCostCurr;
    }

    public void setPrevOutCostCurr(float prevOutCostCurr) {
        this.prevOutCostCurr = prevOutCostCurr;
    }

    public float getAbvatAmount() {
        return abvatAmount;
    }

    public void setAbvatAmount(float abvatAmount) {
        this.abvatAmount = abvatAmount;
    }

    public Short getAbvatStatus() {
        return abvatStatus;
    }

    public void setAbvatStatus(Short abvatStatus) {
        this.abvatStatus = abvatStatus;
    }

    public float getPrRate() {
        return prRate;
    }

    public void setPrRate(float prRate) {
        this.prRate = prRate;
    }

    public float getAddTaxRate() {
        return addTaxRate;
    }

    public void setAddTaxRate(float addTaxRate) {
        this.addTaxRate = addTaxRate;
    }

    public float getAddTaxConvFact() {
        return addTaxConvFact;
    }

    public void setAddTaxConvFact(float addTaxConvFact) {
        this.addTaxConvFact = addTaxConvFact;
    }

    public float getAddTaxAmount() {
        return addTaxAmount;
    }

    public void setAddTaxAmount(float addTaxAmount) {
        this.addTaxAmount = addTaxAmount;
    }

    public float getAddTaxPrCost() {
        return addTaxPrCost;
    }

    public void setAddTaxPrCost(float addTaxPrCost) {
        this.addTaxPrCost = addTaxPrCost;
    }

    public float getAddTaxRetCost() {
        return addTaxRetCost;
    }

    public void setAddTaxRetCost(float addTaxRetCost) {
        this.addTaxRetCost = addTaxRetCost;
    }

    public float getAddTaxRetCostCurr() {
        return addTaxRetCostCurr;
    }

    public void setAddTaxRetCostCurr(float addTaxRetCostCurr) {
        this.addTaxRetCostCurr = addTaxRetCostCurr;
    }

    public float getGrossuInfo1() {
        return grossuInfo1;
    }

    public void setGrossuInfo1(float grossuInfo1) {
        this.grossuInfo1 = grossuInfo1;
    }

    public float getGrossuInfo2() {
        return grossuInfo2;
    }

    public void setGrossuInfo2(float grossuInfo2) {
        this.grossuInfo2 = grossuInfo2;
    }

    public float getAddTaxPrCostCurr() {
        return addTaxPrCostCurr;
    }

    public void setAddTaxPrCostCurr(float addTaxPrCostCurr) {
        this.addTaxPrCostCurr = addTaxPrCostCurr;
    }

    public int getAddTaxAccRef() {
        return addTaxAccRef;
    }

    public void setAddTaxAccRef(int addTaxAccRef) {
        this.addTaxAccRef = addTaxAccRef;
    }

    public int getAddTaxCenterRef() {
        return addTaxCenterRef;
    }

    public void setAddTaxCenterRef(int addTaxCenterRef) {
        this.addTaxCenterRef = addTaxCenterRef;
    }

    public Short getAddTaxAmntisupd() {
        return addTaxAmntisupd;
    }

    public void setAddTaxAmntisupd(Short addTaxAmntisupd) {
        this.addTaxAmntisupd = addTaxAmntisupd;
    }

    public float getInfidx() {
        return infidx;
    }

    public void setInfidx(float infidx) {
        this.infidx = infidx;
    }

    public int getAddTaxCosAccRef() {
        return addTaxCosAccRef;
    }

    public void setAddTaxCosAccRef(int addTaxCosAccRef) {
        this.addTaxCosAccRef = addTaxCosAccRef;
    }

    public int getAddTaxCoscntRef() {
        return addTaxCoscntRef;
    }

    public void setAddTaxCoscntRef(int addTaxCoscntRef) {
        this.addTaxCoscntRef = addTaxCoscntRef;
    }

    public float getPreviousaTaxPrCost() {
        return previousaTaxPrCost;
    }

    public void setPreviousaTaxPrCost(float previousaTaxPrCost) {
        this.previousaTaxPrCost = previousaTaxPrCost;
    }

    public float getPrevaTaxPrCostCurr() {
        return prevaTaxPrCostCurr;
    }

    public void setPrevaTaxPrCostCurr(float prevaTaxPrCostCurr) {
        this.prevaTaxPrCostCurr = prevaTaxPrCostCurr;
    }

    public float getPrdOrdTotCoef() {
        return prdOrdTotCoef;
    }

    public void setPrdOrdTotCoef(float prdOrdTotCoef) {
        this.prdOrdTotCoef = prdOrdTotCoef;
    }

    public float getDempeggedAmnt() {
        return dempeggedAmnt;
    }

    public void setDempeggedAmnt(float dempeggedAmnt) {
        this.dempeggedAmnt = dempeggedAmnt;
    }

    public float getStdUnitCost() {
        return stdUnitCost;
    }

    public void setStdUnitCost(float stdUnitCost) {
        this.stdUnitCost = stdUnitCost;
    }

    public float getStdrpUnitCost() {
        return stdrpUnitCost;
    }

    public void setStdrpUnitCost(float stdrpUnitCost) {
        this.stdrpUnitCost = stdrpUnitCost;
    }

    public int getCostDiffAccRef() {
        return costDiffAccRef;
    }

    public void setCostDiffAccRef(int costDiffAccRef) {
        this.costDiffAccRef = costDiffAccRef;
    }

    public int getCostDiffCentRef() {
        return costDiffCentRef;
    }

    public void setCostDiffCentRef(int costDiffCentRef) {
        this.costDiffCentRef = costDiffCentRef;
    }

    public Short getTextInc() {
        return textInc;
    }

    public void setTextInc(Short textInc) {
        this.textInc = textInc;
    }

    public float getAddTaxDiscAmount() {
        return addTaxDiscAmount;
    }

    public void setAddTaxDiscAmount(float addTaxDiscAmount) {
        this.addTaxDiscAmount = addTaxDiscAmount;
    }

    public String getOrgLogoId() {
        return orgLogoId;
    }

    public void setOrgLogoId(String orgLogoId) {
        this.orgLogoId = orgLogoId;
    }

    public String getEximFicheNo() {
        return eximFicheNo;
    }

    public void setEximFicheNo(String eximFicheNo) {
        this.eximFicheNo = eximFicheNo;
    }

    public Short getEximFicheType() {
        return eximFicheType;
    }

    public void setEximFicheType(Short eximFicheType) {
        this.eximFicheType = eximFicheType;
    }

    public Short getTransExpLine() {
        return transExpLine;
    }

    public void setTransExpLine(Short transExpLine) {
        this.transExpLine = transExpLine;
    }

    public Short getInsExpLine() {
        return insExpLine;
    }

    public void setInsExpLine(Short insExpLine) {
        this.insExpLine = insExpLine;
    }

    public int getEximwhfcRef() {
        return eximwhfcRef;
    }

    public void setEximwhfcRef(int eximwhfcRef) {
        this.eximwhfcRef = eximwhfcRef;
    }

    public int getEximwhlnRef() {
        return eximwhlnRef;
    }

    public void setEximwhlnRef(int eximwhlnRef) {
        this.eximwhlnRef = eximwhlnRef;
    }

    public int getEximFileRef() {
        return eximFileRef;
    }

    public void setEximFileRef(int eximFileRef) {
        this.eximFileRef = eximFileRef;
    }

    public Short getEximprocnr() {
        return eximprocnr;
    }

    public void setEximprocnr(Short eximprocnr) {
        this.eximprocnr = eximprocnr;
    }

    public Short getEisrvdsttyp() {
        return eisrvdsttyp;
    }

    public void setEisrvdsttyp(Short eisrvdsttyp) {
        this.eisrvdsttyp = eisrvdsttyp;
    }

    public int getMainStLnRef() {
        return mainStLnRef;
    }

    public void setMainStLnRef(int mainStLnRef) {
        this.mainStLnRef = mainStLnRef;
    }

    public Short getMadeOfShred() {
        return madeOfShred;
    }

    public void setMadeOfShred(Short madeOfShred) {
        this.madeOfShred = madeOfShred;
    }

    public Short getFromOrdWithPay() {
        return fromOrdWithPay;
    }

    public void setFromOrdWithPay(Short fromOrdWithPay) {
        this.fromOrdWithPay = fromOrdWithPay;
    }

    public int getProjectRef() {
        return projectRef;
    }

    public void setProjectRef(int projectRef) {
        this.projectRef = projectRef;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getDoReserve() {
        return doReserve;
    }

    public void setDoReserve(Short doReserve) {
        this.doReserve = doReserve;
    }

    public int getPointCampRefs1() {
        return pointCampRefs1;
    }

    public void setPointCampRefs1(int pointCampRefs1) {
        this.pointCampRefs1 = pointCampRefs1;
    }

    public int getPointCampRefs2() {
        return pointCampRefs2;
    }

    public void setPointCampRefs2(int pointCampRefs2) {
        this.pointCampRefs2 = pointCampRefs2;
    }

    public int getPointCampRefs3() {
        return pointCampRefs3;
    }

    public void setPointCampRefs3(int pointCampRefs3) {
        this.pointCampRefs3 = pointCampRefs3;
    }

    public int getPointCampRefs4() {
        return pointCampRefs4;
    }

    public void setPointCampRefs4(int pointCampRefs4) {
        this.pointCampRefs4 = pointCampRefs4;
    }

    public float getCampPoints1() {
        return campPoints1;
    }

    public void setCampPoints1(float campPoints1) {
        this.campPoints1 = campPoints1;
    }

    public float getCampPoints2() {
        return campPoints2;
    }

    public void setCampPoints2(float campPoints2) {
        this.campPoints2 = campPoints2;
    }

    public float getCampPoints3() {
        return campPoints3;
    }

    public void setCampPoints3(float campPoints3) {
        this.campPoints3 = campPoints3;
    }

    public float getCampPoints4() {
        return campPoints4;
    }

    public void setCampPoints4(float campPoints4) {
        this.campPoints4 = campPoints4;
    }

    public int getCmpgLineRefs1() {
        return cmpgLineRefs1;
    }

    public void setCmpgLineRefs1(int cmpgLineRefs1) {
        this.cmpgLineRefs1 = cmpgLineRefs1;
    }

    public int getCmpgLineRefs2() {
        return cmpgLineRefs2;
    }

    public void setCmpgLineRefs2(int cmpgLineRefs2) {
        this.cmpgLineRefs2 = cmpgLineRefs2;
    }

    public int getCmpgLineRefs3() {
        return cmpgLineRefs3;
    }

    public void setCmpgLineRefs3(int cmpgLineRefs3) {
        this.cmpgLineRefs3 = cmpgLineRefs3;
    }

    public int getCmpgLineRefs4() {
        return cmpgLineRefs4;
    }

    public void setCmpgLineRefs4(int cmpgLineRefs4) {
        this.cmpgLineRefs4 = cmpgLineRefs4;
    }

    public int getPrcListRef() {
        return prcListRef;
    }

    public void setPrcListRef(int prcListRef) {
        this.prcListRef = prcListRef;
    }

    public Short getPordsymOutLn() {
        return pordsymOutLn;
    }

    public void setPordsymOutLn(Short pordsymOutLn) {
        this.pordsymOutLn = pordsymOutLn;
    }

    public Short getMonth() {
        return month;
    }

    public void setMonth(Short month) {
        this.month = month;
    }

    public Short getYear() {
        return year;
    }

    public void setYear(Short year) {
        this.year = year;
    }

    public float getExAddTaxRate() {
        return exAddTaxRate;
    }

    public void setExAddTaxRate(float exAddTaxRate) {
        this.exAddTaxRate = exAddTaxRate;
    }

    public float getExAddTaxConvf() {
        return exAddTaxConvf;
    }

    public void setExAddTaxConvf(float exAddTaxConvf) {
        this.exAddTaxConvf = exAddTaxConvf;
    }

    public int getExAddTaxaRef() {
        return exAddTaxaRef;
    }

    public void setExAddTaxaRef(int exAddTaxaRef) {
        this.exAddTaxaRef = exAddTaxaRef;
    }

    public int getExAddTaxcRef() {
        return exAddTaxcRef;
    }

    public void setExAddTaxcRef(int exAddTaxcRef) {
        this.exAddTaxcRef = exAddTaxcRef;
    }

    public int getOtherAddTaxaRef() {
        return otherAddTaxaRef;
    }

    public void setOtherAddTaxaRef(int otherAddTaxaRef) {
        this.otherAddTaxaRef = otherAddTaxaRef;
    }

    public int getOtherAddTaxcRef() {
        return otherAddTaxcRef;
    }

    public void setOtherAddTaxcRef(int otherAddTaxcRef) {
        this.otherAddTaxcRef = otherAddTaxcRef;
    }

    public float getExAddTaxAmnt() {
        return exAddTaxAmnt;
    }

    public void setExAddTaxAmnt(float exAddTaxAmnt) {
        this.exAddTaxAmnt = exAddTaxAmnt;
    }

    public Short getAffectCollatRl() {
        return affectCollatRl;
    }

    public void setAffectCollatRl(Short affectCollatRl) {
        this.affectCollatRl = affectCollatRl;
    }

    public Short getAltPromFlag() {
        return altPromFlag;
    }

    public void setAltPromFlag(Short altPromFlag) {
        this.altPromFlag = altPromFlag;
    }

    public Short getEidistflnNr() {
        return eidistflnNr;
    }

    public void setEidistflnNr(Short eidistflnNr) {
        this.eidistflnNr = eidistflnNr;
    }

    public Short getEximType() {
        return eximType;
    }

    public void setEximType(Short eximType) {
        this.eximType = eximType;
    }

    public int getVariantRef() {
        return variantRef;
    }

    public void setVariantRef(int variantRef) {
        this.variantRef = variantRef;
    }

    public Short getCanDeduct() {
        return canDeduct;
    }

    public void setCanDeduct(Short canDeduct) {
        this.canDeduct = canDeduct;
    }

    public float getOutRemAmnt() {
        return outRemAmnt;
    }

    public void setOutRemAmnt(float outRemAmnt) {
        this.outRemAmnt = outRemAmnt;
    }

    public float getOutRemCost() {
        return outRemCost;
    }

    public void setOutRemCost(float outRemCost) {
        this.outRemCost = outRemCost;
    }

    public float getOutRemCostCurr() {
        return outRemCostCurr;
    }

    public void setOutRemCostCurr(float outRemCostCurr) {
        this.outRemCostCurr = outRemCostCurr;
    }

    public int getReflvataccRef() {
        return reflvataccRef;
    }

    public void setReflvataccRef(int reflvataccRef) {
        this.reflvataccRef = reflvataccRef;
    }

    public int getReflvatothaccRef() {
        return reflvatothaccRef;
    }

    public void setReflvatothaccRef(int reflvatothaccRef) {
        this.reflvatothaccRef = reflvatothaccRef;
    }

    public int getParentLnRef() {
        return parentLnRef;
    }

    public void setParentLnRef(int parentLnRef) {
        this.parentLnRef = parentLnRef;
    }

    public Short getAffectRisk() {
        return affectRisk;
    }

    public void setAffectRisk(Short affectRisk) {
        this.affectRisk = affectRisk;
    }
    
    
}

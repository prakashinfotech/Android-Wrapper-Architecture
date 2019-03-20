package webservice;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 8/11/2017 5:10:09 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.lang.*;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class StoreProductInfo implements KvmSerializable {
    
    public double stock;
    public int storeId;
    public int productId;
    public int defaultPickLocationLevel5Id;
    public double grossPrice;
    public boolean isMaintainStock;
    public double shopStock;
    public double freeStock;
    public double futureStock;
    public double locationsStock;
    public double openPurchaseOrders;
    public double openSaleOrders;
    public double openReservations;
    public double openReturnsField;
    public double minimumStock;
    public double maximumStock;
    public WS_Enums.OrderMethod orderMethod;
    public int lastCashSaleRowId;
    public int lastInvoiceSaleRowId;
    public String lastStockChangeDateTime;
    public double avgFifoPcePurchasePrice;
    public int preferredSupplierId;
    public double calculatedMinStock;
    public double calculatedMaxStock;
    public double limitCalculatedMinStock;
    public double limitCalculatedMaxStock;
    public boolean ignoreAutoStockValues;
    public String autoStockLog;
    public int autoStockMinStockPercentage;
    public int autoStockMaxStockPercentage;
    public boolean manualMinMaxStock;
    public double lastCalculatedAutoStockTotalSaleAmount;
    public int lastCalculatedAutoStockSaleDays;
    public String lastCalculatedAutoStockOldestSaleDateTime;
    public int companyId;
    public int createdByUserId;
    public String createdDateTime;
    public int lastModifiedByUserId;
    public String lastModifiedDateTime;
    public int itemId;
    
    public StoreProductInfo(){}
    
    public StoreProductInfo(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Stock"))
        {
            Object obj = soapObject.getProperty("Stock");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                stock = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                stock = (Double) obj;
            }
        }
        if (soapObject.hasProperty("StoreId"))
        {
            Object obj = soapObject.getProperty("StoreId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                storeId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                storeId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ProductId"))
        {
            Object obj = soapObject.getProperty("ProductId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                productId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                productId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("DefaultPickLocationLevel5Id"))
        {
            Object obj = soapObject.getProperty("DefaultPickLocationLevel5Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                defaultPickLocationLevel5Id = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                defaultPickLocationLevel5Id = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("GrossPrice"))
        {
            Object obj = soapObject.getProperty("GrossPrice");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                grossPrice = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                grossPrice = (Double) obj;
            }
        }
        if (soapObject.hasProperty("IsMaintainStock"))
        {
            Object obj = soapObject.getProperty("IsMaintainStock");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                isMaintainStock = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                isMaintainStock = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("ShopStock"))
        {
            Object obj = soapObject.getProperty("ShopStock");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                shopStock = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                shopStock = (Double) obj;
            }
        }
        if (soapObject.hasProperty("FreeStock"))
        {
            Object obj = soapObject.getProperty("FreeStock");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                freeStock = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                freeStock = (Double) obj;
            }
        }
        if (soapObject.hasProperty("FutureStock"))
        {
            Object obj = soapObject.getProperty("FutureStock");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                futureStock = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                futureStock = (Double) obj;
            }
        }
        if (soapObject.hasProperty("LocationsStock"))
        {
            Object obj = soapObject.getProperty("LocationsStock");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                locationsStock = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                locationsStock = (Double) obj;
            }
        }
        if (soapObject.hasProperty("OpenPurchaseOrders"))
        {
            Object obj = soapObject.getProperty("OpenPurchaseOrders");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                openPurchaseOrders = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                openPurchaseOrders = (Double) obj;
            }
        }
        if (soapObject.hasProperty("OpenSaleOrders"))
        {
            Object obj = soapObject.getProperty("OpenSaleOrders");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                openSaleOrders = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                openSaleOrders = (Double) obj;
            }
        }
        if (soapObject.hasProperty("OpenReservations"))
        {
            Object obj = soapObject.getProperty("OpenReservations");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                openReservations = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                openReservations = (Double) obj;
            }
        }
        if (soapObject.hasProperty("OpenReturns"))
        {
            Object obj = soapObject.getProperty("OpenReturns");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                openReturnsField = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                openReturnsField = (Double) obj;
            }
        }
        if (soapObject.hasProperty("MinimumStock"))
        {
            Object obj = soapObject.getProperty("MinimumStock");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                minimumStock = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                minimumStock = (Double) obj;
            }
        }
        if (soapObject.hasProperty("MaximumStock"))
        {
            Object obj = soapObject.getProperty("MaximumStock");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                maximumStock = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                maximumStock = (Double) obj;
            }
        }
        if (soapObject.hasProperty("OrderMethod"))
        {
            Object obj = soapObject.getProperty("OrderMethod");
            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive)obj;
                orderMethod = WS_Enums.OrderMethod.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("LastCashSaleRowId"))
        {
            Object obj = soapObject.getProperty("LastCashSaleRowId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                lastCashSaleRowId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                lastCashSaleRowId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("LastInvoiceSaleRowId"))
        {
            Object obj = soapObject.getProperty("LastInvoiceSaleRowId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                lastInvoiceSaleRowId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                lastInvoiceSaleRowId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("LastStockChangeDateTime"))
        {
            Object obj = soapObject.getProperty("LastStockChangeDateTime");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                lastStockChangeDateTime = j.toString();
            }else if (obj!= null && obj instanceof String){
                lastStockChangeDateTime = (String) obj;
            }
        }
        if (soapObject.hasProperty("AvgFifoPcePurchasePrice"))
        {
            Object obj = soapObject.getProperty("AvgFifoPcePurchasePrice");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                avgFifoPcePurchasePrice = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                avgFifoPcePurchasePrice = (Double) obj;
            }
        }
        if (soapObject.hasProperty("PreferredSupplierId"))
        {
            Object obj = soapObject.getProperty("PreferredSupplierId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                preferredSupplierId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                preferredSupplierId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CalculatedMinStock"))
        {
            Object obj = soapObject.getProperty("CalculatedMinStock");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                calculatedMinStock = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                calculatedMinStock = (Double) obj;
            }
        }
        if (soapObject.hasProperty("CalculatedMaxStock"))
        {
            Object obj = soapObject.getProperty("CalculatedMaxStock");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                calculatedMaxStock = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                calculatedMaxStock = (Double) obj;
            }
        }
        if (soapObject.hasProperty("LimitCalculatedMinStock"))
        {
            Object obj = soapObject.getProperty("LimitCalculatedMinStock");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                limitCalculatedMinStock = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                limitCalculatedMinStock = (Double) obj;
            }
        }
        if (soapObject.hasProperty("LimitCalculatedMaxStock"))
        {
            Object obj = soapObject.getProperty("LimitCalculatedMaxStock");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                limitCalculatedMaxStock = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                limitCalculatedMaxStock = (Double) obj;
            }
        }
        if (soapObject.hasProperty("IgnoreAutoStockValues"))
        {
            Object obj = soapObject.getProperty("IgnoreAutoStockValues");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                ignoreAutoStockValues = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                ignoreAutoStockValues = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("AutoStockLog"))
        {
            Object obj = soapObject.getProperty("AutoStockLog");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                autoStockLog = j.toString();
            }else if (obj!= null && obj instanceof String){
                autoStockLog = (String) obj;
            }
        }
        if (soapObject.hasProperty("AutoStockMinStockPercentage"))
        {
            Object obj = soapObject.getProperty("AutoStockMinStockPercentage");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                autoStockMinStockPercentage = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                autoStockMinStockPercentage = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("AutoStockMaxStockPercentage"))
        {
            Object obj = soapObject.getProperty("AutoStockMaxStockPercentage");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                autoStockMaxStockPercentage = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                autoStockMaxStockPercentage = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ManualMinMaxStock"))
        {
            Object obj = soapObject.getProperty("ManualMinMaxStock");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                manualMinMaxStock = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                manualMinMaxStock = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("LastCalculatedAutoStockTotalSaleAmount"))
        {
            Object obj = soapObject.getProperty("LastCalculatedAutoStockTotalSaleAmount");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                lastCalculatedAutoStockTotalSaleAmount = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                lastCalculatedAutoStockTotalSaleAmount = (Double) obj;
            }
        }
        if (soapObject.hasProperty("LastCalculatedAutoStockSaleDays"))
        {
            Object obj = soapObject.getProperty("LastCalculatedAutoStockSaleDays");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                lastCalculatedAutoStockSaleDays = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                lastCalculatedAutoStockSaleDays = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("LastCalculatedAutoStockOldestSaleDateTime"))
        {
            Object obj = soapObject.getProperty("LastCalculatedAutoStockOldestSaleDateTime");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                lastCalculatedAutoStockOldestSaleDateTime = j.toString();
            }else if (obj!= null && obj instanceof String){
                lastCalculatedAutoStockOldestSaleDateTime = (String) obj;
            }
        }
        if (soapObject.hasProperty("CompanyId"))
        {
            Object obj = soapObject.getProperty("CompanyId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                companyId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                companyId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CreatedByUserId"))
        {
            Object obj = soapObject.getProperty("CreatedByUserId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                createdByUserId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                createdByUserId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CreatedDateTime"))
        {
            Object obj = soapObject.getProperty("CreatedDateTime");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                createdDateTime = j.toString();
            }else if (obj!= null && obj instanceof String){
                createdDateTime = (String) obj;
            }
        }
        if (soapObject.hasProperty("LastModifiedByUserId"))
        {
            Object obj = soapObject.getProperty("LastModifiedByUserId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                lastModifiedByUserId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                lastModifiedByUserId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("LastModifiedDateTime"))
        {
            Object obj = soapObject.getProperty("LastModifiedDateTime");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                lastModifiedDateTime = j.toString();
            }else if (obj!= null && obj instanceof String){
                lastModifiedDateTime = (String) obj;
            }
        }
        if (soapObject.hasProperty("ItemId"))
        {
            Object obj = soapObject.getProperty("ItemId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                itemId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                itemId = (Integer) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return stock;
            case 1:
                return storeId;
            case 2:
                return productId;
            case 3:
                return defaultPickLocationLevel5Id;
            case 4:
                return grossPrice;
            case 5:
                return isMaintainStock;
            case 6:
                return shopStock;
            case 7:
                return freeStock;
            case 8:
                return futureStock;
            case 9:
                return locationsStock;
            case 10:
                return openPurchaseOrders;
            case 11:
                return openSaleOrders;
            case 12:
                return openReservations;
            case 13:
                return openReturnsField;
            case 14:
                return minimumStock;
            case 15:
                return maximumStock;
            case 16:
                return orderMethod.toString();
            case 17:
                return lastCashSaleRowId;
            case 18:
                return lastInvoiceSaleRowId;
            case 19:
                return lastStockChangeDateTime;
            case 20:
                return avgFifoPcePurchasePrice;
            case 21:
                return preferredSupplierId;
            case 22:
                return calculatedMinStock;
            case 23:
                return calculatedMaxStock;
            case 24:
                return limitCalculatedMinStock;
            case 25:
                return limitCalculatedMaxStock;
            case 26:
                return ignoreAutoStockValues;
            case 27:
                return autoStockLog;
            case 28:
                return autoStockMinStockPercentage;
            case 29:
                return autoStockMaxStockPercentage;
            case 30:
                return manualMinMaxStock;
            case 31:
                return lastCalculatedAutoStockTotalSaleAmount;
            case 32:
                return lastCalculatedAutoStockSaleDays;
            case 33:
                return lastCalculatedAutoStockOldestSaleDateTime;
            case 34:
                return companyId;
            case 35:
                return createdByUserId;
            case 36:
                return createdDateTime;
            case 37:
                return lastModifiedByUserId;
            case 38:
                return lastModifiedDateTime;
            case 39:
                return itemId;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 40;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = Double.class;
                info.name = "Stock";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "StoreId";
                break;
            case 2:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ProductId";
                break;
            case 3:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "DefaultPickLocationLevel5Id";
                break;
            case 4:
                info.type = Double.class;
                info.name = "GrossPrice";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IsMaintainStock";
                break;
            case 6:
                info.type = Double.class;
                info.name = "ShopStock";
                break;
            case 7:
                info.type = Double.class;
                info.name = "FreeStock";
                break;
            case 8:
                info.type = Double.class;
                info.name = "FutureStock";
                break;
            case 9:
                info.type = Double.class;
                info.name = "LocationsStock";
                break;
            case 10:
                info.type = Double.class;
                info.name = "OpenPurchaseOrders";
                break;
            case 11:
                info.type = Double.class;
                info.name = "OpenSaleOrders";
                break;
            case 12:
                info.type = Double.class;
                info.name = "OpenReservations";
                break;
            case 13:
                info.type = Double.class;
                info.name = "OpenReturns";
                break;
            case 14:
                info.type = Double.class;
                info.name = "MinimumStock";
                break;
            case 15:
                info.type = Double.class;
                info.name = "MaximumStock";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "OrderMethod";
                break;
            case 17:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "LastCashSaleRowId";
                break;
            case 18:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "LastInvoiceSaleRowId";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "LastStockChangeDateTime";
                break;
            case 20:
                info.type = Double.class;
                info.name = "AvgFifoPcePurchasePrice";
                break;
            case 21:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "PreferredSupplierId";
                break;
            case 22:
                info.type = Double.class;
                info.name = "CalculatedMinStock";
                break;
            case 23:
                info.type = Double.class;
                info.name = "CalculatedMaxStock";
                break;
            case 24:
                info.type = Double.class;
                info.name = "LimitCalculatedMinStock";
                break;
            case 25:
                info.type = Double.class;
                info.name = "LimitCalculatedMaxStock";
                break;
            case 26:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IgnoreAutoStockValues";
                break;
            case 27:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "AutoStockLog";
                break;
            case 28:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "AutoStockMinStockPercentage";
                break;
            case 29:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "AutoStockMaxStockPercentage";
                break;
            case 30:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "ManualMinMaxStock";
                break;
            case 31:
                info.type = Double.class;
                info.name = "LastCalculatedAutoStockTotalSaleAmount";
                break;
            case 32:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "LastCalculatedAutoStockSaleDays";
                break;
            case 33:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "LastCalculatedAutoStockOldestSaleDateTime";
                break;
            case 34:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CompanyId";
                break;
            case 35:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CreatedByUserId";
                break;
            case 36:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CreatedDateTime";
                break;
            case 37:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "LastModifiedByUserId";
                break;
            case 38:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "LastModifiedDateTime";
                break;
            case 39:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ItemId";
                break;
        }
    }
    
//    @Override //    public String getInnerText() { //        return null; //    } // // //    @Override //    public void setInnerText(String s) { //    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
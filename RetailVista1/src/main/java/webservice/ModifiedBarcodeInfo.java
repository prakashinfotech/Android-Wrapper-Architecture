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

public class ModifiedBarcodeInfo implements KvmSerializable {
    
    public int productId;
    public long barcode;
    public int barcodeTypeId;
    public double price;
    public long productNumber;
    public long mainBarcode;
    public int itemId;
    
    public ModifiedBarcodeInfo(){}
    
    public ModifiedBarcodeInfo(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
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
        if (soapObject.hasProperty("Barcode"))
        {
            Object obj = soapObject.getProperty("Barcode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                barcode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                barcode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("BarcodeTypeId"))
        {
            Object obj = soapObject.getProperty("BarcodeTypeId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                barcodeTypeId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                barcodeTypeId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("Price"))
        {
            Object obj = soapObject.getProperty("Price");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                price = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                price = (Double) obj;
            }
        }
        if (soapObject.hasProperty("ProductNumber"))
        {
            Object obj = soapObject.getProperty("ProductNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                productNumber = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                productNumber = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("MainBarcode"))
        {
            Object obj = soapObject.getProperty("MainBarcode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                mainBarcode = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                mainBarcode = (Integer) obj;
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
                return productId;
            case 1:
                return barcode;
            case 2:
                return barcodeTypeId;
            case 3:
                return price;
            case 4:
                return productNumber;
            case 5:
                return mainBarcode;
            case 6:
                return itemId;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 7;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ProductId";
                break;
            case 1:
                info.type = Long.class;
                info.name = "Barcode";
                break;
            case 2:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "BarcodeTypeId";
                break;
            case 3:
                info.type = Double.class;
                info.name = "Price";
                break;
            case 4:
                info.type = Long.class;
                info.name = "ProductNumber";
                break;
            case 5:
                info.type = Long.class;
                info.name = "MainBarcode";
                break;
            case 6:
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

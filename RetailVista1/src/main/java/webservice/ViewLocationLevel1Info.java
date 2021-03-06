package webservice;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 8/16/2017 5:54:08 AM
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

public class ViewLocationLevel1Info implements KvmSerializable {
    
    public boolean isHasChildren;
    public int storeId;
    public int locationClassIdField;
    public String description;
    public boolean isMultiplePickLocations;
    public String code;
    public int companyId;
    public int createdByUserId;
    public String createdDateTime;
    public int lastModifiedByUserId;
    public String lastModifiedDateTime;
    public int itemId;
    
    public ViewLocationLevel1Info(){}
    
    public ViewLocationLevel1Info(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("IsHasChildren"))
        {
            Object obj = soapObject.getProperty("IsHasChildren");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                isHasChildren = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                isHasChildren = (Boolean) obj;
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
        if (soapObject.hasProperty("LocationClassId"))
        {
            Object obj = soapObject.getProperty("LocationClassId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                locationClassIdField = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                locationClassIdField = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("Description"))
        {
            Object obj = soapObject.getProperty("Description");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                description = j.toString();
            }else if (obj!= null && obj instanceof String){
                description = (String) obj;
            }
        }
        if (soapObject.hasProperty("IsMultiplePickLocations"))
        {
            Object obj = soapObject.getProperty("IsMultiplePickLocations");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                isMultiplePickLocations = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                isMultiplePickLocations = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Code"))
        {
            Object obj = soapObject.getProperty("Code");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                code = j.toString();
            }else if (obj!= null && obj instanceof String){
                code = (String) obj;
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
                return isHasChildren;
            case 1:
                return storeId;
            case 2:
                return locationClassIdField;
            case 3:
                return description;
            case 4:
                return isMultiplePickLocations;
            case 5:
                return code;
            case 6:
                return companyId;
            case 7:
                return createdByUserId;
            case 8:
                return createdDateTime;
            case 9:
                return lastModifiedByUserId;
            case 10:
                return lastModifiedDateTime;
            case 11:
                return itemId;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 12;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IsHasChildren";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "StoreId";
                break;
            case 2:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "LocationClassId";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Description";
                break;
            case 4:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IsMultiplePickLocations";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Code";
                break;
            case 6:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CompanyId";
                break;
            case 7:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CreatedByUserId";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CreatedDateTime";
                break;
            case 9:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "LastModifiedByUserId";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "LastModifiedDateTime";
                break;
            case 11:
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

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

public class ViewLocationLevel5Info implements KvmSerializable {
    
    public int locationLevel1Id;
    public int locationLevel2Id;
    public int locationLevel3Id;
    public String locationLevel1Code;
    public String locationLevel2Code;
    public String locationLevel3Code;
    public String locationLevel4Code;
    public String locationCode;
    public String description;
    public int locationLevel4Id;
    public Byte maxStoragePositions;
    public boolean isPickLocation;
    public boolean isAutoFill;
    public String code;
    public int companyId;
    public int createdByUserId;
    public String createdDateTime;
    public int lastModifiedByUserId;
    public String lastModifiedDateTime;
    public int itemId;
    
    public ViewLocationLevel5Info(){}
    
    public ViewLocationLevel5Info(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("LocationLevel1Id"))
        {
            Object obj = soapObject.getProperty("LocationLevel1Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                locationLevel1Id = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                locationLevel1Id = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("LocationLevel2Id"))
        {
            Object obj = soapObject.getProperty("LocationLevel2Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                locationLevel2Id = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                locationLevel2Id = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("LocationLevel3Id"))
        {
            Object obj = soapObject.getProperty("LocationLevel3Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                locationLevel3Id = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                locationLevel3Id = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("LocationLevel1Code"))
        {
            Object obj = soapObject.getProperty("LocationLevel1Code");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                locationLevel1Code = j.toString();
            }else if (obj!= null && obj instanceof String){
                locationLevel1Code = (String) obj;
            }
        }
        if (soapObject.hasProperty("LocationLevel2Code"))
        {
            Object obj = soapObject.getProperty("LocationLevel2Code");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                locationLevel2Code = j.toString();
            }else if (obj!= null && obj instanceof String){
                locationLevel2Code = (String) obj;
            }
        }
        if (soapObject.hasProperty("LocationLevel3Code"))
        {
            Object obj = soapObject.getProperty("LocationLevel3Code");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                locationLevel3Code = j.toString();
            }else if (obj!= null && obj instanceof String){
                locationLevel3Code = (String) obj;
            }
        }
        if (soapObject.hasProperty("LocationLevel4Code"))
        {
            Object obj = soapObject.getProperty("LocationLevel4Code");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                locationLevel4Code = j.toString();
            }else if (obj!= null && obj instanceof String){
                locationLevel4Code = (String) obj;
            }
        }
        if (soapObject.hasProperty("LocationCode"))
        {
            Object obj = soapObject.getProperty("LocationCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                locationCode = j.toString();
            }else if (obj!= null && obj instanceof String){
                locationCode = (String) obj;
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
        if (soapObject.hasProperty("LocationLevel4Id"))
        {
            Object obj = soapObject.getProperty("LocationLevel4Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                locationLevel4Id = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                locationLevel4Id = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("MaxStoragePositions"))
        {
            Object obj = soapObject.getProperty("MaxStoragePositions");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                maxStoragePositions = Byte.parseByte(j.toString());
            }else if (obj!= null && obj instanceof Byte){
                maxStoragePositions = (Byte) obj;
            }
        }
        if (soapObject.hasProperty("IsPickLocation"))
        {
            Object obj = soapObject.getProperty("IsPickLocation");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                isPickLocation = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                isPickLocation = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IsAutoFill"))
        {
            Object obj = soapObject.getProperty("IsAutoFill");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                isAutoFill = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                isAutoFill = (Boolean) obj;
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
                return locationLevel1Id;
            case 1:
                return locationLevel2Id;
            case 2:
                return locationLevel3Id;
            case 3:
                return locationLevel1Code;
            case 4:
                return locationLevel2Code;
            case 5:
                return locationLevel3Code;
            case 6:
                return locationLevel4Code;
            case 7:
                return locationCode;
            case 8:
                return description;
            case 9:
                return locationLevel4Id;
            case 10:
                return maxStoragePositions.toString();
            case 11:
                return isPickLocation;
            case 12:
                return isAutoFill;
            case 13:
                return code;
            case 14:
                return companyId;
            case 15:
                return createdByUserId;
            case 16:
                return createdDateTime;
            case 17:
                return lastModifiedByUserId;
            case 18:
                return lastModifiedDateTime;
            case 19:
                return itemId;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 20;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "LocationLevel1Id";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "LocationLevel2Id";
                break;
            case 2:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "LocationLevel3Id";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "LocationLevel1Code";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "LocationLevel2Code";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "LocationLevel3Code";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "LocationLevel4Code";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "LocationCode";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Description";
                break;
            case 9:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "LocationLevel4Id";
                break;
            case 10:
                info.type = Byte.class;
                info.name = "MaxStoragePositions";
                break;
            case 11:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IsPickLocation";
                break;
            case 12:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IsAutoFill";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Code";
                break;
            case 14:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CompanyId";
                break;
            case 15:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CreatedByUserId";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CreatedDateTime";
                break;
            case 17:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "LastModifiedByUserId";
                break;
            case 18:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "LastModifiedDateTime";
                break;
            case 19:
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

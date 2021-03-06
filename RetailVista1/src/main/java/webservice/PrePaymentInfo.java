package webservice;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 9/8/2017 11:54:00 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class PrePaymentInfo implements KvmSerializable {
    
    public int companyId;
    public int storeId;
    public int prePaymentNumber;
    public int prePaymentRequestId;
    public int parentPrePaymentId;
    public int customerId;
    public int saleOrderId;
    public int userId;
    public int productId;
    public int prePaymentTypeId;
    public int posTerminalId;
    public int cashSaleRowId;
    public double paid;
    public String note;
    public int createdByUserId;
    public String createdDateTime;
    public int lastModifiedByUserId;
    public String lastModifiedDateTime;
    public int itemId;
    
    public PrePaymentInfo(){}
    
    public PrePaymentInfo(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
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
        if (soapObject.hasProperty("PrePaymentNumber"))
        {
            Object obj = soapObject.getProperty("PrePaymentNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                prePaymentNumber = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                prePaymentNumber = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("PrePaymentRequestId"))
        {
            Object obj = soapObject.getProperty("PrePaymentRequestId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                prePaymentRequestId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                prePaymentRequestId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ParentPrePaymentId"))
        {
            Object obj = soapObject.getProperty("ParentPrePaymentId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                parentPrePaymentId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                parentPrePaymentId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CustomerId"))
        {
            Object obj = soapObject.getProperty("CustomerId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                customerId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                customerId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("SaleOrderId"))
        {
            Object obj = soapObject.getProperty("SaleOrderId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                saleOrderId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                saleOrderId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("UserId"))
        {
            Object obj = soapObject.getProperty("UserId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                userId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                userId = (Integer) obj;
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
        if (soapObject.hasProperty("PrePaymentTypeId"))
        {
            Object obj = soapObject.getProperty("PrePaymentTypeId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                prePaymentTypeId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                prePaymentTypeId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("PosTerminalId"))
        {
            Object obj = soapObject.getProperty("PosTerminalId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                posTerminalId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                posTerminalId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CashSaleRowId"))
        {
            Object obj = soapObject.getProperty("CashSaleRowId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cashSaleRowId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                cashSaleRowId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("Paid"))
        {
            Object obj = soapObject.getProperty("Paid");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                paid = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                paid = (Double) obj;
            }
        }
        if (soapObject.hasProperty("Note"))
        {
            Object obj = soapObject.getProperty("Note");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                note = j.toString();
            }else if (obj!= null && obj instanceof String){
                note = (String) obj;
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
                return companyId;
            case 1:
                return storeId;
            case 2:
                return prePaymentNumber;
            case 3:
                return prePaymentRequestId;
            case 4:
                return parentPrePaymentId;
            case 5:
                return customerId;
            case 6:
                return saleOrderId;
            case 7:
                return userId;
            case 8:
                return productId;
            case 9:
                return prePaymentTypeId;
            case 10:
                return posTerminalId;
            case 11:
                return cashSaleRowId;
            case 12:
                return paid;
            case 13:
                return note;
            case 14:
                return createdByUserId;
            case 15:
                return createdDateTime;
            case 16:
                return lastModifiedByUserId;
            case 17:
                return lastModifiedDateTime;
            case 18:
                return itemId;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 19;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CompanyId";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "StoreId";
                break;
            case 2:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "PrePaymentNumber";
                break;
            case 3:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "PrePaymentRequestId";
                break;
            case 4:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ParentPrePaymentId";
                break;
            case 5:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CustomerId";
                break;
            case 6:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "SaleOrderId";
                break;
            case 7:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "UserId";
                break;
            case 8:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ProductId";
                break;
            case 9:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "PrePaymentTypeId";
                break;
            case 10:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "PosTerminalId";
                break;
            case 11:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CashSaleRowId";
                break;
            case 12:
                info.type = Double.class;
                info.name = "Paid";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Note";
                break;
            case 14:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CreatedByUserId";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CreatedDateTime";
                break;
            case 16:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "LastModifiedByUserId";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "LastModifiedDateTime";
                break;
            case 18:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ItemId";
                break;
        }
    }
    
//    @Override
//    public String getInnerText() {
//        return null;
//    }
//
//
//    @Override
//    public void setInnerText(String s) {
//    }
    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}

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

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.lang.*;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class PrintResponse implements KvmSerializable {
    
    public WS_Enums.PrinterResponse responseStatus;
    public String responseInfo;
    public String printerData;
    
    public PrintResponse(){}
    
    public PrintResponse(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("ResponseStatus"))
        {
            Object obj = soapObject.getProperty("ResponseStatus");
            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive)obj;
                responseStatus = WS_Enums.PrinterResponse.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("ResponseInfo"))
        {
            Object obj = soapObject.getProperty("ResponseInfo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                responseInfo = j.toString();
            }else if (obj!= null && obj instanceof String){
                responseInfo = (String) obj;
            }
        }
        if (soapObject.hasProperty("PrinterData"))
        {
            Object obj = soapObject.getProperty("PrinterData");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                printerData = j.toString();
            }else if (obj!= null && obj instanceof String){
                printerData = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return responseStatus.toString();
            case 1:
                return responseInfo;
            case 2:
                return printerData;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 3;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ResponseStatus";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ResponseInfo";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PrinterData";
                break;
        }
    }
    
//    @Override //    public String getInnerText() { //        return null; //    } // // //    @Override //    public void setInnerText(String s) { //    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}

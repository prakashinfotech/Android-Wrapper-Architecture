package webservice;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 9/11/2018 7:31:36 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

import java.util.Hashtable;

public class PriceAgreementProductsFilter implements KvmSerializable {

    //public int priceAgreementId;
    public int productId;
    //public WS_Enums.BooleanFilter activeOnly;

    public PriceAgreementProductsFilter() {
    }

    public PriceAgreementProductsFilter(SoapObject soapObject) {
        if (soapObject == null)
            return;
        /*if (soapObject.hasProperty("PriceAgreementId")) {
            Object obj = soapObject.getProperty("PriceAgreementId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                priceAgreementId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                priceAgreementId = (Integer) obj;
            }
        }*/
        if (soapObject.hasProperty("ProductId")) {
            Object obj = soapObject.getProperty("ProductId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                productId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                productId = (Integer) obj;
            }
        }
        /*if (soapObject.hasProperty("ActiveOnly")) {
            Object obj = soapObject.getProperty("ActiveOnly");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                activeOnly = WS_Enums.BooleanFilter.fromString(j.toString());
            }
        }*/
    }

    @Override
    public Object getProperty(int arg0) {
        switch (arg0) {
           /* case 0:
                return priceAgreementId;*/
            case 0:
                return productId;
           /* case 2:
                return activeOnly.toString();*/
        }
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 1;
    }

    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch (index) {
            /*case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "PriceAgreementId";
                break;*/
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ProductId";
                break;
/*            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ActiveOnly";
                break;*/
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}

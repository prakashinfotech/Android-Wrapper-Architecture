package com.retailvistaapi;


import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import CommonClass.APICommonClassNew;
import CommonClass.CommonUtils;
import CommonClass.StaticValues;
import ModelClass.GetProdctCategories;
import ModelClass.GetSaleOrdersResponse;
import ModelClass.RequestClass.emailAddress;
import ModelClass.RequestClass.phoneNumber;
import ModelClass.ResponseClass.AddCustomerResponse;
import ModelClass.ResponseClass.GetUniqueSalesOrderNumberResponse;
import ModelClass.ResponseClass.ProductOfferResponse;
import ModelClass.Retail3000AuthenticateToken;
import ModelClass.ValidateUserResponse;
import ModelClass.customer;
import webservice.AddressInfo;

//import ModelClass.AddCustomer;

/**
 * Created by haresh on 7/14/2017.
 */

public class RequestMethodClass {


/*
    public GetProdctCategories GetProdctCategories(SoapObject mObjects, Retail3000AuthenticateToken authenticateToken) {

        SoapSerializationEnvelope mEnvelope = APICommonClassNew.GetEnvelope(authenticateToken, StaticValues.GET_PRODUCT_CATEGORIES_NAMESPACE, mObjects);
        String response = APICommonClassNew.WebServiceCall(StaticValues.GET_PRODUCT_CATEGORY_SOAP_ACTION, StaticValues.BASE_URL + StaticValues.PRODUCT_BASE_COMPONENTS, mEnvelope);

        if (response != null) {
            try {
                Gson gs = new Gson();
                Log.e("ProductCategories", response.toString());
                GetProdctCategories mGetProdctCategoriesResponse = gs.fromJson(response, GetProdctCategories.class);
                return mGetProdctCategoriesResponse;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {

            return new GetProdctCategories();

        }
    }
*/

    public ValidateUserResponse validateUser(SoapObject mObjects, Retail3000AuthenticateToken authenticateToken, String baseUrl) {


        SoapSerializationEnvelope mEnvelope = APICommonClassNew.GetEnvelope(authenticateToken, StaticValues.GET_LOGIN_NAMESPACE, mObjects);
        String response = APICommonClassNew.WebServiceCall(StaticValues.GET_LOGIN_SOAP_ACTION, baseUrl + StaticValues.SECURITY_BASE_COMPONENTS, mEnvelope, authenticateToken);

        if (response != null) {
            try {
                Gson gs = new Gson();
                ValidateUserResponse mValidateUserResponse = gs.fromJson(response.toString(), ValidateUserResponse.class);
                return mValidateUserResponse;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {

            return new ValidateUserResponse();

        }

    }

    public GetUniqueSalesOrderNumberResponse getUniqueSaleOrderNumber(Retail3000AuthenticateToken authenticateToken, String baseUrl) {

        RequestMethodClass methodClass = new RequestMethodClass();
        SoapObject mObject = new SoapObject(StaticValues.GET_UNIQUE_SALE_ORDER_NAME_SAPCE, StaticValues.GET_UNIQUE_SALE_ORDER_MEHOD_NAME);


        SoapSerializationEnvelope envalop = APICommonClassNew.GetEnvelope(authenticateToken, StaticValues.GET_UNIQUE_SALE_ORDER_NAME_SAPCE, mObject);


        String response = APICommonClassNew.WebServiceCall(StaticValues.GET_UNIQUE_SALE_ORDER_SOAP_ACTION, baseUrl + StaticValues.PRODUCT_BASE_COMPONENTS, envalop, authenticateToken);

        if (response != null) {

            try {
                Gson gs = new Gson();
                GetUniqueSalesOrderNumberResponse mGetUniqueSalesOrderNumberResponse = gs.fromJson(response.toString(), GetUniqueSalesOrderNumberResponse.class);
                return mGetUniqueSalesOrderNumberResponse;
            } catch (Exception e) {
                return null;
            }

        } else {
            return new GetUniqueSalesOrderNumberResponse();
        }


    }

    public ProductOfferResponse getPriceMotiondatawithOffers() {
        try {
            URL url = new URL(StaticValues.PRICEMOTION_CONTENT_URL);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new InputSource(url.openStream()));
            doc.getDocumentElement().normalize();
            JSONObject response = CommonUtils.getJSONStringFromDocument(doc);
            if (response != null) {
                Gson gs = new Gson();

                //  String tempResponse="{\"products\":{\"product\":[{\"minimum\":21.16,\"name\":\"Weber 8413\",\"ean\":8712448281027,\"offers\":{\"offer\":[{\"price\":21.16,\"seller\":\"Warentuin\"},{\"price\":21.95,\"seller\":\"Obelink.nl\"},{\"price\":24.99,\"seller\":\"Tuincentrum Osdorp\"},{\"price\":24.99,\"seller\":\"Vrijbuiter NL\"},{\"price\":24.99,\"seller\":\"kampeergoed.nl\"},{\"price\":24.99,\"seller\":\"OO Shopping\"},{\"price\":24.99,\"seller\":\"kampeerperfect.nl\"},{\"price\":24.99,\"seller\":\"Allesvoorbbq.nl\"},{\"price\":24.99,\"seller\":\"Weber Grill\"},{\"price\":24.99,\"seller\":\"vtwonen.nl\"}]},\"average\":25.64},{\"minimum\":234.95,\"name\":\"Q 1200 Black Gasbarbecue\",\"ean\":8710906401604,\"offers\":{\"offer\":[{\"price\":234.95,\"seller\":\"fonQ.nl\"},{\"price\":239,\"seller\":\"Coolblue\"},{\"price\":239,\"seller\":\"Van Rossum IJzerhandel\"},{\"price\":239,\"seller\":\"BBQ-Kookshop\"},{\"price\":239.55,\"seller\":\"Barbecueshop.nl\"},{\"price\":239.55,\"seller\":\"AllesvoorBBQ.nl\"},{\"price\":249,\"seller\":\"Cook&Co\"},{\"price\":249.99,\"seller\":\"Vrijbuiter NL\"},{\"price\":259,\"seller\":\"Obelink.nl\"},{\"price\":263.2,\"seller\":\"gamma.nl\"}]},\"average\":265.57},{\"minimum\":47.99,\"name\":\"Weber Luxe Hoes 57 cm\",\"ean\":8710906305209,\"offers\":{\"offer\":[{\"price\":47.99,\"seller\":\"Heuts\"},{\"price\":57.99,\"seller\":\"fonQ.nl\"},{\"price\":57.99,\"seller\":\"Coolblue\"},{\"price\":57.99,\"seller\":\"Cook&Co\"},{\"price\":59.41,\"seller\":\"Warentuin\"},{\"price\":59.99,\"seller\":\"Kampeerwereld.nl\"},{\"price\":62.95,\"seller\":\"Obelink.nl\"},{\"price\":64.9,\"seller\":\"Alternate.nl\"},{\"price\":64.95,\"seller\":\"Vivolanda.nl\"},{\"price\":64.99,\"seller\":\"Coppens Tuinmeubelen\"}]},\"average\":65.18},{\"minimum\":305.4,\"name\":\"Weber Q 2200\",\"ean\":77924033872,\"offers\":{\"offer\":[{\"price\":305.4,\"seller\":\"Vrijbuiter NL\"},{\"price\":372.35,\"seller\":\"FonQ.nl\"},{\"price\":372.35,\"seller\":\"Allesvoorbbq.nl\"},{\"price\":372.35,\"seller\":\"Barbecueshop.nl\"},{\"price\":399.2,\"seller\":\"Gamma\"},{\"price\":399.2,\"seller\":\"vtwonen.nl\"},{\"price\":449,\"seller\":\"Obelink.nl\"},{\"price\":469,\"seller\":\"Coppens Tuinmeubelen\"},{\"price\":499,\"seller\":\"OO Shopping\"},{\"price\":499,\"seller\":\"Karwei\"}]},\"average\":421.44}]}}";

                ProductOfferResponse mProductOfferResponse = gs.fromJson(response.toString(), ProductOfferResponse.class);
                return mProductOfferResponse;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ProductOfferResponse();
    }
}

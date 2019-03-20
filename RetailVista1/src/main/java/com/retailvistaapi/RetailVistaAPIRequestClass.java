package com.retailvistaapi;

import android.util.Log;

import ModelClass.Retail3000AuthenticateToken;
import webservice.IWsdl2CodeEvents;
import webservice.ProductsFilter;
import webservice.VectorViewProductInfo;
import webservice.ViewProductInfo;
import webservice.WS_Enums;
import webservice.WebserviceProductComponents;

/**
 * Created by haresh
 * on 18-03-2019.
 */
public class RetailVistaAPIRequestClass {

    public void GetProductData(ProductsFilter mProductsFilter,final CallBackRequest mCallback){

        try {
            WebserviceProductComponents mWebserviceProductComponents = new WebserviceProductComponents(new IWsdl2CodeEvents() {
                @Override
                public void Wsdl2CodeStartedRequest() {

                }

                @Override
                public void Wsdl2CodeFinished(String methodName, Object Data) {
                    mCallback.onSuccess(Data);
                }

                @Override
                public void Wsdl2CodeFinishedWithException(Exception ex) {


                }

                @Override
                public void Wsdl2CodeEndedRequest() {

                }

                @Override
                public void Wsdl2CodeFinishedWithNull() {

                }
            }, "http://test.bo.retail3000.net/grs");


            Retail3000AuthenticateToken mRetail3000AuthenticateToken = new Retail3000AuthenticateToken();
            mRetail3000AuthenticateToken.setMobileDeviceNumber("0");
            mRetail3000AuthenticateToken.setUsername("Set Your User Name ");
            mRetail3000AuthenticateToken.setPassword("Set Your Password ");
            mRetail3000AuthenticateToken.setCompanyNumber("Set Your Company Number");
            mRetail3000AuthenticateToken.setStoreNumber("Store Number");
            mRetail3000AuthenticateToken.setScannerNumber("Scanner Number");
            mRetail3000AuthenticateToken.setHeaderToken("Token");

            mWebserviceProductComponents.GetProductsAsync(mProductsFilter,0,20,null,mRetail3000AuthenticateToken);


        }catch (Exception e){
            e.printStackTrace();
        }

    }

}

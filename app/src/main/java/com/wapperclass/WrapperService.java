package com.wapperclass;

import com.Requestclass.ProductRequest;
import com.callback.CallBackRequest;
import com.retailvistaapi.RetailVistaAPIRequestClass;
import com.snelstartlibrary.SnelStartAPIRequestClass;
import com.wrapperarchitecture.BuildConfig;

import webservice.ProductsFilter;
import webservice.WS_Enums;

/**
 * Created by haresh
 * on 19-03-2019.
 */
public class WrapperService {


    public void getProduct(ProductRequest mProductRequest, final CallBackRequest mCallBackRequest){

        if(BuildConfig.FLAVOR.equalsIgnoreCase("retailvista")){

            ProductsFilter mProductsFilter = new ProductsFilter();
            mProductsFilter.storeId = mProductRequest.storeId;
            mProductsFilter.storeNumber = -1;
            mProductsFilter.productCategoryId = -1;
            mProductsFilter.classificationLevel1IdField = -1;
            mProductsFilter.Barcode = -1;
            mProductsFilter.brandId = -1;
            mProductsFilter.isIgnoreCancelledProducts= WS_Enums.BooleanFilter.All;
            mProductsFilter.productNumber=-1;
            mProductsFilter.supplierId=-1;
            RetailVistaAPIRequestClass mRetailVistaApiRequestClass =new RetailVistaAPIRequestClass();

            mRetailVistaApiRequestClass.GetProductData(mProductsFilter, new com.retailvistaapi.CallBackRequest() {
                @Override
                public void onSuccess(Object mObject) {
                    RetailVistaWrapper mRetailVistaWrapper =new RetailVistaWrapper();
                    mCallBackRequest.onSuccess(mRetailVistaWrapper.GetProductMapping(mObject));
                }
                @Override
                public void onFailure(String msg) {

                }
            });

        }else if(BuildConfig.FLAVOR.equalsIgnoreCase("snelstart")){
            SnelStartAPIRequestClass mSnelStartAPIRequestClass=new SnelStartAPIRequestClass();
            mSnelStartAPIRequestClass.GetProductData(mProductRequest.ApiKey, mProductRequest.pageNumber, new com.snelstartlibrary.CallBackRequest() {
                @Override
                public void onSuccess(Object mObject) {
                    SnelStartWrapper mSnelStartWrapper =new SnelStartWrapper();
                    mCallBackRequest.onSuccess(mSnelStartWrapper.GetProductMapping(mObject));
                }
                @Override
                public void onFailure(String msg) {
                    mCallBackRequest.onFailure(msg);
                }
            });
        }

    }

}

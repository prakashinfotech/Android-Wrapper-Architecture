package com.wapperclass;

import com.Responseclass.ProductResponse;

import java.util.ArrayList;
import java.util.List;

import webservice.VectorViewProductInfo;
import webservice.ViewProductInfo;

/**
 * Created by haresh
 * on 13-03-2019.
 */
public class RetailVistaWrapper {


    public List<ProductResponse.ProductList> GetProductMapping(Object mProductObject) {
        try {
            VectorViewProductInfo resultVariable = (VectorViewProductInfo) mProductObject;
            List<ProductResponse.ProductList> mProductLists = new ArrayList<>();
            for (ViewProductInfo m : resultVariable) {
                ProductResponse.ProductList mProductWapperr = new ProductResponse.ProductList();
                mProductWapperr.setProductBarcode(String.valueOf(m.mainBarcode));
                mProductWapperr.setProductName(m.description);
                mProductLists.add(mProductWapperr);
            }
            return mProductLists;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<ProductResponse.ProductList>();
    }


}

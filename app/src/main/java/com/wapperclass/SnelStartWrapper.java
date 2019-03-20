package com.wapperclass;

import com.Responseclass.ProductResponse;
import com.modelclass.SnelStartProductResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haresh
 * on 19-03-2019.
 */
public class SnelStartWrapper {

    public List<ProductResponse.ProductList> GetProductMapping(Object mProductObject) {
        try {
            SnelStartProductResponse resultVariable = (SnelStartProductResponse) mProductObject;
            List<ProductResponse.ProductList> mProductLists = new ArrayList<>();
            for (SnelStartProductResponse.DataBean.PagedListResultBean m : resultVariable.getData().getPagedList_Result()) {
                ProductResponse.ProductList mProductWapperr = new ProductResponse.ProductList();
                mProductWapperr.setProductBarcode(m.getBarcode());
                mProductWapperr.setProductName(m.getDescription());
                mProductLists.add(mProductWapperr);
            }
            return mProductLists;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<ProductResponse.ProductList>();
    }
}

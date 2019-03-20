package com.Responseclass;

import java.util.List;

/**
 * Created by haresh
 * on 13-03-2019.
 */
public class ProductResponse {
    public List<ProductList> getmProductList() {
        return mProductList;
    }

    public void setmProductList(List<ProductList> mProductList) {
        this.mProductList = mProductList;
    }

    private List<ProductList> mProductList;

    public static class ProductList {
        public String productName;
        public String productBarcode;

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductBarcode() {
            return productBarcode;
        }

        public void setProductBarcode(String productBarcode) {
            this.productBarcode = productBarcode;
        }
    }


}

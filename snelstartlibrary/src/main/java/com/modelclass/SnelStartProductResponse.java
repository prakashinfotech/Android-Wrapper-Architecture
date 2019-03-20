package com.modelclass;

import java.util.List;

/**
 * Created by haresh
 * on 19-03-2019.
 */
public class SnelStartProductResponse {

    /**
     * code : 200
     * status : success
     * data : {"page_number":1,"results_per_page":500,"total_results":23063,"pagedList_Result":[{"id":0,"name":"Espresso lungo estremo 10 stuks","barcode":"5410769100081","quantity":"52 gram","image_url":"https://scappretailstorage.blob.core.windows.net/staging-product-images/18428535-b024-4324-8721-266801f206bc.jpeg","secundary_key":null,"top":false,"scannable":true,"itemcode":"5410769100081","description":"Espresso lungo estremo 10 stuks","message":null,"shortname":null,"category":"","price":0,"discountprice":0,"supplier":"supplier is L'or"}]}
     */

    private String code;
    private String status;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * page_number : 1
         * results_per_page : 500
         * total_results : 23063
         * pagedList_Result : [{"id":0,"name":"Espresso lungo estremo 10 stuks","barcode":"5410769100081","quantity":"52 gram","image_url":"https://scappretailstorage.blob.core.windows.net/staging-product-images/18428535-b024-4324-8721-266801f206bc.jpeg","secundary_key":null,"top":false,"scannable":true,"itemcode":"5410769100081","description":"Espresso lungo estremo 10 stuks","message":null,"shortname":null,"category":"","price":0,"discountprice":0,"supplier":"supplier is L'or"}]
         */

        private int page_number;
        private int results_per_page;
        private int total_results;
        private List<PagedListResultBean> pagedList_Result;

        public int getPage_number() {
            return page_number;
        }

        public void setPage_number(int page_number) {
            this.page_number = page_number;
        }

        public int getResults_per_page() {
            return results_per_page;
        }

        public void setResults_per_page(int results_per_page) {
            this.results_per_page = results_per_page;
        }

        public int getTotal_results() {
            return total_results;
        }

        public void setTotal_results(int total_results) {
            this.total_results = total_results;
        }

        public List<PagedListResultBean> getPagedList_Result() {
            return pagedList_Result;
        }

        public void setPagedList_Result(List<PagedListResultBean> pagedList_Result) {
            this.pagedList_Result = pagedList_Result;
        }

        public static class PagedListResultBean {
            /**
             * id : 0
             * name : Espresso lungo estremo 10 stuks
             * barcode : 5410769100081
             * quantity : 52 gram
             * image_url : https://scappretailstorage.blob.core.windows.net/staging-product-images/18428535-b024-4324-8721-266801f206bc.jpeg
             * secundary_key : null
             * top : false
             * scannable : true
             * itemcode : 5410769100081
             * description : Espresso lungo estremo 10 stuks
             * message : null
             * shortname : null
             * category :
             * price : 0
             * discountprice : 0
             * supplier : supplier is L'or
             */

            private int id;
            private String name;
            private String barcode;
            private String quantity;
            private String image_url;
            private Object secundary_key;
            private boolean top;
            private boolean scannable;
            private String itemcode;
            private String description;
            private Object message;
            private Object shortname;
            private String category;
            private double price;
            private int discountprice;
            private String supplier;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getBarcode() {
                return barcode;
            }

            public void setBarcode(String barcode) {
                this.barcode = barcode;
            }

            public String getQuantity() {
                return quantity;
            }

            public void setQuantity(String quantity) {
                this.quantity = quantity;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public Object getSecundary_key() {
                return secundary_key;
            }

            public void setSecundary_key(Object secundary_key) {
                this.secundary_key = secundary_key;
            }

            public boolean isTop() {
                return top;
            }

            public void setTop(boolean top) {
                this.top = top;
            }

            public boolean isScannable() {
                return scannable;
            }

            public void setScannable(boolean scannable) {
                this.scannable = scannable;
            }

            public String getItemcode() {
                return itemcode;
            }

            public void setItemcode(String itemcode) {
                this.itemcode = itemcode;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public Object getMessage() {
                return message;
            }

            public void setMessage(Object message) {
                this.message = message;
            }

            public Object getShortname() {
                return shortname;
            }

            public void setShortname(Object shortname) {
                this.shortname = shortname;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public int getDiscountprice() {
                return discountprice;
            }

            public void setDiscountprice(int discountprice) {
                this.discountprice = discountprice;
            }

            public String getSupplier() {
                return supplier;
            }

            public void setSupplier(String supplier) {
                this.supplier = supplier;
            }
        }
    }
}

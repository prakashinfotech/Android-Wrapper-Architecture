package webservice;

import java.util.List;

/**
 * Created by haresh on 02-02-2018.
 */

public class ConfigrationFile {


    /**
     * salesapp : {"environments":[{"environmentId":1,"environment":"Live Environment","baseUrl":"https://proxy.api.retail3000.net/grs","storeNumber":"1","companyNumber":"89","storeId":233,"defaultCustomerId":271268,"mobileDeviceNumber":0,"saleOrderClassIdField":32,"vatId":3,"vatPercentage":21,"barcodeTypeIdForAddBarcode":1,"consumerUnitToSaleUnitFactor":1,"columnNumberForAddMixMatch":1,"amountAddMixMatchProduct":1,"countryIdForUpdateAddress":20,"countryIdForGetVat":-1,"countryIdForAddPhoneNumber":-1,"productIdForAddPrePayment":1783088,"deliveryProductId":1783088,"productCategoryId":247,"scannerNumber":"0","TransportTypeDirectPickup":125,"TransportTypeDirectPickupLater":127,"TransportTypeHomeMorning":123,"TransportTypeHomeAfter":312,"countryIdNetherlands":4,"countryIdBelgium":27,"countryIdGermany":26,"SimpleHomeDelivery":[{"key":"Delivery With Assistance","value":74},{"key":"Delivery Without Assistance","value":75},{"key":"Delivery And Construction","value":76}],"SimpleHomeDeliveryPrice":[{"key":"\u20ac","value":25},{"key":"\u20ac","value":35},{"key":"\u20ac","value":45},{"key":"\u20ac","value":50}]},{"environmentId":2,"environment":"Acceptance Environment","baseUrl":"https://proxy.api.retail3000.net/grs","storeNumber":"2","companyNumber":"89","storeId":273,"defaultCustomerId":271268,"mobileDeviceNumber":0,"saleOrderClassIdField":32,"vatId":3,"vatPercentage":5,"barcodeTypeIdForAddBarcode":1,"consumerUnitToSaleUnitFactor":1,"columnNumberForAddMixMatch":1,"amountAddMixMatchProduct":1,"countryIdForUpdateAddress":20,"countryIdForGetVat":-1,"countryIdForAddPhoneNumber":-1,"productIdForAddPrePayment":1783088,"deliveryProductId":1783088,"productCategoryId":247,"scannerNumber":"0","TransportTypeDirectPickup":125,"TransportTypeDirectPickupLater":127,"TransportTypeHomeMorning":123,"TransportTypeHomeAfter":312,"countryIdNetherlands":4,"countryIdBelgium":27,"countryIdGermany":26,"SimpleHomeDelivery":[{"key":"Delivery With Assistance","value":74},{"key":"Delivery Without Assistance","value":75},{"key":"Delivery And Construction","value":76}],"SimpleHomeDeliveryPrice":[{"key":"\u20ac","value":25},{"key":"\u20ac","value":35},{"key":"\u20ac","value":45},{"key":"\u20ac","value":50}]},{"environmentId":3,"environment":"Test Environment","baseUrl":"http://test.bo.retail3000.net/grs","storeNumber":"1","companyNumber":"89","storeId":233,"defaultCustomerId":271268,"mobileDeviceNumber":0,"saleOrderClassIdField":32,"vatId":3,"vatPercentage":5,"barcodeTypeIdForAddBarcode":1,"consumerUnitToSaleUnitFactor":1,"columnNumberForAddMixMatch":1,"amountAddMixMatchProduct":1,"countryIdForUpdateAddress":20,"countryIdForGetVat":-1,"countryIdForAddPhoneNumber":-1,"productIdForAddPrePayment":1783088,"deliveryProductId":1783088,"productCategoryId":247,"scannerNumber":"0","TransportTypeDirectPickup":125,"TransportTypeDirectPickupLater":127,"TransportTypeHomeMorning":123,"TransportTypeHomeAfter":312,"countryIdNetherlands":4,"countryIdBelgium":27,"countryIdGermany":26,"SimpleHomeDelivery":[{"key":"Delivery With Assistance","value":74},{"key":"Delivery Without Assistance","value":75},{"key":"Delivery And Construction","value":76}],"SimpleHomeDeliveryPrice":[{"key":"\u20ac","value":25},{"key":"\u20ac","value":35},{"key":"\u20ac","value":45},{"key":"\u20ac","value":50}]}],"settings":{"IsAutoLogin":false,"homeDeliveryView":"Horizontal","IsProductCategory":false,"primaryColor":"#fcba03","secondaryColor":"#1ecc6b","primaryTextColor":"#ffffff","secondaryTextColor":"#ffffff"}}
     */

    private SalesappBean salesapp;

    public SalesappBean getSalesapp() {
        return salesapp;
    }

    public void setSalesapp(SalesappBean salesapp) {
        this.salesapp = salesapp;
    }

    public static class SalesappBean {
        /**
         * environments : [{"environmentId":1,"environment":"Live Environment","baseUrl":"https://proxy.api.retail3000.net/grs","storeNumber":"1","companyNumber":"89","storeId":233,"defaultCustomerId":271268,"mobileDeviceNumber":0,"saleOrderClassIdField":32,"vatId":3,"vatPercentage":21,"barcodeTypeIdForAddBarcode":1,"consumerUnitToSaleUnitFactor":1,"columnNumberForAddMixMatch":1,"amountAddMixMatchProduct":1,"countryIdForUpdateAddress":20,"countryIdForGetVat":-1,"countryIdForAddPhoneNumber":-1,"productIdForAddPrePayment":1783088,"deliveryProductId":1783088,"productCategoryId":247,"scannerNumber":"0","TransportTypeDirectPickup":125,"TransportTypeDirectPickupLater":127,"TransportTypeHomeMorning":123,"TransportTypeHomeAfter":312,"countryIdNetherlands":4,"countryIdBelgium":27,"countryIdGermany":26,"SimpleHomeDelivery":[{"key":"Delivery With Assistance","value":74},{"key":"Delivery Without Assistance","value":75},{"key":"Delivery And Construction","value":76}],"SimpleHomeDeliveryPrice":[{"key":"\u20ac","value":25},{"key":"\u20ac","value":35},{"key":"\u20ac","value":45},{"key":"\u20ac","value":50}]},{"environmentId":2,"environment":"Acceptance Environment","baseUrl":"https://proxy.api.retail3000.net/grs","storeNumber":"2","companyNumber":"89","storeId":273,"defaultCustomerId":271268,"mobileDeviceNumber":0,"saleOrderClassIdField":32,"vatId":3,"vatPercentage":5,"barcodeTypeIdForAddBarcode":1,"consumerUnitToSaleUnitFactor":1,"columnNumberForAddMixMatch":1,"amountAddMixMatchProduct":1,"countryIdForUpdateAddress":20,"countryIdForGetVat":-1,"countryIdForAddPhoneNumber":-1,"productIdForAddPrePayment":1783088,"deliveryProductId":1783088,"productCategoryId":247,"scannerNumber":"0","TransportTypeDirectPickup":125,"TransportTypeDirectPickupLater":127,"TransportTypeHomeMorning":123,"TransportTypeHomeAfter":312,"countryIdNetherlands":4,"countryIdBelgium":27,"countryIdGermany":26,"SimpleHomeDelivery":[{"key":"Delivery With Assistance","value":74},{"key":"Delivery Without Assistance","value":75},{"key":"Delivery And Construction","value":76}],"SimpleHomeDeliveryPrice":[{"key":"\u20ac","value":25},{"key":"\u20ac","value":35},{"key":"\u20ac","value":45},{"key":"\u20ac","value":50}]},{"environmentId":3,"environment":"Test Environment","baseUrl":"http://test.bo.retail3000.net/grs","storeNumber":"1","companyNumber":"89","storeId":233,"defaultCustomerId":271268,"mobileDeviceNumber":0,"saleOrderClassIdField":32,"vatId":3,"vatPercentage":5,"barcodeTypeIdForAddBarcode":1,"consumerUnitToSaleUnitFactor":1,"columnNumberForAddMixMatch":1,"amountAddMixMatchProduct":1,"countryIdForUpdateAddress":20,"countryIdForGetVat":-1,"countryIdForAddPhoneNumber":-1,"productIdForAddPrePayment":1783088,"deliveryProductId":1783088,"productCategoryId":247,"scannerNumber":"0","TransportTypeDirectPickup":125,"TransportTypeDirectPickupLater":127,"TransportTypeHomeMorning":123,"TransportTypeHomeAfter":312,"countryIdNetherlands":4,"countryIdBelgium":27,"countryIdGermany":26,"SimpleHomeDelivery":[{"key":"Delivery With Assistance","value":74},{"key":"Delivery Without Assistance","value":75},{"key":"Delivery And Construction","value":76}],"SimpleHomeDeliveryPrice":[{"key":"\u20ac","value":25},{"key":"\u20ac","value":35},{"key":"\u20ac","value":45},{"key":"\u20ac","value":50}]}]
         * settings : {"IsAutoLogin":false,"homeDeliveryView":"Horizontal","IsProductCategory":false,"primaryColor":"#fcba03","secondaryColor":"#1ecc6b","primaryTextColor":"#ffffff","secondaryTextColor":"#ffffff"}
         */

        private SettingsBean settings;
        private List<EnvironmentsBean> environments;

        public SettingsBean getSettings() {
            return settings;
        }

        public void setSettings(SettingsBean settings) {
            this.settings = settings;
        }

        public List<EnvironmentsBean> getEnvironments() {
            return environments;
        }

        public void setEnvironments(List<EnvironmentsBean> environments) {
            this.environments = environments;
        }

        public static class SettingsBean {
            /**
             * IsAutoLogin : false
             * homeDeliveryView : Horizontal
             * IsProductCategory : false
             * primaryColor : #fcba03
             * secondaryColor : #1ecc6b
             * primaryTextColor : #ffffff
             * secondaryTextColor : #ffffff
             */

            private boolean IsAutoLogin;
            private String homeDeliveryView;
            private boolean IsProductCategory;
            private String primaryColor;
            private String secondaryColor;
            private String primaryTextColor;
            private String secondaryTextColor;
            private String min_version;

            public String getMin_version() {
                return min_version;
            }

            public void setMin_version(String min_version) {
                this.min_version = min_version;
            }

            public boolean isIsAutoLogin() {
                return IsAutoLogin;
            }

            public void setIsAutoLogin(boolean IsAutoLogin) {
                this.IsAutoLogin = IsAutoLogin;
            }

            public String getHomeDeliveryView() {
                return homeDeliveryView;
            }

            public void setHomeDeliveryView(String homeDeliveryView) {
                this.homeDeliveryView = homeDeliveryView;
            }

            public boolean isIsProductCategory() {
                return IsProductCategory;
            }

            public void setIsProductCategory(boolean IsProductCategory) {
                this.IsProductCategory = IsProductCategory;
            }

            public String getPrimaryColor() {
                return primaryColor;
            }

            public void setPrimaryColor(String primaryColor) {
                this.primaryColor = primaryColor;
            }

            public String getSecondaryColor() {
                return secondaryColor;
            }

            public void setSecondaryColor(String secondaryColor) {
                this.secondaryColor = secondaryColor;
            }

            public String getPrimaryTextColor() {
                return primaryTextColor;
            }

            public void setPrimaryTextColor(String primaryTextColor) {
                this.primaryTextColor = primaryTextColor;
            }

            public String getSecondaryTextColor() {
                return secondaryTextColor;
            }

            public void setSecondaryTextColor(String secondaryTextColor) {
                this.secondaryTextColor = secondaryTextColor;
            }
        }

        public static class EnvironmentsBean {
            /**
             * environmentId : 1
             * environment : Live Environment
             * baseUrl : https://proxy.api.retail3000.net/grs
             * storeNumber : 1
             * companyNumber : 89
             * storeId : 233
             * defaultCustomerId : 271268
             * mobileDeviceNumber : 0
             * saleOrderClassIdField : 32
             * vatId : 3
             * vatPercentage : 21
             * barcodeTypeIdForAddBarcode : 1
             * consumerUnitToSaleUnitFactor : 1
             * columnNumberForAddMixMatch : 1
             * amountAddMixMatchProduct : 1
             * countryIdForUpdateAddress : 20
             * countryIdForGetVat : -1
             * countryIdForAddPhoneNumber : -1
             * productIdForAddPrePayment : 1783088
             * deliveryProductId : 1783088
             * productCategoryId : 247
             * scannerNumber : 0
             * TransportTypeDirectPickup : 125
             * TransportTypeDirectPickupLater : 127
             * TransportTypeHomeMorning : 123
             * TransportTypeHomeAfter : 312
             * countryIdNetherlands : 4
             * countryIdBelgium : 27
             * countryIdGermany : 26
             * SimpleHomeDelivery : [{"key":"Delivery With Assistance","value":74},{"key":"Delivery Without Assistance","value":75},{"key":"Delivery And Construction","value":76}]
             * SimpleHomeDeliveryPrice : [{"key":"\u20ac","value":25},{"key":"\u20ac","value":35},{"key":"\u20ac","value":45},{"key":"\u20ac","value":50}]
             */

            private int environmentId;
            private String environment;
            private String baseUrl;
            private String storeNumber;
            private String companyNumber;
            private int storeId;
            private int defaultCustomerId;
            private int mobileDeviceNumber;
            private int saleOrderClassIdField;
            private int vatId;
            private int vatPercentage;
            private int barcodeTypeIdForAddBarcode;
            private int consumerUnitToSaleUnitFactor;
            private int columnNumberForAddMixMatch;
            private int amountAddMixMatchProduct;
            private int countryIdForUpdateAddress;
            private int countryIdForGetVat;
            private int countryIdForAddPhoneNumber;
            private int productIdForAddPrePayment;
            private int deliveryProductId;

            public int getDeliveryProductNumber() {
                return deliveryProductNumber;
            }

            public void setDeliveryProductNumber(int deliveryProductNumber) {
                this.deliveryProductNumber = deliveryProductNumber;
            }

            private int deliveryProductNumber;
            private int productCategoryId;
            private String scannerNumber;
            private int TransportTypeDirectPickup;
            private int TransportTypeDirectPickupLater;
            private int TransportTypeHomeMorning;
            private int TransportTypeHomeAfter;
            private int countryIdNetherlands;
            private int countryIdBelgium;
            private int countryIdGermany;
            private List<SimpleHomeDeliveryBean> SimpleHomeDelivery;
            private List<SimpleHomeDeliveryPriceBean> SimpleHomeDeliveryPrice;
            private String default_options_true;
            private String default_options_false;
            private boolean sentEmailToCustomer;
            private boolean sentEmailToInternal;
            private int defaultLocation;
            private String defaultLocationDescription;
            private String layoutView;
            private int productListTypeId;
            private boolean displayRowDiscounts;
            /**
             * show_last_used_products field is boolean value if we required to display last used products in list or not.
             */
            private boolean show_last_used_products;
            /**
             * show_last_used_article_list field is boolean value if we required to display last used products in list or not.
             */
            private boolean show_last_used_article_list;
            /**
             * print_product_list_quantity is boolean value if we required to checkmark checkbox on Batch print or not.
             */
            private boolean print_product_list_quantity;

            public String getDefaultLocationDescription() {
                return defaultLocationDescription;
            }

            public void setDefaultLocationDescription(String defaultLocationDescription) {
                this.defaultLocationDescription = defaultLocationDescription;
            }

            public int getDefaultLocation() {
                return defaultLocation;
            }

            public void setDefaultLocation(int defaultLocation) {
                this.defaultLocation = defaultLocation;
            }

            public boolean isSentEmailToCustomer() {
                return sentEmailToCustomer;
            }

            public void setSentEmailToCustomer(boolean sentEmailToCustomer) {
                this.sentEmailToCustomer = sentEmailToCustomer;
            }

            public boolean isSentEmailToInternal() {
                return sentEmailToInternal;
            }

            public void setSentEmailToInternal(boolean sentEmailToInternal) {
                this.sentEmailToInternal = sentEmailToInternal;
            }

            public String getDefault_options_true() {
                return default_options_true;
            }

            public void setDefault_options_true(String default_options_true) {
                this.default_options_true = default_options_true;
            }

            public String getDefault_options_false() {
                return default_options_false;
            }

            public void setDefault_options_false(String default_options_false) {
                this.default_options_false = default_options_false;
            }

            public List<PrePaymentPriceBean> getPrePaymentPrice() {
                return PrePaymentPrice;
            }

            public void setPrePaymentPrice(List<PrePaymentPriceBean> prePaymentPrice) {
                PrePaymentPrice = prePaymentPrice;
            }

            private List<PrePaymentPriceBean> PrePaymentPrice;

            private String homeDeliveryView;
            private String adminBaseUrl;
            private int phoneTypeIDforPhone;
            private int phoneTypeIDforCell;
            private int stock_alert;
            private String networkSSID;
            private boolean isEmailCompulsory;
            private boolean isPhoneCompulsory;
            private int TransportTypeIDForCall;
            private boolean search_category;
            private boolean delivery_cost_mandatory;
            private boolean postal_code_mandatory;
            /**
             * allow_edit_product is for allow edit product in Receipt Handling
             */
            private boolean allow_edit_product;
            /**
             * defaultPostalCode param is for default postal code set while new customer added and postal code is blank
             */
            private String default_postal_code;
            /**
             * allow_add_mixmatch param is for allow non admin user to add mix match
             */
            private boolean allow_add_mixmatch;
            /**
             * mandatory_delivery_date field is used for make simple delivery screen mandatory
             */
            private boolean mandatory_delivery_date;
            /**
             * auto_apply_discounts field is used to check checkmark of autodiscount automatically on @ProductDetails screen
             */
            private boolean auto_apply_discounts;
            /**
             * print_price filed is used to set as request parameter in printproductlabel
             */
            private boolean print_price;
            /**
             * new_api_support field is user to to check if environment support New API version or not.
             */
            private boolean new_api_support;

            /**
             * auto_select_location field is user to to set if  if environment support New API version or not.
             */
            private boolean auto_select_location;
            /**
             * highlightPickingQuantity field is used in @{@link com.colleqtive.warehouse.OrderPickupListActivity} to hightlight quantity
             */
            private boolean highlight_picking_quantity;

            public boolean isDisplay_productlist_type_id() {
                return display_productlist_type_id;
            }

            public void setDisplay_productlist_type_id(boolean display_productlist_type_id) {
                this.display_productlist_type_id = display_productlist_type_id;
            }

            /**
             * display_productlist_type_id field is used to display productlisttype id in drop down of productlist in ProductDetailViewActivity.
             */
            private boolean display_productlist_type_id;
            private boolean show_warehouse;
            private int refresh_warehouse;
            private String product_list_listing_type;
            /**
             * continuous_scanning field is used on @link ScanProductsActivity to if scanning continues after submit or not.
             */
            private boolean continuous_scanning;
            /**
             * update_stock_alert field is used on @link MoveLocationActivity to display alert before submit or not.
             */
            private boolean update_stock_alert;
            /**
             * empty_to_Location_alert field is used on @link OrderPickupListActivity to display alert before submit or not.
             */
            private boolean empty_to_Location_alert;
            /**
             * show_move_stock_alert field is used on @link ProductListDetailsActivity to display alert before submit or not.
             */
            private boolean show_move_stock_alert;

            /**
             * auto_change_stock field is used on @link ProductListDetailsActivity to default check change stock or not.
             */
            private boolean auto_change_stock;
            /**
             * isLaserMode field to default check for lasermode
             */
            private int cameraMode;

            /**
             * cloud_print field is used on @link {@link com.colleqtive.salesapp.TicketScreen && {@link com.colleqtive.productlist.ProductListRowPrintActivity}} to print from cloud or not
             */
            private boolean cloud_print;
            /**
             * productlist id for PICKING side menu
             */
            private int pickingProductListId;
            /**
             * productlist id for ORDERING side menu
             */

            private int orderingProductListId;
            /**
             * articleSortOrder for sorting article list row
             */

            private String articleSortOrder;

            /**
             * invoice_type for View of invoice type in layout
             */

            private String invoice_type;
            /**
             * invoice_type for View of warehouse copy in layout
             */

            private String warehouse_type;
            /**
             * warehouse_printer_id for warehouse printer id
             */

            private String warehouse_printer_id;


            public EnvironmentsBean() {
            }

            public boolean isMandatoryPrepayment() {
                return mandatoryPrepayment;
            }

            public void setMandatoryPrepayment(boolean mandatoryPrepayment) {
                this.mandatoryPrepayment = mandatoryPrepayment;
            }

            private boolean mandatoryPrepayment;


            public double getLogout_duration() {
                return logout_duration;
            }

            public void setLogout_duration(double logout_duration) {
                this.logout_duration = logout_duration;
            }

            private double logout_duration;

            public boolean isMandatoryPostalCode() {
                return postal_code_mandatory;
            }

            public void setMandatoryPostalCode(boolean mandatoryPostalCode) {
                this.postal_code_mandatory = mandatoryPostalCode;
            }


            public String getPrintOrderStatus() {
                return printOrderStatus;
            }

            public void setPrintOrderStatus(String printOrderStatus) {
                this.printOrderStatus = printOrderStatus;
            }

            private String printOrderStatus;

            public boolean isDelivery_cost_mandatory() {
                return delivery_cost_mandatory;
            }

            public void setDelivery_cost_mandatory(boolean delivery_cost_mandatory) {
                this.delivery_cost_mandatory = delivery_cost_mandatory;
            }


            public boolean isSearch_category() {
                return search_category;
            }

            public void setSearch_category(boolean search_category) {
                this.search_category = search_category;
            }

            public boolean isMandtory_delivery() {
                return mandatory_delivery;
            }

            public void setMandtory_delivery(boolean mandtory_delivery) {
                this.mandatory_delivery = mandtory_delivery;
            }

            private boolean mandatory_delivery;

            public int getTransportTypeIDForCall() {
                return TransportTypeIDForCall;
            }

            public void setTransportTypeIDForCall(int transportTypeIDForCall) {
                TransportTypeIDForCall = transportTypeIDForCall;
            }

            public String getSsid() {
                return networkSSID;
            }

            public void setSsid(String ssid) {
                this.networkSSID = ssid;
            }

            public boolean isEmailCompulsory() {
                return isEmailCompulsory;
            }

            public void setEmailCompulsory(boolean emailCompulsory) {
                isEmailCompulsory = emailCompulsory;
            }

            public boolean isPhoneCompulsory() {
                return isPhoneCompulsory;
            }

            public void setPhoneCompulsory(boolean phoneCompulsory) {
                isPhoneCompulsory = phoneCompulsory;
            }

            public int getStock_alert() {
                return stock_alert;
            }

            public void setStock_alert(int stock_alert) {
                this.stock_alert = stock_alert;
            }

            public int getPhoneTypeIDforPhone() {
                return phoneTypeIDforPhone;
            }

            public void setPhoneTypeIDforPhone(int phoneTypeIDforPhone) {
                this.phoneTypeIDforPhone = phoneTypeIDforPhone;
            }

            public int getPhoneTypeIDforCell() {
                return phoneTypeIDforCell;
            }

            public void setPhoneTypeIDforCell(int phoneTypeIDforCell) {
                this.phoneTypeIDforCell = phoneTypeIDforCell;
            }

            public String getAdminBaseUrl() {
                return adminBaseUrl;
            }

            public void setAdminBaseUrl(String adminBaseUrl) {
                this.adminBaseUrl = adminBaseUrl;
            }

            public String getHomeDeliveryView() {

                return homeDeliveryView;
            }

            public void setHomeDeliveryView(String homeDeliveryView) {
                this.homeDeliveryView = homeDeliveryView;
            }

            public int getEnvironmentId() {
                return environmentId;
            }

            public void setEnvironmentId(int environmentId) {
                this.environmentId = environmentId;
            }

            public String getEnvironment() {
                return environment;
            }

            public void setEnvironment(String environment) {
                this.environment = environment;
            }

            public String getBaseUrl() {
                return baseUrl;
            }

            public void setBaseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
            }

            public String getStoreNumber() {
                return storeNumber;
            }

            public void setStoreNumber(String storeNumber) {
                this.storeNumber = storeNumber;
            }

            public String getCompanyNumber() {
                return companyNumber;
            }

            public void setCompanyNumber(String companyNumber) {
                this.companyNumber = companyNumber;
            }

            public int getStoreId() {
                return storeId;
            }

            public void setStoreId(int storeId) {
                this.storeId = storeId;
            }

            public int getDefaultCustomerId() {
                return defaultCustomerId;
            }

            public void setDefaultCustomerId(int defaultCustomerId) {
                this.defaultCustomerId = defaultCustomerId;
            }

            public int getMobileDeviceNumber() {
                return mobileDeviceNumber;
            }

            public void setMobileDeviceNumber(int mobileDeviceNumber) {
                this.mobileDeviceNumber = mobileDeviceNumber;
            }

            public int getSaleOrderClassIdField() {
                return saleOrderClassIdField;
            }

            public void setSaleOrderClassIdField(int saleOrderClassIdField) {
                this.saleOrderClassIdField = saleOrderClassIdField;
            }

            public int getVatId() {
                return vatId;
            }

            public void setVatId(int vatId) {
                this.vatId = vatId;
            }

            public int getVatPercentage() {
                return vatPercentage;
            }

            public void setVatPercentage(int vatPercentage) {
                this.vatPercentage = vatPercentage;
            }

            public int getBarcodeTypeIdForAddBarcode() {
                return barcodeTypeIdForAddBarcode;
            }

            public void setBarcodeTypeIdForAddBarcode(int barcodeTypeIdForAddBarcode) {
                this.barcodeTypeIdForAddBarcode = barcodeTypeIdForAddBarcode;
            }

            public int getConsumerUnitToSaleUnitFactor() {
                return consumerUnitToSaleUnitFactor;
            }

            public void setConsumerUnitToSaleUnitFactor(int consumerUnitToSaleUnitFactor) {
                this.consumerUnitToSaleUnitFactor = consumerUnitToSaleUnitFactor;
            }

            public int getColumnNumberForAddMixMatch() {
                return columnNumberForAddMixMatch;
            }

            public void setColumnNumberForAddMixMatch(int columnNumberForAddMixMatch) {
                this.columnNumberForAddMixMatch = columnNumberForAddMixMatch;
            }

            public int getAmountAddMixMatchProduct() {
                return amountAddMixMatchProduct;
            }

            public void setAmountAddMixMatchProduct(int amountAddMixMatchProduct) {
                this.amountAddMixMatchProduct = amountAddMixMatchProduct;
            }

            public int getCountryIdForUpdateAddress() {
                return countryIdForUpdateAddress;
            }

            public void setCountryIdForUpdateAddress(int countryIdForUpdateAddress) {
                this.countryIdForUpdateAddress = countryIdForUpdateAddress;
            }

            public int getCountryIdForGetVat() {
                return countryIdForGetVat;
            }

            public void setCountryIdForGetVat(int countryIdForGetVat) {
                this.countryIdForGetVat = countryIdForGetVat;
            }

            public int getCountryIdForAddPhoneNumber() {
                return countryIdForAddPhoneNumber;
            }

            public void setCountryIdForAddPhoneNumber(int countryIdForAddPhoneNumber) {
                this.countryIdForAddPhoneNumber = countryIdForAddPhoneNumber;
            }

            public int getProductIdForAddPrePayment() {
                return productIdForAddPrePayment;
            }

            public void setProductIdForAddPrePayment(int productIdForAddPrePayment) {
                this.productIdForAddPrePayment = productIdForAddPrePayment;
            }

            public int getDeliveryProductId() {
                return deliveryProductId;
            }

            public void setDeliveryProductId(int deliveryProductId) {
                this.deliveryProductId = deliveryProductId;
            }

            public int getProductCategoryId() {
                return productCategoryId;
            }

            public void setProductCategoryId(int productCategoryId) {
                this.productCategoryId = productCategoryId;
            }

            public String getScannerNumber() {
                return scannerNumber;
            }

            public void setScannerNumber(String scannerNumber) {
                this.scannerNumber = scannerNumber;
            }

            public int getTransportTypeDirectPickup() {
                return TransportTypeDirectPickup;
            }

            public void setTransportTypeDirectPickup(int TransportTypeDirectPickup) {
                this.TransportTypeDirectPickup = TransportTypeDirectPickup;
            }

            public int getTransportTypeDirectPickupLater() {
                return TransportTypeDirectPickupLater;
            }

            public void setTransportTypeDirectPickupLater(int TransportTypeDirectPickupLater) {
                this.TransportTypeDirectPickupLater = TransportTypeDirectPickupLater;
            }

            public int getTransportTypeHomeMorning() {
                return TransportTypeHomeMorning;
            }

            public void setTransportTypeHomeMorning(int TransportTypeHomeMorning) {
                this.TransportTypeHomeMorning = TransportTypeHomeMorning;
            }

            public int getTransportTypeHomeAfter() {
                return TransportTypeHomeAfter;
            }

            public void setTransportTypeHomeAfter(int TransportTypeHomeAfter) {
                this.TransportTypeHomeAfter = TransportTypeHomeAfter;
            }

            public int getCountryIdNetherlands() {
                return countryIdNetherlands;
            }

            public void setCountryIdNetherlands(int countryIdNetherlands) {
                this.countryIdNetherlands = countryIdNetherlands;
            }

            public int getCountryIdBelgium() {
                return countryIdBelgium;
            }

            public void setCountryIdBelgium(int countryIdBelgium) {
                this.countryIdBelgium = countryIdBelgium;
            }

            public int getCountryIdGermany() {
                return countryIdGermany;
            }

            public void setCountryIdGermany(int countryIdGermany) {
                this.countryIdGermany = countryIdGermany;
            }

            public List<SimpleHomeDeliveryBean> getSimpleHomeDelivery() {
                return SimpleHomeDelivery;
            }

            public void setSimpleHomeDelivery(List<SimpleHomeDeliveryBean> SimpleHomeDelivery) {
                this.SimpleHomeDelivery = SimpleHomeDelivery;
            }

            public List<SimpleHomeDeliveryPriceBean> getSimpleHomeDeliveryPrice() {
                return SimpleHomeDeliveryPrice;
            }

            public void setSimpleHomeDeliveryPrice(List<SimpleHomeDeliveryPriceBean> SimpleHomeDeliveryPrice) {
                this.SimpleHomeDeliveryPrice = SimpleHomeDeliveryPrice;
            }

            public String getLayoutView() {
                return layoutView;
            }

            public void setLayoutView(String layoutView) {
                this.layoutView = layoutView;
            }

            public int getProductListTypeId() {
                return productListTypeId;
            }

            public void setProductListTypeId(int productListTypeId) {
                this.productListTypeId = productListTypeId;
            }

            public boolean isDisplayRowDiscount() {
                return displayRowDiscounts;
            }

            public void setDisplayRowDiscount(boolean displayRowDiscount) {
                this.displayRowDiscounts = displayRowDiscount;
            }

            public boolean isPrint_product_list_quantity() {
                return print_product_list_quantity;
            }

            public void setPrint_product_list_quantity(boolean print_product_list_quantity) {
                this.print_product_list_quantity = print_product_list_quantity;
            }

            public boolean isAllow_edit_product() {
                return allow_edit_product;
            }

            public void setAllow_edit_product(boolean allow_edit_product) {
                this.allow_edit_product = allow_edit_product;
            }

            public String getDefaultPostalCode() {
                return default_postal_code;
            }

            public void setDefaultPostalCode(String defaultPostalCode) {
                this.default_postal_code = defaultPostalCode;
            }

            public boolean isAllow_add_mixmatch() {
                return allow_add_mixmatch;
            }

            public void setAllow_add_mixmatch(boolean allow_add_mixmatch) {
                this.allow_add_mixmatch = allow_add_mixmatch;
            }

            public boolean isMandatory_delivery_date() {
                return mandatory_delivery_date;
            }

            public void setMandatory_delivery_date(boolean mandatory_delivery_date) {
                this.mandatory_delivery_date = mandatory_delivery_date;
            }

            public boolean isAuto_apply_discounts() {
                return auto_apply_discounts;
            }

            public void setAuto_apply_discounts(boolean auto_apply_discounts) {
                this.auto_apply_discounts = auto_apply_discounts;
            }

            public boolean isPrint_price() {
                return print_price;
            }

            public void setPrint_price(boolean print_price) {
                this.print_price = print_price;
            }

            public boolean isNew_api_support() {
                return new_api_support;
            }

            public void setNew_api_support(boolean new_api_support) {
                this.new_api_support = new_api_support;
            }

            public boolean isAuto_select_location() {
                return auto_select_location;
            }

            public void setAuto_select_location(boolean auto_select_location) {
                this.auto_select_location = auto_select_location;
            }

            public boolean isHighlightPickingQuantity() {
                return highlight_picking_quantity;
            }

            public void setHighlightPickingQuantity(boolean highlightPickingQuantity) {
                this.highlight_picking_quantity = highlightPickingQuantity;
            }

            public boolean isShow_last_used_products() {
                return show_last_used_products;
            }

            public void setShow_last_used_products(boolean show_last_used_products) {
                this.show_last_used_products = show_last_used_products;
            }

            public boolean isShow_last_used_article_list() {
                return show_last_used_article_list;
            }

            public void setShow_last_used_article_list(boolean show_last_used_article_list) {
                this.show_last_used_article_list = show_last_used_article_list;
            }

            public boolean isShow_warehouse() {
                return show_warehouse;
            }

            public void setShow_warehouse(boolean show_warehouse) {
                this.show_warehouse = show_warehouse;
            }

            public int getRefresh_warehouse() {
                return refresh_warehouse;
            }

            public void setRefresh_warehouse(int refresh_warehouse) {
                this.refresh_warehouse = refresh_warehouse;
            }

            public String getProduct_list_listing_type() {
                return product_list_listing_type;
            }

            public void setProduct_list_listing_type(String product_list_listing_type) {
                this.product_list_listing_type = product_list_listing_type;
            }

            public boolean isContinuous_scanning() {
                return continuous_scanning;
            }

            public void setContinuous_scanning(boolean continuous_scanning) {
                this.continuous_scanning = continuous_scanning;
            }

            public boolean isUpdate_stock_alert() {
                return update_stock_alert;
            }

            public void setUpdate_stock_alert(boolean update_stock_alert) {
                this.update_stock_alert = update_stock_alert;
            }

            public boolean isEmpty_to_Location_alert() {
                return empty_to_Location_alert;
            }

            public void setEmpty_to_Location_alert(boolean empty_to_Location_alert) {
                this.empty_to_Location_alert = empty_to_Location_alert;
            }

            public boolean isCloud_print() {
                return cloud_print;
            }

            public void setCloud_print(boolean cloud_print) {
                this.cloud_print = cloud_print;
            }

            public boolean isShow_move_stock_alert() {
                return show_move_stock_alert;
            }

            public void setShow_move_stock_alert(boolean show_move_stock_alert) {
                this.show_move_stock_alert = show_move_stock_alert;
            }

            public boolean isAuto_change_stock() {
                return auto_change_stock;
            }

            public void setAuto_change_stock(boolean auto_change_stock) {
                this.auto_change_stock = auto_change_stock;
            }

            public int getCameraMode() {
                return cameraMode;
            }

            public void setCameraMode(int cameraMode) {
                this.cameraMode = cameraMode;
            }

            public int getOrderingProductListId() {
                return orderingProductListId;
            }

            public void setOrderingProductListId(int orderingProductListId) {
                this.orderingProductListId = orderingProductListId;
            }

            public int getPickingProductListId() {
                return pickingProductListId;
            }

            public void setPickingProductListId(int pickingProductListId) {
                this.pickingProductListId = pickingProductListId;
            }

            public String getArticleSortOrder() {
                return articleSortOrder;
            }

            public void setArticleSortOrder(String articleSortOrder) {
                this.articleSortOrder = articleSortOrder;
            }

            public String getWarehouse_type() {
                return warehouse_type;
            }

            public void setWarehouse_type(String warehouse_type) {
                this.warehouse_type = warehouse_type;
            }

            public String getInvoice_type() {
                return invoice_type;
            }

            public void setInvoice_type(String invoice_type) {
                this.invoice_type = invoice_type;
            }

            public String getWarehouse_printer_id() {
                return warehouse_printer_id;
            }

            public void setWarehouse_printer_id(String warehouse_printer_id) {
                this.warehouse_printer_id = warehouse_printer_id;
            }

            public static class SimpleHomeDeliveryBean {
                /**
                 * key : Delivery With Assistance
                 * value : 74
                 */

                private String key;
                private int value;

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class SimpleHomeDeliveryPriceBean {
                /**
                 * key : €
                 * value : 25
                 */

                private String key;
                private int value;

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class PrePaymentPriceBean {
                private String key;
                private int value;

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }
        }
    }
}

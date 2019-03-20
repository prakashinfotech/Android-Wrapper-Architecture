package CommonClass;

/**
 * Created by Vivek on 7/29/2017.
 */

public class StaticValues {

    public static String BASE_URL = "https://proxy.api.retail3000.net/grs";//2) https://proxy.api.retail3000.net/grs 1) http://test.bo.retail3000.net/grs
    public static String BASE_URL_LIVE = "https://proxy.api.retail3000.net/grs";
    public static String BASE_URL_ACCEPTANCE = "https://proxy.api.retail3000.net/grs";
    public static String BASE_URL_TEST = "http://test.bo.retail3000.net/grs";
    public static String ENVIORMENTS_NAME = "";
    public static int ENVIORMENTS_ID = 0;


    public static String WEBSERVICE_ULR = "http://retail3000.net/Retail3000Webservice/";
    public static String PRICEMOTION_CONTENT_URL = "http://www.pricemotion.nl/service/xml.php?serial=x325038852";

    public static String PRODUCT_BASE_COMPONENTS = "/productbasecomponents.asmx";
    public static String SECURITY_BASE_COMPONENTS = "/securitycomponents.asmx";

    /*****************************CustomerComponents webservice ***********************************/

    public static String CustomerComponents_NAMESPACE = WEBSERVICE_ULR + "WebserviceCustomerComponents";
    public static String WEBSERVICE_CustomerComponents = "/customercomponents.asmx";
    public static String ADDCUSTOMER = "AddCustomer";
    public static String ADDADDRESS = "AddAddress";
    public static String ADDPHONENUMBER = "AddPhoneNumber";
    public static String ADDEMAILADDRESS = "AddEmailAddress";


    // Login Screen
    public static String GET_PRODUCT_CATEGORY_METHOD_NAME = "GetProductCategories";
    public static String GET_PRODUCT_CATEGORY_SOAP_ACTION = WEBSERVICE_ULR + "WebserviceProductBaseComponents/GetProductCategories";
    public static String GET_PRODUCT_CATEGORIES_NAMESPACE = WEBSERVICE_ULR + "WebserviceProductBaseComponents";

    public static String GET_LOGIN_METHOD_NAME = "ValidateUser";
    public static String GET_LOGIN_SOAP_ACTION = WEBSERVICE_ULR + "WebserviceSecurityComponents/ValidateUser";
    public static String GET_LOGIN_NAMESPACE = WEBSERVICE_ULR + "WebserviceSecurityComponents";


    //Sales Order Screen
    public static String GET_SALES_ORDER_SOAP_ACTION = WEBSERVICE_ULR + "WebserviceProductBaseComponents/GetSaleOrders";
    public static String GET_SALES_ORDER_NAMESPACE = WEBSERVICE_ULR + "WebserviceProductBaseComponents";


    // Get Unique Sale Order Number

    public static String GET_UNIQUE_SALE_ORDER_MEHOD_NAME = "GetUniqueSaleOrderNumber";
    public static String GET_UNIQUE_SALE_ORDER_SOAP_ACTION = WEBSERVICE_ULR + "WebserviceProductBaseComponents/GetUniqueSaleOrderNumber";
    public static String GET_UNIQUE_SALE_ORDER_NAME_SAPCE = WEBSERVICE_ULR + "WebserviceProductBaseComponents";

    public static int PRODUCT_PER_REQUEST = 20;

    // public static int COUNTRY_ID = 20;
    //public static String Country = "NEDERLAND";

    public static int Salutation_sir = 1;
    public static int Salutation_madam = 2;


    /********REST API **********************/
    public static final String API_POSTCODE = "postCodeApi";
    public static final String API_GERMAN_POSTCODE = "germanPostCodeApi";
    public static final String API_HOME_DELIVERY = "homeDelivery";
    public static final String API_CONFIG = "Config";


}

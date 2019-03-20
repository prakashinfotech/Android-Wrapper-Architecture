package ModelClass;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Vivek on 7/25/2017.
 */

public class GetCustomersResponse {

    /**
     * GetCustomersResponse : {"GetCustomersResult":{"ViewCustomerInfo":[{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":-1,"SaleConfirmationEmailAddressId":89880,"SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":-1,"SupplierId":-1,"InvoiceNumberPart1":-1,"DefaultEmailAddress":"barriluengo.e@kpnplanet.nl","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":-1,"DateOfBirth":"0001-01-01T00:00:00","CustomerTypeId":75,"CreatedByUserId":3105,"LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:21:09.713","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":-1,"LanguageId":-1,"LastName":"-","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":-1,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":-1,"PhoneNumber":"+31(0)36-5498490","ItemId":273649,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":-1,"VisitNumberPart1":-1,"CustomerNumber":3324,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"GeneralName":"-","PostalStreet":"baroniestraat","InvoiceStreet":"baroniestraat","DeliveryZipCode":"1333TH","VisitCountry":"NEDERLAND","PostalZipCode":"1333TH","InvoiceCountry":"NEDERLAND","InvoiceAddress":"baroniestraat 19","VisitZipCode":"1333TH","PostalAddress":"baroniestraat 19","DeliveryStreet":"baroniestraat","DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","DeliveryAddress":"baroniestraat 19","VisitAddress":"baroniestraat 19","InvoiceZipCode":"1333TH","DeliveryCity":"ALMERE","InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"baroniestraat","Initials":"-."},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":89503,"PostalStreet":"baroniestraat","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":19,"InvoiceStreet":"baroniestraat","DefaultEmailAddress":"lucky4anja@hotmail.com","DeliveryZipCode":"1333TH","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":1,"VisitCountry":"NEDERLAND","PostalZipCode":"1333TH","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"baroniestraat 19","VisitZipCode":"1333TH","PostalAddress":"baroniestraat 19","CustomerTypeId":75,"DeliveryStreet":"baroniestraat","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:19:41.647","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"baroniestraat 19","LanguageId":-1,"VisitAddress":"baroniestraat 19","LastName":"-","InvoiceZipCode":"1333TH","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":19,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)36-5327626","DeliveryCity":"ALMERE","ItemId":273176,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":19,"VisitNumberPart1":19,"CustomerNumber":2851,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"baroniestraat","GeneralName":"-                                       , Dhr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":89889,"PostalStreet":"urkwal","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":12,"InvoiceStreet":"urkwal","DefaultEmailAddress":"cisea1@hotmail.com","DeliveryZipCode":"1324HM","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"NEDERLAND","PostalZipCode":"1324HM","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"urkwal 12","VisitZipCode":"1324HM","PostalAddress":"urkwal 12","CustomerTypeId":75,"DeliveryStreet":"urkwal","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:21:10.963","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"urkwal 12","LanguageId":-1,"VisitAddress":"urkwal 12","LastName":"-","InvoiceZipCode":"1324HM","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":12,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)36-5319250","DeliveryCity":"ALMERE","ItemId":273659,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":12,"VisitNumberPart1":12,"CustomerNumber":3334,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"urkwal","GeneralName":"-                                       , Mevr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":-1,"PostalStreet":"van bemmelstraat","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":72,"InvoiceStreet":"van bemmelstraat","DeliveryZipCode":"3818PE","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"NEDERLAND","PostalZipCode":"3818PE","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"van bemmelstraat 72","VisitZipCode":"3818PE","PostalAddress":"van bemmelstraat 72","CustomerTypeId":75,"DeliveryStreet":"van bemmelstraat","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:21:18.41","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"van bemmelstraat 72","LanguageId":-1,"VisitAddress":"van bemmelstraat 72","LastName":"-","InvoiceZipCode":"3818PE","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":72,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)33-4328310","DeliveryCity":"ALMERE","ItemId":273708,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":72,"VisitNumberPart1":72,"CustomerNumber":3383,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"van bemmelstraat","GeneralName":"-                                       , Mevr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":-1,"PostalStreet":"hengelostraat","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":20,"InvoiceStreet":"hengelostraat","DeliveryZipCode":"1324GN","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"NEDERLAND","PostalZipCode":"1324GN","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"hengelostraat 20","VisitZipCode":"1324GN","PostalAddress":"hengelostraat 20","CustomerTypeId":75,"DeliveryStreet":"hengelostraat","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:20:32.72","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"hengelostraat 20","LanguageId":-1,"VisitAddress":"hengelostraat 20","LastName":"-","InvoiceZipCode":"1324GN","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":20,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)6-12942407","DeliveryCity":"ALMERE","ItemId":273438,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":20,"VisitNumberPart1":20,"CustomerNumber":3113,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"hengelostraat","GeneralName":"-                                       , Mevr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":18,"SaleConfirmationEmailAddressId":89837,"PostalStreet":"boetijn","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":18,"SupplierId":-1,"InvoiceNumberPart1":110,"InvoiceStreet":"boetijn","DefaultEmailAddress":"jigitsoy5@hotmail.com","DeliveryZipCode":"1319CS","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"MEXICO","PostalZipCode":"1319CS","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"MEXICO","InvoiceAddress":"boetijn 110","VisitZipCode":"1319CS","PostalAddress":"boetijn 110","CustomerTypeId":75,"DeliveryStreet":"boetijn","CreatedByUserId":3105,"DeliveryCountry":"MEXICO","PostalCountry":"MEXICO","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:21:02.04","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":18,"DeliveryAddress":"boetijn 110","LanguageId":-1,"VisitAddress":"boetijn 110","LastName":"-","InvoiceZipCode":"1319CS","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":110,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":18,"PhoneNumber":"+31(0)6-45260316","DeliveryCity":"ALMERE","ItemId":273595,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":110,"VisitNumberPart1":110,"CustomerNumber":3270,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"boetijn","GeneralName":"-                                       , Mevr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":90338,"PostalStreet":"j.caltranestraat","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":19,"InvoiceStreet":"j.caltranestraat","DefaultEmailAddress":"rikaadrichem@kpnmail.nl","DeliveryZipCode":"1311SH","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"NEDERLAND","PostalZipCode":"1311SH","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"j.caltranestraat 19","VisitZipCode":"1311SH","PostalAddress":"j.caltranestraat 19","CustomerTypeId":75,"DeliveryStreet":"j.caltranestraat","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:22:45.713","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"j.caltranestraat 19","LanguageId":-1,"VisitAddress":"j.caltranestraat 19","LastName":"-","InvoiceZipCode":"1311SH","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":19,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)6-29538328","DeliveryCity":"ALMERE","ItemId":274223,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":19,"VisitNumberPart1":19,"CustomerNumber":3898,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"j.caltranestraat","GeneralName":"-                                       , Mevr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":-1,"PostalStreet":"fellinilaan","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":85,"InvoiceStreet":"fellinilaan","DeliveryZipCode":"1325SG","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"NEDERLAND","PostalZipCode":"1325SG","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"fellinilaan 85","VisitZipCode":"1325SG","PostalAddress":"fellinilaan 85","CustomerTypeId":75,"DeliveryStreet":"fellinilaan","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:23:05.027","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"fellinilaan 85","LanguageId":-1,"VisitAddress":"fellinilaan 85","LastName":"-","InvoiceZipCode":"1325SG","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":85,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)36-5313220","DeliveryCity":"ALMERE","ItemId":274318,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":85,"VisitNumberPart1":85,"CustomerNumber":3993,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"fellinilaan","GeneralName":"-                                       , Mevr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":90500,"PostalStreet":"cinemadreef","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":42,"InvoiceStreet":"cinemadreef","DefaultEmailAddress":"yildizguler101@hotmail.com","DeliveryZipCode":"1325EM","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"NEDERLAND","PostalZipCode":"1325EM","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"cinemadreef 42","VisitZipCode":"1325EM","PostalAddress":"cinemadreef 42","CustomerTypeId":75,"DeliveryStreet":"cinemadreef","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:23:18.363","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"cinemadreef 42","LanguageId":-1,"VisitAddress":"cinemadreef 42","LastName":"-","InvoiceZipCode":"1325EM","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":42,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)6-43840702","DeliveryCity":"ALMERE","ItemId":274413,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":42,"VisitNumberPart1":42,"CustomerNumber":4088,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"cinemadreef","GeneralName":"-                                       , Mevr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":-1,"PostalStreet":"suurhoffstraat","SearchText":"-.","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":45,"InvoiceStreet":"suurhoffstraat","DeliveryZipCode":"1314NR","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"NEDERLAND","PostalZipCode":"1314NR","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"suurhoffstraat 45","VisitZipCode":"1314NR","PostalAddress":"suurhoffstraat 45","CustomerTypeId":75,"DeliveryStreet":"suurhoffstraat","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:22:35.613","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"suurhoffstraat 45","LanguageId":-1,"VisitAddress":"suurhoffstraat 45","LastName":"-","InvoiceZipCode":"1314NR","Initials":"-.","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":45,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)6-54698906","DeliveryCity":"ALMERE","ItemId":274156,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":45,"VisitNumberPart1":45,"CustomerNumber":3831,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"suurhoffstraat","GeneralName":"-                                       , Mevr -."}]},"xmlns":"http://retail3000.net/Retail3000Webservice/WebserviceCustomerComponents"}
     */

    @SerializedName("GetCustomersResponse")
    private GetCustomersResponseBean GetCustomersResponse;

    public GetCustomersResponseBean getGetCustomersResponse() {
        return GetCustomersResponse;
    }

    public void setGetCustomersResponse(GetCustomersResponseBean GetCustomersResponse) {
        this.GetCustomersResponse = GetCustomersResponse;
    }

    public static class GetCustomersResponseBean {
        /**
         * GetCustomersResult : {"ViewCustomerInfo":[{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":-1,"SaleConfirmationEmailAddressId":89880,"SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":-1,"SupplierId":-1,"InvoiceNumberPart1":-1,"DefaultEmailAddress":"barriluengo.e@kpnplanet.nl","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":-1,"DateOfBirth":"0001-01-01T00:00:00","CustomerTypeId":75,"CreatedByUserId":3105,"LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:21:09.713","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":-1,"LanguageId":-1,"LastName":"-","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":-1,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":-1,"PhoneNumber":"+31(0)36-5498490","ItemId":273649,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":-1,"VisitNumberPart1":-1,"CustomerNumber":3324,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"GeneralName":"-","PostalStreet":"baroniestraat","InvoiceStreet":"baroniestraat","DeliveryZipCode":"1333TH","VisitCountry":"NEDERLAND","PostalZipCode":"1333TH","InvoiceCountry":"NEDERLAND","InvoiceAddress":"baroniestraat 19","VisitZipCode":"1333TH","PostalAddress":"baroniestraat 19","DeliveryStreet":"baroniestraat","DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","DeliveryAddress":"baroniestraat 19","VisitAddress":"baroniestraat 19","InvoiceZipCode":"1333TH","DeliveryCity":"ALMERE","InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"baroniestraat","Initials":"-."},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":89503,"PostalStreet":"baroniestraat","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":19,"InvoiceStreet":"baroniestraat","DefaultEmailAddress":"lucky4anja@hotmail.com","DeliveryZipCode":"1333TH","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":1,"VisitCountry":"NEDERLAND","PostalZipCode":"1333TH","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"baroniestraat 19","VisitZipCode":"1333TH","PostalAddress":"baroniestraat 19","CustomerTypeId":75,"DeliveryStreet":"baroniestraat","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:19:41.647","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"baroniestraat 19","LanguageId":-1,"VisitAddress":"baroniestraat 19","LastName":"-","InvoiceZipCode":"1333TH","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":19,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)36-5327626","DeliveryCity":"ALMERE","ItemId":273176,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":19,"VisitNumberPart1":19,"CustomerNumber":2851,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"baroniestraat","GeneralName":"-                                       , Dhr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":89889,"PostalStreet":"urkwal","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":12,"InvoiceStreet":"urkwal","DefaultEmailAddress":"cisea1@hotmail.com","DeliveryZipCode":"1324HM","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"NEDERLAND","PostalZipCode":"1324HM","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"urkwal 12","VisitZipCode":"1324HM","PostalAddress":"urkwal 12","CustomerTypeId":75,"DeliveryStreet":"urkwal","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:21:10.963","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"urkwal 12","LanguageId":-1,"VisitAddress":"urkwal 12","LastName":"-","InvoiceZipCode":"1324HM","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":12,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)36-5319250","DeliveryCity":"ALMERE","ItemId":273659,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":12,"VisitNumberPart1":12,"CustomerNumber":3334,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"urkwal","GeneralName":"-                                       , Mevr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":-1,"PostalStreet":"van bemmelstraat","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":72,"InvoiceStreet":"van bemmelstraat","DeliveryZipCode":"3818PE","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"NEDERLAND","PostalZipCode":"3818PE","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"van bemmelstraat 72","VisitZipCode":"3818PE","PostalAddress":"van bemmelstraat 72","CustomerTypeId":75,"DeliveryStreet":"van bemmelstraat","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:21:18.41","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"van bemmelstraat 72","LanguageId":-1,"VisitAddress":"van bemmelstraat 72","LastName":"-","InvoiceZipCode":"3818PE","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":72,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)33-4328310","DeliveryCity":"ALMERE","ItemId":273708,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":72,"VisitNumberPart1":72,"CustomerNumber":3383,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"van bemmelstraat","GeneralName":"-                                       , Mevr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":-1,"PostalStreet":"hengelostraat","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":20,"InvoiceStreet":"hengelostraat","DeliveryZipCode":"1324GN","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"NEDERLAND","PostalZipCode":"1324GN","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"hengelostraat 20","VisitZipCode":"1324GN","PostalAddress":"hengelostraat 20","CustomerTypeId":75,"DeliveryStreet":"hengelostraat","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:20:32.72","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"hengelostraat 20","LanguageId":-1,"VisitAddress":"hengelostraat 20","LastName":"-","InvoiceZipCode":"1324GN","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":20,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)6-12942407","DeliveryCity":"ALMERE","ItemId":273438,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":20,"VisitNumberPart1":20,"CustomerNumber":3113,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"hengelostraat","GeneralName":"-                                       , Mevr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":18,"SaleConfirmationEmailAddressId":89837,"PostalStreet":"boetijn","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":18,"SupplierId":-1,"InvoiceNumberPart1":110,"InvoiceStreet":"boetijn","DefaultEmailAddress":"jigitsoy5@hotmail.com","DeliveryZipCode":"1319CS","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"MEXICO","PostalZipCode":"1319CS","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"MEXICO","InvoiceAddress":"boetijn 110","VisitZipCode":"1319CS","PostalAddress":"boetijn 110","CustomerTypeId":75,"DeliveryStreet":"boetijn","CreatedByUserId":3105,"DeliveryCountry":"MEXICO","PostalCountry":"MEXICO","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:21:02.04","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":18,"DeliveryAddress":"boetijn 110","LanguageId":-1,"VisitAddress":"boetijn 110","LastName":"-","InvoiceZipCode":"1319CS","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":110,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":18,"PhoneNumber":"+31(0)6-45260316","DeliveryCity":"ALMERE","ItemId":273595,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":110,"VisitNumberPart1":110,"CustomerNumber":3270,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"boetijn","GeneralName":"-                                       , Mevr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":90338,"PostalStreet":"j.caltranestraat","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":19,"InvoiceStreet":"j.caltranestraat","DefaultEmailAddress":"rikaadrichem@kpnmail.nl","DeliveryZipCode":"1311SH","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"NEDERLAND","PostalZipCode":"1311SH","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"j.caltranestraat 19","VisitZipCode":"1311SH","PostalAddress":"j.caltranestraat 19","CustomerTypeId":75,"DeliveryStreet":"j.caltranestraat","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:22:45.713","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"j.caltranestraat 19","LanguageId":-1,"VisitAddress":"j.caltranestraat 19","LastName":"-","InvoiceZipCode":"1311SH","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":19,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)6-29538328","DeliveryCity":"ALMERE","ItemId":274223,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":19,"VisitNumberPart1":19,"CustomerNumber":3898,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"j.caltranestraat","GeneralName":"-                                       , Mevr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":-1,"PostalStreet":"fellinilaan","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":85,"InvoiceStreet":"fellinilaan","DeliveryZipCode":"1325SG","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"NEDERLAND","PostalZipCode":"1325SG","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"fellinilaan 85","VisitZipCode":"1325SG","PostalAddress":"fellinilaan 85","CustomerTypeId":75,"DeliveryStreet":"fellinilaan","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:23:05.027","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"fellinilaan 85","LanguageId":-1,"VisitAddress":"fellinilaan 85","LastName":"-","InvoiceZipCode":"1325SG","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":85,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)36-5313220","DeliveryCity":"ALMERE","ItemId":274318,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":85,"VisitNumberPart1":85,"CustomerNumber":3993,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"fellinilaan","GeneralName":"-                                       , Mevr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":90500,"PostalStreet":"cinemadreef","SearchText":"-","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":42,"InvoiceStreet":"cinemadreef","DefaultEmailAddress":"yildizguler101@hotmail.com","DeliveryZipCode":"1325EM","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"NEDERLAND","PostalZipCode":"1325EM","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"cinemadreef 42","VisitZipCode":"1325EM","PostalAddress":"cinemadreef 42","CustomerTypeId":75,"DeliveryStreet":"cinemadreef","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:23:18.363","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"cinemadreef 42","LanguageId":-1,"VisitAddress":"cinemadreef 42","LastName":"-","InvoiceZipCode":"1325EM","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":42,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)6-43840702","DeliveryCity":"ALMERE","ItemId":274413,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":42,"VisitNumberPart1":42,"CustomerNumber":4088,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"cinemadreef","GeneralName":"-                                       , Mevr"},{"IsDefaultDebtor":false,"DiscountAgreementId":-1,"InvoiceCountryId":4,"SaleConfirmationEmailAddressId":-1,"PostalStreet":"suurhoffstraat","SearchText":"-.","PriceAgreementId":-1,"DeliveryCountryId":4,"SupplierId":-1,"InvoiceNumberPart1":45,"InvoiceStreet":"suurhoffstraat","DeliveryZipCode":"1314NR","LastModifiedDateTime":"2016-02-29T21:37:33.28","SalutationId":2,"VisitCountry":"NEDERLAND","PostalZipCode":"1314NR","DateOfBirth":"0001-01-01T00:00:00","InvoiceCountry":"NEDERLAND","InvoiceAddress":"suurhoffstraat 45","VisitZipCode":"1314NR","PostalAddress":"suurhoffstraat 45","CustomerTypeId":75,"DeliveryStreet":"suurhoffstraat","CreatedByUserId":3105,"DeliveryCountry":"NEDERLAND","PostalCountry":"NEDERLAND","VisitCity":"ALMERE","LastModifiedByUserId":3105,"CreatedDateTime":"2013-02-19T17:22:35.613","GS1EdiCustomerPartyNumber":-1,"IsCancelled":false,"VisitCountryId":4,"DeliveryAddress":"suurhoffstraat 45","LanguageId":-1,"VisitAddress":"suurhoffstraat 45","LastName":"-","InvoiceZipCode":"1314NR","Initials":"-.","Deceased":false,"SaleTypeId":-1,"DebtorId":-1,"PostalNumberPart1":45,"SupplierNumber":-1,"CompanyId":115,"PostalCountryId":4,"PhoneNumber":"+31(0)6-54698906","DeliveryCity":"ALMERE","ItemId":274156,"IsExportAllowed":false,"OrganizationId":-1,"IsCompany":false,"DeliveryNumberPart1":45,"VisitNumberPart1":45,"CustomerNumber":3831,"GS1EdiPartyNumber":-1,"SendSaleConfirmation":true,"Gender":"NotSpecified","DebtorNumber":-1,"IsDefaultSupplier":false,"InvoiceCity":"ALMERE","PostalCity":"ALMERE","VisitStreet":"suurhoffstraat","GeneralName":"-                                       , Mevr -."}]}
         * xmlns : http://retail3000.net/Retail3000Webservice/WebserviceCustomerComponents
         */

        @SerializedName("GetCustomersResult")
        private GetCustomersResultBean GetCustomersResult;
        @SerializedName("xmlns")
        private String xmlns;

        public GetCustomersResultBean getGetCustomersResult() {
            return GetCustomersResult;
        }

        public void setGetCustomersResult(GetCustomersResultBean GetCustomersResult) {
            this.GetCustomersResult = GetCustomersResult;
        }

        public String getXmlns() {
            return xmlns;
        }

        public void setXmlns(String xmlns) {
            this.xmlns = xmlns;
        }

        public static class GetCustomersResultBean {
            @SerializedName("ViewCustomerInfo")
            private List<ViewCustomerInfoBean> ViewCustomerInfo;

            public List<ViewCustomerInfoBean> getViewCustomerInfo() {
                return ViewCustomerInfo;
            }

            public void setViewCustomerInfo(List<ViewCustomerInfoBean> ViewCustomerInfo) {
                this.ViewCustomerInfo = ViewCustomerInfo;
            }

            public static class ViewCustomerInfoBean {
                /**
                 * IsDefaultDebtor : false
                 * DiscountAgreementId : -1
                 * InvoiceCountryId : -1
                 * SaleConfirmationEmailAddressId : 89880
                 * SearchText : -
                 * PriceAgreementId : -1
                 * DeliveryCountryId : -1
                 * SupplierId : -1
                 * InvoiceNumberPart1 : -1
                 * DefaultEmailAddress : barriluengo.e@kpnplanet.nl
                 * LastModifiedDateTime : 2016-02-29T21:37:33.28
                 * SalutationId : -1
                 * DateOfBirth : 0001-01-01T00:00:00
                 * CustomerTypeId : 75
                 * CreatedByUserId : 3105
                 * LastModifiedByUserId : 3105
                 * CreatedDateTime : 2013-02-19T17:21:09.713
                 * GS1EdiCustomerPartyNumber : -1
                 * IsCancelled : false
                 * VisitCountryId : -1
                 * LanguageId : -1
                 * LastName : -
                 * Deceased : false
                 * SaleTypeId : -1
                 * DebtorId : -1
                 * PostalNumberPart1 : -1
                 * SupplierNumber : -1
                 * CompanyId : 115
                 * PostalCountryId : -1
                 * PhoneNumber : +31(0)36-5498490
                 * ItemId : 273649
                 * IsExportAllowed : false
                 * OrganizationId : -1
                 * IsCompany : false
                 * DeliveryNumberPart1 : -1
                 * VisitNumberPart1 : -1
                 * CustomerNumber : 3324
                 * GS1EdiPartyNumber : -1
                 * SendSaleConfirmation : true
                 * Gender : NotSpecified
                 * DebtorNumber : -1
                 * IsDefaultSupplier : false
                 * GeneralName : -
                 * PostalStreet : baroniestraat
                 * InvoiceStreet : baroniestraat
                 * DeliveryZipCode : 1333TH
                 * VisitCountry : NEDERLAND
                 * PostalZipCode : 1333TH
                 * InvoiceCountry : NEDERLAND
                 * InvoiceAddress : baroniestraat 19
                 * VisitZipCode : 1333TH
                 * PostalAddress : baroniestraat 19
                 * DeliveryStreet : baroniestraat
                 * DeliveryCountry : NEDERLAND
                 * PostalCountry : NEDERLAND
                 * VisitCity : ALMERE
                 * DeliveryAddress : baroniestraat 19
                 * VisitAddress : baroniestraat 19
                 * InvoiceZipCode : 1333TH
                 * DeliveryCity : ALMERE
                 * InvoiceCity : ALMERE
                 * PostalCity : ALMERE
                 * VisitStreet : baroniestraat
                 * Initials : -.
                 */

                @SerializedName("IsDefaultDebtor")
                private boolean IsDefaultDebtor;
                @SerializedName("DiscountAgreementId")
                private int DiscountAgreementId;
                @SerializedName("InvoiceCountryId")
                private int InvoiceCountryId;
                @SerializedName("SaleConfirmationEmailAddressId")
                private int SaleConfirmationEmailAddressId;
                @SerializedName("SearchText")
                private String SearchText;
                @SerializedName("PriceAgreementId")
                private int PriceAgreementId;
                @SerializedName("DeliveryCountryId")
                private int DeliveryCountryId;
                @SerializedName("SupplierId")
                private int SupplierId;
                @SerializedName("InvoiceNumberPart1")
                private int InvoiceNumberPart1;
                @SerializedName("DefaultEmailAddress")
                private String DefaultEmailAddress;
                @SerializedName("LastModifiedDateTime")
                private String LastModifiedDateTime;
                @SerializedName("SalutationId")
                private int SalutationId;
                @SerializedName("DateOfBirth")
                private String DateOfBirth;
                @SerializedName("CustomerTypeId")
                private int CustomerTypeId;
                @SerializedName("CreatedByUserId")
                private int CreatedByUserId;
                @SerializedName("LastModifiedByUserId")
                private int LastModifiedByUserId;
                @SerializedName("CreatedDateTime")
                private String CreatedDateTime;
                @SerializedName("GS1EdiCustomerPartyNumber")
                private int GS1EdiCustomerPartyNumber;
                @SerializedName("IsCancelled")
                private boolean IsCancelled;
                @SerializedName("VisitCountryId")
                private int VisitCountryId;
                @SerializedName("LanguageId")
                private int LanguageId;
                @SerializedName("LastName")
                private String LastName;
                @SerializedName("Deceased")
                private boolean Deceased;
                @SerializedName("SaleTypeId")
                private int SaleTypeId;
                @SerializedName("DebtorId")
                private int DebtorId;
                @SerializedName("PostalNumberPart1")
                private int PostalNumberPart1;
                @SerializedName("SupplierNumber")
                private int SupplierNumber;
                @SerializedName("CompanyId")
                private int CompanyId;
                @SerializedName("PostalCountryId")
                private int PostalCountryId;
                @SerializedName("PhoneNumber")
                private String PhoneNumber;
                @SerializedName("ItemId")
                private int ItemId;
                @SerializedName("IsExportAllowed")
                private boolean IsExportAllowed;
                @SerializedName("OrganizationId")
                private int OrganizationId;
                @SerializedName("IsCompany")
                private boolean IsCompany;
                @SerializedName("DeliveryNumberPart1")
                private int DeliveryNumberPart1;
                @SerializedName("VisitNumberPart1")
                private int VisitNumberPart1;
                @SerializedName("CustomerNumber")
                private int CustomerNumber;
                @SerializedName("GS1EdiPartyNumber")
                private int GS1EdiPartyNumber;
                @SerializedName("SendSaleConfirmation")
                private boolean SendSaleConfirmation;
                @SerializedName("Gender")
                private String Gender;
                @SerializedName("DebtorNumber")
                private int DebtorNumber;
                @SerializedName("IsDefaultSupplier")
                private boolean IsDefaultSupplier;
                @SerializedName("GeneralName")
                private String GeneralName;
                @SerializedName("PostalStreet")
                private String PostalStreet;
                @SerializedName("InvoiceStreet")
                private String InvoiceStreet;
                @SerializedName("DeliveryZipCode")
                private String DeliveryZipCode;
                @SerializedName("VisitCountry")
                private String VisitCountry;
                @SerializedName("PostalZipCode")
                private String PostalZipCode;
                @SerializedName("InvoiceCountry")
                private String InvoiceCountry;
                @SerializedName("InvoiceAddress")
                private String InvoiceAddress;
                @SerializedName("VisitZipCode")
                private String VisitZipCode;
                @SerializedName("PostalAddress")
                private String PostalAddress;
                @SerializedName("DeliveryStreet")
                private String DeliveryStreet;
                @SerializedName("DeliveryCountry")
                private String DeliveryCountry;
                @SerializedName("PostalCountry")
                private String PostalCountry;
                @SerializedName("VisitCity")
                private String VisitCity;
                @SerializedName("DeliveryAddress")
                private String DeliveryAddress;
                @SerializedName("VisitAddress")
                private String VisitAddress;
                @SerializedName("InvoiceZipCode")
                private String InvoiceZipCode;
                @SerializedName("DeliveryCity")
                private String DeliveryCity;
                @SerializedName("InvoiceCity")
                private String InvoiceCity;
                @SerializedName("PostalCity")
                private String PostalCity;
                @SerializedName("VisitStreet")
                private String VisitStreet;
                @SerializedName("Initials")
                private String Initials;

                public boolean isSelected() {
                    return IsSelected;
                }

                public void setSelected(boolean selected) {
                    IsSelected = selected;
                }

                private  boolean IsSelected;

                public boolean isIsDefaultDebtor() {
                    return IsDefaultDebtor;
                }

                public void setIsDefaultDebtor(boolean IsDefaultDebtor) {
                    this.IsDefaultDebtor = IsDefaultDebtor;
                }

                public int getDiscountAgreementId() {
                    return DiscountAgreementId;
                }

                public void setDiscountAgreementId(int DiscountAgreementId) {
                    this.DiscountAgreementId = DiscountAgreementId;
                }

                public int getInvoiceCountryId() {
                    return InvoiceCountryId;
                }

                public void setInvoiceCountryId(int InvoiceCountryId) {
                    this.InvoiceCountryId = InvoiceCountryId;
                }

                public int getSaleConfirmationEmailAddressId() {
                    return SaleConfirmationEmailAddressId;
                }

                public void setSaleConfirmationEmailAddressId(int SaleConfirmationEmailAddressId) {
                    this.SaleConfirmationEmailAddressId = SaleConfirmationEmailAddressId;
                }

                public String getSearchText() {
                    return SearchText;
                }

                public void setSearchText(String SearchText) {
                    this.SearchText = SearchText;
                }

                public int getPriceAgreementId() {
                    return PriceAgreementId;
                }

                public void setPriceAgreementId(int PriceAgreementId) {
                    this.PriceAgreementId = PriceAgreementId;
                }

                public int getDeliveryCountryId() {
                    return DeliveryCountryId;
                }

                public void setDeliveryCountryId(int DeliveryCountryId) {
                    this.DeliveryCountryId = DeliveryCountryId;
                }

                public int getSupplierId() {
                    return SupplierId;
                }

                public void setSupplierId(int SupplierId) {
                    this.SupplierId = SupplierId;
                }

                public int getInvoiceNumberPart1() {
                    return InvoiceNumberPart1;
                }

                public void setInvoiceNumberPart1(int InvoiceNumberPart1) {
                    this.InvoiceNumberPart1 = InvoiceNumberPart1;
                }

                public String getDefaultEmailAddress() {
                    return DefaultEmailAddress;
                }

                public void setDefaultEmailAddress(String DefaultEmailAddress) {
                    this.DefaultEmailAddress = DefaultEmailAddress;
                }

                public String getLastModifiedDateTime() {
                    return LastModifiedDateTime;
                }

                public void setLastModifiedDateTime(String LastModifiedDateTime) {
                    this.LastModifiedDateTime = LastModifiedDateTime;
                }

                public int getSalutationId() {
                    return SalutationId;
                }

                public void setSalutationId(int SalutationId) {
                    this.SalutationId = SalutationId;
                }

                public String getDateOfBirth() {
                    return DateOfBirth;
                }

                public void setDateOfBirth(String DateOfBirth) {
                    this.DateOfBirth = DateOfBirth;
                }

                public int getCustomerTypeId() {
                    return CustomerTypeId;
                }

                public void setCustomerTypeId(int CustomerTypeId) {
                    this.CustomerTypeId = CustomerTypeId;
                }

                public int getCreatedByUserId() {
                    return CreatedByUserId;
                }

                public void setCreatedByUserId(int CreatedByUserId) {
                    this.CreatedByUserId = CreatedByUserId;
                }

                public int getLastModifiedByUserId() {
                    return LastModifiedByUserId;
                }

                public void setLastModifiedByUserId(int LastModifiedByUserId) {
                    this.LastModifiedByUserId = LastModifiedByUserId;
                }

                public String getCreatedDateTime() {
                    return CreatedDateTime;
                }

                public void setCreatedDateTime(String CreatedDateTime) {
                    this.CreatedDateTime = CreatedDateTime;
                }

                public int getGS1EdiCustomerPartyNumber() {
                    return GS1EdiCustomerPartyNumber;
                }

                public void setGS1EdiCustomerPartyNumber(int GS1EdiCustomerPartyNumber) {
                    this.GS1EdiCustomerPartyNumber = GS1EdiCustomerPartyNumber;
                }

                public boolean isIsCancelled() {
                    return IsCancelled;
                }

                public void setIsCancelled(boolean IsCancelled) {
                    this.IsCancelled = IsCancelled;
                }

                public int getVisitCountryId() {
                    return VisitCountryId;
                }

                public void setVisitCountryId(int VisitCountryId) {
                    this.VisitCountryId = VisitCountryId;
                }

                public int getLanguageId() {
                    return LanguageId;
                }

                public void setLanguageId(int LanguageId) {
                    this.LanguageId = LanguageId;
                }

                public String getLastName() {
                    return LastName;
                }

                public void setLastName(String LastName) {
                    this.LastName = LastName;
                }

                public boolean isDeceased() {
                    return Deceased;
                }

                public void setDeceased(boolean Deceased) {
                    this.Deceased = Deceased;
                }

                public int getSaleTypeId() {
                    return SaleTypeId;
                }

                public void setSaleTypeId(int SaleTypeId) {
                    this.SaleTypeId = SaleTypeId;
                }

                public int getDebtorId() {
                    return DebtorId;
                }

                public void setDebtorId(int DebtorId) {
                    this.DebtorId = DebtorId;
                }

                public int getPostalNumberPart1() {
                    return PostalNumberPart1;
                }

                public void setPostalNumberPart1(int PostalNumberPart1) {
                    this.PostalNumberPart1 = PostalNumberPart1;
                }

                public int getSupplierNumber() {
                    return SupplierNumber;
                }

                public void setSupplierNumber(int SupplierNumber) {
                    this.SupplierNumber = SupplierNumber;
                }

                public int getCompanyId() {
                    return CompanyId;
                }

                public void setCompanyId(int CompanyId) {
                    this.CompanyId = CompanyId;
                }

                public int getPostalCountryId() {
                    return PostalCountryId;
                }

                public void setPostalCountryId(int PostalCountryId) {
                    this.PostalCountryId = PostalCountryId;
                }

                public String getPhoneNumber() {
                    return PhoneNumber;
                }

                public void setPhoneNumber(String PhoneNumber) {
                    this.PhoneNumber = PhoneNumber;
                }

                public int getItemId() {
                    return ItemId;
                }

                public void setItemId(int ItemId) {
                    this.ItemId = ItemId;
                }

                public boolean isIsExportAllowed() {
                    return IsExportAllowed;
                }

                public void setIsExportAllowed(boolean IsExportAllowed) {
                    this.IsExportAllowed = IsExportAllowed;
                }

                public int getOrganizationId() {
                    return OrganizationId;
                }

                public void setOrganizationId(int OrganizationId) {
                    this.OrganizationId = OrganizationId;
                }

                public boolean isIsCompany() {
                    return IsCompany;
                }

                public void setIsCompany(boolean IsCompany) {
                    this.IsCompany = IsCompany;
                }

                public int getDeliveryNumberPart1() {
                    return DeliveryNumberPart1;
                }

                public void setDeliveryNumberPart1(int DeliveryNumberPart1) {
                    this.DeliveryNumberPart1 = DeliveryNumberPart1;
                }

                public int getVisitNumberPart1() {
                    return VisitNumberPart1;
                }

                public void setVisitNumberPart1(int VisitNumberPart1) {
                    this.VisitNumberPart1 = VisitNumberPart1;
                }

                public int getCustomerNumber() {
                    return CustomerNumber;
                }

                public void setCustomerNumber(int CustomerNumber) {
                    this.CustomerNumber = CustomerNumber;
                }

                public int getGS1EdiPartyNumber() {
                    return GS1EdiPartyNumber;
                }

                public void setGS1EdiPartyNumber(int GS1EdiPartyNumber) {
                    this.GS1EdiPartyNumber = GS1EdiPartyNumber;
                }

                public boolean isSendSaleConfirmation() {
                    return SendSaleConfirmation;
                }

                public void setSendSaleConfirmation(boolean SendSaleConfirmation) {
                    this.SendSaleConfirmation = SendSaleConfirmation;
                }

                public String getGender() {
                    return Gender;
                }

                public void setGender(String Gender) {
                    this.Gender = Gender;
                }

                public int getDebtorNumber() {
                    return DebtorNumber;
                }

                public void setDebtorNumber(int DebtorNumber) {
                    this.DebtorNumber = DebtorNumber;
                }

                public boolean isIsDefaultSupplier() {
                    return IsDefaultSupplier;
                }

                public void setIsDefaultSupplier(boolean IsDefaultSupplier) {
                    this.IsDefaultSupplier = IsDefaultSupplier;
                }

                public String getGeneralName() {
                    return GeneralName;
                }

                public void setGeneralName(String GeneralName) {
                    this.GeneralName = GeneralName;
                }

                public String getPostalStreet() {
                    return PostalStreet;
                }

                public void setPostalStreet(String PostalStreet) {
                    this.PostalStreet = PostalStreet;
                }

                public String getInvoiceStreet() {
                    return InvoiceStreet;
                }

                public void setInvoiceStreet(String InvoiceStreet) {
                    this.InvoiceStreet = InvoiceStreet;
                }

                public String getDeliveryZipCode() {
                    return DeliveryZipCode;
                }

                public void setDeliveryZipCode(String DeliveryZipCode) {
                    this.DeliveryZipCode = DeliveryZipCode;
                }

                public String getVisitCountry() {
                    return VisitCountry;
                }

                public void setVisitCountry(String VisitCountry) {
                    this.VisitCountry = VisitCountry;
                }

                public String getPostalZipCode() {
                    return PostalZipCode;
                }

                public void setPostalZipCode(String PostalZipCode) {
                    this.PostalZipCode = PostalZipCode;
                }

                public String getInvoiceCountry() {
                    return InvoiceCountry;
                }

                public void setInvoiceCountry(String InvoiceCountry) {
                    this.InvoiceCountry = InvoiceCountry;
                }

                public String getInvoiceAddress() {
                    return InvoiceAddress;
                }

                public void setInvoiceAddress(String InvoiceAddress) {
                    this.InvoiceAddress = InvoiceAddress;
                }

                public String getVisitZipCode() {
                    return VisitZipCode;
                }

                public void setVisitZipCode(String VisitZipCode) {
                    this.VisitZipCode = VisitZipCode;
                }

                public String getPostalAddress() {
                    return PostalAddress;
                }

                public void setPostalAddress(String PostalAddress) {
                    this.PostalAddress = PostalAddress;
                }

                public String getDeliveryStreet() {
                    return DeliveryStreet;
                }

                public void setDeliveryStreet(String DeliveryStreet) {
                    this.DeliveryStreet = DeliveryStreet;
                }

                public String getDeliveryCountry() {
                    return DeliveryCountry;
                }

                public void setDeliveryCountry(String DeliveryCountry) {
                    this.DeliveryCountry = DeliveryCountry;
                }

                public String getPostalCountry() {
                    return PostalCountry;
                }

                public void setPostalCountry(String PostalCountry) {
                    this.PostalCountry = PostalCountry;
                }

                public String getVisitCity() {
                    return VisitCity;
                }

                public void setVisitCity(String VisitCity) {
                    this.VisitCity = VisitCity;
                }

                public String getDeliveryAddress() {
                    return DeliveryAddress;
                }

                public void setDeliveryAddress(String DeliveryAddress) {
                    this.DeliveryAddress = DeliveryAddress;
                }

                public String getVisitAddress() {
                    return VisitAddress;
                }

                public void setVisitAddress(String VisitAddress) {
                    this.VisitAddress = VisitAddress;
                }

                public String getInvoiceZipCode() {
                    return InvoiceZipCode;
                }

                public void setInvoiceZipCode(String InvoiceZipCode) {
                    this.InvoiceZipCode = InvoiceZipCode;
                }

                public String getDeliveryCity() {
                    return DeliveryCity;
                }

                public void setDeliveryCity(String DeliveryCity) {
                    this.DeliveryCity = DeliveryCity;
                }

                public String getInvoiceCity() {
                    return InvoiceCity;
                }

                public void setInvoiceCity(String InvoiceCity) {
                    this.InvoiceCity = InvoiceCity;
                }

                public String getPostalCity() {
                    return PostalCity;
                }

                public void setPostalCity(String PostalCity) {
                    this.PostalCity = PostalCity;
                }

                public String getVisitStreet() {
                    return VisitStreet;
                }

                public void setVisitStreet(String VisitStreet) {
                    this.VisitStreet = VisitStreet;
                }

                public String getInitials() {
                    return Initials;
                }

                public void setInitials(String Initials) {
                    this.Initials = Initials;
                }
            }
        }
    }
}

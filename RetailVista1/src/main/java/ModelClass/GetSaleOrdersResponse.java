package ModelClass;

import android.support.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Haresh on 7/16/2017.
 */

public class GetSaleOrdersResponse {

    /**
     * GetSaleOrdersResponse : {"GetSaleOrdersResult":{"ViewSaleOrderInfo":[{"UserId":3361,"StoreId":233,"DeliveryCustomerId":-1,"TotalNetPrice":1024.8,"LastModifiedDateTime":"2017-03-18T17:14:00.3","UserFullName":"Gina","DeliveryAddressId":-1,"DeliveryCustomerNumber":19372,"DeliveryCustomerName":"van der Linden, Mevr J","CostCenterId":-1,"ExportDateTime":"0001-01-01T00:00:00","StoreDescription":"Tuincentrum Almeer Plant","TotalPrepaymentRequestBalance":0,"OrderResponseDate":"0001-01-01T00:00:00","ScannerId":143,"TotalPrePaid":100,"UtmostDeliveryDate":"0001-01-01T00:00:00","SaleOrderClassId":32,"TotalPrePaidBalance":100,"CreatedByUserId":3361,"LastModifiedByUserId":3403,"CreatedDateTime":"2017-03-18T14:05:44.567","CustomerName":"van der Linden, Mevr J","OrderNumber":2462,"IsCancelled":false,"SaleOrderType":"NormalSaleOrder","TotalPrepaymentRequests":100,"CustomerId":450013,"ConversionId":-1,"WebshopId":-1,"TransportTypeDescription":"Bezorgen 14-18","PurchaseOrderId":-1,"DebtorId":-1,"PrintedDateTime":"2017-03-18T14:16:46.547","CompanyId":115,"CustomerContactId":-1,"ItemId":189647,"TotalWeightedNetPrice":1024.8,"IsRaise":false,"OrderStatus":"Final","InboundMessageNumber":-1,"SaleOrderClassDescription":"Winkel orders","TotalGrossPrice":1024.8,"ExpectedDeliveryDate":"2017-03-30T00:00:00","TransportTypeId":312,"CustomerNumber":19372,"PurchaseOrderNumber":-1,"InboundMessageId":-1,"SecureDiscounts":false,"IsVatFree":false,"ScannerNumber":1}]},"xmlns":"http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents"}
     */

    @SerializedName("GetSaleOrdersResponse")
    private GetSaleOrdersResponseBean GetSaleOrdersResponse;

    public GetSaleOrdersResponseBean getGetSaleOrdersResponse() {
        return GetSaleOrdersResponse;
    }

    public void setGetSaleOrdersResponse(GetSaleOrdersResponseBean GetSaleOrdersResponse) {
        this.GetSaleOrdersResponse = GetSaleOrdersResponse;
    }

    public static class GetSaleOrdersResponseBean {
        /**
         * GetSaleOrdersResult : {"ViewSaleOrderInfo":[{"UserId":3361,"StoreId":233,"DeliveryCustomerId":-1,"TotalNetPrice":1024.8,"LastModifiedDateTime":"2017-03-18T17:14:00.3","UserFullName":"Gina","DeliveryAddressId":-1,"DeliveryCustomerNumber":19372,"DeliveryCustomerName":"van der Linden, Mevr J","CostCenterId":-1,"ExportDateTime":"0001-01-01T00:00:00","StoreDescription":"Tuincentrum Almeer Plant","TotalPrepaymentRequestBalance":0,"OrderResponseDate":"0001-01-01T00:00:00","ScannerId":143,"TotalPrePaid":100,"UtmostDeliveryDate":"0001-01-01T00:00:00","SaleOrderClassId":32,"TotalPrePaidBalance":100,"CreatedByUserId":3361,"LastModifiedByUserId":3403,"CreatedDateTime":"2017-03-18T14:05:44.567","CustomerName":"van der Linden, Mevr J","OrderNumber":2462,"IsCancelled":false,"SaleOrderType":"NormalSaleOrder","TotalPrepaymentRequests":100,"CustomerId":450013,"ConversionId":-1,"WebshopId":-1,"TransportTypeDescription":"Bezorgen 14-18","PurchaseOrderId":-1,"DebtorId":-1,"PrintedDateTime":"2017-03-18T14:16:46.547","CompanyId":115,"CustomerContactId":-1,"ItemId":189647,"TotalWeightedNetPrice":1024.8,"IsRaise":false,"OrderStatus":"Final","InboundMessageNumber":-1,"SaleOrderClassDescription":"Winkel orders","TotalGrossPrice":1024.8,"ExpectedDeliveryDate":"2017-03-30T00:00:00","TransportTypeId":312,"CustomerNumber":19372,"PurchaseOrderNumber":-1,"InboundMessageId":-1,"SecureDiscounts":false,"IsVatFree":false,"ScannerNumber":1}]}
         * xmlns : http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents
         */

        @SerializedName("GetSaleOrdersResult")
        private GetSaleOrdersResultBean GetSaleOrdersResult;
        @SerializedName("xmlns")
        private String xmlns;

        public GetSaleOrdersResultBean getGetSaleOrdersResult() {
            return GetSaleOrdersResult;
        }

        public void setGetSaleOrdersResult(GetSaleOrdersResultBean GetSaleOrdersResult) {
            this.GetSaleOrdersResult = GetSaleOrdersResult;
        }

        public String getXmlns() {
            return xmlns;
        }

        public void setXmlns(String xmlns) {
            this.xmlns = xmlns;
        }

        public static class GetSaleOrdersResultBean {
            @SerializedName("ViewSaleOrderInfo")
            private List<ViewSaleOrderInfoBean> ViewSaleOrderInfo;

            public List<ViewSaleOrderInfoBean> getViewSaleOrderInfo() {
                return ViewSaleOrderInfo;
            }

            public void setViewSaleOrderInfo(List<ViewSaleOrderInfoBean> ViewSaleOrderInfo) {
                this.ViewSaleOrderInfo = ViewSaleOrderInfo;
            }

            public static class ViewSaleOrderInfoBean {
                /**
                 * UserId : 3361
                 * StoreId : 233
                 * DeliveryCustomerId : -1
                 * TotalNetPrice : 1024.8
                 * LastModifiedDateTime : 2017-03-18T17:14:00.3
                 * UserFullName : Gina
                 * DeliveryAddressId : -1
                 * DeliveryCustomerNumber : 19372
                 * DeliveryCustomerName : van der Linden, Mevr J
                 * CostCenterId : -1
                 * ExportDateTime : 0001-01-01T00:00:00
                 * StoreDescription : Tuincentrum Almeer Plant
                 * TotalPrepaymentRequestBalance : 0
                 * OrderResponseDate : 0001-01-01T00:00:00
                 * ScannerId : 143
                 * TotalPrePaid : 100
                 * UtmostDeliveryDate : 0001-01-01T00:00:00
                 * SaleOrderClassId : 32
                 * TotalPrePaidBalance : 100
                 * CreatedByUserId : 3361
                 * LastModifiedByUserId : 3403
                 * CreatedDateTime : 2017-03-18T14:05:44.567
                 * CustomerName : van der Linden, Mevr J
                 * OrderNumber : 2462
                 * IsCancelled : false
                 * SaleOrderType : NormalSaleOrder
                 * TotalPrepaymentRequests : 100
                 * CustomerId : 450013
                 * ConversionId : -1
                 * WebshopId : -1
                 * TransportTypeDescription : Bezorgen 14-18
                 * PurchaseOrderId : -1
                 * DebtorId : -1
                 * PrintedDateTime : 2017-03-18T14:16:46.547
                 * CompanyId : 115
                 * CustomerContactId : -1
                 * ItemId : 189647
                 * TotalWeightedNetPrice : 1024.8
                 * IsRaise : false
                 * OrderStatus : Final
                 * InboundMessageNumber : -1
                 * SaleOrderClassDescription : Winkel orders
                 * TotalGrossPrice : 1024.8
                 * ExpectedDeliveryDate : 2017-03-30T00:00:00
                 * TransportTypeId : 312
                 * CustomerNumber : 19372
                 * PurchaseOrderNumber : -1
                 * InboundMessageId : -1
                 * SecureDiscounts : false
                 * IsVatFree : false
                 * ScannerNumber : 1
                 */

                @SerializedName("UserId")
                private int UserId;
                @SerializedName("StoreId")
                private int StoreId;
                @SerializedName("DeliveryCustomerId")
                private int DeliveryCustomerId;
                @SerializedName("TotalNetPrice")
                private double TotalNetPrice;
                @SerializedName("LastModifiedDateTime")
                private String LastModifiedDateTime;
                @SerializedName("UserFullName")
                private String UserFullName;
                @SerializedName("DeliveryAddressId")
                private int DeliveryAddressId;
                @SerializedName("DeliveryCustomerNumber")
                private int DeliveryCustomerNumber;
                @SerializedName("DeliveryCustomerName")
                private String DeliveryCustomerName;
                @SerializedName("CostCenterId")
                private int CostCenterId;
                @SerializedName("ExportDateTime")
                private String ExportDateTime;
                @SerializedName("StoreDescription")
                private String StoreDescription;
                @SerializedName("TotalPrepaymentRequestBalance")
                private float TotalPrepaymentRequestBalance;
                @SerializedName("OrderResponseDate")
                private String OrderResponseDate;
                @SerializedName("ScannerId")
                private int ScannerId;
                @SerializedName("TotalPrePaid")
                private float TotalPrePaid;
                @SerializedName("UtmostDeliveryDate")
                private String UtmostDeliveryDate;
                @SerializedName("SaleOrderClassId")
                private int SaleOrderClassId;
                @SerializedName("TotalPrePaidBalance")
                private float TotalPrePaidBalance;
                @SerializedName("CreatedByUserId")
                private int CreatedByUserId;
                @SerializedName("LastModifiedByUserId")
                private int LastModifiedByUserId;
                @SerializedName("CreatedDateTime")
                private String CreatedDateTime;
                @SerializedName("CustomerName")
                private String CustomerName;
                @SerializedName("OrderNumber")
                private int OrderNumber;
                @SerializedName("IsCancelled")
                private boolean IsCancelled;
                @SerializedName("SaleOrderType")
                private String SaleOrderType;
                @SerializedName("TotalPrepaymentRequests")
                private float TotalPrepaymentRequests;
                @SerializedName("CustomerId")
                private int CustomerId;
                @SerializedName("ConversionId")
                private int ConversionId;
                @SerializedName("WebshopId")
                private int WebshopId;
                @SerializedName("TransportTypeDescription")
                private String TransportTypeDescription;
                @SerializedName("PurchaseOrderId")
                private int PurchaseOrderId;
                @SerializedName("DebtorId")
                private int DebtorId;
                @SerializedName("PrintedDateTime")
                private String PrintedDateTime;
                @SerializedName("CompanyId")
                private int CompanyId;
                @SerializedName("CustomerContactId")
                private int CustomerContactId;
                @SerializedName("ItemId")
                private int ItemId;
                @SerializedName("TotalWeightedNetPrice")
                private double TotalWeightedNetPrice;
                @SerializedName("IsRaise")
                private boolean IsRaise;
                @SerializedName("OrderStatus")
                private String OrderStatus;
                @SerializedName("InboundMessageNumber")
                private int InboundMessageNumber;
                @SerializedName("SaleOrderClassDescription")
                private String SaleOrderClassDescription;
                @SerializedName("TotalGrossPrice")
                @Nullable
                private double TotalGrossPrice;
                @SerializedName("ExpectedDeliveryDate")
                private String ExpectedDeliveryDate;
                @SerializedName("TransportTypeId")
                private int TransportTypeId;
                @SerializedName("CustomerNumber")
                private int CustomerNumber;
                @SerializedName("PurchaseOrderNumber")
                private int PurchaseOrderNumber;
                @SerializedName("InboundMessageId")
                private int InboundMessageId;
                @SerializedName("SecureDiscounts")
                private boolean SecureDiscounts;
                @SerializedName("IsVatFree")
                private boolean IsVatFree;
                @SerializedName("ScannerNumber")
                private int ScannerNumber;

                public int getUserId() {
                    return UserId;
                }

                public void setUserId(int UserId) {
                    this.UserId = UserId;
                }

                public int getStoreId() {
                    return StoreId;
                }

                public void setStoreId(int StoreId) {
                    this.StoreId = StoreId;
                }

                public int getDeliveryCustomerId() {
                    return DeliveryCustomerId;
                }

                public void setDeliveryCustomerId(int DeliveryCustomerId) {
                    this.DeliveryCustomerId = DeliveryCustomerId;
                }

                public double getTotalNetPrice() {
                    return TotalNetPrice;
                }

                public void setTotalNetPrice(double TotalNetPrice) {
                    this.TotalNetPrice = TotalNetPrice;
                }

                public String getLastModifiedDateTime() {
                    return LastModifiedDateTime;
                }

                public void setLastModifiedDateTime(String LastModifiedDateTime) {
                    this.LastModifiedDateTime = LastModifiedDateTime;
                }

                public String getUserFullName() {
                    return UserFullName;
                }

                public void setUserFullName(String UserFullName) {
                    this.UserFullName = UserFullName;
                }

                public int getDeliveryAddressId() {
                    return DeliveryAddressId;
                }

                public void setDeliveryAddressId(int DeliveryAddressId) {
                    this.DeliveryAddressId = DeliveryAddressId;
                }

                public int getDeliveryCustomerNumber() {
                    return DeliveryCustomerNumber;
                }

                public void setDeliveryCustomerNumber(int DeliveryCustomerNumber) {
                    this.DeliveryCustomerNumber = DeliveryCustomerNumber;
                }

                public String getDeliveryCustomerName() {
                    return DeliveryCustomerName;
                }

                public void setDeliveryCustomerName(String DeliveryCustomerName) {
                    this.DeliveryCustomerName = DeliveryCustomerName;
                }

                public int getCostCenterId() {
                    return CostCenterId;
                }

                public void setCostCenterId(int CostCenterId) {
                    this.CostCenterId = CostCenterId;
                }

                public String getExportDateTime() {
                    return ExportDateTime;
                }

                public void setExportDateTime(String ExportDateTime) {
                    this.ExportDateTime = ExportDateTime;
                }

                public String getStoreDescription() {
                    return StoreDescription;
                }

                public void setStoreDescription(String StoreDescription) {
                    this.StoreDescription = StoreDescription;
                }

                public float getTotalPrepaymentRequestBalance() {
                    return TotalPrepaymentRequestBalance;
                }

                public void setTotalPrepaymentRequestBalance(float TotalPrepaymentRequestBalance) {
                    this.TotalPrepaymentRequestBalance = TotalPrepaymentRequestBalance;
                }

                public String getOrderResponseDate() {
                    return OrderResponseDate;
                }

                public void setOrderResponseDate(String OrderResponseDate) {
                    this.OrderResponseDate = OrderResponseDate;
                }

                public int getScannerId() {
                    return ScannerId;
                }

                public void setScannerId(int ScannerId) {
                    this.ScannerId = ScannerId;
                }

                public float getTotalPrePaid() {
                    return TotalPrePaid;
                }

                public void setTotalPrePaid(float TotalPrePaid) {
                    this.TotalPrePaid = TotalPrePaid;
                }

                public String getUtmostDeliveryDate() {
                    return UtmostDeliveryDate;
                }

                public void setUtmostDeliveryDate(String UtmostDeliveryDate) {
                    this.UtmostDeliveryDate = UtmostDeliveryDate;
                }

                public int getSaleOrderClassId() {
                    return SaleOrderClassId;
                }

                public void setSaleOrderClassId(int SaleOrderClassId) {
                    this.SaleOrderClassId = SaleOrderClassId;
                }

                public float getTotalPrePaidBalance() {
                    return TotalPrePaidBalance;
                }

                public void setTotalPrePaidBalance(float TotalPrePaidBalance) {
                    this.TotalPrePaidBalance = TotalPrePaidBalance;
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

                public String getCustomerName() {
                    return CustomerName;
                }

                public void setCustomerName(String CustomerName) {
                    this.CustomerName = CustomerName;
                }

                public int getOrderNumber() {
                    return OrderNumber;
                }

                public void setOrderNumber(int OrderNumber) {
                    this.OrderNumber = OrderNumber;
                }

                public boolean isIsCancelled() {
                    return IsCancelled;
                }

                public void setIsCancelled(boolean IsCancelled) {
                    this.IsCancelled = IsCancelled;
                }

                public String getSaleOrderType() {
                    return SaleOrderType;
                }

                public void setSaleOrderType(String SaleOrderType) {
                    this.SaleOrderType = SaleOrderType;
                }

                public float getTotalPrepaymentRequests() {
                    return TotalPrepaymentRequests;
                }

                public void setTotalPrepaymentRequests(float TotalPrepaymentRequests) {
                    this.TotalPrepaymentRequests = TotalPrepaymentRequests;
                }

                public int getCustomerId() {
                    return CustomerId;
                }

                public void setCustomerId(int CustomerId) {
                    this.CustomerId = CustomerId;
                }

                public int getConversionId() {
                    return ConversionId;
                }

                public void setConversionId(int ConversionId) {
                    this.ConversionId = ConversionId;
                }

                public int getWebshopId() {
                    return WebshopId;
                }

                public void setWebshopId(int WebshopId) {
                    this.WebshopId = WebshopId;
                }

                public String getTransportTypeDescription() {
                    return TransportTypeDescription;
                }

                public void setTransportTypeDescription(String TransportTypeDescription) {
                    this.TransportTypeDescription = TransportTypeDescription;
                }

                public int getPurchaseOrderId() {
                    return PurchaseOrderId;
                }

                public void setPurchaseOrderId(int PurchaseOrderId) {
                    this.PurchaseOrderId = PurchaseOrderId;
                }

                public int getDebtorId() {
                    return DebtorId;
                }

                public void setDebtorId(int DebtorId) {
                    this.DebtorId = DebtorId;
                }

                public String getPrintedDateTime() {
                    return PrintedDateTime;
                }

                public void setPrintedDateTime(String PrintedDateTime) {
                    this.PrintedDateTime = PrintedDateTime;
                }

                public int getCompanyId() {
                    return CompanyId;
                }

                public void setCompanyId(int CompanyId) {
                    this.CompanyId = CompanyId;
                }

                public int getCustomerContactId() {
                    return CustomerContactId;
                }

                public void setCustomerContactId(int CustomerContactId) {
                    this.CustomerContactId = CustomerContactId;
                }

                public int getItemId() {
                    return ItemId;
                }

                public void setItemId(int ItemId) {
                    this.ItemId = ItemId;
                }

                public double getTotalWeightedNetPrice() {
                    return TotalWeightedNetPrice;
                }

                public void setTotalWeightedNetPrice(double TotalWeightedNetPrice) {
                    this.TotalWeightedNetPrice = TotalWeightedNetPrice;
                }

                public boolean isIsRaise() {
                    return IsRaise;
                }

                public void setIsRaise(boolean IsRaise) {
                    this.IsRaise = IsRaise;
                }

                public String getOrderStatus() {
                    return OrderStatus;
                }

                public void setOrderStatus(String OrderStatus) {
                    this.OrderStatus = OrderStatus;
                }

                public int getInboundMessageNumber() {
                    return InboundMessageNumber;
                }

                public void setInboundMessageNumber(int InboundMessageNumber) {
                    this.InboundMessageNumber = InboundMessageNumber;
                }

                public String getSaleOrderClassDescription() {
                    return SaleOrderClassDescription;
                }

                public void setSaleOrderClassDescription(String SaleOrderClassDescription) {
                    this.SaleOrderClassDescription = SaleOrderClassDescription;
                }

                public double getTotalGrossPrice() {
                    return TotalGrossPrice;
                }

                public void setTotalGrossPrice(double TotalGrossPrice) {
                    this.TotalGrossPrice = TotalGrossPrice;
                }

                public String getExpectedDeliveryDate() {
                    return ExpectedDeliveryDate;
                }

                public void setExpectedDeliveryDate(String ExpectedDeliveryDate) {
                    this.ExpectedDeliveryDate = ExpectedDeliveryDate;
                }

                public int getTransportTypeId() {
                    return TransportTypeId;
                }

                public void setTransportTypeId(int TransportTypeId) {
                    this.TransportTypeId = TransportTypeId;
                }

                public int getCustomerNumber() {
                    return CustomerNumber;
                }

                public void setCustomerNumber(int CustomerNumber) {
                    this.CustomerNumber = CustomerNumber;
                }

                public int getPurchaseOrderNumber() {
                    return PurchaseOrderNumber;
                }

                public void setPurchaseOrderNumber(int PurchaseOrderNumber) {
                    this.PurchaseOrderNumber = PurchaseOrderNumber;
                }

                public int getInboundMessageId() {
                    return InboundMessageId;
                }

                public void setInboundMessageId(int InboundMessageId) {
                    this.InboundMessageId = InboundMessageId;
                }

                public boolean isSecureDiscounts() {
                    return SecureDiscounts;
                }

                public void setSecureDiscounts(boolean SecureDiscounts) {
                    this.SecureDiscounts = SecureDiscounts;
                }

                public boolean isIsVatFree() {
                    return IsVatFree;
                }

                public void setIsVatFree(boolean IsVatFree) {
                    this.IsVatFree = IsVatFree;
                }

                public int getScannerNumber() {
                    return ScannerNumber;
                }

                public void setScannerNumber(int ScannerNumber) {
                    this.ScannerNumber = ScannerNumber;
                }
            }
        }
    }
}
package ModelClass;

import webservice.WS_Enums;

/**
 * Created by haresh on 8/28/2017.
 */

public class GetSalesOrderFromDB {

    public int itemId;
    public int orderNumber;
    public String lastModifiedDateTime;
    public int storeId;
    public int customerId;
    public String customerName;
    public String customerEmail;
    public WS_Enums.SaleOrderStatus orderStatus;
    public int saleOrderClassIdField;
    public WS_Enums.SaleOrderType saleOrderType;
    public long salesOrderUniqueId;
    public double discountPrice;
    public double priPaymentAmount;
    public String Address;
    public String postalCode = "";
    public String street = "";
    public String city;
    public String housenumber;
    public String MiscInfo;

    public String getMiscInfo() {
        return MiscInfo;
    }

    public void setMiscInfo(String miscInfo) {
        MiscInfo = miscInfo;
    }

    public String getHousenumberSuffix() {
        return housenumberSuffix;
    }

    public void setHousenumberSuffix(String housenumberSuffix) {
        this.housenumberSuffix = housenumberSuffix;
    }

    public String housenumberSuffix;
    public String phoneNumber;
    public String ReferenceCode;
    public double discount;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    /*public String DeliveryPoints;

    public String getDeliveryPoints() {
        return DeliveryPoints;
    }

    public void setDeliveryPoints(String deliveryPoints) {
        DeliveryPoints = deliveryPoints;
    }*/

    public String getReferenceCode() {
        return ReferenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        ReferenceCode = referenceCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getPriPaymentAmount() {
        return priPaymentAmount;
    }

    public void setPriPaymentAmount(double priPaymentAmount) {
        this.priPaymentAmount = priPaymentAmount;
    }

    public long getSalesOrderUniqueId() {
        return salesOrderUniqueId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setSalesOrderUniqueId(long salesOrderUniqueId) {
        this.salesOrderUniqueId = salesOrderUniqueId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(String lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public WS_Enums.SaleOrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(WS_Enums.SaleOrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getSaleOrderClassIdField() {
        return saleOrderClassIdField;
    }

    public void setSaleOrderClassIdField(int saleOrderClassIdField) {
        this.saleOrderClassIdField = saleOrderClassIdField;
    }

    public WS_Enums.SaleOrderType getSaleOrderType() {
        return saleOrderType;
    }

    public void setSaleOrderType(WS_Enums.SaleOrderType saleOrderType) {
        this.saleOrderType = saleOrderType;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
}

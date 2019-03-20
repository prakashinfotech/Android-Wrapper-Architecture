package ModelClass;

/**
 * Created by Vivek on 8/8/2017.
 */

public class OrderProduct {
    public int OrderProductId;
    public String Name;
    public double grossPrice;
    public double salesPrice;
    public double purchasePrice;
    public int Quantity;
    public int salesOrderNumber;
    public String discountType;
    public double discountAmount;
    public String deliveryType;
    public String deliveryDate;
    public String deliverySession;
    public String barCode;
    public int saleOrderRowId;
    public double stock;

    public double getFutureStock() {
        return futureStock;
    }

    public void setFutureStock(double futureStock) {
        this.futureStock = futureStock;
    }

    public double futureStock;
    public double deliveredAmount;

    public double getDeliveredAmount() {
        return deliveredAmount;
    }

    public void setDeliveredAmount(double deliveredAmount) {
        this.deliveredAmount = deliveredAmount;
    }

    public double totalNetPrice;
    public double totalGrossPrice;
    public int vatId;
    public double vatPersentage;
    public long productNumber;
    public String vatCode;
    public String mStillPick = "";
    public String RelatedProductsType;
    public String orderCode = "";

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getRelatedProductsType() {
        return RelatedProductsType;
    }

    public void setRelatedProductsType(String relatedProductsType) {
        RelatedProductsType = relatedProductsType;
    }

    public String getVatCode() {
        return vatCode;
    }

    public void setVatCode(String vatCode) {
        this.vatCode = vatCode;
    }

    public long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(long productNumber) {
        this.productNumber = productNumber;
    }

    public int getVatId() {
        return vatId;
    }

    public void setVatId(int vatId) {
        this.vatId = vatId;
    }

    public double getVatPersentage() {
        return vatPersentage;
    }

    public void setVatPersentage(double vatPersentage) {
        this.vatPersentage = vatPersentage;
    }

    public double getTotalNetPrice() {
        return totalNetPrice;
    }

    public void setTotalNetPrice(double totalNetPrice) {
        this.totalNetPrice = totalNetPrice;
    }

    public double getTotalGrossPrice() {
        return totalGrossPrice;
    }

    public void setTotalGrossPrice(double totalGrossPrice) {
        this.totalGrossPrice = totalGrossPrice;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public int getOrderProductId() {
        return OrderProductId;
    }

    public void setOrderProductId(int orderProductId) {
        OrderProductId = orderProductId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(double grossPrice) {
        this.grossPrice = grossPrice;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getSalesOrderNumber() {
        return salesOrderNumber;
    }

    public void setSalesOrderNumber(int salesOrderNumber) {
        this.salesOrderNumber = salesOrderNumber;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }


    public int getSaleOrderRowId() {
        return saleOrderRowId;
    }

    public void setSaleOrderRowId(int saleOrderRowId) {
        this.saleOrderRowId = saleOrderRowId;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getDeliverySession() {
        return deliverySession;
    }

    public void setDeliverySession(String deliverySession) {
        this.deliverySession = deliverySession;
    }

    public boolean isChecked = false;

    public String getmStillPick() {
        return mStillPick;
    }

    public void setmStillPick(String mStillPick) {
        this.mStillPick = mStillPick;
    }
}

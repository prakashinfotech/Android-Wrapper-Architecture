package webservice;

/**
 * Created by samir
 * on 9/19/2018 11:53 AM.
 *
 * @author samir
 * {@link OrderPickModelBean class is used to bind SalesOrderRow and Product data with AdapterOrderPickinglist}
 */

public class OrderPickModelBean {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private long barcode;
    private String orderCode;
    private int quantity;
    private int stock;
    private boolean isSelected;
    private long productNumber;
    private int productid;
    private int productListId;
    private boolean isPicked;


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(long productNumber) {
        this.productNumber = productNumber;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getProductListId() {
        return productListId;
    }

    public void setProductListId(int productListId) {
        this.productListId = productListId;
    }

    public boolean isPicked() {
        return isPicked;
    }

    public void setPicked(boolean picked) {
        isPicked = picked;
    }
}

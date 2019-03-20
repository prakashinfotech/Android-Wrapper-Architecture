package ModelClass;

/**
 * Created by samir on 1/22/2018.
 */

public class ScannedProductBean {
    private String barcode;
    private int quantity;
    private String description;
    private double minimumOrderQuantity;
    private int orderMultiplier;

    public String getFreestock() {
        return freestock;
    }

    public void setFreestock(String freestock) {
        this.freestock = freestock;
    }

    private String freestock;
    private String futureStock;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    private boolean isValid;

    public ScannedProductBean(String barcode, int quantity, boolean isValid, String description, String freestock, double minimumOrderQuantity, int orderMultiplier, String futureStock) {
        this.barcode = barcode;
        this.orderMultiplier = orderMultiplier > 0 ? orderMultiplier : 1;
        this.quantity = quantity * this.orderMultiplier;
        this.isValid = isValid;
        this.description = description;
        this.freestock = freestock;
        this.minimumOrderQuantity = minimumOrderQuantity;
        this.futureStock = futureStock;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    public void setMinimumOrderQuantity(double minimumOrderQuantity) {
        this.minimumOrderQuantity = minimumOrderQuantity;
    }

    public int getOrderMultiplier() {
        return orderMultiplier;
    }

    public void setOrderMultiplier(int orderMultiplier) {
        this.orderMultiplier = orderMultiplier;
    }

    public String getFutureStock() {
        return futureStock;
    }

    public void setFutureStock(String futureStock) {
        this.futureStock = futureStock;
    }
}

package ModelClass;

/**
 * Created by samir
 * on 3/30/2018 8:47 PM.
 */

public class VatBean {
    private String vatCode;
    private int vatPerncentage;

    public VatBean(String vatCode, int vatPerncentage) {
        this.vatCode = vatCode;
        this.vatPerncentage = vatPerncentage;
    }

    public String getVatCode() {
        return vatCode;
    }

    public void setVatCode(String vatCode) {
        this.vatCode = vatCode;
    }

    public int getVatPerncentage() {
        return vatPerncentage;
    }

    public void setVatPerncentage(int vatPerncentage) {
        this.vatPerncentage = vatPerncentage;
    }


}

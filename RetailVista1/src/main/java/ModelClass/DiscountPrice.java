package ModelClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DiscountPrice {

    @SerializedName("xsi:nil")
    @Expose
    private Boolean xsiNil;

    public Boolean getXsiNil() {
        return xsiNil;
    }

    public void setXsiNil(Boolean xsiNil) {
        this.xsiNil = xsiNil;
    }

}
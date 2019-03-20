package ModelClass.ResponseClass;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vivek on 7/29/2017.
 */

public class AddCustomerResponse {

    /**
     * AddCustomerResponse : {"AddCustomerResult":602986,"xmlns":"http://retail3000.net/Retail3000Webservice/WebserviceCustomerComponents"}
     */

    @SerializedName("AddCustomerResponse")
    private AddCustomerResponseBean AddCustomerResponse;

    public AddCustomerResponseBean getAddCustomerResponse() {
        return AddCustomerResponse;
    }

    public void setAddCustomerResponse(AddCustomerResponseBean AddCustomerResponse) {
        this.AddCustomerResponse = AddCustomerResponse;
    }

    public static class AddCustomerResponseBean {
        /**
         * AddCustomerResult : 602986
         * xmlns : http://retail3000.net/Retail3000Webservice/WebserviceCustomerComponents
         */

        @SerializedName("AddCustomerResult")
        private int AddCustomerResult;
        @SerializedName("xmlns")
        private String xmlns;

        public int getAddCustomerResult() {
            return AddCustomerResult;
        }

        public void setAddCustomerResult(int AddCustomerResult) {
            this.AddCustomerResult = AddCustomerResult;
        }

        public String getXmlns() {
            return xmlns;
        }

        public void setXmlns(String xmlns) {
            this.xmlns = xmlns;
        }
    }
}

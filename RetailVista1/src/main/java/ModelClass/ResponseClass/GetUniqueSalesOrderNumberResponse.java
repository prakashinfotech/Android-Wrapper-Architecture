package ModelClass.ResponseClass;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vivek on 8/2/2017.
 */

public class GetUniqueSalesOrderNumberResponse {

    /**
     * GetUniqueSaleOrderNumberResponse : {"GetUniqueSaleOrderNumberResult":2509,"xmlns":"http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents"}
     */

    @SerializedName("GetUniqueSaleOrderNumberResponse")
    private GetUniqueSaleOrderNumberResponseBean GetUniqueSaleOrderNumberResponse;

    public GetUniqueSaleOrderNumberResponseBean getGetUniqueSaleOrderNumberResponse() {
        return GetUniqueSaleOrderNumberResponse;
    }

    public void setGetUniqueSaleOrderNumberResponse(GetUniqueSaleOrderNumberResponseBean GetUniqueSaleOrderNumberResponse) {
        this.GetUniqueSaleOrderNumberResponse = GetUniqueSaleOrderNumberResponse;
    }

    public static class GetUniqueSaleOrderNumberResponseBean {
        /**
         * GetUniqueSaleOrderNumberResult : 2509
         * xmlns : http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents
         */

        @SerializedName("GetUniqueSaleOrderNumberResult")
        private int GetUniqueSaleOrderNumberResult;
        @SerializedName("xmlns")
        private String xmlns;

        public int getGetUniqueSaleOrderNumberResult() {
            return GetUniqueSaleOrderNumberResult;
        }

        public void setGetUniqueSaleOrderNumberResult(int GetUniqueSaleOrderNumberResult) {
            this.GetUniqueSaleOrderNumberResult = GetUniqueSaleOrderNumberResult;
        }

        public String getXmlns() {
            return xmlns;
        }

        public void setXmlns(String xmlns) {
            this.xmlns = xmlns;
        }
    }
}

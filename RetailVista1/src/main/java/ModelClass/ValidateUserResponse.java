package ModelClass;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vivek on 7/25/2017.
 */

public class ValidateUserResponse {


    /**
     * ValidateUserResponse : {"ValidateUserResult":"LoginSuccessful","xmlns":"http://retail3000.net/Retail3000Webservice/WebserviceSecurityComponents"}
     */

    @SerializedName("ValidateUserResponse")
    private ValidateUserResponseBean ValidateUserResponse;

    public ValidateUserResponseBean getValidateUserResponse() {
        return ValidateUserResponse;
    }

    public void setValidateUserResponse(ValidateUserResponseBean ValidateUserResponse) {
        this.ValidateUserResponse = ValidateUserResponse;
    }

    public static class ValidateUserResponseBean {
        /**
         * ValidateUserResult : LoginSuccessful
         * xmlns : http://retail3000.net/Retail3000Webservice/WebserviceSecurityComponents
         */

        @SerializedName("ValidateUserResult")
        private String ValidateUserResult;
        @SerializedName("xmlns")
        private String xmlns;

        public String getValidateUserResult() {
            return ValidateUserResult;
        }

        public void setValidateUserResult(String ValidateUserResult) {
            this.ValidateUserResult = ValidateUserResult;
        }

        public String getXmlns() {
            return xmlns;
        }

        public void setXmlns(String xmlns) {
            this.xmlns = xmlns;
        }
    }
}

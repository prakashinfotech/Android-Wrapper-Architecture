package ModelClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Retail3000AuthenticateToken {

    @SerializedName("Username")
    @Expose
    private String username;
    @SerializedName("Password")
    @Expose
    private String password;
    @SerializedName("CompanyNumber")
    @Expose
    private String companyNumber;
    @SerializedName("StoreNumber")
    @Expose
    private String storeNumber;
    @SerializedName("ClientIp")
    @Expose
    private String clientIp;
    @SerializedName("LanguageCode")
    @Expose
    private String languageCode;
    @SerializedName("ScannerNumber")
    @Expose
    private String scannerNumber;
    @SerializedName("ClientApplicationCode")
    @Expose
    private String clientApplicationCode;
    @SerializedName("ClientAppVersion")
    @Expose
    private String clientAppVersion;
    @SerializedName("MobileDeviceNumber")
    @Expose
    private String mobileDeviceNumber;
    @SerializedName("__prefix")
    @Expose
    private String prefix;
    @SerializedName("__headerToken")
    @Expose
    private String headerToken;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(String storeNumber) {
        this.storeNumber = storeNumber;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getScannerNumber() {
        return scannerNumber;
    }

    public void setScannerNumber(String scannerNumber) {
        this.scannerNumber = scannerNumber;
    }

    public String getClientApplicationCode() {
        return clientApplicationCode;
    }

    public void setClientApplicationCode(String clientApplicationCode) {
        this.clientApplicationCode = clientApplicationCode;
    }

    public String getClientAppVersion() {
        return clientAppVersion;
    }

    public void setClientAppVersion(String clientAppVersion) {
        this.clientAppVersion = clientAppVersion;
    }

    public String getMobileDeviceNumber() {
        return mobileDeviceNumber;
    }

    public void setMobileDeviceNumber(String mobileDeviceNumber) {
        this.mobileDeviceNumber = mobileDeviceNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Retail3000AuthenticateToken getDefaultUser() {
        Retail3000AuthenticateToken obj = new Retail3000AuthenticateToken();
        obj.setUsername("");
        obj.setCompanyNumber("");
        obj.setMobileDeviceNumber("");
        obj.setPassword("");
        obj.setScannerNumber("");
        obj.setStoreNumber("");
        obj.setHeaderToken("");
        return obj;
    }

    public String getHeaderToken() {
        return headerToken;
    }

    public void setHeaderToken(String headerToken) {
        this.headerToken = headerToken;
    }
}
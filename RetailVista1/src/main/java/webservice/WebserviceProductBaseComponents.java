package webservice;

import android.os.AsyncTask;
import android.util.Log;

import com.retailvistaapi.BuildConfig;

import org.ksoap2.HeaderProperty;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.MarshalFloat;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.kxml2.kdom.Element;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

import CommonClass.APICommonClassNew;
import CommonClass.CommonUtils;
import CommonClass.StaticValues;
import ModelClass.Retail3000AuthenticateToken;

/**
 * Created by samir on 8/16/2017.
 */

public class WebserviceProductBaseComponents {
    public String NAMESPACE = "http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents";
    public String url = "";
    public int timeOut = 100000;
    public IWsdl2CodeEvents eventHandler;
    public Retail3000AuthenticateToken retail3000AuthenticateTokenValue;
    public WS_Enums.SoapProtocolVersion soapVersion;
/*

    public WebserviceProductBaseComponents() {
    }
*/

/*
    public WebserviceProductBaseComponents(IWsdl2CodeEvents eventHandler) {
        this.eventHandler = eventHandler;
    }
*/

    public WebserviceProductBaseComponents(IWsdl2CodeEvents eventHandler, String url) {
        this.eventHandler = eventHandler;
        this.url = url + "/productbasecomponents.asmx";
    }

    public WebserviceProductBaseComponents(String url) {
        this.url = url + "/productbasecomponents.asmx";
    }

/*    public WebserviceProductBaseComponents(IWsdl2CodeEvents eventHandler, String url, int timeOutInSeconds) {
        this.eventHandler = eventHandler;
        this.url = url;
        this.setTimeOut(timeOutInSeconds);
    }*/

    public void setTimeOut(int seconds) {
        this.timeOut = seconds * 1000;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void GetSaleOrderRowsAsync(SaleOrderRowsFilter filter) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetSaleOrderRowsAsync(filter, null);
    }

    public void GetSaleOrderRowsAsync(final SaleOrderRowsFilter filter, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorViewSaleOrderRowInfo>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewSaleOrderRowInfo doInBackground(Void... params) {
                return GetSaleOrderRows(filter, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewSaleOrderRowInfo result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetSaleOrderRows", result);
                }
            }
        }.execute();
    }

    public VectorViewSaleOrderRowInfo GetSaleOrderRows(SaleOrderRowsFilter filter, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetSaleOrderRows");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "filter", new SaleOrderRowsFilter().getClass());
        soapReq.addProperty("filter", filter);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        Log.d("Url", url);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetSaleOrderRows", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewSaleOrderRowInfo resultVariable = new VectorViewSaleOrderRowInfo(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void GetSaleOrdersAsync(SaleOrdersFilter filter, int offset, int recordCount, String orderBy) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetSaleOrdersAsync(filter, offset, recordCount, orderBy, null);
    }

    public void UpdateSaleOrderAsync(SaleOrderInfo saleOrder, boolean isForceUpdate) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        UpdateSaleOrderAsync(saleOrder, isForceUpdate, null);
    }

    public void UpdateSaleOrderAsync(final SaleOrderInfo saleOrder, final boolean isForceUpdate, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Number>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }


            @Override
            protected Number doInBackground(Void... params) {
                return UpdateSaleOrder(saleOrder, isForceUpdate, authenticateToken);
            }

            @Override
            protected void onPostExecute(Number result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("UpdateSaleOrder", result);
                } else {
                    eventHandler.Wsdl2CodeFinishedWithNull();
                }
            }
        }.execute();
    }

    public int UpdateSaleOrder(SaleOrderInfo saleOrder, boolean isForceUpdate) {
        return UpdateSaleOrder(saleOrder, isForceUpdate, null);
    }

    public int UpdateSaleOrder(SaleOrderInfo saleOrder, boolean isForceUpdate, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "UpdateSaleOrder");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "saleOrder", new SaleOrderInfo().getClass());
        MarshalFloat marshalFloat = new MarshalFloat();
        marshalFloat.register(soapEnvelope);
        soapReq.addProperty("saleOrder", saleOrder);
        soapReq.addProperty("isForceUpdate", isForceUpdate);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/UpdateSaleOrder", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        int resultVariable = Integer.parseInt(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Number) {
                        int resultVariable = (Integer) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return -1;
    }

    public AsyncTask<Void, Void, VectorViewSaleOrderInfo> GetSaleOrdersAsync(final SaleOrdersFilter filter, final int offset, final int recordCount, final String orderBy, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        return new AsyncTask<Void, Void, VectorViewSaleOrderInfo>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewSaleOrderInfo doInBackground(Void... params) {
                return GetSaleOrders(filter, offset, recordCount, orderBy, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewSaleOrderInfo result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetSaleOrders", result);
                } else {
                    eventHandler.Wsdl2CodeFinished("GetSaleOrders", null);
                }
            }
        }.execute();
    }

    public VectorViewSaleOrderInfo GetSaleOrders(SaleOrdersFilter filter, int offset, int recordCount, String orderBy) {
        return GetSaleOrders(filter, offset, recordCount, orderBy, null);
    }

    public VectorViewSaleOrderInfo GetSaleOrders(SaleOrdersFilter filter, int offset, int recordCount, String orderBy, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetSaleOrders");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "filter", new SaleOrdersFilter().getClass());
        soapReq.addProperty("filter", filter);
        soapReq.addProperty("offset", offset);
        if (recordCount != 0) {
            soapReq.addProperty("recordCount", recordCount);
        }
        soapReq.addProperty("orderBy", orderBy);
        soapEnvelope.setOutputSoapObject(soapReq);

        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        // FakeX509TrustManager.allowAllSSL();
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            //((HttpsServiceConnectionSE) httpTransport.getServiceConnection()).setSSLSocketFactory(FakeX509TrustManager.allowAllSSL().getSocketFactory());
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetSaleOrders", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewSaleOrderInfo resultVariable = new VectorViewSaleOrderInfo(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void AddSaleOrderAsync(SaleOrderInfo saleOrder, double prePaymentRequestAmount) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        AddSaleOrderAsync(saleOrder, prePaymentRequestAmount, null);
    }

    public void AddSaleOrderAsync(final SaleOrderInfo saleOrder, final double prePaymentRequestAmount, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Number>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected Number doInBackground(Void... params) {
                return AddSaleOrder(saleOrder, prePaymentRequestAmount, authenticateToken);
            }

            @Override
            protected void onPostExecute(Number result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("AddSaleOrder", result);
                }
            }
        }.execute();
    }

    public int AddSaleOrder(SaleOrderInfo saleOrder, double prePaymentRequestAmount) {
        return AddSaleOrder(saleOrder, prePaymentRequestAmount, null);
    }

    public int AddSaleOrder(SaleOrderInfo saleOrder, double prePaymentRequestAmount, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "AddSaleOrder");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "saleOrder", new SaleOrderInfo().getClass());
        MarshalFloat marshalFloat = new MarshalFloat();
        marshalFloat.register(soapEnvelope);
        soapReq.addProperty("saleOrder", saleOrder);
        if (prePaymentRequestAmount > 0) {
            soapReq.addProperty("prePaymentRequestAmount", prePaymentRequestAmount);
        }
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/AddSaleOrder", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        int resultVariable = Integer.parseInt(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Number) {
                        int resultVariable = (Integer) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return -1;
    }

    //dsfsdfsdfsdfsd


    public void AddSaleOrderRowAsync(SaleOrderRowInfo saleOrderRow, boolean isCalculatePrices) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        AddSaleOrderRowAsync(saleOrderRow, isCalculatePrices, null);
    }

    public void AddSaleOrderRowAsync(final SaleOrderRowInfo saleOrderRow, final boolean isCalculatePrices, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Number>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected Number doInBackground(Void... params) {
                return AddSaleOrderRow(saleOrderRow, isCalculatePrices, authenticateToken);
            }

            @Override
            protected void onPostExecute(Number result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("AddSaleOrderRow", result);
                }
            }
        }.execute();
    }

    public int AddSaleOrderRow(SaleOrderRowInfo saleOrderRow, boolean isCalculatePrices) {
        return AddSaleOrderRow(saleOrderRow, isCalculatePrices, null);
    }

    public int AddSaleOrderRow(SaleOrderRowInfo saleOrderRow, boolean isCalculatePrices, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "AddSaleOrderRow");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "saleOrderRow", new SaleOrderRowInfo().getClass());
        MarshalFloat marshalFloat = new MarshalFloat();
        marshalFloat.register(soapEnvelope);
        soapReq.addProperty("saleOrderRow", saleOrderRow);
        soapReq.addProperty("isCalculatePrices", isCalculatePrices);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
          /*  if (headers!=null){
                httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/AddSaleOrderRow", soapEnvelope,headers);
            }else{*/
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/AddSaleOrderRow", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);

            //}
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        int resultVariable = Integer.parseInt(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Number) {
                        int resultVariable = (Integer) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return -1;
    }

    public void UpdateSaleOrderRowAsync(SaleOrderRowInfo saleOrderRow, boolean isCalculatePrices, boolean isForceUpdate) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        UpdateSaleOrderRowAsync(saleOrderRow, isCalculatePrices, isForceUpdate, null);
    }

    public void UpdateSaleOrderRowAsync(final SaleOrderRowInfo saleOrderRow, final boolean isCalculatePrices, final boolean isForceUpdate, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Number>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected Number doInBackground(Void... params) {
                return UpdateSaleOrderRow(saleOrderRow, isCalculatePrices, isForceUpdate, authenticateToken);
            }

            @Override
            protected void onPostExecute(Number result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("UpdateSaleOrderRow", result);
                }
            }
        }.execute();
    }

    public int UpdateSaleOrderRow(SaleOrderRowInfo saleOrderRow, boolean isCalculatePrices, boolean isForceUpdate) {
        return UpdateSaleOrderRow(saleOrderRow, isCalculatePrices, isForceUpdate, null);
    }

    public int UpdateSaleOrderRow(SaleOrderRowInfo saleOrderRow, boolean isCalculatePrices, boolean isForceUpdate, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "UpdateSaleOrderRow");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "saleOrderRow", new SaleOrderRowInfo().getClass());
        MarshalFloat marshalFloat = new MarshalFloat();
        marshalFloat.register(soapEnvelope);
        soapReq.addProperty("saleOrderRow", saleOrderRow);
        soapReq.addProperty("isCalculatePrices", isCalculatePrices);
        soapReq.addProperty("isForceUpdate", isForceUpdate);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
          /*  if (headers != null) {
                httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/UpdateSaleOrderRow", soapEnvelope, headers);
            } else {*/
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/UpdateSaleOrderRow", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                Log.d("API", "SoapFault" + ((SoapFault) retObj).faultstring);
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                Log.d("API", "Success");
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        int resultVariable = Integer.parseInt(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Number) {
                        int resultVariable = (Integer) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return -1;
    }

    public void UpdateSaleOrdersStatusAsync(VectorInt32 saleOrderIds, SaleOrderStatus newStatus) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        UpdateSaleOrdersStatusAsync(saleOrderIds, newStatus, null);
    }

    public void UpdateSaleOrdersStatusAsync(final VectorInt32 saleOrderIds, final SaleOrderStatus newStatus, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorVerifyExceptionInfo>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorVerifyExceptionInfo doInBackground(Void... params) {
                return UpdateSaleOrdersStatus(saleOrderIds, newStatus, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorVerifyExceptionInfo result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("UpdateSaleOrdersStatus", result);
                }
            }
        }.execute();
    }

    public VectorVerifyExceptionInfo UpdateSaleOrdersStatus(VectorInt32 saleOrderIds, SaleOrderStatus newStatus) {
        return UpdateSaleOrdersStatus(saleOrderIds, newStatus, null);
    }

    public VectorVerifyExceptionInfo UpdateSaleOrdersStatus(VectorInt32 saleOrderIds, SaleOrderStatus newStatus, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "UpdateSaleOrdersStatus");
        soapReq.addProperty("saleOrderIds", saleOrderIds);
        soapReq.addProperty("newStatus", newStatus.toString());
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);

        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/UpdateSaleOrdersStatus", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorVerifyExceptionInfo resultVariable = new VectorVerifyExceptionInfo(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void DeleteSaleOrderRowAsync(int itemId) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        DeleteSaleOrderRowAsync(itemId, null);
    }

    public void DeleteSaleOrderRowAsync(final int itemId, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Boolean>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected Boolean doInBackground(Void... params) {
                return DeleteSaleOrderRow(itemId, authenticateToken);
            }

            @Override
            protected void onPostExecute(Boolean result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("DeleteSaleOrderRow", result);
                }
            }
        }.execute();
    }

    public boolean DeleteSaleOrderRow(int itemId) {
        return DeleteSaleOrderRow(itemId, null);
    }

    public boolean DeleteSaleOrderRow(int itemId, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "DeleteSaleOrderRow");
        soapReq.addProperty("itemId", itemId);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/DeleteSaleOrderRow", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        boolean resultVariable = Boolean.parseBoolean(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Boolean) {
                        boolean resultVariable = (Boolean) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return false;
    }

    public void DeleteSaleOrderAsync(int itemId) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        DeleteSaleOrderAsync(itemId, null);
    }

    public void DeleteSaleOrderAsync(final int itemId, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Boolean>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected Boolean doInBackground(Void... params) {
                return DeleteSaleOrder(itemId, authenticateToken);
            }

            @Override
            protected void onPostExecute(Boolean result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("DeleteSaleOrder", result);
                }
            }
        }.execute();
    }

    public boolean DeleteSaleOrder(int itemId) {
        return DeleteSaleOrder(itemId, null);
    }

    public boolean DeleteSaleOrder(int itemId, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "DeleteSaleOrder");
        soapReq.addProperty("itemId", itemId);
        soapEnvelope.setOutputSoapObject(soapReq);

        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }

        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/DeleteSaleOrder", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        boolean resultVariable = Boolean.parseBoolean(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Boolean) {
                        boolean resultVariable = (Boolean) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return false;
    }

    public void GetBrandsAsync(long gs1Code, int skipItemId, int includeItemId) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetBrandsAsync(gs1Code, skipItemId, includeItemId, null);
    }

    public void GetBrandsAsync(final long gs1Code, final int skipItemId, final int includeItemId, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorViewBrandInfo>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            @Override
            protected VectorViewBrandInfo doInBackground(Void... params) {
                return GetBrands(gs1Code, skipItemId, includeItemId, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewBrandInfo result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetBrands", result);
                }
            }
        }.execute();
    }

    public VectorViewBrandInfo GetBrands(long gs1Code, int skipItemId, int includeItemId) {
        return GetBrands(gs1Code, skipItemId, includeItemId, null);
    }

    public VectorViewBrandInfo GetBrands(long gs1Code, int skipItemId, int includeItemId, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetBrands");
        soapReq.addProperty("gs1Code", gs1Code);
        soapReq.addProperty("skipItemId", skipItemId);
        soapReq.addProperty("includeItemId", includeItemId);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetBrands", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);

            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewBrandInfo resultVariable = new VectorViewBrandInfo(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void GetVatsAsync(int countryId) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetVatsAsync(countryId, null);
    }

    public void GetVatsAsync(final int countryId, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorViewVatInfo>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewVatInfo doInBackground(Void... params) {
                return GetVats(countryId, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewVatInfo result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetVats", result);
                }
            }
        }.execute();
    }

    public VectorViewVatInfo GetVats(int countryId, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetVats");
        MarshalFloat marshalFloat = new MarshalFloat();
        marshalFloat.register(soapEnvelope);
        soapReq.addProperty("countryId", countryId);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetVats", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewVatInfo resultVariable = new VectorViewVatInfo(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void GetClassificationLevel1Async(int classificationGroupIdField, int skipItemId, int includeItemId) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetClassificationLevel1Async(classificationGroupIdField, skipItemId, includeItemId, null);
    }

    public void GetClassificationLevel1Async(final int classificationGroupIdField, final int skipItemId, final int includeItemId, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorViewClassificationLevel1Info>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewClassificationLevel1Info doInBackground(Void... params) {
                return GetClassificationLevel1(classificationGroupIdField, skipItemId, includeItemId, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewClassificationLevel1Info result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetClassificatio    nLevel1", result);
                }
            }
        }.execute();
    }

    public VectorViewClassificationLevel1Info GetClassificationLevel1(int classificationGroupIdField, int skipItemId, int includeItemId) {
        return GetClassificationLevel1(classificationGroupIdField, skipItemId, includeItemId, null);
    }

    private SSLSocketFactory getSSLSocketFactory() throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
        TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
        try {
            // Note: KeyStore requires it be loaded even if you don't load anything into it:
            ks.load(null);
        } catch (Exception e) {

        }
        tmf.init(ks);
        SSLContext context = SSLContext.getInstance("SSL");
        context.init(null, tmf.getTrustManagers(), null);
        return context.getSocketFactory();
    }

    public VectorViewClassificationLevel1Info GetClassificationLevel1(int classificationGroupIdField, int skipItemId, int includeItemId, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetClassificationLevel1");
        soapReq.addProperty("classificationGroupId", classificationGroupIdField);
        soapReq.addProperty("skipItemId", skipItemId);
        soapReq.addProperty("includeItemId", includeItemId);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            //((HttpsServiceConnectionSE) httpTransport.getServiceConnection()).setSSLSocketFactory(getSSLSocketFactory());
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetClassificationLevel1", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewClassificationLevel1Info resultVariable = new VectorViewClassificationLevel1Info(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }


    public void GetReservationsAsync(ReservationsFilter filter, int offset, int recordCount, String orderBy) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetReservationsAsync(filter, offset, recordCount, orderBy, null);
    }

    public void GetReservationsAsync(final ReservationsFilter filter, final int offset, final int recordCount, final String orderBy, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorViewReservationInfo>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewReservationInfo doInBackground(Void... params) {
                return GetReservations(filter, offset, recordCount, orderBy, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewReservationInfo result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetReservations", result);
                } else {
                    eventHandler.Wsdl2CodeFinishedWithNull();
                }
            }
        }.execute();
    }

    public VectorViewReservationInfo GetReservations(ReservationsFilter filter, int offset, int recordCount, String orderBy) {
        return GetReservations(filter, offset, recordCount, orderBy, null);
    }

    public VectorViewReservationInfo GetReservations(ReservationsFilter filter, int offset, int recordCount, String orderBy, final Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetReservations");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "filter", new ReservationsFilter().getClass());
        soapReq.addProperty("filter", filter);
        soapReq.addProperty("offset", offset);
        soapReq.addProperty("recordCount", recordCount);
        // soapReq.addProperty("orderBy",orderBy);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }

        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            /*if (headers!=null){
                httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetReservations", soapEnvelope,authenticateToken);
            }else{*/
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetReservations", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            //}
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewReservationInfo resultVariable = new VectorViewReservationInfo(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void GetMixedMatchesAsync(MixedMatchFilter filter) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetMixedMatchesAsync(filter, null);
    }

    public void GetMixedMatchesAsync(final MixedMatchFilter filter, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorViewMixedMatchInfo>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewMixedMatchInfo doInBackground(Void... params) {
                return GetMixedMatches(filter, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewMixedMatchInfo result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetMixedMatches", result);
                } else {
                    eventHandler.Wsdl2CodeFinishedWithNull();
                }
            }
        }.execute();
    }

    public VectorViewMixedMatchInfo GetMixedMatches(MixedMatchFilter filter) {
        return GetMixedMatches(filter, null);
    }

    public VectorViewMixedMatchInfo GetMixedMatches(MixedMatchFilter filter, final Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetMixedMatches");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "filter", new MixedMatchFilter().getClass());
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        soapReq.addProperty("filter", filter);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetMixedMatches", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewMixedMatchInfo resultVariable = new VectorViewMixedMatchInfo(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void DeleteMixedMatchProductAsync(int itemId) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        DeleteMixedMatchProductAsync(itemId, null);
    }

    public void DeleteMixedMatchProductAsync(final int itemId, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Boolean>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected Boolean doInBackground(Void... params) {
                return DeleteMixedMatchProduct(itemId, authenticateToken);
            }

            @Override
            protected void onPostExecute(Boolean result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("DeleteMixedMatchProduct", result);
                }
            }
        }.execute();
    }

    public boolean DeleteMixedMatchProduct(int itemId) {
        return DeleteMixedMatchProduct(itemId, null);
    }

    public boolean DeleteMixedMatchProduct(int itemId, final Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "DeleteMixedMatchProduct");
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        soapReq.addProperty("itemId", itemId);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/DeleteMixedMatchProduct", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        boolean resultVariable = Boolean.parseBoolean(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Boolean) {
                        boolean resultVariable = (Boolean) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return false;
    }

    public void GetDiscountDescriptionAsync(int productId) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetDiscountDescriptionAsync(productId, null);
    }

    public void GetDiscountDescriptionAsync(final int productId, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, String>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected String doInBackground(Void... params) {
                return GetDiscountDescription(productId, authenticateToken);
            }

            @Override
            protected void onPostExecute(String result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetDiscountDescription", result);
                }
            }
        }.execute();
    }

    public String GetDiscountDescription(int productId) {
        return GetDiscountDescription(productId, null);
    }

    public String GetDiscountDescription(int productId, final Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetDiscountDescription");
        soapReq.addProperty("productId", productId);
        soapEnvelope.setOutputSoapObject(soapReq);

        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
           /* if (headers!=null){
                httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetDiscountDescription", soapEnvelope,headers);
            }else{*/
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetDiscountDescription", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            //}
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    } else if (obj != null && obj instanceof String) {
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }

    public void AddMixedMatchProductAsync(MixedMatchProductInfo mixedMatchProduct) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        AddMixedMatchProductAsync(mixedMatchProduct, null);
    }

    public void AddMixedMatchProductAsync(final MixedMatchProductInfo mixedMatchProduct, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Number>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected Number doInBackground(Void... params) {
                return AddMixedMatchProduct(mixedMatchProduct, authenticateToken);
            }

            @Override
            protected void onPostExecute(Number result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("AddMixedMatchProduct", result);
                }
            }
        }.execute();
    }

    public int AddMixedMatchProduct(MixedMatchProductInfo mixedMatchProduct) {
        return AddMixedMatchProduct(mixedMatchProduct, null);
    }

    public int AddMixedMatchProduct(MixedMatchProductInfo mixedMatchProduct, final Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "AddMixedMatchProduct");
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "mixedMatchProduct", new MixedMatchProductInfo().getClass());
        MarshalFloat marshalFloat = new MarshalFloat();
        marshalFloat.register(soapEnvelope);
        soapReq.addProperty("mixedMatchProduct", mixedMatchProduct);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/AddMixedMatchProduct", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        int resultVariable = Integer.parseInt(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Number) {
                        int resultVariable = (Integer) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return -1;
    }


    public void GetSaleOrdersForDelivery(final SaleOrdersFilterDelivery filter, final int offset, final int recordCount, final String orderBy, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorViewSaleOrderInfo>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewSaleOrderInfo doInBackground(Void... params) {
                return GetSaleOrdersDelivery(filter, offset, recordCount, orderBy, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewSaleOrderInfo result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetSaleOrders", result);
                } else {
                    eventHandler.Wsdl2CodeFinished("GetSaleOrders", null);
                }
            }
        }.execute();
    }

    public VectorViewSaleOrderInfo GetSaleOrdersDelivery(SaleOrdersFilterDelivery filter, int offset, int recordCount, String orderBy, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetSaleOrders");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "filter", new SaleOrdersFilter().getClass());
        soapReq.addProperty("filter", filter);
        soapReq.addProperty("offset", offset);
        soapReq.addProperty("recordCount", recordCount);
        soapReq.addProperty("orderBy", orderBy);
        soapEnvelope.setOutputSoapObject(soapReq);

        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        // FakeX509TrustManager.allowAllSSL();
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            //((HttpsServiceConnectionSE) httpTransport.getServiceConnection()).setSSLSocketFactory(FakeX509TrustManager.allowAllSSL().getSocketFactory());
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetSaleOrders", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewSaleOrderInfo resultVariable = new VectorViewSaleOrderInfo(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void GetProductListsAsync(ProductListsFilter filter, int offset, int recordCount, String orderBy) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetProductListsAsync(filter, offset, recordCount, orderBy, null);
    }

    public AsyncTask<Void, Void, VectorViewProductListInfo> GetProductListsAsync(final ProductListsFilter filter, final int offset, final int recordCount, final String orderBy, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        return new AsyncTask<Void, Void, VectorViewProductListInfo>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewProductListInfo doInBackground(Void... params) {
                return GetProductLists(filter, offset, recordCount, orderBy, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewProductListInfo result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetProductLists", result);
                } else {
                    eventHandler.Wsdl2CodeFinishedWithNull();
                }
            }
        }.execute();
    }

    public VectorViewProductListInfo GetProductLists(ProductListsFilter filter, int offset, int recordCount, String orderBy) {
        return GetProductLists(filter, offset, recordCount, orderBy, null);
    }

    public VectorViewProductListInfo GetProductLists(ProductListsFilter filter, int offset, int recordCount, String orderBy, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetProductLists");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "filter", new ProductListsFilter().getClass());
        soapReq.addProperty("filter", filter);
        soapReq.addProperty("offset", offset);
        soapReq.addProperty("recordCount", recordCount);
        soapReq.addProperty("orderBy", orderBy);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetProductLists", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewProductListInfo resultVariable = new VectorViewProductListInfo(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void GetProductListRowsAsync(GetProductListRowsRequest request) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetProductListRowsAsync(request, null);
    }

    public AsyncTask<Void, Void, VectorViewProductListRowInfo> GetProductListRowsAsync(final GetProductListRowsRequest request, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        return new AsyncTask<Void, Void, VectorViewProductListRowInfo>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewProductListRowInfo doInBackground(Void... params) {
                return GetProductListRows(request, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewProductListRowInfo result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetProductListRows", result);
                } else {
                    eventHandler.Wsdl2CodeFinishedWithNull();
                }
            }
        }.execute();
    }

    public VectorViewProductListRowInfo GetProductListRows(GetProductListRowsRequest request) {
        return GetProductListRows(request, null);
    }

    public VectorViewProductListRowInfo GetProductListRows(GetProductListRowsRequest request, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetProductListRows");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "request", new GetProductListRowsRequest().getClass());
        soapReq.addProperty("request", request);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetProductListRows", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewProductListRowInfo resultVariable = new VectorViewProductListRowInfo(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }


    public void GetProductListTypesAsync(ProductListTypesFilter filter) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetProductListTypesAsync(filter, null);
    }

    public void GetProductListTypesAsync(final ProductListTypesFilter filter, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorViewProductListTypeInfo>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewProductListTypeInfo doInBackground(Void... params) {
                return GetProductListTypes(filter, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewProductListTypeInfo result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetProductListTypes", result);
                }
            }
        }.execute();
    }

    public VectorViewProductListTypeInfo GetProductListTypes(ProductListTypesFilter filter) {
        return GetProductListTypes(filter, null);
    }

    public VectorViewProductListTypeInfo GetProductListTypes(ProductListTypesFilter filter, final Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetProductListTypes");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "filter", new ProductListTypesFilter().getClass());
        soapReq.addProperty("filter", filter);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            /*if (headers!=null){
                httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetProductListTypes", soapEnvelope,headers);
            }else{*/
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetProductListTypes", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            //}
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewProductListTypeInfo resultVariable = new VectorViewProductListTypeInfo(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void DeleteProductListRowsAsync(VectorInt32 itemIds) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        DeleteProductListRowsAsync(itemIds, null);
    }

    public void DeleteProductListRowsAsync(final VectorInt32 itemIds, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Boolean>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected Boolean doInBackground(Void... params) {
                return DeleteProductListRows(itemIds, authenticateToken);
            }

            @Override
            protected void onPostExecute(Boolean result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("DeleteProductListRows", result);
                }
            }
        }.execute();
    }

    public boolean DeleteProductListRows(VectorInt32 itemIds) {
        return DeleteProductListRows(itemIds, null);
    }

    public boolean DeleteProductListRows(VectorInt32 itemIds, final Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "DeleteProductListRows");
        soapReq.addProperty("itemIds", itemIds);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/DeleteProductListRows", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        boolean resultVariable = Boolean.parseBoolean(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Boolean) {
                        boolean resultVariable = (Boolean) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return false;
    }

    public void AddProductListRowAsync(ProductListRowInfo productListRow) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        AddProductListRowAsync(productListRow, null);
    }

    public void AddProductListRowAsync(final ProductListRowInfo productListRow, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Number>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            @Override
            protected Number doInBackground(Void... params) {
                return AddProductListRow(productListRow, authenticateToken);
            }

            @Override
            protected void onPostExecute(Number result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("AddProductListRow", result);
                }
            }
        }.execute();
    }

    public int AddProductListRow(ProductListRowInfo productListRow) {
        return AddProductListRow(productListRow, null);
    }

    public int AddProductListRow(ProductListRowInfo productListRow, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "AddProductListRow");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "productListRow", new ProductListRowInfo().getClass());
        MarshalFloat marshalFloat = new MarshalFloat();
        marshalFloat.register(soapEnvelope);
        soapReq.addProperty("productListRow", productListRow);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/AddProductListRow", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        int resultVariable = Integer.parseInt(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Number) {
                        int resultVariable = (Integer) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return -1;
    }

    public void AddProductListAsync(ProductListInfo productList) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        AddProductListAsync(productList, null);
    }

    public void AddProductListAsync(final ProductListInfo productList, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Number>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected Number doInBackground(Void... params) {
                return AddProductList(productList, authenticateToken);
            }

            @Override
            protected void onPostExecute(Number result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("AddProductList", result);
                }
            }
        }.execute();
    }

    public int AddProductList(ProductListInfo productList) {
        return AddProductList(productList, null);
    }

    public int AddProductList(ProductListInfo productList, final Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "AddProductList");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "productList", new ProductListInfo().getClass());
        MarshalFloat marshalFloat = new MarshalFloat();
        marshalFloat.register(soapEnvelope);
        soapReq.addProperty("productList", productList);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
           /* if (headers!=null){
                httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/AddProductList", soapEnvelope,headers);
            }else{*/
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/AddProductList", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);

            //}
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        int resultVariable = Integer.parseInt(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Number) {
                        int resultVariable = (Integer) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return -1;
    }

    public void UpdateProductListRowAsync(ProductListRowInfoFroUpdate productListRow, boolean isForceUpdate) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        UpdateProductListRowAsync(productListRow, isForceUpdate, null);
    }

    public void UpdateProductListRowAsync(final ProductListRowInfoFroUpdate productListRow, final boolean isForceUpdate, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Number>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected Number doInBackground(Void... params) {
                return UpdateProductListRow(productListRow, isForceUpdate, authenticateToken);
            }

            @Override
            protected void onPostExecute(Number result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("UpdateProductListRow", result);
                }
            }
        }.execute();
    }

    public int UpdateProductListRow(ProductListRowInfoFroUpdate productListRow, boolean isForceUpdate) {
        return UpdateProductListRow(productListRow, isForceUpdate, null);
    }

    public int UpdateProductListRow(ProductListRowInfoFroUpdate productListRow, boolean isForceUpdate, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "UpdateProductListRow");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "productListRow", new ProductListRowInfoFroUpdate().getClass());
        MarshalFloat marshalFloat = new MarshalFloat();
        marshalFloat.register(soapEnvelope);
        soapReq.addProperty("productListRow", productListRow);
        soapReq.addProperty("isForceUpdate", isForceUpdate);
        soapEnvelope.setOutputSoapObject(soapReq);

        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
           /* if (headers!=null){
                httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/UpdateProductListRow", soapEnvelope,headers);
            }else{*/
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/UpdateProductListRow", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);

            //}
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        int resultVariable = Integer.parseInt(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Number) {
                        int resultVariable = (Integer) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return -1;
    }


    public void UpdateProductListAsync(ProductListInfo productList, boolean isForceUpdate) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        UpdateProductListAsync(productList, isForceUpdate, null);
    }

    public void UpdateProductListAsync(final ProductListInfo productList, final boolean isForceUpdate, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Number>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected Number doInBackground(Void... params) {
                return UpdateProductList(productList, isForceUpdate, authenticateToken);
            }

            @Override
            protected void onPostExecute(Number result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("UpdateProductList", result);
                }
            }
        }.execute();
    }

    public int UpdateProductList(ProductListInfo productList, boolean isForceUpdate) {
        return UpdateProductList(productList, isForceUpdate, null);
    }

    public int UpdateProductList(ProductListInfo productList, boolean isForceUpdate, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "UpdateProductList");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "productList", new ProductListInfo().getClass());
        MarshalFloat marshalFloat = new MarshalFloat();
        marshalFloat.register(soapEnvelope);
        soapReq.addProperty("productList", productList);
        soapReq.addProperty("isForceUpdate", isForceUpdate);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
           /* if (headers!=null){
                httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/UpdateProductList", soapEnvelope,headers);
            }else{*/
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/UpdateProductList", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);

            //}
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        int resultVariable = Integer.parseInt(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Number) {
                        int resultVariable = (Integer) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return -1;
    }

    public void GetProductCategoriesAsync(ProductCategoriesFilter filter, int skipItemId, int includeItemId) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetProductCategoriesAsync(filter, skipItemId, includeItemId, null);
    }

    public void GetProductCategoriesAsync(final ProductCategoriesFilter filter, final int skipItemId, final int includeItemId, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorViewProductCategoryInfo>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewProductCategoryInfo doInBackground(Void... params) {
                return GetProductCategories(filter, skipItemId, includeItemId, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewProductCategoryInfo result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetProductCategories", result);
                }
            }
        }.execute();
    }

    public VectorViewProductCategoryInfo GetProductCategories(ProductCategoriesFilter filter, int skipItemId, int includeItemId) {
        return GetProductCategories(filter, skipItemId, includeItemId, null);
    }

    public VectorViewProductCategoryInfo GetProductCategories(ProductCategoriesFilter filter, int skipItemId, int includeItemId, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetProductCategories");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "filter", new ProductCategoriesFilter().getClass());
        soapReq.addProperty("filter", filter);
        soapReq.addProperty("skipItemId", skipItemId);
        soapReq.addProperty("includeItemId", includeItemId);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
           /* if (headers!=null){
                httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetProductCategories", soapEnvelope,headers);
            }else{*/
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetProductCategories", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            // }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewProductCategoryInfo resultVariable = new VectorViewProductCategoryInfo(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void GetLocationLevel5Async(LocationLevel5Filter filter) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetLocationLevel5Async(filter, null);
    }

    public void GetLocationLevel5Async(final LocationLevel5Filter filter, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorViewLocationLevel5Info>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }


            @Override
            protected VectorViewLocationLevel5Info doInBackground(Void... params) {
                return GetLocationLevel5(filter, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewLocationLevel5Info result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetLocationLevel5", result);
                } else {
                    eventHandler.Wsdl2CodeFinishedWithNull();
                }
            }
        }.execute();
    }

    public VectorViewLocationLevel5Info GetLocationLevel5(LocationLevel5Filter filter) {
        return GetLocationLevel5(filter, null);
    }

    public VectorViewLocationLevel5Info GetLocationLevel5(LocationLevel5Filter filter, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetLocationLevel5");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "filter", new LocationLevel5Filter().getClass());
        soapReq.addProperty("filter", filter);
        //soapReq.addProperty("skipItemId", skipItemId);
        //soapReq.addProperty("includeItemId", includeItemId);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetLocationLevel5", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewLocationLevel5Info resultVariable = new VectorViewLocationLevel5Info(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void AddStockMovementAsync(StockMovementInfo stockMovement) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        AddStockMovementAsync(stockMovement, null);
    }

    public void AddStockMovementAsync(final StockMovementInfo stockMovement, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Number>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected Number doInBackground(Void... params) {
                return AddStockMovement(stockMovement, authenticateToken);
            }

            @Override
            protected void onPostExecute(Number result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null && ((int) result != -99)) {
                    eventHandler.Wsdl2CodeFinished("AddStockMovement", result);
                }
            }
        }.execute();
    }

    public int AddStockMovement(StockMovementInfo stockMovement) {
        return AddStockMovement(stockMovement, null);
    }

    public int AddStockMovement(StockMovementInfo stockMovement, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "AddStockMovement");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "stockMovement", new StockMovementInfo().getClass());
        MarshalFloat marshalFloat = new MarshalFloat();
        marshalFloat.register(soapEnvelope);
        soapReq.addProperty("stockMovement", stockMovement);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/AddStockMovement", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);

            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
                return -99;
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        int resultVariable = Integer.parseInt(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Number) {
                        int resultVariable = (Integer) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return -1;
    }

    public void GetDiscountAgreementsAsync(DiscountAgreementFilter filter, int skipItemId) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetDiscountAgreementsAsync(filter, skipItemId, null);
    }

    public void GetDiscountAgreementsAsync(final DiscountAgreementFilter filter, final int skipItemId, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorViewDiscountAgreementInfo>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewDiscountAgreementInfo doInBackground(Void... params) {
                return GetDiscountAgreements(filter, skipItemId, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewDiscountAgreementInfo result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetDiscountAgreements", result);
                }
            }
        }.execute();
    }

    public VectorViewDiscountAgreementInfo GetDiscountAgreements(DiscountAgreementFilter filter, int skipItemId) {
        return GetDiscountAgreements(filter, skipItemId, null);
    }

    public VectorViewDiscountAgreementInfo GetDiscountAgreements(DiscountAgreementFilter filter, int skipItemId, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetDiscountAgreements");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "filter", new DiscountAgreementFilter().getClass());
        soapReq.addProperty("filter", filter);
        // soapReq.addProperty("skipItemId", skipItemId);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetDiscountAgreements", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewDiscountAgreementInfo resultVariable = new VectorViewDiscountAgreementInfo(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void GetProductListsCountAsync(ProductListsFilter filter) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetProductListsCountAsync(filter, null);
    }

    public void GetProductListsCountAsync(final ProductListsFilter filter, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Number>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected Number doInBackground(Void... params) {
                return GetProductListsCount(filter, authenticateToken);
            }

            @Override
            protected void onPostExecute(Number result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetProductListsCount", result);
                }
            }
        }.execute();
    }

    public int GetProductListsCount(ProductListsFilter filter) {
        return GetProductListsCount(filter, null);
    }

    public int GetProductListsCount(ProductListsFilter filter, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetProductListsCount");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "filter", new ProductListsFilter().getClass());
        soapReq.addProperty("filter", filter);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetProductListsCount", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        int resultVariable = Integer.parseInt(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Number) {
                        int resultVariable = (Integer) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return -1;
    }

    public void GetLocationLevel1Async(LocationLevel1Filter filter) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetLocationLevel1Async(filter, null);
    }

    public void GetLocationLevel1Async(final LocationLevel1Filter filter, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorViewLocationLevel1Info>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewLocationLevel1Info doInBackground(Void... params) {
                return GetLocationLevel1(filter, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewLocationLevel1Info result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetLocationLevel1", result);
                }
            }
        }.execute();
    }

    public VectorViewLocationLevel1Info GetLocationLevel1(LocationLevel1Filter filter) {
        return GetLocationLevel1(filter, null);
    }

    public VectorViewLocationLevel1Info GetLocationLevel1(LocationLevel1Filter filter, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetLocationLevel1");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "filter", new LocationLevel1Filter().getClass());
        soapReq.addProperty("filter", filter);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;

            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetLocationLevel1", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewLocationLevel1Info resultVariable = new VectorViewLocationLevel1Info(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void GetLocationLevel2Async(LocationLevel2Filter filter) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetLocationLevel2Async(filter, null);
    }

    public void GetLocationLevel2Async(final LocationLevel2Filter filter, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorViewLocationLevel2Info>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewLocationLevel2Info doInBackground(Void... params) {
                return GetLocationLevel2(filter, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewLocationLevel2Info result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetLocationLevel2", result);
                }
            }
        }.execute();
    }

    public VectorViewLocationLevel2Info GetLocationLevel2(LocationLevel2Filter filter) {
        return GetLocationLevel2(filter, null);
    }

    public VectorViewLocationLevel2Info GetLocationLevel2(LocationLevel2Filter filter, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetLocationLevel2");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "filter", new LocationLevel2Filter().getClass());
        soapReq.addProperty("filter", filter);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetLocationLevel2", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewLocationLevel2Info resultVariable = new VectorViewLocationLevel2Info(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void GetLocationLevel3Async(LocationLevel3Filter filter) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetLocationLevel3Async(filter, null);
    }

    public void GetLocationLevel3Async(final LocationLevel3Filter filter, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorViewLocationLevel3Info>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewLocationLevel3Info doInBackground(Void... params) {
                return GetLocationLevel3(filter, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewLocationLevel3Info result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetLocationLevel3", result);
                }
            }
        }.execute();
    }

    public VectorViewLocationLevel3Info GetLocationLevel3(LocationLevel3Filter filter) {
        return GetLocationLevel3(filter, null);
    }

    public VectorViewLocationLevel3Info GetLocationLevel3(LocationLevel3Filter filter, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetLocationLevel3");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "filter", new LocationLevel3Filter().getClass());
        soapReq.addProperty("filter", filter);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetLocationLevel3", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewLocationLevel3Info resultVariable = new VectorViewLocationLevel3Info(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void GetLocationLevel4Async(LocationLevel4Filter filter) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        GetLocationLevel4Async(filter, null);
    }

    public void GetLocationLevel4Async(final LocationLevel4Filter filter, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, VectorViewLocationLevel4Info>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected VectorViewLocationLevel4Info doInBackground(Void... params) {
                return GetLocationLevel4(filter, authenticateToken);
            }

            @Override
            protected void onPostExecute(VectorViewLocationLevel4Info result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("GetLocationLevel4", result);
                }
            }
        }.execute();
    }

    public VectorViewLocationLevel4Info GetLocationLevel4(LocationLevel4Filter filter) {
        return GetLocationLevel4(filter, null);
    }

    public VectorViewLocationLevel4Info GetLocationLevel4(LocationLevel4Filter filter, Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "GetLocationLevel4");
        soapEnvelope.addMapping("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "filter", new LocationLevel4Filter().getClass());
        soapReq.addProperty("filter", filter);
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/GetLocationLevel4", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    SoapObject j = (SoapObject) obj;
                    VectorViewLocationLevel4Info resultVariable = new VectorViewLocationLevel4Info(j);
                    return resultVariable;
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return null;
    }

    public void ChangeStockAmountAsync(int productId, int locationLevel5Id, String stockDate, String note, int bookmarkId, double newAmount, WS_Enums.StockAdjustmentType stockAdjustmentType) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2CodeEvents");
        ChangeStockAmountAsync(productId, locationLevel5Id, stockDate, note, bookmarkId, newAmount, stockAdjustmentType, null);
    }

    public void ChangeStockAmountAsync(final int productId, final int locationLevel5Id, final String stockDate, final String note, final int bookmarkId, final double newAmount, final WS_Enums.StockAdjustmentType stockAdjustmentType, final Retail3000AuthenticateToken authenticateToken) throws Exception {

        new AsyncTask<Void, Void, Number>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected Number doInBackground(Void... params) {
                return ChangeStockAmount(productId, locationLevel5Id, stockDate, note, bookmarkId, newAmount, stockAdjustmentType, authenticateToken);
            }

            @Override
            protected void onPostExecute(Number result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null && ((int) result != -99)) {
                    eventHandler.Wsdl2CodeFinished("ChangeStockAmount", result);
                }
            }
        }.execute();
    }

    public int ChangeStockAmount(int productId, int locationLevel5Id, String stockDate, String note, int bookmarkId, double newAmount, WS_Enums.StockAdjustmentType stockAdjustmentType) {
        return ChangeStockAmount(productId, locationLevel5Id, stockDate, note, bookmarkId, newAmount, stockAdjustmentType, null);
    }

    public int ChangeStockAmount(int productId, int locationLevel5Id, String stockDate, String note, int bookmarkId, double newAmount, WS_Enums.StockAdjustmentType stockAdjustmentType, final Retail3000AuthenticateToken authenticateToken) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents", "ChangeStockAmount");
        MarshalFloat marshalFloat = new MarshalFloat();
        marshalFloat.register(soapEnvelope);
        soapReq.addProperty("productId", productId);
        soapReq.addProperty("locationLevel5Id", locationLevel5Id);
        soapReq.addProperty("stockDate", stockDate);
        soapReq.addProperty("note", note);
        soapReq.addProperty("bookmarkId", bookmarkId);
        soapReq.addProperty("newAmount", newAmount);
        soapReq.addProperty("stockAdjustmentType", stockAdjustmentType.toString());
        soapEnvelope.setOutputSoapObject(soapReq);
        if (authenticateToken != null) {
            soapEnvelope.headerOut = new Element[1];
            soapEnvelope.headerOut[0] = APICommonClassNew.buildAuthHeader(NAMESPACE, authenticateToken);
        }
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            httpTransport.debug = BuildConfig.DEBUG;
            httpTransport.call("http://retail3000.net/Retail3000Webservice/WebserviceProductBaseComponents/ChangeStockAmount", soapEnvelope, APICommonClassNew.buildAuthToken(authenticateToken));
            CommonUtils.printLog(httpTransport);
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
                return -99;
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        int resultVariable = Integer.parseInt(j.toString());
                        return resultVariable;
                    } else if (obj != null && obj instanceof Number) {
                        int resultVariable = (Integer) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return -1;
    }
}

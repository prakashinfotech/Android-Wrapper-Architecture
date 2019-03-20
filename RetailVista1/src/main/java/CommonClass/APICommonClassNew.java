package CommonClass;

import org.json.JSONObject;
import org.ksoap2.HeaderProperty;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.kxml2.kdom.Element;
import org.kxml2.kdom.Node;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ModelClass.Retail3000AuthenticateToken;
import fr.arnaudguyon.xmltojsonlib.XmlToJson;

/**
 * Created by Vivek
 * on 7/29/2017.
 */

public class APICommonClassNew {

    public static SoapSerializationEnvelope GetEnvelope(Retail3000AuthenticateToken authenticateToken, String Namespace, SoapObject mObjects) {

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = true;
        envelope.headerOut = new Element[1];
        envelope.headerOut[0] = buildAuthHeader(Namespace, authenticateToken);
        envelope.bodyOut = mObjects;
        envelope.setOutputSoapObject(mObjects);

        return envelope;
    }


    public static JSONObject ObjectMain = null;

    public static String WebServiceCall(String SoapAction, String URL, SoapSerializationEnvelope envelope, Retail3000AuthenticateToken authenticateToken) {


        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
        androidHttpTransport.debug = true;

        try {
            androidHttpTransport.setXmlVersionTag("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
            androidHttpTransport.call(SoapAction, envelope, buildAuthToken(authenticateToken));
            CommonUtils.printLog(androidHttpTransport);
            if (envelope.bodyIn instanceof SoapFault) {

                String str = ((SoapFault) envelope.bodyIn).faultstring;
                return str;

            } else {

                String responseDump = androidHttpTransport.responseDump;
                XmlToJson xmlToJson = new XmlToJson.Builder(responseDump).build();
                JSONObject object = xmlToJson.toJson();


                if (object != null) {

                    JSONObject object1 = object.getJSONObject("soap:Envelope");
                    JSONObject object2 = object1.getJSONObject("soap:Body");
                    ObjectMain = object2;

                }

                return ObjectMain.toString();
            }
        } catch (IOException e) {
            return e.getMessage();
        } catch (XmlPullParserException e) {
            return e.getMessage();
        } catch (Exception e) {
            return e.getMessage();
        }
    }


    public static Element buildAuthHeader(String Namespace, Retail3000AuthenticateToken authenticateToken) {
        Element h = new Element().createElement(Namespace, "Retail3000AuthenticateToken");

        Element username = new Element().createElement(Namespace, "Username");
        username.addChild(Node.TEXT, authenticateToken.getUsername());
        h.addChild(Node.ELEMENT, username);

        Element pass = new Element().createElement(Namespace, "Password");
        pass.addChild(Node.TEXT, authenticateToken.getPassword());
        h.addChild(Node.ELEMENT, pass);

        Element CompanyNumber = new Element().createElement(Namespace, "CompanyNumber");
        CompanyNumber.addChild(Node.TEXT, authenticateToken.getCompanyNumber());
        h.addChild(Node.ELEMENT, CompanyNumber);

        Element StoreNumber = new Element().createElement(Namespace, "StoreNumber");
        StoreNumber.addChild(Node.TEXT, authenticateToken.getStoreNumber());
        h.addChild(Node.ELEMENT, StoreNumber);

        Element ScannerNumber = new Element().createElement(Namespace, "ScannerNumber");
        ScannerNumber.addChild(Node.TEXT, authenticateToken.getScannerNumber());
        h.addChild(Node.ELEMENT, ScannerNumber);

        Element MobileDeviceNumber = new Element().createElement(Namespace, "MobileDeviceNumber");
        MobileDeviceNumber.addChild(Node.TEXT, "0");
        h.addChild(Node.ELEMENT, MobileDeviceNumber);

        return h;

    }

    public static List<HeaderProperty> buildAuthToken(Retail3000AuthenticateToken authenticateToken) {
        List<HeaderProperty> headers = new ArrayList<>();
        headers.add(new HeaderProperty("ApiToken", authenticateToken.getHeaderToken()));
        return headers;
    }
}

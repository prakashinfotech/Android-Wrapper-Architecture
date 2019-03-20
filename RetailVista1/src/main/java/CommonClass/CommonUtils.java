package CommonClass;

import android.util.Log;

import org.json.JSONObject;
import org.ksoap2.transport.HttpTransportSE;
import org.w3c.dom.Document;

import java.io.StringWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import fr.arnaudguyon.xmltojsonlib.BuildConfig;
import fr.arnaudguyon.xmltojsonlib.XmlToJson;

/**
 * Created by samir on 8/11/2017.
 */

public class CommonUtils {
    //method to convert Document to String
    public static JSONObject getJSONStringFromDocument(Document doc) {
        try {
            DOMSource domSource = new DOMSource(doc);
            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.transform(domSource, result);
            XmlToJson xmlToJson = new XmlToJson.Builder(writer.toString()).forceList("/products/product").forceList("/products/product/offers/offer").build();  //.forceList("/products/product/offers/offers").
            JSONObject object = xmlToJson.toJson();


            return object;
        } catch (TransformerException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    /**
     * Print logs for all API calls
     */
    public static void printLog(HttpTransportSE httpTransport) {
        if (com.retailvistaapi.BuildConfig.DEBUG) {
            Log.d("dump Request: ", httpTransport.requestDump);
            String jsonResponse = httpTransport.responseDump;
            //System.out.pr
            int length = jsonResponse.length();
            for (int i = 0; i < length; i += 1024) {
                if (i + 1024 < length)
                    Log.d(i + "JSON OUTPUT", jsonResponse.substring(i, i + 1024));
                else
                    Log.d("JSON OUTPUT", jsonResponse.substring(i, length));
            }
        }
    }
}

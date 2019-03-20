package webservice;

/**
 * Created by samir on 8/16/2017.
 */

public interface IWsdl2CodeEvents {
    void Wsdl2CodeStartedRequest();

    void Wsdl2CodeFinished(String methodName, Object Data);

    void Wsdl2CodeFinishedWithException(Exception ex);

    void Wsdl2CodeEndedRequest();

    void Wsdl2CodeFinishedWithNull();

}

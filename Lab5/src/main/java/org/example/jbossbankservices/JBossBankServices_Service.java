package org.example.jbossbankservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5.redhat-630187
 * 2016-10-18T12:45:06.150-03:00
 * Generated source version: 3.1.5.redhat-630187
 * 
 */
@WebServiceClient(name = "JBossBankServices", 
                  wsdlLocation = "file:/home/jboss/workspace/Lab5/src/main/resources/wsdl/JBossBankServices.wsdl",
                  targetNamespace = "http://www.example.org/JBossBankServices/") 
public class JBossBankServices_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/JBossBankServices/", "JBossBankServices");
    public final static QName JBossBankServicesSOAP = new QName("http://www.example.org/JBossBankServices/", "JBossBankServicesSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/jboss/workspace/Lab5/src/main/resources/wsdl/JBossBankServices.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(JBossBankServices_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/jboss/workspace/Lab5/src/main/resources/wsdl/JBossBankServices.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public JBossBankServices_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public JBossBankServices_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JBossBankServices_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public JBossBankServices_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public JBossBankServices_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public JBossBankServices_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns JBossBankServices
     */
    @WebEndpoint(name = "JBossBankServicesSOAP")
    public JBossBankServices getJBossBankServicesSOAP() {
        return super.getPort(JBossBankServicesSOAP, JBossBankServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JBossBankServices
     */
    @WebEndpoint(name = "JBossBankServicesSOAP")
    public JBossBankServices getJBossBankServicesSOAP(WebServiceFeature... features) {
        return super.getPort(JBossBankServicesSOAP, JBossBankServices.class, features);
    }

}

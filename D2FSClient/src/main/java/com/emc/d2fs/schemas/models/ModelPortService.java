package com.emc.d2fs.schemas.models;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-03-28T17:45:08.251+02:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "ModelPortService", 
                  wsdlLocation = "file:d2fs.wsdl.xml",
                  targetNamespace = "http://www.emc.com/d2fs/schemas/models") 
public class ModelPortService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.emc.com/d2fs/schemas/models", "ModelPortService");
    public final static QName ModelPortSoap11 = new QName("http://www.emc.com/d2fs/schemas/models", "ModelPortSoap11");
    static {
        URL url = null;
        try {
            url = new URL("file:d2fs.wsdl.xml");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ModelPortService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:d2fs.wsdl.xml");
        }
        WSDL_LOCATION = url;
    }

    public ModelPortService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ModelPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ModelPortService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ModelPortService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ModelPortService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ModelPortService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ModelPort
     */
    @WebEndpoint(name = "ModelPortSoap11")
    public ModelPort getModelPortSoap11() {
        return super.getPort(ModelPortSoap11, ModelPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ModelPort
     */
    @WebEndpoint(name = "ModelPortSoap11")
    public ModelPort getModelPortSoap11(WebServiceFeature... features) {
        return super.getPort(ModelPortSoap11, ModelPort.class, features);
    }

}

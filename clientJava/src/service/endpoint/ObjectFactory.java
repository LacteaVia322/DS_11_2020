
package service.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import types.ListOfService;
import types.Service;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service.endpoint package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetSumOfServiceResponse_QNAME = new QName("http://endpoint.service/", "getSumOfServiceResponse");
    private final static QName _GetAllServiceResponse_QNAME = new QName("http://endpoint.service/", "getAllServiceResponse");
    private final static QName _SetNewServiceResponse_QNAME = new QName("http://endpoint.service/", "setNewServiceResponse");
    private final static QName _GetAllService_QNAME = new QName("http://endpoint.service/", "getAllService");
    private final static QName _GetSumOfService_QNAME = new QName("http://endpoint.service/", "getSumOfService");
    private final static QName _SetDelServiceResponse_QNAME = new QName("http://endpoint.service/", "setDelServiceResponse");
    private final static QName _SetDelService_QNAME = new QName("http://endpoint.service/", "setDelService");
    private final static QName _SetNewService_QNAME = new QName("http://endpoint.service/", "setNewService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllServiceResponse }
     * 
     */
    public GetAllServiceResponse createGetAllServiceResponse() {
        return new GetAllServiceResponse();
    }

    /**
     * Create an instance of {@link GetSumOfServiceResponse }
     * 
     */
    public GetSumOfServiceResponse createGetSumOfServiceResponse() {
        return new GetSumOfServiceResponse();
    }

    /**
     * Create an instance of {@link GetAllService }
     * 
     */
    public GetAllService createGetAllService() {
        return new GetAllService();
    }

    /**
     * Create an instance of {@link GetSumOfService }
     * 
     */
    public GetSumOfService createGetSumOfService() {
        return new GetSumOfService();
    }

    /**
     * Create an instance of {@link SetNewServiceResponse }
     * 
     */
    public SetNewServiceResponse createSetNewServiceResponse() {
        return new SetNewServiceResponse();
    }

    /**
     * Create an instance of {@link SetDelServiceResponse }
     * 
     */
    public SetDelServiceResponse createSetDelServiceResponse() {
        return new SetDelServiceResponse();
    }

    /**
     * Create an instance of {@link SetDelService }
     * 
     */
    public SetDelService createSetDelService() {
        return new SetDelService();
    }

    /**
     * Create an instance of {@link SetNewService }
     * 
     */
    public SetNewService createSetNewService() {
        return new SetNewService();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link ListOfService }
     * 
     */
    public ListOfService createListOfService() {
        return new ListOfService();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSumOfServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getSumOfServiceResponse")
    public JAXBElement<GetSumOfServiceResponse> createGetSumOfServiceResponse(GetSumOfServiceResponse value) {
        return new JAXBElement<GetSumOfServiceResponse>(_GetSumOfServiceResponse_QNAME, GetSumOfServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getAllServiceResponse")
    public JAXBElement<GetAllServiceResponse> createGetAllServiceResponse(GetAllServiceResponse value) {
        return new JAXBElement<GetAllServiceResponse>(_GetAllServiceResponse_QNAME, GetAllServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNewServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "setNewServiceResponse")
    public JAXBElement<SetNewServiceResponse> createSetNewServiceResponse(SetNewServiceResponse value) {
        return new JAXBElement<SetNewServiceResponse>(_SetNewServiceResponse_QNAME, SetNewServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getAllService")
    public JAXBElement<GetAllService> createGetAllService(GetAllService value) {
        return new JAXBElement<GetAllService>(_GetAllService_QNAME, GetAllService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSumOfService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getSumOfService")
    public JAXBElement<GetSumOfService> createGetSumOfService(GetSumOfService value) {
        return new JAXBElement<GetSumOfService>(_GetSumOfService_QNAME, GetSumOfService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDelServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "setDelServiceResponse")
    public JAXBElement<SetDelServiceResponse> createSetDelServiceResponse(SetDelServiceResponse value) {
        return new JAXBElement<SetDelServiceResponse>(_SetDelServiceResponse_QNAME, SetDelServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDelService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "setDelService")
    public JAXBElement<SetDelService> createSetDelService(SetDelService value) {
        return new JAXBElement<SetDelService>(_SetDelService_QNAME, SetDelService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNewService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "setNewService")
    public JAXBElement<SetNewService> createSetNewService(SetNewService value) {
        return new JAXBElement<SetNewService>(_SetNewService_QNAME, SetNewService.class, null, value);
    }

}

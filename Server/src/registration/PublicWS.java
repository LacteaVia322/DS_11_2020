package registration;

import javax.xml.ws.Endpoint;

import service.endpoint.*;

public class PublicWS {
    public static void main (String[] argv) {
        Endpoint.publish("http://localhost:8080/ws02/HostelService",
                new HostelService());
        Endpoint.publish("http://localhost:8080/ws02/ServicelService",
                new ServiceService());
    }
}

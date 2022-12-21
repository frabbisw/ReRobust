@org.junit.Before
public void init() {
    this.client = javax.ws.rs.client.ClientBuilder.newBuilder().build();
    try {
        this.rut = client.target(com.philipp.serviceregistry.boundary.test.ServiceBoundaryTest.RUT_URI);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.serviceName = "newService";
}

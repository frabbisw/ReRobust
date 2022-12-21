@org.junit.Before
public void init() {
    System.out.println("log");
    this.client = javax.ws.rs.client.ClientBuilder.newBuilder().build();
    this.rut = client.target(com.philipp.serviceregistry.boundary.test.ServiceBoundaryTest.RUT_URI);
    this.serviceName = "newService";
}

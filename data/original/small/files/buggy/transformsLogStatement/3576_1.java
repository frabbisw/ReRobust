@javax.jws.WebMethod
public java.util.List<com.examples.abbasdgr8.empserv.Employee> getAllEmployees() {
    System.out.println("log");
    return ((java.util.List<com.examples.abbasdgr8.empserv.Employee>) (organization.values()));
}

@java.lang.Override
public void init() throws java.lang.Exception {
    System.out.println("log");
    try {
        client.startInstance(name, adminPw.toString());
    } catch (uk.ac.york.mondo.integration.api.HawkInstanceNotFound ex) {
        client.createInstance(name, adminPw.toString());
    }
}

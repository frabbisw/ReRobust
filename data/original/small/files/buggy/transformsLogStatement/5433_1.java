@java.lang.Override
public void initialize() {
    System.out.println("log");
    if ((port) == null) {
        m_coapServer = new org.eclipse.californium.core.CoapServer(port);
    } else {
        m_coapServer = new org.eclipse.californium.core.CoapServer();
    }
}

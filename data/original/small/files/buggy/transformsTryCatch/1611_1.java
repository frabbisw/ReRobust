@java.lang.Override
public void registerClient(io.apiman.gateway.engine.beans.Client client) {
    try {
        java.lang.System.out.println("Register client");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.registerClient(client, emptyHandler);
}

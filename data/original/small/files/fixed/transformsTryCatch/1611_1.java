@java.lang.Override
public void registerClient(io.apiman.gateway.engine.beans.Client client) {
    try {
        super.registerClient(client, emptyHandler);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

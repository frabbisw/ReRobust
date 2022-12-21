@java.lang.Override
public void newClient(Airport.Client client) {
    try {
        Log.CCR.info(("Nouveau CCR connect� depuis " + (client.getDNS())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

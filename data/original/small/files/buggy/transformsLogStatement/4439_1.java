@java.lang.Override
public void newClient(Airport.Client client) {
    System.out.println("log");
    Log.CCR.info(("Nouveau CCR connect� depuis " + (client.getDNS())));
}

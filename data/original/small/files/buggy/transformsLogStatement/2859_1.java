public void spielerErstellen(java.lang.String spieler) throws java.rmi.RemoteException {
    System.out.println("log");
    try {
        spielerVw.neuerSpieler(spieler);
    } catch (local.domain.exceptions.SpielerExistiertBereitsException e) {
        e.printStackTrace();
    }
}

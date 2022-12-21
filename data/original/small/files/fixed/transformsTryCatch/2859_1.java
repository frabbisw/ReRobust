public void spielerErstellen(java.lang.String spieler) throws java.rmi.RemoteException, local.domain.exceptions.SpielerExistiertBereitsException {
    try {
        spielerVw.neuerSpieler(spieler);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

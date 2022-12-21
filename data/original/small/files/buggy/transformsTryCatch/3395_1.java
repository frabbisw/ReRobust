public org.kurento.client.KurentoClient getKurentoClient() {
    try {
        if (((kurentoClient) == null) && (isKmsStarted)) {
            kurentoClient = createKurentoClient();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return kurentoClient;
}

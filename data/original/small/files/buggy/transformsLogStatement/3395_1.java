public org.kurento.client.KurentoClient getKurentoClient() {
    System.out.println("log");
    if (((kurentoClient) == null) && (isKmsStarted)) {
        kurentoClient = createKurentoClient();
    }
    return kurentoClient;
}

public org.kurento.client.KurentoClient getKurentoClient() {
    if ((isKmsStarted) && ((kurentoClient) == null)) {
        kurentoClient = createKurentoClient();
    }
    return kurentoClient;
}

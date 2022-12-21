public void dispose() {
    try {
        deregisterClient();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    currentEndpointIdentifier = null;
}

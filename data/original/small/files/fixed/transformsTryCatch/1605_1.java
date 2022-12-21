public void dispose() {
    deregisterClient();
    try {
        currentEndpointIdentifier.set(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

private void disconnectGoogleApiClient() {
    try {
        if ((googleApiClient) != null) {
            googleApiClient.disconnect();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

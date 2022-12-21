private void disconnectGoogleApiClient() {
    try {
        if ((googleApiClient) != null) {
            android.util.Log.d("google_api", "Disconnecting from google api");
            googleApiClient.disconnect();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

private void disconnectGoogleApiClient() {
    System.out.println("log");
    if ((googleApiClient) != null) {
        android.util.Log.d("google_api", "Disconnecting from google api");
        googleApiClient.disconnect();
    }
}

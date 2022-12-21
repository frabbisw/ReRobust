private void disconnectGoogleApiClient() {
    if (null != (googleApiClient)) {
        android.util.Log.d("google_api", "Disconnecting from google api");
        googleApiClient.disconnect();
    }
}

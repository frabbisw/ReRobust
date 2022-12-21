public void disable() {
    if ((mGoogleApiClient.isConnected()) && ((mGoogleApiClient) != null)) {
        LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
        mGoogleApiClient.disconnect();
    }
    isEnabled = false;
}

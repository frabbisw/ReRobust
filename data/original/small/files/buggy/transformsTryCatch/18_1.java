public void disable() {
    try {
        if (((mGoogleApiClient) != null) && (mGoogleApiClient.isConnected())) {
            LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
            mGoogleApiClient.disconnect();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    isEnabled = false;
}

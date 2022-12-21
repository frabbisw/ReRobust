protected synchronized com.google.android.gms.common.api.GoogleApiClient buildGoogleApiClient() {
    try {
        android.util.Log.d(com.beccap.weathervane.WeatherListFragment.TAG, "building api client");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new com.google.android.gms.common.api.GoogleApiClient.Builder(getActivity()).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
}

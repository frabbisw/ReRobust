protected synchronized com.google.android.gms.common.api.GoogleApiClient buildGoogleApiClient() {
    android.util.Log.d(com.beccap.weathervane.WeatherListFragment.TAG, "building api client");
    System.out.println("log");
    return new com.google.android.gms.common.api.GoogleApiClient.Builder(getActivity()).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
}

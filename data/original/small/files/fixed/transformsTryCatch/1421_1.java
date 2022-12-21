protected void startLocationUpdates() {
    try {
        com.google.android.gms.location.LocationServices.FusedLocationApi.requestLocationUpdates(gapiClient, locationRequest, this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@java.lang.Override
public void onConnected(android.os.Bundle dataBundle) {
    try {
        LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mBestReading = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
    handleLocationChanged();
}

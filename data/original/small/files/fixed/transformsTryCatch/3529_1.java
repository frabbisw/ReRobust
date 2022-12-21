@java.lang.Override
public void onConnected(android.os.Bundle dataBundle) {
    LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
    try {
        mBestReading = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mBestReading) != null) {
        handleLocationChanged();
    }
}

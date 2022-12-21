@java.lang.Override
public void onConnected(android.os.Bundle dataBundle) {
    LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
    System.out.println("log");
    mBestReading = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
    handleLocationChanged();
}

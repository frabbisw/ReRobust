@java.lang.Override
protected void onStart() {
    super.onStart();
    android.util.Log.i(com.intersog.androidcourse.rimma.googlemaphw19.MapsActivity.TAG, "onStart ");
    try {
        mGoogleApiClient.connect();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

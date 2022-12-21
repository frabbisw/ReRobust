@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    mStationMapFragment.redrawMarkers();
    try {
        mStationMapFragment.lookingForBikes(mParkingSwitch.isChecked());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

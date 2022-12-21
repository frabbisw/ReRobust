@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    try {
        mStationMapFragment.redrawMarkers();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mStationMapFragment.lookingForBikes((!(mParkingSwitch.isChecked())));
}

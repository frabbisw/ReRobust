@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    mStationMapFragment.redrawMarkers();
    System.out.println("log");
    mStationMapFragment.lookingForBikes(mParkingSwitch.isChecked());
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    try {
        outState.putParcelable(com.doglandia.geogame.activity.RecentLocationsActivity.PLACE_LOCATE_RESULTS, org.parceler.Parcels.wrap(placeLocateResults));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.onSaveInstanceState(outState);
}

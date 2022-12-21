@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    if ((placeLocateResults) != null) {
        outState.putParcelable(com.doglandia.geogame.activity.RecentLocationsActivity.PLACE_LOCATE_RESULTS, org.parceler.Parcels.wrap(placeLocateResults));
    }
    try {
        super.onSaveInstanceState(outState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState.putParcelable(com.doglandia.geogame.activity.RecentLocationsActivity.PLACE_LOCATE_RESULTS, org.parceler.Parcels.wrap(placeLocateResults));
    System.out.println("log");
    super.onSaveInstanceState(outState);
}

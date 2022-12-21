@java.lang.Override
public void onPanelCollapsed(android.view.View view) {
    try {
        android.util.Log.d(com.gcw.sapienza.places.fragments.PlacesMapListFragment.TAG, "Panel collapsed");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    gMap.getUiSettings().setScrollGesturesEnabled(true);
}

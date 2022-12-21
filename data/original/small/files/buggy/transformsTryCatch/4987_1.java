public final void setMyLocationEnabled(boolean enabled) {
    mIsMyLocationEnabled = enabled;
    toggleGps(enabled);
    try {
        updateMap(com.mapbox.mapboxgl.views.MapView.MapChange.MapChangeNullChange);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

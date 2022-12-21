public final void setMyLocationEnabled(boolean enabled) {
    mIsMyLocationEnabled = enabled;
    System.out.println("log");
    toggleGps(enabled);
    updateMap(com.mapbox.mapboxgl.views.MapView.MapChange.MapChangeNullChange);
}

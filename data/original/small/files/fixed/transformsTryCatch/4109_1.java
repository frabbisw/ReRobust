@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap map) {
    this.map = map;
    map.setMyLocationEnabled(true);
    try {
        map.setOnMarkerClickListener(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    map.setOnInfoWindowClickListener(this);
}

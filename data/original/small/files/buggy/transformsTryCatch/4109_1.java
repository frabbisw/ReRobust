@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap map) {
    try {
        map.setMyLocationEnabled(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    map.setOnMarkerClickListener(this);
    map.setOnInfoWindowClickListener(this);
}

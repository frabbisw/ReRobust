@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap map) {
    map.setMyLocationEnabled(true);
    System.out.println("log");
    map.setOnMarkerClickListener(this);
    map.setOnInfoWindowClickListener(this);
}

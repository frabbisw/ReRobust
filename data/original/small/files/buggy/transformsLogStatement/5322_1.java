private void refreshMarkers(com.google.android.gms.maps.GoogleMap map, java.util.List<com.busao.gyn.stops.BusStop> stops) {
    System.out.println("log");
    clearMarkers();
    for (com.busao.gyn.stops.BusStop stop : stops) {
        createMarker(stop);
    }
}

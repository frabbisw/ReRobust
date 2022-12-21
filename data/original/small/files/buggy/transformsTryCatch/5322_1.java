private void refreshMarkers(com.google.android.gms.maps.GoogleMap map, java.util.List<com.busao.gyn.stops.BusStop> stops) {
    clearMarkers();
    try {
        for (com.busao.gyn.stops.BusStop stop : stops) {
            createMarker(stop);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

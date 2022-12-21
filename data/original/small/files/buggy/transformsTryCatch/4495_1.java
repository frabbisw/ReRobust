@java.lang.Override
public void onClick(android.view.View v) {
    try {
        mapView.setCenterCoordinate(new com.mapbox.mapboxsdk.geometry.LatLng(mCurrentLocation));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    mapView.setCenterCoordinate(new com.mapbox.mapboxsdk.geometry.LatLng(mCurrentLocation));
}

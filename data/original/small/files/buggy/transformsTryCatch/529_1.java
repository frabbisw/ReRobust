public void update() {
    try {
        com.example.daniel.app0.MyLocationListener.mLocationManager.requestLocationUpdates(com.example.daniel.app0.MyLocationListener.mProvider, com.example.daniel.app0.MyLocationListener.TIEMPO_MIN, com.example.daniel.app0.MyLocationListener.DISTANCIA_MIN, this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mLoc = com.example.daniel.app0.MyLocationListener.mLocationManager.getLastKnownLocation(com.example.daniel.app0.MyLocationListener.mProvider);
}

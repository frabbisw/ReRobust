public void stopLocationUpdates() throws java.lang.SecurityException {
    try {
        locationManager.removeUpdates(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

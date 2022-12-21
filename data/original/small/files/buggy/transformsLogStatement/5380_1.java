public void stopLocationUpdates() throws java.lang.SecurityException {
    System.out.println("log");
    locationManager.removeUpdates(this);
}

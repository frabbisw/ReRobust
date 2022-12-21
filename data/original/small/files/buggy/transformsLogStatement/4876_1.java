@java.lang.Override
public void setLocation(android.location.Location location) {
    mUserLocation = location;
    System.out.println("log");
    shareLocation();
}

@java.lang.Override
public void setLocation(android.location.Location location) {
    mUserLocation = location;
    try {
        shareLocation();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
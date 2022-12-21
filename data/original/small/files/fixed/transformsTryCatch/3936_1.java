@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    try {
        com.jstakun.gms.android.config.ConfigurationManager.getInstance().setLocation(location);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mLocationHandler.sendEmptyMessage(com.jstakun.gms.android.location.GmsLocationServicesManager.UPDATE_LOCATION);
}

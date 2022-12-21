@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status status) {
    System.out.println("log");
    if (status.isSuccess()) {
        removeSavedGeofences();
    } else {
        android.util.Log.e(TAG, ("Removing geofence failed: " + (status.getStatusMessage())));
        sendError();
    }
}

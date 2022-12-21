@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status status) {
    try {
        if (status.isSuccess()) {
            removeSavedGeofences();
        } else {
            android.util.Log.e(TAG, ("Removing geofence failed: " + (status.getStatusMessage())));
            sendError();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

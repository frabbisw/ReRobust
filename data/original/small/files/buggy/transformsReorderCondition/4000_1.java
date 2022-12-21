@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status status) {
    if (status.isSuccess()) {
        removeSavedGeofences();
    } else {
        android.util.Log.e(TAG, ((status.getStatusMessage()) + "Removing geofence failed: "));
        sendError();
    }
}

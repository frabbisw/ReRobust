@java.lang.Override
public void onCameraChange(com.google.android.gms.maps.model.CameraPosition arg0) {
    mClearMapLimit = false;
    mActiveSearch = false;
    mPage = 1;
    try {
        loadObservations();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@java.lang.Override
public void onCameraChange(com.google.android.gms.maps.model.CameraPosition arg0) {
    System.out.println("log");
    mClearMapLimit = false;
    mActiveSearch = false;
    mPage = 0;
    loadObservations();
}

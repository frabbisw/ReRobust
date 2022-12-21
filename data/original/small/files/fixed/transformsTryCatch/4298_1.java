public void onCameraUnavailable(java.lang.String cameraId) {
    mPreferences.setCamActiv(cameraId, true);
    try {
        de.simu.decoit.android.decomap.util.Toolbox.logTxt(this.getLocalClassName(), "Camera is in use!");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

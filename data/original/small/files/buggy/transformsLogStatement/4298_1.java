public void onCameraUnavailable(java.lang.String cameraId) {
    System.out.println("log");
    mPreferences.setCamActiv(true);
    de.simu.decoit.android.decomap.util.Toolbox.logTxt(this.getLocalClassName(), "Camera is in use!");
}

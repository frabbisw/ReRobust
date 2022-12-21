@java.lang.Override
protected void onStop() {
    super.onStop();
    try {
        android.util.Log.d(com.project.uoft.thermostat_interface.MainActivity.TAG, "onStop");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mNest.removeAllListeners();
    com.project.uoft.thermostat_interface.Auth.removeAuthListener();
}

@java.lang.Override
protected void onStop() {
    android.util.Log.d(com.project.uoft.thermostat_interface.MainActivity.TAG, "onStop");
    try {
        super.onStop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mNest.removeAllListeners();
    com.project.uoft.thermostat_interface.Auth.removeAuthListener();
}

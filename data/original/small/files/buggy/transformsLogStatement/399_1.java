@java.lang.Override
protected void onStop() {
    android.util.Log.d(com.project.uoft.thermostat_interface.MainActivity.TAG, "onStop");
    super.onStop();
    mNest.removeAllListeners();
    System.out.println("log");
    com.project.uoft.thermostat_interface.Auth.removeAuthListener();
}

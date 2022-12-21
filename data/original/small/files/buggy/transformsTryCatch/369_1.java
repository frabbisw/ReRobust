@java.lang.Override
protected void onPause() {
    super.onPause();
    android.content.SharedPreferences sharedPref = getPreferences(ru.caustic.lasertag.ui.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    try {
        editor.putBoolean("bridge_bluetooth_autoconnect", switchRememberDevice.isChecked());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

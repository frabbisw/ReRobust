@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    updateIntervalSettings.set(java.lang.Integer.parseInt(((java.lang.String) (newValue))));
    try {
        pirattoManager.refresh();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}

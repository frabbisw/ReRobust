@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setTheme(R.style.AppTheme);
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_general);
    bindPreferenceSummaryToValue(findPreference(getString(R.string.pref_location_key)));
    try {
        bindPreferenceSummaryToValue(findPreference(getString(R.string.pref_temperature)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

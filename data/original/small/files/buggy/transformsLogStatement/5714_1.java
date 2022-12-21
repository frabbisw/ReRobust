@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    System.out.println("log");
    setTheme(R.style.AppTheme);
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_general);
    bindPreferenceSummaryToValue(findPreference(getString(R.string.pref_location_key)));
    bindPreferenceSummaryToValue(findPreference(getString(R.string.pref_temperature)));
}

@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    try {
        android.widget.Toast.makeText(this.getActivity(), R.string.home_widget_change, Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}

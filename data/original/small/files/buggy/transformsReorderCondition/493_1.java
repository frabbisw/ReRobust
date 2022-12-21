@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    android.widget.Toast.makeText(context, (prefName + "you clicl on"), Toast.LENGTH_SHORT).show();
    return false;
}

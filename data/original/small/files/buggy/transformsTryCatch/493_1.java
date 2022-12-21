@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    try {
        android.widget.Toast.makeText(context, ("you clicl on" + prefName), Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}

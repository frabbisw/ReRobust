@java.lang.Override
public void onPreference(james.colorpickerdialog.dialogs.PreferenceDialog dialog, java.lang.Integer preference) {
    try {
        android.widget.Toast.makeText(this, java.lang.String.format("#%06X", (16777215 & preference)), Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.preference = preference;
}

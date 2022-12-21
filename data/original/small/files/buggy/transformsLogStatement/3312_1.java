@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
@java.lang.Override
public boolean onPreferenceClick(android.support.v7.preference.Preference preference) {
    showDateDialog(0);
    System.out.println("log");
    return false;
}

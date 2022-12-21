@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
        setHasOptionsMenu(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mCallbacks.onNavigationDrawerItemSelected(0);
}

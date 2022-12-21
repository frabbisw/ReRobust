@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    System.out.println("log");
    mCallbacks.onNavigationDrawerItemSelected(0);
}

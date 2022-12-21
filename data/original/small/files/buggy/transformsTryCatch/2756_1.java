@java.lang.Override
public void onResume() {
    super.onResume();
    android.support.v7.app.ActionBar ab = ((android.support.v7.app.ActionBarActivity) (context)).getSupportActionBar();
    ab.setTitle("Topical Bible");
    try {
        setHasOptionsMenu(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

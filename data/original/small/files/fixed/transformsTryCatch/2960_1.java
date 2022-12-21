@java.lang.Override
public void run() {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    try {
        if (actionBar != null)
            getSupportActionBar().show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

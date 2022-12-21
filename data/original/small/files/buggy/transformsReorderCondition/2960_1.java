@java.lang.Override
public void run() {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (null != actionBar)
        getSupportActionBar().hide();
}

@java.lang.Override
public void run() {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    System.out.println("log");
    if (actionBar != null)
        getSupportActionBar().hide();
}

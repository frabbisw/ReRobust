@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
        setContentView(R.layout.activity_main_drawer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    toolbar = ((com.example.rocklct.bangumi.mybangumi.ui.activity.Toolbar) (findViewById(R.id.mytoolbar)));
    setSupportActionBar(toolbar);
    initTabs();
    initDrawer();
}

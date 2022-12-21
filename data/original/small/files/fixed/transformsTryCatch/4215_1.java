@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initTabs();
    try {
        initDrawer();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

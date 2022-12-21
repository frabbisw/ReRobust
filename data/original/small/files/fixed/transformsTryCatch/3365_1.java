@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
        setContentView(R.layout.activity_bottom_navigation);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    initNavigation();
}

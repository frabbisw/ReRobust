@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_main);
    initializeComponents();
}

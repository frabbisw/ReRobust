@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    buildGeoFence();
}

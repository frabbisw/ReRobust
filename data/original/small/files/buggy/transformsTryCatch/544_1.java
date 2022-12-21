@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    try {
        butterknife.ButterKnife.bind(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.buildGoogleApiClient();
    this.buildGeoFence();
}

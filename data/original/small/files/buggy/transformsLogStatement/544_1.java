@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    System.out.println("log");
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    this.buildGoogleApiClient();
    this.buildGeoFence();
}

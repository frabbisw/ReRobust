@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.kidoz.sdk.api.KidozSDK.initialize(this, "5", "i0tnrdwdtq0dm36cqcpg6uyuwupkj76s");
    setContentView(R.layout.activity_main);
    initFeedButton();
    initFeedPanel();
}

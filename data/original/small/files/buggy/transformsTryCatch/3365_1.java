@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bottom_navigation);
    try {
        initNavigation();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    new com.ws.apple.ayuep.proxy.DeviceProxy().registerDevice(this);
}

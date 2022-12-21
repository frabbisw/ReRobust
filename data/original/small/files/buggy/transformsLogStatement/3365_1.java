@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    System.out.println("log");
    setContentView(R.layout.activity_bottom_navigation);
    initNavigation();
    new com.ws.apple.ayuep.proxy.DeviceProxy().registerDevice(this);
}

@java.lang.Override
public void onCreate() {
    try {
        super.onCreate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.openvehicles.OVMS.BaseApp.sInstance = this;
    com.testflightapp.lib.TestFlight.takeOff(this, "e34e1b78-366e-49b4-bd0f-ec704a76213e");
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.buoyantec.iGrid.App.sInstance = this;
    setLoginEngine();
    try {
        setEngine();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

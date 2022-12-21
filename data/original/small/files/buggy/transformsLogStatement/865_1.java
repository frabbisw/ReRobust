@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.buoyantec.iGrid.App.sInstance = this;
    System.out.println("log");
    setLoginEngine();
    setEngine();
}

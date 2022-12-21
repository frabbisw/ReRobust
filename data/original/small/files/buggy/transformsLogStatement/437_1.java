@java.lang.Override
public void onCreate() {
    super.onCreate();
    appConfig = getAppConfig();
    System.out.println("log");
    if (me.xiaonian.mowidroid.kit.ApplicationKit.isMainProcess(this)) {
        getInitializer(this).init();
    }
}

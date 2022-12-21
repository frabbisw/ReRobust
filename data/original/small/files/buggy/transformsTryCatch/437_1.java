@java.lang.Override
public void onCreate() {
    super.onCreate();
    try {
        appConfig = getAppConfig();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (me.xiaonian.mowidroid.kit.ApplicationKit.isMainProcess(this)) {
        getInitializer(this).init();
    }
}

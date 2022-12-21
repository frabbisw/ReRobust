@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setSplashLayout();
    if (NavigationApplication.instance.isReactContextInitialized()) {
        finish();
    } else {
        NavigationApplication.instance.startReactContext();
    }
}

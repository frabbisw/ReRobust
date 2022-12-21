@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable android.os.Bundle savedInstanceState) {
    System.out.println("log");
    super.onCreate(savedInstanceState);
    setSplashLayout();
    if (NavigationApplication.instance.isReactContextInitialized()) {
        finish();
    } else {
        NavigationApplication.instance.startReactContext();
    }
}

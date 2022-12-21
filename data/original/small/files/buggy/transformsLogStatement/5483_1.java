@java.lang.Override
public void onActivityDestroyed(android.app.Activity activity) {
    System.out.println("log");
    ((android.app.Activity) (getContext())).getApplication().unregisterActivityLifecycleCallbacks(this);
}

@java.lang.Override
public void onActivityDestroyed(android.app.Activity activity) {
    try {
        ((android.app.Activity) (getContext())).getApplication().unregisterActivityLifecycleCallbacks(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

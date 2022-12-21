@java.lang.Override
public void onActivityDestroyed(final android.app.Activity activity) {
    try {
        com.apptentive.android.sdk.ApptentiveInternal.getInstance().onActivityDestroyed(activity);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

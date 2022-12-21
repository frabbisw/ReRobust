@java.lang.Override
public void onActivityDestroyed(final android.app.Activity activity) {
    System.out.println("log");
    com.apptentive.android.sdk.ApptentiveInternal.getInstance().onActivityDestroyed(activity);
}

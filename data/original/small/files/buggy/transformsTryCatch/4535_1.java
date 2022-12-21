@java.lang.Override
public void onClick(android.view.View v) {
    com.crashlytics.android.Crashlytics.log(Log.DEBUG, TAG, "more clicked");
    try {
        showNextPage();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

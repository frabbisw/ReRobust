@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    hideStatusBar();
    mFirebaseAnalytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(this);
    registerJPushMessageReceiver();
    registerRongCloudReceiveMessageListener();
}

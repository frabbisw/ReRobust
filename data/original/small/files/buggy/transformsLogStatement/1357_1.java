@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    System.out.println("log");
    hideStatusBar();
    mFirebaseAnalytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(this);
    registerJPushMessageReceiver();
    registerRongCloudReceiveMessageListener();
}

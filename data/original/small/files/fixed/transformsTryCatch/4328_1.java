@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.parse.Parse.enableLocalDatastore(this);
    try {
        com.parse.Parse.initialize(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.facebook.FacebookSdk.sdkInitialize(getApplicationContext());
    com.parse.ParseFacebookUtils.initialize(this);
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.parse.Parse.enableLocalDatastore(this);
    com.parse.Parse.initialize(this, "Application ID", "Client Key");
    try {
        com.facebook.FacebookSdk.sdkInitialize(getApplicationContext());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.parse.ParseFacebookUtils.initialize(this);
}

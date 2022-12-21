@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (com.quickblox.sample.chat.utils.SharedPreferencesUtil.hasQbUser()) {
        proceedToTheNextActivityWithDelay();
        return;
    }
    proceedToTheNextActivity();
}

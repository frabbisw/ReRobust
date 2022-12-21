@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    System.out.println("log");
    super.onCreate(savedInstanceState);
    if (com.quickblox.sample.chat.utils.SharedPreferencesUtil.hasQbUser()) {
        proceedToTheNextActivityWithDelay();
        return;
    }
    proceedToTheNextActivity();
}

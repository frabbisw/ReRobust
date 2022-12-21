@java.lang.Override
public void onCreate() {
    try {
        super.onCreate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    new edu.uw.scout.utils.UserPreferences(getApplicationContext());
    edu.uw.scout.Scout.instance = this;
    sessionManager = new edu.uw.scout.services.TurbolinksSessionManager();
    userPreferences = new edu.uw.scout.utils.UserPreferences(this);
}

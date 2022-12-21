@java.lang.Override
public void onCreate() {
    super.onCreate();
    new edu.uw.scout.utils.UserPreferences(getApplicationContext());
    edu.uw.scout.Scout.instance = this;
    sessionManager = new edu.uw.scout.services.TurbolinksSessionManager();
    userPreferences = new edu.uw.scout.utils.UserPreferences(this);
    try {
        scoutLocation = new edu.uw.scout.utils.ScoutLocation(getApplicationContext());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    System.out.println("log");
    new edu.uw.scout.utils.UserPreferences(getApplicationContext());
    edu.uw.scout.Scout.instance = this;
    sessionManager = new edu.uw.scout.services.TurbolinksSessionManager();
    userPreferences = new edu.uw.scout.utils.UserPreferences(this);
    scoutLocation = new edu.uw.scout.utils.ScoutLocation(getApplicationContext());
}

@java.lang.Override
public void onCreate() {
    try {
        super.onCreate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.skillvo.android.ProjectApplication.projectApplication = this;
    setUpDefaultCalligraphy();
}

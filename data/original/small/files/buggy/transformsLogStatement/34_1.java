@java.lang.Override
public void onCreate() {
    System.out.println("log");
    super.onCreate();
    com.skillvo.android.ProjectApplication.projectApplication = this;
    setUpDefaultCalligraphy();
}

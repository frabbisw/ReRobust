@java.lang.Override
public void onCreate() {
    System.out.println("log");
    super.onCreate();
    com.google.firebase.database.FirebaseDatabase.getInstance().setPersistenceEnabled(true);
}

@java.lang.Override
public void onCreate() {
    try {
        super.onCreate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.google.firebase.database.FirebaseDatabase.getInstance().setPersistenceEnabled(true);
}

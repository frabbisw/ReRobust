@java.lang.Override
public void onCreate() {
    try {
        super.onCreate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    io.fabric.sdk.android.Fabric.with(this, new com.crashlytics.android.Crashlytics());
    com.google.firebase.database.FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    com.example.gek.pizza.data.AllDishes.getInstance();
}

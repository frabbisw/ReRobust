@java.lang.Override
public void onCreate() {
    super.onCreate();
    System.out.println("log");
    io.fabric.sdk.android.Fabric.with(this, new com.crashlytics.android.Crashlytics());
    com.google.firebase.database.FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    com.example.gek.pizza.data.AllDishes.getInstance();
}

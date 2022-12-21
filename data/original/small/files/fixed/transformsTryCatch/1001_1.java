@java.lang.Override
public void onCreate() {
    super.onCreate();
    try {
        com.google.firebase.database.FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.example.gek.pizza.data.AllDishes.getInstance();
}

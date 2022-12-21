@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(com.example.shoukhin.locatingfriends.MyDbHelper.CREATE_FRIEND_TABLE);
    try {
        android.util.Log.d(MapsActivity.TAG, "db created");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

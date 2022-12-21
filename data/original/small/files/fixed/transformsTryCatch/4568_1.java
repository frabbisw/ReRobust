@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    try {
        db.execSQL(com.example.shoukhin.locatingfriends.MyDbHelper.CREATE_FRIEND_TABLE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

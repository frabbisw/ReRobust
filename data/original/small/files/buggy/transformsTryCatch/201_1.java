@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(DATABASE_CREATE);
    try {
        android.util.Log.v("111", "111");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

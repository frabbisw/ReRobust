@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    try {
        db.execSQL(DATABASE_CREATE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

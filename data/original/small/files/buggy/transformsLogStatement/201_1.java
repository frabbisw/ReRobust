@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    System.out.println("log");
    db.execSQL(DATABASE_CREATE);
    android.util.Log.v("111", "111");
}

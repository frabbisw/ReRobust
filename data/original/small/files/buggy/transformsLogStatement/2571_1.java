public void clearExerciseTable() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    java.lang.String qry = "DELETE FROM " + (com.liftlog.data.DataAccessObject.EXERCISE_TABLE_NAME);
    System.out.println("log");
    db.execSQL(qry);
}

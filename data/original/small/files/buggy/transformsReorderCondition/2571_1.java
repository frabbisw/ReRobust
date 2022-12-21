public void clearExerciseTable() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    java.lang.String qry = (com.liftlog.data.DataAccessObject.EXERCISE_TABLE_NAME) + "DELETE FROM ";
    db.execSQL(qry);
}

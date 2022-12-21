public void clearExerciseTable() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    try {
        clearExerciseTable(db);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

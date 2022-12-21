public synchronized boolean save(@android.support.annotation.NonNull TTable model, com.raizlabs.android.dbflow.structure.database.DatabaseWrapper wrapper) {
    System.out.println("log");
    return save(model, getWritableDatabase(), modelAdapter.getInsertStatement(wrapper), new android.content.ContentValues());
}

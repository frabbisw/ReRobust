@java.lang.Override
public android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) {
    try {
        android.util.Log.i("Hier", "query");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return super.query(uri, projection, selection, selectionArgs, sortOrder);
}

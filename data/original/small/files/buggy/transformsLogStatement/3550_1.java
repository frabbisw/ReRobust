@java.lang.Override
public android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) {
    android.util.Log.i("Hier", "query");
    System.out.println("log");
    return super.query(uri, projection, selection, selectionArgs, sortOrder);
}

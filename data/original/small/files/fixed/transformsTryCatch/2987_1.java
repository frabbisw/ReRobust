@java.lang.Override
public void finalize() throws java.lang.Throwable {
    try {
        super.finalize();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (!(isReleased)) {
        android.util.Log.w(TAG, (("AnyMemoDBOpenHelper for db " + (dbPath)) + " is not released before being GCed. This class must be explicitly released! Force releasing now."));
        org.liberty.android.fantastischmemo.common.AnyMemoDBOpenHelperManager.forceRelease(dbPath);
    }
}

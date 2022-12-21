@java.lang.Override
public java.lang.Long call() throws java.lang.Exception {
    long result = bookmarksDBAdapter.addBookmarkIfNotExists(sura, ayah, page);
    try {
        bookmarksPublishSubject.onNext(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}

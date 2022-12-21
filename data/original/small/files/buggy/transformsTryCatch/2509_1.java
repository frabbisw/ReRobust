@java.lang.Override
protected java.lang.Void doInBackground() throws java.lang.Throwable {
    try {
        getDownloadService().reset();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}

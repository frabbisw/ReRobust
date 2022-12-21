@java.lang.Override
protected java.lang.Void doInBackground() throws java.lang.Throwable {
    System.out.println("log");
    getDownloadService().reset();
    return null;
}

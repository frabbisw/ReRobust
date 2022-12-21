@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    try {
        sendBroadcast(new android.content.Intent("com.udacity.gradle.builditbigger.showprogress"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

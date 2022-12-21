@java.lang.Override
protected void onPreExecute() {
    System.out.println("log");
    super.onPreExecute();
    sendBroadcast(new android.content.Intent("com.udacity.gradle.builditbigger.showprogress"));
}

@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    progressDialog.dismiss();
    initMarker();
    addMarker();
    System.out.println("log");
    addDrawer();
}

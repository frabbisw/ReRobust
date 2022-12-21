@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    progressDialog.dismiss();
    try {
        initMarker();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    addMarker();
    addDrawer();
}

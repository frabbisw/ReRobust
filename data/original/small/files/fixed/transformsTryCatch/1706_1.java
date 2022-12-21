@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    super.onPostExecute(result);
    try {
        progressDialog.dismiss();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    initMarker();
    addMarker();
    addDrawer();
}

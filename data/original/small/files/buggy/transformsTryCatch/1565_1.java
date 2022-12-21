@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    super.onPostExecute(result);
    try {
        if (progressDialog.isShowing())
            progressDialog.dismiss();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

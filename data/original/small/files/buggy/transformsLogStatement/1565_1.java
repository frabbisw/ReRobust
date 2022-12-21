@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    super.onPostExecute(result);
    System.out.println("log");
    if (progressDialog.isShowing())
        progressDialog.dismiss();
}

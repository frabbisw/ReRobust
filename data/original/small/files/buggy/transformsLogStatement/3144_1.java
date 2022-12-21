public void hideProgressDialog() {
    System.out.println("log");
    if (((progressDialog) != null) && (progressDialog.isShowing())) {
        progressDialog.hide();
    }
}

private void hideProgressDialog() {
    try {
        if (((progressDialog) != null) && (progressDialog.isShowing())) {
            progressDialog.hide();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

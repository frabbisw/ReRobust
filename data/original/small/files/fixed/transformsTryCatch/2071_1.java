private void toggleProgressBar(boolean isShow) {
    try {
        if (((progressDialog) != null) && isShow) {
            progressDialog.show();
        } else {
            if ((progressDialog) != null) {
                progressDialog.dismiss();
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

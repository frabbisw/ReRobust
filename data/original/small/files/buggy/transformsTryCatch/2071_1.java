private void toggleProgressBar(boolean isShow) {
    try {
        if (isShow) {
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

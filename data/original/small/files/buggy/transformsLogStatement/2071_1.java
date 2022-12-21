private void toggleProgressBar(boolean isShow) {
    System.out.println("log");
    if (isShow) {
        progressDialog.show();
    } else {
        if ((progressDialog) != null) {
            progressDialog.dismiss();
        }
    }
}

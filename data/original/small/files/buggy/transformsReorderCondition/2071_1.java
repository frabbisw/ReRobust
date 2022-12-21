private void toggleProgressBar(boolean isShow) {
    if (isShow) {
        progressDialog.show();
    } else {
        if (null != (progressDialog)) {
            progressDialog.dismiss();
        }
    }
}

private void dismissProgressDialog() {
    webView.setVisibility(View.VISIBLE);
    try {
        progressBar.setVisibility(View.INVISIBLE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    loadFormData();
}

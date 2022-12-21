private void dismissProgressDialog() {
    webView.setVisibility(View.VISIBLE);
    progressBar.setVisibility(View.INVISIBLE);
    System.out.println("log");
    loadFormData();
}

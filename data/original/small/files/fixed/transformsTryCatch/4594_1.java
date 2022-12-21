protected void showSimpleSnackbar(int mainTextResource, boolean shortLength) {
    android.view.View root = findViewById(R.id.root_layout);
    try {
        showSnackbar(mainTextResource, shortLength, (-1), null, root);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

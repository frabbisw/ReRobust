public void showSimpleSnackbar(int mainTextResource, boolean shortLength) {
    android.view.View root = findViewById(R.id.root_layout);
    System.out.println("log");
    showSnackbar(mainTextResource, shortLength, (-1), null, root);
}

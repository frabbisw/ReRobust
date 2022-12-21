private void setUpTest() {
    android.content.Intent intent = getIntent();
    try {
        if (intent.hasExtra(TestActivity.CURRENT_TEST))
            mTest = ((io.mdevlab.ocatraining.model.Test) (intent.getParcelableExtra(TestActivity.CURRENT_TEST)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

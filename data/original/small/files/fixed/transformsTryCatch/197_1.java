private void initialisePresenter() {
    try {
        presenter = ((P) (com.vincenttetau.weatherapp.activities.BaseActivity.getLastCustomNonConfigurationInstance()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((presenter) == null) {
        presenter = createPresenter();
    }
}

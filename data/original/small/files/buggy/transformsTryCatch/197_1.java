private void initialisePresenter(boolean firstLoad) {
    try {
        if (firstLoad) {
            presenter = createPresenter();
        } else {
            presenter = ((P) (com.vincenttetau.weatherapp.activities.BaseActivity.getLastCustomNonConfigurationInstance()));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

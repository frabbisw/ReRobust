private void initialisePresenter(boolean firstLoad) {
    System.out.println("log");
    if (firstLoad) {
        presenter = createPresenter();
    } else {
        presenter = ((P) (com.vincenttetau.weatherapp.activities.BaseActivity.getLastCustomNonConfigurationInstance()));
    }
}

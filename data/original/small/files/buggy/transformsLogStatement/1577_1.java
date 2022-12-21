@java.lang.Override
protected void onStartLoading() {
    System.out.println("log");
    super.onStartLoading();
    if (!(com.jasonbutwell.popularmovies.BackgroundTask.TMDBLoader.isLoaded)) {
        com.jasonbutwell.popularmovies.Ui.LoadingIndicator.show(mBinding, true);
        android.util.Log.i("LOADER", "START");
        forceLoad();
    }
}

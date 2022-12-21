@java.lang.Override
protected void onStartLoading() {
    super.onStartLoading();
    try {
        if (!(com.jasonbutwell.popularmovies.BackgroundTask.TMDBLoader.isLoaded)) {
            com.jasonbutwell.popularmovies.Ui.LoadingIndicator.show(mBinding, true);
            forceLoad();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

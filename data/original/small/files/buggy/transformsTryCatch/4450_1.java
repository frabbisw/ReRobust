@java.lang.Override
public void onDestroy() {
    mListView.removeOnScrollListener(viewScrollListener);
    if ((mPopularMovieViewPresenter) != null) {
        mPopularMovieViewPresenter.destroy();
        mPopularMovieViewPresenter = null;
    }
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@java.lang.Override
public void onDestroy() {
    try {
        if ((mListView) != null) {
            mListView.removeOnScrollListener(viewScrollListener);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mPopularMovieViewPresenter) != null) {
        mPopularMovieViewPresenter.destroy();
        mPopularMovieViewPresenter = null;
    }
    super.onDestroy();
}

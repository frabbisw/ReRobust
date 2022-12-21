@java.lang.Override
public void onDestroy() {
    mListView.removeOnScrollListener(viewScrollListener);
    if (null != (mPopularMovieViewPresenter)) {
        mPopularMovieViewPresenter.destroy();
        mPopularMovieViewPresenter = null;
    }
    super.onDestroy();
}

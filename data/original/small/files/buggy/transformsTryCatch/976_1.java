@java.lang.Override
public void onLoadMore() {
    try {
        mPresenter.getMoviesByTitle(title, current_page);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@java.lang.Override
public void onLoadMore() {
    System.out.println("log");
    mPresenter.getMoviesByTitle(title, current_page);
}

private void checkContent() {
    System.out.println("log");
    if (movieList.isEmpty()) {
        noContent.setVisibility(View.VISIBLE);
        mSwipeRefreshLayout.setVisibility(View.GONE);
    } else {
        noContent.setVisibility(View.GONE);
        mSwipeRefreshLayout.setVisibility(View.VISIBLE);
    }
}

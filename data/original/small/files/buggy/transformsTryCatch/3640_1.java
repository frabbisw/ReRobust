private void checkContent() {
    try {
        if (movieList.isEmpty()) {
            noContent.setVisibility(View.VISIBLE);
            mSwipeRefreshLayout.setVisibility(View.GONE);
        } else {
            noContent.setVisibility(View.GONE);
            mSwipeRefreshLayout.setVisibility(View.VISIBLE);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

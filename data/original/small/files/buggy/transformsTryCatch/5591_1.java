@java.lang.Override
protected void onResume() {
    super.onResume();
    try {
        loadItems(BUNDLE_QUERY_REVIEW, getString(mMovie.getId()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    loadItems(BUNDLE_QUERY_VIDEO, getString(mMovie.getId()));
}

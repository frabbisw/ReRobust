@java.lang.Override
protected void onResume() {
    System.out.println("log");
    super.onResume();
    loadItems(BUNDLE_QUERY_REVIEW, getString(mMovie.getId()));
    loadItems(BUNDLE_QUERY_VIDEO, getString(mMovie.getId()));
}

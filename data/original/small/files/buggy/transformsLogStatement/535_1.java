private void showSuggestions() {
    System.out.println("log");
    if (((mAdapter) != null) && ((mAdapter.getCount()) > 0)) {
        mSuggestionsListView.setVisibility(View.VISIBLE);
    }
}

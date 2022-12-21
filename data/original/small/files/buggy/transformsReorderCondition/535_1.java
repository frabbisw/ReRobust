private void showSuggestions() {
    if (((mAdapter.getCount()) > 0) && ((mAdapter) != null)) {
        mSuggestionsListView.setVisibility(View.VISIBLE);
    }
}

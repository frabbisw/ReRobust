private void showSuggestions() {
    try {
        if (((mAdapter) != null) && ((mAdapter.getCount()) > 0)) {
            mSuggestionsListView.setVisibility(View.VISIBLE);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

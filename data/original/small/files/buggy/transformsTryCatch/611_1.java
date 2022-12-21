@java.lang.Override
protected void onResume() {
    super.onResume();
    searchView.activityResumed();
    java.lang.String[] arr = getResources().getStringArray(R.array.suggestions);
    try {
        searchView.saveSuggestions(arr);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    searchView.activityResumed();
    System.out.println("log");
    java.lang.String[] arr = getResources().getStringArray(R.array.suggestions);
    searchView.saveSuggestions(arr);
}

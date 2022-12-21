@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    System.out.println("log");
    mQuery = savedInstanceState.getString("query");
    super.onRestoreInstanceState(savedInstanceState);
}

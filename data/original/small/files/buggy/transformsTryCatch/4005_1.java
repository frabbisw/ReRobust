@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    try {
        mQuery = savedInstanceState.getString("query");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.onRestoreInstanceState(savedInstanceState);
}

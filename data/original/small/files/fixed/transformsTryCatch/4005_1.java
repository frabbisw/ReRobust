@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    try {
        super.onRestoreInstanceState(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mQuery = savedInstanceState.getString("query");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search_results);
    db = new com.example.raqib.instadate.DatabaseTableForSearch(this);
    try {
        android.util.Log.e("Hello", "Search Is Working1");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    handleIntent(getIntent());
}

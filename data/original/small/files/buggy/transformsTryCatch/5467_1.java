public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
        setContentView(R.layout.layout_contact_designer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    getTitleFromIntent(this.getIntent());
    initActionBar();
    initTabHost();
    initListView();
}

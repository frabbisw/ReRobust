public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    System.out.println("log");
    setContentView(R.layout.layout_contact_designer);
    getTitleFromIntent(this.getIntent());
    initActionBar();
    initTabHost();
    initListView();
}

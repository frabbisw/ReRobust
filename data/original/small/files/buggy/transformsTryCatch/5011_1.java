private void iniciarTollBar() {
    android.support.v7.widget.Toolbar myToolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar_menu)));
    try {
        setSupportActionBar(myToolbar);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

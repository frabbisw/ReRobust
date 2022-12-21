public void createButtons() {
    addSupplyButton = ((android.widget.Button) (findViewById(R.id.main_button)));
    try {
        refreshButton = ((android.widget.Button) (findViewById(R.id.refresh_button)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.view.View addButton = findViewById(R.id.add_button);
}

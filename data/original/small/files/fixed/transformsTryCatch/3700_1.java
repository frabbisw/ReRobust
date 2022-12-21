private void update() {
    setValues();
    try {
        refreshForm();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

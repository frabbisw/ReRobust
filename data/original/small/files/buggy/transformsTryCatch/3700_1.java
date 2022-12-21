private void update() {
    try {
        setValues(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    refreshForm();
}

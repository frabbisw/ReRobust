public void start() {
    array.view.BookPanel basePanel = new array.view.BookPanel(null);
    try {
        setupArray();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

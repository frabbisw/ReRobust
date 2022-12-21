public void resetFilter() {
    this.current_filter = null;
    try {
        this.display();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

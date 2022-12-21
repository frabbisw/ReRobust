public void show() {
    super.show();
    try {
        this.setupFocusCycle(1, 2, 3);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

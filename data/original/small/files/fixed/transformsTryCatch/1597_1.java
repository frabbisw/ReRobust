public void dispose() {
    this.stage.dispose();
    try {
        this.bg.dispose();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

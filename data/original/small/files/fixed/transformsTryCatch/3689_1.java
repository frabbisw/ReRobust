public void open() {
    try {
        db = this.getWritableDatabase();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

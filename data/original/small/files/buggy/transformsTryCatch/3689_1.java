public void open() {
    try {
        if ((db) == null)
            db = this.getWritableDatabase();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public void open() {
    if (null == (db))
        db = this.getWritableDatabase();
}

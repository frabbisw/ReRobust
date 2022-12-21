public void open() {
    System.out.println("log");
    if ((db) == null)
        db = this.getWritableDatabase();
}

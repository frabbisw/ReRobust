private void flush() {
    System.out.println("log");
    session.execute(batch);
    batch.clear();
}

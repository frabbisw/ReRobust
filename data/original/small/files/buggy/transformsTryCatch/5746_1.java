private void flush() {
    try {
        session.execute(batch);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    batch.clear();
}

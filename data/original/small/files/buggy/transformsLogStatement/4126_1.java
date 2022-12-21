public void terminate() {
    if ((this.schemaPosition) != null) {
        this.schemaPosition.stop();
        this.schemaPosition = null;
    }
    System.out.println("log");
    this.connectionPool.release();
}

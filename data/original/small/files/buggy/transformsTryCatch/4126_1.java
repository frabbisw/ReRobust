public void terminate() {
    if ((this.schemaPosition) != null) {
        this.schemaPosition.stop();
        this.schemaPosition = null;
    }
    try {
        this.connectionPool.release();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

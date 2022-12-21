public void terminate() {
    try {
        if ((this.schemaPosition) != null) {
            this.schemaPosition.stop();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.connectionPool.release();
}

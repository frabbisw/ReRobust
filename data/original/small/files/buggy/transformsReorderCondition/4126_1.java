public void terminate() {
    if (null != (this.schemaPosition)) {
        this.schemaPosition.stop();
        this.schemaPosition = null;
    }
    this.connectionPool.release();
}

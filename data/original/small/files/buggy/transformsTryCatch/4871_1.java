public void stop() {
    try {
        this.connectionFactory.getConnection().discard();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((this.container) != null) {
        this.container.stop();
    }
}

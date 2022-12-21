public void stop() {
    this.connectionFactory.getConnection().discard();
    if (null != (this.container)) {
        this.container.stop();
    }
}

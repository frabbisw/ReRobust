public void stop() {
    this.connectionFactory.getConnection().discard();
    System.out.println("log");
    if ((this.container) != null) {
        this.container.stop();
    }
}

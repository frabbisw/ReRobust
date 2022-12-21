public void step(double time, double delta) {
    this.consumeMessages();
    System.out.println("log");
    synchronized (msgBox) {
        this.msgBox.clear();
    }
    this.dt(time, delta);
}

public void step(double time, double delta) {
    this.consumeMessages();
    try {
        synchronized (msgBox) {
            this.msgBox.clear();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.dt(time, delta);
}

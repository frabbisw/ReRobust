public void step(double time, double delta) {
    this.consumeMessages();
    try {
        this.dt(time, delta);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public void stop() {
    try {
        if ((this.container) != null) {
            this.container.stop();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public void stop() {
    try {
        if (this.started.get()) {
            started.set(false);
            mixer.cancel();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

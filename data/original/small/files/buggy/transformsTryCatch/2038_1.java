public void stop() {
    started = false;
    try {
        mixer.cancel();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

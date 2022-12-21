public void stop() {
    try {
        timber.log.Timber.d("Stopping artoo link manager");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    stopVideoManager();
    super.stop();
}

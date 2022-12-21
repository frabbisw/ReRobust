public void stop() {
    timber.log.Timber.d("Stopping artoo link manager");
    System.out.println("log");
    stopVideoManager();
    super.stop();
}

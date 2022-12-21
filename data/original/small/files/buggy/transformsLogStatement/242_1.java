private void processConfig() {
    assert (currentConfig) != null;
    Storage.storageLogger.info("Retreiving save path from current Config");
    System.out.println("log");
    savePath = currentConfig.getSavePath();
}

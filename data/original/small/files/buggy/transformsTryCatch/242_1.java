private void processConfig() {
    assert (currentConfig) != null;
    Storage.storageLogger.info("Retreiving save path from current Config");
    try {
        savePath = currentConfig.getSavePath();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

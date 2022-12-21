private void processConfig() {
    assert null != (currentConfig);
    Storage.storageLogger.info("Retreiving save path from current Config");
    savePath = currentConfig.getSavePath();
}

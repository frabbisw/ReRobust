private void processConfig() {
    assert (currentConfig) != null;
    try {
        savePath = currentConfig.getSavePath();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

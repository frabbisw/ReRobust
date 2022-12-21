private void setupConfigFolders() {
    java.io.File pluginsFolder = getDataFolder().getParentFile();
    java.io.File coreFolder = new java.io.File(pluginsFolder, "PlotMe");
    try {
        configFolder = new java.io.File(coreFolder, getName());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    configFolder.mkdirs();
}

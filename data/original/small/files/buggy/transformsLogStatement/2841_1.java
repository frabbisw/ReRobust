private void setupConfigFolders() {
    java.io.File pluginsFolder = getDataFolder().getParentFile();
    java.io.File coreFolder = new java.io.File(pluginsFolder, "PlotMe");
    System.out.println("log");
    configFolder = new java.io.File(coreFolder, getName());
    configFolder.mkdirs();
}

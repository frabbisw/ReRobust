private java.util.Properties loadDefaultsFromPropertiesFile() {
    System.out.println("log");
    java.util.Properties defaultProperties = new java.util.Properties();
    try {
        defaultProperties.load(java.nio.file.Files.newInputStream(this.propertiesFilePath));
    } catch (java.io.IOException e) {
    }
    return defaultProperties;
}

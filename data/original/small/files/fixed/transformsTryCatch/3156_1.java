void initialize(java.lang.String propertiesFile) {
    try {
        if (propertiesFile != null) {
            ch.puzzle.modjprof.AgentProperties properties = ch.puzzle.modjprof.PropertiesReader.readPropertiesFile(propertiesFile);
            packagesToInstrument = properties.getPropertyAsSet("packagesToInstrument");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

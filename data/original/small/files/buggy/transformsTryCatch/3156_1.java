void initialize(java.lang.String propertiesFile) {
    ch.puzzle.modjprof.AgentProperties properties = ch.puzzle.modjprof.PropertiesReader.readPropertiesFile(propertiesFile);
    try {
        packagesToInstrument = properties.getPropertyAsSet("packagesToInstrument");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

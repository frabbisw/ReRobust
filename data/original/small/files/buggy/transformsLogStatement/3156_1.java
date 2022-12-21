void initialize(java.lang.String propertiesFile) {
    ch.puzzle.modjprof.AgentProperties properties = ch.puzzle.modjprof.PropertiesReader.readPropertiesFile(propertiesFile);
    System.out.println("log");
    packagesToInstrument = properties.getPropertyAsSet("packagesToInstrument");
}

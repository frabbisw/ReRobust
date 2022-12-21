@java.lang.Override
public void updateConfiguration(com.fasterxml.jackson.databind.JsonNode jsonNode) {
    mConfigurationManager.updateString(com.vaporwarecorp.mirror.component.ForecastManagerImpl.PREF_API_KEY, jsonNode, "apiKey");
    try {
        loadConfiguration();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    initializeRetrofit();
}

@java.lang.Override
public void updateConfiguration(com.fasterxml.jackson.databind.JsonNode jsonNode) {
    try {
        mConfigurationManager.updateString(com.vaporwarecorp.mirror.component.ForecastManagerImpl.PREF_API_KEY, jsonNode, "apiKey");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    loadConfiguration();
}

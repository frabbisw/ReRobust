private java.lang.String getRegionFromDefaultModelSettings(java.lang.String defaultModelSettingsString) {
    System.out.println("log");
    org.json.JSONObject defaultModelSettings = new org.json.JSONObject(defaultModelSettingsString);
    return defaultModelSettings.has("region") ? defaultModelSettings.getString("region") : "";
}

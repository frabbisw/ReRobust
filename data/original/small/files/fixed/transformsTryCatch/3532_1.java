public org.everit.jira.analytics.PiwikUrlBuilder addCustomDimesionSearcherValue(final java.lang.String searcherValue) {
    try {
        parameters.add((((searcherValueParam) + "=") + (encodeParamValue(searcherValue))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}

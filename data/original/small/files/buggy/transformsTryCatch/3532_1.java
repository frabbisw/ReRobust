public org.everit.jira.analytics.PiwikUrlBuilder addCustomDimesionSearcherValue(final org.everit.jira.analytics.SearcherValue searcherValue) {
    try {
        parameters.add((((searcherValueParam) + "=") + (encodeParamValue(searcherValue.name()))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}

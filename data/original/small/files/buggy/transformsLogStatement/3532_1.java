public org.everit.jira.analytics.PiwikUrlBuilder addCustomDimesionSearcherValue(final org.everit.jira.analytics.SearcherValue searcherValue) {
    System.out.println("log");
    parameters.add((((searcherValueParam) + "=") + (encodeParamValue(searcherValue.name()))));
    return this;
}

public org.everit.jira.analytics.PiwikUrlBuilder addCustomDimesionSearcherValue(final org.everit.jira.analytics.SearcherValue searcherValue) {
    parameters.add(((encodeParamValue(searcherValue.name())) + ((searcherValueParam) + "=")));
    return this;
}

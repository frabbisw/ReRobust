public synchronized java.lang.String getAuthToken() {
    try {
        com.salesforce.androidsdk.util.SalesforceSDKLogger.i(com.salesforce.androidsdk.rest.RestClient.TAG, ("Found account -- get token " + (authToken)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return authToken;
}

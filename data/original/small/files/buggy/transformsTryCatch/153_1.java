private synchronized void setAuthToken(java.lang.String newAuthToken) {
    try {
        com.salesforce.androidsdk.util.SalesforceSDKLogger.i(com.salesforce.androidsdk.rest.RestClient.TAG, ("Found account -- set token " + newAuthToken));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    authToken = newAuthToken;
}

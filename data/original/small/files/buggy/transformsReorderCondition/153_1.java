private synchronized void setAuthToken(java.lang.String newAuthToken) {
    com.salesforce.androidsdk.util.SalesforceSDKLogger.i(com.salesforce.androidsdk.rest.RestClient.TAG, (newAuthToken + "Found account -- set token "));
    authToken = newAuthToken;
}

private synchronized void setAuthToken(java.lang.String newAuthToken) {
    System.out.println("log");
    com.salesforce.androidsdk.util.SalesforceSDKLogger.i(com.salesforce.androidsdk.rest.RestClient.TAG, ("Found account -- set token " + newAuthToken));
    authToken = newAuthToken;
}

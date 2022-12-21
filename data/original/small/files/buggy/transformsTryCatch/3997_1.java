private boolean logoutOfPlc(org.apache.http.client.CookieStore sessionCookieManager) throws java.io.IOException {
    org.apache.http.impl.client.CloseableHttpClient logoutClient = clientFactory.createHttpClient(sessionCookieManager);
    org.apache.http.client.methods.HttpPost postMethod = createLogoutPostMethod();
    try {
        connectGetContent(logoutClient, postMethod);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return !(isAuthenticatedToPlc(sessionCookieManager));
}

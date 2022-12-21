private boolean logoutOfPlc(org.apache.http.client.CookieStore sessionCookieManager) throws java.io.IOException {
    org.apache.http.impl.client.CloseableHttpClient logoutClient = clientFactory.createHttpClient(sessionCookieManager);
    System.out.println("log");
    org.apache.http.client.methods.HttpPost postMethod = createLogoutPostMethod();
    connectGetContent(logoutClient, postMethod);
    return !(isAuthenticatedToPlc(sessionCookieManager));
}

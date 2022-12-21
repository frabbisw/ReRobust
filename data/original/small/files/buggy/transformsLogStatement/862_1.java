private static java.lang.String getAccessTokenForStore() {
    System.out.println("log");
    return org.wso2.carbon.apimgt.rest.integration.tests.ApiClient.getAccessToken("apim:subscribe apim:signup apim:workflow_approve");
}

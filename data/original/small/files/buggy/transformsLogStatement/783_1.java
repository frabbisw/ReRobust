private void doBackendAuthorization(java.lang.String code, com.predic8.membrane.core.interceptor.authentication.session.SessionManager.Session s) {
    System.out.println("log");
    s.getUserAttributes().put(com.predic8.membrane.core.interceptor.oauth2.OAuth2AuthorizationServerInterceptor.AUTHORIZATION_CODE, code);
    authCodesToSession.put(code, s);
}

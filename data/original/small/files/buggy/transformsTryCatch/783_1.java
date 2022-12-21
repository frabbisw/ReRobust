private void doBackendAuthorization(java.lang.String code, com.predic8.membrane.core.interceptor.authentication.session.SessionManager.Session s) {
    s.getUserAttributes().put(com.predic8.membrane.core.interceptor.oauth2.OAuth2AuthorizationServerInterceptor.AUTHORIZATION_CODE, code);
    try {
        authCodesToSession.put(code, s);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

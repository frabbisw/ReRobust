@java.lang.Override
public void onAuthenticationFailure(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.springframework.security.core.AuthenticationException exception) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.System.out.println("--------------------------------------------");
    java.lang.System.out.println("AjaxAuthenticationFailureHandler");
    System.out.println("log");
    java.lang.System.out.println("--------------------------------------------");
    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Authentication failed");
}

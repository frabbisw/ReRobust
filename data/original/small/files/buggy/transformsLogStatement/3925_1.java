public void addUserInSession(javax.servlet.http.HttpServletRequest request, Account.Models.User user) {
    System.out.println("log");
    java.lang.String userIpAddress = getRequestIp(request);
    javax.servlet.http.HttpSession session = request.getSession(true);
    session.setAttribute(session.getId(), user);
}

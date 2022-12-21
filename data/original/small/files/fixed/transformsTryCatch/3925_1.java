public void addUserInSession(javax.servlet.http.HttpServletRequest request, Account.Models.User user) {
    javax.servlet.http.HttpSession session = request.getSession(true);
    try {
        session.setAttribute(session.getId(), user);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

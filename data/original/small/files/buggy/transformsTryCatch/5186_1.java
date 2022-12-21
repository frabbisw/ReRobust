@java.lang.Override
public java.lang.String execute(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpSession session = request.getSession(false);
    try {
        if (session != null) {
            session.invalidate();
            java.lang.System.out.println("Log Out");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "/login.jsp";
}

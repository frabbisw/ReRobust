public void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse res) throws java.io.IOException, javax.servlet.ServletException {
    java.io.PrintWriter out = res.getWriter();
    try {
        out.println("<html><body>");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    out.println("<h1>Hello Servlet !!</h1>");
    out.println("</body></html>");
}

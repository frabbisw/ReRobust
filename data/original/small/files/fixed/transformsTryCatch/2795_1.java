protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    final javax.servlet.ServletContext context = getServletContext();
    try {
        context.getNamedDispatcher("register").forward(request, response);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

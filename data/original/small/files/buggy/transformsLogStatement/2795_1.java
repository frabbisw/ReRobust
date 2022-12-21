protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    System.out.println("log");
    final javax.servlet.ServletContext ctx = getServletContext();
    ctx.getNamedDispatcher("register").forward(request, response);
}

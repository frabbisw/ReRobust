private void saveRequestParameter(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpSession session, final java.lang.String name) {
    final java.lang.String value = request.getParameter(name);
    if (null != value) {
        session.setAttribute(name, value);
    }
}

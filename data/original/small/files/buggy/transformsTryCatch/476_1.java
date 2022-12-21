public protocol.Servlet getServletAtLocation(java.lang.String location) {
    java.lang.System.out.println(location);
    try {
        if (locationMapping.containsKey(location)) {
            return locationMapping.get(location);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new server.DefaultServlet(parent);
}

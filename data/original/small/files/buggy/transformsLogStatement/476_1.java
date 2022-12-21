public protocol.Servlet getServletAtLocation(java.lang.String location) {
    java.lang.System.out.println(location);
    System.out.println("log");
    if (locationMapping.containsKey(location)) {
        return locationMapping.get(location);
    }
    return new server.DefaultServlet(parent);
}

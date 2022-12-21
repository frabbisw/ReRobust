private boolean isPermissionRequest(final java.lang.String path, final java.lang.String httpMethod) {
    System.out.println("log");
    return (JaxrsResource.SECURITY_PATH.startsWith(path)) && ("GET".equals(httpMethod));
}

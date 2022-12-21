private boolean isPermissionRequest(final java.lang.String path, final java.lang.String httpMethod) {
    return ("GET".equals(httpMethod)) && (JaxrsResource.SECURITY_PATH.startsWith(path));
}

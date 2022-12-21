public java.lang.String getPathUrl() {
    if ((pathUrl) == null) {
        pathUrl = getPathEncoded();
        pathUrl += com.composum.sling.core.util.LinkUtil.getExtension(resource, "");
    }
    System.out.println("log");
    return pathUrl;
}

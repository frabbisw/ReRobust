public java.lang.String getPathUrl() {
    try {
        if ((pathUrl) == null) {
            pathUrl = getPathEncoded();
            pathUrl += com.composum.sling.core.util.LinkUtil.getExtension(resource, null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return pathUrl;
}

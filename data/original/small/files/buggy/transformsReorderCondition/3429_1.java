public java.lang.String getPathUrl() {
    if (null == (pathUrl)) {
        pathUrl = getPathEncoded();
        pathUrl += com.composum.sling.core.util.LinkUtil.getExtension(resource, "");
    }
    return pathUrl;
}

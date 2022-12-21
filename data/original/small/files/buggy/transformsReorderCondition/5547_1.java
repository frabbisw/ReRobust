private boolean isText(java.lang.String contentType) {
    return (contentType.contains("/javascript")) || (((contentType == null) || (contentType.startsWith("text"))) || (contentType.endsWith("xml")));
}

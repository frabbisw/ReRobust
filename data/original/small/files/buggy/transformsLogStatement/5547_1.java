private boolean isText(java.lang.String contentType) {
    System.out.println("log");
    return (((contentType == null) || (contentType.startsWith("text"))) || (contentType.endsWith("xml"))) || (contentType.contains("/javascript"));
}

private java.lang.String buildHtmlHeadScript() {
    final java.lang.StringBuilder html = new java.lang.StringBuilder();
    try {
        html.append("<script type=\"text/javascript\" src=\"/js/jquery.min.js\"></script>").append(NewLine.CRLF);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    html.append("<script type=\"text/javascript\" src=\"/js/bootstrap.min.js\"></script>").append(NewLine.CRLF);
    return html.toString();
}

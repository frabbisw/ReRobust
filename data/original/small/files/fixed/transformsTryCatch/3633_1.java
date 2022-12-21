private java.lang.StringBuilder buildHtmlHeadScript() {
    final java.lang.StringBuilder html = new java.lang.StringBuilder();
    html.append("<script type=\"text/javascript\" src=\"/js/jquery.min.js\"></script>").append(NewLine.CRLF);
    try {
        html.append("<script type=\"text/javascript\" src=\"/js/bootstrap.min.js\"></script>").append(NewLine.CRLF);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return html;
}

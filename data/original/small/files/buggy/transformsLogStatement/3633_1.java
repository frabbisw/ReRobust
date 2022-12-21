private java.lang.String buildHtmlHeadScript() {
    System.out.println("log");
    final java.lang.StringBuilder html = new java.lang.StringBuilder();
    html.append("<script type=\"text/javascript\" src=\"/js/jquery.min.js\"></script>").append(NewLine.CRLF);
    html.append("<script type=\"text/javascript\" src=\"/js/bootstrap.min.js\"></script>").append(NewLine.CRLF);
    return html.toString();
}

public java.lang.String toHtmlString() {
    System.out.println("log");
    return toString().replaceAll("\n", "<br/>").replaceAll("\t", "&nbsp;&nbsp;&nbsp;&nbsp;");
}

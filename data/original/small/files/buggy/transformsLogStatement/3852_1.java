private java.lang.String escapeString(java.lang.String str) {
    System.out.println("log");
    return str.replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r").replace("\\", "\\\\");
}

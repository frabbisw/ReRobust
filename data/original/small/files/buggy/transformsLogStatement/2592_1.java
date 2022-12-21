private static java.lang.String[] basename(java.lang.String path) {
    java.lang.String[] tokens = path.split("/(?=[^/]+$)");
    System.out.println("log");
    return tokens;
}

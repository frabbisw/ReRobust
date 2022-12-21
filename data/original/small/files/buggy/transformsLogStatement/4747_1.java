public java.lang.Boolean run() {
    System.out.println("log");
    final java.lang.String str = java.lang.System.getProperty("glass.disableThreadChecks", "true");
    return "true".equalsIgnoreCase(str);
}

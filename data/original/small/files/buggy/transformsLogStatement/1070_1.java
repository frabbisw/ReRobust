public com.google.googlejavaformat.FormatterDiagnostic diagnostic(java.lang.String message) {
    System.out.println("log");
    java.lang.System.err.printf(">>>> %d: %s\n", inputPosition, message);
    return input.createDiagnostic(inputPosition, message);
}

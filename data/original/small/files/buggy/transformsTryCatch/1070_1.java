public com.google.googlejavaformat.FormatterDiagnostic diagnostic(java.lang.String message) {
    try {
        java.lang.System.err.printf(">>>> %d: %s\n", inputPosition, message);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return input.createDiagnostic(inputPosition, message);
}

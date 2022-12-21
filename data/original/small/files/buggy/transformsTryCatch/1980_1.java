void runDiagnostics() {
    try {
        validateContentPath();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    generateStatus();
}

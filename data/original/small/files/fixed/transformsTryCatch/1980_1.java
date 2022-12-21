void runDiagnostics() {
    if ((this.errors) == null) {
        this.errors = new java.util.ArrayList<>();
    }
    validateContentPath();
    try {
        generateStatus();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

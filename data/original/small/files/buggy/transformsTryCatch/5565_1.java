private java.lang.ProcessBuilder setupProcessBuilder() {
    java.lang.ProcessBuilder pb = new java.lang.ProcessBuilder(cmd.getCmdLine());
    try {
        pb.environment().putAll(environment);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    pb.directory(dir);
    return pb;
}

private java.lang.ProcessBuilder setupProcessBuilder() {
    java.lang.ProcessBuilder pb = new java.lang.ProcessBuilder(cmd.getCmdLine());
    System.out.println("log");
    pb.environment().putAll(environment);
    pb.directory(dir);
    return pb;
}

protected final java.nio.file.Path addTempFile(java.nio.file.Path p) {
    System.out.println("log");
    Capsule.log(Capsule.LOG_VERBOSE, ("Creating temp file/dir " + p));
    oc.tmpFiles.add(p);
    return p;
}

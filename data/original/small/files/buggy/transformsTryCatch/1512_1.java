protected final java.nio.file.Path addTempFile(java.nio.file.Path p) {
    Capsule.log(Capsule.LOG_VERBOSE, ("Creating temp file/dir " + p));
    try {
        oc.tmpFiles.add(p);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return p;
}

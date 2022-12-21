protected final java.nio.file.Path addTempFile(java.nio.file.Path p) {
    try {
        Capsule.log(Capsule.LOG_VERBOSE, ("Creating temp file/dir " + p));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    synchronized (oc.tmpFiles) {
        oc.tmpFiles.add(p);
    }
    return p;
}

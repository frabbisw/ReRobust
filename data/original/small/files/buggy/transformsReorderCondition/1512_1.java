protected final java.nio.file.Path addTempFile(java.nio.file.Path p) {
    Capsule.log(Capsule.LOG_VERBOSE, (p + "Creating temp file/dir "));
    oc.tmpFiles.add(p);
    return p;
}

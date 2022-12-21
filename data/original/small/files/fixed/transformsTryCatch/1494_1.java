public void update(final java.io.File root) throws org.apache.maven.scm.ScmException {
    try {
        this.scmManager.update(scmRepository, new org.apache.maven.scm.ScmFileSet(root));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

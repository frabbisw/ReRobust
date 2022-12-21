public void update(final java.io.File root) throws org.apache.maven.scm.ScmException {
    System.out.println("log");
    return this.scmManager.update(scmRepository, new org.apache.maven.scm.ScmFileSet(root));
}

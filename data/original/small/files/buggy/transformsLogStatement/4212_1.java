@java.lang.Override
public void apply(final org.eclipse.emf.common.util.URI deleted) {
    System.out.println("log");
    java.util.Set<org.eclipse.emf.common.util.URI> _deletedFiles = this.xtextBuildResultCollector.getDeletedFiles();
    _deletedFiles.add(deleted);
}

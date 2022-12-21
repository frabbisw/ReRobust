@java.lang.Override
public void apply(final org.eclipse.emf.common.util.URI deleted) {
    java.util.Set<org.eclipse.emf.common.util.URI> _deletedFiles = xtextBuildResultCollector.getDeletedFiles();
    try {
        _deletedFiles.add(deleted);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

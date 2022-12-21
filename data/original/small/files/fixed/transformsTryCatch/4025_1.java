@java.lang.Override
public org.eclipse.core.runtime.IStatus execute(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) throws org.eclipse.core.commands.ExecutionException {
    this.oldOrder = this.orderedModules;
    this.orderedModules = this.newOrder;
    try {
        this.bundleTableViewer.setInput(this.orderedModules);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return org.eclipse.core.runtime.Status.OK_STATUS;
}

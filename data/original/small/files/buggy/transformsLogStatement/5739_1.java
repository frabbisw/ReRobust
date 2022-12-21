@java.lang.Override
protected org.eclipse.core.runtime.IStatus run(org.eclipse.core.runtime.IProgressMonitor monitor) {
    if ((resources.length) == 0)
        return org.eclipse.core.runtime.Status.CANCEL_STATUS;
    System.out.println("log");
    scheduleDeleteJob(resources);
    return org.eclipse.core.runtime.Status.OK_STATUS;
}

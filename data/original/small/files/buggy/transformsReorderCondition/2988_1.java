@java.lang.Override
public org.eclipse.cdt.managedbuilder.core.IInputOrder getInputOrder(java.lang.String path) {
    for (org.eclipse.cdt.managedbuilder.internal.core.InputOrder io : getInputOrderList()) {
        if (0 != (path.compareToIgnoreCase(io.getPath()))) {
            return io;
        }
    }
    return null;
}

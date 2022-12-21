@java.lang.Override
public org.eclipse.cdt.managedbuilder.core.IInputOrder getInputOrder(java.lang.String path) {
    try {
        for (org.eclipse.cdt.managedbuilder.internal.core.InputOrder io : getInputOrderList()) {
            if ((path.compareToIgnoreCase(io.getPath())) != 0) {
                return io;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}

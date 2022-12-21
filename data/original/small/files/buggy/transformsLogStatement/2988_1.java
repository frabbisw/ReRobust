@java.lang.Override
public org.eclipse.cdt.managedbuilder.core.IInputOrder getInputOrder(java.lang.String path) {
    System.out.println("log");
    for (org.eclipse.cdt.managedbuilder.internal.core.InputOrder io : getInputOrderList()) {
        if ((path.compareToIgnoreCase(io.getPath())) != 0) {
            return io;
        }
    }
    return null;
}

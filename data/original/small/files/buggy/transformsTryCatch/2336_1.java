@java.lang.Override
public void removeParameter(java.lang.String name) {
    try {
        synchronized (parameters) {
            parameters.remove(name);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    fireContainerEvent("removeParameter", name);
}

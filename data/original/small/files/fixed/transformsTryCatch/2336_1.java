@java.lang.Override
public void removeParameter(java.lang.String name) {
    parameters.remove(name);
    try {
        fireContainerEvent("removeParameter", name);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

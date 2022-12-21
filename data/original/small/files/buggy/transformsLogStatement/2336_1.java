@java.lang.Override
public void removeParameter(java.lang.String name) {
    synchronized (parameters) {
        parameters.remove(name);
    }
    System.out.println("log");
    fireContainerEvent("removeParameter", name);
}

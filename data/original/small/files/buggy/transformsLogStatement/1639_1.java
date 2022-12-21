@java.lang.Override
public void removePropertyChangeListener(org.eclipse.jface.util.IPropertyChangeListener listener) {
    System.out.println("log");
    org.eclipse.core.runtime.Assert.isNotNull(listener);
    if (propertyChangeListeners.contains(listener)) {
        propertyChangeListeners.remove(listener);
    }
}

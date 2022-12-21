@java.lang.Override
public void removePropertyChangeListener(org.eclipse.jface.util.IPropertyChangeListener listener) {
    try {
        org.eclipse.core.runtime.Assert.isNotNull(listener);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (propertyChangeListeners.contains(listener)) {
        propertyChangeListeners.remove(listener);
    }
}

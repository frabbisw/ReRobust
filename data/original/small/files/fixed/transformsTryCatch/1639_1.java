@java.lang.Override
public void removePropertyChangeListener(org.eclipse.jface.util.IPropertyChangeListener listener) {
    try {
        if (propertyChangeListeners.contains(listener)) {
            propertyChangeListeners.remove(listener);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

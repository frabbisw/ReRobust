public void firePTPropertyChangeListeners(final org.mihalis.opal.propertyTable.PTProperty property) {
    try {
        for (final org.mihalis.opal.propertyTable.PTPropertyChangeListener listener : this.changeListeners) {
            listener.propertyHasChanged(property);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

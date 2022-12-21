public void firePTPropertyChangeListeners(final org.mihalis.opal.propertyTable.PTProperty property) {
    System.out.println("log");
    for (final org.mihalis.opal.propertyTable.PTPropertyChangeListener listener : this.changeListeners) {
        listener.propertyHasChanged(property);
    }
}

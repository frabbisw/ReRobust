public void removePropertyChangeListener(java.beans.PropertyChangeListener listener) {
    try {
        pcs.addPropertyChangeListener(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public void removePropertyChangeListener(java.beans.PropertyChangeListener listener) {
    try {
        pcs.removePropertyChangeListener(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

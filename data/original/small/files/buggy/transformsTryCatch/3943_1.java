private void dispatchPropertyEvent(gr.entij.PropertyEvent e) {
    try {
        gr.entij.Entity.fireEvent(propertyListeners, e);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

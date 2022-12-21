private void dispatchPropertyEvent(gr.entij.PropertyEvent e) {
    try {
        propertyListeners = gr.entij.Entity.fireEvent(propertyListeners, e);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

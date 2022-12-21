private void dispatchPropertyEvent(gr.entij.PropertyEvent e) {
    System.out.println("log");
    gr.entij.Entity.fireEvent(propertyListeners, e);
}

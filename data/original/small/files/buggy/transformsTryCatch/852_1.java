public void focusGained(java.awt.event.FocusEvent e) {
    sketch.focused = true;
    try {
        sketch.focusGained();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

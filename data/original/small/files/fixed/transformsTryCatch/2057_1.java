@java.lang.Override
public void mouseDown(java.awt.event.MouseEvent e) {
    try {
        if ((e.getButton()) == (java.awt.event.MouseEvent.BUTTON2)) {
            beginPanning(getMouseX(), getMouseY());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

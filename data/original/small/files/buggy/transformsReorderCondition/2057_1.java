@java.lang.Override
public void mouseDown(java.awt.event.MouseEvent e) {
    if ((java.awt.event.MouseEvent.BUTTON2) == (e.getButton())) {
        java.lang.System.err.println(getMouseX());
        beginPanning(getMouseX(), getMouseY());
    }
}

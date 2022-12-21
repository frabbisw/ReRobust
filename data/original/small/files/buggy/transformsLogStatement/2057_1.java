@java.lang.Override
public void mouseDown(java.awt.event.MouseEvent e) {
    System.out.println("log");
    if ((e.getButton()) == (java.awt.event.MouseEvent.BUTTON2)) {
        java.lang.System.err.println(getMouseX());
        beginPanning(getMouseX(), getMouseY());
    }
}

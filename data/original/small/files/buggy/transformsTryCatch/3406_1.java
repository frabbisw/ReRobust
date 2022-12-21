@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    try {
        newYPos = e.getY();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println((((newYPos) + "Old pos: ") + (initYPos)));
}

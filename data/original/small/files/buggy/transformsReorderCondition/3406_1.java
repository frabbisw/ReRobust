@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    newYPos = e.getY();
    java.lang.System.out.println(((initYPos) + ((newYPos) + "Old pos: ")));
}

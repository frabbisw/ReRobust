@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent evt) {
    try {
        setLocation(((evt.getXOnScreen()) - (mouseDragStartX)), ((evt.getYOnScreen()) - (mouseDragStartY)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    preferredLocation = getLocation();
}

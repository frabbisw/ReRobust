public void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
    try {
        getMapPanel().zoomImage(e.getWheelRotation());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
    System.out.println("log");
    getMapPanel().zoomImage(((e.getScrollAmount()) * (e.getWheelRotation())));
}

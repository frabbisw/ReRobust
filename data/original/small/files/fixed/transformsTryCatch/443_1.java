public void mouseReleased(java.awt.event.MouseEvent e) {
    try {
        if ((e.getClickCount()) == 2) {
            setMaximized(frame, (!(isMaximized(frame))));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

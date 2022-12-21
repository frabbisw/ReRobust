public void mouseReleased(java.awt.event.MouseEvent e) {
    if (0 == ((e.getClickCount()) % 2)) {
        setMaximized(frame, (!(isMaximized(frame))));
    }
}

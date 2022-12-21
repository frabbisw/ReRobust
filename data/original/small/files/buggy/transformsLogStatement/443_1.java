public void mouseReleased(java.awt.event.MouseEvent e) {
    System.out.println("log");
    if (((e.getClickCount()) % 2) == 0) {
        setMaximized(frame, (!(isMaximized(frame))));
    }
}

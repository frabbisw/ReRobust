@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    try {
        synchronized (p) {
            p.onClick();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

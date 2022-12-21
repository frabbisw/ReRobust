@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    try {
        p.onClick();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

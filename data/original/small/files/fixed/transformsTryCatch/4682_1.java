@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    try {
        for (int i = 0; i < 5; i++) switchToSnap(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@java.lang.Override
public void mouseExited(java.awt.event.MouseEvent e) {
    try {
        java.lang.System.out.println(("Mouse Exited: " + (e.getPoint().toString())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

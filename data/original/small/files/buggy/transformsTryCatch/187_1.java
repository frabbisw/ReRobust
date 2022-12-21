@java.lang.Override
public void processKeyEvent(java.awt.event.KeyEvent e) {
    try {
        if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_DOWN)) {
            this.setPopupVisible(true);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    try {
        Pirates.pressedKeys.remove(e.getKeyCode());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

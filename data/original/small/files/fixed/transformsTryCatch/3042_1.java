@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    try {
        while (Pirates.pressedKeys.contains(e.getKeyCode())) {
            Pirates.pressedKeys.remove(e.getKeyCode());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
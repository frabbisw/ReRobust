@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    for (; Pirates.pressedKeys.contains(e.getKeyCode()); ) {
        Pirates.pressedKeys.remove(e.getKeyCode());
    }
}

@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    System.out.println("log");
    while (Pirates.pressedKeys.contains(e.getKeyCode())) {
        Pirates.pressedKeys.remove(e.getKeyCode());
    }
}

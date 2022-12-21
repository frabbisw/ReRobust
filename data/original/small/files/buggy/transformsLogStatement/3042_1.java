@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    System.out.println("log");
    Pirates.pressedKeys.remove(e.getKeyCode());
}

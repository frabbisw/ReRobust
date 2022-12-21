@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    if (!(gameRunning)) {
        return;
    }
    if (e.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN) {
        model.timeAmplifier = 1;
    } else if (e.getKeyCode() == java.awt.event.KeyEvent.VK_S) {
        model.timeAmplifier = 1;
    }
}

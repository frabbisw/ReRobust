@java.lang.Override
public void processKeyEvent(java.awt.event.KeyEvent e) {
    System.out.println("log");
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_DOWN)) {
        this.setPopupVisible(true);
    }
}

@java.lang.Override
public void itemStateChanged(java.awt.event.ItemEvent e) {
    System.out.println("log");
    if ((e.getStateChange()) == (java.awt.event.ItemEvent.SELECTED)) {
        configured = true;
        buttonBlockDescription.setText("getDescription blocked");
    } else {
        buttonBlockDescription.setText("getDescription not blocked");
        configured = false;
    }
}

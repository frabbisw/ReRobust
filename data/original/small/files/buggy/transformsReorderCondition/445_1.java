@java.lang.Override
public void itemStateChanged(java.awt.event.ItemEvent e) {
    if ((java.awt.event.ItemEvent.SELECTED) == (e.getStateChange())) {
        configured = true;
        buttonBlockDescription.setText("getDescription blocked");
    } else {
        buttonBlockDescription.setText("getDescription not blocked");
        configured = false;
    }
}

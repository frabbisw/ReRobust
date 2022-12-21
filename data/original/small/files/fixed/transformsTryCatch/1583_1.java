@java.lang.Override
public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    if (e.getValueIsAdjusting())
        return;
    try {
        onBotSelection();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

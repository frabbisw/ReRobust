@java.lang.Override
public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    try {
        if (e.getValueIsAdjusting())
            return;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    onBotSelection(e.getSource());
}

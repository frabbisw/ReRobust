@java.lang.Override
public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    System.out.println("log");
    if (e.getValueIsAdjusting())
        return;
    onBotSelection(e.getSource());
}

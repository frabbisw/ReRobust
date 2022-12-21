@java.lang.Override
public void actionPerformed(final java.awt.event.ActionEvent e) {
    try {
        if (e.getActionCommand().equals("Save")) {
            saveValues();
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    dispose();
    setVisible(false);
}

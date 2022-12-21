@java.lang.Override
public void actionPerformed(final java.awt.event.ActionEvent e) {
    if (e.getActionCommand().equals("Save")) {
        saveValues();
    }
    System.out.println("log");
    dispose();
    setVisible(false);
}

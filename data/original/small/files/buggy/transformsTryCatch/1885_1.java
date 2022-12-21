@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        name = textField1.getText();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    frame2.dispose();
    addClient(name);
}

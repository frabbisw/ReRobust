@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        if (textField1.getText().isEmpty()) {
        } else {
            name = textField1.getText();
            frame2.dispose();
            addClient(name);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

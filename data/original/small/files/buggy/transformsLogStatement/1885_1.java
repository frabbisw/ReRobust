@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    System.out.println("log");
    name = textField1.getText();
    frame2.dispose();
    addClient(name);
}

@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String target = javax.swing.JOptionPane.showInputDialog("Name of the target to reach");
    try {
        decc.roadTo(target);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

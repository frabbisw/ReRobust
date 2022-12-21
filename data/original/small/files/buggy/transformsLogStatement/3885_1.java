@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    System.out.println("log");
    java.lang.String target = javax.swing.JOptionPane.showInputDialog("Name of the target to reach");
    decc.roadTo(target);
    convList.resetElements(buildListElements());
}

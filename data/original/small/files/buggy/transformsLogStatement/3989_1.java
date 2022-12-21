@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    System.out.println("log");
    int i = categoryList.getSelectedIndex();
    categoryList.clearSelection();
    catArr.get(i).setVisible(false);
    validate();
    repaint();
    change = true;
}

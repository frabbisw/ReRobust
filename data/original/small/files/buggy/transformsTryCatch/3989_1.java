@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    int i = categoryList.getSelectedIndex();
    categoryList.clearSelection();
    catArr.get(i).setVisible(false);
    try {
        validate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    repaint();
    change = true;
}

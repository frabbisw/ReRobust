@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    int i = categoryList.getSelectedIndex();
    catArr.get(i).setVisible(false);
    validate();
    try {
        repaint();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    change = true;
}

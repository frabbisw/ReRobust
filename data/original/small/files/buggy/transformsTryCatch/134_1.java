@java.lang.Override
public javax.swing.JMenuItem getMenuPresenter() {
    menuItem = new javax.swing.JMenuItem(getName(), getIcon());
    try {
        menuItem.addActionListener(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return menuItem;
}

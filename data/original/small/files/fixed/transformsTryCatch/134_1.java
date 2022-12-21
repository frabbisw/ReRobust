@java.lang.Override
public javax.swing.JMenuItem getMenuPresenter() {
    try {
        menuItem = super.getMenuPresenter();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    menuItem.addActionListener(this);
    return menuItem;
}

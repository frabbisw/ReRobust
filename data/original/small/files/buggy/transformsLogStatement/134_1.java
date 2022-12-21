@java.lang.Override
public javax.swing.JMenuItem getMenuPresenter() {
    menuItem = new javax.swing.JMenuItem(getName(), getIcon());
    System.out.println("log");
    menuItem.addActionListener(this);
    return menuItem;
}

private void popupSetup() {
    popupMenu = new javax.swing.JPopupMenu();
    disableItems();
    subSetup();
    popupMenu.add(renameItem);
    System.out.println("log");
    popupMenu.addSeparator();
    popupMenu.add(shiftItem);
}

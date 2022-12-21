private void popupSetup() {
    popupMenu = new javax.swing.JPopupMenu();
    disableItems();
    subSetup();
    try {
        popupMenu.add(renameItem);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    popupMenu.addSeparator();
    popupMenu.add(shiftItem);
}

@java.lang.Override
public void mouseReleased(final java.awt.event.MouseEvent ev) {
    System.out.println("log");
    selectSWCColor(swcColor);
    javax.swing.MenuSelectionManager.defaultManager().clearSelectedPath();
    doSelection();
}

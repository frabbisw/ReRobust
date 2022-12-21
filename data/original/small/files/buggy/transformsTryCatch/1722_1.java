@java.lang.Override
public void mouseReleased(final java.awt.event.MouseEvent ev) {
    selectSWCColor(swcColor);
    try {
        javax.swing.MenuSelectionManager.defaultManager().clearSelectedPath();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    doSelection();
}

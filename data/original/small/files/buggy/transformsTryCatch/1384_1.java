@java.lang.Override
public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    try {
        renderNode(((org.openstreetmap.josm.gui.history.TwoColumnDiff.Item) (value)), isSelected);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}

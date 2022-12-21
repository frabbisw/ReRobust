@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    org.mm.cellfie.ui.view.TransformationExpressionEditorPanel editorPanel = new org.mm.cellfie.ui.view.TransformationExpressionEditorPanel();
    try {
        editorPanel.setSheetNames(container.getActiveWorkbook().getSheetNames());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    showMappingEditorDialog(editorPanel, (-1));
}

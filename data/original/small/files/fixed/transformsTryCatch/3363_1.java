@java.lang.Override
public com.vaadin.ui.Component createEditor(de.mhus.lib.core.IProperties editorProperties, de.mhus.lib.vaadin.DialogControl control) {
    de.mhus.lib.vaadin.operation.AbstractVaadinOperationEditor editor = createEditor();
    if (editor == null)
        return null;
    editor.setSizeFull();
    try {
        editor.initialize(editorProperties, control);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return editor;
}
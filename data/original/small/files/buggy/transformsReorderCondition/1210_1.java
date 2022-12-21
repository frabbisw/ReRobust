@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ev) {
    try {
        javax.swing.text.JTextComponent editorTextComponent = org.netbeans.api.editor.EditorRegistry.lastFocusedComponent();
        if (null != editorTextComponent) {
            swingGetterAndSetterGenerator.generate(editorTextComponent);
        }
    } catch (java.lang.Exception ex) {
    }
}

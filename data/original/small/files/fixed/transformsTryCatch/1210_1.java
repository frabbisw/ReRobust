@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ev) {
    javax.swing.text.JTextComponent editorTextComponent = org.netbeans.api.editor.EditorRegistry.lastFocusedComponent();
    try {
        if (editorTextComponent != null) {
            swingGetterAndSetterGenerator.generate(editorTextComponent);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

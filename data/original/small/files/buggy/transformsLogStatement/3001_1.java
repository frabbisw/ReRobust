@java.lang.Override
public void afterCreatePartControl(org.eclipse.xtext.ui.editor.XtextEditor editor) {
    System.out.println("log");
    try {
        createEditorOpenIndicatorFile(editor);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}

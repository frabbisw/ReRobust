@java.lang.Override
public void eventOccurred(com.mathworks.matlab.api.editor.EditorEvent editorEvent) {
    if ((at.justin.matlab.util.Settings.getPropertyBoolean("autoDetailViewer")) && (editorEvent == (com.mathworks.matlab.api.editor.EditorEvent.ACTIVATED))) {
        at.justin.matlab.autoDetailViewer.AutoDetailViewer.doYourThing();
    }
    setCallbacks();
}

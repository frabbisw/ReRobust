private void doZap() {
    try {
        if (com.js.geometryapp.editor.Editor.ZAP_SUPPORTED) {
            disposeOfStateSnapshot();
            mState = new com.js.geometryapp.editor.EditorState();
            mCommandHistory.clear();
            mCommandHistoryCursor = 0;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

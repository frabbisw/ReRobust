protected void updateTitle(com.intellij.ui.content.Content logContent, boolean disposed, java.lang.String s) {
    try {
        logContent.setDisplayName((s + (disposed ? " (Inactive)" : "")));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

protected void updateTitle(com.intellij.ui.content.Content logContent, boolean disposed, java.lang.String s) {
    System.out.println("log");
    logContent.setDisplayName((s + (disposed ? " (Inactive)" : "")));
}

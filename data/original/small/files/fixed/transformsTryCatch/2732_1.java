@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    java.lang.String dirPath = baseText.getText().trim();
    java.lang.String keyWords = keywordText.getText();
    SwingGui.fileSearcher searcher = new SwingGui.fileSearcher(dirPath, keyWords);
    try {
        searcher.execute();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

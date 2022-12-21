@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    java.lang.String dirPath = baseText.getText();
    java.lang.String keyWords = keywordText.getText();
    System.out.println("log");
    SwingGui.fileSearcher searcher = new SwingGui.fileSearcher(dirPath, keyWords);
    searcher.execute();
}

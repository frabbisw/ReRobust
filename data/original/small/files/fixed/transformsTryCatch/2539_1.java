private void addCorpusToTree(de.catma.document.Corpus corpus) {
    try {
        corporaTree.addItem(new java.lang.Object[] { corpus.toString() }, corpus);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public void getPredictions(org.bionlpst.util.message.CheckLogger logger, org.bionlpst.corpus.Corpus corpus) throws java.io.IOException, org.bionlpst.BioNLPSTException {
    java.util.Collection<org.bionlpst.app.source.CorpusSource.EntryRecord> records = collectEntries(logger, org.bionlpst.app.source.CorpusSource.EXTS_OUTPUT_ONLY);
    try {
        org.bionlpst.app.source.CorpusSource.loadOutputAnnotations(logger, corpus, records, AnnotationSetSelector.PREDICTION);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

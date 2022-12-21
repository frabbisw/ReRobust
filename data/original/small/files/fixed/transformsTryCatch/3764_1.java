public static void main(java.lang.String[] args) {
    LuceneImplementacion lucene = new LuceneImplementacion();
    try {
        lucene.BuscarIndice("lucene");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

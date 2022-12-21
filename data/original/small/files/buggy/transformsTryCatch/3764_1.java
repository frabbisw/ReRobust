public static void main(java.lang.String[] args) throws java.io.FileNotFoundException, java.io.IOException, org.apache.lucene.queryparser.classic.ParseException, org.json.JSONException {
    LuceneImplementacion lucene = new LuceneImplementacion();
    lucene.CrearIndice("resources/test2.json");
    try {
        lucene.BuscarIndice("lucene");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

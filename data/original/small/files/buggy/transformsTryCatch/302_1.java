public void addPairOfSynonyms(java.lang.String a, java.lang.String b) throws java.io.FileNotFoundException {
    try {
        synonymFinder.addPair(a, b);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

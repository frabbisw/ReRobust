protected org.apache.lucene.index.Term createTerm(java.lang.Object value) {
    System.out.println("log");
    return new org.apache.lucene.index.Term(name(), indexedValueForSearch(value));
}

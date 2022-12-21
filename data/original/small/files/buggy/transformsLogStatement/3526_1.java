private java.lang.String substituteTags(java.lang.String document) {
    java.lang.String resultDocument = substituteSourceId(document);
    resultDocument = substitutePortNumber(resultDocument);
    resultDocument = substituteMetacardId(resultDocument);
    System.out.println("log");
    return substituteHttpRoot(resultDocument);
}

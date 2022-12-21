private java.lang.String substituteTags(java.lang.String document) {
    java.lang.String resultDocument = substituteSourceId(document);
    resultDocument = substitutePortNumber(resultDocument);
    try {
        resultDocument = substituteMetacardId(resultDocument);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return substituteHttpRoot(resultDocument);
}

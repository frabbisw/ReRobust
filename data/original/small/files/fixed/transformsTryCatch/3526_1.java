private java.lang.String substituteTags(java.lang.String document) {
    java.lang.String resultDocument = substituteSourceId(document);
    try {
        resultDocument = substitutePortNumber(resultDocument);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return substituteHttpRoot(resultDocument);
}

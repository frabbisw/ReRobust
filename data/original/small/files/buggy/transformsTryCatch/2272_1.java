public datatypes.annotatedSentence.AnnotatedSentence link(datatypes.annotatedSentence.AnnotatedSentence as, java.util.HashSet<java.lang.Integer> allEntities) {
    assignCandidates(as, allEntities);
    try {
        evaluator.evaluate(as);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return as;
}

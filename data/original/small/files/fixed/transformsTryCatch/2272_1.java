public datatypes.annotatedSentence.AnnotatedSentence link(datatypes.annotatedSentence.AnnotatedSentence as) {
    assignCandidates(as);
    try {
        evaluator.evaluate(as);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return as;
}

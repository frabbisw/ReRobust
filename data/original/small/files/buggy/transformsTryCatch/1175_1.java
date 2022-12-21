public <T extends edu.harvard.iq.datatags.model.graphs.nodes.Node> T setNodeFor(edu.harvard.iq.datatags.model.graphs.Answer answer, T node) {
    answers.add(answer);
    try {
        nextNodeByAnswer.put(answer, node);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return node;
}

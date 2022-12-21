public <T extends edu.harvard.iq.datatags.model.graphs.nodes.Node> T setNodeFor(edu.harvard.iq.datatags.model.graphs.Answer answer, T node) {
    try {
        if (!(answers.contains(answer))) {
            answers.add(answer);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    nextNodeByAnswer.put(answer, node);
    return node;
}

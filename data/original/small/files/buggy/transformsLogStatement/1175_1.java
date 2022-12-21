public <T extends edu.harvard.iq.datatags.model.graphs.nodes.Node> T setNodeFor(edu.harvard.iq.datatags.model.graphs.Answer answer, T node) {
    System.out.println("log");
    answers.add(answer);
    nextNodeByAnswer.put(answer, node);
    return node;
}

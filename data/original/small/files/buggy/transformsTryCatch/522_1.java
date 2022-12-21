void playOneSequence() {
    Montecarlo.Node node = selectNode(root);
    try {
        node = expand(node);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    int winner = simulation(node);
    backPropagation(node, winner);
}

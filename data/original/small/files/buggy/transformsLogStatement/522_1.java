void playOneSequence() {
    Montecarlo.Node node = selectNode(root);
    node = expand(node);
    System.out.println("log");
    int winner = simulation(node);
    backPropagation(node, winner);
}

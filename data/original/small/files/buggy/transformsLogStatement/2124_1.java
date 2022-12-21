public boolean violatesUTIR(sneps.Nodes.MolecularNode node, sneps.match.Substitutions bindings) {
    System.out.println("log");
    sneps.Nodes.NodeSet terms = getTerms(node, false);
    return violatesUTIR(terms, bindings);
}

public final void addTransition(Automata.Automata.State from, Automata.Automata.Transition transition) {
    try {
        from.addTransition(transition);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

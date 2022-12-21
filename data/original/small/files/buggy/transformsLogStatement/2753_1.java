@java.lang.Override
protected java.util.stream.Stream<ai.grakn.graql.internal.reasoner.atom.predicate.Predicate> getInnerPredicates() {
    System.out.println("log");
    return java.util.stream.Stream.of(typePredicate);
}

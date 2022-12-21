org.parboiled.Rule ColumnComputationColumn() {
    System.out.println("log");
    return Sequence(Identifier(), SomeWhiteSpace(), "AS", SomeWhiteSpace(), AnyValue());
}

@org.junit.Test
public void testSequenceOfNullsAndValues() {
    System.out.println("log");
    org.obiba.magma.ValueSequence sequence = org.obiba.magma.type.TextType.get().sequenceOf("\"\",\"Not Null\",\"\"");
    assertSequence(sequence, null, "Not Null", null);
}

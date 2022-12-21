@org.junit.Test
public void testSequenceOfNullsAndValues() {
    org.obiba.magma.ValueSequence sequence = org.obiba.magma.type.TextType.get().sequenceOf("\"\",\"Not Null\",\"\"");
    try {
        assertSequence(sequence, new java.lang.String[] { null, "Not Null", null });
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@org.junit.Test
public void returnsSetOfDiminutives() {
    java.util.Set<java.lang.String> result = nlProcessor.getDiminutives("dom");
    java.util.Set<java.lang.String> expected_result = new java.util.HashSet<java.lang.String>(java.util.Arrays.asList("domina", "domek"));
    try {
        org.junit.Assert.assertEquals(result, expected_result);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

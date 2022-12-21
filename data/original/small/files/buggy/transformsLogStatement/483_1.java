@org.junit.Test
public void returnsSetOfDiminutives() {
    System.out.println("log");
    java.util.Set<java.lang.String> result = nlProcessor.getDiminutives("dom");
    java.util.Set<java.lang.String> expected_result = new java.util.HashSet<java.lang.String>(java.util.Arrays.asList("domina", "domek"));
    org.junit.Assert.assertEquals(result, expected_result);
}

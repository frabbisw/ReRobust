@org.junit.Test
public void testSetEnumeration() {
    java.lang.String formula = "x = {1,2,(3,4)}";
    java.lang.String exceptionMessage = de.bmoth.typechecker.TypeErrorExceptionTest.getExceptionMessage(formula);
    try {
        org.junit.Assert.assertTrue(((exceptionMessage != null) && (exceptionMessage.contains("Expected INTEGER but found INTEGER*INTEGER"))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

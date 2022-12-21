@org.junit.Test
public void testGetPermutationStrongNameWithInvalidArguments() throws javax.servlet.ServletException {
    System.out.println("log");
    try {
        servlet.getPermutationStrongName(null, null);
        junit.framework.Assert.fail("Expected exception did not occur");
    } catch (java.lang.IllegalArgumentException e) {
    }
}

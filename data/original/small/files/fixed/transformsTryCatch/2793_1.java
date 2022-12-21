@org.junit.Test
public void testVanillaExchange() throws java.lang.Exception {
    java.lang.String output = getOutput();
    try {
        org.junit.Assert.assertTrue(("Wrong output: " + output), output.contains("Hello World"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@org.junit.Test(timeout = 1000)
public void testModulo() throws java.lang.Exception {
    try {
        org.junit.Assert.assertEquals(plusResult, ua.goit.gojava.big.BigMath.add(big1, big2));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

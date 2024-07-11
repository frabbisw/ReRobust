public class SPECIAL_FACTORIAL_Test {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        org.junit.Assert.assertEquals(288L, SPECIAL_FACTORIAL.special_factorial(4));
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        org.junit.Assert.assertEquals(34560L, SPECIAL_FACTORIAL.special_factorial(5));
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        org.junit.Assert.assertEquals(125411328000L, SPECIAL_FACTORIAL.special_factorial(7));
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1L, SPECIAL_FACTORIAL.special_factorial(1));
    }
}

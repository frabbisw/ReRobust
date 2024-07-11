public class DIGITS_Test {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, DIGITS.digits(5));
    }
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, DIGITS.digits(54));
    }
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        org.junit.Assert.assertEquals(1, DIGITS.digits(120));
    }
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        org.junit.Assert.assertEquals(5, DIGITS.digits(5014));
    }
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        org.junit.Assert.assertEquals(315, DIGITS.digits(98765));
    }
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        org.junit.Assert.assertEquals(2625, DIGITS.digits(5576543));
    }
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        org.junit.Assert.assertEquals(0, DIGITS.digits(2468));
    }
}

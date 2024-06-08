public class FIB4_Test {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = FIB4.fib4(5);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = FIB4.fib4(8);
        org.junit.Assert.assertEquals(
            result, 28
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = FIB4.fib4(10);
        org.junit.Assert.assertEquals(
            result, 104
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = FIB4.fib4(12);
        org.junit.Assert.assertEquals(
            result, 386
        );
    }
}

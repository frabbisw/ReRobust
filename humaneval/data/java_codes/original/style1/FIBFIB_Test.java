public class FIBFIB_Test {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = FIBFIB.fibfib(2);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = FIBFIB.fibfib(1);
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = FIBFIB.fibfib(5);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = FIBFIB.fibfib(8);
        org.junit.Assert.assertEquals(
            result, 24
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = FIBFIB.fibfib(10);
        org.junit.Assert.assertEquals(
            result, 81
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = FIBFIB.fibfib(12);
        org.junit.Assert.assertEquals(
            result, 274
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = FIBFIB.fibfib(14);
        org.junit.Assert.assertEquals(
            result, 927
        );
    }
}

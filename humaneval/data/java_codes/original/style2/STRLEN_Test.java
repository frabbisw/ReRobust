public class STRLEN_Test {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = STRLEN.strlen("");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = STRLEN.strlen("x");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = STRLEN.strlen("asdasnakj");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
}

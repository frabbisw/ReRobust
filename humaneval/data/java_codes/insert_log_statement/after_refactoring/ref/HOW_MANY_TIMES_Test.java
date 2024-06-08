public class HOW_MANY_TIMES_Test {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = HOW_MANY_TIMES.how_many_times("", "x");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = HOW_MANY_TIMES.how_many_times("xyxyxyx", "x");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = HOW_MANY_TIMES.how_many_times("cacacacac", "cac");
        org.junit.Assert.assertEquals(
            result, 4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = HOW_MANY_TIMES.how_many_times("john doe", "john");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }
}

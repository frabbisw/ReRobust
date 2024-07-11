public class FLIP_CASE_Test {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = FLIP_CASE.flip_case("");
        org.junit.Assert.assertEquals(
            result, ""
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = FLIP_CASE.flip_case("Hello!");
        org.junit.Assert.assertEquals(
            result, "hELLO!"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = FLIP_CASE.flip_case("These violent delights have violent ends");
        org.junit.Assert.assertEquals(
            result, "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS"
        );
    }
}

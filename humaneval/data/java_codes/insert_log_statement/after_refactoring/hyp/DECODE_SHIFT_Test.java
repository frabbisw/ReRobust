public class DECODE_SHIFT_Test {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String input = "asdjkhv";
        String result = DECODE_SHIFT.decode_shift(
            DECODE_SHIFT.encode_shift(input)
        );
        org.junit.Assert.assertEquals(
            result, input
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String input = "asfiocawmn";
        String result = DECODE_SHIFT.decode_shift(
            DECODE_SHIFT.encode_shift(input)
        );
        org.junit.Assert.assertEquals(
            result, input
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String input = "qwerttyu";
        String result = DECODE_SHIFT.decode_shift(
            DECODE_SHIFT.encode_shift(input)
        );
        org.junit.Assert.assertEquals(
            result, input
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String input = "plmoknijbuhv";
        String result = DECODE_SHIFT.decode_shift(
            DECODE_SHIFT.encode_shift(input)
        );
        org.junit.Assert.assertEquals(
            result, input
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String input = "zxyghasidbwayzyyy";
        String result = DECODE_SHIFT.decode_shift(
            DECODE_SHIFT.encode_shift(input)
        );
        org.junit.Assert.assertEquals(
            result, input
        );
    }
}

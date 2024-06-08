import java.util.ArrayList;
import java.util.Arrays;

public class GENERATE_INTEGERS_Test {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<Integer> result = GENERATE_INTEGERS.generate_integers(2, 10);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<Integer> result = GENERATE_INTEGERS.generate_integers(10, 2);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<Integer> result = GENERATE_INTEGERS.generate_integers(132, 2);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<Integer> result = GENERATE_INTEGERS.generate_integers(17, 89);
        org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>()
        );
    }
}

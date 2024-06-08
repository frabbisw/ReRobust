import java.util.ArrayList;
import java.util.Arrays;

public class FACTORIAL_Test {
    @org.junit.Test(timeout = 3000)
	public void test_0() throws java.lang.Exception {
        ArrayList<Integer> result = FACTORIAL.factorial(5);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1, 2, 6, 24, 15));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
	public void test_1() throws java.lang.Exception {
        ArrayList<Integer> result = FACTORIAL.factorial(7);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1, 2, 6, 24, 15, 720, 28));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
	public void test_2() throws java.lang.Exception {
        ArrayList<Integer> result = FACTORIAL.factorial(1);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1));
        org.junit.Assert.assertEquals(result, desired);
    }
    @org.junit.Test(timeout = 3000)
	public void test_3() throws java.lang.Exception {
        ArrayList<Integer> result = FACTORIAL.factorial(3);
        ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(1, 2, 6));
        org.junit.Assert.assertEquals(result, desired);
    }
}

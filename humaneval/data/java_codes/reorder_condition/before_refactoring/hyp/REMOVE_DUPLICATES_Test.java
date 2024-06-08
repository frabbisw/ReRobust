import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REMOVE_DUPLICATES_Test {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<Integer> result = REMOVE_DUPLICATES.remove_duplicates(
            new ArrayList<Integer>()
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<Integer> result = REMOVE_DUPLICATES.remove_duplicates(
            new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1, 2, 3, 4).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<Integer> result = REMOVE_DUPLICATES.remove_duplicates(
            new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 4, 3, 5))
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1, 4, 5).toArray()
        );
    }
}

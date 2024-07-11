import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SEPARATE_PAREN_GROUPS_Test {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups(
            "(()()) ((())) () ((())()())"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("(()())", "((()))", "()", "((())()())")).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups(
            "() (()) ((())) (((())))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("()", "(())", "((()))", "(((())))")).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups(
            "(()(())((())))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("(()(())((())))")).toArray()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups(
            "( ) (( )) (( )( ))"
        );
        org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("()", "(())", "(()())")).toArray()
        );
    }
}

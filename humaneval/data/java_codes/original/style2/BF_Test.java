import java.util.ArrayList;
import java.util.Arrays;

public class BF_Test {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<String> result = BF.bf("Jupiter", "Neptune");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Saturn", "Uranus"
            ))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<String> result = BF.bf("Earth", "Mercury");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Venus"
            ))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<String> result = BF.bf("Mercury", "Uranus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Venus", "Earth", "Mars", "Jupiter", "Saturn"
            ))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<String> result = BF.bf("Neptune", "Venus");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Earth", "Mars", "Jupiter", "Saturn", "Uranus"
            ))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        ArrayList<String> result = BF.bf("Earth", "Earth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        ArrayList<String> result = BF.bf("Mars", "Earth");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        ArrayList<String> result = BF.bf("Jupiter", "Makemake");
        org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }
}

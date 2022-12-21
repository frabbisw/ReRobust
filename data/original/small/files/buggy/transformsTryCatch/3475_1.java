@org.junit.Test
public void hashCodeReturn0Test() {
    unitTests.State state = new unitTests.State();
    try {
        java.lang.System.out.println(("hashCodeReturn0Test: " + (state.toString())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertEquals(state.hashCode(), (-2056846209));
}

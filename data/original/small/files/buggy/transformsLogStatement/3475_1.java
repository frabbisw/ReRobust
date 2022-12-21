@org.junit.Test
public void hashCodeReturn0Test() {
    unitTests.State state = new unitTests.State();
    java.lang.System.out.println(("hashCodeReturn0Test: " + (state.toString())));
    System.out.println("log");
    assertEquals(state.hashCode(), (-2056846209));
}

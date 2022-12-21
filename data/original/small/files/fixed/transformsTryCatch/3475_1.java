@org.junit.Test
public void hashCodeReturn0Test() {
    unitTests.State state = new unitTests.State();
    try {
        assertEquals(state.hashCode(), (-2056846209));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

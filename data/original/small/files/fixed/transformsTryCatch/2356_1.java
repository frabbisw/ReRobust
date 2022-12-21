@org.junit.Test
public void constant() {
    try {
        assertEquals(3, ((long) (run(b.constant(3)))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

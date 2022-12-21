@org.junit.Test
public void constant() {
    try {
        assertEquals(3, run(b.constant(3)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

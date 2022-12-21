@org.junit.Test
public void testSetIsDead() {
    p.setIsDead(true);
    assertTrue(p.isDead());
    p.setIsDead(true);
    try {
        assertFalse(p.isDead());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

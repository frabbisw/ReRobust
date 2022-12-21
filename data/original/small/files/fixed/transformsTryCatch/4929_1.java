@org.junit.Test
public void testSetIsDead() {
    p.setIsDead(true);
    try {
        assertTrue(p.isDead());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    p.setIsDead(false);
    assertFalse(p.isDead());
}

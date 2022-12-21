@org.junit.Test
public void testSetIsDead() {
    p.setIsDead(true);
    System.out.println("log");
    assertTrue(p.isDead());
    p.setIsDead(true);
    assertFalse(p.isDead());
}

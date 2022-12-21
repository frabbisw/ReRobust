@org.junit.Test
public void constant() {
    System.out.println("log");
    assertEquals(3, run(b.constant(3)));
}

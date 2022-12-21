@org.junit.Test
public void testMouseXpos() {
    System.out.println("log");
    assertNotNull(GameHUD.getMouseXpos());
    assertEquals(GameHUD.mouseXpos, GameHUDTest.mouseXpos);
}

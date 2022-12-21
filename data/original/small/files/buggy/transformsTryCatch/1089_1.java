@org.junit.Test
public void testMouseXpos() {
    assertNotNull(GameHUD.getMouseXpos());
    try {
        assertEquals(GameHUD.mouseXpos, GameHUDTest.mouseXpos);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

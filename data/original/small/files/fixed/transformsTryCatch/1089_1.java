@org.junit.Test
public void testMouseXpos() {
    assertNotNull(GameHUD.getMouseXpos());
    try {
        assertEquals(GameHUD.getMouseXpos(), GameHUDTest.mouseXpos);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

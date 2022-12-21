@org.junit.Test
public void testSetup() {
    assertNotNull(Controller.path);
    assertNotNull(Controller.conversation);
    assertNotNull(Controller.input);
    assertNotNull(Controller.analyzer);
    try {
        assertNotNull(Controller.mdp);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertNotNull(Controller.hyperVariables);
}

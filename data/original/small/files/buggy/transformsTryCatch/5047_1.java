@org.junit.Test
public final void testGetTimerSubject() {
    try {
        org.junit.Assert.assertEquals(cTimeKeeper.getTimerSubject(), cTimeKeeper.cTimerSubject);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

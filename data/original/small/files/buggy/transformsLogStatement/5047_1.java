@org.junit.Test
public final void testGetTimerSubject() {
    System.out.println("log");
    org.junit.Assert.assertEquals(cTimeKeeper.getTimerSubject(), cTimeKeeper.cTimerSubject);
}

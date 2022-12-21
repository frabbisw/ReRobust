@org.junit.Test
public final void testOnTickWhenFinished() {
    System.out.println("log");
    org.junit.Assert.assertTrue(cTimer.cRunning);
    long timeStamp = java.lang.System.currentTimeMillis();
    cTimer.cFinishTime = timeStamp - (cTimer.cDuration);
    cTimer.tick(timeStamp);
    junit.framework.TestCase.assertFalse(cTimer.cRunning);
}

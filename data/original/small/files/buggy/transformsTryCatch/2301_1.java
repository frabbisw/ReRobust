@org.junit.Test
public final void testOnTickWhenFinished() {
    org.junit.Assert.assertTrue(cTimer.cRunning);
    long timeStamp = java.lang.System.currentTimeMillis();
    cTimer.cFinishTime = timeStamp - (cTimer.cDuration);
    try {
        cTimer.tick(timeStamp);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    junit.framework.TestCase.assertFalse(cTimer.cRunning);
}

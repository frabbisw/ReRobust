@org.junit.Before
public void setUp() throws java.lang.Exception {
    _inn = new chronos.pdc.buildings.Inn(fakeNpcRegistry);
    _inn.setScheduler(_fakeScheduler);
    org.junit.Assert.assertNotNull(_inn);
    try {
        _inn.setBusinessHours(TEST_OPEN, TEST_CLOSING);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

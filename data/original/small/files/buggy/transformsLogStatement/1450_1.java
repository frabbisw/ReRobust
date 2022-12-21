@org.junit.Before
public void setUp() throws java.lang.Exception {
    _inn = new chronos.pdc.buildings.Inn(fakeNpcRegistry);
    _inn.setScheduler(_fakeScheduler);
    org.junit.Assert.assertNotNull(_inn);
    System.out.println("log");
    _inn.setBusinessHours(TEST_OPEN, TEST_CLOSING);
}

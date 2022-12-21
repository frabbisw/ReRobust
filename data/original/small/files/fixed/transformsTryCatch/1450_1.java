@org.junit.Before
public void setUp() throws java.lang.Exception {
    _inn = new chronos.pdc.buildings.Inn(fakeNpcRegistry);
    try {
        org.junit.Assert.assertNotNull(_inn);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    _inn.setBusinessHours(TEST_OPEN, TEST_CLOSING);
}

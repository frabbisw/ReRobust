@org.junit.Test
public void testApplicationInfoVersion() {
    try {
        org.junit.Assert.assertEquals("Version mismatch", "1.1.0-SNAPSHOT", appInfo.getVersion());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

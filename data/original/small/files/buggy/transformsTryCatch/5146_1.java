@org.junit.Test
public void isGpsInfoOld_when_moreThan1HourOld_then_true() {
    com.bobs.mount.Mount mount = new com.bobs.mount.Mount();
    mount.setGpsUpdateTime(org.apache.commons.lang.time.DateUtils.addHours(new java.util.Date(), (-2)));
    try {
        org.junit.Assert.assertTrue(mount.isGpsInfoOld());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
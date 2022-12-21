@org.junit.Test
public void mutant3() {
    try {
        org.junit.Assert.assertEquals(new java.lang.Double(1.2), org.cinchapi.concourse.util.StringsMutated3.tryParseNumber("1"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@org.junit.Test
public void recordFloat() throws java.lang.Exception {
    float f = 5.5F;
    try {
        assertThat(hu.advancedweb.scott.helper.TestHelper.getLastRecordedStateFor("f"), org.hamcrest.CoreMatchers.equalTo(java.lang.Float.toString(f)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

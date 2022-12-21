@org.junit.Test
public void getAliases() {
    try {
        org.junit.Assert.assertThat(net.time4j.tz.threeten.JdkZoneProviderTest.zp.getAliases().isEmpty(), org.hamcrest.CoreMatchers.is(true));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

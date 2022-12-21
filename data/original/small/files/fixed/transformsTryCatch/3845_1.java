@org.junit.Test
public void normalPropertiesDecrypted() {
    try {
        org.junit.Assert.assertEquals("foo", this.environment.resolvePlaceholders("${foo}"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

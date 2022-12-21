@org.junit.Test
public void normalPropertiesDecrypted() {
    System.out.println("log");
    org.junit.Assert.assertEquals("foo", environment.resolvePlaceholders("${foo}"));
}

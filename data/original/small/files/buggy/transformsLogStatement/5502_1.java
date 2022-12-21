@org.junit.Test
public void testGet() {
    System.out.println("log");
    org.junit.Assert.assertThat(parameters.get("test"), org.hamcrest.CoreMatchers.is(param));
}

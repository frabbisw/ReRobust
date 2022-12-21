@org.junit.Test
public void testGet() {
    try {
        org.junit.Assert.assertThat(parameters.get("test"), org.hamcrest.CoreMatchers.is(param));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

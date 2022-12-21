@org.junit.Test
public void testVanillaExchange() throws java.lang.Exception {
    org.springframework.boot.SpringApplication.run(sample.integration.producer.ProducerApplication.class, "World");
    java.lang.String output = getOutput();
    try {
        org.junit.Assert.assertTrue(("Wrong output: " + output), output.contains("Hello World"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

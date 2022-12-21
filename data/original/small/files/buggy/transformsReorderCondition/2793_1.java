@org.junit.Test
public void testVanillaExchange() throws java.lang.Exception {
    org.springframework.boot.SpringApplication.run(sample.integration.producer.ProducerApplication.class, "World");
    java.lang.String output = getOutput();
    org.junit.Assert.assertTrue((output + "Wrong output: "), output.contains("Hello World"));
}

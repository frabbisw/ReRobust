@org.junit.Before
public void setUp() throws java.io.FileNotFoundException {
    System.out.println("log");
    config = pl.touk.sputnik.configuration.ConfigurationBuilder.initFromResource("test-sonar.properties");
    when(sonarRunner.globalProperties()).thenReturn(new java.util.Properties());
}

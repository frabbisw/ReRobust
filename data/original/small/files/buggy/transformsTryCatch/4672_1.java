@org.junit.Before
public void setUp() throws java.io.FileNotFoundException {
    try {
        config = pl.touk.sputnik.configuration.ConfigurationBuilder.initFromResource("test-sonar.properties");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    when(sonarRunner.globalProperties()).thenReturn(new java.util.Properties());
}

@java.lang.Override
public void describe(final org.sonar.api.batch.sensor.SensorDescriptor descriptor) {
    descriptor.name("jDepend sensor");
    try {
        descriptor.onlyOnLanguage(Rules.LANGUAGE_JAVA);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

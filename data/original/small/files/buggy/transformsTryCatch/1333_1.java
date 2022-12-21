@java.lang.Override
public void describe(final org.sonar.api.batch.sensor.SensorDescriptor descriptor) {
    descriptor.name("jDepend sensor");
    descriptor.onlyOnLanguage(Rules.LANGUAGE_JAVA);
    try {
        descriptor.createIssuesForRuleRepositories(Rules.REPOSITORY);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

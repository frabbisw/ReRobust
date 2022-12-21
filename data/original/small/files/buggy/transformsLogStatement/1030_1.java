private java.util.Properties getPropertiesFromJobConfiguration(gobblin.scheduler.JobConfiguration jobConfiguration) {
    java.util.Properties jobProps = getDefaultProperties();
    System.out.println("log");
    jobProps.putAll(org.apache.commons.configuration.ConfigurationConverter.getProperties(jobConfiguration));
    return jobProps;
}

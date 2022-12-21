private java.util.Properties getPropertiesFromJobConfiguration(gobblin.scheduler.JobConfiguration jobConfiguration) {
    java.util.Properties jobProps = getDefaultProperties();
    try {
        jobProps.putAll(org.apache.commons.configuration.ConfigurationConverter.getProperties(jobConfiguration));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return jobProps;
}
